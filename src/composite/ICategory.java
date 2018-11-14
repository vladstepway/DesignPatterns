package composite;

public interface ICategory extends Item {

    void add(Item item);

    void remove(Item item);

    Item get(int index);
}
