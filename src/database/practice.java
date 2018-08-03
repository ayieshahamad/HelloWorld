package database;

import java.sql.*;

public class practice {

        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost:3306/";

        //  Database credentials
        static final String USER = "root";
        static final String PASS = "Ayesha1234?";

        public static void main(String[] args) {
            Connection conn = null;
            Statement stmt = null;
            try{
                //STEP 2: Register JDBC driver
                System.out.println("ok");
                Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.cj.jdbc.Driver//com.mysql.jdbc.Driver (previous)
                System.out.println("ok");
                //STEP 3: Open a connection
                System.out.println("Connecting to database...");
                conn = DriverManager.getConnection(DB_URL, USER, PASS);

                //STEP 4: Execute a query
                System.out.println("Creating database...");
                stmt = conn.createStatement();
                //SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = 'DBName'
                //String sql = "SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = 'STUDENTSHKKK'";//"CREATE DATABASE IF NOT EXISTS STUDENTS";

                //String sql = "CREATE DATABASE IF NOT EXISTS STUDENTS123";
                //stmt.executeUpdate(sql);

                //ResultSet resultSet =  stmt.executeQuery(sql);

                /*if(resultSet.wasNull() == true)
                    System.out.println("null");
                else
                    System.out.println("not null");*/
                ResultSet resultSet = conn.getMetaData().getCatalogs();

                //iterate each catalog in the ResultSet
                while (resultSet.next()) {
                    // Get the database name, which is at position 1
                    String databaseName = resultSet.getString(1);
                    System.out.println(databaseName);
                    if(databaseName.equals("students") ){
                        System.out.println("exists");
                    }
                }
                resultSet.close();

                System.out.println("Database created successfully...");
            }catch(SQLException se){
                //Handle errors for JDBC
                se.printStackTrace();
            }catch(Exception e){
                //Handle errors for Class.forName
                e.printStackTrace();
            }finally{
                //finally block used to close resources
                try{
                    if(stmt!=null)
                        stmt.close();

                }catch(SQLException se2){
                }// nothing we can do
                try{
                    if(conn!=null)
                        conn.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }//end finally tryl2
            }//end try
            System.out.println("Goodbye!");
        }//end main

}
