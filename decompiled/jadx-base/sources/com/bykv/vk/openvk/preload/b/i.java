package com.bykv.vk.openvk.preload.b;

/* JADX INFO: compiled from: RealInterceptorChain.java */
/* JADX INFO: loaded from: classes3.dex */
final class i implements com.bykv.vk.openvk.preload.b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.bykv.vk.openvk.preload.b.e f1703a;
    private int b;
    private java.util.List<com.bykv.vk.openvk.preload.b.h> c;
    private com.bykv.vk.openvk.preload.b.d d;

    i(java.util.List<com.bykv.vk.openvk.preload.b.h> list, int i, com.bykv.vk.openvk.preload.b.e eVar, com.bykv.vk.openvk.preload.b.d dVar) {
        this.c = list;
        this.b = i;
        this.f1703a = eVar;
        this.d = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.b
    public final java.lang.Object a(java.lang.Object obj) throws java.lang.Exception {
        com.bykv.vk.openvk.preload.b.d dVar = this.d;
        if (dVar != null) {
            dVar.c = obj;
            this.d.e();
        }
        if (this.b >= this.c.size()) {
            return obj;
        }
        com.bykv.vk.openvk.preload.b.h hVar = this.c.get(this.b);
        java.lang.Class<? extends com.bykv.vk.openvk.preload.b.d> cls = hVar.f1701a;
        com.bykv.vk.openvk.preload.b.d dVar2 = (com.bykv.vk.openvk.preload.b.d) this.f1703a.a(cls);
        if (dVar2 == null) {
            throw new java.lang.IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.b.b.a aVarA = hVar.a();
        com.bykv.vk.openvk.preload.b.i iVar = new com.bykv.vk.openvk.preload.b.i(this.c, this.b + 1, this.f1703a, dVar2);
        dVar2.a(iVar, this.d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            java.lang.Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (com.bykv.vk.openvk.preload.b.i.a e) {
            dVar2.c(e.getCause());
            throw e;
        } catch (java.lang.Throwable th) {
            dVar2.b(th);
            throw new com.bykv.vk.openvk.preload.b.i.a(th);
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final java.lang.Object a(java.lang.Class cls) {
        com.bykv.vk.openvk.preload.b.d dVarC = c(cls);
        if (dVarC == null) {
            throw new java.lang.IllegalArgumentException("can not find pre Interceptor , class:".concat(java.lang.String.valueOf(cls)));
        }
        return dVarC.b;
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final java.lang.Object b(java.lang.Class cls) {
        com.bykv.vk.openvk.preload.b.d dVarC = c(cls);
        if (dVarC == null) {
            throw new java.lang.IllegalArgumentException("can not find pre Interceptor , class:".concat(java.lang.String.valueOf(cls)));
        }
        return dVarC.c;
    }

    private com.bykv.vk.openvk.preload.b.d c(java.lang.Class cls) {
        com.bykv.vk.openvk.preload.b.d dVar = this.d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f1699a;
        }
        return dVar;
    }

    /* JADX INFO: compiled from: RealInterceptorChain.java */
    static final class a extends java.lang.Exception {
        a(java.lang.Throwable th) {
            super(th);
        }
    }
}
