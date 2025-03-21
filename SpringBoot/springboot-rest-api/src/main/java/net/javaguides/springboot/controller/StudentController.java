package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    //http://localhost:8080/student
    @GetMapping("student")
    public ResponseEntity<Student> getStudent(){
        Student student  = new Student(
                1,
                "Andre",
                "Mugabo"
    );
        //return new ResponseEntity<>(student, HttpStatus.OK);
        //return ResponseEntity.ok(student);
        return ResponseEntity.ok()
                .header("custom-header","Andre")
                .body(student);
    }


    //http://localhost:8080/students
    @GetMapping("students")
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Mugabo","Andre"));
        students.add(new Student(2,"umesh","Fadatare"));
        students.add(new Student(3,"Ram","Jadhav"));
        students.add(new Student(4,"Sanjay","Pawar"));

        //return students;
        return ResponseEntity.ok(students);
    }


    //Spring BOOT REST API with Path Variable
    //{id} - URI template variable
    //http://localhost:8080/students/1/Andre/Mugabo
    @GetMapping("students/{id}/{first-name}/{last-name}")
    public ResponseEntity<Student> studentPathVariable(@PathVariable("id") int studentId,
                                                       @PathVariable("first-name") String firstName,
                                                       @PathVariable("last-name") String lastName){
       // return new Student(studentId, firstName,lastName);
        Student student = new Student(studentId,firstName,lastName);
        return ResponseEntity.ok(student);

    }



    // Spring boot REST API Request Param
    // http://localhost:8080/students/query?id=1&firstName=Ramesh&lastName=Fadatare
    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName){
        return  new Student(id,firstName,lastName);
    }

    //Spring Boot Rest Api that handle Request - CREATING NEW RESOURCE
    //@PostMapping and @RequestBody
    //http://localhost:8080/students/create
    @PostMapping("students/create")
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }


    // Spring boot REST API handles http put REQUEST - updating existing resource
    //http://localhost:8080/students/1/update
    @PutMapping("students/{id}/update")
    public Student updateStudent(@RequestBody Student student,@PathVariable("id") int studentId){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }
    //Spring boot RESP API that handles HTTP DELETE REQUEST - deleting the existing resource
    //http://localhost:8080/students/1/delete
    @DeleteMapping("students/{id}/delete")
    public String deleteStudent(@PathVariable("id") int studentId){
        System.out.println(studentId);
        return "Student deleted successfully !";
    }

}
