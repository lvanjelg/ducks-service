package edu.iu.lvanjelg.ducksservice.repository;

import edu.iu.lvanjelg.ducksservice.models.Duck;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DucksRepository {
    private static final String IMAGES_FOLDER_PATH = "ducks/images";
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
    public boolean uploadImage(int id, MultipartFile file) throws IOException {
        String fileExtension = ".png";
        Path path = Paths.get(IMAGES_FOLDER_PATH + id + fileExtension);
        file.transferTo(path);
        return true;
    }
    public static byte[] downloadImage(int id) throws IOException {
        String fileExtension = ".png";
        Path path = Paths.get(IMAGES_FOLDER_PATH + id + fileExtension);
        byte[] image = Files.readAllBytes(path);
        return image;
    }
    public static boolean uploadAudio(){
        return true;
    }
    public static String downloadAudio(){
        return "";
    }
}
