package mediator;

public class Customer extends Person {

    public Customer(IStoreMediator mediator, String name) {
        super(mediator, name);
    }

//    @Override
//    public void sendRequest(String msg) {
//        System.out.println(this.name + ": CUSTOMER Requested product :" + msg);
//        mediator.sendRequest(msg, this);
//    }

    @Override
    public void receiveRequest(String msg) {
        System.out.println("for customer:" + this.getName() + "\n" + msg);
    }
}
