package com.mytrain.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "api/val")
public class todo_controller {
    @Autowired
    private todo_service ser;
    @GetMapping(value = {"","/"})
    public List<todo_class> getAll(){
        return ser.get_all();
    }
    @GetMapping(value = "/{id}")
    public todo_class get_by_id(@PathVariable String id){
        todo_class ret=ser.get_by_id(id);
        if(ret==null) return new todo_class("-1","null");
        else return ret;
    }
    @PostMapping(value = {"","/"})
    public todo_class create_todo(@RequestBody todo_class tmp){
        if(ser.save(tmp))return tmp;
        else return new todo_class("-1","-1");
    }
    @DeleteMapping(value = "/{id}")
    public void delete_todo(@PathVariable String id){
        ser.delete_todo(id);
    }



}
