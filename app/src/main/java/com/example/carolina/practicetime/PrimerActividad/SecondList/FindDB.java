package com.example.carolina.practicetime.PrimerActividad.SecondList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by carolina on 23/07/17.
 */

public class FindDB {



    HashMap<String, Object> hashMap = new HashMap<String, Object>();

    private static volatile FindDB INSTANCE;

    public FindDB(){
        FindDBHelper a = new FindDBHelper("Diana", "Soto");
        FindDBHelper b = new FindDBHelper("Maritza", "Soto");
        FindDBHelper c = new FindDBHelper("Sergio", "Ramirez");
        FindDBHelper d = new FindDBHelper("Camilo", "Ramirez");
        FindDBHelper e = new FindDBHelper("Jack", "Holt");
        FindDBHelper f = new FindDBHelper("Daniel", "Zack");
        FindDBHelper g = new FindDBHelper("Song", "Ryeuwir");
        FindDBHelper h = new FindDBHelper("Carlos", "Montana");
        FindDBHelper i = new FindDBHelper("Pedro", "Ramirez");
        FindDBHelper j = new FindDBHelper("Aleja", "Perez");

        add(a);
        add(b);
        add(c);
        add(e);
        add(f);
        add(g);
        add(h);
        add(i);
        add(j);

    }

    public static FindDB getINSTANCE(){
        FindDB localinstance = INSTANCE;
        if (localinstance == null){
            synchronized (FindDB.class){
               localinstance = INSTANCE;
                if (localinstance == null){
                    localinstance = INSTANCE = new FindDB();
                }
            }
        }
        return localinstance;
    }

    public void add (FindDBHelper findDBHelper){
        hashMap.put(findDBHelper.getName(), findDBHelper);
    }

    public Map<String, Object> getHashMap() {
        return hashMap;
    }

    public List<String> getKeyList(){
        return Arrays.asList(hashMap.keySet().toArray(new String [0]));
    }

    public List<FindDBHelper> getValuesList() {
        return Arrays.asList(hashMap.values().toArray(new FindDBHelper [0]));
    }
}
