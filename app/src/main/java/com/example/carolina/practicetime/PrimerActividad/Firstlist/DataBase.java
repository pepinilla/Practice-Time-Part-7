package com.example.carolina.practicetime.PrimerActividad.Firstlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carolina on 20/07/17.
 */

public class DataBase {


    private volatile static DataBase INSTANCE;
    private List<DataBaseHelper> list;

    private void Info(){

        list = new ArrayList<>();
        list.add(new DataBaseHelper("Diana", "Soto", 23));
        list.add(new DataBaseHelper("Sergio", "Ramirez", 26));
        list.add(new DataBaseHelper("Maritza", "Soto", 40));
        list.add(new DataBaseHelper("Camilo", "Ramirez", 56));
        list.add(new DataBaseHelper("Jack", "Holt", 34));
        list.add(new DataBaseHelper("Daniel", "Zack", 56));
        list.add(new DataBaseHelper("Song", "Ryeuwir", 65));
        list.add(new DataBaseHelper("Carlos", "Montana", 32));
        list.add(new DataBaseHelper("Pedro", "Ramirez", 13));
        list.add(new DataBaseHelper("Aleja", "Perez", 67));
    }

    public List<DataBaseHelper> getList() {
        if (list == null){
            Info();
        }

        return list;
    }

    public static DataBase getINSTANCE(){
        DataBase localInstance = INSTANCE;
        if (localInstance == null){
            synchronized (DataBase.class){
                localInstance = INSTANCE;
                if (localInstance == null){
                    localInstance = INSTANCE = new DataBase();
                }
            }
        }
        return localInstance;
    }


}
