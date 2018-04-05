package bootcamp.dao;


import bootcamp.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class OrderDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Order getOrderByNumber(int order_Number) {
		String sql = "SELECT order_Number, customer_Name, checkout_Time_Stamp, return_Time_Stamp, estimated_Return_Date," +
 					"equipment_ID, location_ID, price FROM CUSTOMER_ORDERS where order_Number =" + order_Number;
		List<Order> p = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Order.class));
		return p.get(0);

	}
	
	public void addOrder(Order order) {
		String sql = "Insert into CUSTOMER_ORDERS values (?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { order.getOrderNumber(), order.getCustomerName(), order.getCheckoutTimeStamp(),
												order.getReturnTimeStamp(), order.getEstimatedReturnDate(), order.getEquipment_ID(),
												order.getLocation_ID(), order.getPrice()});
		}
	
	public void deleteOrder(int order_Number) {
		String sql = "Delete from CUSTOMER_ORDERS where order_Number = " + order_Number;
		jdbcTemplate.update(sql);
	}
		
	public void updateOrder(Order order) {
		String sql = "update CUSTOMER_ORDERS set customer_Name = ? where order_Number =" + order.getOrderNumber();
		jdbcTemplate.update(sql, new Object [] { order.getCustomerName()} );
	}
	

}
