package com.example.carolina.practicetime.TerceraActividad;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


/**
 * Created by carolina on 24/07/17.
 */

public class Data3 {

    HashMap<String, Object> hashMap = new HashMap<String, Object>();

    public static  volatile Data3 INSTANCE;

    public void getData(){
        DataHelper3 a = new DataHelper3("Pizza", "Monkey", "Bogota");
        DataHelper3 b = new DataHelper3("Pan", "Horse", "Milan");
        DataHelper3 c = new DataHelper3("Apple", "Dog", "Madrid");
        DataHelper3 d = new DataHelper3("Manzana", "Cat", "Cucuta");
        DataHelper3 e = new DataHelper3("Pina", "Bear", "Vancouver");
        DataHelper3 g = new DataHelper3("Durazno", "Bee", "Edmonton");
        DataHelper3 f = new DataHelper3("Banano", "Donkey", "Medellin");
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(g);
        add(f);
    }

    public static Data3 getINSTANCE(){
        Data3 localinstance = INSTANCE;
        if (localinstance == null){
            synchronized (Data3.class){
                localinstance=INSTANCE;
                if (localinstance == null){
                    localinstance = INSTANCE = new Data3();
                }
            }

        }
        return localinstance;
    }

    public List <Data3>getList(){
        return Arrays.asList(hashMap.values().toArray(new Data3[0]));
    }

    private void add (DataHelper3 dataHelper3){
        hashMap.put(dataHelper3.getAnimal(), dataHelper3);
    }

}
