package com.example.carolina.practicetime.TerceraActividad;

/**
 * Created by carolina on 24/07/17.
 */

public class DataHelper3 {
    private String food;
    private String animal;
    private String place;

    public DataHelper3(String food, String animal, String place) {
        this.food = food;
        this.animal = animal;
        this.place = place;
    }



    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(food);
        builder.append(animal);
        builder.append(place);

        return "Food: " + food + "\n" + "Animal: " + animal + "\n" + "Place: " + place + "\n";
    }
}
