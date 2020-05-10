/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2a5returnmethods;

import java.util.Scanner;

/**
 *
 * @author Jack
 */
import java.util.Scanner;
public class U2A5ReturnMethods {
        public static double averagenum (int n1, int n2)
    {
        double sum = (n1+n2)/2;
        return (sum);
    }
        public static double perimeterquadralateral (int n1, int n2)
    {
        double sum = (n1+n2)*2;
        return (sum);
    }
            public static double perimetertriangle (int n1)
    {
        double sum = (n1)*3;
        return (sum);
    }
        public static double volumecube (int n1)
    {
        double sum = n1^3;
        return (sum);
    }
        public static double volumetriangularprism (int n1)
    {
        double sum = (n1^3)/2;
        return (sum);
    }
    public static double averagenum2 (int n1, int n2)
    {
        double sum = n1+n2;
        return (sum);
    }
        public static double perimeterquadralateral2 (int n1, int n2)
    {
        double sum = (n1+n2)*4;
        return (sum);
    }
            public static double perimetertriangle2 (int n1)
    {
        double sum = (n1)*6;
        return (sum);
    }
        public static double volumecube2 (int n1)
    {
        double sum = (n1^3)*2;
        return (sum);
    }
        public static double volumetriangularprism2 (int n1)
    {
        double sum = n1^3;
        return (sum);
    }    
    public static void main(String[] args) {
        int input1;
        int input2;
        boolean run;
        Scanner keyedInput = new Scanner (System.in);
        System.out.println("Hello, we are going to calculate some numbers!");
        while (run=true){
        System.out.println("Would you like to calculate, 1. an average, 2. the perimeter of a quadralateral, 3. the perimeter of a triangle, 4. the volume of a cube, 5. the volume of a triangular prism,6. double an average, 7. double the perimeter of a quadralateral, 8. double the perimeter of a triangle, 9. double the volume of a cube, 10. double the volume of a triangular prism 11. leave.");
        int input = keyedInput.nextInt();
        switch (input) {
            case 1:
                System.out.println("input num1");
                input1 = keyedInput.nextInt();
                System.out.println("input num2");
                input2 = keyedInput.nextInt();
                System.out.println(averagenum(input1,input2));
                break;
            case 2:
                System.out.println("input side length 1");
                input1 = keyedInput.nextInt();
                System.out.println("input side length 2");
                input2 = keyedInput.nextInt();
                System.out.println(perimeterquadralateral(input1,input2));
                break;
            case 3:
                System.out.println("input sidelength");
                input1 = keyedInput.nextInt();
                System.out.println(perimetertriangle(input1));
                break; 
            case 4:
                System.out.println("input sidelength");
                input1 = keyedInput.nextInt();
                System.out.println(volumecube(input1));
                break;
            case 5:
                System.out.println("input height/width");
                input1 = keyedInput.nextInt();
                System.out.println(volumetriangularprism(input1));
                break;
             case 6:
                System.out.println("input num1");
                input1 = keyedInput.nextInt();
                System.out.println("input num2");
                input2 = keyedInput.nextInt();
                System.out.println(averagenum2(input1,input2));
                break;
            case 7:
                System.out.println("input side length 1");
                input1 = keyedInput.nextInt();
                System.out.println("input side length 2");
                input2 = keyedInput.nextInt();
                System.out.println(perimeterquadralateral2(input1,input2));
                break;
            case 8:
                System.out.println("input sidelength");
                input1 = keyedInput.nextInt();
                System.out.println(perimetertriangle2(input1));
                break; 
            case 9:
                System.out.println("input sidelength");
                input1 = keyedInput.nextInt();
                System.out.println(volumecube2(input1));
                break;
            case 10:
                System.out.println("input height/width");
                input1 = keyedInput.nextInt();
                System.out.println(volumetriangularprism2(input1));
                break;    
            case 11:
                run = false;
                break;
        }
        System.exit(0);
        }
    }
    
}
