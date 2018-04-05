package bootcamp.services;

import bootcamp.dao.OrderDao;
import bootcamp.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
	
	@Autowired
	private OrderDao orderDao;
	
	public Order getOrderByNumber(int order_Number) {
		return orderDao.getOrderByNumber(order_Number);
	}
	
	public void addOrder(Order order) {
		orderDao.addOrder(order);
	}

	public void deleteOrder(int order_Number) {
		orderDao.deleteOrder(order_Number);
	}
	public void updateOrder(Order order) {
		orderDao.updateOrder(order);
	}
}
