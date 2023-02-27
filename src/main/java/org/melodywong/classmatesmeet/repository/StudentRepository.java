package org.melodywong.classmatesmeet.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.melodywong.classmatesmeet.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}
