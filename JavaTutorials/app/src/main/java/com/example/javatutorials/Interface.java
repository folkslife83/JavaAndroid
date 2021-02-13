package com.example.javatutorials;

class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator{
    public String getFood(){
        return "apple";
    }

}
class Lion extends Animal implements Predator {
    public String getFood(){
        return "banana";
    }

}

interface Predator {
    public String getFood();
}

class ZooKeeper {
    public void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}

