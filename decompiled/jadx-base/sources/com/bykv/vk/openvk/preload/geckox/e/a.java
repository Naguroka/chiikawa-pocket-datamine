package com.bykv.vk.openvk.preload.geckox.e;

/* JADX INFO: compiled from: ChannelVerLoader.java */
/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f1732a;
    private java.lang.String b;
    private volatile java.io.File c;
    private volatile java.lang.Long d;
    private volatile com.bykv.vk.openvk.preload.geckox.e.a.a e;
    private java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean(false);

    a(java.lang.String str, java.lang.String str2) {
        this.f1732a = str;
        this.b = str2;
    }

    final java.io.InputStream a(java.lang.String str) throws java.lang.Exception {
        return d(this.b).a(a(this.b, str));
    }

    final boolean b(java.lang.String str) throws java.lang.Exception {
        return d(this.b).b(a(this.b, str));
    }

    private synchronized com.bykv.vk.openvk.preload.geckox.e.a.a d(java.lang.String str) throws java.lang.Exception {
        if (this.e != null) {
            return this.e;
        }
        java.io.File fileE = e(str);
        if (fileE == null) {
            throw new java.io.FileNotFoundException("channel no exist，channel:".concat(java.lang.String.valueOf(str)));
        }
        java.io.File file = new java.io.File(fileE, "res.macv");
        java.io.File file2 = new java.io.File(fileE, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.e = new com.bykv.vk.openvk.preload.geckox.e.a.c(fileE);
        } else if (file.exists() && file.isFile()) {
            this.e = new com.bykv.vk.openvk.preload.geckox.e.a.b(fileE);
        } else {
            throw new java.lang.RuntimeException("can not find res, dir:" + fileE.getAbsolutePath());
        }
        return this.e;
    }

    private static java.lang.String a(java.lang.String str, java.lang.String str2) {
        return str2.substring(str.length() + 1);
    }

    private synchronized java.io.File e(java.lang.String str) throws java.lang.Exception {
        if (this.c != null) {
            return this.c;
        }
        if (this.d != null && this.d.longValue() == -1) {
            return null;
        }
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(this.f1732a + java.io.File.separator + str + java.io.File.separator + "select.lock");
        try {
            if (this.d == null) {
                this.d = com.bykv.vk.openvk.preload.geckox.utils.g.a(new java.io.File(this.f1732a, str));
            }
            if (this.d == null) {
                this.d = -1L;
                bVarA.a();
                return null;
            }
            java.io.File file = new java.io.File(this.f1732a, java.io.File.separator + str + java.io.File.separator + this.d + java.io.File.separator + "using.lock");
            this.c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.f.c.a(file.getAbsolutePath());
            java.io.File file2 = this.c;
            bVarA.a();
            return file2;
        } catch (java.lang.Throwable th) {
            bVarA.a();
            throw th;
        }
    }

    public final int c(java.lang.String str) {
        int length;
        try {
            java.io.File file = new java.io.File(e(str), "res");
            if (file.exists() && file.isDirectory() && (length = file.listFiles().length) > 0) {
                return length - 1;
            }
            return 0;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    final java.lang.Long a() {
        return this.d;
    }

    final java.lang.String b() {
        return this.b;
    }

    final void c() throws java.lang.Exception {
        if (this.f.getAndSet(true)) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(this.f1732a + java.io.File.separator + this.b + java.io.File.separator + "select.lock");
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.c != null) {
                com.bykv.vk.openvk.preload.geckox.f.c.b(this.c.getAbsolutePath() + java.io.File.separator + "using.lock");
                bVarA.a();
                com.bykv.vk.openvk.preload.geckox.a.c.a(this.f1732a + java.io.File.separator + this.b);
                return;
            }
            bVarA.a();
        } catch (java.lang.Throwable th) {
            bVarA.a();
            throw th;
        }
    }
}
