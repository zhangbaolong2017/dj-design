package com.zbl.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class ConnectionPool {

    private Vector<Connection> pool;

    private static final String url = "jdbc:mysql://localhost:3306/test";

    private static final String user = "user";

    private static final String pass = "pass";

    private static final String driverClassName = "com.mysql.jdbc.Driver";

    private int poolSize = 100;

    private static ConnectionPool instance = null;


    public ConnectionPool() {
        this.pool = new Vector<Connection>(poolSize);

        for(int i = 0;i<poolSize;i++){
            try{
                Class.forName(driverClassName);
                Connection connection = DriverManager.getConnection(url,user,pass);
                pool.add(connection);
            }catch (Exception e){
                //todo

            }
        }
    }

    public synchronized void release(Connection connection){
        pool.add(connection);
    }

    public synchronized Connection getConnection(){
        if(pool.size()>0){
            Connection connection = pool.get(0);
            pool.remove(connection);
            return connection;
        }
        return null;
    }

}
