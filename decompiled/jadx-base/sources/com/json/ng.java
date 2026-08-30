package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ng extends com.json.q7 {
    private static final com.json.ng d = new com.json.ng();
    private com.json.mediationsdk.sdk.LevelPlayInterstitialListener b = null;
    private com.json.mediationsdk.sdk.LevelPlayInterstitialListener c = null;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3078a;

        a(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3078a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.b != null) {
                com.json.ng.this.b.onAdShowSucceeded(com.json.ng.this.a(this.f3078a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + com.json.ng.this.a(this.f3078a));
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError f3079a;
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo b;

        b(com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3079a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.c != null) {
                com.json.ng.this.c.onAdShowFailed(this.f3079a, com.json.ng.this.a(this.b));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + com.json.ng.this.a(this.b) + ", error = " + this.f3079a.getErrorMessage());
            }
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError f3080a;
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo b;

        c(com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3080a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.b != null) {
                com.json.ng.this.b.onAdShowFailed(this.f3080a, com.json.ng.this.a(this.b));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + com.json.ng.this.a(this.b) + ", error = " + this.f3080a.getErrorMessage());
            }
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3081a;

        d(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3081a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.c != null) {
                com.json.ng.this.c.onAdClicked(com.json.ng.this.a(this.f3081a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdClicked() adInfo = " + com.json.ng.this.a(this.f3081a));
            }
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3082a;

        e(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3082a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.b != null) {
                com.json.ng.this.b.onAdClicked(com.json.ng.this.a(this.f3082a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdClicked() adInfo = " + com.json.ng.this.a(this.f3082a));
            }
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3083a;

        f(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3083a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.c != null) {
                com.json.ng.this.c.onAdReady(com.json.ng.this.a(this.f3083a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdReady() adInfo = " + com.json.ng.this.a(this.f3083a));
            }
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3084a;

        g(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3084a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.b != null) {
                com.json.ng.this.b.onAdReady(com.json.ng.this.a(this.f3084a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdReady() adInfo = " + com.json.ng.this.a(this.f3084a));
            }
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError f3085a;

        h(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
            this.f3085a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.c != null) {
                com.json.ng.this.c.onAdLoadFailed(this.f3085a);
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f3085a.getErrorMessage());
            }
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError f3086a;

        i(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
            this.f3086a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.b != null) {
                com.json.ng.this.b.onAdLoadFailed(this.f3086a);
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f3086a.getErrorMessage());
            }
        }
    }

    class j implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3087a;

        j(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3087a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.c != null) {
                com.json.ng.this.c.onAdOpened(com.json.ng.this.a(this.f3087a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdOpened() adInfo = " + com.json.ng.this.a(this.f3087a));
            }
        }
    }

    class k implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3088a;

        k(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3088a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.b != null) {
                com.json.ng.this.b.onAdOpened(com.json.ng.this.a(this.f3088a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdOpened() adInfo = " + com.json.ng.this.a(this.f3088a));
            }
        }
    }

    class l implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3089a;

        l(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3089a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.c != null) {
                com.json.ng.this.c.onAdClosed(com.json.ng.this.a(this.f3089a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdClosed() adInfo = " + com.json.ng.this.a(this.f3089a));
            }
        }
    }

    class m implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3090a;

        m(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3090a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.b != null) {
                com.json.ng.this.b.onAdClosed(com.json.ng.this.a(this.f3090a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdClosed() adInfo = " + com.json.ng.this.a(this.f3090a));
            }
        }
    }

    class n implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdInfo f3091a;

        n(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            this.f3091a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.ng.this.c != null) {
                com.json.ng.this.c.onAdShowSucceeded(com.json.ng.this.a(this.f3091a));
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + com.json.ng.this.a(this.f3091a));
            }
        }
    }

    private ng() {
    }

    public static synchronized com.json.ng a() {
        return d;
    }

    private void a(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public void a(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.h(ironSourceError));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.i(ironSourceError));
        }
    }

    public void a(com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.b(ironSourceError, adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.c(ironSourceError, adInfo));
        }
    }

    public synchronized void a(com.json.mediationsdk.sdk.LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.b = levelPlayInterstitialListener;
    }

    public void b(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.d(adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.e(adInfo));
        }
    }

    public synchronized void b(com.json.mediationsdk.sdk.LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.c = levelPlayInterstitialListener;
    }

    public void c(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.l(adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.m(adInfo));
        }
    }

    public void d(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.j(adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.k(adInfo));
        }
    }

    public void e(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.f(adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.g(adInfo));
        }
    }

    public void f(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (this.c != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.n(adInfo));
        } else if (this.b != null) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.ng.a(adInfo));
        }
    }
}
