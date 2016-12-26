package beans;

import model.Data;
import model.Person;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yevge on 26.12.2016.
 */
@Named
@SessionScoped
public class PersonBean implements Serializable {
    @Inject
    Person person;

    private List<Person> people;

    @PostConstruct
    public void init() {
        people = new ArrayList<>(Arrays.asList(
                new Person("Ivanov"),
                new Person("Petrov"),
                new Person("Sidorov")
        ));
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String check() {
        if (person.getName().length()<2) {
            return "failure";
        } else {
            return "success";
        }
    }

    public List<Person> getPeople() {
        return people;
    }
}
