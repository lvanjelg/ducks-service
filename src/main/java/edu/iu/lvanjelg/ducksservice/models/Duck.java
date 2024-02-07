package edu.iu.lvanjelg.ducksservice.models;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
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
    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    public String toString(){
        return String.format("%1$s,%2$s", getId(), getDuckType());
    }
}
