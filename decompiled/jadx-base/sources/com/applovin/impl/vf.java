package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vf {
    private vf() {
    }

    /* synthetic */ vf(com.applovin.impl.uf ufVar) {
        this();
    }

    class a extends com.applovin.impl.vf.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.Comparator f1427a;

        @Override // com.applovin.impl.vf.d
        java.util.Map b() {
            return new java.util.TreeMap(this.f1427a);
        }

        a(java.util.Comparator comparator) {
            this.f1427a = comparator;
        }
    }

    public static com.applovin.impl.vf.d a(java.util.Comparator comparator) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(comparator);
        return new com.applovin.impl.vf.a(comparator);
    }

    public static com.applovin.impl.vf.d a() {
        return a(com.applovin.impl.vg.a());
    }

    private static final class b implements com.applovin.exoplayer2.common.base.Supplier, java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1428a;

        @Override // com.applovin.exoplayer2.common.base.Supplier
        public java.util.List get() {
            return new java.util.ArrayList(this.f1428a);
        }

        b(int i) {
            this.f1428a = com.applovin.impl.p3.a(i, "expectedValuesPerKey");
        }
    }

    public static abstract class d {
        d() {
        }

        abstract java.util.Map b();

        public com.applovin.impl.vf.c a() {
            return a(2);
        }

        class a extends com.applovin.impl.vf.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1429a;

            a(int i) {
                this.f1429a = i;
            }

            @Override // com.applovin.impl.vf.c
            public com.applovin.impl.ec b() {
                return com.applovin.impl.wf.a(com.applovin.impl.vf.d.this.b(), new com.applovin.impl.vf.b(this.f1429a));
            }
        }

        public com.applovin.impl.vf.c a(int i) {
            com.applovin.impl.p3.a(i, "expectedValuesPerKey");
            return new com.applovin.impl.vf.d.a(i);
        }
    }

    public static abstract class c extends com.applovin.impl.vf {
        public abstract com.applovin.impl.ec b();

        c() {
            super(null);
        }
    }
}
