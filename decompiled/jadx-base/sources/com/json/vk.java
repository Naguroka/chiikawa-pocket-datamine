package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class vk {
    private static final java.lang.String i = "WaterfallLifeCycleHolder";
    private com.json.mediationsdk.r d;
    private final java.util.List<java.lang.String> e;
    private final int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<com.json.mediationsdk.r>> f3503a = new java.util.concurrent.ConcurrentHashMap<>();
    private java.lang.String b = "";
    private java.lang.String c = "";
    private final java.util.Timer g = new java.util.Timer();
    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.adunit.adapter.utility.AdInfo> h = new java.util.concurrent.ConcurrentHashMap<>();

    class a extends java.util.TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3504a;

        a(java.lang.String str) {
            this.f3504a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f3504a + " from memory");
                com.json.vk.this.f3503a.remove(this.f3504a);
                ironLog.verbose("waterfall size is currently " + com.json.vk.this.f3503a.size());
                ironLog.verbose("removing adInfo with id " + this.f3504a + " from memory");
                com.json.vk.this.h.remove(this.f3504a);
                ironLog.verbose("adInfo size is currently " + com.json.vk.this.h.size());
            } finally {
                cancel();
            }
        }
    }

    public vk(java.util.List<java.lang.String> list, int i2) {
        this.e = list;
        this.f = i2;
    }

    private void b() {
        for (com.json.mediationsdk.r rVar : c()) {
            if (!rVar.equals(this.d)) {
                rVar.q();
            }
        }
    }

    public com.json.mediationsdk.adunit.adapter.utility.AdInfo a(java.lang.String str) {
        if (this.h.containsKey(str)) {
            return this.h.get(str);
        }
        return null;
    }

    public synchronized void a(com.json.mediationsdk.r rVar) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        com.json.mediationsdk.r rVar2 = this.d;
        if (rVar2 != null && !rVar2.equals(rVar)) {
            this.d.q();
        }
        this.d = rVar;
    }

    public void a(java.lang.String str, com.json.mediationsdk.impressionData.ImpressionData impressionData, com.json.wl wlVar) {
        if (android.text.TextUtils.isEmpty(str) || impressionData == null) {
            return;
        }
        this.h.put(str, new com.json.mediationsdk.adunit.adapter.utility.AdInfo(impressionData, wlVar));
    }

    public void a(java.util.concurrent.CopyOnWriteArrayList<com.json.mediationsdk.r> copyOnWriteArrayList, java.lang.String str) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        b();
        this.f3503a.put(str, copyOnWriteArrayList);
        if (!android.text.TextUtils.isEmpty(this.c)) {
            if (g()) {
                ironLog.verbose("ad from previous waterfall " + this.c + " is still showing - the current waterfall " + this.b + " will be deleted instead");
                java.lang.String str2 = this.b;
                this.b = this.c;
                this.c = str2;
            }
            this.g.schedule(new com.ironsource.vk.a(this.c), this.f);
        }
        this.c = this.b;
        this.b = str;
    }

    public boolean a() {
        return this.f3503a.size() > 5;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    public synchronized boolean b(com.json.mediationsdk.r rVar) {
        boolean z;
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        if (rVar == null || rVar.o()) {
            z = true;
        } else {
            z = false;
            if (this.d != null && ((rVar.w() == com.json.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK && this.d.c().equals(rVar.c())) || ((rVar.w() == com.json.mediationsdk.LoadWhileShowSupportState.NONE || this.e.contains(rVar.j())) && this.d.j().equals(rVar.j())))) {
                z = true;
            }
        }
        if (z && rVar != null) {
            ironLog.verbose(rVar.c() + " will not be added to the auction request");
        }
        return !z;
    }

    public java.util.concurrent.CopyOnWriteArrayList<com.json.mediationsdk.r> c() {
        java.util.concurrent.CopyOnWriteArrayList<com.json.mediationsdk.r> copyOnWriteArrayList = this.f3503a.get(this.b);
        return copyOnWriteArrayList == null ? new java.util.concurrent.CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public java.lang.String d() {
        return this.b;
    }

    public int e() {
        return this.f3503a.size();
    }

    public com.json.mediationsdk.r f() {
        return this.d;
    }

    public synchronized boolean g() {
        com.json.mediationsdk.r rVar;
        rVar = this.d;
        return rVar != null && rVar.u().equals(this.c);
    }
}
