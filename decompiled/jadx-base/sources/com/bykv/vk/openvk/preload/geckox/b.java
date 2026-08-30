package com.bykv.vk.openvk.preload.geckox;

/* JADX INFO: compiled from: GeckoConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    private static com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback q;
    private static java.util.concurrent.ThreadPoolExecutor r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f1720a;
    private final com.bykv.vk.openvk.preload.geckox.a.a.c b;
    private final com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor c;
    private final com.bykv.vk.openvk.preload.geckox.net.INetWork d;
    private final java.util.List<java.lang.String> e;
    private final java.util.List<java.lang.String> f;
    private final com.bykv.vk.openvk.preload.geckox.a.a.a g;
    private final java.lang.Long h;
    private final java.lang.String i;
    private final java.lang.String j;
    private final java.lang.String k;
    private final java.lang.String l;
    private final java.lang.String m;
    private final java.io.File n;
    private final boolean o;
    private org.json.JSONObject p;

    /* synthetic */ b(com.bykv.vk.openvk.preload.geckox.b.a aVar, byte b) {
        this(aVar);
    }

    private b(com.bykv.vk.openvk.preload.geckox.b.a aVar) {
        android.content.Context context = aVar.d;
        this.f1720a = context;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context == null");
        }
        java.util.List<java.lang.String> list = aVar.b;
        this.e = list;
        this.f = aVar.c;
        this.b = null;
        this.g = aVar.g;
        java.lang.Long l = aVar.h;
        this.h = l;
        if (android.text.TextUtils.isEmpty(aVar.i)) {
            this.i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.i = aVar.i;
        }
        java.lang.String str = aVar.j;
        this.j = str;
        this.l = null;
        this.m = null;
        if (aVar.l == null) {
            this.n = new java.io.File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.n = aVar.l;
        }
        java.lang.String str2 = aVar.k;
        this.k = str2;
        if (android.text.TextUtils.isEmpty(str2)) {
            throw new java.lang.IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("access key empty");
        }
        if (l == null) {
            throw new java.lang.IllegalArgumentException("appId == null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("deviceId key empty");
        }
        this.d = aVar.f1721a;
        this.c = aVar.e;
        this.o = aVar.f;
    }

    public final android.content.Context a() {
        return this.f1720a;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.g;
    }

    public final boolean c() {
        return this.o;
    }

    public final java.util.List<java.lang.String> d() {
        return this.f;
    }

    public final java.util.List<java.lang.String> e() {
        return this.e;
    }

    public final org.json.JSONObject f() {
        return this.p;
    }

    public final void a(org.json.JSONObject jSONObject) {
        this.p = jSONObject;
    }

    public static java.util.concurrent.Executor g() {
        return p();
    }

    public static java.util.concurrent.Executor h() {
        return p();
    }

    public final com.bykv.vk.openvk.preload.geckox.net.INetWork i() {
        return this.d;
    }

    public final java.lang.String j() {
        return this.k;
    }

    public final long k() {
        return this.h.longValue();
    }

    public final java.io.File l() {
        return this.n;
    }

    public final java.lang.String m() {
        return this.i;
    }

    public final com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor n() {
        return this.c;
    }

    public final java.lang.String o() {
        return this.j;
    }

    public static java.util.concurrent.ExecutorService p() {
        com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback iThreadPoolCallback = q;
        java.util.concurrent.ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (r == null) {
            synchronized (com.bykv.vk.openvk.preload.geckox.b.class) {
                if (r == null) {
                    java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(2, 2, 20L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue());
                    r = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return r;
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback iThreadPoolCallback) {
        q = iThreadPoolCallback;
    }

    /* JADX INFO: compiled from: GeckoConfig.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.net.INetWork f1721a;
        private java.util.List<java.lang.String> b;
        private java.util.List<java.lang.String> c;
        private android.content.Context d;
        private com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor e;
        private boolean f = true;
        private com.bykv.vk.openvk.preload.geckox.a.a.a g;
        private java.lang.Long h;
        private java.lang.String i;
        private java.lang.String j;
        private java.lang.String k;
        private java.io.File l;

        public a(android.content.Context context) {
            this.d = context.getApplicationContext();
        }

        public final com.bykv.vk.openvk.preload.geckox.b.a a(java.lang.String... strArr) {
            this.c = java.util.Arrays.asList(strArr);
            return this;
        }

        public final com.bykv.vk.openvk.preload.geckox.b.a b(java.lang.String... strArr) {
            this.b = java.util.Arrays.asList(strArr);
            return this;
        }

        public final com.bykv.vk.openvk.preload.geckox.b.a a(com.bykv.vk.openvk.preload.geckox.net.INetWork iNetWork) {
            this.f1721a = iNetWork;
            return this;
        }

        public final com.bykv.vk.openvk.preload.geckox.b.a a(com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor iStatisticMonitor) {
            this.e = iStatisticMonitor;
            return this;
        }

        public final com.bykv.vk.openvk.preload.geckox.b.a a() {
            this.f = false;
            return this;
        }

        public final com.bykv.vk.openvk.preload.geckox.b.a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.g = aVar;
            return this;
        }

        public final com.bykv.vk.openvk.preload.geckox.b.a b() {
            this.h = 38L;
            return this;
        }

        public final com.bykv.vk.openvk.preload.geckox.b.a a(java.lang.String str) {
            this.i = str;
            return this;
        }

        public final com.bykv.vk.openvk.preload.geckox.b.a b(java.lang.String str) {
            this.j = str;
            return this;
        }

        public final com.bykv.vk.openvk.preload.geckox.b.a c(java.lang.String str) {
            this.k = str;
            return this;
        }

        public final com.bykv.vk.openvk.preload.geckox.b.a a(java.io.File file) {
            this.l = file;
            return this;
        }
    }
}
