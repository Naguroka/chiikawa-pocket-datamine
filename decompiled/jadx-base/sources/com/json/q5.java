package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class q5 extends com.json.q7 {
    private static final com.json.q5 d = new com.json.q5();
    private com.json.mediationsdk.sdk.LevelPlayBannerListener b = null;
    private com.json.mediationsdk.sdk.LevelPlayBannerListener c = null;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3179a;

        a(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3179a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.q5.this.b != null) {
                com.json.q5.this.b.onAdLeftApplication(com.json.q5.this.a(this.f3179a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + com.json.q5.this.a(this.f3179a));
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3180a;

        b(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3180a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.q5.this.c != null) {
                com.json.q5.this.c.onAdClicked(com.json.q5.this.a(this.f3180a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdClicked() adInfo = " + com.json.q5.this.a(this.f3180a));
            }
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3181a;

        c(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3181a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.q5.this.b != null) {
                com.json.q5.this.b.onAdClicked(com.json.q5.this.a(this.f3181a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdClicked() adInfo = " + com.json.q5.this.a(this.f3181a));
            }
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3182a;

        d(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3182a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.q5.this.c != null) {
                com.json.q5.this.c.onAdLoaded(com.json.q5.this.a(this.f3182a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoaded() adInfo = " + com.json.q5.this.a(this.f3182a));
            }
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3183a;

        e(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3183a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.q5.this.b != null) {
                com.json.q5.this.b.onAdLoaded(com.json.q5.this.a(this.f3183a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoaded() adInfo = " + com.json.q5.this.a(this.f3183a));
            }
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError f3184a;

        f(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
            this.f3184a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.q5.this.c != null) {
                com.json.q5.this.c.onAdLoadFailed(this.f3184a);
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f3184a.getErrorMessage());
            }
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError f3185a;

        g(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
            this.f3185a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.q5.this.b != null) {
                com.json.q5.this.b.onAdLoadFailed(this.f3185a);
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f3185a.getErrorMessage());
            }
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3186a;

        h(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3186a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.q5.this.c != null) {
                com.json.q5.this.c.onAdScreenPresented(com.json.q5.this.a(this.f3186a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + com.json.q5.this.a(this.f3186a));
            }
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3187a;

        i(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3187a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.q5.this.b != null) {
                com.json.q5.this.b.onAdScreenPresented(com.json.q5.this.a(this.f3187a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + com.json.q5.this.a(this.f3187a));
            }
        }
    }

    class j implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3188a;

        j(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3188a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.q5.this.c != null) {
                com.json.q5.this.c.onAdScreenDismissed(com.json.q5.this.a(this.f3188a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + com.json.q5.this.a(this.f3188a));
            }
        }
    }

    class k implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3189a;

        k(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3189a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.q5.this.b != null) {
                com.json.q5.this.b.onAdScreenDismissed(com.json.q5.this.a(this.f3189a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + com.json.q5.this.a(this.f3189a));
            }
        }
    }

    class l implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3190a;

        l(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3190a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.q5.this.c != null) {
                com.json.q5.this.c.onAdLeftApplication(com.json.q5.this.a(this.f3190a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + com.json.q5.this.a(this.f3190a));
            }
        }
    }

    private q5() {
    }

    public static com.json.q5 a() {
        return d;
    }

    public void a(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.q5.f(ironSourceError));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.q5.g(ironSourceError));
        }
    }

    public void a(com.json.mediationsdk.sdk.LevelPlayBannerListener levelPlayBannerListener) {
        this.b = levelPlayBannerListener;
    }

    public com.json.mediationsdk.sdk.LevelPlayBannerListener b() {
        return this.b;
    }

    public void b(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.q5.b(adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.q5.c(adInfo));
        }
    }

    public void b(com.json.mediationsdk.sdk.LevelPlayBannerListener levelPlayBannerListener) {
        this.c = levelPlayBannerListener;
    }

    public void c(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.q5.l(adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.q5.a(adInfo));
        }
    }

    public void d(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.q5.d(adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.q5.e(adInfo));
        }
    }

    public void e(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.q5.j(adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.q5.k(adInfo));
        }
    }

    public void f(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.q5.h(adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.q5.i(adInfo));
        }
    }
}
