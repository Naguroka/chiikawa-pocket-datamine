package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.qo f1513a;

    protected abstract boolean a(com.applovin.impl.ah ahVar);

    protected abstract boolean b(com.applovin.impl.ah ahVar, long j);

    public static final class a extends com.applovin.impl.ch {
        public a(java.lang.String str) {
            super(str, null, false, 1);
        }
    }

    protected xl(com.applovin.impl.qo qoVar) {
        this.f1513a = qoVar;
    }

    public final boolean a(com.applovin.impl.ah ahVar, long j) {
        return a(ahVar) && b(ahVar, j);
    }
}
