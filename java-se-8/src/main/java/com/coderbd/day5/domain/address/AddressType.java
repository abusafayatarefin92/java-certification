package com.coderbd.day5.domain.address;

/**
 *
 * @author Instructor
 */
public class AddressType {
  
    //step-2 field declaration
    private int id;
    private String name;
//step-3 default constructor

    public AddressType() {
    }

    //step-4 Argumentative constructor
    public AddressType(int id, String name) {
        this.id = id;
        this.name = name;
    }
//step-5 getter methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }  
}
