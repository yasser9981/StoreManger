package com.mytrain.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface todorepository extends JpaRepository<todo_class,String> {



}
