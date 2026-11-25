package padroescomportamentais.memento.onlinestore;

public class OrderStateCanceled implements OrderState {

    private OrderStateCanceled() {};
    private static OrderStateCanceled instance = new OrderStateCanceled();
    public static OrderStateCanceled getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Canceled";
    }

}
