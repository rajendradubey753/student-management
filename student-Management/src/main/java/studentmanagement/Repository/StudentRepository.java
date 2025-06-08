package studentmanagement.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import studentmanagement.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
        // additional query methods if needed
    }


