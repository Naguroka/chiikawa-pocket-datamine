package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public class Interstitial {
    private final android.app.Activity activity;
    private final com.google.unity.ads.UnityInterstitialAdCallback callback;
    private com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd;
    private final com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = new com.google.unity.ads.Interstitial.AnonymousClass1();
    private final com.google.android.gms.ads.OnPaidEventListener onPaidEventListener = new com.google.unity.ads.Interstitial.AnonymousClass2();

    public void destroy() {
    }

    public Interstitial(android.app.Activity activity, com.google.unity.ads.UnityInterstitialAdCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    /* JADX INFO: renamed from: com.google.unity.ads.Interstitial$1, reason: invalid class name */
    class AnonymousClass1 extends com.google.android.gms.ads.FullScreenContentCallback {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(final com.google.android.gms.ads.AdError error) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Interstitial$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m932xee32b728(error);
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-Interstitial$1, reason: not valid java name */
        /* synthetic */ void m932xee32b728(com.google.android.gms.ads.AdError adError) {
            if (com.google.unity.ads.Interstitial.this.callback != null) {
                com.google.unity.ads.Interstitial.this.callback.onAdFailedToShowFullScreenContent(adError);
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Interstitial$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m934x9404ee61();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-Interstitial$1, reason: not valid java name */
        /* synthetic */ void m934x9404ee61() {
            if (com.google.unity.ads.Interstitial.this.callback != null) {
                com.google.unity.ads.Interstitial.this.callback.onAdShowedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Interstitial$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m931x35aa5d92();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-Interstitial$1, reason: not valid java name */
        /* synthetic */ void m931x35aa5d92() {
            if (com.google.unity.ads.Interstitial.this.callback != null) {
                com.google.unity.ads.Interstitial.this.callback.onAdDismissedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Interstitial$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m933lambda$onAdImpression$0$comgoogleunityadsInterstitial$1();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdImpression$0$com-google-unity-ads-Interstitial$1, reason: not valid java name */
        /* synthetic */ void m933lambda$onAdImpression$0$comgoogleunityadsInterstitial$1() {
            if (com.google.unity.ads.Interstitial.this.callback != null) {
                com.google.unity.ads.Interstitial.this.callback.onAdImpression();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Interstitial$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m930lambda$onAdClicked$0$comgoogleunityadsInterstitial$1();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdClicked$0$com-google-unity-ads-Interstitial$1, reason: not valid java name */
        /* synthetic */ void m930lambda$onAdClicked$0$comgoogleunityadsInterstitial$1() {
            if (com.google.unity.ads.Interstitial.this.callback != null) {
                com.google.unity.ads.Interstitial.this.callback.onAdClicked();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.Interstitial$2, reason: invalid class name */
    class AnonymousClass2 implements com.google.android.gms.ads.OnPaidEventListener {
        AnonymousClass2() {
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final com.google.android.gms.ads.AdValue adValue) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Interstitial$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m935lambda$onPaidEvent$0$comgoogleunityadsInterstitial$2(adValue);
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onPaidEvent$0$com-google-unity-ads-Interstitial$2, reason: not valid java name */
        /* synthetic */ void m935lambda$onPaidEvent$0$comgoogleunityadsInterstitial$2(com.google.android.gms.ads.AdValue adValue) {
            if (com.google.unity.ads.Interstitial.this.callback != null) {
                com.google.unity.ads.Interstitial.this.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    public void loadAd(final java.lang.String adUnitId, final com.google.android.gms.ads.AdRequest request) {
        this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.Interstitial$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m926lambda$loadAd$0$comgoogleunityadsInterstitial(adUnitId, request);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$loadAd$0$com-google-unity-ads-Interstitial, reason: not valid java name */
    /* synthetic */ void m926lambda$loadAd$0$comgoogleunityadsInterstitial(java.lang.String str, com.google.android.gms.ads.AdRequest adRequest) {
        com.google.android.gms.ads.interstitial.InterstitialAd.load(this.activity, str, adRequest, new com.google.unity.ads.Interstitial.AnonymousClass3());
    }

    /* JADX INFO: renamed from: com.google.unity.ads.Interstitial$3, reason: invalid class name */
    class AnonymousClass3 extends com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback {
        AnonymousClass3() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(com.google.android.gms.ads.interstitial.InterstitialAd ad) {
            com.google.unity.ads.Interstitial.this.interstitialAd = ad;
            com.google.unity.ads.Interstitial.this.interstitialAd.setOnPaidEventListener(com.google.unity.ads.Interstitial.this.onPaidEventListener);
            com.google.unity.ads.Interstitial.this.interstitialAd.setFullScreenContentCallback(com.google.unity.ads.Interstitial.this.fullScreenContentCallback);
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Interstitial$3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m937lambda$onAdLoaded$0$comgoogleunityadsInterstitial$3();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdLoaded$0$com-google-unity-ads-Interstitial$3, reason: not valid java name */
        /* synthetic */ void m937lambda$onAdLoaded$0$comgoogleunityadsInterstitial$3() {
            if (com.google.unity.ads.Interstitial.this.callback != null) {
                com.google.unity.ads.Interstitial.this.callback.onInterstitialAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final com.google.android.gms.ads.LoadAdError error) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Interstitial$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m936lambda$onAdFailedToLoad$0$comgoogleunityadsInterstitial$3(error);
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-Interstitial$3, reason: not valid java name */
        /* synthetic */ void m936lambda$onAdFailedToLoad$0$comgoogleunityadsInterstitial$3(com.google.android.gms.ads.LoadAdError loadAdError) {
            if (com.google.unity.ads.Interstitial.this.callback != null) {
                com.google.unity.ads.Interstitial.this.callback.onInterstitialAdFailedToLoad(loadAdError);
            }
        }
    }

    public boolean isAdAvailable(java.lang.String adUnitId) {
        return com.google.android.gms.ads.interstitial.InterstitialAd.isAdAvailable(this.activity, adUnitId);
    }

    public void pollAd(java.lang.String adUnitId) {
        com.google.android.gms.ads.interstitial.InterstitialAd interstitialAdPollAd = com.google.android.gms.ads.interstitial.InterstitialAd.pollAd(this.activity, adUnitId);
        this.interstitialAd = interstitialAdPollAd;
        if (interstitialAdPollAd == null) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, "Failed to obtain an Interstitial Ad from the preloader.");
            final com.google.android.gms.ads.LoadAdError loadAdError = new com.google.android.gms.ads.LoadAdError(0, "Failed to obtain an Interstitial Ad from the preloader.", com.google.android.gms.ads.MobileAds.ERROR_DOMAIN, null, null);
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Interstitial$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m927lambda$pollAd$0$comgoogleunityadsInterstitial(loadAdError);
                }
            }).start();
        } else {
            this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.Interstitial$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m928lambda$pollAd$1$comgoogleunityadsInterstitial();
                }
            });
            this.interstitialAd.setFullScreenContentCallback(this.fullScreenContentCallback);
            com.google.unity.ads.UnityInterstitialAdCallback unityInterstitialAdCallback = this.callback;
            if (unityInterstitialAdCallback != null) {
                unityInterstitialAdCallback.onInterstitialAdLoaded();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$pollAd$0$com-google-unity-ads-Interstitial, reason: not valid java name */
    /* synthetic */ void m927lambda$pollAd$0$comgoogleunityadsInterstitial(com.google.android.gms.ads.LoadAdError loadAdError) {
        com.google.unity.ads.UnityInterstitialAdCallback unityInterstitialAdCallback = this.callback;
        if (unityInterstitialAdCallback != null) {
            unityInterstitialAdCallback.onInterstitialAdFailedToLoad(loadAdError);
        }
    }

    /* JADX INFO: renamed from: lambda$pollAd$1$com-google-unity-ads-Interstitial, reason: not valid java name */
    /* synthetic */ void m928lambda$pollAd$1$comgoogleunityadsInterstitial() {
        this.interstitialAd.setOnPaidEventListener(this.onPaidEventListener);
    }

    public java.lang.String getAdUnitId() {
        com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            return null;
        }
        return interstitialAd.getAdUnitId();
    }

    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<com.google.android.gms.ads.ResponseInfo>() { // from class: com.google.unity.ads.Interstitial.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public com.google.android.gms.ads.ResponseInfo call() {
                return com.google.unity.ads.Interstitial.this.interstitialAd.getResponseInfo();
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (com.google.android.gms.ads.ResponseInfo) futureTask.get();
        } catch (java.lang.InterruptedException e) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Unable to check interstitial response info: %s", e.getLocalizedMessage()));
            return null;
        } catch (java.util.concurrent.ExecutionException e2) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Unable to check interstitial response info: %s", e2.getLocalizedMessage()));
            return null;
        }
    }

    public void show() {
        if (this.interstitialAd == null) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, "Tried to show interstitial ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.Interstitial$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m929lambda$show$0$comgoogleunityadsInterstitial();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$show$0$com-google-unity-ads-Interstitial, reason: not valid java name */
    /* synthetic */ void m929lambda$show$0$comgoogleunityadsInterstitial() {
        this.interstitialAd.show(this.activity);
    }
}
