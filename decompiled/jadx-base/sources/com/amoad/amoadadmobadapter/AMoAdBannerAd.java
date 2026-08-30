package com.amoad.amoadadmobadapter;

/* JADX INFO: renamed from: com.amoad.amoadadmobadapter.b, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amoad/amoadadmobadapter/AMoAdBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "adConfiguration", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "adLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "(Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "adView", "Lcom/amoad/AMoAdView;", "bannerAdCallback", "getView", "Landroid/view/View;", "loadAd", "", "AMoAdAdCallbackListener", "Companion", "AMoAdAdMobAdapter_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AMoAdBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.amoad.amoadadmobadapter.AMoAdBannerAd.b f215a = new com.amoad.amoadadmobadapter.AMoAdBannerAd.b(0);
    private static final java.lang.String f;
    final com.google.android.gms.ads.mediation.MediationBannerAdConfiguration b;
    final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> c;
    com.amoad.AMoAdView d;
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback e;

    /* JADX INFO: renamed from: com.amoad.amoadadmobadapter.b$a */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amoad/amoadadmobadapter/AMoAdBannerAd$AMoAdAdCallbackListener;", "Lcom/amoad/AdCallback2;", "adLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "(Lcom/amoad/amoadadmobadapter/AMoAdBannerAd;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "didClick", "", "didDismissScreen", "didFailToReceiveAdWithError", "didLeaveApplication", "didPresentScreen", "didReceiveAd", "didReceiveEmptyAd", "AMoAdAdMobAdapter_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class a implements com.amoad.AdCallback2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.amoad.amoadadmobadapter.AMoAdBannerAd f216a;
        private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> b;

        public a(com.amoad.amoadadmobadapter.AMoAdBannerAd aMoAdBannerAd, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> adLoadCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
            this.f216a = aMoAdBannerAd;
            this.b = adLoadCallback;
        }

        @Override // com.amoad.AdCallback2
        public final void didClick() {
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdBannerAd.f, "AdCallback2:didClick");
            com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.f216a.e;
            if (mediationBannerAdCallback != null) {
                mediationBannerAdCallback.reportAdClicked();
            }
        }

        @Override // com.amoad.AdCallback2
        public final void didDismissScreen() {
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdBannerAd.f, "AdCallback2:didDismissScreen");
            com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.f216a.e;
            if (mediationBannerAdCallback != null) {
                mediationBannerAdCallback.onAdClosed();
            }
        }

        @Override // com.amoad.AdCallback
        public final void didFailToReceiveAdWithError() {
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdBannerAd.f, "AdCallback:didFailToReceiveAdWithError");
            this.b.onFailure(new com.google.android.gms.ads.AdError(102, "Fail to receive ad", "com.amoad.amoadadmobadapter"));
        }

        @Override // com.amoad.AdCallback2
        public final void didLeaveApplication() {
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdBannerAd.f, "AdCallback2:didLeaveApplication");
            com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.f216a.e;
            if (mediationBannerAdCallback != null) {
                mediationBannerAdCallback.onAdLeftApplication();
            }
        }

        @Override // com.amoad.AdCallback2
        public final void didPresentScreen() {
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdBannerAd.f, "AdCallback2:didPresentScreen");
            com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.f216a.e;
            if (mediationBannerAdCallback != null) {
                mediationBannerAdCallback.onAdOpened();
            }
        }

        @Override // com.amoad.AdCallback
        public final void didReceiveAd() {
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdBannerAd.f, "AdCallback:didReceiveAd");
            com.amoad.amoadadmobadapter.AMoAdBannerAd aMoAdBannerAd = this.f216a;
            aMoAdBannerAd.e = this.b.onSuccess(aMoAdBannerAd);
        }

        @Override // com.amoad.AdCallback
        public final void didReceiveEmptyAd() {
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdBannerAd.f, "AdCallback:didReceiveEmptyAd");
            this.b.onFailure(new com.google.android.gms.ads.AdError(102, "Receive empty ad", "com.amoad.amoadadmobadapter"));
        }
    }

    /* JADX INFO: renamed from: com.amoad.amoadadmobadapter.b$b */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/amoad/amoadadmobadapter/AMoAdBannerAd$Companion;", "", "()V", "TAG", "", "AMoAdAdMobAdapter_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    static {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("b", "AMoAdBannerAd::class.java.simpleName");
        f = "b";
    }

    public AMoAdBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration adConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> adLoadCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        this.b = adConfiguration;
        this.c = adLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final android.view.View getView() {
        com.amoad.AMoAdView aMoAdView = this.d;
        return aMoAdView != null ? aMoAdView : new android.view.View(this.b.getContext());
    }
}
