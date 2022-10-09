package vikas.RatanRaman;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class DiaryDao {
	private JdbcTemplate temp;

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	public int insert(Diary e)
	{
		String query="Insert into"
				+ " person(personName,personEmail,personContact,personAddress)"+
				"values('"+e.getPersonName()+"' , '"+e.getPersonEmail()+
				"' , '"+e.getPersonContact()+"' , '"+e.getPersonAddress()+"')";
		return temp.update(query);
			
	
	}
	public List<Diary> getAllRecord() {
		String query="select *from person";
		List<Diary> diary=new ArrayList<>();
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		return temp.query(query, new ResultSetExtractor<List<Diary>>() {

			@Override
			public List<Diary> extractData(ResultSet rs) throws SQLException, DataAccessException {
				while(rs.next())
				{
					Diary user=context.getBean(Diary.class);
					user.setPersonId(rs.getInt(1));
					user.setPersonName(rs.getString(2));
					user.setPersonEmail(rs.getString(3));
					user.setPersonContact(rs.getString(4));
					user.setPersonAddress(rs.getString(5));
					diary.add(user);
				}
				return diary;
			}
			
		});
	}

}
