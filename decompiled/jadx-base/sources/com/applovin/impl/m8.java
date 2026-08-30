package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m8 {
    public static void a(boolean z, java.lang.String str) throws com.applovin.impl.ch {
        if (!z) {
            throw com.applovin.impl.ch.a(str, null);
        }
    }

    public static boolean b(com.applovin.impl.k8 k8Var, byte[] bArr, int i, int i2) {
        try {
            k8Var.d(bArr, i, i2);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public static boolean a(com.applovin.impl.k8 k8Var, byte[] bArr, int i, int i2, boolean z) throws java.io.EOFException {
        try {
            return k8Var.b(bArr, i, i2, z);
        } catch (java.io.EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static int a(com.applovin.impl.k8 k8Var, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int iB = k8Var.b(bArr, i + i3, i2 - i3);
            if (iB == -1) {
                break;
            }
            i3 += iB;
        }
        return i3;
    }

    public static boolean a(com.applovin.impl.k8 k8Var, int i) {
        try {
            k8Var.a(i);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }
}
