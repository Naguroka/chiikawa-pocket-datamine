package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class be {
    public static java.lang.String a(java.lang.String str) {
        try {
            return new java.lang.String(android.util.Base64.decode(str, 0), com.adjust.sdk.Constants.ENCODING);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    static java.lang.String b(java.lang.String str) {
        return android.util.Base64.encodeToString(str.getBytes(), 10);
    }
}
