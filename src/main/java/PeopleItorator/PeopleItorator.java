package PeopleItorator;

public class PeopleItorator {

        private final String firstName;

        private final String lastName;


        public PeopleItorator (String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;

        }
        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {

            return new StringBuilder()

                    .append("\nMy first name is " + firstName)

                    .append("\nMy last name is " + lastName)

                    .toString();

        }


}
