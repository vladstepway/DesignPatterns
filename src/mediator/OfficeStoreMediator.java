package mediator;

import java.util.ArrayList;
import java.util.List;

public class OfficeStoreMediator implements IStoreMediator {

    private List<Person> personList;

    public OfficeStoreMediator() {
        this.personList = new ArrayList<>();
    }

    @Override
    public void sendRequest(String message, Person person) {
        for (Person person1 : this.personList) {
            if (person1 != person) {
                person1.receiveRequest(message);
            }
        }
    }

    @Override
    public void add(Person person) {
        this.personList.add(person);
    }


}
