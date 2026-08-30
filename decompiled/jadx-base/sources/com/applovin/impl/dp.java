package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface dp {

    public interface c {
        android.util.SparseArray a();

        com.applovin.impl.dp a(int i, com.applovin.impl.dp.b bVar);
    }

    void a();

    void a(com.applovin.impl.ah ahVar, int i);

    void a(com.applovin.impl.ho hoVar, com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar);

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f737a;
        public final java.lang.String b;
        public final java.util.List c;
        public final byte[] d;

        public b(int i, java.lang.String str, java.util.List list, byte[] bArr) {
            java.util.List listUnmodifiableList;
            this.f737a = i;
            this.b = str;
            if (list == null) {
                listUnmodifiableList = java.util.Collections.emptyList();
            } else {
                listUnmodifiableList = java.util.Collections.unmodifiableList(list);
            }
            this.c = listUnmodifiableList;
            this.d = bArr;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f736a;
        public final int b;
        public final byte[] c;

        public a(java.lang.String str, int i, byte[] bArr) {
            this.f736a = str;
            this.b = i;
            this.c = bArr;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f738a;
        private final int b;
        private final int c;
        private int d;
        private java.lang.String e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.e = this.f738a + this.d;
        }

        public int c() {
            d();
            return this.d;
        }

        public java.lang.String b() {
            d();
            return this.e;
        }

        private void d() {
            if (this.d == Integer.MIN_VALUE) {
                throw new java.lang.IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public d(int i, int i2, int i3) {
            this.f738a = i != Integer.MIN_VALUE ? i + "/" : "";
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }
    }
}
