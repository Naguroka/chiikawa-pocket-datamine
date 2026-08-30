package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.net.Uri f947a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final java.util.Map e;
    public final long f;
    public final long g;
    public final long h;
    public final java.lang.String i;
    public final int j;
    public final java.lang.Object k;

    public java.lang.String toString() {
        return "DataSpec[" + b() + " " + this.f947a + ", " + this.g + ", " + this.h + ", " + this.i + ", " + this.j + com.ironsource.y8.i.e;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.net.Uri f948a;
        private long b;
        private int c;
        private byte[] d;
        private java.util.Map e;
        private long f;
        private long g;
        private java.lang.String h;
        private int i;
        private java.lang.Object j;

        public b() {
            this.c = 1;
            this.e = java.util.Collections.emptyMap();
            this.g = -1L;
        }

        public com.applovin.impl.k5.b b(int i) {
            this.c = i;
            return this;
        }

        private b(com.applovin.impl.k5 k5Var) {
            this.f948a = k5Var.f947a;
            this.b = k5Var.b;
            this.c = k5Var.c;
            this.d = k5Var.d;
            this.e = k5Var.e;
            this.f = k5Var.g;
            this.g = k5Var.h;
            this.h = k5Var.i;
            this.i = k5Var.j;
            this.j = k5Var.k;
        }

        public com.applovin.impl.k5.b b(java.lang.String str) {
            this.f948a = android.net.Uri.parse(str);
            return this;
        }

        public com.applovin.impl.k5 a() {
            com.applovin.impl.b1.a(this.f948a, "The uri must be set.");
            return new com.applovin.impl.k5(this.f948a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public com.applovin.impl.k5.b a(int i) {
            this.i = i;
            return this;
        }

        public com.applovin.impl.k5.b a(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public com.applovin.impl.k5.b a(java.util.Map map) {
            this.e = map;
            return this;
        }

        public com.applovin.impl.k5.b a(java.lang.String str) {
            this.h = str;
            return this;
        }

        public com.applovin.impl.k5.b a(long j) {
            this.f = j;
            return this;
        }

        public com.applovin.impl.k5.b a(android.net.Uri uri) {
            this.f948a = uri;
            return this;
        }
    }

    public static java.lang.String a(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new java.lang.IllegalStateException();
    }

    public com.applovin.impl.k5.b a() {
        return new com.applovin.impl.k5.b();
    }

    private k5(android.net.Uri uri, long j, int i, byte[] bArr, java.util.Map map, long j2, long j3, java.lang.String str, int i2, java.lang.Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        com.applovin.impl.b1.a(j4 >= 0);
        com.applovin.impl.b1.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        com.applovin.impl.b1.a(z);
        this.f947a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = java.util.Collections.unmodifiableMap(new java.util.HashMap(map));
        this.g = j2;
        this.f = j4;
        this.h = j3;
        this.i = str;
        this.j = i2;
        this.k = obj;
    }

    public final java.lang.String b() {
        return a(this.c);
    }

    public boolean b(int i) {
        return (this.j & i) == i;
    }
}
