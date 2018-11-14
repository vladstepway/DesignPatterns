package mediator;

public abstract class Person {
    protected IStoreMediator mediator;
    protected String name;

    public Person(IStoreMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendRequest(String msg);
    public abstract void receiveRequest(String msg);
}
