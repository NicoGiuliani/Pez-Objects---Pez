public class Example {

    public static void main(String[] args) {
        System.out.println("We are making a new PEZ Dispenser:");
        PezDispenser dispenser = new PezDispenser("Darth Vader");
        System.out.printf("The dispenser is %s.\n", dispenser.getCharacterName());

        if (dispenser.isEmpty()) {
            System.out.println("The Pez dispenser's empty.");
            dispenser.fill();
            System.out.println("Now it's been filled though.");
            System.out.printf("The dispenser now has %s Pez in it.\n", dispenser.getPezCount());
        } else {
            System.out.printf("It isn't empty; it has %s Pez still in it.\n", dispenser.getPezCount());
        }

        for (int i = 0; i < 4; i++) {
            dispenser.dispense();
        }

        System.out.println(dispenser.getPezCount());
        dispenser.fill(4);
        System.out.println(dispenser.getPezCount());





    }
}
