package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface ri {
    static int a(int i, int i2, int i3) {
        return i | i2 | i3;
    }

    static int c(int i) {
        return i & 32;
    }

    static int d(int i) {
        return i & 7;
    }

    int a(com.applovin.impl.e9 e9Var);

    int e();

    java.lang.String getName();

    int m();

    static int a(int i) {
        return a(i, 0, 0);
    }
}
