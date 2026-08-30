package com.bykv.vk.openvk.preload.geckox.a.a;

/* JADX INFO: compiled from: CacheConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f1713a;
    private final com.bykv.vk.openvk.preload.geckox.a.a.b b;
    private com.bykv.vk.openvk.preload.geckox.a.a.c c;

    /* synthetic */ a(com.bykv.vk.openvk.preload.geckox.a.a.a.C0074a c0074a, byte b) {
        this(c0074a);
    }

    private a(com.bykv.vk.openvk.preload.geckox.a.a.a.C0074a c0074a) {
        this.f1713a = c0074a.f1714a;
        this.b = c0074a.b;
        this.c = null;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.b a() {
        return this.b;
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheConfig.java */
    public static final class C0074a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1714a;
        private com.bykv.vk.openvk.preload.geckox.a.a.b b = com.bykv.vk.openvk.preload.geckox.a.a.b.f1715a;

        public final com.bykv.vk.openvk.preload.geckox.a.a.a.C0074a a() {
            this.f1714a = 20;
            return this;
        }

        public final com.bykv.vk.openvk.preload.geckox.a.a.a.C0074a a(com.bykv.vk.openvk.preload.geckox.a.a.b bVar) {
            if (bVar == null) {
                bVar = com.bykv.vk.openvk.preload.geckox.a.a.b.f1715a;
            }
            this.b = bVar;
            return this;
        }

        public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
            return new com.bykv.vk.openvk.preload.geckox.a.a.a(this, (byte) 0);
        }
    }
}
