package fowler;

/**
 * Note that Java console applications need to be run through the java runtime
 * by running "java -jar JarFile.jar" in the command line.
 * Java console applications can not be previewed in the Compilr IDE, only applets can.
 */
public class Program {
    /**
     * This is the main entry point for the application
     */

    public static void main(String args[]) {
        String result;
        System.out.println("Welcome to the Movie Store");
        Movie movie1 = new NewRelease("movie1");
        Movie movie2 = new Childrens("movie2");
        Rental rental1 = new Rental(movie1, 10);
        Rental rental2 = new Rental(movie2, 5);
        Customer customer1 = new Customer("joe");
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        System.out.println("Let's get the Statement");
        result = customer1.statement();
        System.out.println(result);
    }
}