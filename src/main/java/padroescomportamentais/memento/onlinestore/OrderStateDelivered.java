package padroescomportamentais.memento.onlinestore;

public class OrderStateDelivered implements OrderState {

    private OrderStateDelivered() {};
    private static OrderStateDelivered instance = new OrderStateDelivered();
    public static OrderStateDelivered getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Delivered";
    }

}
