package com.bykv.vk.openvk.preload.b;

/* JADX INFO: compiled from: BranchInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<IN, OUT> extends com.bykv.vk.openvk.preload.b.l<IN, OUT> {
    protected abstract java.lang.String a(IN in);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.d
    public final java.lang.Object a(com.bykv.vk.openvk.preload.b.b<OUT> bVar, IN in) throws java.lang.Exception {
        new com.bykv.vk.openvk.preload.b.c(bVar);
        java.lang.String strA = a(in);
        com.bykv.vk.openvk.preload.b.l.a aVar = a().get(strA);
        if (aVar == null) {
            throw new java.lang.IllegalArgumentException("can not found branch, branch name is：".concat(java.lang.String.valueOf(strA)));
        }
        java.util.List<com.bykv.vk.openvk.preload.b.h> list = aVar.f1704a;
        java.lang.Object objA = com.bykv.vk.openvk.preload.b.c.a(list, ((com.bykv.vk.openvk.preload.b.i) bVar).f1703a, this).a(in);
        return !a(list) ? objA : bVar.a(objA);
    }
}
