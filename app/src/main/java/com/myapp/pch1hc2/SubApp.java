package com.myapp.pch1hc2;

import android.app.Application;

public class SubApp extends Application {
    public  String DB_PATH= "/data/data/com.myapp.pch1hc2/databases/";
    public  String DATABASE_NAME = "db_hat_giong_tam_hon.db";

    public TruyenPGDB getTruyenPhatGiaoDB(){
        return TruyenPGDB.getInstance(this,DB_PATH,DATABASE_NAME);
    }
}
