package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.applovin.impl.y3 f1529a = new com.applovin.impl.y3.a();
    private static final com.applovin.impl.y3 b = new com.applovin.impl.y3.b(-1);
    private static final com.applovin.impl.y3 c = new com.applovin.impl.y3.b(1);

    private y3() {
    }

    public static com.applovin.impl.y3 e() {
        return f1529a;
    }

    public abstract com.applovin.impl.y3 a(int i, int i2);

    public abstract com.applovin.impl.y3 a(long j, long j2);

    public abstract com.applovin.impl.y3 a(java.lang.Object obj, java.lang.Object obj2, java.util.Comparator comparator);

    public abstract com.applovin.impl.y3 a(boolean z, boolean z2);

    public abstract com.applovin.impl.y3 b(boolean z, boolean z2);

    public abstract int d();

    /* synthetic */ y3(com.applovin.impl.y3.a aVar) {
        this();
    }

    class a extends com.applovin.impl.y3 {
        @Override // com.applovin.impl.y3
        public int d() {
            return 0;
        }

        a() {
            super(null);
        }

        @Override // com.applovin.impl.y3
        public com.applovin.impl.y3 b(boolean z, boolean z2) {
            return a(com.applovin.impl.k2.a(z2, z));
        }

        com.applovin.impl.y3 a(int i) {
            if (i < 0) {
                return com.applovin.impl.y3.b;
            }
            return i > 0 ? com.applovin.impl.y3.c : com.applovin.impl.y3.f1529a;
        }

        @Override // com.applovin.impl.y3
        public com.applovin.impl.y3 a(int i, int i2) {
            return a(com.applovin.impl.tb.a(i, i2));
        }

        @Override // com.applovin.impl.y3
        public com.applovin.impl.y3 a(long j, long j2) {
            return a(com.applovin.impl.rc.a(j, j2));
        }

        @Override // com.applovin.impl.y3
        public com.applovin.impl.y3 a(java.lang.Object obj, java.lang.Object obj2, java.util.Comparator comparator) {
            return a(comparator.compare(obj, obj2));
        }

        @Override // com.applovin.impl.y3
        public com.applovin.impl.y3 a(boolean z, boolean z2) {
            return a(com.applovin.impl.k2.a(z, z2));
        }
    }

    private static final class b extends com.applovin.impl.y3 {
        final int d;

        @Override // com.applovin.impl.y3
        public com.applovin.impl.y3 a(int i, int i2) {
            return this;
        }

        @Override // com.applovin.impl.y3
        public com.applovin.impl.y3 a(long j, long j2) {
            return this;
        }

        @Override // com.applovin.impl.y3
        public com.applovin.impl.y3 a(java.lang.Object obj, java.lang.Object obj2, java.util.Comparator comparator) {
            return this;
        }

        @Override // com.applovin.impl.y3
        public com.applovin.impl.y3 a(boolean z, boolean z2) {
            return this;
        }

        @Override // com.applovin.impl.y3
        public com.applovin.impl.y3 b(boolean z, boolean z2) {
            return this;
        }

        b(int i) {
            super(null);
            this.d = i;
        }

        @Override // com.applovin.impl.y3
        public int d() {
            return this.d;
        }
    }
}
