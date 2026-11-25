package padroescomportamentais.memento.onlinestore;

public class OrderStateShipped implements OrderState {

    private OrderStateShipped() {};
    private static OrderStateShipped instance = new OrderStateShipped();
    public static OrderStateShipped getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Shipped";
    }

}
