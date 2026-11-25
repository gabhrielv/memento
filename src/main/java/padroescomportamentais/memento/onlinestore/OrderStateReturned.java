package padroescomportamentais.memento.onlinestore;

public class OrderStateReturned implements OrderState {

    private OrderStateReturned() {};
    private static OrderStateReturned instance = new OrderStateReturned();
    public static OrderStateReturned getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Returned";
    }

}
