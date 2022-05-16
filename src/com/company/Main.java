package com.company;
import java.io.FileWriter;   // FileWriter
import java.io.IOException;  // handles exceptions
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner; //
import java.io.File;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("______________________________________________");
        System.out.println("_______________Budget Program_________________");
        System.out.println("This program takes all your bills and income \r\nand generates a txt file that shows how \r\nmuch you have left to spend while suggesting \r\nsavings amounts based on your situation. ");
        System.out.println("");
        System.out.println("Name your file:");
        String filename = reader.nextLine();

            System.out.println("Choose a template: ");
            System.out.println("1. Simple Budget");
            System.out.println("2. Budget for Saving Up");
            System.out.println("3. Budget for Investors");

            Integer template = reader.nextInt();

            if(template.equals(1)){
                System.out.println("Paycheck Amoount: ");
                Double check = reader.nextDouble();

                System.out.println("Rent/Mortgage Amount: ");
                Double rent = reader.nextDouble();

                System.out.println("Utilities: ");
                Double utilities = reader.nextDouble();

                System.out.println("Cell Phone: ");
                Double cellphone = reader.nextDouble();

                System.out.println("Car Note: ");
                Double carnote = reader.nextDouble();

                System.out.println("Car Insurance: ");
                Double carinsurance = reader.nextDouble();

                System.out.println("Credit Card Pyments: ");
                Double cardpayments = reader.nextDouble();

                System.out.println("Loan Payments");
                Double loan = reader.nextDouble();

                System.out.println("Your file has been created and can be viewed/printed by opening it. "  );

                double totalbills= rent+utilities+cellphone+cardpayments+carinsurance+carnote+loan;
                double remainder = check-totalbills;
                double savings = remainder * .25;
                double freemoney = remainder - savings;

                try{
                    FileWriter myWriter = new FileWriter(filename+".txt");
                    myWriter.write("Paycheck Amount: " + check + "\r\n");
                    myWriter.write("\r\n");
                    myWriter.write("Rent/Mortgage: " + rent + "\r\n");
                    myWriter.write("Utilities: " + utilities + "\r\n");
                    myWriter.write("Cell Phone: " + cellphone + "\r\n");
                    myWriter.write("\r\n");
                    myWriter.write("Car Note: " + carnote + "\r\n");
                    myWriter.write("Car Insurance: " + carinsurance + "\r\n");
                    myWriter.write( "\r\n");
                    myWriter.write("Credit Card Payments: " + cardpayments + "\r\n");
                    myWriter.write("Loan Payments: " + loan + "\r\n");
                    myWriter.write( "\r\n");
                    myWriter.write("Total Bills: " + totalbills + "\r\n");
                    myWriter.write("Remainder: " + remainder + "\r\n");
                    myWriter.write("Remainder for Savings: " + savings + "\r\n");
                    myWriter.write( "\r\n");
                    myWriter.write("Free money: " + freemoney + "\r\n");
                    myWriter.close();

                }catch(IOException e){
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                Path path = Paths.get("filename.txt");


            }else if(template.equals(2)){
                System.out.println("Paycheck Amoount: ");
                Double check = reader.nextDouble();

                System.out.println("Passive/Side Hustle Income: ");
                Double passive = reader.nextDouble();

                System.out.println("Rent/Mortgage Amount: ");
                Double rent = reader.nextDouble();

                System.out.println("Utilities: ");
                Double utilities = reader.nextDouble();

                System.out.println("Cell Phone: ");
                Double cellphone = reader.nextDouble();

                System.out.println("Car Note: ");
                Double carnote = reader.nextDouble();

                System.out.println("Car Insurance: ");
                Double carinsurance = reader.nextDouble();

                System.out.println("Credit Card Pyments: ");
                Double cardpayments = reader.nextDouble();

                System.out.println("Loan Payments");
                Double loan = reader.nextDouble();

                System.out.println("Your file has been created and can be viewed/printed by opening it. "  );

                double totalbills= rent+utilities+cellphone+cardpayments+carinsurance+carnote+loan;
                double remainder = passive+check-totalbills;
                double savings = remainder * .5;
                double freemoney = remainder - savings;

                try{
                    FileWriter myWriter = new FileWriter(filename+".txt");
                    myWriter.write("Paycheck Amount: " + check + "\r\n");
                    myWriter.write("Passive/Side Hustle Income: "+ passive + "\r\n");
                    myWriter.write("\r\n");
                    myWriter.write("Rent/Mortgage: " + rent + "\r\n");
                    myWriter.write("Utilities: " + utilities + "\r\n");
                    myWriter.write("Cell Phone: " + cellphone + "\r\n");
                    myWriter.write("\r\n");
                    myWriter.write("Car Note: " + carnote + "\r\n");
                    myWriter.write("Car Insurance: " + carinsurance + "\r\n");
                    myWriter.write( "\r\n");
                    myWriter.write("Credit Card Payments: " + cardpayments + "\r\n");
                    myWriter.write("Loan Payments: " + loan + "\r\n");
                    myWriter.write( "\r\n");
                    myWriter.write("Total Bills: " + totalbills + "\r\n");
                    myWriter.write("Remainder: " + remainder + "\r\n");
                    myWriter.write("REMAINDER FOR SAVINGS: " + savings + "\r\n");
                    myWriter.write( "\r\n");
                    myWriter.write("Free money: " + freemoney + "\r\n");
                    myWriter.close();

                }catch(IOException e){
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                Path path = Paths.get("filename.txt");




            }else if(template.equals(3)){
                System.out.println("Paycheck Amoount: ");
                Double check = reader.nextDouble();

                System.out.println("Real Estate Income: ");
                Double realestate = reader.nextDouble();

                System.out.println("Other Passive Income: ");
                Double passive = reader.nextDouble();

                System.out.println("All Rent/Mortgage Payment Amounts: ");
                Double rent = reader.nextDouble();

                System.out.println("Insurance Payments: ");
                Double insurance = reader.nextDouble();

                System.out.println("Utilities: ");
                Double utilities = reader.nextDouble();

                System.out.println("Cell Phone: ");
                Double cellphone = reader.nextDouble();

                System.out.println("Car Note: ");
                Double carnote = reader.nextDouble();

                System.out.println("Car Insurance: ");
                Double carinsurance = reader.nextDouble();

                System.out.println("Credit Card Pyments: ");
                Double cardpayments = reader.nextDouble();

                System.out.println("Student Loan Payments: ");
                Double studentloan = reader.nextDouble();

                System.out.println("Other Loan Payments: ");
                Double loan = reader.nextDouble();

                System.out.println("Your file has been created and can be viewed/printed by opening it. "  );

                double totalbills= rent+utilities+cellphone+cardpayments+carinsurance+carnote+loan;
                double remainder = realestate+passive+check-totalbills;
                double savings = remainder * .25;
                double investing = remainder* .5;
                double freemoney = remainder-investing - savings;

                try{
                    FileWriter myWriter = new FileWriter(filename+".txt");
                    myWriter.write("Paycheck Amount: " + check + "\r\n");
                    myWriter.write("Passive/Side Hustle Income: "+ passive + "\r\n");
                    myWriter.write("\r\n");
                    myWriter.write("Rent/Mortgage: " + rent + "\r\n");
                    myWriter.write("Utilities: " + utilities + "\r\n");
                    myWriter.write("Cell Phone: " + cellphone + "\r\n");
                    myWriter.write("\r\n");
                    myWriter.write("Car Note: " + carnote + "\r\n");
                    myWriter.write("Car Insurance: " + carinsurance + "\r\n");
                    myWriter.write( "\r\n");
                    myWriter.write("Credit Card Payments: " + cardpayments + "\r\n");
                    myWriter.write("Loan Payments: " + loan + "\r\n");
                    myWriter.write( "\r\n");
                    myWriter.write("Total Bills: " + totalbills + "\r\n");
                    myWriter.write("Remainder: " + remainder + "\r\n");
                    myWriter.write("REMAINDER FOR REINVESTING: "+investing + "\r\n");
                    myWriter.write("Remainder for Savings " + savings + "\r\n");
                    myWriter.write( "\r\n");
                    myWriter.write("Free money: " + freemoney + "\r\n");
                    myWriter.close();

                }catch(IOException e){
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                Path path = Paths.get("filename.txt");




            }else {
                System.out.println("Error. Please choose option 1, 2, or 3. ");
            }






    }
}
