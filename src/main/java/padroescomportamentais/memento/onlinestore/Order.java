package padroescomportamentais.memento.onlinestore;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private OrderState state;
    private List<OrderState> memento = new ArrayList<OrderState>();

    public OrderState getState() {
        return this.state;
    }

    public void setState(OrderState state) {
        this.state = state;
        this.memento.add(this.state);
    }

    public void restoreState(int index) {
        if (index < 0 || index > this.memento.size() - 1) {
            throw new IllegalArgumentException("Invalid index");
        }
        this.state = this.memento.get(index);
    }

    public List<OrderState> getStates() {
        return this.memento;
    }
}
