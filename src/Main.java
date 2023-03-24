import Impl.GroupServiceImpl;
import Impl.StudentServiceIMPL;
import Model.Gender;
import Model.Group;
import Model.Student;
import service.GroupService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GroupServiceImpl groupService = new GroupServiceImpl();
        StudentServiceIMPL studentServiceIMPL = new StudentServiceIMPL();
        Group group = new Group(9,"Java",2022,"PeakSoft");
        Student student = new Student("Abdymomun",17, Gender.Meal);
//        System.out.println("write name id ");
//        int a = new Scanner(System.in).nextInt();
//        if (group.getId() == a){
//            System.out.println(group.toString());
//        }
        //groupService.addNewGroup(group);
      //  System.out.println(groupService.getGroupById(9));
        //groupService.getAllGroups();
        studentServiceIMPL.addStudent(student);

    }
}