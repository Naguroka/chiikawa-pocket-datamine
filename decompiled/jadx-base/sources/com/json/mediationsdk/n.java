package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class n {
    private static final com.json.mediationsdk.n f = new com.json.mediationsdk.n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.Long> f2997a = new java.util.HashMap();
    private final java.util.Map<java.lang.String, java.lang.Boolean> b = new java.util.HashMap();
    private int c;
    private int d;
    private int e;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.IronSource.AD_UNIT f2998a;
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError b;
        final /* synthetic */ java.lang.String c;

        a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, com.json.mediationsdk.logger.IronSourceError ironSourceError, java.lang.String str) {
            this.f2998a = ad_unit;
            this.b = ironSourceError;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            com.json.mediationsdk.n.this.a(this.f2998a, this.b);
            com.json.mediationsdk.n.this.b.put(this.c, java.lang.Boolean.FALSE);
        }
    }

    private n() {
    }

    private int a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.d;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            return this.c;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER) {
            return this.e;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return 0;
    }

    public static synchronized com.json.mediationsdk.n a() {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f2997a.put(ad_unit.toString(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            com.json.zp.a().a(ironSourceError);
            return;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            com.json.ng.a().a(ironSourceError);
        } else if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER) {
            com.json.q5.a().a(ironSourceError);
        } else {
            com.json.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        }
    }

    public void a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, int i) {
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.d = i;
            return;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            this.c = i;
        } else if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER) {
            this.e = i;
        } else {
            com.json.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        }
    }

    public synchronized void b(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        if (b(ad_unit)) {
            return;
        }
        java.lang.String string = ad_unit.toString();
        if (!this.f2997a.containsKey(string)) {
            a(ad_unit, ironSourceError);
            return;
        }
        long jA = ((long) a(ad_unit)) * 1000;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - this.f2997a.get(string).longValue();
        if (jCurrentTimeMillis > jA) {
            a(ad_unit, ironSourceError);
            return;
        }
        this.b.put(string, java.lang.Boolean.TRUE);
        long j = jA - jCurrentTimeMillis;
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("delaying callback by " + j);
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.mediationsdk.n.a(ad_unit, ironSourceError, string), j);
    }

    public synchronized boolean b(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (!this.b.containsKey(ad_unit.toString())) {
            return false;
        }
        return this.b.get(ad_unit.toString()).booleanValue();
    }
}
