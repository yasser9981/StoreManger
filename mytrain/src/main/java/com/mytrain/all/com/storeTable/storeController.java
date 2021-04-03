package com.mytrain.all.com.storeTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping(value = "/api/v1/todos")
public class storeController {

    @Autowired
    private StoreRepository storeRepository;


    @GetMapping(value = {"", "/"})
    public ResponseEntity<List<Store>> getAllTodos() {
        List<Store> result =  storeRepository.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Store> getTodoById(@PathVariable  String id) {
        Store result = (Store) storeRepository.findByUserId(id);
        return new ResponseEntity<>(result, HttpStatus.OK);

    }
    @PostMapping(value = {"", "/"})
    public ResponseEntity<Store> createNewTodo(@Valid @RequestBody Store store) {

        Store result = storeRepository.save(store);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String id) {

        storeRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
