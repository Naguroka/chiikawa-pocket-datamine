package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class sd implements com.applovin.impl.o2 {
    public static final com.applovin.impl.sd g = new com.applovin.impl.sd.c().a();
    public static final com.applovin.impl.o2.a h = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.sd$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.sd.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1249a;
    public final com.applovin.impl.sd.g b;
    public final com.applovin.impl.sd.f c;
    public final com.applovin.impl.ud d;
    public final com.applovin.impl.sd.d f;

    public static final class b {
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f1250a;
        private android.net.Uri b;
        private java.lang.String c;
        private long d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private com.applovin.impl.sd.e.a i;
        private java.util.List j;
        private java.lang.String k;
        private java.util.List l;
        private java.lang.Object m;
        private com.applovin.impl.ud n;
        private com.applovin.impl.sd.f.a o;

        public c() {
            this.e = Long.MIN_VALUE;
            this.i = new com.applovin.impl.sd.e.a();
            this.j = java.util.Collections.emptyList();
            this.l = java.util.Collections.emptyList();
            this.o = new com.applovin.impl.sd.f.a();
        }

        public com.applovin.impl.sd.c b(java.lang.String str) {
            this.f1250a = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) str);
            return this;
        }

        private c(com.applovin.impl.sd sdVar) {
            com.applovin.impl.sd.e.a aVar;
            this();
            com.applovin.impl.sd.d dVar = sdVar.f;
            this.e = dVar.b;
            this.f = dVar.c;
            this.g = dVar.d;
            this.d = dVar.f1251a;
            this.h = dVar.f;
            this.f1250a = sdVar.f1249a;
            this.n = sdVar.d;
            this.o = sdVar.c.a();
            com.applovin.impl.sd.g gVar = sdVar.b;
            if (gVar != null) {
                this.k = gVar.e;
                this.c = gVar.b;
                this.b = gVar.f1256a;
                this.j = gVar.d;
                this.l = gVar.f;
                this.m = gVar.g;
                com.applovin.impl.sd.e eVar = gVar.c;
                if (eVar != null) {
                    aVar = eVar.a();
                } else {
                    aVar = new com.applovin.impl.sd.e.a();
                }
                this.i = aVar;
            }
        }

        public com.applovin.impl.sd a() {
            com.applovin.impl.sd.g gVar;
            com.applovin.impl.b1.b(this.i.b == null || this.i.f1253a != null);
            android.net.Uri uri = this.b;
            if (uri != null) {
                gVar = new com.applovin.impl.sd.g(uri, this.c, this.i.f1253a != null ? this.i.a() : null, null, this.j, this.k, this.l, this.m);
            } else {
                gVar = null;
            }
            java.lang.String str = this.f1250a;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            com.applovin.impl.sd.d dVar = new com.applovin.impl.sd.d(this.d, this.e, this.f, this.g, this.h);
            com.applovin.impl.sd.f fVarA = this.o.a();
            com.applovin.impl.ud udVar = this.n;
            if (udVar == null) {
                udVar = com.applovin.impl.ud.H;
            }
            return new com.applovin.impl.sd(str2, dVar, gVar, fVarA, udVar);
        }

        public com.applovin.impl.sd.c a(java.lang.String str) {
            this.k = str;
            return this;
        }

        public com.applovin.impl.sd.c a(java.lang.Object obj) {
            this.m = obj;
            return this;
        }

        public com.applovin.impl.sd.c a(android.net.Uri uri) {
            this.b = uri;
            return this;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.UUID f1252a;
        public final android.net.Uri b;
        public final com.applovin.impl.fb c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final com.applovin.impl.db g;
        private final byte[] h;

        public com.applovin.impl.sd.e.a a() {
            return new com.applovin.impl.sd.e.a();
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private java.util.UUID f1253a;
            private android.net.Uri b;
            private com.applovin.impl.fb c;
            private boolean d;
            private boolean e;
            private boolean f;
            private com.applovin.impl.db g;
            private byte[] h;

            public com.applovin.impl.sd.e a() {
                return new com.applovin.impl.sd.e(this);
            }

            private a() {
                this.c = com.applovin.impl.fb.h();
                this.g = com.applovin.impl.db.h();
            }

            private a(com.applovin.impl.sd.e eVar) {
                this.f1253a = eVar.f1252a;
                this.b = eVar.b;
                this.c = eVar.c;
                this.d = eVar.d;
                this.e = eVar.e;
                this.f = eVar.f;
                this.g = eVar.g;
                this.h = eVar.h;
            }
        }

        private e(com.applovin.impl.sd.e.a aVar) {
            com.applovin.impl.b1.b((aVar.f && aVar.b == null) ? false : true);
            this.f1252a = (java.util.UUID) com.applovin.impl.b1.a(aVar.f1253a);
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.f = aVar.f;
            this.e = aVar.e;
            this.g = aVar.g;
            this.h = aVar.h != null ? java.util.Arrays.copyOf(aVar.h, aVar.h.length) : null;
        }

        public byte[] b() {
            byte[] bArr = this.h;
            if (bArr != null) {
                return java.util.Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.sd.e)) {
                return false;
            }
            com.applovin.impl.sd.e eVar = (com.applovin.impl.sd.e) obj;
            return this.f1252a.equals(eVar.f1252a) && com.applovin.impl.xp.a(this.b, eVar.b) && com.applovin.impl.xp.a(this.c, eVar.c) && this.d == eVar.d && this.f == eVar.f && this.e == eVar.e && this.g.equals(eVar.g) && java.util.Arrays.equals(this.h, eVar.h);
        }

        public int hashCode() {
            int iHashCode = this.f1252a.hashCode() * 31;
            android.net.Uri uri = this.b;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.g.hashCode()) * 31) + java.util.Arrays.hashCode(this.h);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.net.Uri f1256a;
        public final java.lang.String b;
        public final com.applovin.impl.sd.e c;
        public final java.util.List d;
        public final java.lang.String e;
        public final java.util.List f;
        public final java.lang.Object g;

        private g(android.net.Uri uri, java.lang.String str, com.applovin.impl.sd.e eVar, com.applovin.impl.sd.b bVar, java.util.List list, java.lang.String str2, java.util.List list2, java.lang.Object obj) {
            this.f1256a = uri;
            this.b = str;
            this.c = eVar;
            this.d = list;
            this.e = str2;
            this.f = list2;
            this.g = obj;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.sd.g)) {
                return false;
            }
            com.applovin.impl.sd.g gVar = (com.applovin.impl.sd.g) obj;
            return this.f1256a.equals(gVar.f1256a) && com.applovin.impl.xp.a((java.lang.Object) this.b, (java.lang.Object) gVar.b) && com.applovin.impl.xp.a(this.c, gVar.c) && com.applovin.impl.xp.a((java.lang.Object) null, (java.lang.Object) null) && this.d.equals(gVar.d) && com.applovin.impl.xp.a((java.lang.Object) this.e, (java.lang.Object) gVar.e) && this.f.equals(gVar.f) && com.applovin.impl.xp.a(this.g, gVar.g);
        }

        public int hashCode() {
            int iHashCode = this.f1256a.hashCode() * 31;
            java.lang.String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            com.applovin.impl.sd.e eVar = this.c;
            int iHashCode3 = (((iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 961) + this.d.hashCode()) * 31;
            java.lang.String str2 = this.e;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f.hashCode()) * 31;
            java.lang.Object obj = this.g;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class f implements com.applovin.impl.o2 {
        public static final com.applovin.impl.sd.f g = new com.applovin.impl.sd.f.a().a();
        public static final com.applovin.impl.o2.a h = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.sd$f$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.o2.a
            public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
                return com.applovin.impl.sd.f.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1254a;
        public final long b;
        public final long c;
        public final float d;
        public final float f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f1255a;
            private long b;
            private long c;
            private float d;
            private float e;

            public com.applovin.impl.sd.f a() {
                return new com.applovin.impl.sd.f(this);
            }

            public a() {
                this.f1255a = androidx.media3.common.C.TIME_UNSET;
                this.b = androidx.media3.common.C.TIME_UNSET;
                this.c = androidx.media3.common.C.TIME_UNSET;
                this.d = -3.4028235E38f;
                this.e = -3.4028235E38f;
            }

            private a(com.applovin.impl.sd.f fVar) {
                this.f1255a = fVar.f1254a;
                this.b = fVar.b;
                this.c = fVar.c;
                this.d = fVar.d;
                this.e = fVar.f;
            }
        }

        public f(long j, long j2, long j3, float f, float f2) {
            this.f1254a = j;
            this.b = j2;
            this.c = j3;
            this.d = f;
            this.f = f2;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.sd.f)) {
                return false;
            }
            com.applovin.impl.sd.f fVar = (com.applovin.impl.sd.f) obj;
            return this.f1254a == fVar.f1254a && this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.f == fVar.f;
        }

        public int hashCode() {
            long j = this.f1254a;
            long j2 = this.b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.c;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.d;
            int iFloatToIntBits = (i2 + (f != 0.0f ? java.lang.Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f;
            return iFloatToIntBits + (f2 != 0.0f ? java.lang.Float.floatToIntBits(f2) : 0);
        }

        private static java.lang.String a(int i) {
            return java.lang.Integer.toString(i, 36);
        }

        public com.applovin.impl.sd.f.a a() {
            return new com.applovin.impl.sd.f.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.applovin.impl.sd.f a(android.os.Bundle bundle) {
            return new com.applovin.impl.sd.f(bundle.getLong(a(0), androidx.media3.common.C.TIME_UNSET), bundle.getLong(a(1), androidx.media3.common.C.TIME_UNSET), bundle.getLong(a(2), androidx.media3.common.C.TIME_UNSET), bundle.getFloat(a(3), -3.4028235E38f), bundle.getFloat(a(4), -3.4028235E38f));
        }

        private f(com.applovin.impl.sd.f.a aVar) {
            this(aVar.f1255a, aVar.b, aVar.c, aVar.d, aVar.e);
        }
    }

    public static final class d implements com.applovin.impl.o2 {
        public static final com.applovin.impl.o2.a g = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.sd$d$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.o2.a
            public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
                return com.applovin.impl.sd.d.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1251a;
        public final long b;
        public final boolean c;
        public final boolean d;
        public final boolean f;

        private d(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f1251a = j;
            this.b = j2;
            this.c = z;
            this.d = z2;
            this.f = z3;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.sd.d)) {
                return false;
            }
            com.applovin.impl.sd.d dVar = (com.applovin.impl.sd.d) obj;
            return this.f1251a == dVar.f1251a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.f == dVar.f;
        }

        public int hashCode() {
            long j = this.f1251a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.b;
            return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0);
        }

        private static java.lang.String a(int i) {
            return java.lang.Integer.toString(i, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.applovin.impl.sd.d a(android.os.Bundle bundle) {
            return new com.applovin.impl.sd.d(bundle.getLong(a(0), 0L), bundle.getLong(a(1), Long.MIN_VALUE), bundle.getBoolean(a(2), false), bundle.getBoolean(a(3), false), bundle.getBoolean(a(4), false));
        }
    }

    private sd(java.lang.String str, com.applovin.impl.sd.d dVar, com.applovin.impl.sd.g gVar, com.applovin.impl.sd.f fVar, com.applovin.impl.ud udVar) {
        this.f1249a = str;
        this.b = gVar;
        this.c = fVar;
        this.d = udVar;
        this.f = dVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.sd)) {
            return false;
        }
        com.applovin.impl.sd sdVar = (com.applovin.impl.sd) obj;
        return com.applovin.impl.xp.a((java.lang.Object) this.f1249a, (java.lang.Object) sdVar.f1249a) && this.f.equals(sdVar.f) && com.applovin.impl.xp.a(this.b, sdVar.b) && com.applovin.impl.xp.a(this.c, sdVar.c) && com.applovin.impl.xp.a(this.d, sdVar.d);
    }

    public int hashCode() {
        int iHashCode = this.f1249a.hashCode() * 31;
        com.applovin.impl.sd.g gVar = this.b;
        return ((((((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.d.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.applovin.impl.sd a(android.os.Bundle bundle) {
        com.applovin.impl.sd.f fVar;
        com.applovin.impl.ud udVar;
        com.applovin.impl.sd.d dVar;
        java.lang.String str = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) bundle.getString(a(0), ""));
        android.os.Bundle bundle2 = bundle.getBundle(a(1));
        if (bundle2 == null) {
            fVar = com.applovin.impl.sd.f.g;
        } else {
            fVar = (com.applovin.impl.sd.f) com.applovin.impl.sd.f.h.a(bundle2);
        }
        com.applovin.impl.sd.f fVar2 = fVar;
        android.os.Bundle bundle3 = bundle.getBundle(a(2));
        if (bundle3 == null) {
            udVar = com.applovin.impl.ud.H;
        } else {
            udVar = (com.applovin.impl.ud) com.applovin.impl.ud.I.a(bundle3);
        }
        com.applovin.impl.ud udVar2 = udVar;
        android.os.Bundle bundle4 = bundle.getBundle(a(3));
        if (bundle4 == null) {
            dVar = new com.applovin.impl.sd.d(0L, Long.MIN_VALUE, false, false, false);
        } else {
            dVar = (com.applovin.impl.sd.d) com.applovin.impl.sd.d.g.a(bundle4);
        }
        return new com.applovin.impl.sd(str, dVar, null, fVar2, udVar2);
    }

    private static java.lang.String a(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    public static com.applovin.impl.sd a(android.net.Uri uri) {
        return new com.applovin.impl.sd.c().a(uri).a();
    }

    public com.applovin.impl.sd.c a() {
        return new com.applovin.impl.sd.c();
    }
}
