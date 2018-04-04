package bootcamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bootcamp.dao.OrderDao;
import bootcamp.model.Person;

@Component
public class OrderService {
	
	@Autowired
	private OrderDao dao;
	
	public Person getPersonById(int personid) {
		return dao.getPersonById(personid);
	}
	
	public void addPerson(Person person) {
		dao.addPerson(person);
	}

	public void deleteField(int personid) {
		dao.deleteField(personid);
	}
	public void updateField(Person person) {
		dao.updateField(person);
	}
}
