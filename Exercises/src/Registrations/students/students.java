/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registrations.students;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import register.util.MyConnection;

/**
 *
 * @author Arcinue
 */
public class students {

    public static class to_students {

        public final int id;
        public final String fname;
        public final String lname;
        public final String street;
        public final String state;
        public final String city;
        public final int postal_code;
        public final int phone;
        public final int status;
        public final String created_at;
        public final String update_at;
        public final int created_by;
        public final int updated_by;

        public to_students(int id, String fname, String lname, String street, String state, String city, int postal_code, int phone, int status, String created_at, String update_at, int created_by, int updated_by) {
            this.id = id;
            this.fname = fname;
            this.lname = lname;
            this.street = street;
            this.state = state;
            this.city = city;
            this.postal_code = postal_code;
            this.phone = phone;
            this.status = status;
            this.created_at = created_at;
            this.update_at = update_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
        }
    }

    public static void add_data(to_students to_students) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into students("
                    + "fname"
                    + ",lname"
                    + ",street"
                    + ",state"
                    + ",city"
                    + ",postal_code"
                    + ",phone"
                    + ",status"
                    + ",created_at"
                    + ",update_at"
                    + ",created_by"
                    + ",updated_by"
                    + ")values("
                    + ":fname"
                    + ",:lname"
                    + ",:street"
                    + ",:state"
                    + ",:city"
                    + ",:postal_code"
                    + ",:phone"
                    + ",:status"
                    + ",:created_at"
                    + ",:update_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_students.fname)
                    .setString("lname", to_students.lname)
                    .setString("street", to_students.street)
                    .setString("state", to_students.state)
                    .setString("city", to_students.city)
                    .setNumber("postal_code", to_students.postal_code)
                    .setNumber("phone", to_students.phone)
                    .setNumber("status", to_students.status)
                    .setString("created_at", to_students.created_at)
                    .setString("update_at", to_students.update_at)
                    .setNumber("created_by", to_students.created_by)
                    .setNumber("updated_by", to_students.updated_by)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(students.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_students to_students) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update students set "
                    + "fname= :fname "
                    + ",lname= :lname "
                    + ",street= :street "
                    + ",state= :state "
                    + ",city= :city "
                    + ",postal_code= :postal_code "
                    + ",phone= :phone "
                    + ",status= :status "
                    + ",created_at= :created_at "
                    + ",update_at= :update_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + " where id='" + to_students.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_students.fname)
                    .setString("lname", to_students.lname)
                    .setString("street", to_students.street)
                    .setString("state", to_students.state)
                    .setString("city", to_students.city)
                    .setNumber("postal_code", to_students.postal_code)
                    .setNumber("phone", to_students.phone)
                    .setNumber("status", to_students.status)
                    .setString("created_at", to_students.created_at)
                    .setString("update_at", to_students.update_at)
                    .setNumber("created_by", to_students.created_by)
                    .setNumber("updated_by", to_students.updated_by)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(students.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_students to_students) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from students  "
                    + " where id='" + to_students.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(students.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_students> ret_data(String where) {
        List<to_students> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",fname"
                    + ",lname"
                    + ",street"
                    + ",state"
                    + ",city"
                    + ",postal_code"
                    + ",phone"
                    + ",status"
                    + ",created_at"
                    + ",update_at"
                    + ",created_by"
                    + ",updated_by"
                    + " from students"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String fname = rs.getString(2);
                String lname = rs.getString(3);
                String street = rs.getString(4);
                String state = rs.getString(5);
                String city = rs.getString(6);
                int postal_code = rs.getInt(7);
                int phone = rs.getInt(8);
                int status = rs.getInt(9);
                String created_at = rs.getString(10);
                String update_at = rs.getString(11);
                int created_by = rs.getInt(12);
                int updated_by = rs.getInt(13);

                to_students to = new to_students(id, fname, lname, street, state, city, postal_code, phone, status, created_at, update_at, created_by, updated_by);
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
