package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uc {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class b implements com.applovin.exoplayer2.common.base.Function {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.applovin.impl.uc.b f1398a = new com.applovin.impl.uc.b.a("KEY", 0);
        public static final com.applovin.impl.uc.b b = new com.applovin.impl.uc.b.C0056b("VALUE", 1);
        private static final /* synthetic */ com.applovin.impl.uc.b[] c = a();

        public static com.applovin.impl.uc.b valueOf(java.lang.String str) {
            return (com.applovin.impl.uc.b) java.lang.Enum.valueOf(com.applovin.impl.uc.b.class, str);
        }

        public static com.applovin.impl.uc.b[] values() {
            return (com.applovin.impl.uc.b[]) c.clone();
        }

        final enum a extends com.applovin.impl.uc.b {
            a(java.lang.String str, int i) {
                super(str, i, null);
            }

            @Override // com.applovin.exoplayer2.common.base.Function
            public java.lang.Object apply(java.util.Map.Entry entry) {
                return entry.getKey();
            }
        }

        private b(java.lang.String str, int i) {
            super(str, i);
        }

        private static /* synthetic */ com.applovin.impl.uc.b[] a() {
            return new com.applovin.impl.uc.b[]{f1398a, b};
        }

        /* JADX INFO: renamed from: com.applovin.impl.uc$b$b, reason: collision with other inner class name */
        final enum C0056b extends com.applovin.impl.uc.b {
            C0056b(java.lang.String str, int i) {
                super(str, i, null);
            }

            @Override // com.applovin.exoplayer2.common.base.Function
            public java.lang.Object apply(java.util.Map.Entry entry) {
                return entry.getValue();
            }
        }

        /* synthetic */ b(java.lang.String str, int i, com.applovin.impl.tc tcVar) {
            this(str, i);
        }
    }

    class a extends com.applovin.impl.yo {
        a(java.util.Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.impl.yo
        public java.lang.Object a(java.util.Map.Entry entry) {
            return entry.getValue();
        }
    }

    static int a(int i) {
        if (i < 3) {
            com.applovin.impl.p3.a(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    static abstract class f extends java.util.AbstractMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient java.util.Set f1401a;
        private transient java.util.Collection b;

        abstract java.util.Set a();

        java.util.Collection b() {
            return new com.applovin.impl.uc.e(this);
        }

        f() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set entrySet() {
            java.util.Set set = this.f1401a;
            if (set != null) {
                return set;
            }
            java.util.Set setA = a();
            this.f1401a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Collection values() {
            java.util.Collection collection = this.b;
            if (collection != null) {
                return collection;
            }
            java.util.Collection collectionB = b();
            this.b = collectionB;
            return collectionB;
        }
    }

    static java.lang.Object c(java.util.Map map, java.lang.Object obj) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return null;
        }
    }

    static com.applovin.exoplayer2.common.base.Function c() {
        return com.applovin.impl.uc.b.b;
    }

    static boolean b(java.util.Map map, java.lang.Object obj) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    public static java.util.IdentityHashMap b() {
        return new java.util.IdentityHashMap();
    }

    static java.lang.Object d(java.util.Map map, java.lang.Object obj) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return null;
        }
    }

    static class d extends com.applovin.impl.rj.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.util.Map f1399a;

        d(java.util.Map map) {
            this.f1399a = (java.util.Map) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(map);
        }

        java.util.Map a() {
            return this.f1399a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return a().containsKey(obj);
        }
    }

    static class e extends java.util.AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.util.Map f1400a;

        e(java.util.Map map) {
            this.f1400a = (java.util.Map) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(map);
        }

        final java.util.Map a() {
            return this.f1400a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            return com.applovin.impl.uc.a(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            try {
                return super.remove(obj);
            } catch (java.lang.UnsupportedOperationException unused) {
                for (java.util.Map.Entry entry : a().entrySet()) {
                    if (com.applovin.exoplayer2.common.base.Objects.equal(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection collection) {
            try {
                return super.removeAll((java.util.Collection) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(collection));
            } catch (java.lang.UnsupportedOperationException unused) {
                java.util.HashSet hashSetA = com.applovin.impl.rj.a();
                for (java.util.Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetA.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(hashSetA);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection collection) {
            try {
                return super.retainAll((java.util.Collection) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(collection));
            } catch (java.lang.UnsupportedOperationException unused) {
                java.util.HashSet hashSetA = com.applovin.impl.rj.a();
                for (java.util.Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetA.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(hashSetA);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }
    }

    static boolean a(java.util.Map map, java.lang.Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return map.entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    static abstract class c extends com.applovin.impl.rj.b {
        abstract java.util.Map a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(java.lang.Object obj);

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // com.applovin.impl.rj.b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection collection) {
            try {
                return super.removeAll((java.util.Collection) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(collection));
            } catch (java.lang.UnsupportedOperationException unused) {
                return com.applovin.impl.rj.a((java.util.Set) this, collection.iterator());
            }
        }

        @Override // com.applovin.impl.rj.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection collection) {
            try {
                return super.retainAll((java.util.Collection) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(collection));
            } catch (java.lang.UnsupportedOperationException unused) {
                java.util.HashSet hashSetA = com.applovin.impl.rj.a(collection.size());
                for (java.lang.Object obj : collection) {
                    if (contains(obj)) {
                        hashSetA.add(((java.util.Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(hashSetA);
            }
        }
    }

    static java.lang.String a(java.util.Map map) {
        java.lang.StringBuilder sbAppend = com.applovin.impl.q3.a(map.size()).append('{');
        boolean z = true;
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (!z) {
                sbAppend.append(", ");
            }
            sbAppend.append(entry.getKey()).append('=').append(entry.getValue());
            z = false;
        }
        return sbAppend.append('}').toString();
    }

    static com.applovin.exoplayer2.common.base.Function a() {
        return com.applovin.impl.uc.b.f1398a;
    }

    static java.util.Iterator a(java.util.Iterator it) {
        return new com.applovin.impl.uc.a(it);
    }

    public static java.util.Map.Entry a(java.lang.Object obj, java.lang.Object obj2) {
        return new com.applovin.impl.cb(obj, obj2);
    }
}
