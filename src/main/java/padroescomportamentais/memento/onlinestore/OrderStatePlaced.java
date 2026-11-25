package padroescomportamentais.memento.onlinestore;

public class OrderStatePlaced implements OrderState {

    private OrderStatePlaced() {};
    private static OrderStatePlaced instance = new OrderStatePlaced();
    public static OrderStatePlaced getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Placed";
    }

}
