package com.springboot.learning.__EduTrack_Rest_API_Full_CRUD.Entity;

public class BatchEntry
{
    private long id;
    private String name;
    private int fees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}


// it is in Entity package

// It is a virtual Database for storing data
// generating getter setters by using keys alt+Insert and selecting characterstics