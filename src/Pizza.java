public class Pizza {
    //Create a class named Pizza that stores information about a single pizza. It should contain the following:
    //● Private instance variables to store the size of the pizza (either small, medium, or large), the
    //number of cheese toppings, the number of pepperoni toppings, and the number of ham toppings.
    private String size;
    private int cheeseTop;
    private int pepperTop;
    private int hamTop;


    //● Constructor(s) that set all of the instance variables.
    public Pizza (String size, int cheeseTop, int pepperTop, int hamTop){
        this.size = size;
        this.cheeseTop = cheeseTop;
        this.pepperTop = pepperTop;
        this.hamTop = hamTop;
    }
    //● Public methods to get
    public String getSize(){
        return size;
    }

    public int getCheeseTop(){
        return cheeseTop;
    }

    public int getPepperTop(){
        return pepperTop;
    }

    public int getHamTop() {
        return hamTop;
    }

    // and set the instance variables.

    public void setSize(String size) {
        this.size = size;
    }

    public void  setCheeseTop(int cheeseTop) {
        this.cheeseTop = cheeseTop;
    }

    public void setPepperTop(int pepperTop) {
        this.pepperTop = pepperTop;
    }

    public void setHamTop(int hamTop) {
        this.hamTop = hamTop;
    }


    //● A public method named calcCost( ) that returns a double that is the cost of the pizza. Pizza cost is
    //determined by: Small: $10 + $2 per topping Medium: $12 + $2 per topping Large: $14 + $2 per
    //topping

    public double calcCost() {
        double baseCost = 0.0;

        if (size.equals("small")) {
            baseCost = 10.0;

        }
        else if (size.equals("medium")) {
            baseCost = 12.0;
        }
        else if (size.equals("large")) {
            baseCost = 14.0;
        }

        double toppingsCost = 2.0 * (cheeseTop + pepperTop + hamTop);
        return baseCost + toppingsCost;
    }
    //● A public method named getDescription( ) that returns a String containing the pizza size, quantity
    //of each topping, and the pizza cost as calculated by calcCost().

    public String getDescription() {
        return "Size: " + size +
                "\n-----------------" +
                "\nCheese Toppings: " + cheeseTop +
                "\nPepperoni Toppings: " + pepperTop +
                "\nHam Toppings: " + hamTop +
                "\n-----------------" +
                "\nTotal Cost: $" + calcCost();
    }
    //Write test code to create several pizzas and output their descriptions. For example, a large pizza
    //with one cheese, one pepperoni and two ham toppings should cost a total of $22


}