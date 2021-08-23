package ru.geekbrains.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.spring.boot.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
