package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class we {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.we.a f1465a;
    private java.lang.String b;

    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    private we(com.applovin.impl.we.a aVar, java.lang.String str) {
        this.f1465a = aVar;
        this.b = str;
    }

    public com.applovin.impl.we.a a() {
        return this.f1465a;
    }

    public java.lang.String b() {
        return this.b;
    }

    public static com.applovin.impl.we a(com.applovin.impl.fe feVar) {
        java.lang.String strR = feVar.R();
        if (android.text.TextUtils.isEmpty(strR)) {
            return null;
        }
        return new com.applovin.impl.we(com.applovin.impl.we.a.AD, strR);
    }

    public static com.applovin.impl.we a(com.applovin.mediation.MaxAdFormat maxAdFormat) {
        java.lang.String label = maxAdFormat.getLabel();
        if (android.text.TextUtils.isEmpty(label)) {
            return null;
        }
        return new com.applovin.impl.we(com.applovin.impl.we.a.AD_FORMAT, label);
    }

    public static com.applovin.impl.we a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return new com.applovin.impl.we(com.applovin.impl.we.a.AD_UNIT_ID, str);
    }
}
