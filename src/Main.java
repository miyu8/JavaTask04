/**
 * Created by Mihail Lobanov on 13.11.2016.
 */

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        Person[] persons = new Person[5];
        persons[0] = new Person("Валерий", new DateMonthYear(16, 10, 1988), 2);
        persons[1] = new Person("Антон", new DateMonthYear(16, 10, 1988), 1);
        persons[2] = new Person("Сергей", new DateMonthYear(22, 10, 1980), 3);
        persons[3] = new Person("Александр", new DateMonthYear(23, 9, 1989), 4);
        persons[4] = new Person("Михаил", new DateMonthYear(17, 1, 1987), 5);
        Person[] persons2 = persons.clone();
        Arrays.sort(persons);
        Arrays.sort(persons2, new PersonEquals());
        for (Person person : persons)
            System.out.println(person.getName() + "\t" + person.getdateBirth().getDate() + "." +
                    person.getdateBirth().getMonth() + "." + person.getdateBirth().getYear() + "\t" +
                    person.getnumberIdentity());
        System.out.println();
        for (Person person : persons2)
            System.out.println(person.getName() + "\t" + person.getdateBirth().getDate() + "." +
                    person.getdateBirth().getMonth() + "." + person.getdateBirth().getYear() + "\t" +
                    person.getnumberIdentity());
    }
}