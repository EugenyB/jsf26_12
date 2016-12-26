package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

/**
 * Created by yevge on 26.12.2016.
 */
@Entity
public class Phone {
    private String number;
    private String description;

    @Id
    public String getNumber() {
        return number;
    }

    public void setNumber(String id) {
        this.number = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Collection<Person> people;

    @ManyToMany(mappedBy = "phones")
    public Collection<Person> getPeople() {
        return people;
    }

    public void setPeople(Collection<Person> people) {
        this.people = people;
    }
}
