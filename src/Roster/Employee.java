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
        this.shifts = new int[]{0, 0, 0};
        this.daysOff = new int[]{0, 0, 0, 0, 0, 0, 0};
    }

    public String getName() {
        return this.name;
    }

    public int[] getShifts() {
        return this.shifts;
    }

    public int getDaysOff(int key) {
        for (int i = 0; i < 7; i++) {
            if (daysOff[i] == key) {
                System.out.println(i);
            }
        }
        return daysOff[key];

    }
}
