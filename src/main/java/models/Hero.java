package models;

import java.util.ArrayList;
import java.util.Objects;

public class Hero {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return age == hero.age &&
                id == hero.id &&
                Objects.equals(name, hero.name) &&
                Objects.equals(power, hero.power) &&
                Objects.equals(weakness, hero.weakness);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, power, weakness, id);
    }

    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, int age, String power, String weakness){

        this.name=name;
        this.age =age;
        this.power=power;
        this.weakness=weakness;
        instances.add(this);
        this.id = instances.size();
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static ArrayList<Hero>getAll(){
        return instances;
    }

    public static Hero findById(int id){

        return instances.get(id-1);
    }

    public void update(String name, int age,String power,String weakness){
        this.name =name;
        this.age=age;
        this.power= power;
        this.weakness=weakness;
        this.id = instances.size();
    }

    public String getPower(){
        return power;
    };
    public String getWeakness(){
        return weakness;
    }

    public int getId(){
        return id;
    }

    public static void clearAllHero() {
        instances.clear();// clear as a method is part of the ArrayList class.
    }
}
