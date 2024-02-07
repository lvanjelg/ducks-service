package edu.iu.lvanjelg.ducksservice.repository;

import edu.iu.lvanjelg.ducksservice.models.Duck;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DucksRepository {
    private static ArrayList<Duck> ducks = new ArrayList<>();
    public static boolean addDuck(){
        Duck d = new Duck();
        d.setId(1);
        d.setDuck(Duck.type.MALLARD);
        ducks.add(d);
        return true;
    }
    public static Duck getDuck(int id){
        for(int i = 0; i < ducks.size(); i++){
            if(ducks.get(i).getId() == id){
                return ducks.get(i);
            }
        }
        return null;
    }
    public static ArrayList<Duck> getAllDuck(){
        return ducks;
    }
    public static Duck search(Duck.type t){
        for(int i = 0; i < ducks.size(); i++){
            if(ducks.get(i).getDuck() == t){
                return ducks.get(i);
            }
        }
        return null;
    }
    public static boolean uploadImage(){
        return true;
    }
    public static String downloadImage(){

    }
    public static boolean uploadAudio(){
        return true;
    }
    public static String downloadAudio(){

    }
}
