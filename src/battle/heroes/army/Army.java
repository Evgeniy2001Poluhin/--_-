package com.battle.heroes.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Unit> units;
    private int points;

    public Army() {
        this.units = new ArrayList<>();
        this.points = 0;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
} 