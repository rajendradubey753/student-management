package studentmanagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import studentmanagement.Repository.StudentRepository;
import studentmanagement.model.Student;
import java.util.List;

@Component
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student addStudent(Student student) {
        return repository.save(student);
    }

    public Student updateStudent(Long id, Student student) {
        Student existing = repository.findById(id).orElseThrow();
        existing.setName(student.getName());
        existing.setEmail(student.getEmail());
        existing.setCourse(student.getCourse());
        return repository.save(existing);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }

    public Student getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}
