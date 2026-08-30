package com.google.unity.ads.admanager;

/* JADX INFO: loaded from: classes5.dex */
public class UnityAdManagerInterstitialAd {
    private final android.app.Activity activity;
    private com.google.android.gms.ads.admanager.AdManagerInterstitialAd adManagerInterstitialAd;
    private final com.google.unity.ads.admanager.UnityAdManagerInterstitialAdCallback callback;
    private final java.util.concurrent.ExecutorService service = java.util.concurrent.Executors.newSingleThreadExecutor();
    private final com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = new com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.AnonymousClass1();
    private final com.google.android.gms.ads.OnPaidEventListener onPaidEventListener = new com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.AnonymousClass2();
    private final com.google.android.gms.ads.admanager.AppEventListener appEventListener = new com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.AnonymousClass3();

    public void destroy() {
    }

    /* JADX INFO: renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1, reason: invalid class name */
    class AnonymousClass1 extends com.google.android.gms.ads.FullScreenContentCallback {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(final com.google.android.gms.ads.AdError error) {
            com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1004x45742723(error);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1, reason: not valid java name */
        /* synthetic */ void m1004x45742723(com.google.android.gms.ads.AdError adError) {
            if (com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback != null) {
                com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback.onAdFailedToShowFullScreenContent(adError);
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1006x966c591c();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1, reason: not valid java name */
        /* synthetic */ void m1006x966c591c() {
            if (com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback != null) {
                com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback.onAdShowedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1003xe2993d0d();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1, reason: not valid java name */
        /* synthetic */ void m1003xe2993d0d() {
            if (com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback != null) {
                com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback.onAdDismissedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1005xf41562a1();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdImpression$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1, reason: not valid java name */
        /* synthetic */ void m1005xf41562a1() {
            if (com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback != null) {
                com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback.onAdImpression();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1002x65fd5421();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdClicked$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1, reason: not valid java name */
        /* synthetic */ void m1002x65fd5421() {
            if (com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback != null) {
                com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback.onAdClicked();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$2, reason: invalid class name */
    class AnonymousClass2 implements com.google.android.gms.ads.OnPaidEventListener {
        AnonymousClass2() {
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final com.google.android.gms.ads.AdValue adValue) {
            com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1007x981544cc(adValue);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onPaidEvent$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$2, reason: not valid java name */
        /* synthetic */ void m1007x981544cc(com.google.android.gms.ads.AdValue adValue) {
            if (com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback != null) {
                com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$3, reason: invalid class name */
    class AnonymousClass3 implements com.google.android.gms.ads.admanager.AppEventListener {
        AnonymousClass3() {
        }

        @Override // com.google.android.gms.ads.admanager.AppEventListener
        public void onAppEvent(final java.lang.String name, final java.lang.String data) {
            com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1008xe2ea2310(name, data);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAppEvent$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$3, reason: not valid java name */
        /* synthetic */ void m1008xe2ea2310(java.lang.String str, java.lang.String str2) {
            if (com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback != null) {
                com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback.onAppEvent(str, str2);
            }
        }
    }

    public UnityAdManagerInterstitialAd(android.app.Activity activity, com.google.unity.ads.admanager.UnityAdManagerInterstitialAdCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    public void loadAd(final java.lang.String adUnitId, final com.google.android.gms.ads.admanager.AdManagerAdRequest request) {
        this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m999x872d7532(adUnitId, request);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$loadAd$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd, reason: not valid java name */
    /* synthetic */ void m999x872d7532(java.lang.String str, com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest) {
        com.google.android.gms.ads.admanager.AdManagerInterstitialAd.load(this.activity, str, adManagerAdRequest, new com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.AnonymousClass4());
    }

    /* JADX INFO: renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$4, reason: invalid class name */
    class AnonymousClass4 extends com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback {
        AnonymousClass4() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(com.google.android.gms.ads.admanager.AdManagerInterstitialAd ad) {
            com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.adManagerInterstitialAd = ad;
            com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.adManagerInterstitialAd.setOnPaidEventListener(com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.onPaidEventListener);
            com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.adManagerInterstitialAd.setAppEventListener(com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.appEventListener);
            com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.adManagerInterstitialAd.setFullScreenContentCallback(com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.fullScreenContentCallback);
            com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1010x8c473820();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdLoaded$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$4, reason: not valid java name */
        /* synthetic */ void m1010x8c473820() {
            if (com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback != null) {
                com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback.onInterstitialAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final com.google.android.gms.ads.LoadAdError error) {
            com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1009x93f23579(error);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$4, reason: not valid java name */
        /* synthetic */ void m1009x93f23579(com.google.android.gms.ads.LoadAdError loadAdError) {
            if (com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback != null) {
                com.google.unity.ads.admanager.UnityAdManagerInterstitialAd.this.callback.onInterstitialAdFailedToLoad(loadAdError);
            }
        }
    }

    public boolean isAdAvailable(java.lang.String adUnitId) {
        return com.google.android.gms.ads.admanager.AdManagerInterstitialAd.isAdAvailable(this.activity, adUnitId);
    }

    public void pollAd(java.lang.String adUnitId) {
        com.google.android.gms.ads.admanager.AdManagerInterstitialAd adManagerInterstitialAd = (com.google.android.gms.ads.admanager.AdManagerInterstitialAd) com.google.android.gms.ads.admanager.AdManagerInterstitialAd.pollAd(this.activity, adUnitId);
        this.adManagerInterstitialAd = adManagerInterstitialAd;
        if (adManagerInterstitialAd == null) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, "Failed to obtain an Ad Manager Interstitial Ad from the preloader.");
        } else {
            this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1000xf6ec000b();
                }
            });
            this.adManagerInterstitialAd.setFullScreenContentCallback(this.fullScreenContentCallback);
        }
    }

    /* JADX INFO: renamed from: lambda$pollAd$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd, reason: not valid java name */
    /* synthetic */ void m1000xf6ec000b() {
        this.adManagerInterstitialAd.setOnPaidEventListener(this.onPaidEventListener);
        this.adManagerInterstitialAd.setAppEventListener(this.appEventListener);
    }

    public java.lang.String getAdUnitId() {
        com.google.android.gms.ads.admanager.AdManagerInterstitialAd adManagerInterstitialAd = this.adManagerInterstitialAd;
        if (adManagerInterstitialAd == null) {
            return null;
        }
        return adManagerInterstitialAd.getAdUnitId();
    }

    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f$0.m998x5c69eb4();
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (com.google.android.gms.ads.ResponseInfo) futureTask.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Unable to check Ad Manager interstitial response info: %s", e.getLocalizedMessage()));
            return null;
        }
    }

    /* JADX INFO: renamed from: lambda$getResponseInfo$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd, reason: not valid java name */
    /* synthetic */ com.google.android.gms.ads.ResponseInfo m998x5c69eb4() throws java.lang.Exception {
        return this.adManagerInterstitialAd.getResponseInfo();
    }

    public void show() {
        if (this.adManagerInterstitialAd == null) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, "Tried to show Ad Manager interstitial ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1001x525dd4c6();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$show$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd, reason: not valid java name */
    /* synthetic */ void m1001x525dd4c6() {
        this.adManagerInterstitialAd.show(this.activity);
    }
}
