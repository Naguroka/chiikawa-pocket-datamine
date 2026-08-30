package com.bytedance.sdk.openadsdk.tuV;

/* JADX INFO: loaded from: classes4.dex */
public enum eqN {
    TYPE_2G("2g"),
    TYPE_3G(com.json.u8.f3464a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(com.json.u8.b),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private java.lang.String Kg;

    eqN(java.lang.String str) {
        this.Kg = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.Kg;
    }
}
