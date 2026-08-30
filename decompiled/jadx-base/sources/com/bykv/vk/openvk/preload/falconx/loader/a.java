package com.bykv.vk.openvk.preload.falconx.loader;

/* JADX INFO: compiled from: GeckoResLoader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements com.bykv.vk.openvk.preload.falconx.loader.ILoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.e.b f1707a;
    private java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);

    public a(android.content.Context context, java.lang.String str, java.io.File file) {
        if (context == null) {
            throw new java.lang.RuntimeException("context == null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.RuntimeException("access key empty");
        }
        if (file == null) {
            throw new java.lang.RuntimeException("resRootDir == null");
        }
        this.f1707a = new com.bykv.vk.openvk.preload.geckox.e.b(context, str, file);
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final java.io.InputStream getInputStream(java.lang.String str) throws java.lang.Exception {
        if (this.b.get()) {
            throw new java.lang.RuntimeException("released!");
        }
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("WebOffline-falcon", "GeckoResLoader ready to load, file:", str);
        return this.f1707a.a(str);
    }

    public final int a(java.lang.String str) throws java.lang.Exception {
        if (this.b.get()) {
            throw new java.lang.RuntimeException("released!");
        }
        return this.f1707a.b(str);
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final boolean exist(java.lang.String str) throws java.lang.Exception {
        if (this.b.get()) {
            throw new java.lang.RuntimeException("released!");
        }
        return this.f1707a.c(str);
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final java.lang.String getResRootDir() {
        return this.f1707a.a();
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final java.util.Map<java.lang.String, java.lang.Long> getChannelVersion() {
        return this.f1707a.b();
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final void release() throws java.lang.Exception {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.f1707a.c();
    }
}
