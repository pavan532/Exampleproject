package com.nit.boot;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentTablerepo extends JpaRepository<Examplestudent, Serializable> {

}
