import java.util.Scanner;

/*
Unit 3 Project 2: TrafficLight (Starter with TODOs)
Create a TrafficLight class with color and duration, plus methods to change color and check red/green.
*/

public class TrafficLight {

    // TODO 1: attributes: color (String), duration (int seconds)
    private  String color;
    private  int duration;

    // TODO 2: constructor TrafficLight(String color, int duration)
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // TODO 3: changeColor(String newColor)
    public void changeColor(String newColor){
        color = newColor;
    }


    // TODO 4: isRed() -> boolean
    public boolean isRed(){
        return color.equalsIgnoreCase("Red");
    }

    // TODO 5: isGreen() -> boolean
    public  boolean isGreen(){
        return color.equalsIgnoreCase("Green");
    }

    // TODO 6: toString()
    public String toString() {
        return "TrafficLight [color=" + color + ", duration=" + duration + " seconds]";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO 7: Create TrafficLight("RED", 30) and print state
        TrafficLight light = new TrafficLight("RED", 30);
        System.out.println("Created traffic light: " + light);
        System.out.println("Is it red? " + light.isRed());
        System.out.println("Is it green? " + light.isGreen());

        // TODO 8: Prompt user to enter new colors at least twice and print checks after each change
        System.out.print("\nEnter a new color: ");
        String color1 = input.nextLine();
        light.changeColor(color1);
        System.out.println("Changed to: " + light);
        System.out.println("Is it red now? " + light.isRed());
        System.out.println("Is it green now? " + light.isGreen());

        System.out.print("\nEnter another color: ");
        String color2 = input.nextLine();
        light.changeColor(color2);
        System.out.println("Changed to: " + light);
        System.out.println("Is it red now? " + light.isRed());
        System.out.println("Is it green now? " + light.isGreen());

        input.close();
    }
}
