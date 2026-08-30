package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ni extends com.applovin.impl.fb {
    static final com.applovin.impl.fb i = new com.applovin.impl.ni(null, new java.lang.Object[0], 0);
    private final transient int[] f;
    final transient java.lang.Object[] g;
    private final transient int h;

    @Override // com.applovin.impl.fb
    com.applovin.impl.hb b() {
        return new com.applovin.impl.ni.a(this, this.g, 0, this.h);
    }

    @Override // com.applovin.impl.fb
    com.applovin.impl.hb c() {
        return new com.applovin.impl.ni.b(this, new com.applovin.impl.ni.c(this.g, 0, this.h));
    }

    @Override // com.applovin.impl.fb
    com.applovin.impl.bb d() {
        return new com.applovin.impl.ni.c(this.g, 1, this.h);
    }

    @Override // com.applovin.impl.fb
    boolean f() {
        return false;
    }

    static com.applovin.impl.ni a(int i2, java.lang.Object[] objArr) {
        if (i2 == 0) {
            return (com.applovin.impl.ni) i;
        }
        if (i2 == 1) {
            com.applovin.impl.p3.a(objArr[0], objArr[1]);
            return new com.applovin.impl.ni(null, objArr, 1);
        }
        com.applovin.exoplayer2.common.base.Preconditions.checkPositionIndex(i2, objArr.length >> 1);
        return new com.applovin.impl.ni(a(objArr, i2, com.applovin.impl.hb.a(i2), 0), objArr, i2);
    }

    private ni(int[] iArr, java.lang.Object[] objArr, int i2) {
        this.f = iArr;
        this.g = objArr;
        this.h = i2;
    }

    @Override // java.util.Map
    public int size() {
        return this.h;
    }

    @Override // com.applovin.impl.fb, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return a(this.f, this.g, this.h, 0, obj);
    }

    static int[] a(java.lang.Object[] objArr, int i2, int i3, int i4) {
        int i5;
        if (i2 == 1) {
            com.applovin.impl.p3.a(objArr[i4], objArr[i4 ^ 1]);
            return null;
        }
        int i6 = i3 - 1;
        int[] iArr = new int[i3];
        java.util.Arrays.fill(iArr, -1);
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i7 * 2;
            int i9 = i8 + i4;
            java.lang.Object obj = objArr[i9];
            java.lang.Object obj2 = objArr[i8 + (i4 ^ 1)];
            com.applovin.impl.p3.a(obj, obj2);
            int iA = com.applovin.impl.ja.a(obj.hashCode());
            while (true) {
                i5 = iA & i6;
                int i10 = iArr[i5];
                if (i10 == -1) {
                    break;
                }
                if (objArr[i10].equals(obj)) {
                    throw new java.lang.IllegalArgumentException("Multiple entries with same key: " + obj + com.ironsource.y8.i.b + obj2 + " and " + objArr[i10] + com.ironsource.y8.i.b + objArr[i10 ^ 1]);
                }
                iA = i5 + 1;
            }
            iArr[i5] = i9;
        }
        return iArr;
    }

    static class a extends com.applovin.impl.hb {
        private final transient com.applovin.impl.fb c;
        private final transient java.lang.Object[] d;
        private final transient int f;
        private final transient int g;

        @Override // com.applovin.impl.bb
        boolean e() {
            return true;
        }

        @Override // com.applovin.impl.hb
        com.applovin.impl.db f() {
            return new com.applovin.impl.ni.a.C0044a();
        }

        a(com.applovin.impl.fb fbVar, java.lang.Object[] objArr, int i, int i2) {
            this.c = fbVar;
            this.d = objArr;
            this.f = i;
            this.g = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public com.applovin.impl.pp iterator() {
            return a().iterator();
        }

        /* JADX INFO: renamed from: com.applovin.impl.ni$a$a, reason: collision with other inner class name */
        class C0044a extends com.applovin.impl.db {
            @Override // com.applovin.impl.bb
            public boolean e() {
                return true;
            }

            C0044a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public java.util.Map.Entry get(int i) {
                com.applovin.exoplayer2.common.base.Preconditions.checkElementIndex(i, com.applovin.impl.ni.a.this.g);
                int i2 = i * 2;
                return new java.util.AbstractMap.SimpleImmutableEntry(com.applovin.impl.ni.a.this.d[com.applovin.impl.ni.a.this.f + i2], com.applovin.impl.ni.a.this.d[i2 + (com.applovin.impl.ni.a.this.f ^ 1)]);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return com.applovin.impl.ni.a.this.g;
            }
        }

        @Override // com.applovin.impl.bb, java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            return value != null && value.equals(this.c.get(key));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.g;
        }

        @Override // com.applovin.impl.bb
        int a(java.lang.Object[] objArr, int i) {
            return a().a(objArr, i);
        }
    }

    static final class c extends com.applovin.impl.db {
        private final transient java.lang.Object[] c;
        private final transient int d;
        private final transient int f;

        @Override // com.applovin.impl.bb
        boolean e() {
            return true;
        }

        c(java.lang.Object[] objArr, int i, int i2) {
            this.c = objArr;
            this.d = i;
            this.f = i2;
        }

        @Override // java.util.List
        public java.lang.Object get(int i) {
            com.applovin.exoplayer2.common.base.Preconditions.checkElementIndex(i, this.f);
            return this.c[(i * 2) + this.d];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f;
        }
    }

    static final class b extends com.applovin.impl.hb {
        private final transient com.applovin.impl.fb c;
        private final transient com.applovin.impl.db d;

        @Override // com.applovin.impl.bb
        boolean e() {
            return true;
        }

        b(com.applovin.impl.fb fbVar, com.applovin.impl.db dbVar) {
            this.c = fbVar;
            this.d = dbVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public com.applovin.impl.pp iterator() {
            return a().iterator();
        }

        @Override // com.applovin.impl.hb, com.applovin.impl.bb
        public com.applovin.impl.db a() {
            return this.d;
        }

        @Override // com.applovin.impl.bb, java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return this.c.get(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.c.size();
        }

        @Override // com.applovin.impl.bb
        int a(java.lang.Object[] objArr, int i) {
            return a().a(objArr, i);
        }
    }

    static java.lang.Object a(int[] iArr, java.lang.Object[] objArr, int i2, int i3, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (i2 == 1) {
            if (objArr[i3].equals(obj)) {
                return objArr[i3 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int iA = com.applovin.impl.ja.a(obj.hashCode());
        while (true) {
            int i4 = iA & length;
            int i5 = iArr[i4];
            if (i5 == -1) {
                return null;
            }
            if (objArr[i5].equals(obj)) {
                return objArr[i5 ^ 1];
            }
            iA = i4 + 1;
        }
    }
}
