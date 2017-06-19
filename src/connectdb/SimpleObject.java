/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectdb;

/**
 *
 * @author Didier
 */
public class SimpleObject {
    private int ID;
    private String name;
    private double value;

    public SimpleObject(int ID, String name, double value) {
        this.ID = ID;
        this.name = name;
        this.value = value;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "SimpleObject{" + "ID=" + ID + ", name=" + name + ", value=" + value + '}';
    }
}
