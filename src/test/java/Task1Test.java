import org.junit.jupiter.api.Test;

import java.util.List;

class Task1Test {

    @Test
    void personFiltering() {
        //1. Find Persons older 18 (included)
        //2. Order by Age
        //3. collect to List of Person first name
        //4. Print the list
        List<Person> personList =
            List.of(
                    new Person("John", "Smith", 34),
                    new Person("Dominic", "Adler", 16),
                    new Person("Alexander", "Allen", 18),
                    new Person("Adam", "Rees", 45));
    }

    static class Person {
        private final String firstName;
        private final String lastName;
        private final int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }
    }
}
