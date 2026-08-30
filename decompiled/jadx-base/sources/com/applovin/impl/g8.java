package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface g8 extends com.applovin.impl.so {

    public interface b {
        com.applovin.impl.g8[] a(com.applovin.impl.g8.a[] aVarArr, com.applovin.impl.y1 y1Var, com.applovin.impl.ae.a aVar, com.applovin.impl.fo foVar);
    }

    void a(float f);

    default void a(boolean z) {
    }

    void f();

    com.applovin.impl.e9 g();

    int h();

    void i();

    default void j() {
    }

    default void k() {
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.oo f810a;
        public final int[] b;
        public final int c;

        public a(com.applovin.impl.oo ooVar, int... iArr) {
            this(ooVar, iArr, 0);
        }

        public a(com.applovin.impl.oo ooVar, int[] iArr, int i) {
            this.f810a = ooVar;
            this.b = iArr;
            this.c = i;
        }
    }
}
