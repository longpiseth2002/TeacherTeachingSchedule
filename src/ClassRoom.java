import java.util.Scanner;

public class ClassRoom {
    Scanner scanner ;
    private Integer classroomId ;
    private String className ;
    private Date date;
    private Teacher teacher;
    ClassRoom(){
    }
    ClassRoom addInfo(Scanner scanner){
        return this;
    }
    public void show(){

    }
//    ClassRoom(Integer classroomId , String className , Date date){
//        this.classroomId = classroomId;
//        this.className = className;
//        this.date = date;
//    }
//    public void show(){
//        System.out.println("  Class ID : " + classroomId);
//        System.out.println("  Class Name : " + className);
//        date.schedule();
////        teacher.addInfo(scanner);
//    }
}
