/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teachers.myteachers;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import teachers.util.MyConnection;

public class myteachers {
    
    public static class to_myteachers {
        
        public final int id;
        public final String lastname;
        public final String middlename;
        public final String firstname;
        public final int age;
        public final int phoneno;
        public final String created_at;
        public final String updated_at;
        public final int created_by;
        public final int updated_by;
        public final int status;
        
        public to_myteachers(int id, String lastname, String middlename, String firstname, int age, int phoneno, String created_at, String updated_at, int created_by, int updated_by, int status) {
            this.id = id;
            this.lastname = lastname;
            this.middlename = middlename;
            this.firstname = firstname;
            this.age = age;
            this.phoneno = phoneno;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
        }
    }

    public static void add_data(to_myteachers to_myteachers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into myteachers("
                    + "lastname"
                    + ",middlename"
                    + ",firstname"
                    + ",age"
                    + ",phoneno"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ")values("
                    + ":lastname"
                    + ",:middlename"
                    + ",:firstname"
                    + ",:age"
                    + ",:phoneno"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ")";
            
            s0 = SqlStringUtil.parse(s0)
                    .setString("lastname", to_myteachers.lastname)
                    .setString("middlename", to_myteachers.middlename)
                    .setString("firstname", to_myteachers.firstname)
                    .setNumber("age", to_myteachers.age)
                    .setNumber("phoneno", to_myteachers.phoneno)
                    .setString("created_at", to_myteachers.created_at)
                    .setString("updated_at", to_myteachers.updated_at)
                    .setNumber("created_by", to_myteachers.created_by)
                    .setNumber("updated_by", to_myteachers.updated_by)
                    .setNumber("status", to_myteachers.status)
                    .ok();
            
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(myteachers.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
    
    public static void update_data(to_myteachers to_myteachers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update myteachers set "
                    + "lastname= :lastname "
                    + ",middlename= :middlename "
                    + ",firstname= :firstname "
                    + ",age= :age "
                    + ",phoneno= :phoneno "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + " where id='" + to_myteachers.id + "' "
                    + " ";
            
            s0 = SqlStringUtil.parse(s0)
                    .setString("lastname", to_myteachers.lastname)
                    .setString("middlename", to_myteachers.middlename)
                    .setString("firstname", to_myteachers.firstname)
                    .setNumber("age", to_myteachers.age)
                    .setNumber("phoneno", to_myteachers.phoneno)
                    .setString("created_at", to_myteachers.created_at)
                    .setString("updated_at", to_myteachers.updated_at)
                    .setNumber("created_by", to_myteachers.created_by)
                    .setNumber("updated_by", to_myteachers.updated_by)
                    .setNumber("status", to_myteachers.status)
                    .ok();
            
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(myteachers.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_myteachers to_myteachers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from myteachers  "
                    + " where id='" + to_myteachers.id + "' "
                    + " ";
            
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(myteachers.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
    
    public static List<to_myteachers> ret_data(String where) {
        List<to_myteachers> datas = new ArrayList();
        
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",lastname"
                    + ",middlename"
                    + ",firstname"
                    + ",age"
                    + ",phoneno"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + " from myteachers"
                    + " " + where;
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String lastname = rs.getString(2);
                String middlename = rs.getString(3);
                String firstname = rs.getString(4);
                int age = rs.getInt(5);
                int phoneno = rs.getInt(6);
                String created_at = rs.getString(7);
                String updated_at = rs.getString(8);
                int created_by = rs.getInt(9);
                int updated_by = rs.getInt(10);
                int status = rs.getInt(11);
                
                to_myteachers to = new to_myteachers(id, lastname, middlename, firstname, age, phoneno, created_at, updated_at, created_by, updated_by, status);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
    
}
