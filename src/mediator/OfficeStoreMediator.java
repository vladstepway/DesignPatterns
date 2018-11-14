package mediator;

import java.util.ArrayList;
import java.util.List;

public class OfficeStoreMediator implements IStoreMediator {
    Person seller;
    private List<Person> personList = new ArrayList<>();

    public OfficeStoreMediator() {
    }

    public void setSeller(Person seller) {
        if (seller != null && seller instanceof Seller) {
            this.seller = seller;
        } else {
            throw new RuntimeException("Customer cannot be a seller");
        }
    }

    @Override
    public void sendRequest(String message, Person person) {
        if (person instanceof Seller) {
            for (Person person1 : this.personList) {
                if (person1 != person && person1.isEnable()) {
                    person1.receiveRequest("seller " + person.getName() + " received request");
                }

            }
        }

        if (person instanceof Customer) {
            for (Person person1 : personList) {
//                if (person1 != person && person1.isEnable() && person1 instanceof Seller) {
                if (person1 != person && person1.isEnable()) {
                    person1.receiveRequest(person.getName() + " received product " + message);
                }
            }
        }

        if (seller.isEnable()) {
            seller.receiveRequest(person.getName() + " requested product " + message);
        }
//        for (Person person1 : this.personList) {
//            if (person1 != person) {
//                person1.receiveRequest(message);
//            }
//        }
    }

    @Override
    public void add(Person person) {
        if (seller == null) {
            throw new RuntimeException("There is no seller at store");
        }
        if (person instanceof Customer) {
            this.personList.add(person);
        } else {
            throw new RuntimeException("Seller only for this store");
        }
    }


}
