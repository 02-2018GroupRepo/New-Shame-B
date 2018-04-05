package bootcamp.controller;

import bootcamp.model.Order;
import bootcamp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
    private OrderService service;
	
    @RequestMapping("/getOrderByNumber")
    public Order getOrderByNumber(@RequestParam int order_Number) {
        return service.getOrderByNumber(order_Number);
    }

    @RequestMapping("/addOrder")
    public Order addOrder(@RequestParam int order_Number) {
    	service.addOrder(new Order(order_Number, "Name_Here", "Checkout Time Stamp" , "Return Time Stamp",
                "Estimated Return Date", "electric chainsaw", "Smyrna", 2.00d));
    	return service.getOrderByNumber(order_Number);
    }

    @RequestMapping("/deleteOrder")
    public void deleteOrder(@RequestParam int order_Number) {
    	service.deleteOrder(order_Number);
    }

    @RequestMapping("/updateOrder")
    public void updateOrder(@RequestParam int order_Number,
    						@RequestParam String customer_Name) {
    	Order order = service.getOrderByNumber(order_Number);
    	order.setCustomerName(customer_Name);
    	service.updateOrder(order);
    }
}
