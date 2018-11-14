package iterator;

import composite.ICategory;
import composite.Item;

import java.util.List;

public class CategoryIterator implements MyIterator {

    private List<ICategory> list;
    private int index = 0;

    public CategoryIterator(List<ICategory> categoryList) {
        this.list = categoryList;
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
