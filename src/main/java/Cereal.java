/**
 * Cereal.java
 *
 * @author – Samantha McCullough
 * @author – 8AM
 *
 */
public class Cereal
{
    // private instance variables to hold info about a cereal from the data set
    // the name, calories, fiber, carbohydrates, and cups
    private String name = "";
    private int calories = 0;
    private double fiber = 0;
    private double carbohydrates = 0;
    private double cups = 0;


    // constructor that creates a cereal object

    public Cereal(String n, int cals, double fib, double carbs, double cup){
        this.name = n;
        this.calories = cal;
        this.fiber = fib;
        this.carbohydrates = carbs;
        this.cups = cup;
    }
    // accessor methods for each instance variable

    public String getName(){
        return this.name;
    }

    public int getCalories(){
        return this.calories;
    }

    public double getFiber(){
        return this.fiber;
    }

    public double getCarbs(){
        return this.carbohydrates;
    }

    public double getCups(){
        return this.cups;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setCalories(int newCalories){
        this.calories = newCalories;
    }

    public void setFiber(double newFiber){
        this.fiber = newFiber;
    }

    public void setCarbohydrates(double newCarbs){
        this.carbohydrates = newCarbs;
    }

    public void setCups(double newCups){
        this.cups = newCups;
    }

    /* toString method returns the values stored in the instance variables
       concatenated in a sentence starting with "Cereal: " */

    public String toString(){
        return "Cereal: " + name + " Calories: " + calories + " Fiber: " + fiber + " Carbohydrates: " + carbohydrates + " Cups: " + cups;
    }

}


