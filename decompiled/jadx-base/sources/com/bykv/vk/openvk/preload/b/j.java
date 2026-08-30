package com.bykv.vk.openvk.preload.b;

/* JADX INFO: compiled from: RetryBranchInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j<IN, OUT> extends com.bykv.vk.openvk.preload.b.l<IN, OUT> {
    private java.lang.String d;

    protected abstract java.lang.String a(IN in);

    protected abstract java.lang.String a(IN in, java.lang.Throwable th, java.lang.String str);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.d
    public final java.lang.Object a(com.bykv.vk.openvk.preload.b.b<OUT> bVar, IN in) throws java.lang.Throwable {
        new com.bykv.vk.openvk.preload.b.c(bVar);
        this.d = a(in);
        com.bykv.vk.openvk.preload.b.l.a aVar = a().get(this.d);
        while (aVar != null) {
            java.util.List<com.bykv.vk.openvk.preload.b.h> list = aVar.f1704a;
            try {
                java.lang.Object objA = com.bykv.vk.openvk.preload.b.c.a(list, bVar.f1703a, this).a(in);
                return !a(list) ? objA : bVar.a(objA);
            } catch (com.bykv.vk.openvk.preload.b.i.a e) {
                java.lang.Throwable cause = e.getCause();
                new com.bykv.vk.openvk.preload.b.c(bVar);
                this.d = a(in, cause, this.d);
                aVar = a().get(this.d);
            } catch (java.lang.Throwable th) {
                new com.bykv.vk.openvk.preload.b.c(bVar);
                this.d = a(in, th, this.d);
                aVar = a().get(this.d);
            }
        }
        throw new java.lang.IllegalArgumentException("can not found branch，branch name is：" + this.d);
    }
}
