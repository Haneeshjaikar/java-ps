package Week5.Behavioral.Command;

import java.util.*;

public class Programmer {
    private List<Order> orderList = new ArrayList<>();
    
    public void takeOrder(Order order) {
        orderList.add(order);
    }
    
    public void placeOrders() {
        for(Order order : orderList) {
            order.placeOrder();
        }
        orderList.clear();
    }
}