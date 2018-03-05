package arraylist_contain_object;

import java.util.List;
import java.util.Optional;

public class ArrayLIstContainsObject03 {
    class Person {
        String name;
        public String getName() {
            return name;
        }
    }
    public Optional<Person> lookupPerson(List<Person> list, String personName) {
        return list.stream()
                .filter(p -> p.name.equals(personName))
                .findAny();
    }
}
