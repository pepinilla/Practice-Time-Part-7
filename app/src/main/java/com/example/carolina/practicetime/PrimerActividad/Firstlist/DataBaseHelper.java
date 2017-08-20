package com.example.carolina.practicetime.PrimerActividad.Firstlist;

/**
 * Created by carolina on 20/07/17.
 */

public class DataBaseHelper {


    private String name;
    private String lastname;
    private int age;
    private String information;



    public DataBaseHelper(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public DataBaseHelper() {

    }

    public String getInformation() {
        return information;
    }
    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append(name);
        info.append(lastname);
        info.append(age);
        return "Name: " + name + "\n" + "Last Name: " + lastname + "\n" + "Age: " + age;
    }
}
