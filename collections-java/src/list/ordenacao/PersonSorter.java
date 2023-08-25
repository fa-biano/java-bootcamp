package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSorter {
    private List<Person> personList;

    public PersonSorter() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        this.personList.add(new Person(name, age, height));
    }

    public List<Person> sortByAge() {
        List<Person> personsByAge = new ArrayList<>(personList);
        Collections.sort(personsByAge);
        return personsByAge;
    }
    
    public List<Person> sortByHeight() {
        List<Person> personsByHeight = new ArrayList<>(personList);
        Collections.sort(personsByHeight, new HeightComparator());
        return personsByHeight;
    }

    public static void main(String[] args) {
        PersonSorter personSorter = new PersonSorter();
        personSorter.addPerson("Nome 1", 20, 1.56);
        personSorter.addPerson("Nome 2", 30, 1.80);
        personSorter.addPerson("Nome 3", 25, 1.70);
        personSorter.addPerson("Nome 4", 17, 1.56);

        System.out.println(personSorter.sortByAge());
        System.out.println(personSorter.sortByHeight());
    }
}
