package edu.iu.lvanjelg.ducksservice.models;

public class Duck {
    public static int id;
    public static type duck;
    public static enum type{
        MALLARD, REDHEAD, RUBBER_DUCK, DECOY_DUCK;
        public String toString() {
            switch(this) {
                case MALLARD: return "Mallard";
                case REDHEAD: return "Redhead";
                case RUBBER_DUCK: return "Rubber Duck";
                case DECOY_DUCK: return "Decoy Duck";
                default: return "unspecified";
            }
        }
    }
    
}
