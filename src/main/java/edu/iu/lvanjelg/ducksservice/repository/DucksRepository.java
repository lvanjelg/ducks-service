package edu.iu.lvanjelg.ducksservice.repository;

import edu.iu.lvanjelg.ducksservice.models.Duck;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DucksRepository {
    public static ArrayList<Duck> ducks = new ArrayList<>();
    public static boolean addDuck(Duck d){
        ducks.add(d);
        return true;
    }
    public static Duck getDuck(int id){
        for(int i = 0; i < ducks.size(); i++){
            if(ducks.get(i) == null){
                return null;
            }else if(ducks.get(i).getId() == id){
                return ducks.get(i);
            }
        }
        return null;
    }
    public static ArrayList<Duck> getAllDuck(){
        return ducks;
    }
    public static ArrayList<Duck> search(Duck.type t){
        ArrayList<Duck> dList = new ArrayList<>();
        for(int i = 0; i < ducks.size(); i++){
            if(ducks.get(i).getDuckType() == t){
                dList.add(ducks.get(i));
            }
        }
        return dList;
    }
    public static boolean uploadImage(){
        return true;
    }
    public static String downloadImage(){
        return "";
    }
    public static boolean uploadAudio(){
        return true;
    }
    public static String downloadAudio(){
        return "";
    }
}
