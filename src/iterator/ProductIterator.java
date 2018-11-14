package iterator;

import composite.Item;

import java.util.List;

public class ProductIterator implements MyIterator {

    private List<Item> list;
    private int index = 0;

    public ProductIterator(List<Item> productList) {
        this.list = productList;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Item next() {
        return this.hasNext() ? list.get(index++) : null;
    }
}
