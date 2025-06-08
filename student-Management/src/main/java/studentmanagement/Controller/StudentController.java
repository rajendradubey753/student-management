package studentmanagement.Controller;
//import com.example.student.entity.Student;
//import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import studentmanagement.Service.StudentService;
import studentmanagement.model.Student;

import java.util.List;

    @RestController
    @RequestMapping("/students")
    public class StudentController {

        @Autowired
        private StudentService studentService;

        @PostMapping
        public Student add(@RequestBody Student student) {
            return studentService .addStudent(student);
        }

        @GetMapping
        public List<Student> getAll() {
            return studentService.getAllStudents();
        }

        @GetMapping("/{id}")
        public Student get(@PathVariable Long id) {
            return studentService .getStudentById(id);
        }

        @PutMapping("/{id}")
        public Student update(@PathVariable Long id, @RequestBody Student student) {
            return  studentService .updateStudent(id, student);
        }

        @DeleteMapping("/{id}")
        public String delete(@PathVariable Long id)
        {studentService.deleteStudent(id);
            return "Deleted student with id: " + id;
        }
    }


