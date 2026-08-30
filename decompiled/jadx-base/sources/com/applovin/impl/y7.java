package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface y7 {

    public interface b {
        void a(com.applovin.impl.y7 y7Var, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    public interface c {
        com.applovin.impl.y7 a(java.util.UUID uuid);
    }

    com.applovin.impl.y7.a a(byte[] bArr, java.util.List list, int i, java.util.HashMap map);

    void a();

    void a(com.applovin.impl.y7.b bVar);

    void a(byte[] bArr);

    void a(byte[] bArr, byte[] bArr2);

    boolean a(byte[] bArr, java.lang.String str);

    com.applovin.impl.y7.d b();

    java.util.Map b(byte[] bArr);

    byte[] b(byte[] bArr, byte[] bArr2);

    int c();

    void c(byte[] bArr);

    com.applovin.impl.y4 d(byte[] bArr);

    byte[] d();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f1532a;
        private final java.lang.String b;
        private final int c;

        public a(byte[] bArr, java.lang.String str, int i) {
            this.f1532a = bArr;
            this.b = str;
            this.c = i;
        }

        public byte[] a() {
            return this.f1532a;
        }

        public java.lang.String b() {
            return this.b;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f1533a;
        private final java.lang.String b;

        public d(byte[] bArr, java.lang.String str) {
            this.f1533a = bArr;
            this.b = str;
        }

        public byte[] a() {
            return this.f1533a;
        }

        public java.lang.String b() {
            return this.b;
        }
    }
}
