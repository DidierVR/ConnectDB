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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleObject obj1 = new SimpleObject(0, "obj1", 10.5);
        
        System.out.println(obj1.toString());
        
        String host = "jdbc:derby://localhost:1527/SimpleDB";
        String username = "Didier";
        String password = "eline";
        
        ConnectDB con = new ConnectDB(host, username, password);
        
        String sql = "SELECT * FROM OBJECT";
        ResultSet rs = con.executeSQL(sql);
        
        List<SimpleObject> objList = new ArrayList<SimpleObject>();
        
        try {
        while (rs.next()){
            System.out.println(rs.getInt("ID") + ", " + rs.getString("Name") + ", " + rs.getDouble("Value"));
            objList.add(new SimpleObject(rs.getInt("ID"), rs.getString("Name"), rs.getDouble("Value")));
        }
        } catch (SQLException exc){
            System.out.println("Read from table failed.");
            System.out.println(exc.getMessage());
        }
        
        for (SimpleObject o : objList){
            System.out.println(o.toString());
        }
    }
    
}
