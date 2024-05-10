package org.pignated;

import java.io.Serializable;

/**
 * Represents a card in the game of Magic: The Gathering.
 */
public class Card implements Serializable {
    private String name;
    private String set;
    private String id;
    private String power;
    private String toughness;
    private String[] multiverse_ids;
    public Card() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    @Override
    public String toString() {
        try {
            return "Card{"
                    + "name='" + name + '\''
                    + ", setId='" + set + '\''
                    + ", id='" + id + '\''
                    + ", power='" + power + '\''
                    + ", toughness='" + toughness + '\''
                    + ", multiverse_id=" + multiverse_ids[0] + '\''
                    + '}';
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Card{"
                    + "name='" + name + '\''
                    + ", setId='" + set + '\''
                    + ", id='" + id + '\''
                    + ", power='" + power + '\''
                    + ", toughness='" + toughness + '\''
                    + '}';
        }
    }
}
