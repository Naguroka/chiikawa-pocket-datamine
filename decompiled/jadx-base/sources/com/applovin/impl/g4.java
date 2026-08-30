package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g4 {
    public static java.util.List c(com.applovin.impl.sdk.j jVar) {
        if (jVar.u().j()) {
            return com.applovin.impl.n4.c(jVar);
        }
        return null;
    }

    public static java.util.List a(com.applovin.impl.sdk.j jVar) {
        if (!jVar.u().j()) {
            return null;
        }
        boolean zR0 = jVar.r0();
        java.lang.Boolean bool = (java.lang.Boolean) jVar.a(com.applovin.impl.uj.o, java.lang.Boolean.FALSE);
        if (zR0) {
            if (bool.booleanValue()) {
                return b(jVar);
            }
            return null;
        }
        return b(jVar);
    }

    private static java.util.List b(com.applovin.impl.sdk.j jVar) {
        if (jVar.u().h() != null) {
            return com.applovin.impl.n4.b(jVar);
        }
        return com.applovin.impl.n4.a(jVar);
    }
}
