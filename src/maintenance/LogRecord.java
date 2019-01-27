/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintenance;

import java.util.Date;

/**
 *
 * @author NB
 */
public class LogRecord {
    Date date;
    String content;
    char type;
    //
    // m - message/info
    // e - error
    // o - other
    //
    
    
    public LogRecord(char type, String c)
    {
        this.date = new Date();
        this.content = c;
        this.type = type;
    }
    
    void showRecord()
    {
        switch(type)
        {    case 'm':
                System.out.println("Message :: " + date + " :: " + content);
                break;
            case 'e':
                System.out.println("ERROR :: " + date + " :: " + content);
                break;
            case 'o':
                System.out.println("Other :: " + date + " :: " + content);
                break;
            default:
                break;
        }
    }
    
}
