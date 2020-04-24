
package userselect;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class filekoneksi {
    Connection koneksi=null;
    public static Connection koneksiDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection filekoneksi =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/falidasi","root","");
            return filekoneksi;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    } 
}
