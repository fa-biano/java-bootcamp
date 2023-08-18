public class AboutMe {
    public static void main(String[] args) {
        String name = args[0];
        String lastName = args[1];
        int age = Integer.parseInt(args[2]);
        double height = Double.parseDouble(args[3]);

        System.out.println("My name is " + name + " " + lastName);
        System.out.println("I am " + age + " years old");
        System.out.println("I am " + height + " m tall");

        /* No terminal: mudar para dir bin
        usar o comando: java AboutMe <name> <lastName> <age> <height>
        exemplo: java AboutMe Joao Silva 23 1.75
        */
    }
}
