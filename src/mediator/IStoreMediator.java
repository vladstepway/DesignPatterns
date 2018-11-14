package mediator;

public interface IStoreMediator {
    void sendRequest(String message,Person person);
    void add(Person person);
}
