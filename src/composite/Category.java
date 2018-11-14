package composite;

import iterator.Container;
import iterator.MyIterator;
import iterator.ProductIterator;

import java.util.ArrayList;
import java.util.List;

public class Category implements ICategory, Container {

    private int categoryId;
    private String categoryName;

    List<Item> productList = new ArrayList<>();

    public Category() {
    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
        MyIterator productIterator = this.getIterator();
        while (productIterator.hasNext()) {
            Item product = productIterator.next();
            product.print();
        }
    }

    @Override
    public void add(Item item) {
        productList.add(item);
    }

    @Override
    public void remove(Item item) {
        productList.remove(item);
    }

    @Override
    public Item get(int index) {
        return productList.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (getCategoryId() != category.getCategoryId()) return false;
        return getCategoryName().equals(category.getCategoryName());
    }

    @Override
    public int hashCode() {
        int result = getCategoryId();
        result = 31 * result + getCategoryName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Category:\n");
        stringBuilder.append("category id: " + getCategoryId() + "\n");
        stringBuilder.append("category name: " + getCategoryName() + "\n");
        return stringBuilder.toString();
    }

    @Override
    public MyIterator getIterator() {
        return new ProductIterator(productList);
    }
}
