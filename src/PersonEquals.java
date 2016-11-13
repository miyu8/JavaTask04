/**
 * Created by Mihail Lobanov on 13.11.2016.
 */

import java.util.Comparator;

public class PersonEquals implements Comparator {

    public int compare(Object obj, Object obj2) {
        int compareTo;
        Person person = (Person) obj;
        Person person2 = (Person) obj2;
        if (person.getdateBirth().getYear() > person2.getdateBirth().getYear()) {
            compareTo = 1;
        } else if (person.getdateBirth().getYear() < person2.getdateBirth().getYear()) {
            compareTo = -1;
        } else if (person.getdateBirth().getMonth() > person2.getdateBirth().getMonth()) {
            compareTo = 1;
        } else if (person.getdateBirth().getMonth() < person2.getdateBirth().getMonth()) {
            compareTo = -1;
        } else if (person.getdateBirth().getDate() > person2.getdateBirth().getDate()) {
            compareTo = 1;
        } else if (person.getdateBirth().getMonth() < person2.getdateBirth().getMonth()) {
            compareTo = -1;
        } else if (person.getnumberIdentity() > person2.getnumberIdentity()) {
            compareTo = 1;
        } else if (person.getnumberIdentity() < person2.getnumberIdentity()) {
            compareTo = -1;
        } else {
            compareTo = 0;
        }
        return compareTo;
    }
}