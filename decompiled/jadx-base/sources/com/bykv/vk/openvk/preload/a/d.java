package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: Gson.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.bykv.vk.openvk.preload.a.c.a<?> f1680a = com.bykv.vk.openvk.preload.a.c.a.a(java.lang.Object.class);
    private final java.lang.ThreadLocal<java.util.Map<com.bykv.vk.openvk.preload.a.c.a<?>, com.bykv.vk.openvk.preload.a.d.a<?>>> b;
    private final java.util.Map<com.bykv.vk.openvk.preload.a.c.a<?>, com.bykv.vk.openvk.preload.a.q<?>> c;
    private final com.bykv.vk.openvk.preload.a.b.b d;
    private final com.bykv.vk.openvk.preload.a.b.a.d e;
    private java.util.List<com.bykv.vk.openvk.preload.a.r> f;
    private com.bykv.vk.openvk.preload.a.b.c g;
    private com.bykv.vk.openvk.preload.a.c h;
    private java.util.Map<java.lang.reflect.Type, com.bykv.vk.openvk.preload.geckox.a.a.c<?>> i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private java.lang.String q;
    private int r;
    private int s;
    private com.bykv.vk.openvk.preload.a.p t;
    private java.util.List<com.bykv.vk.openvk.preload.a.r> u;
    private java.util.List<com.bykv.vk.openvk.preload.a.r> v;

    public d() {
        this(com.bykv.vk.openvk.preload.a.b.c.f1664a, com.bykv.vk.openvk.preload.a.b.f1614a, java.util.Collections.emptyMap(), true, com.bykv.vk.openvk.preload.a.p.f1694a, 2, 2, java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList());
    }

    d(com.bykv.vk.openvk.preload.a.b.c cVar, com.bykv.vk.openvk.preload.a.c cVar2, java.util.Map<java.lang.reflect.Type, com.bykv.vk.openvk.preload.geckox.a.a.c<?>> map, boolean z, com.bykv.vk.openvk.preload.a.p pVar, int i, int i2, java.util.List<com.bykv.vk.openvk.preload.a.r> list, java.util.List<com.bykv.vk.openvk.preload.a.r> list2, java.util.List<com.bykv.vk.openvk.preload.a.r> list3) {
        final com.bykv.vk.openvk.preload.a.q<java.lang.Number> qVar;
        this.b = new java.lang.ThreadLocal<>();
        this.c = new java.util.concurrent.ConcurrentHashMap();
        this.g = cVar;
        this.h = cVar2;
        this.i = map;
        com.bykv.vk.openvk.preload.a.b.b bVar = new com.bykv.vk.openvk.preload.a.b.b(map);
        this.d = bVar;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = z;
        this.n = false;
        this.o = false;
        this.p = false;
        this.t = pVar;
        this.q = null;
        this.r = i;
        this.s = i2;
        this.u = list;
        this.v = list2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.B);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.g.f1627a);
        arrayList.add(cVar);
        arrayList.addAll(list3);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.p);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.g);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.d);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.e);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f);
        if (pVar == com.bykv.vk.openvk.preload.a.p.f1694a) {
            qVar = com.bykv.vk.openvk.preload.a.b.a.m.k;
        } else {
            qVar = new com.bykv.vk.openvk.preload.a.q<java.lang.Number>() { // from class: com.bykv.vk.openvk.preload.a.d.3
                @Override // com.bykv.vk.openvk.preload.a.q
                public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, java.lang.Number number) throws java.io.IOException {
                    java.lang.Number number2 = number;
                    if (number2 == null) {
                        cVar3.h();
                    } else {
                        cVar3.b(number2.toString());
                    }
                }

                @Override // com.bykv.vk.openvk.preload.a.q
                public final /* synthetic */ java.lang.Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
                    if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                        aVar.j();
                        return null;
                    }
                    return java.lang.Long.valueOf(aVar.l());
                }
            };
        }
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(java.lang.Long.TYPE, java.lang.Long.class, qVar));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(java.lang.Double.TYPE, java.lang.Double.class, new com.bykv.vk.openvk.preload.a.q<java.lang.Number>() { // from class: com.bykv.vk.openvk.preload.a.d.1
            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, java.lang.Number number) throws java.io.IOException {
                java.lang.Number number2 = number;
                if (number2 == null) {
                    cVar3.h();
                } else {
                    com.bykv.vk.openvk.preload.a.d.a(number2.doubleValue());
                    cVar3.a(number2);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ java.lang.Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.j();
                    return null;
                }
                return java.lang.Double.valueOf(aVar.k());
            }
        }));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(java.lang.Float.TYPE, java.lang.Float.class, new com.bykv.vk.openvk.preload.a.q<java.lang.Number>() { // from class: com.bykv.vk.openvk.preload.a.d.2
            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, java.lang.Number number) throws java.io.IOException {
                java.lang.Number number2 = number;
                if (number2 == null) {
                    cVar3.h();
                } else {
                    com.bykv.vk.openvk.preload.a.d.a(number2.floatValue());
                    cVar3.a(number2);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ java.lang.Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.j();
                    return null;
                }
                return java.lang.Float.valueOf((float) aVar.k());
            }
        }));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.l);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.h);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.i);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(java.util.concurrent.atomic.AtomicLong.class, new com.bykv.vk.openvk.preload.a.q<java.util.concurrent.atomic.AtomicLong>() { // from class: com.bykv.vk.openvk.preload.a.d.4
            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, java.util.concurrent.atomic.AtomicLong atomicLong) throws java.io.IOException {
                qVar.a(cVar3, java.lang.Long.valueOf(atomicLong.get()));
            }

            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ java.util.concurrent.atomic.AtomicLong a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
                return new java.util.concurrent.atomic.AtomicLong(((java.lang.Number) qVar.a(aVar)).longValue());
            }
        }.a()));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(java.util.concurrent.atomic.AtomicLongArray.class, new com.bykv.vk.openvk.preload.a.q<java.util.concurrent.atomic.AtomicLongArray>() { // from class: com.bykv.vk.openvk.preload.a.d.5
            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, java.util.concurrent.atomic.AtomicLongArray atomicLongArray) throws java.io.IOException {
                java.util.concurrent.atomic.AtomicLongArray atomicLongArray2 = atomicLongArray;
                cVar3.d();
                int length = atomicLongArray2.length();
                for (int i3 = 0; i3 < length; i3++) {
                    qVar.a(cVar3, java.lang.Long.valueOf(atomicLongArray2.get(i3)));
                }
                cVar3.e();
            }

            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ java.util.concurrent.atomic.AtomicLongArray a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList2.add(java.lang.Long.valueOf(((java.lang.Number) qVar.a(aVar)).longValue()));
                }
                aVar.b();
                int size = arrayList2.size();
                java.util.concurrent.atomic.AtomicLongArray atomicLongArray = new java.util.concurrent.atomic.AtomicLongArray(size);
                for (int i3 = 0; i3 < size; i3++) {
                    atomicLongArray.set(i3, ((java.lang.Long) arrayList2.get(i3)).longValue());
                }
                return atomicLongArray;
            }
        }.a()));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.j);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.m);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.q);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.r);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(java.math.BigDecimal.class, com.bykv.vk.openvk.preload.a.b.a.m.n));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(java.math.BigInteger.class, com.bykv.vk.openvk.preload.a.b.a.m.o));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.s);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.t);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.v);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.w);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.z);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.u);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.b);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.c.f1623a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.y);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.j.f1633a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.i.f1632a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.x);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.a.f1619a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f1637a);
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.b(bVar));
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.f(bVar));
        com.bykv.vk.openvk.preload.a.b.a.d dVar = new com.bykv.vk.openvk.preload.a.b.a.d(bVar);
        this.e = dVar;
        arrayList.add(dVar);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.C);
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.h(bVar, cVar2, cVar, dVar));
        this.f = java.util.Collections.unmodifiableList(arrayList);
    }

    static void a(double d) {
        if (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d)) {
            throw new java.lang.IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final <T> com.bykv.vk.openvk.preload.a.q<T> a(com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        boolean z;
        com.bykv.vk.openvk.preload.a.q<T> qVar = (com.bykv.vk.openvk.preload.a.q) this.c.get(aVar == null ? f1680a : aVar);
        if (qVar != null) {
            return qVar;
        }
        java.util.Map<com.bykv.vk.openvk.preload.a.c.a<?>, com.bykv.vk.openvk.preload.a.d.a<?>> map = this.b.get();
        if (map == null) {
            map = new java.util.HashMap<>();
            this.b.set(map);
            z = true;
        } else {
            z = false;
        }
        com.bykv.vk.openvk.preload.a.d.a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            com.bykv.vk.openvk.preload.a.d.a<?> aVar3 = new com.bykv.vk.openvk.preload.a.d.a<>();
            map.put(aVar, aVar3);
            java.util.Iterator<com.bykv.vk.openvk.preload.a.r> it = this.f.iterator();
            while (it.hasNext()) {
                com.bykv.vk.openvk.preload.a.q<T> qVarA = it.next().a(this, aVar);
                if (qVarA != null) {
                    aVar3.a((com.bykv.vk.openvk.preload.a.q<?>) qVarA);
                    this.c.put(aVar, qVarA);
                    map.remove(aVar);
                    if (z) {
                        this.b.remove();
                    }
                    return qVarA;
                }
            }
            throw new java.lang.IllegalArgumentException("GSON (pangle-v3200) cannot handle ".concat(java.lang.String.valueOf(aVar)));
        } catch (java.lang.Throwable th) {
            map.remove(aVar);
            if (z) {
                this.b.remove();
            }
            throw th;
        }
    }

    public final <T> com.bykv.vk.openvk.preload.a.q<T> a(com.bykv.vk.openvk.preload.a.r rVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        if (!this.f.contains(rVar)) {
            rVar = this.e;
        }
        boolean z = false;
        for (com.bykv.vk.openvk.preload.a.r rVar2 : this.f) {
            if (z) {
                com.bykv.vk.openvk.preload.a.q<T> qVarA = rVar2.a(this, aVar);
                if (qVarA != null) {
                    return qVarA;
                }
            } else if (rVar2 == rVar) {
                z = true;
            }
        }
        throw new java.lang.IllegalArgumentException("GSON cannot serialize ".concat(java.lang.String.valueOf(aVar)));
    }

    public final <T> com.bykv.vk.openvk.preload.a.q<T> a(java.lang.Class<T> cls) {
        return a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a((java.lang.Class) cls));
    }

    public final java.lang.String a(java.lang.Object obj) {
        if (obj == null) {
            com.bykv.vk.openvk.preload.a.j jVar = com.bykv.vk.openvk.preload.a.j.f1691a;
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            try {
                com.bykv.vk.openvk.preload.a.d.c cVarA = a((java.io.Writer) stringWriter);
                boolean zA = cVarA.a();
                cVarA.a(true);
                boolean zB = cVarA.b();
                cVarA.b(this.m);
                boolean zC = cVarA.c();
                cVarA.c(false);
                try {
                    try {
                        com.bykv.vk.openvk.preload.falconx.a.a.a(jVar, cVarA);
                        cVarA.a(zA);
                        cVarA.b(zB);
                        cVarA.c(zC);
                        return stringWriter.toString();
                    } catch (java.lang.Throwable th) {
                        cVarA.a(zA);
                        cVarA.b(zB);
                        cVarA.c(zC);
                        throw th;
                    }
                } catch (java.io.IOException e) {
                    throw new com.bykv.vk.openvk.preload.a.i(e);
                } catch (java.lang.AssertionError e2) {
                    java.lang.AssertionError assertionError = new java.lang.AssertionError("AssertionError (GSON pangle-v3200): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            } catch (java.io.IOException e3) {
                throw new com.bykv.vk.openvk.preload.a.i(e3);
            }
        }
        java.lang.Class<?> cls = obj.getClass();
        java.io.StringWriter stringWriter2 = new java.io.StringWriter();
        try {
            com.bykv.vk.openvk.preload.a.d.c cVarA2 = a((java.io.Writer) stringWriter2);
            com.bykv.vk.openvk.preload.a.q qVarA = a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a((java.lang.reflect.Type) cls));
            boolean zA2 = cVarA2.a();
            cVarA2.a(true);
            boolean zB2 = cVarA2.b();
            cVarA2.b(this.m);
            boolean zC2 = cVarA2.c();
            cVarA2.c(false);
            try {
                try {
                    try {
                        qVarA.a(cVarA2, obj);
                        cVarA2.a(zA2);
                        cVarA2.b(zB2);
                        cVarA2.c(zC2);
                        return stringWriter2.toString();
                    } catch (java.lang.Throwable th2) {
                        cVarA2.a(zA2);
                        cVarA2.b(zB2);
                        cVarA2.c(zC2);
                        throw th2;
                    }
                } catch (java.lang.AssertionError e4) {
                    java.lang.AssertionError assertionError2 = new java.lang.AssertionError("AssertionError (GSON pangle-v3200): " + e4.getMessage());
                    assertionError2.initCause(e4);
                    throw assertionError2;
                }
            } catch (java.io.IOException e5) {
                throw new com.bykv.vk.openvk.preload.a.i(e5);
            }
        } catch (java.io.IOException e6) {
            throw new com.bykv.vk.openvk.preload.a.i(e6);
        }
    }

    private static com.bykv.vk.openvk.preload.a.d.c a(java.io.Writer writer) throws java.io.IOException {
        com.bykv.vk.openvk.preload.a.d.c cVar = new com.bykv.vk.openvk.preload.a.d.c(writer);
        cVar.c(false);
        return cVar;
    }

    private <T> T a(com.bykv.vk.openvk.preload.a.d.a aVar, java.lang.reflect.Type type) throws com.bykv.vk.openvk.preload.a.i, com.bykv.vk.openvk.preload.a.o {
        boolean zQ = aVar.q();
        boolean z = true;
        aVar.a(true);
        try {
            try {
                try {
                    aVar.f();
                    z = false;
                    T tA = a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type)).a(aVar);
                    aVar.a(zQ);
                    return tA;
                } catch (java.lang.AssertionError e) {
                    java.lang.AssertionError assertionError = new java.lang.AssertionError("AssertionError (GSON pangle-v3200): " + e.getMessage());
                    assertionError.initCause(e);
                    throw assertionError;
                } catch (java.lang.IllegalStateException e2) {
                    throw new com.bykv.vk.openvk.preload.a.o(e2);
                }
            } catch (java.io.EOFException e3) {
                if (!z) {
                    throw new com.bykv.vk.openvk.preload.a.o(e3);
                }
                aVar.a(zQ);
                return null;
            } catch (java.io.IOException e4) {
                throw new com.bykv.vk.openvk.preload.a.o(e4);
            }
        } catch (java.lang.Throwable th) {
            aVar.a(zQ);
            throw th;
        }
    }

    /* JADX INFO: compiled from: Gson.java */
    static class a<T> extends com.bykv.vk.openvk.preload.a.q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.q<T> f1685a;

        a() {
        }

        public final void a(com.bykv.vk.openvk.preload.a.q<T> qVar) {
            if (this.f1685a != null) {
                throw new java.lang.AssertionError();
            }
            this.f1685a = qVar;
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
            com.bykv.vk.openvk.preload.a.q<T> qVar = this.f1685a;
            if (qVar == null) {
                throw new java.lang.IllegalStateException();
            }
            return qVar.a(aVar);
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws java.io.IOException {
            com.bykv.vk.openvk.preload.a.q<T> qVar = this.f1685a;
            if (qVar == null) {
                throw new java.lang.IllegalStateException();
            }
            qVar.a(cVar, t);
        }
    }

    public final java.lang.String toString() {
        return "{serializeNulls:false,factories:" + this.f + ",instanceCreators:" + this.d + "}";
    }

    public final <T> T a(java.io.Reader reader, java.lang.reflect.Type type) throws com.bykv.vk.openvk.preload.a.i, com.bykv.vk.openvk.preload.a.o {
        com.bykv.vk.openvk.preload.a.d.a aVar = new com.bykv.vk.openvk.preload.a.d.a(reader);
        aVar.a(false);
        T t = (T) a(aVar, type);
        if (t != null) {
            try {
                if (aVar.f() != com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT) {
                    throw new com.bykv.vk.openvk.preload.a.i("JSON document was not fully consumed.");
                }
            } catch (com.bykv.vk.openvk.preload.a.d.d e) {
                throw new com.bykv.vk.openvk.preload.a.o(e);
            } catch (java.io.IOException e2) {
                throw new com.bykv.vk.openvk.preload.a.i(e2);
            }
        }
        return t;
    }
}
