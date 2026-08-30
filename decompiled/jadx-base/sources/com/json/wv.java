package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class wv<Smash extends com.json.n7<?>> {
    com.json.n7<?> d;
    private final java.util.List<java.lang.String> e;
    private final int f;
    com.json.xv h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<Smash>> f3544a = new java.util.concurrent.ConcurrentHashMap<>();
    private java.lang.String b = "";
    private java.lang.String c = "";
    private final java.util.Timer g = new java.util.Timer();
    private final int i = 5;

    class a extends java.util.TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3545a;

        a(java.lang.String str) {
            this.f3545a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f3545a + " from memory");
                com.json.wv.this.f3544a.remove(this.f3545a);
                ironLog.verbose("waterfall size is currently " + com.json.wv.this.f3544a.size());
            } finally {
                cancel();
            }
        }
    }

    public wv(java.util.List<java.lang.String> list, int i, com.json.xv xvVar) {
        this.e = list;
        this.f = i;
        this.h = xvVar;
    }

    private void a() {
        for (Smash smash : b()) {
            if (!smash.equals(this.d)) {
                smash.M();
            }
        }
    }

    private synchronized boolean e() {
        com.json.n7<?> n7Var;
        n7Var = this.d;
        return n7Var != null && n7Var.C() && this.d.h().equals(this.c);
    }

    public void a(com.ironsource.l2.a aVar, java.util.concurrent.CopyOnWriteArrayList<Smash> copyOnWriteArrayList, java.lang.String str) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        a();
        if (aVar == com.ironsource.l2.a.AUTOMATIC_LOAD_WHILE_SHOW || aVar == com.ironsource.l2.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.f3544a.put(str, copyOnWriteArrayList);
            if (!android.text.TextUtils.isEmpty(this.c)) {
                if (e()) {
                    ironLog.verbose("ad from previous waterfall " + this.c + " is still showing - the current waterfall " + this.b + " will be deleted instead");
                    java.lang.String str2 = this.b;
                    this.b = this.c;
                    this.c = str2;
                }
                this.g.schedule(new com.ironsource.wv.a(this.c), this.f);
            }
        } else {
            this.f3544a.clear();
            this.f3544a.put(str, copyOnWriteArrayList);
        }
        this.c = this.b;
        this.b = str;
        if (this.f3544a.size() > 5) {
            this.h.a(this.f3544a.size());
        }
    }

    public synchronized void a(com.json.n7<?> n7Var) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        com.json.n7<?> n7Var2 = this.d;
        if (n7Var2 != null && !n7Var2.equals(n7Var)) {
            this.d.M();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0049 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:29:0x0049, B:6:0x0008, B:8:0x000d, B:11:0x0012, B:13:0x0016, B:16:0x001d, B:18:0x0021, B:21:0x002e, B:23:0x0032, B:25:0x003a), top: B:35:0x0001 }] */
    public synchronized boolean a(com.ironsource.l2.a aVar, java.lang.String str, java.lang.String str2, com.json.mediationsdk.LoadWhileShowSupportState loadWhileShowSupportState, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        boolean z;
        com.json.n7<?> n7Var;
        if (!a(adapterBaseInterface, ad_unit, str)) {
            z = true;
            if ((aVar == com.ironsource.l2.a.AUTOMATIC_LOAD_WHILE_SHOW || aVar == com.ironsource.l2.a.MANUAL_WITH_LOAD_ON_SHOW) && (n7Var = this.d) != null && n7Var.C() && ((loadWhileShowSupportState == com.json.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK && this.d.c().equals(str)) || ((loadWhileShowSupportState == com.json.mediationsdk.LoadWhileShowSupportState.NONE || this.e.contains(str2)) && this.d.n().equals(str2)))) {
            }
            if (!z) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
            }
        }
        z = false;
        if (!z) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
        }
        return z;
    }

    public boolean a(com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, java.lang.String str) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        if (com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface) || !((com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(ad_unit)) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public java.util.List<Smash> b() {
        java.util.concurrent.CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f3544a.get(this.b);
        return copyOnWriteArrayList == null ? new java.util.concurrent.CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    public synchronized void b(com.json.n7<?> n7Var) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        this.d = n7Var;
    }

    public java.lang.String c() {
        return this.b;
    }

    public com.json.n7<?> d() {
        return this.d;
    }
}
