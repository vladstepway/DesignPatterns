package mediator;

public abstract class Person {
    protected IStoreMediator mediator;
    protected String name;
    protected boolean isEnable = true;


    public Person(IStoreMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public IStoreMediator getMediator() {
        return mediator;
    }

    public void setMediator(IStoreMediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public void setSeller() {
        isEnable = true;
    }

    public void sendRequest(String msg) {
        mediator.sendRequest(msg, this);
    }

    public abstract void receiveRequest(String msg);

    @Override
    public String toString() {
        return "\nPerson :" +
                "name : " + getName() + "\n";
    }


}
