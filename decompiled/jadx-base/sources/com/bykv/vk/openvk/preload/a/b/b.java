package com.bykv.vk.openvk.preload.a.b;

/* JADX INFO: compiled from: ConstructorConstructor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.reflect.Type, com.bykv.vk.openvk.preload.geckox.a.a.c<?>> f1647a;
    private final com.bykv.vk.openvk.preload.a.b.b.b b = com.bykv.vk.openvk.preload.a.b.b.b.a();

    public b(java.util.Map<java.lang.reflect.Type, com.bykv.vk.openvk.preload.geckox.a.a.c<?>> map) {
        this.f1647a = map;
    }

    public final <T> com.bykv.vk.openvk.preload.a.b.h<T> a(com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        com.bykv.vk.openvk.preload.a.b.h<T> hVar;
        final java.lang.reflect.Type typeB = aVar.b();
        final java.lang.Class<? super T> clsA = aVar.a();
        final com.bykv.vk.openvk.preload.geckox.a.a.c<?> cVar = this.f1647a.get(typeB);
        if (cVar != null) {
            return new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.1
                @Override // com.bykv.vk.openvk.preload.a.b.h
                public final T a() {
                    return (T) cVar.c();
                }
            };
        }
        final com.bykv.vk.openvk.preload.geckox.a.a.c<?> cVar2 = this.f1647a.get(clsA);
        if (cVar2 != null) {
            return new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.7
                @Override // com.bykv.vk.openvk.preload.a.b.h
                public final T a() {
                    return (T) cVar2.c();
                }
            };
        }
        com.bykv.vk.openvk.preload.a.b.h<T> hVarA = a(clsA);
        if (hVarA != null) {
            return hVarA;
        }
        if (java.util.Collection.class.isAssignableFrom(clsA)) {
            if (java.util.SortedSet.class.isAssignableFrom(clsA)) {
                hVar = new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.9
                    @Override // com.bykv.vk.openvk.preload.a.b.h
                    public final T a() {
                        return (T) new java.util.TreeSet();
                    }
                };
            } else if (java.util.EnumSet.class.isAssignableFrom(clsA)) {
                hVar = new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.10
                    @Override // com.bykv.vk.openvk.preload.a.b.h
                    public final T a() {
                        java.lang.reflect.Type type = typeB;
                        if (type instanceof java.lang.reflect.ParameterizedType) {
                            java.lang.reflect.Type type2 = ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0];
                            if (type2 instanceof java.lang.Class) {
                                return (T) java.util.EnumSet.noneOf((java.lang.Class) type2);
                            }
                            throw new com.bykv.vk.openvk.preload.a.i("Invalid EnumSet type: " + typeB.toString());
                        }
                        throw new com.bykv.vk.openvk.preload.a.i("Invalid EnumSet type: " + typeB.toString());
                    }
                };
            } else if (java.util.Set.class.isAssignableFrom(clsA)) {
                hVar = new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.11
                    @Override // com.bykv.vk.openvk.preload.a.b.h
                    public final T a() {
                        return (T) new java.util.LinkedHashSet();
                    }
                };
            } else if (java.util.Queue.class.isAssignableFrom(clsA)) {
                hVar = new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.12
                    @Override // com.bykv.vk.openvk.preload.a.b.h
                    public final T a() {
                        return (T) new java.util.ArrayDeque();
                    }
                };
            } else {
                hVar = new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.13
                    @Override // com.bykv.vk.openvk.preload.a.b.h
                    public final T a() {
                        return (T) new java.util.ArrayList();
                    }
                };
            }
        } else if (!java.util.Map.class.isAssignableFrom(clsA)) {
            hVar = null;
        } else if (java.util.concurrent.ConcurrentNavigableMap.class.isAssignableFrom(clsA)) {
            hVar = new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.14
                @Override // com.bykv.vk.openvk.preload.a.b.h
                public final T a() {
                    return (T) new java.util.concurrent.ConcurrentSkipListMap();
                }
            };
        } else if (java.util.concurrent.ConcurrentMap.class.isAssignableFrom(clsA)) {
            hVar = new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.2
                @Override // com.bykv.vk.openvk.preload.a.b.h
                public final T a() {
                    return (T) new java.util.concurrent.ConcurrentHashMap();
                }
            };
        } else if (java.util.SortedMap.class.isAssignableFrom(clsA)) {
            hVar = new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.3
                @Override // com.bykv.vk.openvk.preload.a.b.h
                public final T a() {
                    return (T) new java.util.TreeMap();
                }
            };
        } else if ((typeB instanceof java.lang.reflect.ParameterizedType) && !java.lang.String.class.isAssignableFrom(com.bykv.vk.openvk.preload.a.c.a.a(((java.lang.reflect.ParameterizedType) typeB).getActualTypeArguments()[0]).a())) {
            hVar = new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.4
                @Override // com.bykv.vk.openvk.preload.a.b.h
                public final T a() {
                    return (T) new java.util.LinkedHashMap();
                }
            };
        } else {
            hVar = new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.5
                @Override // com.bykv.vk.openvk.preload.a.b.h
                public final T a() {
                    return (T) new com.bykv.vk.openvk.preload.a.b.g();
                }
            };
        }
        return hVar != null ? hVar : new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.6

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.bykv.vk.openvk.preload.a.b.i f1658a = com.bykv.vk.openvk.preload.a.b.i.a();

            @Override // com.bykv.vk.openvk.preload.a.b.h
            public final T a() {
                try {
                    return (T) this.f1658a.a(clsA);
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Unable to invoke no-args constructor for " + typeB + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
                }
            }
        };
    }

    private <T> com.bykv.vk.openvk.preload.a.b.h<T> a(java.lang.Class<? super T> cls) {
        try {
            final java.lang.reflect.Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.a(declaredConstructor);
            }
            return new com.bykv.vk.openvk.preload.a.b.h<T>() { // from class: com.bykv.vk.openvk.preload.a.b.b.8
                @Override // com.bykv.vk.openvk.preload.a.b.h
                public final T a() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (java.lang.IllegalAccessException e) {
                        throw new java.lang.AssertionError(e);
                    } catch (java.lang.InstantiationException e2) {
                        throw new java.lang.RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e2);
                    } catch (java.lang.reflect.InvocationTargetException e3) {
                        throw new java.lang.RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e3.getTargetException());
                    }
                }
            };
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    public final java.lang.String toString() {
        return this.f1647a.toString();
    }
}
