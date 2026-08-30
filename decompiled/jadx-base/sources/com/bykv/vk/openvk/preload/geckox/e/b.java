package com.bykv.vk.openvk.preload.geckox.e;

/* JADX INFO: compiled from: VersionedResLoader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private java.lang.String b;
    private java.lang.String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.bykv.vk.openvk.preload.geckox.e.a> f1734a = new java.util.HashMap();
    private java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public b(android.content.Context context, java.lang.String str, java.io.File file) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.RuntimeException("access key empty");
        }
        this.b = str;
        if (file == null) {
            this.d = new java.io.File(context.getFilesDir(), "gecko_offline_res_x" + java.io.File.separator + str).getAbsolutePath();
        } else {
            this.d = new java.io.File(file, str).getAbsolutePath();
        }
    }

    public final java.lang.String a() {
        return this.d;
    }

    public final java.io.InputStream a(java.lang.String str) throws java.lang.Exception {
        if (this.c.get()) {
            throw new java.lang.RuntimeException("released");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.RuntimeException("relativePath empty");
        }
        return d(str.trim()).a(str);
    }

    public final int b(java.lang.String str) throws java.lang.Exception {
        if (this.c.get()) {
            throw new java.lang.RuntimeException("released");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.RuntimeException("relativePath empty");
        }
        return d(str.trim()).c(str);
    }

    public final boolean c(java.lang.String str) throws java.lang.Exception {
        if (this.c.get()) {
            throw new java.lang.RuntimeException("released");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.RuntimeException("relativePath empty");
        }
        return d(str.trim()).b(str);
    }

    private com.bykv.vk.openvk.preload.geckox.e.a d(java.lang.String str) {
        com.bykv.vk.openvk.preload.geckox.e.a aVar;
        int iIndexOf = str.indexOf("/");
        if (iIndexOf == -1) {
            new java.lang.RuntimeException("channel：".concat(java.lang.String.valueOf(str)));
        }
        java.lang.String strSubstring = str.substring(0, iIndexOf);
        synchronized (this.f1734a) {
            aVar = this.f1734a.get(strSubstring);
            if (aVar == null) {
                aVar = new com.bykv.vk.openvk.preload.geckox.e.a(this.d, strSubstring);
                this.f1734a.put(strSubstring, aVar);
            }
        }
        return aVar;
    }

    public final java.util.Map<java.lang.String, java.lang.Long> b() {
        java.util.HashMap map = new java.util.HashMap();
        synchronized (this.f1734a) {
            java.util.Collection<com.bykv.vk.openvk.preload.geckox.e.a> collectionValues = this.f1734a.values();
            if (collectionValues == null) {
                return map;
            }
            for (com.bykv.vk.openvk.preload.geckox.e.a aVar : collectionValues) {
                map.put(aVar.b(), aVar.a());
            }
            return map;
        }
    }

    public final void c() throws java.lang.Exception {
        if (this.c.getAndSet(true)) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("Loader", "release version res loader");
        synchronized (this.f1734a) {
            java.util.Iterator<com.bykv.vk.openvk.preload.geckox.e.a> it = this.f1734a.values().iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f1734a.clear();
        }
    }
}
