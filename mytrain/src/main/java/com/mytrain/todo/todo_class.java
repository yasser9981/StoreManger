package com.mytrain.todo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class todo_class {
    @Id
    private String id;
    private String name;
    private long time;
    public todo_class(){
        this.time=System.currentTimeMillis();
    }
    public todo_class(String  id, String name) {
        this.id = id;
        this.name = name;
        this.time=System.currentTimeMillis();

    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
