package com.bytedance.sdk.openadsdk.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class xxp extends com.bytedance.sdk.openadsdk.eqN.eqN {
    public static java.lang.String bX() {
        return "CREATE TABLE IF NOT EXISTS adevent_applog (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0, channel INTEGER default 0)";
    }
}
