package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ib {
    protected final com.applovin.impl.sdk.j b;
    protected final com.applovin.impl.sdk.AppLovinAdServiceImpl c;
    private com.applovin.sdk.AppLovinAd d;
    private java.lang.String e;
    private java.lang.ref.SoftReference f;
    private volatile java.lang.String h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map f880a = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final java.lang.Object g = new java.lang.Object();
    private volatile boolean i = false;

    public ib(java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk) {
        this.b = appLovinSdk.a();
        this.c = (com.applovin.impl.sdk.AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.e = str;
    }

    public boolean d() {
        return this.d != null;
    }

    private void e() {
        com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener;
        java.lang.ref.SoftReference softReference = this.f;
        if (softReference == null || (appLovinAdLoadListener = (com.applovin.sdk.AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(com.applovin.sdk.AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    public java.lang.String c() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String b() {
        java.lang.String str;
        synchronized (this.g) {
            str = this.h;
        }
        return str;
    }

    private class c implements com.applovin.impl.pb, com.applovin.sdk.AppLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdRewardListener, com.applovin.sdk.AppLovinAdClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.sdk.AppLovinAd f883a;
        private final com.applovin.sdk.AppLovinAdDisplayListener b;
        private final com.applovin.sdk.AppLovinAdClickListener c;
        private final com.applovin.sdk.AppLovinAdVideoPlaybackListener d;
        private final com.applovin.sdk.AppLovinAdRewardListener f;

        private c(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
            this.f883a = appLovinAd;
            this.b = appLovinAdDisplayListener;
            this.c = appLovinAdClickListener;
            this.d = appLovinAdVideoPlaybackListener;
            this.f = appLovinAdRewardListener;
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
            com.applovin.impl.fc.a(this.b, appLovinAd);
        }

        @Override // com.applovin.impl.pb
        public void onAdDisplayFailed(java.lang.String str) {
            com.applovin.sdk.AppLovinAd appLovinAdF = this.f883a;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.c) {
                appLovinAdF = ((com.applovin.impl.sdk.ad.c) appLovinAdF).f();
            }
            boolean z = this.b instanceof com.applovin.impl.pb;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                a((com.applovin.impl.sdk.ad.b) appLovinAdF);
            } else {
                java.lang.String str2 = appLovinAdF == null ? "null/expired ad" : "invalid ad of type: " + appLovinAdF;
                com.applovin.impl.ib.this.b.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.ib.this.b.I().b("IncentivizedAdController", "Received `" + (z ? "adDisplayFailed" : "adHidden") + "` callback for " + str2);
                }
            }
            com.applovin.impl.ib.this.a(appLovinAdF);
            if (z) {
                com.applovin.impl.fc.a(this.b, str);
            } else {
                com.applovin.impl.fc.b(this.b, this.f883a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
            com.applovin.sdk.AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                a((com.applovin.impl.sdk.ad.b) appLovinAdF);
            } else {
                java.lang.String str = appLovinAdF == null ? "null/expired ad" : "invalid ad of type: " + appLovinAdF;
                com.applovin.impl.ib.this.b.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.ib.this.b.I().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            com.applovin.impl.ib.this.a(appLovinAdF);
            com.applovin.impl.ib.this.b.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.ib.this.b.I().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            com.applovin.impl.fc.b(this.b, appLovinAd);
        }

        private void a(com.applovin.impl.sdk.ad.b bVar) {
            java.lang.String str;
            int i;
            com.applovin.impl.ib.this.b.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.ib.this.b.I().a("IncentivizedAdController", "Finishing direct ad...");
            }
            java.lang.String strB = com.applovin.impl.ib.this.b();
            if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(strB) || !com.applovin.impl.ib.this.i) {
                com.applovin.impl.ib.this.b.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.ib.this.b.I().b("IncentivizedAdController", "Invalid reward state - result: " + strB + " and wasFullyEngaged: " + com.applovin.impl.ib.this.i);
                }
                com.applovin.impl.ib.this.b.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.ib.this.b.I().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.c();
                if (com.applovin.impl.ib.this.i) {
                    com.applovin.impl.ib.this.b.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.ib.this.b.I().b("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i = com.applovin.sdk.AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    com.applovin.impl.ib.this.b.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.ib.this.b.I().b("IncentivizedAdController", "User close the ad prematurely");
                    }
                    str = "user_closed_video";
                    i = com.applovin.sdk.AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                bVar.a(com.applovin.impl.eh.a(str));
                com.applovin.impl.ib.this.b.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.ib.this.b.I().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                com.applovin.impl.fc.a(this.f, bVar, i);
            }
            if (bVar.H0().getAndSet(true)) {
                return;
            }
            com.applovin.impl.ib.this.b.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.ib.this.b.I().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            com.applovin.impl.ib.this.b.i0().a((com.applovin.impl.yl) new com.applovin.impl.en(bVar, com.applovin.impl.ib.this.b), com.applovin.impl.tm.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(com.applovin.sdk.AppLovinAd appLovinAd) {
            com.applovin.impl.fc.a(this.c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(com.applovin.sdk.AppLovinAd appLovinAd) {
            com.applovin.impl.fc.a(this.d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(com.applovin.sdk.AppLovinAd appLovinAd, double d, boolean z) {
            com.applovin.impl.fc.a(this.d, appLovinAd, d, z);
            com.applovin.impl.ib.this.i = z;
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map map) {
            com.applovin.impl.ib.this.a("accepted");
            com.applovin.impl.fc.c(this.f, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map map) {
            com.applovin.impl.ib.this.a("quota_exceeded");
            com.applovin.impl.fc.b(this.f, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map map) {
            com.applovin.impl.ib.this.a("rejected");
            com.applovin.impl.fc.a(this.f, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(com.applovin.sdk.AppLovinAd appLovinAd, int i) {
            com.applovin.impl.ib.this.a("network_timeout");
            com.applovin.impl.fc.a(this.f, appLovinAd, i);
        }

        /* synthetic */ c(com.applovin.impl.ib ibVar, com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener, com.applovin.impl.ib.a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }
    }

    public void b(com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        this.b.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.b.I().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f = new java.lang.ref.SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.n.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.d);
                return;
            }
            return;
        }
        a(new com.applovin.impl.ib.b(appLovinAdLoadListener));
    }

    private void a(com.applovin.sdk.AppLovinAd appLovinAd, java.lang.String str, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.impl.pb pbVar) {
        this.b.C().c(com.applovin.impl.ba.o);
        com.applovin.impl.fc.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        com.applovin.impl.fc.a(pbVar, str);
    }

    public void b(com.applovin.sdk.AppLovinAd appLovinAd, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.content.Context context, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        a(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener == null ? a() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b implements com.applovin.sdk.AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.sdk.AppLovinAdLoadListener f882a;

        b(com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f882a = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final com.applovin.sdk.AppLovinAd appLovinAd) {
            com.applovin.impl.ib.this.d = appLovinAd;
            if (this.f882a != null) {
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.ib$b$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(appLovinAd);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.sdk.AppLovinAd appLovinAd) {
            try {
                this.f882a.adReceived(appLovinAd);
            } catch (java.lang.Throwable th) {
                com.applovin.impl.sdk.n.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                com.applovin.impl.ib.this.b.D().a("IncentivizedAdController", "adLoaded", th);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i) {
            if (this.f882a != null) {
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.ib$b$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i) {
            try {
                this.f882a.failedToReceiveAd(i);
            } catch (java.lang.Throwable th) {
                com.applovin.impl.sdk.n.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                com.applovin.impl.ib.this.b.D().a("IncentivizedAdController", "adLoadFailed", th);
            }
        }
    }

    class a implements com.applovin.sdk.AppLovinAdRewardListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map map) {
            com.applovin.impl.ib.this.b.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.ib.this.b.I().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map map) {
            com.applovin.impl.ib.this.b.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.ib.this.b.I().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map map) {
            com.applovin.impl.ib.this.b.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.ib.this.b.I().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(com.applovin.sdk.AppLovinAd appLovinAd, int i) {
            com.applovin.impl.ib.this.b.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.ib.this.b.I().b("IncentivizedAdController", "Reward validation failed: " + i);
            }
        }
    }

    private void a(com.applovin.sdk.AppLovinAd appLovinAd, android.content.Context context, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (com.applovin.impl.sdk.ad.AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (com.applovin.impl.sdk.ad.AppLovinAdImpl) this.d;
        }
        com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.n.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    private void a(com.applovin.sdk.AppLovinAd appLovinAd, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.content.Context context, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (com.applovin.impl.sdk.ad.AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (com.applovin.impl.sdk.ad.AppLovinAdImpl) this.d;
        }
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.n.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    private void a(com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl, android.content.Context context, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        com.applovin.impl.ib.c cVar = new com.applovin.impl.ib.c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        com.applovin.sdk.AppLovinAd appLovinAdA = com.applovin.impl.yp.a(appLovinAdImpl, this.b);
        java.lang.String strA = a(appLovinAdA, appLovinAdImpl);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        com.applovin.adview.AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = com.applovin.adview.AppLovinInterstitialAd.create(this.b.q0(), context);
        for (java.lang.String str : this.f880a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f880a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private void a(com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.content.Context context, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        com.applovin.impl.ib.c cVar = new com.applovin.impl.ib.c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        com.applovin.sdk.AppLovinAd appLovinAdA = com.applovin.impl.yp.a(appLovinAdImpl, this.b);
        java.lang.String strA = a(appLovinAdA, appLovinAdImpl);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        com.applovin.adview.AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = com.applovin.adview.AppLovinInterstitialAd.create(this.b.q0(), context);
        for (java.lang.String str : this.f880a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f880a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA, viewGroup, lifecycle);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener) {
        this.b.i0().a((com.applovin.impl.yl) new com.applovin.impl.kn(bVar, appLovinAdRewardListener, this.b), com.applovin.impl.tm.b.OTHER);
    }

    private void a(com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        this.c.loadNextIncentivizedAd(this.e, appLovinAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.sdk.AppLovinAd appLovinAd2 = this.d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.f() == null || appLovinAd == cVar.f()) {
                this.d = null;
            }
        }
    }

    private java.lang.String a(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.sdk.AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            com.applovin.impl.sdk.n.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == com.applovin.sdk.AppLovinAdType.INCENTIVIZED || appLovinAd2.getType() == com.applovin.sdk.AppLovinAdType.AUTO_INCENTIVIZED) {
            return null;
        }
        com.applovin.impl.sdk.n.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    public void a(java.lang.String str, java.lang.Object obj) {
        this.f880a.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str) {
        synchronized (this.g) {
            this.h = str;
        }
    }

    public void a(com.applovin.sdk.AppLovinAd appLovinAd, android.content.Context context, java.lang.String str, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private com.applovin.sdk.AppLovinAdRewardListener a() {
        return new com.applovin.impl.ib.a();
    }
}
