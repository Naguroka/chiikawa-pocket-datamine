package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public class UnityAppOpenAd {
    private final android.app.Activity activity;
    private com.google.android.gms.ads.appopen.AppOpenAd appOpenAd;
    private final com.google.unity.ads.UnityAppOpenAdCallback callback;
    private final com.google.android.gms.ads.OnPaidEventListener onPaidEventListener = new com.google.unity.ads.UnityAppOpenAd.AnonymousClass1();
    private final com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = new com.google.unity.ads.UnityAppOpenAd.AnonymousClass2();

    public void destroy() {
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityAppOpenAd$1, reason: invalid class name */
    class AnonymousClass1 implements com.google.android.gms.ads.OnPaidEventListener {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final com.google.android.gms.ads.AdValue adValue) {
            com.google.unity.ads.UnityAppOpenAd.this.runOnNewThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m948lambda$onPaidEvent$0$comgoogleunityadsUnityAppOpenAd$1(adValue);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onPaidEvent$0$com-google-unity-ads-UnityAppOpenAd$1, reason: not valid java name */
        /* synthetic */ void m948lambda$onPaidEvent$0$comgoogleunityadsUnityAppOpenAd$1(com.google.android.gms.ads.AdValue adValue) {
            if (com.google.unity.ads.UnityAppOpenAd.this.callback != null) {
                com.google.unity.ads.UnityAppOpenAd.this.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityAppOpenAd$2, reason: invalid class name */
    class AnonymousClass2 extends com.google.android.gms.ads.FullScreenContentCallback {
        AnonymousClass2() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(final com.google.android.gms.ads.AdError error) {
            com.google.unity.ads.UnityAppOpenAd.this.runOnNewThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m951xd8053296(error);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-UnityAppOpenAd$2, reason: not valid java name */
        /* synthetic */ void m951xd8053296(com.google.android.gms.ads.AdError adError) {
            if (com.google.unity.ads.UnityAppOpenAd.this.callback != null) {
                com.google.unity.ads.UnityAppOpenAd.this.callback.onAdFailedToShowFullScreenContent(adError);
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            com.google.unity.ads.UnityAppOpenAd.this.runOnNewThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m953x52267f8f();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-UnityAppOpenAd$2, reason: not valid java name */
        /* synthetic */ void m953x52267f8f() {
            if (com.google.unity.ads.UnityAppOpenAd.this.callback != null) {
                com.google.unity.ads.UnityAppOpenAd.this.callback.onAdShowedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            com.google.unity.ads.UnityAppOpenAd.this.runOnNewThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m950x202ce680();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-UnityAppOpenAd$2, reason: not valid java name */
        /* synthetic */ void m950x202ce680() {
            if (com.google.unity.ads.UnityAppOpenAd.this.callback != null) {
                com.google.unity.ads.UnityAppOpenAd.this.callback.onAdDismissedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            com.google.unity.ads.UnityAppOpenAd.this.runOnNewThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m952lambda$onAdImpression$0$comgoogleunityadsUnityAppOpenAd$2();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdImpression$0$com-google-unity-ads-UnityAppOpenAd$2, reason: not valid java name */
        /* synthetic */ void m952lambda$onAdImpression$0$comgoogleunityadsUnityAppOpenAd$2() {
            if (com.google.unity.ads.UnityAppOpenAd.this.callback != null) {
                com.google.unity.ads.UnityAppOpenAd.this.callback.onAdImpression();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            com.google.unity.ads.UnityAppOpenAd.this.runOnNewThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m949lambda$onAdClicked$0$comgoogleunityadsUnityAppOpenAd$2();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdClicked$0$com-google-unity-ads-UnityAppOpenAd$2, reason: not valid java name */
        /* synthetic */ void m949lambda$onAdClicked$0$comgoogleunityadsUnityAppOpenAd$2() {
            if (com.google.unity.ads.UnityAppOpenAd.this.callback != null) {
                com.google.unity.ads.UnityAppOpenAd.this.callback.onAdClicked();
            }
        }
    }

    public UnityAppOpenAd(android.app.Activity activity, com.google.unity.ads.UnityAppOpenAdCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    public void loadAd(final java.lang.String adUnitId, final com.google.android.gms.ads.AdRequest request) {
        this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m944lambda$loadAd$0$comgoogleunityadsUnityAppOpenAd(adUnitId, request);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$loadAd$0$com-google-unity-ads-UnityAppOpenAd, reason: not valid java name */
    /* synthetic */ void m944lambda$loadAd$0$comgoogleunityadsUnityAppOpenAd(java.lang.String str, com.google.android.gms.ads.AdRequest adRequest) {
        com.google.android.gms.ads.appopen.AppOpenAd.load(this.activity, str, adRequest, new com.google.unity.ads.UnityAppOpenAd.AnonymousClass3());
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityAppOpenAd$3, reason: invalid class name */
    class AnonymousClass3 extends com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback {
        AnonymousClass3() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(com.google.android.gms.ads.appopen.AppOpenAd ad) {
            com.google.unity.ads.UnityAppOpenAd.this.appOpenAd = ad;
            com.google.unity.ads.UnityAppOpenAd.this.appOpenAd.setOnPaidEventListener(com.google.unity.ads.UnityAppOpenAd.this.onPaidEventListener);
            com.google.unity.ads.UnityAppOpenAd.this.appOpenAd.setFullScreenContentCallback(com.google.unity.ads.UnityAppOpenAd.this.fullScreenContentCallback);
            com.google.unity.ads.UnityAppOpenAd.this.runOnNewThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m955lambda$onAdLoaded$0$comgoogleunityadsUnityAppOpenAd$3();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdLoaded$0$com-google-unity-ads-UnityAppOpenAd$3, reason: not valid java name */
        /* synthetic */ void m955lambda$onAdLoaded$0$comgoogleunityadsUnityAppOpenAd$3() {
            if (com.google.unity.ads.UnityAppOpenAd.this.callback != null) {
                com.google.unity.ads.UnityAppOpenAd.this.callback.onAppOpenAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final com.google.android.gms.ads.LoadAdError error) {
            com.google.unity.ads.UnityAppOpenAd.this.runOnNewThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m954lambda$onAdFailedToLoad$0$comgoogleunityadsUnityAppOpenAd$3(error);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-UnityAppOpenAd$3, reason: not valid java name */
        /* synthetic */ void m954lambda$onAdFailedToLoad$0$comgoogleunityadsUnityAppOpenAd$3(com.google.android.gms.ads.LoadAdError loadAdError) {
            if (com.google.unity.ads.UnityAppOpenAd.this.callback != null) {
                com.google.unity.ads.UnityAppOpenAd.this.callback.onAppOpenAdFailedToLoad(loadAdError);
            }
        }
    }

    public void pollAd(java.lang.String adUnitId) {
        com.google.android.gms.ads.appopen.AppOpenAd appOpenAdPollAd = com.google.android.gms.ads.appopen.AppOpenAd.pollAd(this.activity, adUnitId);
        this.appOpenAd = appOpenAdPollAd;
        if (appOpenAdPollAd == null) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, "Failed to obtain an App Open Ad from the preloader.");
            final com.google.android.gms.ads.LoadAdError loadAdError = new com.google.android.gms.ads.LoadAdError(0, "Failed to obtain an App Open Ad from the preloader.", com.google.android.gms.ads.MobileAds.ERROR_DOMAIN, null, null);
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m945lambda$pollAd$0$comgoogleunityadsUnityAppOpenAd(loadAdError);
                }
            }).start();
        } else {
            this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m946lambda$pollAd$1$comgoogleunityadsUnityAppOpenAd();
                }
            });
            this.appOpenAd.setFullScreenContentCallback(this.fullScreenContentCallback);
        }
    }

    /* JADX INFO: renamed from: lambda$pollAd$0$com-google-unity-ads-UnityAppOpenAd, reason: not valid java name */
    /* synthetic */ void m945lambda$pollAd$0$comgoogleunityadsUnityAppOpenAd(com.google.android.gms.ads.LoadAdError loadAdError) {
        com.google.unity.ads.UnityAppOpenAdCallback unityAppOpenAdCallback = this.callback;
        if (unityAppOpenAdCallback != null) {
            unityAppOpenAdCallback.onAppOpenAdFailedToLoad(loadAdError);
        }
    }

    /* JADX INFO: renamed from: lambda$pollAd$1$com-google-unity-ads-UnityAppOpenAd, reason: not valid java name */
    /* synthetic */ void m946lambda$pollAd$1$comgoogleunityadsUnityAppOpenAd() {
        this.appOpenAd.setOnPaidEventListener(this.onPaidEventListener);
    }

    public boolean isAdAvailable(java.lang.String adUnitId) {
        return com.google.android.gms.ads.appopen.AppOpenAd.isAdAvailable(this.activity, adUnitId);
    }

    public void show() {
        if (this.appOpenAd == null) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, "Tried to show app open ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m947lambda$show$0$comgoogleunityadsUnityAppOpenAd();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$show$0$com-google-unity-ads-UnityAppOpenAd, reason: not valid java name */
    /* synthetic */ void m947lambda$show$0$comgoogleunityadsUnityAppOpenAd() {
        this.appOpenAd.show(this.activity);
    }

    public java.lang.String getAdUnitId() {
        com.google.android.gms.ads.appopen.AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return null;
        }
        return appOpenAd.getAdUnitId();
    }

    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        if (this.appOpenAd == null) {
            return null;
        }
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<com.google.android.gms.ads.ResponseInfo>() { // from class: com.google.unity.ads.UnityAppOpenAd.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public com.google.android.gms.ads.ResponseInfo call() {
                return com.google.unity.ads.UnityAppOpenAd.this.appOpenAd.getResponseInfo();
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (com.google.android.gms.ads.ResponseInfo) futureTask.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Unable to check unity app open ad response info: %s", e.getLocalizedMessage()));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnNewThread(final java.lang.Runnable action) {
        new java.lang.Thread(action).start();
    }
}
