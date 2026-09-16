/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 *
 * @author Aleyna
 */
public class helper {

    public static void bosluk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public static void bosluk(String str) {
        String msg;

        switch (str) {
            case "fill":
                msg = "TÜM ALANLARI DOLDURUNUZ! ";
                break;
            default:
                msg = str;
        }
        JOptionPane.showMessageDialog(null, msg, "Mesaj", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void yanlısgiris(String str) {
        String msg;

        switch (str) {
            case "fill":
                msg = " KULLANICI ADI VEYA ŞİFRE HATALI!  ";
                break;
            default:
                msg = str;
        }
        JOptionPane.showMessageDialog(null, msg, "Mesaj", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
