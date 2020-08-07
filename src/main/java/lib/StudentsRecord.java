package main.java.lib;

import main.java.util.*;

/**
 *
 * @author Jedy Matt
 */
public class StudentsRecord {

    private PropertyLoader p;
    private Activity[] act;

    public StudentsRecord(PropertyLoader p, int numStudents) {
        this.p = p;
        act = new Activity[numStudents];
        for (int i = 0; i < act.length; i++) {
            act[i] = new Activity();
        }
    }
}
