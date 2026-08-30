package com.bykv.vk.openvk.preload.a.b.a;

/* JADX INFO: compiled from: ObjectTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends com.bykv.vk.openvk.preload.a.q<java.lang.Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.bykv.vk.openvk.preload.a.r f1627a = new com.bykv.vk.openvk.preload.a.r() { // from class: com.bykv.vk.openvk.preload.a.b.a.g.1
        @Override // com.bykv.vk.openvk.preload.a.r
        public final <T> com.bykv.vk.openvk.preload.a.q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            if (aVar.a() == java.lang.Object.class) {
                return new com.bykv.vk.openvk.preload.a.b.a.g(dVar);
            }
            return null;
        }
    };
    private final com.bykv.vk.openvk.preload.a.d b;

    g(com.bykv.vk.openvk.preload.a.d dVar) {
        this.b = dVar;
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.b.a.g$2, reason: invalid class name */
    /* JADX INFO: compiled from: ObjectTypeAdapter.java */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1628a;

        static {
            int[] iArr = new int[com.bykv.vk.openvk.preload.a.d.b.values().length];
            f1628a = iArr;
            try {
                iArr[com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f1628a[com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f1628a[com.bykv.vk.openvk.preload.a.d.b.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f1628a[com.bykv.vk.openvk.preload.a.d.b.NUMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f1628a[com.bykv.vk.openvk.preload.a.d.b.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f1628a[com.bykv.vk.openvk.preload.a.d.b.NULL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final java.lang.Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
        switch (com.bykv.vk.openvk.preload.a.b.a.g.AnonymousClass2.f1628a[aVar.f().ordinal()]) {
            case 1:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList.add(a(aVar));
                }
                aVar.b();
                return arrayList;
            case 2:
                com.bykv.vk.openvk.preload.a.b.g gVar = new com.bykv.vk.openvk.preload.a.b.g();
                aVar.c();
                while (aVar.e()) {
                    gVar.put(aVar.g(), a(aVar));
                }
                aVar.d();
                return gVar;
            case 3:
                return aVar.h();
            case 4:
                return java.lang.Double.valueOf(aVar.k());
            case 5:
                return java.lang.Boolean.valueOf(aVar.i());
            case 6:
                aVar.j();
                return null;
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            cVar.h();
            return;
        }
        com.bykv.vk.openvk.preload.a.q qVarA = this.b.a((java.lang.Class) obj.getClass());
        if (qVarA instanceof com.bykv.vk.openvk.preload.a.b.a.g) {
            cVar.f();
            cVar.g();
        } else {
            qVarA.a(cVar, obj);
        }
    }
}
