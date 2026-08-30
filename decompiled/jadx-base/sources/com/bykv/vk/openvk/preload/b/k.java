package com.bykv.vk.openvk.preload.b;

/* JADX INFO: compiled from: RetryInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k<IN, OUT> extends com.bykv.vk.openvk.preload.b.d<IN, OUT> {
    private IN d;

    protected abstract boolean a(java.lang.Throwable th);

    @Override // com.bykv.vk.openvk.preload.b.d
    public final java.lang.Object a(com.bykv.vk.openvk.preload.b.b<OUT> bVar, IN in) throws java.lang.Throwable {
        this.d = in;
        try {
            return bVar.a(a());
        } catch (com.bykv.vk.openvk.preload.b.i.a e) {
            return a((com.bykv.vk.openvk.preload.b.b) bVar, e.getCause());
        } catch (java.lang.Throwable th) {
            return a((com.bykv.vk.openvk.preload.b.b) bVar, th);
        }
    }

    protected final IN g() {
        return this.d;
    }

    private java.lang.Object a(com.bykv.vk.openvk.preload.b.b<OUT> bVar, java.lang.Throwable th) throws java.lang.Throwable {
        while (a(th)) {
            try {
                return bVar.a(a());
            } catch (com.bykv.vk.openvk.preload.b.i.a e) {
                th = e.getCause();
            }
        }
        throw th;
    }

    protected OUT a() {
        return this.d;
    }
}
