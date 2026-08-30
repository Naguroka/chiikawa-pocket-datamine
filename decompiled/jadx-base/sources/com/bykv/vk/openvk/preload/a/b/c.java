package com.bykv.vk.openvk.preload.a.b;

/* JADX INFO: compiled from: Excluder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements com.bykv.vk.openvk.preload.a.r, java.lang.Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.bykv.vk.openvk.preload.a.b.c f1664a = new com.bykv.vk.openvk.preload.a.b.c();
    private double b = -1.0d;
    private int c = 136;
    private boolean d = true;
    private java.util.List<com.bykv.vk.openvk.preload.geckox.a.a.c> e = java.util.Collections.emptyList();
    private java.util.List<com.bykv.vk.openvk.preload.geckox.a.a.c> f = java.util.Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.bykv.vk.openvk.preload.a.b.c clone() {
        try {
            return (com.bykv.vk.openvk.preload.a.b.c) super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final <T> com.bykv.vk.openvk.preload.a.q<T> a(final com.bykv.vk.openvk.preload.a.d dVar, final com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        boolean zA = a(aVar.a());
        final boolean z = zA || a(true);
        final boolean z2 = zA || a(false);
        if (z || z2) {
            return new com.bykv.vk.openvk.preload.a.q<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private com.bykv.vk.openvk.preload.a.q<T> f1665a;

                @Override // com.bykv.vk.openvk.preload.a.q
                public final T a(com.bykv.vk.openvk.preload.a.d.a aVar2) throws java.io.IOException {
                    if (z2) {
                        aVar2.n();
                        return null;
                    }
                    return b().a(aVar2);
                }

                @Override // com.bykv.vk.openvk.preload.a.q
                public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws java.io.IOException {
                    if (z) {
                        cVar.h();
                    } else {
                        b().a(cVar, t);
                    }
                }

                private com.bykv.vk.openvk.preload.a.q<T> b() {
                    com.bykv.vk.openvk.preload.a.q<T> qVar = this.f1665a;
                    if (qVar != null) {
                        return qVar;
                    }
                    com.bykv.vk.openvk.preload.a.q<T> qVarA = dVar.a(com.bykv.vk.openvk.preload.a.b.c.this, aVar);
                    this.f1665a = qVarA;
                    return qVarA;
                }
            };
        }
        return null;
    }

    public final boolean a(java.lang.reflect.Field field, boolean z) {
        if ((this.c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.b != -1.0d && !a((com.bykv.vk.openvk.preload.a.a.c) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.c.class), (com.bykv.vk.openvk.preload.a.a.d) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.d.class))) || field.isSynthetic()) {
            return true;
        }
        if ((!this.d && c(field.getType())) || b(field.getType())) {
            return true;
        }
        java.util.List<com.bykv.vk.openvk.preload.geckox.a.a.c> list = z ? this.e : this.f;
        if (list.isEmpty()) {
            return false;
        }
        new com.bykv.vk.openvk.preload.geckox.g.a(field);
        java.util.Iterator<com.bykv.vk.openvk.preload.geckox.a.a.c> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }

    private boolean a(java.lang.Class<?> cls) {
        if (this.b == -1.0d || a((com.bykv.vk.openvk.preload.a.a.c) cls.getAnnotation(com.bykv.vk.openvk.preload.a.a.c.class), (com.bykv.vk.openvk.preload.a.a.d) cls.getAnnotation(com.bykv.vk.openvk.preload.a.a.d.class))) {
            return (!this.d && c(cls)) || b(cls);
        }
        return true;
    }

    public final boolean a(java.lang.Class<?> cls, boolean z) {
        return a(cls) || a(z);
    }

    private boolean a(boolean z) {
        java.util.Iterator<com.bykv.vk.openvk.preload.geckox.a.a.c> it = (z ? this.e : this.f).iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(java.lang.Class<?> cls) {
        if (java.lang.Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    private static boolean c(java.lang.Class<?> cls) {
        return cls.isMemberClass() && !d(cls);
    }

    private static boolean d(java.lang.Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.c cVar, com.bykv.vk.openvk.preload.a.a.d dVar) {
        return a(cVar) && a(dVar);
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.c cVar) {
        return cVar == null || cVar.a() <= this.b;
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.d dVar) {
        return dVar == null || dVar.a() > this.b;
    }
}
