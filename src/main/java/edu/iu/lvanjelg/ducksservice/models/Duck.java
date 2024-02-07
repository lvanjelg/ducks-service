package edu.iu.lvanjelg.ducksservice.models;

public class Duck {
    private static int id;
    private static type duck;
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
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public type getDuckType() {
        return this.duck;
    }

    public void setDuckType(type duck) {
        this.duck = duck;
    }
}
