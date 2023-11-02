package ShubhamPokale;

public class Dog {
    //Encapsulating the Dog class instance variables
    private String name;
    private String breed;

    // Dog class constructors
    // Non-parameterized constructor

    Dog( )
    {
        this.name = "Unknown";
        this.breed = "Unknown" ;

    }

    // Parameterized constructor
    Dog(String name, String breed )
    {
        this.name = name;
        this.breed = breed ;

    }
    //setter method
    void setter(String name, String breed )
        {
            System.out.println("The Dog name and breed are updated succesfully");
            this.name = name;
            this.breed = breed ;

        }
    // Overrider setter method
     void setter(String breed)
        {System.out.println("The Dog  breed is updated succesfully");
            this.breed = breed;
        }

    //display method

    void display()
        {
            System.out.println("Dog name : " + name );
            System.out.println("Dog breed : " + breed);

        }








}
