package com.syed.service;

import com.syed.entity.Student;
import com.syed.pojo.StudentUi;
import com.syed.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by syedjafar on 19/12/16.
 */
@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;


    public String message() {
        return "404 Error: Page not FOUND!!!!!";
    }

    public String create(StudentUi s) {

        Student std = new Student(s);
        try {
            studentRepo.save(std);
        }
        catch (Exception e) {
            return "Error creating the user: " + e.toString();
        }
        return "User successfully created! (id = " + std.getId() + ")";
    }

    public String delete(Integer id) {
        try {
            Student s = new Student(id);
            studentRepo.delete(s.getId());
        }
        catch (Exception ex) {

            return "Error deleting the user: " + ex.toString();
        }
        return "User successfully deleted!";
    }

    public String getById(Integer id) {
        String username;
        int userrollno;
        try {
            Student s = studentRepo.findById(id);
            username = s.getName();
            userrollno = s.getRollno();
        }
        catch (Exception ex) {
            return "User not found: " + ex.toString();
        }
        return "The username is: " + username + " and rollno is: " + userrollno ;
    }

    public String updateUser(StudentUi s, Integer id) {
        try {
            Student std = studentRepo.findOne(id);

            std.setName(s.getName());
            std.setRollno(s.getRollno());
            studentRepo.save(std);
        }
        catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }
        return "User successfully updated!";
    }

}
