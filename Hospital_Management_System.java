package Hospital_Management_System;

import java.util.Scanner;

public class Hospital_info {
    String name;
    int age;
    String phonenumber;

    Hospital_info(String name, int age, String phonenumber) {
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    void greetings() {
        String s = "Greetings.This is a LSK EMERGENCY CARE";
        String doctors;
        System.out.println(s);
    }

    class Reception {
        void Reception(String name, int age, String phonenumber) {
            String v = "Hello Sir You are Welcome";
            System.out.println(v);
         //   System.out.println("Kindly Enter your name please");
            System.out.println("Check out the details you have shared");
            System.out.println("Name: " + name);
            System.out.println("Age:" + age);
            System.out.println("PhoneNumber:" + phonenumber);

        }
    }

    class patient_details extends Reception {
        void deails() {
            System.out.println("You are registered; Please be wait for sometime");
        }
        //  return 0;
    }

    interface doctors_details {
         void treatment();
    }

    class Normal implements doctors_details {

        @Override
        public void treatment() {
            System.out.println("Take Care ");
            System.out.println("Precribe: tablets");
        }
    }

    class Dejective implements doctors_details {
        @Override
        public void treatment() {
            System.out.println("Prescibe :take the x -ray");
        }
    }

    class mediacl_info_ extends patient_details {
        void genrate_bill() {
            int c = name.length();
            System.out.println(c);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = sc.nextLine();

        System.out.println("Enter Your age");
        int age = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter your phone number");
        String phonenumber = sc.nextLine();

        Hospital_info obj = new Hospital_info(name, age, phonenumber);
        obj.greetings();

        Hospital_info.Reception obj1 = obj.new Reception();
        obj1.Reception(name, age, phonenumber);

        Hospital_info.patient_details p = obj.new patient_details();
        p.deails();

        System.out.println("What is the issue? (normal/dejective)");
        String issue = sc.nextLine();
        doctors_details dc =obj.new Normal();
        doctors_details dc1=obj.new Dejective();
        if(issue.equalsIgnoreCase("normal")){
            dc.treatment();
        }
        else{
            dc.treatment();
        }
        Hospital_info.mediacl_info_ bill = obj.new mediacl_info_();
        System.out.println("Generating bill...");
        bill.genrate_bill();
    }

}
