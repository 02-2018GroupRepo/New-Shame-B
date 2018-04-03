package bootcamp.dao;

import javax.activation.DataSource;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerOrderDao {
	
	@Qualifier("dataSource")
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	@PostConstruct
	public void initDataSource() { jdbcTemplate = new JdbcTemplate(dataSource); }
}
