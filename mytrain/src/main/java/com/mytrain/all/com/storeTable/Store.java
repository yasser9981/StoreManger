package com.mytrain.all.com.storeTable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;


@Entity
public class Store {

    @Id
    private String id;

    @NotNull()
    @Size(min = 3, message = "Title must be at least 3 characters long")
    private String name;

    @NotNull()
    private int count;

    private Boolean breakable;

    private Date insertDate;

    public Store() {
        this.insertDate=new Date();
    }

    public Store(String id, @NotNull() @Size(min = 3, message = "Title must be at least 3 characters long") String name, @NotNull() int count, Boolean breakable, Date insertDate) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.breakable = breakable;
        this.insertDate = insertDate;
        this.insertDate=new Date();
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Boolean getBreakable() {
        return breakable;
    }

    public void setBreakable(Boolean breakable) {
        this.breakable = breakable;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
