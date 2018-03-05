package arraylist_contain_object;

import java.util.List;

public class ArrayLIstContainsObject01 {

    class Person {
        String name;
        public String getName() {
            return name;
        }
    }

    public Person lookupPerson(List<Person> persons, String personName) {
        for (Person per : persons) {
            if (per.getName().equals(personName)) {
                return per;
            }
        }
        return null;
    }
}
