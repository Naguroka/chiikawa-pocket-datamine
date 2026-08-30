package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class f extends com.applovin.impl.h implements java.io.Serializable {
    private transient java.util.Map d;
    private transient int f;

    abstract java.util.Collection a(java.lang.Object obj, java.util.Collection collection);

    abstract java.util.Collection c(java.util.Collection collection);

    @Override // com.applovin.impl.h
    java.util.Collection d() {
        return new com.applovin.impl.h.a();
    }

    @Override // com.applovin.impl.h
    java.util.Iterator f() {
        return new com.applovin.impl.f.a();
    }

    abstract java.util.Collection g();

    static /* synthetic */ int b(com.applovin.impl.f fVar) {
        int i2 = fVar.f;
        fVar.f = i2 + 1;
        return i2;
    }

    static /* synthetic */ int c(com.applovin.impl.f fVar) {
        int i2 = fVar.f;
        fVar.f = i2 - 1;
        return i2;
    }

    protected f(java.util.Map map) {
        com.applovin.exoplayer2.common.base.Preconditions.checkArgument(map.isEmpty());
        this.d = map;
    }

    static /* synthetic */ int b(com.applovin.impl.f fVar, int i2) {
        int i3 = fVar.f - i2;
        fVar.f = i3;
        return i3;
    }

    @Override // com.applovin.impl.tf
    public int size() {
        return this.f;
    }

    @Override // com.applovin.impl.tf
    public boolean put(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection collection = (java.util.Collection) this.d.get(obj);
        if (collection == null) {
            java.util.Collection collectionB = b(obj);
            if (collectionB.add(obj2)) {
                this.f++;
                this.d.put(obj, collectionB);
                return true;
            }
            throw new java.lang.AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(obj2)) {
            return false;
        }
        this.f++;
        return true;
    }

    static /* synthetic */ int a(com.applovin.impl.f fVar, int i2) {
        int i3 = fVar.f + i2;
        fVar.f = i3;
        return i3;
    }

    @Override // com.applovin.impl.tf
    public void clear() {
        java.util.Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((java.util.Collection) it.next()).clear();
        }
        this.d.clear();
        this.f = 0;
    }

    class j extends java.util.AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.Object f775a;
        java.util.Collection b;
        final com.applovin.impl.f.j c;
        final java.util.Collection d;

        j(java.lang.Object obj, java.util.Collection collection, com.applovin.impl.f.j jVar) {
            this.f775a = obj;
            this.b = collection;
            this.c = jVar;
            this.d = jVar == null ? null : jVar.c();
        }

        void e() {
            java.util.Collection collection;
            com.applovin.impl.f.j jVar = this.c;
            if (jVar != null) {
                jVar.e();
                if (this.c.c() != this.d) {
                    throw new java.util.ConcurrentModificationException();
                }
            } else {
                if (!this.b.isEmpty() || (collection = (java.util.Collection) com.applovin.impl.f.this.d.get(this.f775a)) == null) {
                    return;
                }
                this.b = collection;
            }
        }

        void f() {
            com.applovin.impl.f.j jVar = this.c;
            if (jVar != null) {
                jVar.f();
            } else if (this.b.isEmpty()) {
                com.applovin.impl.f.this.d.remove(this.f775a);
            }
        }

        java.lang.Object d() {
            return this.f775a;
        }

        void a() {
            com.applovin.impl.f.j jVar = this.c;
            if (jVar == null) {
                com.applovin.impl.f.this.d.put(this.f775a, this.b);
            } else {
                jVar.a();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            e();
            return this.b.size();
        }

        @Override // java.util.Collection
        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.b.equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            e();
            return this.b.hashCode();
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            e();
            return this.b.toString();
        }

        java.util.Collection c() {
            return this.b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            e();
            return new com.applovin.impl.f.j.a();
        }

        class a implements java.util.Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final java.util.Iterator f776a;
            final java.util.Collection b;

            a() {
                java.util.Collection collection = com.applovin.impl.f.j.this.b;
                this.b = collection;
                this.f776a = com.applovin.impl.f.b(collection);
            }

            void b() {
                com.applovin.impl.f.j.this.e();
                if (com.applovin.impl.f.j.this.b != this.b) {
                    throw new java.util.ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f776a.hasNext();
            }

            @Override // java.util.Iterator
            public java.lang.Object next() {
                b();
                return this.f776a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f776a.remove();
                com.applovin.impl.f.c(com.applovin.impl.f.this);
                com.applovin.impl.f.j.this.f();
            }

            java.util.Iterator a() {
                b();
                return this.f776a;
            }

            a(java.util.Iterator it) {
                this.b = com.applovin.impl.f.j.this.b;
                this.f776a = it;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(java.lang.Object obj) {
            e();
            boolean zIsEmpty = this.b.isEmpty();
            boolean zAdd = this.b.add(obj);
            if (zAdd) {
                com.applovin.impl.f.b(com.applovin.impl.f.this);
                if (zIsEmpty) {
                    a();
                }
            }
            return zAdd;
        }

        com.applovin.impl.f.j b() {
            return this.c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(java.util.Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.b.addAll(collection);
            if (zAddAll) {
                com.applovin.impl.f.a(com.applovin.impl.f.this, this.b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            e();
            return this.b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(java.util.Collection collection) {
            e();
            return this.b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.b.clear();
            com.applovin.impl.f.b(com.applovin.impl.f.this, size);
            f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            e();
            boolean zRemove = this.b.remove(obj);
            if (zRemove) {
                com.applovin.impl.f.c(com.applovin.impl.f.this);
                f();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.b.removeAll(collection);
            if (zRemoveAll) {
                com.applovin.impl.f.a(com.applovin.impl.f.this, this.b.size() - size);
                f();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection collection) {
            com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(collection);
            int size = size();
            boolean zRetainAll = this.b.retainAll(collection);
            if (zRetainAll) {
                com.applovin.impl.f.a(com.applovin.impl.f.this, this.b.size() - size);
                f();
            }
            return zRetainAll;
        }
    }

    java.util.Collection b(java.lang.Object obj) {
        return g();
    }

    final java.util.List a(java.lang.Object obj, java.util.List list, com.applovin.impl.f.j jVar) {
        if (list instanceof java.util.RandomAccess) {
            return new com.applovin.impl.f.g(obj, list, jVar);
        }
        return new com.applovin.impl.f.k(obj, list, jVar);
    }

    class k extends com.applovin.impl.f.j implements java.util.List {
        k(java.lang.Object obj, java.util.List list, com.applovin.impl.f.j jVar) {
            super(obj, list, jVar);
        }

        java.util.List g() {
            return (java.util.List) c();
        }

        @Override // java.util.List
        public boolean addAll(int i, java.util.Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = g().addAll(i, collection);
            if (zAddAll) {
                com.applovin.impl.f.a(com.applovin.impl.f.this, c().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public java.lang.Object get(int i) {
            e();
            return g().get(i);
        }

        @Override // java.util.List
        public java.lang.Object set(int i, java.lang.Object obj) {
            e();
            return g().set(i, obj);
        }

        @Override // java.util.List
        public void add(int i, java.lang.Object obj) {
            e();
            boolean zIsEmpty = c().isEmpty();
            g().add(i, obj);
            com.applovin.impl.f.b(com.applovin.impl.f.this);
            if (zIsEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public java.lang.Object remove(int i) {
            e();
            java.lang.Object objRemove = g().remove(i);
            com.applovin.impl.f.c(com.applovin.impl.f.this);
            f();
            return objRemove;
        }

        @Override // java.util.List
        public int indexOf(java.lang.Object obj) {
            e();
            return g().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(java.lang.Object obj) {
            e();
            return g().lastIndexOf(obj);
        }

        @Override // java.util.List
        public java.util.ListIterator listIterator() {
            e();
            return new com.applovin.impl.f.k.a();
        }

        @Override // java.util.List
        public java.util.List subList(int i, int i2) {
            e();
            return com.applovin.impl.f.this.a(d(), g().subList(i, i2), b() == null ? this : b());
        }

        private class a extends com.applovin.impl.f.j.a implements java.util.ListIterator {
            a() {
                super();
            }

            private java.util.ListIterator c() {
                return (java.util.ListIterator) a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public java.lang.Object previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(java.lang.Object obj) {
                c().set(obj);
            }

            @Override // java.util.ListIterator
            public void add(java.lang.Object obj) {
                boolean zIsEmpty = com.applovin.impl.f.k.this.isEmpty();
                c().add(obj);
                com.applovin.impl.f.b(com.applovin.impl.f.this);
                if (zIsEmpty) {
                    com.applovin.impl.f.k.this.a();
                }
            }

            public a(int i) {
                super(com.applovin.impl.f.k.this.g().listIterator(i));
            }
        }

        @Override // java.util.List
        public java.util.ListIterator listIterator(int i) {
            e();
            return new com.applovin.impl.f.k.a(i);
        }
    }

    private class g extends com.applovin.impl.f.k implements java.util.RandomAccess {
        g(java.lang.Object obj, java.util.List list, com.applovin.impl.f.j jVar) {
            super(obj, list, jVar);
        }
    }

    final java.util.Set i() {
        java.util.Map map = this.d;
        if (map instanceof java.util.NavigableMap) {
            return new com.applovin.impl.f.C0034f((java.util.NavigableMap) this.d);
        }
        if (map instanceof java.util.SortedMap) {
            return new com.applovin.impl.f.i((java.util.SortedMap) this.d);
        }
        return new com.applovin.impl.f.d(this.d);
    }

    private class d extends com.applovin.impl.uc.d {
        d(java.util.Map map) {
            super(map);
        }

        class a implements java.util.Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            java.util.Map.Entry f774a;
            final /* synthetic */ java.util.Iterator b;

            a(java.util.Iterator it) {
                this.b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.b.hasNext();
            }

            @Override // java.util.Iterator
            public java.lang.Object next() {
                java.util.Map.Entry entry = (java.util.Map.Entry) this.b.next();
                this.f774a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.applovin.impl.p3.a(this.f774a != null);
                java.util.Collection collection = (java.util.Collection) this.f774a.getValue();
                this.b.remove();
                com.applovin.impl.f.b(com.applovin.impl.f.this, collection.size());
                collection.clear();
                this.f774a = null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
            return new com.applovin.impl.f.d.a(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            java.util.Collection collection = (java.util.Collection) a().remove(obj);
            if (collection != null) {
                int size = collection.size();
                collection.clear();
                com.applovin.impl.f.b(com.applovin.impl.f.this, size);
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.applovin.impl.wb.a(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection collection) {
            return a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(java.lang.Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return a().keySet().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Iterator b(java.util.Collection collection) {
        if (collection instanceof java.util.List) {
            return ((java.util.List) collection).listIterator();
        }
        return collection.iterator();
    }

    private class i extends com.applovin.impl.f.d implements java.util.SortedSet {
        public java.util.SortedSet headSet(java.lang.Object obj) {
            return com.applovin.impl.f.this.new i(b().headMap(obj));
        }

        public java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
            return com.applovin.impl.f.this.new i(b().subMap(obj, obj2));
        }

        public java.util.SortedSet tailSet(java.lang.Object obj) {
            return com.applovin.impl.f.this.new i(b().tailMap(obj));
        }

        i(java.util.SortedMap sortedMap) {
            super(sortedMap);
        }

        java.util.SortedMap b() {
            return (java.util.SortedMap) super.a();
        }

        @Override // java.util.SortedSet
        public java.util.Comparator comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public java.lang.Object first() {
            return b().firstKey();
        }

        @Override // java.util.SortedSet
        public java.lang.Object last() {
            return b().lastKey();
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.f$f, reason: collision with other inner class name */
    class C0034f extends com.applovin.impl.f.i implements java.util.NavigableSet {
        @Override // java.util.NavigableSet
        public java.util.NavigableSet descendingSet() {
            return com.applovin.impl.f.this.new C0034f(b().descendingMap());
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet headSet(java.lang.Object obj, boolean z) {
            return com.applovin.impl.f.this.new C0034f(b().headMap(obj, z));
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet subSet(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
            return com.applovin.impl.f.this.new C0034f(b().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet tailSet(java.lang.Object obj, boolean z) {
            return com.applovin.impl.f.this.new C0034f(b().tailMap(obj, z));
        }

        C0034f(java.util.NavigableMap navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.impl.f.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public java.util.NavigableMap b() {
            return (java.util.NavigableMap) super.b();
        }

        @Override // java.util.NavigableSet
        public java.lang.Object lower(java.lang.Object obj) {
            return b().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public java.lang.Object floor(java.lang.Object obj) {
            return b().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public java.lang.Object ceiling(java.lang.Object obj) {
            return b().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public java.lang.Object higher(java.lang.Object obj) {
            return b().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public java.lang.Object pollFirst() {
            return com.applovin.impl.wb.c(iterator());
        }

        @Override // java.util.NavigableSet
        public java.lang.Object pollLast() {
            return com.applovin.impl.wb.c(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // com.applovin.impl.f.i, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.NavigableSet headSet(java.lang.Object obj) {
            return headSet(obj, false);
        }

        @Override // com.applovin.impl.f.i, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.util.NavigableSet tailSet(java.lang.Object obj) {
            return tailSet(obj, true);
        }

        @Override // com.applovin.impl.f.i, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.NavigableSet subSet(java.lang.Object obj, java.lang.Object obj2) {
            return subSet(obj, true, obj2, false);
        }
    }

    private abstract class c implements java.util.Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.util.Iterator f773a;
        java.lang.Object b = null;
        java.util.Collection c = null;
        java.util.Iterator d = com.applovin.impl.wb.c();

        abstract java.lang.Object a(java.lang.Object obj, java.lang.Object obj2);

        c() {
            this.f773a = com.applovin.impl.f.this.d.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f773a.hasNext() || this.d.hasNext();
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            if (!this.d.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) this.f773a.next();
                this.b = entry.getKey();
                java.util.Collection collection = (java.util.Collection) entry.getValue();
                this.c = collection;
                this.d = collection.iterator();
            }
            return a(this.b, this.d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.d.remove();
            if (this.c.isEmpty()) {
                this.f773a.remove();
            }
            com.applovin.impl.f.c(com.applovin.impl.f.this);
        }
    }

    @Override // com.applovin.impl.h, com.applovin.impl.tf
    public java.util.Collection values() {
        return super.values();
    }

    class a extends com.applovin.impl.f.c {
        @Override // com.applovin.impl.f.c
        java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
            return obj2;
        }

        a() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) com.applovin.impl.uc.d(this.d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f -= size;
        }
    }

    final java.util.Map h() {
        java.util.Map map = this.d;
        if (map instanceof java.util.NavigableMap) {
            return new com.applovin.impl.f.e((java.util.NavigableMap) this.d);
        }
        if (map instanceof java.util.SortedMap) {
            return new com.applovin.impl.f.h((java.util.SortedMap) this.d);
        }
        return new com.applovin.impl.f.b(this.d);
    }

    private class b extends com.applovin.impl.uc.f {
        final transient java.util.Map c;

        b(java.util.Map map) {
            this.c = map;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(java.lang.Object obj) {
            return com.applovin.impl.uc.b(this.c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set keySet() {
            return com.applovin.impl.f.this.e();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.c.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(java.lang.Object obj) {
            return this == obj || this.c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.c.hashCode();
        }

        @Override // java.util.AbstractMap
        public java.lang.String toString() {
            return this.c.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.c == com.applovin.impl.f.this.d) {
                com.applovin.impl.f.this.clear();
            } else {
                com.applovin.impl.wb.a((java.util.Iterator) new com.applovin.impl.f.b.C0033b());
            }
        }

        java.util.Map.Entry a(java.util.Map.Entry entry) {
            java.lang.Object key = entry.getKey();
            return com.applovin.impl.uc.a(key, com.applovin.impl.f.this.a(key, (java.util.Collection) entry.getValue()));
        }

        @Override // com.applovin.impl.uc.f
        protected java.util.Set a() {
            return new com.applovin.impl.f.b.a();
        }

        class a extends com.applovin.impl.uc.c {
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator iterator() {
                return com.applovin.impl.f.b.this.new C0033b();
            }

            a() {
            }

            @Override // com.applovin.impl.uc.c
            java.util.Map a() {
                return com.applovin.impl.f.b.this;
            }

            @Override // com.applovin.impl.uc.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                return com.applovin.impl.q3.a(com.applovin.impl.f.b.this.c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(java.lang.Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                com.applovin.impl.f.this.c(((java.util.Map.Entry) obj).getKey());
                return true;
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.f$b$b, reason: collision with other inner class name */
        class C0033b implements java.util.Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final java.util.Iterator f772a;
            java.util.Collection b;

            C0033b() {
                this.f772a = com.applovin.impl.f.b.this.c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f772a.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.util.Map.Entry next() {
                java.util.Map.Entry entry = (java.util.Map.Entry) this.f772a.next();
                this.b = (java.util.Collection) entry.getValue();
                return com.applovin.impl.f.b.this.a(entry);
            }

            @Override // java.util.Iterator
            public void remove() {
                com.applovin.impl.p3.a(this.b != null);
                this.f772a.remove();
                com.applovin.impl.f.b(com.applovin.impl.f.this, this.b.size());
                this.b.clear();
                this.b = null;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Collection get(java.lang.Object obj) {
            java.util.Collection collection = (java.util.Collection) com.applovin.impl.uc.c(this.c, obj);
            if (collection == null) {
                return null;
            }
            return com.applovin.impl.f.this.a(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Collection remove(java.lang.Object obj) {
            java.util.Collection collection = (java.util.Collection) this.c.remove(obj);
            if (collection == null) {
                return null;
            }
            java.util.Collection collectionG = com.applovin.impl.f.this.g();
            collectionG.addAll(collection);
            com.applovin.impl.f.b(com.applovin.impl.f.this, collection.size());
            collection.clear();
            return collectionG;
        }
    }

    private class h extends com.applovin.impl.f.b implements java.util.SortedMap {
        java.util.SortedSet f;

        java.util.SortedSet c() {
            return com.applovin.impl.f.this.new i(d());
        }

        public java.util.SortedMap headMap(java.lang.Object obj) {
            return com.applovin.impl.f.this.new h(d().headMap(obj));
        }

        public java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
            return com.applovin.impl.f.this.new h(d().subMap(obj, obj2));
        }

        public java.util.SortedMap tailMap(java.lang.Object obj) {
            return com.applovin.impl.f.this.new h(d().tailMap(obj));
        }

        h(java.util.SortedMap sortedMap) {
            super(sortedMap);
        }

        java.util.SortedMap d() {
            return (java.util.SortedMap) this.c;
        }

        @Override // java.util.SortedMap
        public java.util.Comparator comparator() {
            return d().comparator();
        }

        @Override // java.util.SortedMap
        public java.lang.Object firstKey() {
            return d().firstKey();
        }

        @Override // java.util.SortedMap
        public java.lang.Object lastKey() {
            return d().lastKey();
        }

        @Override // com.applovin.impl.f.b, java.util.AbstractMap, java.util.Map
        public java.util.SortedSet keySet() {
            java.util.SortedSet sortedSet = this.f;
            if (sortedSet != null) {
                return sortedSet;
            }
            java.util.SortedSet sortedSetC = c();
            this.f = sortedSetC;
            return sortedSetC;
        }
    }

    class e extends com.applovin.impl.f.h implements java.util.NavigableMap {
        @Override // java.util.NavigableMap
        public java.util.NavigableMap descendingMap() {
            return com.applovin.impl.f.this.new e(d().descendingMap());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.impl.f.h
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.util.NavigableSet c() {
            return com.applovin.impl.f.this.new C0034f(d());
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap headMap(java.lang.Object obj, boolean z) {
            return com.applovin.impl.f.this.new e(d().headMap(obj, z));
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap subMap(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
            return com.applovin.impl.f.this.new e(d().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap tailMap(java.lang.Object obj, boolean z) {
            return com.applovin.impl.f.this.new e(d().tailMap(obj, z));
        }

        e(java.util.NavigableMap navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.impl.f.h
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public java.util.NavigableMap d() {
            return (java.util.NavigableMap) super.d();
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry lowerEntry(java.lang.Object obj) {
            java.util.Map.Entry entryLowerEntry = d().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return a(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public java.lang.Object lowerKey(java.lang.Object obj) {
            return d().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry floorEntry(java.lang.Object obj) {
            java.util.Map.Entry entryFloorEntry = d().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return a(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public java.lang.Object floorKey(java.lang.Object obj) {
            return d().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry ceilingEntry(java.lang.Object obj) {
            java.util.Map.Entry entryCeilingEntry = d().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return a(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public java.lang.Object ceilingKey(java.lang.Object obj) {
            return d().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry higherEntry(java.lang.Object obj) {
            java.util.Map.Entry entryHigherEntry = d().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return a(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public java.lang.Object higherKey(java.lang.Object obj) {
            return d().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry firstEntry() {
            java.util.Map.Entry entryFirstEntry = d().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return a(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry lastEntry() {
            java.util.Map.Entry entryLastEntry = d().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return a(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry pollFirstEntry() {
            return a(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry pollLastEntry() {
            return a(descendingMap().entrySet().iterator());
        }

        @Override // com.applovin.impl.f.h, com.applovin.impl.f.b, java.util.AbstractMap, java.util.Map
        public java.util.NavigableSet keySet() {
            return (java.util.NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // com.applovin.impl.f.h, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.NavigableMap headMap(java.lang.Object obj) {
            return headMap(obj, false);
        }

        @Override // com.applovin.impl.f.h, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.util.NavigableMap tailMap(java.lang.Object obj) {
            return tailMap(obj, true);
        }

        java.util.Map.Entry a(java.util.Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.util.Collection collectionG = com.applovin.impl.f.this.g();
            collectionG.addAll((java.util.Collection) entry.getValue());
            it.remove();
            return com.applovin.impl.uc.a(entry.getKey(), com.applovin.impl.f.this.c(collectionG));
        }

        @Override // com.applovin.impl.f.h, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.NavigableMap subMap(java.lang.Object obj, java.lang.Object obj2) {
            return subMap(obj, true, obj2, false);
        }
    }
}
