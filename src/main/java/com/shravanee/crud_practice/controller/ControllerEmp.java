package com.shravanee.crud_practice.controller;

import com.shravanee.crud_practice.model.Student;
import com.shravanee.crud_practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ControllerEmp
{
        @Autowired
        private StudentService service;

        @GetMapping
        public List<Student> getAll() { return service.getAll(); }

        @PostMapping
        public Student create(@RequestBody Student s) { return service.save(s); }

        @PutMapping("/{id}")
        public Student update(@PathVariable Long id, @RequestBody Student s) {
            return service.update(id, s);
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id) { service.delete(id); }
    }

