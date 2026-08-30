package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public class UnityRewardedInterstitialAd {
    private android.app.Activity activity;
    private com.google.unity.ads.UnityRewardedInterstitialAdCallback callback;
    private com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd rewardedInterstitialAd;

    public void destroy() {
    }

    public UnityRewardedInterstitialAd(android.app.Activity activity, com.google.unity.ads.UnityRewardedInterstitialAdCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityRewardedInterstitialAd$1, reason: invalid class name */
    class AnonymousClass1 implements java.lang.Runnable {
        final /* synthetic */ com.google.unity.ads.UnityRewardedInterstitialAd this$0;
        final /* synthetic */ java.lang.String val$adUnitId;
        final /* synthetic */ com.google.android.gms.ads.AdRequest val$request;

        AnonymousClass1(final com.google.unity.ads.UnityRewardedInterstitialAd this$0, final java.lang.String val$adUnitId, final com.google.android.gms.ads.AdRequest val$request) {
            this.val$adUnitId = val$adUnitId;
            this.val$request = val$request;
            this.this$0 = this$0;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd.load(this.this$0.activity, this.val$adUnitId, this.val$request, new com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.C02051());
        }

        /* JADX INFO: renamed from: com.google.unity.ads.UnityRewardedInterstitialAd$1$1, reason: invalid class name and collision with other inner class name */
        class C02051 extends com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback {
            C02051() {
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd ad) {
                com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.rewardedInterstitialAd = ad;
                com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.rewardedInterstitialAd.setOnPaidEventListener(new com.google.android.gms.ads.OnPaidEventListener() { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.1
                    @Override // com.google.android.gms.ads.OnPaidEventListener
                    public void onPaidEvent(final com.google.android.gms.ads.AdValue adValue) {
                        new java.lang.Thread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.1.1
                            final /* synthetic */ com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.C02051.C02061 this$3;

                            {
                                this.this$3 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback != null) {
                                    com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
                                }
                            }
                        }).start();
                    }
                });
                com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.rewardedInterstitialAd.setFullScreenContentCallback(new com.google.android.gms.ads.FullScreenContentCallback() { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.2
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(final com.google.android.gms.ads.AdError error) {
                        new java.lang.Thread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.2.1
                            final /* synthetic */ com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.C02051.AnonymousClass2 this$3;

                            {
                                this.this$3 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback != null) {
                                    com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback.onAdFailedToShowFullScreenContent(error);
                                }
                            }
                        }).start();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.2.2
                            @Override // java.lang.Runnable
                            public void run() {
                                if (com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback != null) {
                                    com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback.onAdShowedFullScreenContent();
                                }
                            }
                        }).start();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.2.3
                            @Override // java.lang.Runnable
                            public void run() {
                                if (com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback != null) {
                                    com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback.onAdDismissedFullScreenContent();
                                }
                            }
                        }).start();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdImpression() {
                        new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.2.4
                            @Override // java.lang.Runnable
                            public void run() {
                                if (com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback != null) {
                                    com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback.onAdImpression();
                                }
                            }
                        }).start();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdClicked() {
                        new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.2.5
                            @Override // java.lang.Runnable
                            public void run() {
                                if (com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback != null) {
                                    com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback.onAdClicked();
                                }
                            }
                        }).start();
                    }
                });
                new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback != null) {
                            com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback.onRewardedInterstitialAdLoaded();
                        }
                    }
                }).start();
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(final com.google.android.gms.ads.LoadAdError error) {
                new java.lang.Thread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.1.1.4
                    final /* synthetic */ com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.C02051 this$2;

                    {
                        this.this$2 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback != null) {
                            com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1.this.this$0.callback.onRewardedInterstitialAdFailedToLoad(error);
                        }
                    }
                }).start();
            }
        }
    }

    public void loadAd(final java.lang.String adUnitId, final com.google.android.gms.ads.AdRequest request) {
        this.activity.runOnUiThread(new com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass1(this, adUnitId, request));
    }

    public void show() {
        if (this.rewardedInterstitialAd == null) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, "Tried to show rewarded interstitial ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass2());
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityRewardedInterstitialAd$2, reason: invalid class name */
    class AnonymousClass2 implements java.lang.Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.unity.ads.UnityRewardedInterstitialAd.this.rewardedInterstitialAd.show(com.google.unity.ads.UnityRewardedInterstitialAd.this.activity, new com.google.android.gms.ads.OnUserEarnedRewardListener() { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.2.1
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public void onUserEarnedReward(final com.google.android.gms.ads.rewarded.RewardItem rewardItem) {
                    new java.lang.Thread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.2.1.1
                        final /* synthetic */ com.google.unity.ads.UnityRewardedInterstitialAd.AnonymousClass2.AnonymousClass1 this$2;

                        {
                            this.this$2 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (com.google.unity.ads.UnityRewardedInterstitialAd.this.callback != null) {
                                com.google.unity.ads.UnityRewardedInterstitialAd.this.callback.onUserEarnedReward(rewardItem.getType(), rewardItem.getAmount());
                            }
                        }
                    }).start();
                }
            });
        }
    }

    public void setServerSideVerificationOptions(final com.google.android.gms.ads.rewarded.ServerSideVerificationOptions serverSideVerificationOptions) {
        if (this.rewardedInterstitialAd == null) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, "Tried set server side verification before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.3
                final /* synthetic */ com.google.unity.ads.UnityRewardedInterstitialAd this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$0.rewardedInterstitialAd.setServerSideVerificationOptions(serverSideVerificationOptions);
                }
            });
        }
    }

    public java.lang.String getAdUnitId() {
        com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd rewardedInterstitialAd = this.rewardedInterstitialAd;
        if (rewardedInterstitialAd == null) {
            return null;
        }
        return rewardedInterstitialAd.getAdUnitId();
    }

    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        if (this.rewardedInterstitialAd == null) {
            return null;
        }
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<com.google.android.gms.ads.ResponseInfo>() { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public com.google.android.gms.ads.ResponseInfo call() {
                return com.google.unity.ads.UnityRewardedInterstitialAd.this.rewardedInterstitialAd.getResponseInfo();
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (com.google.android.gms.ads.ResponseInfo) futureTask.get();
        } catch (java.lang.InterruptedException e) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Unable to check unity rewarded interstitial ad response info: %s", e.getLocalizedMessage()));
            return null;
        } catch (java.util.concurrent.ExecutionException e2) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Unable to check unity rewarded interstitial ad response info: %s", e2.getLocalizedMessage()));
            return null;
        }
    }

    public com.google.android.gms.ads.rewarded.RewardItem getRewardItem() {
        if (this.rewardedInterstitialAd == null) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, "Tried to get reward item before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
            return null;
        }
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<com.google.android.gms.ads.rewarded.RewardItem>() { // from class: com.google.unity.ads.UnityRewardedInterstitialAd.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public com.google.android.gms.ads.rewarded.RewardItem call() {
                return com.google.unity.ads.UnityRewardedInterstitialAd.this.rewardedInterstitialAd.getRewardItem();
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
