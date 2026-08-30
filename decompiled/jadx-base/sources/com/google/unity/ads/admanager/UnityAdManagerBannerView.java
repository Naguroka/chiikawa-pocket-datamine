package com.google.unity.ads.admanager;

/* JADX INFO: loaded from: classes5.dex */
public class UnityAdManagerBannerView extends com.google.unity.ads.Banner {
    private final java.util.concurrent.ExecutorService service;

    public UnityAdManagerBannerView(android.app.Activity activity, com.google.unity.ads.admanager.UnityAdManagerAdListener listener) {
        this.unityPlayerActivity = activity;
        this.unityListener = listener;
        this.service = java.util.concurrent.Executors.newSingleThreadExecutor();
    }

    @Override // com.google.unity.ads.Banner
    protected void createAdView(final java.lang.String publisherId, final com.google.android.gms.ads.AdSize adSize) {
        this.adView = new com.google.android.gms.ads.admanager.AdManagerAdView(this.unityPlayerActivity);
        this.adView.setBackgroundColor(0);
        this.adView.setAdUnitId(publisherId);
        this.adView.setAdSize(adSize);
        this.adView.setVisibility(8);
        this.adView.setDescendantFocusability(org.objectweb.asm.Opcodes.ASM6);
        this.unityPlayerActivity.addContentView(this.adView, getLayoutParams());
        this.adView.setAdListener(new com.google.unity.ads.admanager.UnityAdManagerBannerView.AnonymousClass1());
        this.adView.setOnPaidEventListener(new com.google.unity.ads.admanager.UnityAdManagerBannerView.AnonymousClass2());
        ((com.google.android.gms.ads.admanager.AdManagerAdView) this.adView).setAppEventListener(new com.google.unity.ads.admanager.UnityAdManagerBannerView.AnonymousClass3());
        setLayoutChangeListener();
    }

    /* JADX INFO: renamed from: com.google.unity.ads.admanager.UnityAdManagerBannerView$1, reason: invalid class name */
    class AnonymousClass1 extends com.google.android.gms.ads.AdListener {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            if (!com.google.unity.ads.admanager.UnityAdManagerBannerView.this.hidden) {
                com.google.unity.ads.admanager.UnityAdManagerBannerView.this.show();
            }
            com.google.unity.ads.admanager.UnityAdManagerBannerView.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m987x9d5d5b9f();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdLoaded$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$1, reason: not valid java name */
        /* synthetic */ void m987x9d5d5b9f() {
            if (com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener != null) {
                com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(final com.google.android.gms.ads.LoadAdError error) {
            com.google.unity.ads.admanager.UnityAdManagerBannerView.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m985x3a46ed78(error);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$1, reason: not valid java name */
        /* synthetic */ void m985x3a46ed78(com.google.android.gms.ads.LoadAdError loadAdError) {
            if (com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener != null) {
                com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener.onAdFailedToLoad(loadAdError);
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            com.google.unity.ads.admanager.UnityAdManagerBannerView.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m988xa6caa603();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdOpened$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$1, reason: not valid java name */
        /* synthetic */ void m988xa6caa603() {
            if (com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener != null) {
                com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener.onAdOpened();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            com.google.unity.ads.admanager.UnityAdManagerBannerView.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m984x272a2086();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdClosed$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$1, reason: not valid java name */
        /* synthetic */ void m984x272a2086() {
            if (com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener != null) {
                com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener.onAdClosed();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            com.google.unity.ads.admanager.UnityAdManagerBannerView.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m986x8ccd6823();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdImpression$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$1, reason: not valid java name */
        /* synthetic */ void m986x8ccd6823() {
            if (com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener != null) {
                com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener.onAdImpression();
            }
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
        public void onAdClicked() {
            com.google.unity.ads.admanager.UnityAdManagerBannerView.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m983xe76a19a3();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdClicked$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$1, reason: not valid java name */
        /* synthetic */ void m983xe76a19a3() {
            if (com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener != null) {
                com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener.onAdClicked();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.admanager.UnityAdManagerBannerView$2, reason: invalid class name */
    class AnonymousClass2 implements com.google.android.gms.ads.OnPaidEventListener {
        AnonymousClass2() {
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final com.google.android.gms.ads.AdValue adValue) {
            com.google.unity.ads.admanager.UnityAdManagerBannerView.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m989x1d98ef4e(adValue);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onPaidEvent$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$2, reason: not valid java name */
        /* synthetic */ void m989x1d98ef4e(com.google.android.gms.ads.AdValue adValue) {
            if (com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener != null) {
                com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.admanager.UnityAdManagerBannerView$3, reason: invalid class name */
    class AnonymousClass3 implements com.google.android.gms.ads.admanager.AppEventListener {
        AnonymousClass3() {
        }

        @Override // com.google.android.gms.ads.admanager.AppEventListener
        public void onAppEvent(final java.lang.String name, final java.lang.String data) {
            com.google.unity.ads.admanager.UnityAdManagerBannerView.this.service.execute(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m990x46c56712(name, data);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAppEvent$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$3, reason: not valid java name */
        /* synthetic */ void m990x46c56712(java.lang.String str, java.lang.String str2) {
            if (com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener != null) {
                ((com.google.unity.ads.admanager.UnityAdManagerAdListener) com.google.unity.ads.admanager.UnityAdManagerBannerView.this.unityListener).onAppEvent(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$loadAd$0$com-google-unity-ads-admanager-UnityAdManagerBannerView, reason: not valid java name */
    /* synthetic */ void m981x49beb234(com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest) {
        ((com.google.android.gms.ads.admanager.AdManagerAdView) this.adView).loadAd(adManagerAdRequest);
    }

    public void loadAd(final com.google.android.gms.ads.admanager.AdManagerAdRequest request) {
        this.unityPlayerActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m981x49beb234(request);
            }
        });
    }

    public java.util.List<com.google.android.gms.ads.AdSize> getAdSizes() {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f$0.m980x51b59a04();
            }
        });
        this.unityPlayerActivity.runOnUiThread(futureTask);
        com.google.android.gms.ads.AdSize[] adSizeArr = new com.google.android.gms.ads.AdSize[0];
        try {
            adSizeArr = (com.google.android.gms.ads.AdSize[]) futureTask.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Failed to get ad sizes: %s", e.getLocalizedMessage()));
        }
        return java.util.Arrays.asList(adSizeArr);
    }

    /* JADX INFO: renamed from: lambda$getAdSizes$0$com-google-unity-ads-admanager-UnityAdManagerBannerView, reason: not valid java name */
    /* synthetic */ com.google.android.gms.ads.AdSize[] m980x51b59a04() throws java.lang.Exception {
        return ((com.google.android.gms.ads.admanager.AdManagerAdView) this.adView).getAdSizes();
    }

    public void setAdSizes(final java.util.List<com.google.android.gms.ads.AdSize> adSizes) {
        if (adSizes == null || adSizes.size() < 1) {
            throw new java.lang.IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.unityPlayerActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m982xa6dd6e78(adSizes);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setAdSizes$0$com-google-unity-ads-admanager-UnityAdManagerBannerView, reason: not valid java name */
    /* synthetic */ void m982xa6dd6e78(java.util.List list) {
        ((com.google.android.gms.ads.admanager.AdManagerAdView) this.adView).setAdSizes((com.google.android.gms.ads.AdSize[]) list.toArray(new com.google.android.gms.ads.AdSize[list.size()]));
    }
}
