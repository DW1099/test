package com.example.vhrmodel;

import java.io.Serializable;
import java.util.Objects;

public class Nation implements Serializable {

    private Integer id;

    private String name;

    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if (o==null||getClass()!=o.getClass()) return false;
        Nation nation=(Nation) o;
        return Objects.equals(name,nation.name);
    }

    public Nation(){

    }

    public Nation(String name){
        this.name=name;
    }

    @Override
    public int hashCode(){

        return Objects.hash(name);
    }




}
