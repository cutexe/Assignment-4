public class PizzaTester {
    public static void main(String[] args) {
        //random pizza objects + set properties
        Pizza pizza1 = new Pizza("medium", 2,3,1);
        Pizza pizza2 = new Pizza("large", 1,1,2);
        Pizza pizza3 = new Pizza("small", 4,5,3);

        //display pizza descriptions
        System.out.println(
                "\n=-=-=-=-=-=-=-=-=" +
                "\nHere's pizza 1! \n" + pizza1.getDescription() +
                "\n=-=-=-=-=-=-=-=-=");
        System.out.println(
                "\n=-=-=-=-=-=-=-=-=" +
                "\nHere's pizza 2! \n" + pizza2.getDescription() +
                "\n=-=-=-=-=-=-=-=-=");
        System.out.println(
                "\n=-=-=-=-=-=-=-=-=" +
                "\nHere's pizza 3! \n" + pizza3.getDescription() +
                "\n=-=-=-=-=-=-=-=-=");

        //utilizing get/set variables
        //simulate customer order
        System.out.println("\n> Customer 1: Actually, I'd like a small pizza with 6 pepperonis, 4 cheese, and 6 ham. ");
        Pizza pizza4 = new Pizza("small", 4, 6, 5);

        //repeat the customer's order back to them
        System.out.println("> Cashier: Okay, so you ordered one " + pizza4.getSize() + " pizza with " +
                pizza4.getPepperTop() + " pepperonis, " + pizza4.getCheeseTop() + " cheese, and " +
                pizza4.getHamTop() + " ham.");

        //give customer receipt
        System.out.println("> Customer 1: That's correct! ");
        System.out.println("> Cashier: Okay! Here's your receipt.");
        System.out.println("=======================" + "\nReceipt: \n" + pizza4.getDescription() + "\n=======================" );

    }
}

//Output
//=-=-=-=-=-=-=-=-=
//Here's pizza 1!
//Size: medium
//-----------------
//Cheese Toppings: 2
//Pepperoni Toppings: 3
//Ham Toppings: 1
//-----------------
//Total Cost: $24.0
//=-=-=-=-=-=-=-=-=
//
//=-=-=-=-=-=-=-=-=
//Here's pizza 2!
//Size: large
//-----------------
//Cheese Toppings: 1
//Pepperoni Toppings: 1
//Ham Toppings: 2
//-----------------
//Total Cost: $22.0
//=-=-=-=-=-=-=-=-=
//
//=-=-=-=-=-=-=-=-=
//Here's pizza 3!
//Size: small
//-----------------
//Cheese Toppings: 4
//Pepperoni Toppings: 5
//Ham Toppings: 3
//-----------------
//Total Cost: $34.0
//=-=-=-=-=-=-=-=-=
//
//> Customer 1: Actually, I'd like a small pizza with 6 pepperonis, 4 cheese, and 6 ham.
//> Cashier: Okay, so you ordered one small pizza with 6 pepperonis, 4 cheese, and 5 ham.
//> Customer 1: That's correct!
//> Cashier: Okay! Here's your receipt.
//=======================
//Receipt:
//Size: small
//-----------------
//Cheese Toppings: 4
//Pepperoni Toppings: 6
//Ham Toppings: 5
//-----------------
//Total Cost: $40.0
//=======================
//
//Process finished with exit code 0