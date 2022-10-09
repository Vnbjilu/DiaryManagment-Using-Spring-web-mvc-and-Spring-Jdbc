package vikas.RatanRaman;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class UserDao {
	private JdbcTemplate temp;

	

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	void Insert(User e)
	{
		
	}
	boolean login(String userName,String userPassword)
	{
		String query="select *from user where userName='"+userName
				+"' and userPassword='"+userPassword+"' ";
		return temp.query(query,new ResultSetExtractor<Boolean>() {

			@Override
			public Boolean extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				return rs.next();
			}
			
		});
	
	}

}
