package Store.Storeapp.service;

import Store.Storeapp.model.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final Basket basket;

    public OrderServiceImpl(Basket busket) {
        this.basket = busket;
    }

    @Override
    public List<Integer> addItems(List<Integer> ids) {
        return basket.addItems(ids);
    }

    @Override
    public List<Integer> getItems() {
        return basket.getItems();
    }
}
