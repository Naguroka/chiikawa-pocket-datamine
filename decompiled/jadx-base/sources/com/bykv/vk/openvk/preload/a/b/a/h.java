package com.bykv.vk.openvk.preload.a.b.a;

/* JADX INFO: compiled from: ReflectiveTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements com.bykv.vk.openvk.preload.a.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b f1629a;
    private final com.bykv.vk.openvk.preload.a.c b;
    private final com.bykv.vk.openvk.preload.a.b.c c;
    private final com.bykv.vk.openvk.preload.a.b.a.d d;
    private final com.bykv.vk.openvk.preload.a.b.b.b e = com.bykv.vk.openvk.preload.a.b.b.b.a();

    public h(com.bykv.vk.openvk.preload.a.b.b bVar, com.bykv.vk.openvk.preload.a.c cVar, com.bykv.vk.openvk.preload.a.b.c cVar2, com.bykv.vk.openvk.preload.a.b.a.d dVar) {
        this.f1629a = bVar;
        this.b = cVar;
        this.c = cVar2;
        this.d = dVar;
    }

    private boolean a(java.lang.reflect.Field field, boolean z) {
        com.bykv.vk.openvk.preload.a.b.c cVar = this.c;
        return (cVar.a(field.getType(), z) || cVar.a(field, z)) ? false : true;
    }

    private java.util.List<java.lang.String> a(java.lang.reflect.Field field) {
        com.bykv.vk.openvk.preload.a.a.b bVar = (com.bykv.vk.openvk.preload.a.a.b) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.b.class);
        if (bVar == null) {
            return java.util.Collections.singletonList(this.b.a(field));
        }
        java.lang.String strA = bVar.a();
        java.lang.String[] strArrB = bVar.b();
        if (strArrB.length == 0) {
            return java.util.Collections.singletonList(strA);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArrB.length + 1);
        arrayList.add(strA);
        for (java.lang.String str : strArrB) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final <T> com.bykv.vk.openvk.preload.a.q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        java.lang.Class<? super T> clsA = aVar.a();
        if (java.lang.Object.class.isAssignableFrom(clsA)) {
            return new com.bykv.vk.openvk.preload.a.b.a.h.a(this.f1629a.a(aVar), a(dVar, aVar, clsA));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r25v0 */
    private java.util.Map<java.lang.String, com.bykv.vk.openvk.preload.a.b.a.h.b> a(final com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<?> aVar, java.lang.Class<?> cls) {
        int i;
        boolean z;
        int i2;
        java.lang.reflect.Field[] fieldArr;
        java.lang.Class<?> cls2;
        java.lang.reflect.Type type;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        java.lang.reflect.Type typeB = aVar.b();
        com.bykv.vk.openvk.preload.a.c.a<?> aVarA = aVar;
        java.lang.Class<?> clsA = cls;
        while (clsA != java.lang.Object.class) {
            java.lang.reflect.Field[] declaredFields = clsA.getDeclaredFields();
            int length = declaredFields.length;
            boolean z2 = false;
            int i3 = 0;
            while (i3 < length) {
                final java.lang.reflect.Field field = declaredFields[i3];
                boolean zA = this.a(field, true);
                boolean zA2 = this.a(field, z2);
                if (zA || zA2) {
                    this.e.a(field);
                    java.lang.reflect.Type typeA = com.bykv.vk.openvk.preload.a.b.a.a(aVarA.b(), clsA, field.getGenericType());
                    java.util.List<java.lang.String> listA = this.a(field);
                    int size = listA.size();
                    ?? r1 = z2;
                    com.bykv.vk.openvk.preload.a.b.a.h.b bVar = null;
                    while (r1 < size) {
                        java.lang.reflect.Type type2 = typeB;
                        java.lang.String str = listA.get(r1);
                        boolean z3 = r1 != 0 ? z2 : zA;
                        final com.bykv.vk.openvk.preload.a.c.a<?> aVarA2 = com.bykv.vk.openvk.preload.a.c.a.a(typeA);
                        java.lang.Class<? super java.lang.Object> clsA2 = aVarA2.a();
                        boolean z4 = (clsA2 instanceof java.lang.Class) && clsA2.isPrimitive();
                        com.bykv.vk.openvk.preload.a.a.a aVar2 = (com.bykv.vk.openvk.preload.a.a.a) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.a.class);
                        com.bykv.vk.openvk.preload.a.q<?> qVarA = aVar2 != null ? com.bykv.vk.openvk.preload.a.b.a.d.a(this.f1629a, dVar, aVarA2, aVar2) : null;
                        boolean z5 = qVarA != null;
                        if (qVarA == null) {
                            qVarA = dVar.a((com.bykv.vk.openvk.preload.a.c.a) aVarA2);
                        }
                        final com.bykv.vk.openvk.preload.a.q<?> qVar = qVarA;
                        ?? r25 = r1;
                        int i4 = size;
                        java.util.List<java.lang.String> list = listA;
                        java.lang.reflect.Field field2 = field;
                        int i5 = i3;
                        final boolean z6 = z5;
                        int i6 = length;
                        java.lang.reflect.Field[] fieldArr2 = declaredFields;
                        java.lang.Class<?> cls3 = clsA;
                        final boolean z7 = z4;
                        com.bykv.vk.openvk.preload.a.b.a.h.b bVar2 = (com.bykv.vk.openvk.preload.a.b.a.h.b) linkedHashMap.put(str, new com.bykv.vk.openvk.preload.a.b.a.h.b(str, z3, zA2) { // from class: com.bykv.vk.openvk.preload.a.b.a.h.1
                            @Override // com.bykv.vk.openvk.preload.a.b.a.h.b
                            final void a(com.bykv.vk.openvk.preload.a.d.c cVar, java.lang.Object obj) throws java.lang.IllegalAccessException, java.io.IOException {
                                (z6 ? qVar : new com.bykv.vk.openvk.preload.a.b.a.l(dVar, qVar, aVarA2.b())).a(cVar, field.get(obj));
                            }

                            @Override // com.bykv.vk.openvk.preload.a.b.a.h.b
                            final void a(com.bykv.vk.openvk.preload.a.d.a aVar3, java.lang.Object obj) throws java.lang.IllegalAccessException, java.io.IOException {
                                java.lang.Object objA = qVar.a(aVar3);
                                if (objA == null && z7) {
                                    return;
                                }
                                field.set(obj, objA);
                            }

                            @Override // com.bykv.vk.openvk.preload.a.b.a.h.b
                            public final boolean a(java.lang.Object obj) throws java.lang.IllegalAccessException, java.io.IOException {
                                return this.b && field.get(obj) != obj;
                            }
                        });
                        if (bVar == null) {
                            bVar = bVar2;
                        }
                        this = this;
                        clsA = cls3;
                        zA = z3;
                        typeB = type2;
                        z2 = false;
                        length = i6;
                        size = i4;
                        listA = list;
                        field = field2;
                        i3 = i5;
                        declaredFields = fieldArr2;
                        r1 = (r25 == true ? 1 : 0) + 1;
                    }
                    i = i3;
                    z = z2;
                    i2 = length;
                    fieldArr = declaredFields;
                    cls2 = clsA;
                    type = typeB;
                    if (bVar != null) {
                        throw new java.lang.IllegalArgumentException(type + " declares multiple JSON fields named " + bVar.f1631a);
                    }
                } else {
                    i = i3;
                    z = z2;
                    i2 = length;
                    fieldArr = declaredFields;
                    cls2 = clsA;
                    type = typeB;
                }
                i3 = i + 1;
                this = this;
                aVarA = aVarA;
                clsA = cls2;
                typeB = type;
                z2 = z;
                length = i2;
                declaredFields = fieldArr;
            }
            java.lang.Class<?> cls4 = clsA;
            aVarA = com.bykv.vk.openvk.preload.a.c.a.a(com.bykv.vk.openvk.preload.a.b.a.a(aVarA.b(), cls4, cls4.getGenericSuperclass()));
            clsA = aVarA.a();
        }
        return linkedHashMap;
    }

    /* JADX INFO: compiled from: ReflectiveTypeAdapterFactory.java */
    static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f1631a;
        final boolean b;
        final boolean c;

        abstract void a(com.bykv.vk.openvk.preload.a.d.a aVar, java.lang.Object obj) throws java.lang.IllegalAccessException, java.io.IOException;

        abstract void a(com.bykv.vk.openvk.preload.a.d.c cVar, java.lang.Object obj) throws java.lang.IllegalAccessException, java.io.IOException;

        abstract boolean a(java.lang.Object obj) throws java.lang.IllegalAccessException, java.io.IOException;

        protected b(java.lang.String str, boolean z, boolean z2) {
            this.f1631a = str;
            this.b = z;
            this.c = z2;
        }
    }

    /* JADX INFO: compiled from: ReflectiveTypeAdapterFactory.java */
    public static final class a<T> extends com.bykv.vk.openvk.preload.a.q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bykv.vk.openvk.preload.a.b.h<T> f1630a;
        private final java.util.Map<java.lang.String, com.bykv.vk.openvk.preload.a.b.a.h.b> b;

        a(com.bykv.vk.openvk.preload.a.b.h<T> hVar, java.util.Map<java.lang.String, com.bykv.vk.openvk.preload.a.b.a.h.b> map) {
            this.f1630a = hVar;
            this.b = map;
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
            if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.j();
                return null;
            }
            T tA = this.f1630a.a();
            try {
                aVar.c();
                while (aVar.e()) {
                    com.bykv.vk.openvk.preload.a.b.a.h.b bVar = this.b.get(aVar.g());
                    if (bVar == null || !bVar.c) {
                        aVar.n();
                    } else {
                        bVar.a(aVar, tA);
                    }
                }
                aVar.d();
                return tA;
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            } catch (java.lang.IllegalStateException e2) {
                throw new com.bykv.vk.openvk.preload.a.o(e2);
            }
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws java.io.IOException {
            if (t == null) {
                cVar.h();
                return;
            }
            cVar.f();
            try {
                for (com.bykv.vk.openvk.preload.a.b.a.h.b bVar : this.b.values()) {
                    if (bVar.a(t)) {
                        cVar.a(bVar.f1631a);
                        bVar.a(cVar, t);
                    }
                }
                cVar.g();
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            }
        }
    }
}
