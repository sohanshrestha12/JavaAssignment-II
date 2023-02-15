import java.util.Scanner;


public class NuclearReactor{
    public static void main(String[] args){
        Scanner inputObj = new Scanner(System.in);
        
        System.out.println("Enter the total number of employees:");
        int Temp = inputObj.nextInt();
        //user input: 20 (generates \n when pressed enter and nextLine reads escape sequesnce'\n'); 

        inputObj.nextLine();//reads \n so program can execute correctly
        System.out.println("Enter the name of supervisor: ");
        String name = inputObj.nextLine();

        System.out.println("Enter how many times the Nuclear waste is removed from the core: ");
        int Twaste = inputObj.nextInt();

        System.out.println("What is the total weight of the waste produced every 1 week");
        float Tweight = inputObj.nextFloat();
        
        System.out.println("Is Electric Motor being replaced every 18 days?" + "\n" + " Press “y” for yes and “n” for no ");
        char decision = inputObj.next().charAt(0);
        boolean check = Character.toString(decision).equalsIgnoreCase("y") || Character.toString(decision).equalsIgnoreCase("n");
        while(!check){
            System.out.println("Invalid input. Please try again!");
            decision = inputObj.next().charAt(0);
            if(Character.toString(decision).equalsIgnoreCase("y") || Character.toString(decision).equalsIgnoreCase("n")){
                break;
            }
        }

        System.out.println("What is the core average temperature ( celsius ) of the Nuclear Reactor?");
        float Temperature = inputObj.nextFloat();

        System.out.println();
        System.out.println();

        //display outputs
        System.out.println("The total number of employees " + Temp);
        System.out.println("The name of supervisor " + name);   
        System.out.println(Twaste + " times the Nuclear waste is removed from the core");   
        System.out.println("The total weight of the waste produced every 1 week " + Tweight);
        if (Character.toString(decision).equalsIgnoreCase("y")) {
            System.out.println("Yes, the electric Motor is being replaced every 18 days.");
        } else {
            System.out.println("No, the electric Motor isn't replaced every 18 days.");
        }
        System.out.println("The core average temperature (celsius) of the Nuclear Reactor is " + Temperature + "°C and Kelvin is " + (Temperature+273.15));
        System.out.println();
        inputObj.close();
    }
}