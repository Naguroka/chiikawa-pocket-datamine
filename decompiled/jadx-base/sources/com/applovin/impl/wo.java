package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class wo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1476a;
    public final com.applovin.impl.si[] b;
    public final com.applovin.impl.g8[] c;
    public final java.lang.Object d;

    public wo(com.applovin.impl.si[] siVarArr, com.applovin.impl.g8[] g8VarArr, java.lang.Object obj) {
        this.b = siVarArr;
        this.c = (com.applovin.impl.g8[]) g8VarArr.clone();
        this.d = obj;
        this.f1476a = siVarArr.length;
    }

    public boolean a(com.applovin.impl.wo woVar) {
        if (woVar == null || woVar.c.length != this.c.length) {
            return false;
        }
        for (int i = 0; i < this.c.length; i++) {
            if (!a(woVar, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(com.applovin.impl.wo woVar, int i) {
        return woVar != null && com.applovin.impl.xp.a(this.b[i], woVar.b[i]) && com.applovin.impl.xp.a(this.c[i], woVar.c[i]);
    }

    public boolean a(int i) {
        return this.b[i] != null;
    }
}
