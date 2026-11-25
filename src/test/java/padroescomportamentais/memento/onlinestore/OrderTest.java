package padroescomportamentais.memento.onlinestore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void shouldStoreStates() {
        Order order = new Order();
        order.setState(OrderStatePlaced.getInstance());
        order.setState(OrderStateDelivered.getInstance());
        assertEquals(2, order.getStates().size());
    }

    @Test
    void shouldReturnInitialState() {
        Order order = new Order();
        order.setState(OrderStatePlaced.getInstance());
        order.setState(OrderStateDelivered.getInstance());
        order.restoreState(0);
        assertEquals(OrderStatePlaced.getInstance(), order.getState());
    }

    @Test
    void shouldReturnPreviousState() {
        Order order = new Order();
        order.setState(OrderStatePlaced.getInstance());
        order.setState(OrderStatePaid.getInstance());
        order.setState(OrderStateShipped.getInstance());
        order.setState(OrderStateDelivered.getInstance());
        order.restoreState(2);
        assertEquals(OrderStateShipped.getInstance(), order.getState());
    }

    @Test
    void shouldReturnExceptionForInvalidIndex() {
        try {
            Order order = new Order();
            order.restoreState(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid index", e.getMessage());
        }
    }

}