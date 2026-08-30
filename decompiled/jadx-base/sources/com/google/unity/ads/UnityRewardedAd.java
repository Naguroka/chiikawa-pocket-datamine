package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public class UnityRewardedAd {
    private final android.app.Activity activity;
    private com.google.unity.ads.UnityRewardedAdCallback callback;
    private com.google.android.gms.ads.rewarded.RewardedAd rewardedAd;
    private final com.google.android.gms.ads.OnPaidEventListener onPaidEventListener = new com.google.unity.ads.UnityRewardedAd.AnonymousClass1();
    private final com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = new com.google.unity.ads.UnityRewardedAd.AnonymousClass2();

    public void destroy() {
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityRewardedAd$1, reason: invalid class name */
    class AnonymousClass1 implements com.google.android.gms.ads.OnPaidEventListener {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final com.google.android.gms.ads.AdValue adValue) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m966lambda$onPaidEvent$0$comgoogleunityadsUnityRewardedAd$1(adValue);
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onPaidEvent$0$com-google-unity-ads-UnityRewardedAd$1, reason: not valid java name */
        /* synthetic */ void m966lambda$onPaidEvent$0$comgoogleunityadsUnityRewardedAd$1(com.google.android.gms.ads.AdValue adValue) {
            if (com.google.unity.ads.UnityRewardedAd.this.callback != null) {
                com.google.unity.ads.UnityRewardedAd.this.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityRewardedAd$2, reason: invalid class name */
    class AnonymousClass2 extends com.google.android.gms.ads.FullScreenContentCallback {
        AnonymousClass2() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(final com.google.android.gms.ads.AdError error) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m969xedca1065(error);
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-UnityRewardedAd$2, reason: not valid java name */
        /* synthetic */ void m969xedca1065(com.google.android.gms.ads.AdError adError) {
            if (com.google.unity.ads.UnityRewardedAd.this.callback != null) {
                com.google.unity.ads.UnityRewardedAd.this.callback.onAdFailedToShowFullScreenContent(adError);
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m971xb7d2628c();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-UnityRewardedAd$2, reason: not valid java name */
        /* synthetic */ void m971xb7d2628c() {
            if (com.google.unity.ads.UnityRewardedAd.this.callback != null) {
                com.google.unity.ads.UnityRewardedAd.this.callback.onAdShowedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m968xaa98d9bb();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-UnityRewardedAd$2, reason: not valid java name */
        /* synthetic */ void m968xaa98d9bb() {
            if (com.google.unity.ads.UnityRewardedAd.this.callback != null) {
                com.google.unity.ads.UnityRewardedAd.this.callback.onAdDismissedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m970lambda$onAdImpression$0$comgoogleunityadsUnityRewardedAd$2();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdImpression$0$com-google-unity-ads-UnityRewardedAd$2, reason: not valid java name */
        /* synthetic */ void m970lambda$onAdImpression$0$comgoogleunityadsUnityRewardedAd$2() {
            if (com.google.unity.ads.UnityRewardedAd.this.callback != null) {
                com.google.unity.ads.UnityRewardedAd.this.callback.onAdImpression();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m967lambda$onAdClicked$0$comgoogleunityadsUnityRewardedAd$2();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdClicked$0$com-google-unity-ads-UnityRewardedAd$2, reason: not valid java name */
        /* synthetic */ void m967lambda$onAdClicked$0$comgoogleunityadsUnityRewardedAd$2() {
            if (com.google.unity.ads.UnityRewardedAd.this.callback != null) {
                com.google.unity.ads.UnityRewardedAd.this.callback.onAdClicked();
            }
        }
    }

    public UnityRewardedAd(android.app.Activity activity, com.google.unity.ads.UnityRewardedAdCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    public void loadAd(final java.lang.String adUnitId, final com.google.android.gms.ads.AdRequest request) {
        this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m961lambda$loadAd$0$comgoogleunityadsUnityRewardedAd(adUnitId, request);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$loadAd$0$com-google-unity-ads-UnityRewardedAd, reason: not valid java name */
    /* synthetic */ void m961lambda$loadAd$0$comgoogleunityadsUnityRewardedAd(java.lang.String str, com.google.android.gms.ads.AdRequest adRequest) {
        com.google.android.gms.ads.rewarded.RewardedAd.load(this.activity, str, adRequest, new com.google.unity.ads.UnityRewardedAd.AnonymousClass3());
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityRewardedAd$3, reason: invalid class name */
    class AnonymousClass3 extends com.google.android.gms.ads.rewarded.RewardedAdLoadCallback {
        AnonymousClass3() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(com.google.android.gms.ads.rewarded.RewardedAd ad) {
            com.google.unity.ads.UnityRewardedAd.this.rewardedAd = ad;
            com.google.unity.ads.UnityRewardedAd.this.rewardedAd.setOnPaidEventListener(com.google.unity.ads.UnityRewardedAd.this.onPaidEventListener);
            com.google.unity.ads.UnityRewardedAd.this.rewardedAd.setFullScreenContentCallback(com.google.unity.ads.UnityRewardedAd.this.fullScreenContentCallback);
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m973lambda$onAdLoaded$0$comgoogleunityadsUnityRewardedAd$3();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdLoaded$0$com-google-unity-ads-UnityRewardedAd$3, reason: not valid java name */
        /* synthetic */ void m973lambda$onAdLoaded$0$comgoogleunityadsUnityRewardedAd$3() {
            if (com.google.unity.ads.UnityRewardedAd.this.callback != null) {
                com.google.unity.ads.UnityRewardedAd.this.callback.onRewardedAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final com.google.android.gms.ads.LoadAdError error) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m972lambda$onAdFailedToLoad$0$comgoogleunityadsUnityRewardedAd$3(error);
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-UnityRewardedAd$3, reason: not valid java name */
        /* synthetic */ void m972lambda$onAdFailedToLoad$0$comgoogleunityadsUnityRewardedAd$3(com.google.android.gms.ads.LoadAdError loadAdError) {
            if (com.google.unity.ads.UnityRewardedAd.this.callback != null) {
                com.google.unity.ads.UnityRewardedAd.this.callback.onRewardedAdFailedToLoad(loadAdError);
            }
        }
    }

    public void pollAd(java.lang.String adUnitId) {
        com.google.android.gms.ads.rewarded.RewardedAd rewardedAdPollAd = com.google.android.gms.ads.rewarded.RewardedAd.pollAd(this.activity, adUnitId);
        this.rewardedAd = rewardedAdPollAd;
        if (rewardedAdPollAd == null) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, "Failed to obtain a Rewarded Ad from the preloader.");
            final com.google.android.gms.ads.LoadAdError loadAdError = new com.google.android.gms.ads.LoadAdError(0, "Failed to obtain a Rewarded Ad from the preloader.", com.google.android.gms.ads.MobileAds.ERROR_DOMAIN, null, null);
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m962lambda$pollAd$0$comgoogleunityadsUnityRewardedAd(loadAdError);
                }
            }).start();
        } else {
            this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m963lambda$pollAd$1$comgoogleunityadsUnityRewardedAd();
                }
            });
            this.rewardedAd.setFullScreenContentCallback(this.fullScreenContentCallback);
        }
    }

    /* JADX INFO: renamed from: lambda$pollAd$0$com-google-unity-ads-UnityRewardedAd, reason: not valid java name */
    /* synthetic */ void m962lambda$pollAd$0$comgoogleunityadsUnityRewardedAd(com.google.android.gms.ads.LoadAdError loadAdError) {
        com.google.unity.ads.UnityRewardedAdCallback unityRewardedAdCallback = this.callback;
        if (unityRewardedAdCallback != null) {
            unityRewardedAdCallback.onRewardedAdFailedToLoad(loadAdError);
        }
    }

    /* JADX INFO: renamed from: lambda$pollAd$1$com-google-unity-ads-UnityRewardedAd, reason: not valid java name */
    /* synthetic */ void m963lambda$pollAd$1$comgoogleunityadsUnityRewardedAd() {
        this.rewardedAd.setOnPaidEventListener(this.onPaidEventListener);
    }

    public boolean isAdAvailable(java.lang.String adUnitId) {
        return com.google.android.gms.ads.rewarded.RewardedAd.isAdAvailable(this.activity, adUnitId);
    }

    public void show() {
        if (this.rewardedAd == null) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, "Tried to show rewarded ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m965lambda$show$0$comgoogleunityadsUnityRewardedAd();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$show$0$com-google-unity-ads-UnityRewardedAd, reason: not valid java name */
    /* synthetic */ void m965lambda$show$0$comgoogleunityadsUnityRewardedAd() {
        this.rewardedAd.show(this.activity, new com.google.unity.ads.UnityRewardedAd.AnonymousClass4());
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityRewardedAd$4, reason: invalid class name */
    class AnonymousClass4 implements com.google.android.gms.ads.OnUserEarnedRewardListener {
        AnonymousClass4() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(final com.google.android.gms.ads.rewarded.RewardItem rewardItem) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m974xe1b880e4(rewardItem);
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onUserEarnedReward$0$com-google-unity-ads-UnityRewardedAd$4, reason: not valid java name */
        /* synthetic */ void m974xe1b880e4(com.google.android.gms.ads.rewarded.RewardItem rewardItem) {
            if (com.google.unity.ads.UnityRewardedAd.this.callback != null) {
                com.google.unity.ads.UnityRewardedAd.this.callback.onUserEarnedReward(rewardItem.getType(), rewardItem.getAmount());
            }
        }
    }

    public void setServerSideVerificationOptions(final com.google.android.gms.ads.rewarded.ServerSideVerificationOptions serverSideVerificationOptions) {
        if (this.rewardedAd == null) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, "Tried set server side verification before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m964x441f36fd(serverSideVerificationOptions);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$setServerSideVerificationOptions$0$com-google-unity-ads-UnityRewardedAd, reason: not valid java name */
    /* synthetic */ void m964x441f36fd(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions serverSideVerificationOptions) {
        this.rewardedAd.setServerSideVerificationOptions(serverSideVerificationOptions);
    }

    public java.lang.String getAdUnitId() {
        com.google.android.gms.ads.rewarded.RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            return null;
        }
        return rewardedAd.getAdUnitId();
    }

    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<com.google.android.gms.ads.ResponseInfo>() { // from class: com.google.unity.ads.UnityRewardedAd.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public com.google.android.gms.ads.ResponseInfo call() {
                return com.google.unity.ads.UnityRewardedAd.this.rewardedAd.getResponseInfo();
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (com.google.android.gms.ads.ResponseInfo) futureTask.get();
        } catch (java.lang.InterruptedException e) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Unable to check unity rewarded ad response info: %s", e.getLocalizedMessage()));
            return null;
        } catch (java.util.concurrent.ExecutionException e2) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Unable to check unity rewarded ad response info: %s", e2.getLocalizedMessage()));
            return null;
        }
    }

    public com.google.android.gms.ads.rewarded.RewardItem getRewardItem() {
        if (this.rewardedAd == null) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, "Tried to get reward item before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
            return null;
        }
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<com.google.android.gms.ads.rewarded.RewardItem>() { // from class: com.google.unity.ads.UnityRewardedAd.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public com.google.android.gms.ads.rewarded.RewardItem call() {
                return com.google.unity.ads.UnityRewardedAd.this.rewardedAd.getRewardItem();
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (com.google.android.gms.ads.rewarded.RewardItem) futureTask.get();
        } catch (java.lang.InterruptedException e) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Unable to get reward item: %s", e.getLocalizedMessage()));
            return null;
        } catch (java.util.concurrent.ExecutionException e2) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Unable to get reward item: %s", e2.getLocalizedMessage()));
            return null;
        }
    }
}
