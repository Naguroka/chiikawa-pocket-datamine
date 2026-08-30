package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
class w3 extends java.util.AbstractMap implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient int[] f1446a;
    transient long[] b;
    transient java.lang.Object[] c;
    transient java.lang.Object[] d;
    transient float f;
    transient int g;
    private transient int h;
    private transient int i;
    private transient java.util.Set j;
    private transient java.util.Set k;
    private transient java.util.Collection l;

    private static int a(long j) {
        return (int) (j >>> 32);
    }

    private static long a(long j, int i) {
        return (j & (-4294967296L)) | (((long) i) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE);
    }

    private static int b(long j) {
        return (int) j;
    }

    int a(int i, int i2) {
        return i - 1;
    }

    void a(int i) {
    }

    w3() {
        a(3, 1.0f);
    }

    private static int[] e(int i) {
        int[] iArr = new int[i];
        java.util.Arrays.fill(iArr, -1);
        return iArr;
    }

    java.util.Iterator e() {
        return new com.applovin.impl.w3.b();
    }

    private static long[] d(int i) {
        long[] jArr = new long[i];
        java.util.Arrays.fill(jArr, -1L);
        return jArr;
    }

    java.util.Collection d() {
        return new com.applovin.impl.w3.h();
    }

    private int g() {
        return this.f1446a.length - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        long[] jArr = this.b;
        java.lang.Object[] objArr = this.c;
        java.lang.Object[] objArr2 = this.d;
        int iA = com.applovin.impl.ja.a(obj);
        int iG = g() & iA;
        int i = this.i;
        int[] iArr = this.f1446a;
        int i2 = iArr[iG];
        if (i2 == -1) {
            iArr[iG] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (a(j) == iA && com.applovin.exoplayer2.common.base.Objects.equal(obj, objArr[i2])) {
                    java.lang.Object obj3 = objArr2[i2];
                    objArr2[i2] = obj2;
                    a(i2);
                    return obj3;
                }
                int iB = b(j);
                if (iB == -1) {
                    jArr[i2] = a(j, i);
                    break;
                }
                i2 = iB;
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = i + 1;
            h(i3);
            a(i, obj, obj2, iA);
            this.i = i3;
            if (i >= this.h) {
                i(this.f1446a.length * 2);
            }
            this.g++;
            return null;
        }
        throw new java.lang.IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    private void h(int i) {
        int length = this.b.length;
        if (i > length) {
            int iMax = java.lang.Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                g(iMax);
            }
        }
    }

    java.util.Iterator h() {
        return new com.applovin.impl.w3.a();
    }

    private void i(int i) {
        if (this.f1446a.length >= 1073741824) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.f)) + 1;
        int[] iArrE = e(i);
        long[] jArr = this.b;
        int length = iArrE.length - 1;
        for (int i3 = 0; i3 < this.i; i3++) {
            int iA = a(jArr[i3]);
            int i4 = iA & length;
            int i5 = iArrE[i4];
            iArrE[i4] = i3;
            jArr[i3] = (((long) iA) << 32) | (((long) i5) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE);
        }
        this.h = i2;
        this.f1446a = iArrE;
    }

    java.util.Iterator i() {
        return new com.applovin.impl.w3.c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return a(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        int iA = a(obj);
        a(iA);
        if (iA == -1) {
            return null;
        }
        return this.d[iA];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        return a(obj, com.applovin.impl.ja.a(obj));
    }

    void c(int i) {
        int size = size() - 1;
        if (i < size) {
            java.lang.Object[] objArr = this.c;
            objArr[i] = objArr[size];
            java.lang.Object[] objArr2 = this.d;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.b;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int iA = a(j) & g();
            int[] iArr = this.f1446a;
            int i2 = iArr[iA];
            if (i2 == size) {
                iArr[iA] = i;
                return;
            }
            while (true) {
                long j2 = this.b[i2];
                int iB = b(j2);
                if (iB == size) {
                    this.b[i2] = a(j2, i);
                    return;
                }
                i2 = iB;
            }
        } else {
            this.c[i] = null;
            this.d[i] = null;
            this.b[i] = -1;
        }
    }

    java.util.Set c() {
        return new com.applovin.impl.w3.f();
    }

    int f() {
        return isEmpty() ? -1 : 0;
    }

    int b(int i) {
        int i2 = i + 1;
        if (i2 < this.i) {
            return i2;
        }
        return -1;
    }

    java.util.Set b() {
        return new com.applovin.impl.w3.d();
    }

    private abstract class e implements java.util.Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1448a;
        int b;
        int c;

        abstract java.lang.Object a(int i);

        private e() {
            this.f1448a = com.applovin.impl.w3.this.g;
            this.b = com.applovin.impl.w3.this.f();
            this.c = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b >= 0;
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            a();
            if (hasNext()) {
                int i = this.b;
                this.c = i;
                java.lang.Object objA = a(i);
                this.b = com.applovin.impl.w3.this.b(this.b);
                return objA;
            }
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            com.applovin.impl.p3.a(this.c >= 0);
            this.f1448a++;
            com.applovin.impl.w3.this.f(this.c);
            this.b = com.applovin.impl.w3.this.a(this.b, this.c);
            this.c = -1;
        }

        private void a() {
            if (com.applovin.impl.w3.this.g != this.f1448a) {
                throw new java.util.ConcurrentModificationException();
            }
        }

        /* synthetic */ e(com.applovin.impl.w3 w3Var, com.applovin.impl.w3.a aVar) {
            this();
        }
    }

    void g(int i) {
        this.c = java.util.Arrays.copyOf(this.c, i);
        this.d = java.util.Arrays.copyOf(this.d, i);
        long[] jArr = this.b;
        int length = jArr.length;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, i);
        if (i > length) {
            java.util.Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.b = jArrCopyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        java.util.Set set = this.j;
        if (set != null) {
            return set;
        }
        java.util.Set setC = c();
        this.j = setC;
        return setC;
    }

    class f extends java.util.AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.applovin.impl.w3.this.i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return com.applovin.impl.w3.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            int iA = com.applovin.impl.w3.this.a(obj);
            if (iA == -1) {
                return false;
            }
            com.applovin.impl.w3.this.f(iA);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
            return com.applovin.impl.w3.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.applovin.impl.w3.this.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(java.lang.Object obj) {
        int iA = com.applovin.impl.ja.a(obj);
        int iB = this.f1446a[g() & iA];
        while (iB != -1) {
            long j = this.b[iB];
            if (a(j) == iA && com.applovin.exoplayer2.common.base.Objects.equal(obj, this.c[iB])) {
                return iB;
            }
            iB = b(j);
        }
        return -1;
    }

    class a extends com.applovin.impl.w3.e {
        a() {
            super(com.applovin.impl.w3.this, null);
        }

        @Override // com.applovin.impl.w3.e
        java.lang.Object a(int i) {
            return com.applovin.impl.w3.this.c[i];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        java.util.Set set = this.k;
        if (set != null) {
            return set;
        }
        java.util.Set setB = b();
        this.k = setB;
        return setB;
    }

    class d extends java.util.AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.applovin.impl.w3.this.i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.applovin.impl.w3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
            return com.applovin.impl.w3.this.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int iA = com.applovin.impl.w3.this.a(entry.getKey());
            return iA != -1 && com.applovin.exoplayer2.common.base.Objects.equal(com.applovin.impl.w3.this.d[iA], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int iA = com.applovin.impl.w3.this.a(entry.getKey());
            if (iA == -1 || !com.applovin.exoplayer2.common.base.Objects.equal(com.applovin.impl.w3.this.d[iA], entry.getValue())) {
                return false;
            }
            com.applovin.impl.w3.this.f(iA);
            return true;
        }
    }

    class b extends com.applovin.impl.w3.e {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.impl.w3.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.util.Map.Entry a(int i) {
            return com.applovin.impl.w3.this.new g(i);
        }

        b() {
            super(com.applovin.impl.w3.this, null);
        }
    }

    final class g extends com.applovin.impl.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f1450a;
        private int b;

        g(int i) {
            this.f1450a = com.applovin.impl.w3.this.c[i];
            this.b = i;
        }

        @Override // com.applovin.impl.g, java.util.Map.Entry
        public java.lang.Object getKey() {
            return this.f1450a;
        }

        private void a() {
            int i = this.b;
            if (i == -1 || i >= com.applovin.impl.w3.this.size() || !com.applovin.exoplayer2.common.base.Objects.equal(this.f1450a, com.applovin.impl.w3.this.c[this.b])) {
                this.b = com.applovin.impl.w3.this.a(this.f1450a);
            }
        }

        @Override // com.applovin.impl.g, java.util.Map.Entry
        public java.lang.Object getValue() {
            a();
            int i = this.b;
            if (i == -1) {
                return null;
            }
            return com.applovin.impl.w3.this.d[i];
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object obj) {
            a();
            int i = this.b;
            if (i == -1) {
                com.applovin.impl.w3.this.put(this.f1450a, obj);
                return null;
            }
            java.lang.Object[] objArr = com.applovin.impl.w3.this.d;
            java.lang.Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.i == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        for (int i = 0; i < this.i; i++) {
            if (com.applovin.exoplayer2.common.base.Objects.equal(obj, this.d[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection values() {
        java.util.Collection collection = this.l;
        if (collection != null) {
            return collection;
        }
        java.util.Collection collectionD = d();
        this.l = collectionD;
        return collectionD;
    }

    class h extends java.util.AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return com.applovin.impl.w3.this.i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.applovin.impl.w3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            return com.applovin.impl.w3.this.i();
        }
    }

    class c extends com.applovin.impl.w3.e {
        c() {
            super(com.applovin.impl.w3.this, null);
        }

        @Override // com.applovin.impl.w3.e
        java.lang.Object a(int i) {
            return com.applovin.impl.w3.this.d[i];
        }
    }

    void a(int i, float f2) {
        com.applovin.exoplayer2.common.base.Preconditions.checkArgument(i >= 0, "Initial capacity must be non-negative");
        com.applovin.exoplayer2.common.base.Preconditions.checkArgument(f2 > 0.0f, "Illegal load factor");
        int iA = com.applovin.impl.ja.a(i, f2);
        this.f1446a = e(iA);
        this.f = f2;
        this.c = new java.lang.Object[i];
        this.d = new java.lang.Object[i];
        this.b = d(i);
        this.h = java.lang.Math.max(1, (int) (iA * f2));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.g++;
        java.util.Arrays.fill(this.c, 0, this.i, (java.lang.Object) null);
        java.util.Arrays.fill(this.d, 0, this.i, (java.lang.Object) null);
        java.util.Arrays.fill(this.f1446a, -1);
        java.util.Arrays.fill(this.b, -1L);
        this.i = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object f(int i) {
        return a(this.c[i], a(this.b[i]));
    }

    void a(int i, java.lang.Object obj, java.lang.Object obj2, int i2) {
        this.b[i] = (((long) i2) << 32) | androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
        this.c[i] = obj;
        this.d[i] = obj2;
    }

    private java.lang.Object a(java.lang.Object obj, int i) {
        int iG = g() & i;
        int i2 = this.f1446a[iG];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (a(this.b[i2]) == i && com.applovin.exoplayer2.common.base.Objects.equal(obj, this.c[i2])) {
                java.lang.Object obj2 = this.d[i2];
                if (i3 == -1) {
                    this.f1446a[iG] = b(this.b[i2]);
                } else {
                    long[] jArr = this.b;
                    jArr[i3] = a(jArr[i3], b(jArr[i2]));
                }
                c(i2);
                this.i--;
                this.g++;
                return obj2;
            }
            int iB = b(this.b[i2]);
            if (iB == -1) {
                return null;
            }
            i3 = i2;
            i2 = iB;
        }
    }

    public static com.applovin.impl.w3 a() {
        return new com.applovin.impl.w3();
    }
}
