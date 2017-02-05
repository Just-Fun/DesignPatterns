package ua.com.serzh.builder;

/**
 * Created by Serzh on 2/5/17.
 */
public class Person {
    private final String firstname;
    private final String lastname;
    private final String email;

    private Person(Builder builder) {

        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.email = builder.email;
    }

    public static void main(String[] args) {
        Person person = new Person.Builder().fistname("Angelina").lastname("Joli").email("joli@gmail.com").build();
        System.out.println(person);
        Person person2 = new Person.Builder("Angelina", "Joli", "joli@gmail.com").build();
        System.out.println(person2);
        Person person3 = new Person.Builder().fistname("Angelina").build();
        System.out.println(person3);
    }


    public static class Builder {

        private String firstname;
        private String lastname;
        private String email;
        public Builder() {
        }

        public Builder(String firstname, String lastname, String email) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.email = email;
        }

        public Builder fistname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }
    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}