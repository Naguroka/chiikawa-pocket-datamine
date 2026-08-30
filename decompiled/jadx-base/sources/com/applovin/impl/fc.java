package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f788a = true;
    private static boolean b = true;

    public static void b(final com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, final com.applovin.sdk.AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.d(appLovinAdDisplayListener, appLovinAd);
            }
        });
    }

    public static void a(final com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener, final com.applovin.sdk.AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdClickListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.b(appLovinAdClickListener, appLovinAd);
            }
        });
    }

    public static void a(final com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, final com.applovin.sdk.AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.c(appLovinAdDisplayListener, appLovinAd);
            }
        });
    }

    public static void c(final com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, final com.applovin.sdk.AppLovinAd appLovinAd, final java.util.Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.f(appLovinAdRewardListener, appLovinAd, map);
            }
        });
    }

    public static void f(com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd) {
        f(maxAdListener, maxAd, false);
    }

    public static void b(final com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, final com.applovin.sdk.AppLovinAd appLovinAd, final java.util.Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.e(appLovinAdRewardListener, appLovinAd, map);
            }
        });
    }

    public static void e(com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd) {
        e(maxAdListener, maxAd, false);
    }

    public static void c(final com.applovin.adview.AppLovinAdViewEventListener appLovinAdViewEventListener, final com.applovin.sdk.AppLovinAd appLovinAd, final com.applovin.adview.AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.f(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
            }
        });
    }

    public static void a(final com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, final com.applovin.sdk.AppLovinAd appLovinAd, final java.util.Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.d(appLovinAdRewardListener, appLovinAd, map);
            }
        });
    }

    public static void b(final com.applovin.adview.AppLovinAdViewEventListener appLovinAdViewEventListener, final com.applovin.sdk.AppLovinAd appLovinAd, final com.applovin.adview.AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.e(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
            }
        });
    }

    public static void d(com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd) {
        d(maxAdListener, maxAd, false);
    }

    public static void f(final com.applovin.mediation.MaxAdListener maxAdListener, final com.applovin.mediation.MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.f(z, maxAdListener, maxAd);
            }
        });
    }

    public static void b(final com.applovin.sdk.AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, final java.lang.String str) {
        if (appLovinBidTokenCollectionListener != null) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.fc.d(appLovinBidTokenCollectionListener, str);
                }
            });
        }
    }

    public static void e(final com.applovin.mediation.MaxAdListener maxAdListener, final com.applovin.mediation.MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.e(z, maxAdListener, maxAd);
            }
        });
    }

    public static void c(com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd) {
        c(maxAdListener, maxAd, false);
    }

    public static void a(final com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, final com.applovin.sdk.AppLovinAd appLovinAd, final int i) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.b(appLovinAdRewardListener, appLovinAd, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map map) {
        try {
            appLovinAdRewardListener.userRewardVerified(a(appLovinAd), map);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th);
        }
    }

    public static void a(final com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final com.applovin.sdk.AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.b(appLovinAdVideoPlaybackListener, appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map map) {
        try {
            appLovinAdRewardListener.userOverQuota(a(appLovinAd), map);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(com.applovin.adview.AppLovinAdViewEventListener appLovinAdViewEventListener, com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adOpenedFullscreen(a(appLovinAd), appLovinAdView);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th);
        }
    }

    public static void a(final com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final com.applovin.sdk.AppLovinAd appLovinAd, final double d, final boolean z) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.b(appLovinAdVideoPlaybackListener, appLovinAd, d, z);
            }
        });
    }

    public static void c(final com.applovin.mediation.MaxAdListener maxAdListener, final com.applovin.mediation.MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.c(z, maxAdListener, maxAd);
            }
        });
    }

    public static void d(final com.applovin.mediation.MaxAdListener maxAdListener, final com.applovin.mediation.MaxAd maxAd, final boolean z) {
        if (maxAd == null || !(maxAdListener instanceof com.applovin.mediation.MaxAdViewAdListener)) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.d(z, maxAdListener, maxAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adDisplayed(a(appLovinAd));
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
            c("adDisplayed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(com.applovin.adview.AppLovinAdViewEventListener appLovinAdViewEventListener, com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adLeftApplication(a(appLovinAd), appLovinAdView);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th);
        }
    }

    public static void b(com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd) {
        b(maxAdListener, maxAd, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adHidden(a(appLovinAd));
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
            c("adHidden", th);
        }
    }

    public static void a(final com.applovin.adview.AppLovinAdViewEventListener appLovinAdViewEventListener, final com.applovin.sdk.AppLovinAd appLovinAd, final com.applovin.adview.AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.d(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.applovin.sdk.AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, java.lang.String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollected(str);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify bid token listener about successful bid token collection", th);
            c("onBidTokenCollected", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(boolean z, com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd) {
        if (c(z)) {
            try {
                maxAdListener.onAdLoaded(maxAd);
                return;
            } catch (java.lang.Throwable th) {
                a(com.json.ju.j, th, z);
                c("maxAdLoaded", th);
                return;
            }
        }
        maxAdListener.onAdLoaded(maxAd);
    }

    public static void a(final com.applovin.adview.AppLovinAdViewEventListener appLovinAdViewEventListener, final com.applovin.sdk.AppLovinAd appLovinAd, final com.applovin.adview.AppLovinAdView appLovinAdView, final com.applovin.adview.AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.b(appLovinAdViewEventListener, appLovinAd, appLovinAdView, appLovinAdViewDisplayErrorCode);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map map) {
        try {
            appLovinAdRewardListener.userRewardRejected(a(appLovinAd), map);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th);
        }
    }

    public static void a(final com.applovin.sdk.AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, final java.lang.String str) {
        if (appLovinBidTokenCollectionListener != null) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.fc.c(appLovinBidTokenCollectionListener, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(boolean z, com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd) {
        if (c(z)) {
            try {
                maxAdListener.onAdHidden(maxAd);
                return;
            } catch (java.lang.Throwable th) {
                a("onAdHidden", th, z);
                c("maxAdHidden", th);
                return;
            }
        }
        maxAdListener.onAdHidden(maxAd);
    }

    public static void a(final com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, final java.lang.String str) {
        if (appLovinAdDisplayListener instanceof com.applovin.impl.pb) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.fc.b(appLovinAdDisplayListener, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(boolean z, com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd) {
        if (c(z)) {
            try {
                maxAdListener.onAdDisplayed(maxAd);
                return;
            } catch (java.lang.Throwable th) {
                a("onAdDisplayed", th, z);
                c("maxAdDisplayed", th);
                return;
            }
        }
        maxAdListener.onAdDisplayed(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.adview.AppLovinAdViewEventListener appLovinAdViewEventListener, com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adClosedFullscreen(a(appLovinAd), appLovinAdView);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.sdk.AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, java.lang.String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollectionFailed(str);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify bid token listener about bid token collection failure", th);
            c("onBidTokenCollectionFailed", th);
        }
    }

    public static void b(final com.applovin.mediation.MaxAdListener maxAdListener, final com.applovin.mediation.MaxAd maxAd, final boolean z) {
        if (maxAd == null || !(maxAdListener instanceof com.applovin.mediation.MaxAdViewAdListener)) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.b(z, maxAdListener, maxAd);
            }
        });
    }

    public static void a(com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd) {
        a(maxAdListener, maxAd, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(boolean z, com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd) {
        if (c(z)) {
            try {
                ((com.applovin.mediation.MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
                return;
            } catch (java.lang.Throwable th) {
                a("onAdExpanded", th, z);
                return;
            }
        }
        ((com.applovin.mediation.MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
    }

    public static void a(final com.applovin.mediation.MaxAdListener maxAdListener, final com.applovin.mediation.MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.a(z, maxAdListener, maxAd);
            }
        });
    }

    private static boolean c(boolean z) {
        return z ? f788a : b;
    }

    private static void c(java.lang.String str, java.lang.Throwable th) {
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.u0;
        if (jVar != null) {
            jVar.D().a("ListenerCallbackInvoker", str, th);
        }
    }

    public static void b(final com.applovin.mediation.nativeAds.MaxNativeAdListener maxNativeAdListener, final com.applovin.mediation.MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.b(z, maxNativeAdListener, maxAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener, com.applovin.sdk.AppLovinAd appLovinAd) {
        try {
            appLovinAdClickListener.adClicked(a(appLovinAd));
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
            c("adClicked", th);
        }
    }

    public static void a(com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxError maxError) {
        a(maxAdListener, maxAd, maxError, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.sdk.AppLovinAd appLovinAd, int i) {
        try {
            appLovinAdRewardListener.validationRequestFailed(a(appLovinAd), i);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAd appLovinAd) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackBegan(a(appLovinAd));
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAd appLovinAd, double d, boolean z) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackEnded(a(appLovinAd), d, z);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th);
        }
    }

    public static void a(final com.applovin.mediation.MaxAdListener maxAdListener, final com.applovin.mediation.MaxAd maxAd, final com.applovin.mediation.MaxError maxError, final boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.a(z, maxAdListener, maxAd, maxError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.adview.AppLovinAdViewEventListener appLovinAdViewEventListener, com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView, com.applovin.adview.AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        try {
            appLovinAdViewEventListener.adFailedToDisplay(a(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, java.lang.String str) {
        ((com.applovin.impl.pb) appLovinAdDisplayListener).onAdDisplayFailed(str);
    }

    public static void a(com.applovin.mediation.MaxAdListener maxAdListener, java.lang.String str, com.applovin.mediation.MaxError maxError) {
        a(maxAdListener, str, maxError, false);
    }

    public static void a(final com.applovin.mediation.MaxAdListener maxAdListener, final java.lang.String str, final com.applovin.mediation.MaxError maxError, final boolean z) {
        if (str == null || maxAdListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.a(z, maxAdListener, str, maxError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(boolean z, com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd) {
        if (c(z)) {
            try {
                ((com.applovin.mediation.MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
                return;
            } catch (java.lang.Throwable th) {
                a("onAdCollapsed", th, z);
                return;
            }
        }
        ((com.applovin.mediation.MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
    }

    public static void a(com.applovin.mediation.MaxAdRequestListener maxAdRequestListener, java.lang.String str) {
        a(maxAdRequestListener, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(boolean z, com.applovin.mediation.nativeAds.MaxNativeAdListener maxNativeAdListener, com.applovin.mediation.MaxAd maxAd) {
        if (c(z)) {
            try {
                maxNativeAdListener.onNativeAdExpired(maxAd);
                return;
            } catch (java.lang.Throwable th) {
                a("onNativeAdExpired", th, z);
                c("maxNativeAdExpired", th);
                return;
            }
        }
        maxNativeAdListener.onNativeAdExpired(maxAd);
    }

    public static void a(final com.applovin.mediation.MaxAdRequestListener maxAdRequestListener, final java.lang.String str, final boolean z) {
        if (str == null || maxAdRequestListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.a(z, maxAdRequestListener, str);
            }
        });
    }

    public static void a(com.applovin.mediation.MaxAdRevenueListener maxAdRevenueListener, com.applovin.mediation.MaxAd maxAd) {
        a(maxAdRevenueListener, maxAd, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener, java.lang.String str, int i) {
        try {
            appLovinPostbackListener.onPostbackFailure(str, i);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i + "):", th);
        }
    }

    public static void a(final com.applovin.mediation.MaxAdRevenueListener maxAdRevenueListener, final com.applovin.mediation.MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxAdRevenueListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.a(z, maxAdRevenueListener, maxAd);
            }
        });
    }

    public static void a(final com.applovin.mediation.MaxAdExpirationListener maxAdExpirationListener, final com.applovin.mediation.MaxAd maxAd, final com.applovin.mediation.MaxAd maxAd2, final boolean z) {
        if (maxAd == null || maxAd2 == null || maxAdExpirationListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.a(z, maxAdExpirationListener, maxAd, maxAd2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener, java.lang.String str) {
        try {
            appLovinPostbackListener.onPostbackSuccess(str);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th);
        }
    }

    public static void a(final com.applovin.mediation.nativeAds.MaxNativeAdListener maxNativeAdListener, final com.applovin.mediation.MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.a(z, maxNativeAdListener, maxAd);
            }
        });
    }

    public static void b(com.applovin.mediation.MaxAdReviewListener maxAdReviewListener, java.lang.String str, com.applovin.mediation.MaxAd maxAd) {
        a(maxAdReviewListener, str, maxAd, false);
    }

    public static void a(final com.applovin.mediation.nativeAds.MaxNativeAdListener maxNativeAdListener, final java.lang.String str, final com.applovin.mediation.MaxError maxError, final boolean z) {
        if (str == null || maxNativeAdListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.a(z, maxNativeAdListener, str, maxError);
            }
        });
    }

    public static void b(final com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener appLovinNativeAdEventListener, final com.applovin.impl.sdk.nativeAd.AppLovinNativeAd appLovinNativeAd) {
        if (appLovinNativeAdEventListener != null) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.fc.a(appLovinNativeAdEventListener, appLovinNativeAd);
                }
            });
        }
    }

    public static void a(final com.applovin.mediation.nativeAds.MaxNativeAdListener maxNativeAdListener, final com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView, final com.applovin.mediation.MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.a(z, maxNativeAdListener, maxNativeAdView, maxAd);
            }
        });
    }

    public static void b(final com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, final com.applovin.impl.sdk.AppLovinError appLovinError) {
        if (appLovinNativeAdLoadListener != null) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda31
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.fc.a(appLovinNativeAdLoadListener, appLovinError);
                }
            });
        }
    }

    public static void b(boolean z) {
        f788a = z;
    }

    private static void b(java.lang.String str, java.lang.Throwable th) {
        com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Error in publisher callback '" + str + "'", th);
    }

    public static void a(com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxReward maxReward) {
        a(maxAdListener, maxAd, maxReward, false);
    }

    public static void a(final com.applovin.mediation.MaxAdListener maxAdListener, final com.applovin.mediation.MaxAd maxAd, final com.applovin.mediation.MaxReward maxReward, final boolean z) {
        if (maxAd == null || !(maxAdListener instanceof com.applovin.mediation.MaxRewardedAdListener)) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.fc.a(z, maxAdListener, maxAd, maxReward);
            }
        });
    }

    public static void a(final com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener, final java.lang.String str, final int i) {
        if (appLovinPostbackListener != null) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda25
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.fc.b(appLovinPostbackListener, str, i);
                }
            });
        }
    }

    public static void a(final com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener, final java.lang.String str) {
        if (appLovinPostbackListener != null) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.fc.b(appLovinPostbackListener, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z, com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd) {
        if (c(z)) {
            try {
                maxAdListener.onAdClicked(maxAd);
                return;
            } catch (java.lang.Throwable th) {
                a(com.json.ju.f, th, z);
                c("maxAdClicked", th);
                return;
            }
        }
        maxAdListener.onAdClicked(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z, com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxError maxError) {
        if (c(z)) {
            try {
                maxAdListener.onAdDisplayFailed(maxAd, maxError);
                return;
            } catch (java.lang.Throwable th) {
                a("onAdDisplayFailed", th, z);
                c("maxAdDisplayFailed", th);
                return;
            }
        }
        maxAdListener.onAdDisplayFailed(maxAd, maxError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z, com.applovin.mediation.MaxAdListener maxAdListener, java.lang.String str, com.applovin.mediation.MaxError maxError) {
        if (c(z)) {
            try {
                maxAdListener.onAdLoadFailed(str, maxError);
                return;
            } catch (java.lang.Throwable th) {
                a(com.json.ju.b, th, z);
                c("maxAdLoadFailed", th);
                return;
            }
        }
        maxAdListener.onAdLoadFailed(str, maxError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z, com.applovin.mediation.MaxAdRequestListener maxAdRequestListener, java.lang.String str) {
        if (c(z)) {
            try {
                maxAdRequestListener.onAdRequestStarted(str);
                return;
            } catch (java.lang.Throwable th) {
                a("onAdRequestStarted", th, z);
                c("maxAdRequestStarted", th);
                return;
            }
        }
        maxAdRequestListener.onAdRequestStarted(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z, com.applovin.mediation.MaxAdRevenueListener maxAdRevenueListener, com.applovin.mediation.MaxAd maxAd) {
        if (c(z)) {
            try {
                maxAdRevenueListener.onAdRevenuePaid(maxAd);
                return;
            } catch (java.lang.Throwable th) {
                a("onAdRevenuePaid", th, z);
                c("maxAdPaidRevenue", th);
                return;
            }
        }
        maxAdRevenueListener.onAdRevenuePaid(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z, com.applovin.mediation.MaxAdExpirationListener maxAdExpirationListener, com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxAd maxAd2) {
        if (c(z)) {
            try {
                maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
                return;
            } catch (java.lang.Throwable th) {
                a("onExpiredAdReloaded", th, z);
                c("maxExpiredAdReloaded", th);
                return;
            }
        }
        maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z, com.applovin.mediation.nativeAds.MaxNativeAdListener maxNativeAdListener, com.applovin.mediation.MaxAd maxAd) {
        if (c(z)) {
            try {
                maxNativeAdListener.onNativeAdClicked(maxAd);
                return;
            } catch (java.lang.Throwable th) {
                a("onNativeAdClicked", th, z);
                c("maxNativeAdClicked", th);
                return;
            }
        }
        maxNativeAdListener.onNativeAdClicked(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z, com.applovin.mediation.nativeAds.MaxNativeAdListener maxNativeAdListener, java.lang.String str, com.applovin.mediation.MaxError maxError) {
        if (c(z)) {
            try {
                maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
                return;
            } catch (java.lang.Throwable th) {
                a("onNativeAdLoadFailed", th, z);
                c("maxNativeAdLoadFailed", th);
                return;
            }
        }
        maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z, com.applovin.mediation.nativeAds.MaxNativeAdListener maxNativeAdListener, com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView, com.applovin.mediation.MaxAd maxAd) {
        if (c(z)) {
            try {
                maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
                return;
            } catch (java.lang.Throwable th) {
                a("onNativeAdLoaded", th, z);
                c("maxNativeAdLoaded", th);
                return;
            }
        }
        maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z, com.applovin.mediation.MaxAdListener maxAdListener, com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxReward maxReward) {
        if (c(z)) {
            try {
                ((com.applovin.mediation.MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
                return;
            } catch (java.lang.Throwable th) {
                a("onUserRewarded", th, z);
                c("maxRewardedUser", th);
                return;
            }
        }
        ((com.applovin.mediation.MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.mediation.MaxAdReviewListener maxAdReviewListener, java.lang.String str, com.applovin.mediation.MaxAd maxAd) {
        try {
            maxAdReviewListener.onCreativeIdGenerated(str, maxAd);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify Ad Review creative id generated", th);
            c("adReviewCreativeIdGenerated", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener appLovinNativeAdEventListener, com.applovin.impl.sdk.nativeAd.AppLovinNativeAd appLovinNativeAd) {
        try {
            appLovinNativeAdEventListener.onNativeAdClicked(appLovinNativeAd);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad click", th);
            c("nativeAdClicked", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.AppLovinError appLovinError) {
        try {
            appLovinNativeAdLoadListener.onNativeAdLoadFailed(appLovinError);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad failing to load", th);
            c("nativeAdLoadFailed", th);
        }
    }

    private static void a(java.lang.String str, java.lang.Throwable th, boolean z) {
        if (z) {
            b(str, th);
        } else {
            a(str, th);
        }
    }

    public static void a(final com.applovin.mediation.MaxAdReviewListener maxAdReviewListener, final java.lang.String str, final com.applovin.mediation.MaxAd maxAd, boolean z) {
        if (maxAdReviewListener != null) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(z, new java.lang.Runnable() { // from class: com.applovin.impl.fc$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.fc.a(maxAdReviewListener, str, maxAd);
                }
            });
        }
    }

    private static com.applovin.sdk.AppLovinAd a(com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl = (com.applovin.impl.sdk.ad.AppLovinAdImpl) appLovinAd;
        return appLovinAdImpl.getDummyAd() != null ? appLovinAdImpl.getDummyAd() : appLovinAd;
    }

    public static void a(boolean z) {
        b = z;
    }

    private static void a(java.lang.String str, java.lang.Throwable th) {
        com.applovin.impl.sdk.n.b("ListenerCallbackInvoker", "Error in internal callback '" + str + "'", th);
    }
}
