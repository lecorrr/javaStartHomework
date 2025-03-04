package homework;

import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
            System.out.println("area of ​​a triangle");

            double sideA = 0.3;
            double sideB = 0.4;
            double sideC = 0.5;           

            try ( Scanner sc = new Scanner(System.in);) {

                System.out.println("do you want default answer Y/n");

                String answer = sc.nextLine();
                
                if(answer.equals("n") || answer.equals("N")){

                    System.err.println("input 3 digits for triangle area calculation");

                    double newSideA = sc.nextDouble();
                    double newSideB = sc.nextDouble();
                    double newSideC = sc.nextDouble();

                    System.out.println("area of triangle is "+ String.format("%.2f", geron(newSideA, newSideB, newSideC)));

                }else{

                    System.out.println("default answer");
                    
                    System.out.println("area of triangle is "+ String.format("%.2f", geron(sideA, sideB, sideC)));
                }

            } 

        }
    
        public static double geron(double sideA, double sideB, double sideC)
    {
        double p = (sideA + sideB + sideC)/2;

        double defAnswer = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));     

        return defAnswer;
    }
}
