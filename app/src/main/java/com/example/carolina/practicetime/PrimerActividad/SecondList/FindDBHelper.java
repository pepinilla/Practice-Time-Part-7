package com.example.carolina.practicetime.PrimerActividad.SecondList;

/**
 * Created by carolina on 23/07/17.
 */

public class FindDBHelper {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;



    public FindDBHelper(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(lastName);

        return name + " " + lastName;
    }
}
