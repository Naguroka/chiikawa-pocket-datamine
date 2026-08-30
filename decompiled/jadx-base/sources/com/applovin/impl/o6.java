package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1112a;
    private final java.lang.String b;
    private final boolean c;

    o6(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        this.f1112a = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "name", "");
        this.b = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "description", "");
        java.util.List list = com.applovin.impl.sdk.utils.JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.c = com.applovin.impl.yp.a(list);
        } else {
            this.c = com.applovin.impl.yp.a(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public java.lang.String b() {
        return this.f1112a;
    }

    public java.lang.String a() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public static boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || com.applovin.impl.yp.a(str2, str) != 1) {
            return str3 == null || com.applovin.impl.yp.a(str3, str) != -1;
        }
        return false;
    }
}
