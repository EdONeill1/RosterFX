package Roster;

import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.util.Arrays;

public class Employee extends HBox {
    public String name;
    public int[] shifts = new int[3];
    public int[] daysOff = new int[7];


    public Employee() {
    }

    ;

    public Employee(String name, int[] shifts, int[] daysOff) {
        super(0);
        this.name = name;
        this.shifts = shifts;
        this.daysOff = daysOff;
    }

    public String getName() {
        return this.name;
    }

    public int getShifts(int key) {
        System.out.println("key is : " + key);
        for(int i = 0; i < 3; i++){
            System.out.println("i is");
            if(shifts[i] == key){
                return shifts[i];
            }
        }
        return -1;
    }

    public boolean canWorkShift(int key){
        if(shifts[key] == 1){
            return true;
        }else{
            return false;
        }
    }

    public int getDaysOff() {
        int count = 0;
        System.out.println(this.getName());
        for (int i = 0; i < 7; i++) {
            if (daysOff[i] == 0) {
                count++;
            }
        }
        return count;

    }

    public void setDaysOff(int firstDay, int secondDay) {
        for(int i = 0; i < 7; i++){
            if(i == firstDay || i == secondDay){
                daysOff[i] = 0;
            }
        }

    }
}
