package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.HashMap<java.lang.String, java.lang.Object> f2535a = new java.util.HashMap<>();

    public com.json.bh a(java.lang.String str, java.lang.Object obj) {
        if (obj != null) {
            this.f2535a.put(str, com.json.sdk.utils.SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }

    public java.util.HashMap<java.lang.String, java.lang.Object> a() {
        return this.f2535a;
    }
}
