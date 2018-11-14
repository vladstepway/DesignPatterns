package mediator;

public class RunnerMediator {
    public static void main(String[] args) {

        OfficeStoreMediator mediator = new OfficeStoreMediator();

        Person customer1 = new Customer(mediator, "Jack");
        Person customer2 = new Customer(mediator, "Jimmy");
        Person customer3 = new Customer(mediator, "Elly");

        customer2.setEnable(false);
        customer3.setEnable(false);
        Person seller = new Seller(mediator, "Andrew");

        mediator.setSeller(seller);

        mediator.add(customer1);
        mediator.add(customer2);
        mediator.add(customer3);
//        mediator.add(seller);

        customer1.sendRequest("product");
//        seller.receiveRequest("product");
    }
}
