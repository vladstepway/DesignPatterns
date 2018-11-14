package composite;

public class RunnerComposite {
    public static void main(String[] args) {

        Item item1 = new Product(1,"Тетрадь","Бумага",
                "3.42","BYN");
        Item item2 = new Product(2,"Ручка","Пластик",
                "1.32","BYN");
        Item item3 = new Product(3,"Пенал","Ткань",
                "5.65","BYN");
        Item item4 = new Product(4,"Циркуль","Металл",
                "2.31","BYN");
        Item item5 = new Product(5,"Линейка","Пластик",
                "0.62","BYN");
        Item item6 = new Product(6,"Карандаш","Дерево",
                "1.12","BYN");

        ICategory category1 = new Category(1,"Письменные принадлежности");
        ICategory category2 = new Category(2,"Дополнительные принадлежности");

        category1.add(item1);
        category1.add(item2);
        category1.add(item3);

        category2.add(item4);
        category2.add(item5);
        category2.add(item6);

        ICategory store = new OfficeStore();
        store.add(category1);
        store.add(category2);

        store.print();
    }
}
