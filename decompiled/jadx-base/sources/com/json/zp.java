package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class zp extends com.json.q7 {
    private static final com.json.zp d = new com.json.zp();
    private com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener b = null;
    private com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener c = null;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f3626a;
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo b;

        a(boolean z, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3626a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.mediationsdk.logger.IronLog ironLog;
            java.lang.String str;
            if (com.json.zp.this.b != null) {
                if (this.f3626a) {
                    ((com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener) com.json.zp.this.b).onAdAvailable(com.json.zp.this.a(this.b));
                    ironLog = com.json.mediationsdk.logger.IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + com.json.zp.this.a(this.b);
                } else {
                    ((com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener) com.json.zp.this.b).onAdUnavailable();
                    ironLog = com.json.mediationsdk.logger.IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.model.Placement f3627a;
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo b;

        b(com.json.mediationsdk.model.Placement placement, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3627a = placement;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.c != null) {
                com.json.zp.this.c.onAdRewarded(this.f3627a, com.json.zp.this.a(this.b));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f3627a + ", adInfo = " + com.json.zp.this.a(this.b));
            }
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.model.Placement f3628a;
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo b;

        c(com.json.mediationsdk.model.Placement placement, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3628a = placement;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.b != null) {
                com.json.zp.this.b.onAdRewarded(this.f3628a, com.json.zp.this.a(this.b));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f3628a + ", adInfo = " + com.json.zp.this.a(this.b));
            }
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError f3629a;
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo b;

        d(com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3629a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.c != null) {
                com.json.zp.this.c.onAdShowFailed(this.f3629a, com.json.zp.this.a(this.b));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + com.json.zp.this.a(this.b) + ", error = " + this.f3629a.getErrorMessage());
            }
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError f3630a;
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo b;

        e(com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3630a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.b != null) {
                com.json.zp.this.b.onAdShowFailed(this.f3630a, com.json.zp.this.a(this.b));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + com.json.zp.this.a(this.b) + ", error = " + this.f3630a.getErrorMessage());
            }
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.model.Placement f3631a;
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo b;

        f(com.json.mediationsdk.model.Placement placement, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3631a = placement;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.c != null) {
                com.json.zp.this.c.onAdClicked(this.f3631a, com.json.zp.this.a(this.b));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdClicked() placement = " + this.f3631a + ", adInfo = " + com.json.zp.this.a(this.b));
            }
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.model.Placement f3632a;
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo b;

        g(com.json.mediationsdk.model.Placement placement, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3632a = placement;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.b != null) {
                com.json.zp.this.b.onAdClicked(this.f3632a, com.json.zp.this.a(this.b));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdClicked() placement = " + this.f3632a + ", adInfo = " + com.json.zp.this.a(this.b));
            }
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3633a;

        h(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3633a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.c != null) {
                ((com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener) com.json.zp.this.c).onAdReady(com.json.zp.this.a(this.f3633a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdReady() adInfo = " + com.json.zp.this.a(this.f3633a));
            }
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3634a;

        i(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3634a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.b != null) {
                ((com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener) com.json.zp.this.b).onAdReady(com.json.zp.this.a(this.f3634a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdReady() adInfo = " + com.json.zp.this.a(this.f3634a));
            }
        }
    }

    class j implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError f3635a;

        j(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
            this.f3635a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.c != null) {
                ((com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener) com.json.zp.this.c).onAdLoadFailed(this.f3635a);
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f3635a.getErrorMessage());
            }
        }
    }

    class k implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError f3636a;

        k(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
            this.f3636a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.b != null) {
                ((com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener) com.json.zp.this.b).onAdLoadFailed(this.f3636a);
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f3636a.getErrorMessage());
            }
        }
    }

    class l implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3637a;

        l(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3637a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.c != null) {
                com.json.zp.this.c.onAdOpened(com.json.zp.this.a(this.f3637a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdOpened() adInfo = " + com.json.zp.this.a(this.f3637a));
            }
        }
    }

    class m implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3638a;

        m(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3638a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.b != null) {
                com.json.zp.this.b.onAdOpened(com.json.zp.this.a(this.f3638a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdOpened() adInfo = " + com.json.zp.this.a(this.f3638a));
            }
        }
    }

    class n implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3639a;

        n(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3639a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.c != null) {
                com.json.zp.this.c.onAdClosed(com.json.zp.this.a(this.f3639a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdClosed() adInfo = " + com.json.zp.this.a(this.f3639a));
            }
        }
    }

    class o implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3640a;

        o(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3640a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.zp.this.b != null) {
                com.json.zp.this.b.onAdClosed(com.json.zp.this.a(this.f3640a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdClosed() adInfo = " + com.json.zp.this.a(this.f3640a));
            }
        }
    }

    class p implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f3641a;
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo b;

        p(boolean z, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3641a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.mediationsdk.logger.IronLog ironLog;
            java.lang.String str;
            if (com.json.zp.this.c != null) {
                if (this.f3641a) {
                    ((com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener) com.json.zp.this.c).onAdAvailable(com.json.zp.this.a(this.b));
                    ironLog = com.json.mediationsdk.logger.IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + com.json.zp.this.a(this.b);
                } else {
                    ((com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener) com.json.zp.this.c).onAdUnavailable();
                    ironLog = com.json.mediationsdk.logger.IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    private zp() {
    }

    public static com.json.zp a() {
        return d;
    }

    private void a(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public void a(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.j(ironSourceError));
            return;
        }
        com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener)) {
            return;
        }
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.k(ironSourceError));
    }

    public void a(com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.d(ironSourceError, adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.e(ironSourceError, adInfo));
        }
    }

    public void a(com.json.mediationsdk.model.Placement placement, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.f(placement, adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.g(placement, adInfo));
        }
    }

    public void a(com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.b = levelPlayRewardedVideoBaseListener;
    }

    public void a(boolean z, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.p(z, adInfo));
            return;
        }
        com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener)) {
            return;
        }
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.a(z, adInfo));
    }

    public void b() {
    }

    public void b(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.n(adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.o(adInfo));
        }
    }

    public void b(com.json.mediationsdk.model.Placement placement, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.b(placement, adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.c(placement, adInfo));
        }
    }

    public void b(com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.c = levelPlayRewardedVideoBaseListener;
    }

    public void c() {
    }

    public void c(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.l(adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.m(adInfo));
        }
    }

    public void d(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.h(adInfo));
            return;
        }
        com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener)) {
            return;
        }
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.zp.i(adInfo));
    }
}
