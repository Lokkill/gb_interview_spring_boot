package ru.geekbrains.spring.boot.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring.boot.models.Student;
import ru.geekbrains.spring.boot.repositories.StudentRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService implements Serializable {

    private final StudentRepository studentRepository;

    public Optional<Student> findById(Long id){
        return studentRepository.findById(id);
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }

    public void delete(Student student){
        studentRepository.delete(student);
    }

    public void addOrUpdate(Student student){
        studentRepository.save(student);
    }

}
