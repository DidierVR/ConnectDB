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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ConnectDB {
    private Connection con;

    public ConnectDB(String host, String username, String password) {
        try {
            this.con = DriverManager.getConnection(host, username, password);
        } catch (SQLException exc) {
            System.out.println("Connection to database failed.");
            System.out.println(exc.getMessage());
        }
    }

    public ResultSet executeSQL(String sql) {
        try {
            Statement stmt = this.con.createStatement();
            return stmt.executeQuery(sql);
        } catch (SQLException exc) {
            System.out.println("ExecuteSQL failed.");
            System.out.println(exc.getMessage());
        }
        return null;
    }

}
