package ShubhamPokale;

public class MainforDog {

    public static void main(String[] args) {
        Dog pet1 = new Dog("Bolt","German Shepard");
        Dog pet2 = new Dog("Tesla","Husky");
        pet1.display();
        pet1.setter("Labrador");
        pet1.display();


        pet2.setter("Champion","Great Dan");
        pet2.display();

    }
}
