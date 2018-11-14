package composite;

import java.util.ArrayList;

import iterator.CategoryIterator;
import iterator.Container;
import iterator.MyIterator;

import java.util.List;

public class OfficeStore implements ICategory, Container {

    private List<ICategory> categoryList = new ArrayList<>();


    @Override
    public void print() {

        MyIterator categoryIterator = this.getIterator();

        while (categoryIterator.hasNext()) {
            ICategory category = (ICategory) categoryIterator.next();
            category.print();
        }
    }

    @Override
    public void add(Item item) {
        categoryList.add((ICategory) item);
    }

    @Override
    public void remove(Item item) {
        categoryList.remove(item);

    }

    @Override
    public Item get(int index) {
        return categoryList.get(index);
    }

    @Override
    public MyIterator getIterator() {
        return new CategoryIterator(categoryList);
    }
}
