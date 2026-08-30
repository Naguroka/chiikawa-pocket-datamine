package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fb implements java.util.Map, java.io.Serializable {
    static final java.util.Map.Entry[] d = new java.util.Map.Entry[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient com.applovin.impl.hb f786a;
    private transient com.applovin.impl.hb b;
    private transient com.applovin.impl.bb c;

    fb() {
    }

    public static com.applovin.impl.fb h() {
        return com.applovin.impl.ni.i;
    }

    abstract com.applovin.impl.hb b();

    abstract com.applovin.impl.hb c();

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    abstract com.applovin.impl.bb d();

    abstract boolean f();

    @Override // java.util.Map
    public abstract java.lang.Object get(java.lang.Object obj);

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.util.Comparator f787a;
        java.lang.Object[] b;
        int c;
        boolean d;

        public a() {
            this(4);
        }

        public com.applovin.impl.fb a() {
            b();
            this.d = true;
            return com.applovin.impl.ni.a(this.c, this.b);
        }

        void b() {
            int i;
            if (this.f787a != null) {
                if (this.d) {
                    this.b = java.util.Arrays.copyOf(this.b, this.c * 2);
                }
                java.util.Map.Entry[] entryArr = new java.util.Map.Entry[this.c];
                int i2 = 0;
                while (true) {
                    i = this.c;
                    if (i2 >= i) {
                        break;
                    }
                    java.lang.Object[] objArr = this.b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new java.util.AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                java.util.Arrays.sort(entryArr, 0, i, com.applovin.impl.vg.a(this.f787a).a(com.applovin.impl.uc.c()));
                for (int i4 = 0; i4 < this.c; i4++) {
                    int i5 = i4 * 2;
                    this.b[i5] = entryArr[i4].getKey();
                    this.b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        a(int i) {
            this.b = new java.lang.Object[i * 2];
            this.c = 0;
            this.d = false;
        }

        private void a(int i) {
            int i2 = i * 2;
            java.lang.Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = java.util.Arrays.copyOf(objArr, com.applovin.impl.bb.b.a(objArr.length, i2));
                this.d = false;
            }
        }

        public com.applovin.impl.fb.a a(java.lang.Object obj, java.lang.Object obj2) {
            a(this.c + 1);
            com.applovin.impl.p3.a(obj, obj2);
            java.lang.Object[] objArr = this.b;
            int i = this.c;
            int i2 = i * 2;
            objArr[i2] = obj;
            objArr[i2 + 1] = obj2;
            this.c = i + 1;
            return this;
        }

        public com.applovin.impl.fb.a a(java.util.Map.Entry entry) {
            return a(entry.getKey(), entry.getValue());
        }

        public com.applovin.impl.fb.a a(java.lang.Iterable iterable) {
            if (iterable instanceof java.util.Collection) {
                a(this.c + ((java.util.Collection) iterable).size());
            }
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a((java.util.Map.Entry) it.next());
            }
            return this;
        }
    }

    public static com.applovin.impl.fb a(java.lang.Iterable iterable) {
        com.applovin.impl.fb.a aVar = new com.applovin.impl.fb.a(iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : 4);
        aVar.a(iterable);
        return aVar.a();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.hb entrySet() {
        com.applovin.impl.hb hbVar = this.f786a;
        if (hbVar != null) {
            return hbVar;
        }
        com.applovin.impl.hb hbVarB = b();
        this.f786a = hbVarB;
        return hbVarB;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.hb keySet() {
        com.applovin.impl.hb hbVar = this.b;
        if (hbVar != null) {
            return hbVar;
        }
        com.applovin.impl.hb hbVarC = c();
        this.b = hbVarC;
        return hbVarC;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.bb values() {
        com.applovin.impl.bb bbVar = this.c;
        if (bbVar != null) {
            return bbVar;
        }
        com.applovin.impl.bb bbVarD = d();
        this.c = bbVarD;
        return bbVarD;
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return com.applovin.impl.uc.a((java.util.Map) this, obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return com.applovin.impl.rj.a(entrySet());
    }

    public java.lang.String toString() {
        return com.applovin.impl.uc.a(this);
    }

    public static com.applovin.impl.fb a(java.util.Map map) {
        if ((map instanceof com.applovin.impl.fb) && !(map instanceof java.util.SortedMap)) {
            com.applovin.impl.fb fbVar = (com.applovin.impl.fb) map;
            if (!fbVar.f()) {
                return fbVar;
            }
        }
        return a(map.entrySet());
    }

    public static com.applovin.impl.fb.a a() {
        return new com.applovin.impl.fb.a();
    }
}
