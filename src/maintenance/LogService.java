/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintenance;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NB
 */
public abstract class LogService {

    static List<LogRecord> logs = new ArrayList<LogRecord>();

    public static void start() {

    }

    public static void addMessage(String s) {
        logs.add(new LogRecord('m', s));
    }
    public static void addError(String s) {
        logs.add(new LogRecord('e', s));
    }
    public static void addOther(String s) {
        logs.add(new LogRecord('o', s));
    }
    

    //public static void 
    public static void showLogs() {
        for (int a = 0; a < logs.size(); a ++)
        {
            logs.get(a).showRecord();
        }
    }
}
