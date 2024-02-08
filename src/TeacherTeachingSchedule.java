import java.util.ArrayList;
import java.util.Scanner;

public class TeacherTeachingSchedule {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Teacher t = new Teacher(1,"Na","male","PP","012-200-122", new String[]{"ISAD"});
        t.show();


        Teacher teachers = new Teacher();
        teachers.addInfo(scanner);
        teachers.show();



        System.out.print("    Enter number : ");
        int n = scanner.nextInt();


        Teacher[] teacher = new Teacher[n];

        for(int i=0 ; i<teacher.length ; i++) {
            if(teacher[i] != null ){
                teacher[i].addInfo(scanner);
            }
            else
                System.out.println("   NULL values !!");
        }
        for(int i=0 ; i<teacher.length ; i++) {
            teacher[i].show();
        }






//        ClassRoom[] classRooms = new ClassRoom[2];
//        for(int i=0 ; i<classRooms.length ; i++){
//            classRooms[i] = new Teacher();
//            classRooms[i].addInfo(scanner);
//        }
//        for(int i=0 ; i<classRooms.length ; i++ ){
//
//            classRooms[i].show();
//        }
    }
}
