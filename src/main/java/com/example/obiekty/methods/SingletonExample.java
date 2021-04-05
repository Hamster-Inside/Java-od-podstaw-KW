package com.example.obiekty.methods;


class DBConnection {


    private static DBConnection instance;

    private DBConnection() {
        System.out.println("Private");
    }
public static DBConnection getInstance(){
        if (instance == null){
            instance = new DBConnection();
        }
        return instance;
}
public void getFromDB(){
    System.out.println("Dane z bazy");
}

}


public class SingletonExample {
    public static void main(String[] args) {
        DBConnection DB = DBConnection.getInstance();
        DBConnection DB2 = DBConnection.getInstance();
        System.out.println(DB + " vs " + DB2);
        DB.getFromDB();
    }
}
