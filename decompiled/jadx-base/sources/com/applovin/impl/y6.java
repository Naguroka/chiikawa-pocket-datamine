package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface y6 {
    void a(com.applovin.impl.z6.a aVar);

    boolean a(java.lang.String str);

    int b();

    void b(com.applovin.impl.z6.a aVar);

    boolean c();

    java.util.Map d();

    java.util.UUID e();

    com.applovin.impl.y4 f();

    com.applovin.impl.y6.a getError();

    static void a(com.applovin.impl.y6 y6Var, com.applovin.impl.y6 y6Var2) {
        if (y6Var == y6Var2) {
            return;
        }
        if (y6Var2 != null) {
            y6Var2.b(null);
        }
        if (y6Var != null) {
            y6Var.a((com.applovin.impl.z6.a) null);
        }
    }

    public static class a extends java.io.IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1531a;

        public a(java.lang.Throwable th, int i) {
            super(th);
            this.f1531a = i;
        }
    }
}
