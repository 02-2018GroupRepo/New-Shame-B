package bootcamp.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import bootcamp.model.Person;

import java.util.List;




@Component
public class OrderDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
		
	
	public Person getPersonById(int personid) {
		String sql = "SELECT personid, lastname, firstname, address, city FROM public.shane where personid =" + personid;
		List<Person> p = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Person.class));
		return p.get(0);
	}
	
	public void addPerson(Person person) {
		String sql = "Insert into Shane values (?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { person.getPersonId(), person.getLastName(), person.getfirstname(), 
												person.getaddress(), person.getcity()});
		}
	
	public void deleteField(int personid) {
		String sql = "Delete from Shane where personid = " + personid;
		jdbcTemplate.update(sql);
	}
		
	public void updateField(Person person) {
		String sql = "update Shane set lastname = ? where personid =" + person.getPersonId();
		jdbcTemplate.update(sql, new Object [] { person.getLastName()} );
	}
	

}
