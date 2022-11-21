import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<ArrayList> userList = new ArrayList<ArrayList>();
    static void addEmployee(){
        ArrayList<Object> arr = new ArrayList<Object>();
        System.out.print("Enter employee code:");
        double code = sc.nextDouble();
        System.out.print("Enter employee name:");
        String name = sc.next();
        System.out.print("Enter employee designation:");
        String designation = sc.next();
        System.out.print("Enter employee salary:");
        double salary = sc.nextDouble();
        System.out.print("Enter company name:");
        String company = sc.next();
        System.out.print("Enter employee phone:");
        double phone = sc.nextDouble();
        System.out.print("Enter employee email:");
        String email = sc.next();
        arr.add(code);
        arr.add(name);
        arr.add(designation);
        arr.add(salary);
        arr.add(company);
        arr.add(phone);
        arr.add(email);
        userList.add(arr);
        System.out.println("Employee Added Successfully");
    }

    static void viewEmployees() {

        for(int i = 0; i < userList.size(); i++) {
            System.out.println("------------------------------------------");
            System.out.println("Employee code "+ userList.get(i).get(0));
            System.out.println("Employee name "+ userList.get(i).get(1));
            System.out.println("Employee designation "+ userList.get(i).get(2));
            System.out.println("Employee salary "+ userList.get(i).get(3));
            System.out.println("Company name "+ userList.get(i).get(4));
            System.out.println("Employee phone "+ userList.get(i).get(5));
            System.out.println("Employee email "+ userList.get(i).get(6));
            System.out.println("------------------------------------------");
        }
    }


    static void searchEmployees() {
        System.out.print("Enter employee code:");
        double code = sc.nextDouble();
        for(int i = 0; i < userList.size(); i++) {
            if(userList.get(i).get(0).equals(code)) {
                System.out.println("------------------------------------------");
                System.out.println("Employee code "+ userList.get(i).get(0));
                System.out.println("Employee name "+ userList.get(i).get(1));
                System.out.println("Employee designation "+ userList.get(i).get(2));
                System.out.println("Employee salary "+ userList.get(i).get(3));
                System.out.println("Company name "+ userList.get(i).get(4));
                System.out.println("Employee phone "+ userList.get(i).get(5));
                System.out.println("Employee email "+ userList.get(i).get(6));
                System.out.println("------------------------------------------");
                break;
            }
        }

    }

    static void deleteEmployees() {
        System.out.print("Enter employee code to remove:");
        double code = sc.nextDouble();
        for(int i = 0; i < userList.size(); i++) {
            if(userList.get(i).get(0).equals(code)) {
                userList.remove(i);
                System.out.println("Employee removed successfully");
                break;
            }
        }
    }


    public static void main(String[] args) {
        while(true) {
        System.out.println(" 1:add employee");
        System.out.println(" 2:view employee");
        System.out.println(" 3:search employee");
        System.out.println(" 4:delete employee");
        System.out.println("5:exit");
        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
            }
        }
    }
}

