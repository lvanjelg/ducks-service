package edu.iu.lvanjelg.ducksservice.test;

import edu.iu.lvanjelg.ducksservice.controllers.DucksController;
import edu.iu.lvanjelg.ducksservice.models.Duck;
import edu.iu.lvanjelg.ducksservice.repository.DucksRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class DucksRepTest {
    @Test
    public void addDuckTest1(){
        Duck d = new Duck();
        d.setId(2);
        d.setDuckType(Duck.type.REDHEAD);
        assertTrue(DucksRepository.addDuck(d));
        assertEquals(Duck.type.REDHEAD, DucksRepository.getDuck(2).getDuckType());
    }
    @Test
    public void addDuckTest2(){
        Duck d = new Duck();
        d.setId(3);
        d.setDuckType(Duck.type.RUBBER_DUCK);
        assertTrue(DucksRepository.addDuck(d));
        assertNotEquals(Duck.type.REDHEAD, DucksRepository.getDuck(3).getDuckType());
    }
    @Test
    public void getDuckTest(){
        Duck d = new Duck();
        d.setId(5);
        d.setDuckType(Duck.type.REDHEAD);
        assertTrue(DucksRepository.addDuck(d));
        assertEquals(Duck.type.REDHEAD, DucksRepository.getDuck(5).getDuckType());
        assertNull(DucksRepository.getDuck(4));
    }
    @Test
    public void searchTest(){
        Duck d = new Duck();
        d.setId(6);
        d.setDuckType(Duck.type.REDHEAD);
        assertTrue(DucksRepository.addDuck(d));
        assertEquals(3, DucksRepository.search(Duck.type.REDHEAD).size());
        assertEquals(0, DucksRepository.search(Duck.type.MALLARD).size());
    }
    @Test
    public void getAllDuckTest(){
        assertEquals(4, DucksRepository.getAllDuck().size());
        DucksRepository.ducks = new ArrayList<Duck>();
        Duck d = new Duck();
        d.setId(3);
        d.setDuckType(Duck.type.RUBBER_DUCK);
        Duck c = new Duck();
        c.setId(2);
        c.setDuckType(Duck.type.DECOY_DUCK);
        DucksRepository.addDuck(d);
        DucksRepository.addDuck(c);
        assertEquals(2, DucksRepository.getAllDuck().size());
    }
}
