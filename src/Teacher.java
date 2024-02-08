
import java.util.Arrays;
import java.util.Scanner;

public class Teacher{
    private Integer id;
    private String name;
    private String gender;
    private String address;
    private String phoneNumber;
    private String[] subject;
    private int n;
    Teacher(){}



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public Teacher(Integer id, String name, String gender, String address, String phoneNumber, String[] subject) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.subject = subject;
    }

    public Teacher addInfo(Scanner scanner) {
        System.out.println("=".repeat(15) + "= Add  Information =" + "=".repeat(15));
        System.out.print(" Enter ID : ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Enter name : ");
        name = scanner.nextLine();
        System.out.print(" Enter gender :");
        gender = scanner.nextLine();
        System.out.print(" Enter address : ");
        address = scanner.nextLine();
        System.out.print(" Enter phone number : ");
        phoneNumber = scanner.nextLine();
        System.out.print(" Enter number subject of teacher : ");
        n = scanner.nextInt();
        scanner.nextLine();

        subject = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subject[i] =scanner.nextLine();
        }
        return  this;
    }

    public void show (){
        System.out.println("=".repeat(15) + " Display Information " + "=".repeat(15));
        System.out.println("   Teacher ID : " + id);
        System.out.println("   Teacher Name : " + name);
        System.out.println("   Teacher gender : " + gender);
        System.out.println("   Teacher address : " + address);
        System.out.println("   Teacher phone number : " + phoneNumber);
        System.out.println("   Subjects taught:");
        for (int i = 0; i < n; i++) {
            System.out.println("   Subject " + (i + 1) + " : " + subject[i] );
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", subject=" + Arrays.toString(subject) +
                '}';
    }
}
