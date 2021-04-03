package com.mytrain.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class todo_service {
    @Autowired
    private todorepository data;
    public todo_class get_by_id(String id){

        return data.findById(id).get();
    }

    public List<todo_class> get_all() {
        return data.findAll();
    }
    public boolean save(todo_class t){
        return data.save(t)!=null;
    }
    public void delete_todo(String id){
        data.deleteById(id);
    }

}
