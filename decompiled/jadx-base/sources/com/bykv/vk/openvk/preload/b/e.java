package com.bykv.vk.openvk.preload.b;

/* JADX INFO: compiled from: InterceptorFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public interface e {
    <T> T a(java.lang.Class<T> cls);

    /* JADX INFO: compiled from: InterceptorFactory.java */
    public static class a implements com.bykv.vk.openvk.preload.b.e {
        @Override // com.bykv.vk.openvk.preload.b.e
        public final <T> T a(java.lang.Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }
}
