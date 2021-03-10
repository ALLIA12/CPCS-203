package pkg1945958_ali_mohamad_aa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hospital<Person> myHospital = new Hospital<>("myHospital");
        System.out.println("Welcome to H&P System test : ");
        Scanner input = new Scanner(System.in);
        boolean Continue = true;
        while (Continue) {
            try {
                System.out.print("Enter Pationt Id: ");
                int id = input.nextInt();
                input.nextLine();
                System.out.print("Enter Pationt name: ");
                String name = input.next();
                input.nextLine();
                String phoneN = getPhone(input);
                Patient obj = new Patient(phoneN, id, name);
                myHospital.addToPeople(obj);
                System.out.print("Do you want to add more people?(y/n) ");
                char breaker = input.next().charAt(0);
                switch (breaker) {
                    case 'y', 'Y' -> {
                    }
                    case 'n', 'N' ->
                        Continue = false;
                    default ->
                        throw new InputMismatchException("Nice brain");
                }
                // continue loop
            } catch (InputMismatchException xd) {
                System.out.println("There is an error with the input please try again!");
            }
        }
        System.out.println("Good Bye cs203\n");
        System.out.println("*******************************************************************\n");
        System.out.println("------------List All People with Id (ascending) Order--------------\n");
        System.out.println("*******************************************************************\n");
        myHospital.sort();
        for (int i = 0; i < myHospital.getPeople().size(); i++) {
            System.out.println(myHospital.getPeople().get(i).toString());
        }
    }

    private static String getPhone(Scanner input) {
        while (true) {
            System.out.print("> Enter 10 digit for phone number starting with 0: ");
            String phoneN = input.nextLine();
            if (phoneN.length() == 10 && phoneN.charAt(0) == '0') {
                return phoneN;
            }
        }
    }
}
