public class Greeting {
    public static void main(String[] args) {
        String name = System.console().readLine();

        //Printing using standard output
        System.console().printf("Hello %s!\n", name);

        //Printing using string concatenation
        System.out.println("Hello " + name+ " !");
    }
}
