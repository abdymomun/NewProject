package Impl;

import Model.Student;
import db.DataBase;
import service.StudentService;

import java.util.List;

public class StudentServiceIMPL implements StudentService {
    DataBase dataBase = new DataBase();
    @Override
    public String addStudent(Student student) {
        dataBase.getStudents().add(student);
        return student.toString();
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public String updateStudentFullName(int id, String fullName) {
        return null;
    }

    @Override
    public List<Student> filterByGender() {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }
}
