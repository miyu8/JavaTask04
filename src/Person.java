/**
 * Created by Mihail Lobanov on 13.11.2016.
 */

import java.lang.Comparable;

public class Person implements Comparable {

    private String name;
    private DateMonthYear dateBirth;
    private int numberIdentity;
    private boolean dateBirthErr = false;

    public Person(String name, DateMonthYear dateBirth, int numberIdentity) {
        if (dateBirth.error()) {
            dateBirthErr = true;
        } else {
            this.name = name;
            this.dateBirth = dateBirth;
            this.numberIdentity = numberIdentity;
        }
    }

    public String getName() {
        return name;
    }

    public DateMonthYear getdateBirth() {
        return dateBirth;
    }

    public int getnumberIdentity() {

        return numberIdentity;
    }

    public boolean dateBirthError() {

        return dateBirthErr;
    }

    public int compareTo(Object obj) {
        int compare;
        Person person = (Person) obj;
        if (this.getdateBirth().getYear() > person.getdateBirth().getYear()) {
            compare = 1;
        } else if (this.getdateBirth().getYear() < person.getdateBirth().getYear()) {
            compare = -1;
        } else if (this.getdateBirth().getMonth() > person.getdateBirth().getMonth()) {
            compare = 1;
        } else if (this.getdateBirth().getMonth() < person.getdateBirth().getMonth()) {
            compare = -1;
        } else if (this.getdateBirth().getDate() > person.getdateBirth().getDate()) {
            compare = 1;
        } else if (this.getdateBirth().getMonth() < person.getdateBirth().getMonth()) {
            compare = -1;
        } else if (this.getnumberIdentity() > person.getnumberIdentity()) {
            compare = 1;
        } else if (this.getnumberIdentity() < person.getnumberIdentity()) {
            compare = -1;
        } else {
            compare = 0;
        }
        return compare;
    }
}