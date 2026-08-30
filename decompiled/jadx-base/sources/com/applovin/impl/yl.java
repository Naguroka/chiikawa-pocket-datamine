package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yl implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f1547a;
    protected final java.lang.String b;
    protected final com.applovin.impl.sdk.n c;
    private final android.content.Context d;
    private java.lang.String f;
    private boolean g;

    public com.applovin.impl.sdk.j b() {
        return this.f1547a;
    }

    public java.lang.String c() {
        return this.b;
    }

    public android.content.Context a() {
        return this.d;
    }

    public boolean d() {
        return this.g;
    }

    public yl(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        this(str, jVar, false, null);
    }

    public yl(java.lang.String str, com.applovin.impl.sdk.j jVar, java.lang.String str2) {
        this(str, jVar, false, str2);
    }

    public java.util.concurrent.ScheduledFuture b(final java.lang.Thread thread, final long j) {
        if (j <= 0) {
            return null;
        }
        return this.f1547a.i0().b(new com.applovin.impl.jn(this.f1547a, "timeout:" + this.b, new java.lang.Runnable() { // from class: com.applovin.impl.yl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(thread, j);
            }
        }), com.applovin.impl.tm.b.TIMEOUT, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.Thread thread, long j) {
        java.util.HashMap<java.lang.String, java.lang.String> mapHashMap = com.applovin.impl.sdk.utils.CollectionUtils.hashMap("name", thread.getState().name());
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(this.f)) {
            mapHashMap.put("details", this.f);
        }
        this.f1547a.D().a(com.applovin.impl.ka.a0, this.b, (java.util.Map) mapHashMap);
        if (com.applovin.impl.sdk.n.a()) {
            this.c.k(this.b, "Task has been executing for over " + java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j) + " seconds");
        }
    }

    public yl(java.lang.String str, com.applovin.impl.sdk.j jVar, boolean z) {
        this(str, jVar, z, null);
    }

    public void a(java.lang.String str) {
        this.f = str;
    }

    public void a(boolean z) {
        this.g = z;
    }

    public yl(java.lang.String str, com.applovin.impl.sdk.j jVar, boolean z, java.lang.String str2) {
        this.b = str;
        this.f1547a = jVar;
        this.c = jVar.I();
        this.d = com.applovin.impl.sdk.j.m();
        this.g = z;
        this.f = str2;
    }

    public void a(java.lang.Throwable th) {
        java.util.Map map = com.applovin.impl.sdk.utils.CollectionUtils.map("source", this.b);
        map.put("top_main_method", th.toString());
        map.put("details", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(this.f));
        this.f1547a.D().a(com.applovin.impl.ka.Z, map);
    }
}
