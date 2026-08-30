package com.bykv.vk.openvk.preload.b;

/* JADX INFO: compiled from: Pipe.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.lang.Class<? extends com.bykv.vk.openvk.preload.b.d> f1701a;
    private com.bykv.vk.openvk.preload.b.b.a b;
    private java.lang.Object[] c;

    /* synthetic */ h(com.bykv.vk.openvk.preload.b.h.a aVar, byte b) {
        this(aVar);
    }

    private h(com.bykv.vk.openvk.preload.b.h.a aVar) {
        this.f1701a = aVar.f1702a;
        this.b = aVar.b;
        this.c = aVar.c;
        if (this.f1701a == null) {
            throw new java.lang.IllegalArgumentException("Interceptor class == null");
        }
    }

    final com.bykv.vk.openvk.preload.b.b.a a() {
        return this.b;
    }

    final java.lang.Object[] b() {
        return this.c;
    }

    /* JADX INFO: compiled from: Pipe.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Class<? extends com.bykv.vk.openvk.preload.b.d> f1702a;
        private com.bykv.vk.openvk.preload.b.b.a b;
        private java.lang.Object[] c;

        private a() {
        }

        public static com.bykv.vk.openvk.preload.b.h.a a() {
            return new com.bykv.vk.openvk.preload.b.h.a();
        }

        public final com.bykv.vk.openvk.preload.b.h.a a(java.lang.Class<? extends com.bykv.vk.openvk.preload.b.d> cls) {
            if (cls == null) {
                throw new java.lang.IllegalArgumentException("interceptor class == null");
            }
            this.f1702a = cls;
            return this;
        }

        public final com.bykv.vk.openvk.preload.b.h.a a(com.bykv.vk.openvk.preload.b.b.a aVar) {
            this.b = aVar;
            return this;
        }

        public final com.bykv.vk.openvk.preload.b.h.a a(java.lang.Object... objArr) {
            this.c = objArr;
            return this;
        }

        public final com.bykv.vk.openvk.preload.b.h b() {
            return new com.bykv.vk.openvk.preload.b.h(this, (byte) 0);
        }
    }
}
