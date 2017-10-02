package com.challenge.dicegame;

import java.util.ArrayList;
import java.util.List;

public class Cup {

    List<Die> dieList = new ArrayList<>();

    public Cup() {}

    public List<Die> getDieList() {
        return dieList;
    }

    public void setDieList(List<Die> dieList) {
        this.dieList = dieList;
    }

}
