package bootcamp.dao;


import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import bootcamp.model.Person;
import groovyjarjarantlr.collections.List;

@Component
public class OrderDao {
	
	@Qualifier("dataSource")
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
		
	private final String sql = "SELECT personid, lastname, firstname, address, city FROM public.Noelle where personid =1";
	
	public Person getPersonById() {
		List<Person> p = jdbcTemplate.query(sql,  new BeanPropertyRowMapper<>(Person.class));
		return p.get(0);
	}
}
