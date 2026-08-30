package com.bykv.vk.openvk.preload.a.b.a;

/* JADX INFO: compiled from: JsonTreeReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends com.bykv.vk.openvk.preload.a.d.a {
    private static final java.lang.Object b;
    private java.lang.Object[] c;
    private int d;
    private java.lang.String[] e;
    private int[] f;

    static {
        new java.io.Reader() { // from class: com.bykv.vk.openvk.preload.a.b.a.e.1
            @Override // java.io.Reader
            public final int read(char[] cArr, int i, int i2) throws java.io.IOException {
                throw new java.lang.AssertionError();
            }

            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws java.io.IOException {
                throw new java.lang.AssertionError();
            }
        };
        b = new java.lang.Object();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void a() throws java.io.IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY);
        a(((com.bykv.vk.openvk.preload.a.f) t()).iterator());
        this.f[this.d - 1] = 0;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void b() throws java.io.IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.END_ARRAY);
        u();
        u();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void c() throws java.io.IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT);
        a(((com.bykv.vk.openvk.preload.a.k) t()).g().iterator());
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void d() throws java.io.IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.END_OBJECT);
        u();
        u();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean e() throws java.io.IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        return (bVarF == com.bykv.vk.openvk.preload.a.d.b.END_OBJECT || bVarF == com.bykv.vk.openvk.preload.a.d.b.END_ARRAY) ? false : true;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final com.bykv.vk.openvk.preload.a.d.b f() throws java.io.IOException {
        while (this.d != 0) {
            java.lang.Object objT = t();
            if (objT instanceof java.util.Iterator) {
                boolean z = this.c[this.d - 2] instanceof com.bykv.vk.openvk.preload.a.k;
                java.util.Iterator it = (java.util.Iterator) objT;
                if (!it.hasNext()) {
                    return z ? com.bykv.vk.openvk.preload.a.d.b.END_OBJECT : com.bykv.vk.openvk.preload.a.d.b.END_ARRAY;
                }
                if (z) {
                    return com.bykv.vk.openvk.preload.a.d.b.NAME;
                }
                a(it.next());
            } else {
                if (objT instanceof com.bykv.vk.openvk.preload.a.k) {
                    return com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT;
                }
                if (objT instanceof com.bykv.vk.openvk.preload.a.f) {
                    return com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY;
                }
                if (objT instanceof com.bykv.vk.openvk.preload.a.m) {
                    com.bykv.vk.openvk.preload.a.m mVar = (com.bykv.vk.openvk.preload.a.m) objT;
                    if (mVar.i()) {
                        return com.bykv.vk.openvk.preload.a.d.b.STRING;
                    }
                    if (mVar.g()) {
                        return com.bykv.vk.openvk.preload.a.d.b.BOOLEAN;
                    }
                    if (mVar.h()) {
                        return com.bykv.vk.openvk.preload.a.d.b.NUMBER;
                    }
                    throw new java.lang.AssertionError();
                }
                if (objT instanceof com.bykv.vk.openvk.preload.a.j) {
                    return com.bykv.vk.openvk.preload.a.d.b.NULL;
                }
                if (objT == b) {
                    throw new java.lang.IllegalStateException("JsonReader is closed");
                }
                throw new java.lang.AssertionError();
            }
        }
        return com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT;
    }

    private java.lang.Object t() {
        return this.c[this.d - 1];
    }

    private java.lang.Object u() {
        java.lang.Object[] objArr = this.c;
        int i = this.d - 1;
        this.d = i;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private void a(com.bykv.vk.openvk.preload.a.d.b bVar) throws java.io.IOException {
        if (f() != bVar) {
            throw new java.lang.IllegalStateException("Expected " + bVar + " but was " + f() + v());
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final java.lang.String g() throws java.io.IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry) ((java.util.Iterator) t()).next();
        java.lang.String str = (java.lang.String) entry.getKey();
        this.e[this.d - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final java.lang.String h() throws java.io.IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        if (bVarF != com.bykv.vk.openvk.preload.a.d.b.STRING && bVarF != com.bykv.vk.openvk.preload.a.d.b.NUMBER) {
            throw new java.lang.IllegalStateException("Expected " + com.bykv.vk.openvk.preload.a.d.b.STRING + " but was " + bVarF + v());
        }
        java.lang.String strB = ((com.bykv.vk.openvk.preload.a.m) u()).b();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return strB;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean i() throws java.io.IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BOOLEAN);
        boolean zF = ((com.bykv.vk.openvk.preload.a.m) u()).f();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zF;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void j() throws java.io.IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NULL);
        u();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final double k() throws java.io.IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        if (bVarF != com.bykv.vk.openvk.preload.a.d.b.NUMBER && bVarF != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new java.lang.IllegalStateException("Expected " + com.bykv.vk.openvk.preload.a.d.b.NUMBER + " but was " + bVarF + v());
        }
        double dC = ((com.bykv.vk.openvk.preload.a.m) t()).c();
        if (!q() && (java.lang.Double.isNaN(dC) || java.lang.Double.isInfinite(dC))) {
            throw new java.lang.NumberFormatException("JSON forbids NaN and infinities: ".concat(java.lang.String.valueOf(dC)));
        }
        u();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dC;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final long l() throws java.io.IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        if (bVarF != com.bykv.vk.openvk.preload.a.d.b.NUMBER && bVarF != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new java.lang.IllegalStateException("Expected " + com.bykv.vk.openvk.preload.a.d.b.NUMBER + " but was " + bVarF + v());
        }
        long jD = ((com.bykv.vk.openvk.preload.a.m) t()).d();
        u();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jD;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final int m() throws java.io.IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        if (bVarF != com.bykv.vk.openvk.preload.a.d.b.NUMBER && bVarF != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new java.lang.IllegalStateException("Expected " + com.bykv.vk.openvk.preload.a.d.b.NUMBER + " but was " + bVarF + v());
        }
        int iE = ((com.bykv.vk.openvk.preload.a.m) t()).e();
        u();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iE;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.c = new java.lang.Object[]{b};
        this.d = 1;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void n() throws java.io.IOException {
        if (f() == com.bykv.vk.openvk.preload.a.d.b.NAME) {
            g();
            this.e[this.d - 2] = "null";
        } else {
            u();
            int i = this.d;
            if (i > 0) {
                this.e[i - 1] = "null";
            }
        }
        int i2 = this.d;
        if (i2 > 0) {
            int[] iArr = this.f;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final java.lang.String toString() {
        return getClass().getSimpleName();
    }

    public final void o() throws java.io.IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry) ((java.util.Iterator) t()).next();
        a(entry.getValue());
        a(new com.bykv.vk.openvk.preload.a.m((java.lang.String) entry.getKey()));
    }

    private void a(java.lang.Object obj) {
        int i = this.d;
        java.lang.Object[] objArr = this.c;
        if (i == objArr.length) {
            int i2 = i << 1;
            this.c = java.util.Arrays.copyOf(objArr, i2);
            this.f = java.util.Arrays.copyOf(this.f, i2);
            this.e = (java.lang.String[]) java.util.Arrays.copyOf(this.e, i2);
        }
        java.lang.Object[] objArr2 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final java.lang.String p() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$");
        int i = 0;
        while (i < this.d) {
            java.lang.Object[] objArr = this.c;
            java.lang.Object obj = objArr[i];
            if (obj instanceof com.bykv.vk.openvk.preload.a.f) {
                i++;
                if (objArr[i] instanceof java.util.Iterator) {
                    sb.append('[').append(this.f[i]).append(']');
                }
            } else if (obj instanceof com.bykv.vk.openvk.preload.a.k) {
                i++;
                if (objArr[i] instanceof java.util.Iterator) {
                    sb.append('.');
                    java.lang.String str = this.e[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    private java.lang.String v() {
        return " at path " + p();
    }
}
