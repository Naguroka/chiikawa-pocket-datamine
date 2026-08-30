package com.bykv.vk.openvk.preload.a.b;

/* JADX INFO: compiled from: LinkedTreeMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    private static final java.util.Comparator<java.lang.Comparable> d = new java.util.Comparator<java.lang.Comparable>() { // from class: com.bykv.vk.openvk.preload.a.b.g.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    private static /* synthetic */ boolean i = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f1669a;
    int b;
    final com.bykv.vk.openvk.preload.a.b.g.d<K, V> c;
    private java.util.Comparator<? super K> e;
    private com.bykv.vk.openvk.preload.a.b.g.d<K, V> f;
    private com.bykv.vk.openvk.preload.a.b.g<K, V>.a g;
    private com.bykv.vk.openvk.preload.a.b.g<K, V>.b h;

    public g() {
        this(d);
    }

    private g(java.util.Comparator<? super K> comparator) {
        this.f1669a = 0;
        this.b = 0;
        this.c = new com.bykv.vk.openvk.preload.a.b.g.d<>();
        this.e = comparator == null ? d : comparator;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1669a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object obj) {
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVarB = b(obj);
        if (dVarB != null) {
            return dVarB.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return b(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVarA = a((java.lang.Object) k, true);
        V v2 = dVarA.g;
        dVarA.g = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f = null;
        this.f1669a = 0;
        this.b++;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar = this.c;
        dVar.e = dVar;
        dVar.d = dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVarA = a(obj);
        if (dVarA != null) {
            return dVarA.g;
        }
        return null;
    }

    private com.bykv.vk.openvk.preload.a.b.g.d<K, V> a(K k, boolean z) {
        int iCompare;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar;
        java.util.Comparator<? super K> comparator = this.e;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar2 = this.f;
        if (dVar2 != null) {
            java.lang.Comparable comparable = comparator == d ? (java.lang.Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    iCompare = comparable.compareTo(dVar2.f);
                } else {
                    iCompare = comparator.compare(k, dVar2.f);
                }
                if (iCompare != 0) {
                    com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar3 = iCompare < 0 ? dVar2.b : dVar2.c;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar2 = dVar3;
                } else {
                    return dVar2;
                }
            }
        } else {
            iCompare = 0;
        }
        if (!z) {
            return null;
        }
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar4 = this.c;
        if (dVar2 == null) {
            if (comparator == d && !(k instanceof java.lang.Comparable)) {
                throw new java.lang.ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            dVar = new com.bykv.vk.openvk.preload.a.b.g.d<>(dVar2, k, dVar4, dVar4.e);
            this.f = dVar;
        } else {
            dVar = new com.bykv.vk.openvk.preload.a.b.g.d<>(dVar2, k, dVar4, dVar4.e);
            if (iCompare < 0) {
                dVar2.b = dVar;
            } else {
                dVar2.c = dVar;
            }
            b(dVar2, true);
        }
        this.f1669a++;
        this.b++;
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.bykv.vk.openvk.preload.a.b.g.d<K, V> b(java.lang.Object obj) {
        if (obj != 0) {
            try {
                return a(obj, false);
            } catch (java.lang.ClassCastException unused) {
            }
        }
        return null;
    }

    final com.bykv.vk.openvk.preload.a.b.g.d<K, V> a(java.util.Map.Entry<?, ?> entry) {
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVarB = b(entry.getKey());
        boolean z = false;
        if (dVarB != null) {
            V v = dVarB.g;
            java.lang.Object value = entry.getValue();
            if (v == value || (v != null && v.equals(value))) {
                z = true;
            }
        }
        if (z) {
            return dVarB;
        }
        return null;
    }

    final void a(com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar, boolean z) {
        int i2;
        if (z) {
            dVar.e.d = dVar.d;
            dVar.d.e = dVar.e;
        }
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar2 = dVar.b;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar3 = dVar.c;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar4 = dVar.f1675a;
        int i3 = 0;
        if (dVar2 != null && dVar3 != null) {
            if (dVar2.h > dVar3.h) {
                com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar5 = dVar2.c;
                while (true) {
                    com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar6 = dVar5;
                    dVar3 = dVar2;
                    dVar2 = dVar6;
                    if (dVar2 == null) {
                        break;
                    } else {
                        dVar5 = dVar2.c;
                    }
                }
            } else {
                while (true) {
                    com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar7 = dVar3.b;
                    if (dVar7 == null) {
                        break;
                    } else {
                        dVar3 = dVar7;
                    }
                }
            }
            a((com.bykv.vk.openvk.preload.a.b.g.d) dVar3, false);
            com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar8 = dVar.b;
            if (dVar8 != null) {
                i2 = dVar8.h;
                dVar3.b = dVar8;
                dVar8.f1675a = dVar3;
                dVar.b = null;
            } else {
                i2 = 0;
            }
            com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar9 = dVar.c;
            if (dVar9 != null) {
                i3 = dVar9.h;
                dVar3.c = dVar9;
                dVar9.f1675a = dVar3;
                dVar.c = null;
            }
            dVar3.h = java.lang.Math.max(i2, i3) + 1;
            a(dVar, dVar3);
            return;
        }
        if (dVar2 != null) {
            a(dVar, dVar2);
            dVar.b = null;
        } else if (dVar3 != null) {
            a(dVar, dVar3);
            dVar.c = null;
        } else {
            a(dVar, (com.bykv.vk.openvk.preload.a.b.g.d) null);
        }
        b(dVar4, false);
        this.f1669a--;
        this.b++;
    }

    final com.bykv.vk.openvk.preload.a.b.g.d<K, V> a(java.lang.Object obj) {
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVarB = b(obj);
        if (dVarB != null) {
            a((com.bykv.vk.openvk.preload.a.b.g.d) dVarB, true);
        }
        return dVarB;
    }

    private void a(com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar, com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar2) {
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar3 = dVar.f1675a;
        dVar.f1675a = null;
        if (dVar2 != null) {
            dVar2.f1675a = dVar3;
        }
        if (dVar3 != null) {
            if (dVar3.b == dVar) {
                dVar3.b = dVar2;
                return;
            } else {
                if (!i && dVar3.c != dVar) {
                    throw new java.lang.AssertionError();
                }
                dVar3.c = dVar2;
                return;
            }
        }
        this.f = dVar2;
    }

    private void b(com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar, boolean z) {
        while (dVar != null) {
            com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar2 = dVar.b;
            com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar3 = dVar.c;
            int i2 = dVar2 != null ? dVar2.h : 0;
            int i3 = dVar3 != null ? dVar3.h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar4 = dVar3.b;
                com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar5 = dVar3.c;
                int i5 = (dVar4 != null ? dVar4.h : 0) - (dVar5 != null ? dVar5.h : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    a((com.bykv.vk.openvk.preload.a.b.g.d) dVar);
                } else {
                    if (!i && i5 != 1) {
                        throw new java.lang.AssertionError();
                    }
                    b((com.bykv.vk.openvk.preload.a.b.g.d) dVar3);
                    a((com.bykv.vk.openvk.preload.a.b.g.d) dVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar6 = dVar2.b;
                com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar7 = dVar2.c;
                int i6 = (dVar6 != null ? dVar6.h : 0) - (dVar7 != null ? dVar7.h : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    b((com.bykv.vk.openvk.preload.a.b.g.d) dVar);
                } else {
                    if (!i && i6 != -1) {
                        throw new java.lang.AssertionError();
                    }
                    a((com.bykv.vk.openvk.preload.a.b.g.d) dVar2);
                    b((com.bykv.vk.openvk.preload.a.b.g.d) dVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                dVar.h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                if (!i && i4 != -1 && i4 != 1) {
                    throw new java.lang.AssertionError();
                }
                dVar.h = java.lang.Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            dVar = dVar.f1675a;
        }
    }

    private void a(com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar) {
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar2 = dVar.b;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar3 = dVar.c;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar4 = dVar3.b;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar5 = dVar3.c;
        dVar.c = dVar4;
        if (dVar4 != null) {
            dVar4.f1675a = dVar;
        }
        a(dVar, dVar3);
        dVar3.b = dVar;
        dVar.f1675a = dVar3;
        dVar.h = java.lang.Math.max(dVar2 != null ? dVar2.h : 0, dVar4 != null ? dVar4.h : 0) + 1;
        dVar3.h = java.lang.Math.max(dVar.h, dVar5 != null ? dVar5.h : 0) + 1;
    }

    private void b(com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar) {
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar2 = dVar.b;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar3 = dVar.c;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar4 = dVar2.b;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar5 = dVar2.c;
        dVar.b = dVar5;
        if (dVar5 != null) {
            dVar5.f1675a = dVar;
        }
        a(dVar, dVar2);
        dVar2.c = dVar;
        dVar.f1675a = dVar2;
        dVar.h = java.lang.Math.max(dVar3 != null ? dVar3.h : 0, dVar5 != null ? dVar5.h : 0) + 1;
        dVar2.h = java.lang.Math.max(dVar.h, dVar4 != null ? dVar4.h : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        com.bykv.vk.openvk.preload.a.b.g<K, V>.a aVar = this.g;
        if (aVar != null) {
            return aVar;
        }
        com.bykv.vk.openvk.preload.a.b.g<K, V>.a aVar2 = new com.bykv.vk.openvk.preload.a.b.g.a();
        this.g = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        com.bykv.vk.openvk.preload.a.b.g<K, V>.b bVar = this.h;
        if (bVar != null) {
            return bVar;
        }
        com.bykv.vk.openvk.preload.a.b.g<K, V>.b bVar2 = new com.bykv.vk.openvk.preload.a.b.g.b();
        this.h = bVar2;
        return bVar2;
    }

    /* JADX INFO: compiled from: LinkedTreeMap.java */
    static final class d<K, V> implements java.util.Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> f1675a;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> b;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> c;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> d;
        com.bykv.vk.openvk.preload.a.b.g.d<K, V> e;
        final K f;
        V g;
        int h;

        d() {
            this.f = null;
            this.e = this;
            this.d = this;
        }

        d(com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar, K k, com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar2, com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar3) {
            this.f1675a = dVar;
            this.f = k;
            this.h = 1;
            this.d = dVar2;
            this.e = dVar3;
            dVar3.d = this;
            dVar2.e = this;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.g;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.g;
            this.g = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof java.util.Map.Entry) {
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                K k = this.f;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.g;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.g;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final java.lang.String toString() {
            return this.f + com.ironsource.y8.i.b + this.g;
        }
    }

    /* JADX INFO: compiled from: LinkedTreeMap.java */
    abstract class c<T> implements java.util.Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.g.d<K, V> f1674a;
        private com.bykv.vk.openvk.preload.a.b.g.d<K, V> b = null;
        private int c;

        c() {
            this.f1674a = com.bykv.vk.openvk.preload.a.b.g.this.c.d;
            this.c = com.bykv.vk.openvk.preload.a.b.g.this.b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f1674a != com.bykv.vk.openvk.preload.a.b.g.this.c;
        }

        final com.bykv.vk.openvk.preload.a.b.g.d<K, V> a() {
            com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar = this.f1674a;
            if (dVar == com.bykv.vk.openvk.preload.a.b.g.this.c) {
                throw new java.util.NoSuchElementException();
            }
            if (com.bykv.vk.openvk.preload.a.b.g.this.b != this.c) {
                throw new java.util.ConcurrentModificationException();
            }
            this.f1674a = dVar.d;
            this.b = dVar;
            return dVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVar = this.b;
            if (dVar == null) {
                throw new java.lang.IllegalStateException();
            }
            com.bykv.vk.openvk.preload.a.b.g.this.a((com.bykv.vk.openvk.preload.a.b.g.d) dVar, true);
            this.b = null;
            this.c = com.bykv.vk.openvk.preload.a.b.g.this.b;
        }
    }

    /* JADX INFO: compiled from: LinkedTreeMap.java */
    class a extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.bykv.vk.openvk.preload.a.b.g.this.f1669a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new com.bykv.vk.openvk.preload.a.b.g<K, V>.c<java.util.Map.Entry<K, V>>() { // from class: com.bykv.vk.openvk.preload.a.b.g.a.1
                {
                    com.bykv.vk.openvk.preload.a.b.g gVar = com.bykv.vk.openvk.preload.a.b.g.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ java.lang.Object next() {
                    return a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return (obj instanceof java.util.Map.Entry) && com.bykv.vk.openvk.preload.a.b.g.this.a((java.util.Map.Entry<?, ?>) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            com.bykv.vk.openvk.preload.a.b.g.d<K, V> dVarA;
            if (!(obj instanceof java.util.Map.Entry) || (dVarA = com.bykv.vk.openvk.preload.a.b.g.this.a((java.util.Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            com.bykv.vk.openvk.preload.a.b.g.this.a((com.bykv.vk.openvk.preload.a.b.g.d) dVarA, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.bykv.vk.openvk.preload.a.b.g.this.clear();
        }
    }

    /* JADX INFO: compiled from: LinkedTreeMap.java */
    final class b extends java.util.AbstractSet<K> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.bykv.vk.openvk.preload.a.b.g.this.f1669a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<K> iterator() {
            return new com.bykv.vk.openvk.preload.a.b.g<K, V>.c<K>() { // from class: com.bykv.vk.openvk.preload.a.b.g.b.1
                {
                    com.bykv.vk.openvk.preload.a.b.g gVar = com.bykv.vk.openvk.preload.a.b.g.this;
                }

                @Override // java.util.Iterator
                public final K next() {
                    return a().f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return com.bykv.vk.openvk.preload.a.b.g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            return com.bykv.vk.openvk.preload.a.b.g.this.a(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.bykv.vk.openvk.preload.a.b.g.this.clear();
        }
    }
}
