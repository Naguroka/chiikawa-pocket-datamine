package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface qo {
    int a(com.applovin.impl.f5 f5Var, int i, boolean z, int i2);

    void a(long j, int i, int i2, int i3, com.applovin.impl.qo.a aVar);

    void a(com.applovin.impl.ah ahVar, int i, int i2);

    void a(com.applovin.impl.e9 e9Var);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1199a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.f1199a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || com.applovin.impl.qo.a.class != obj.getClass()) {
                return false;
            }
            com.applovin.impl.qo.a aVar = (com.applovin.impl.qo.a) obj;
            return this.f1199a == aVar.f1199a && this.c == aVar.c && this.d == aVar.d && java.util.Arrays.equals(this.b, aVar.b);
        }

        public int hashCode() {
            return (((((this.f1199a * 31) + java.util.Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
        }
    }

    default int a(com.applovin.impl.f5 f5Var, int i, boolean z) {
        return a(f5Var, i, z, 0);
    }

    default void a(com.applovin.impl.ah ahVar, int i) {
        a(ahVar, i, 0);
    }
}
