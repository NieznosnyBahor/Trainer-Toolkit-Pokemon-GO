/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintenance;

/**
 *
 * @author NB
 */
public abstract class Konsola {
    
    public static void print(String s)
    {
        System.out.println("Message: " + s);
        LogService.addMessage(s);
    }
    public static void printError(String s)
    {
        System.out.println("ERROR!");
        System.out.println(s);
        LogService.addError(s);
    }
    public static void printOther(String s)
    {
        System.out.println("Other message: " + s);
        LogService.addOther(s);
    }
    
}
