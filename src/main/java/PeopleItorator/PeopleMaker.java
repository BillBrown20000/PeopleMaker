package PeopleItorator;

public class PeopleMaker {

    private final PeopleItorator[] personArray;

    public PeopleMaker(PeopleItorator[] personArray) {

        this.personArray = personArray;

    }
        public String whileLoop(){
        int counter = 0;
        String result = "";

        while (counter < personArray.length) {
            result += personArray[counter];
            counter++;


            }
            return result;
        }
        public String forLoop(){
            String result = "";
            for (int x = 0; x < personArray.length; x++)
                result += personArray[x];
            return result;

        }

        public String forEachLoop() {
            String result = "";

            for (PeopleItorator x : getPersonArray()){
             result += x;


             }
            return result;
        }


        public PeopleItorator[] getPersonArray () {

            return personArray;
        }
}
