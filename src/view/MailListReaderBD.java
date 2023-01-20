package view;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MailListReaderBD {
    private List<String> list;
    public MailListReaderBD() {
        this.list = new ArrayList<>();
    }

    private Connection connect() {
        String url = "jdbc:sqlite:Kata5.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public List<String> read() throws SQLException {
        String sql = "select * from EMAIL";
        Connection conn = this.connect();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            this.list.add(rs.getString("Mail"));
        }
        System.out.println("Se han recuperado " + this.list.size() + " elementos.");
        return list;
    }
}
