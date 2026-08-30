package com.bytedance.sdk.openadsdk.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class yDt {
    public static java.lang.String IL() {
        return "ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0";
    }

    public static java.lang.String bg() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)";
    }
}
