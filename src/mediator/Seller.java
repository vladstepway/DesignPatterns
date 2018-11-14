package mediator;

public class Seller extends Person {

    public Seller(IStoreMediator mediator, String name) {
        super(mediator, name);
    }


//    @Override
//    public void sendRequest(String msg) {
//        System.out.println(this.name + ": SELLER Requested product :" + msg);
//        mediator.sendRequest(msg, this);
//    }

    @Override
    public void receiveRequest(String msg) {
        System.out.println("for seller :" + getName() + "\n" + msg);
    }
}
