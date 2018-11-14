package mediator;

public class RunnerMediator {
    public static void main(String[] args) {

        IStoreMediator mediator = new OfficeStoreMediator();

        Person customer1 = new Customer(mediator, "Jack");
        Person customer2 = new Customer(mediator, "Jimmy");
        Person customer3 = new Customer(mediator, "Elly");

        Person seller = new Seller(mediator, "Andrew");

        mediator.add(customer1);
        mediator.add(customer2);
        mediator.add(customer3);
        mediator.add(seller);

        customer1.sendRequest("Hello");
    }
}
