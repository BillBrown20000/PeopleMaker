package PeopleItorator;

public class PeopleItoratorMain {
    public static void main(String[] args) {

        PeopleItorator BillyBoyy = new PeopleItorator("Billy","Boy");
        PeopleItorator DirtyDann = new PeopleItorator("Dirtyy","Dan");
        PeopleItorator SoujaBoyy = new PeopleItorator("Souja", "Boy");

        PeopleItorator[] SamLJackson = {DirtyDann, BillyBoyy, SoujaBoyy};

        PeopleMaker Denzel = new PeopleMaker(SamLJackson);
        System.out.println(Denzel.whileLoop());
        System.out.println("************************");

        System.out.println(Denzel.forLoop());
        System.out.println("*************************");

        System.out.println(Denzel.forEachLoop());

        Denzel.getPersonArray();






    }
}
