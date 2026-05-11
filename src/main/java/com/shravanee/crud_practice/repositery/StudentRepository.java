package com.shravanee.crud_practice.repositery;

import com.shravanee.crud_practice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
