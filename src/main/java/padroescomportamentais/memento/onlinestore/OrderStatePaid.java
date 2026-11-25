package padroescomportamentais.memento.onlinestore;

public class OrderStatePaid implements OrderState {

    private OrderStatePaid() {};
    private static OrderStatePaid instance = new OrderStatePaid();
    public static OrderStatePaid getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Paid";
    }

}
