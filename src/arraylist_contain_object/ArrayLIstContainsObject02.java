package arraylist_contain_object;

import java.util.List;

public class ArrayLIstContainsObject02 {
    class Person {
        String name;
        public Person(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        @Override
        public boolean equals(final Object o) {
            if (o == null) {
                return false;
            }
            if (!(o instanceof Person)) {
                return false;
            }
            if (o == this) {
                return true;
            }

            final Person other = (Person) o;
            return other.name.equals(this.name);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;

            result = prime * result;
            if (this.name != null) {
                result += this.name.hashCode();
            }

            return result;
        }
    }

    public Person lookupPerson(List<Person> persons, String personName) {
        // The needle to search for
        final Person needle = new Person(personName);

        // The needle will now be equals to list objects
        // regarding its equals method which only checks
        // for the name

        final int index = persons.indexOf(needle);
        if (index != -1) {
            // Get the element at this position
            return persons.get(index);
        } else {
            return null;
        }
    }
}
