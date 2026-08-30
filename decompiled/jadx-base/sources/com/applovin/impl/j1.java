package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f902a;

    public static java.lang.String a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static int b(int i) {
        return i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
    }

    public static int c(int i) {
        return (i >> 24) & 255;
    }

    public j1(int i) {
        this.f902a = i;
    }

    public java.lang.String toString() {
        return a(this.f902a);
    }

    static final class b extends com.applovin.impl.j1 {
        public final com.applovin.impl.ah b;

        public b(int i, com.applovin.impl.ah ahVar) {
            super(i);
            this.b = ahVar;
        }
    }

    static final class a extends com.applovin.impl.j1 {
        public final long b;
        public final java.util.List c;
        public final java.util.List d;

        @Override // com.applovin.impl.j1
        public java.lang.String toString() {
            return com.applovin.impl.j1.a(this.f902a) + " leaves: " + java.util.Arrays.toString(this.c.toArray()) + " containers: " + java.util.Arrays.toString(this.d.toArray());
        }

        public a(int i, long j) {
            super(i);
            this.b = j;
            this.c = new java.util.ArrayList();
            this.d = new java.util.ArrayList();
        }

        public void a(com.applovin.impl.j1.a aVar) {
            this.d.add(aVar);
        }

        public com.applovin.impl.j1.b e(int i) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.applovin.impl.j1.b bVar = (com.applovin.impl.j1.b) this.c.get(i2);
                if (bVar.f902a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public com.applovin.impl.j1.a d(int i) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.applovin.impl.j1.a aVar = (com.applovin.impl.j1.a) this.d.get(i2);
                if (aVar.f902a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public void a(com.applovin.impl.j1.b bVar) {
            this.c.add(bVar);
        }
    }
}
