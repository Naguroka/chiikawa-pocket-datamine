package com.amoad.amoadadmobadapter;

/* JADX INFO: renamed from: com.amoad.amoadadmobadapter.d, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amoad/amoadadmobadapter/AMoAdRewardedAd;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAd;", "mediationRewardedAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;", "adLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdCallback;", "(Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "interstitialVideo", "Lcom/amoad/AMoAdInterstitialVideo;", "rewardedAdCallback", "loadAd", "", "showAd", "context", "Landroid/content/Context;", "AMoAdInterstitialVideoCallbackListener", "Companion", "AMoAdAdMobAdapter_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AMoAdRewardedAd implements com.google.android.gms.ads.mediation.MediationRewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.amoad.amoadadmobadapter.AMoAdRewardedAd.b f217a = new com.amoad.amoadadmobadapter.AMoAdRewardedAd.b(0);
    private static final java.lang.String f;
    private final com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration b;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> c;
    private com.amoad.AMoAdInterstitialVideo d;
    private com.google.android.gms.ads.mediation.MediationRewardedAdCallback e;

    /* JADX INFO: renamed from: com.amoad.amoadadmobadapter.d$a */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amoad/amoadadmobadapter/AMoAdRewardedAd$AMoAdInterstitialVideoCallbackListener;", "Lcom/amoad/AMoAdInterstitialVideo$Listener;", "adLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAd;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdCallback;", "(Lcom/amoad/amoadadmobadapter/AMoAdRewardedAd;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "onClick", "", "amoadInterstitialVideo", "Lcom/amoad/AMoAdInterstitialVideo;", "onComplete", "onDismissed", "onFailed", "onLoad", "result", "Lcom/amoad/AdResult;", "onShown", "onStart", "AMoAdAdMobAdapter_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class a implements com.amoad.AMoAdInterstitialVideo.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.amoad.amoadadmobadapter.AMoAdRewardedAd f218a;
        private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> b;

        /* JADX INFO: renamed from: com.amoad.amoadadmobadapter.d$a$a, reason: collision with other inner class name */
        @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class C0015a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f219a;

            static {
                int[] iArr = new int[com.amoad.AdResult.values().length];
                iArr[com.amoad.AdResult.Empty.ordinal()] = 1;
                iArr[com.amoad.AdResult.Failure.ordinal()] = 2;
                iArr[com.amoad.AdResult.Success.ordinal()] = 3;
                f219a = iArr;
            }
        }

        public a(com.amoad.amoadadmobadapter.AMoAdRewardedAd aMoAdRewardedAd, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> adLoadCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
            this.f218a = aMoAdRewardedAd;
            this.b = adLoadCallback;
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onClick(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdRewardedAd.f, "AMoAdInterstitialVideo.Listener:onClick");
            com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.f218a.e;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.reportAdClicked();
            }
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onComplete(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdRewardedAd.f, "AMoAdInterstitialVideo.Listener:onComplete");
            com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.f218a.e;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onVideoComplete();
            }
            com.amoad.amoadadmobadapter.AMoAdRewardItem aMoAdRewardItem = new com.amoad.amoadadmobadapter.AMoAdRewardItem();
            com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback2 = this.f218a.e;
            if (mediationRewardedAdCallback2 != null) {
                mediationRewardedAdCallback2.onUserEarnedReward(aMoAdRewardItem);
            }
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onDismissed(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdRewardedAd.f, "AMoAdInterstitialVideo.Listener:onDismissed");
            com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.f218a.e;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdClosed();
            }
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onFailed(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdRewardedAd.f, "AMoAdInterstitialVideo.Listener:onFailed");
            this.b.onFailure(new com.google.android.gms.ads.AdError(102, "Fail to load AMoAdInterstitialVideo", "com.amoad.amoadadmobadapter"));
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onLoad(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo, com.amoad.AdResult result) {
            com.google.android.gms.ads.AdError adError;
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdRewardedAd.f, "AMoAdInterstitialVideo.Listener:onLoad");
            int i = result == null ? -1 : com.amoad.amoadadmobadapter.AMoAdRewardedAd.a.C0015a.f219a[result.ordinal()];
            if (i == -1) {
                adError = new com.google.android.gms.ads.AdError(102, "Fail to load AMoAdInterstitialVideo", "com.amoad.amoadadmobadapter");
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    com.amoad.amoadadmobadapter.AMoAdRewardedAd aMoAdRewardedAd = this.f218a;
                    aMoAdRewardedAd.e = this.b.onSuccess(aMoAdRewardedAd);
                    return;
                }
                adError = new com.google.android.gms.ads.AdError(102, "Fail to load AMoAdInterstitialVideo", "com.amoad.amoadadmobadapter");
            } else {
                adError = new com.google.android.gms.ads.AdError(102, "Receive empty ad", "com.amoad.amoadadmobadapter");
            }
            this.b.onFailure(adError);
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onShown(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdRewardedAd.f, "AMoAdInterstitialVideo.Listener:onShown");
            com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.f218a.e;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdOpened();
            }
        }

        @Override // com.amoad.AMoAdInterstitialVideo.Listener
        public final void onStart(com.amoad.AMoAdInterstitialVideo amoadInterstitialVideo) {
            com.amoad.Logger.d(com.amoad.amoadadmobadapter.AMoAdRewardedAd.f, "AMoAdInterstitialVideo.Listener:onStart");
            com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.f218a.e;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onVideoStart();
            }
        }
    }

    /* JADX INFO: renamed from: com.amoad.amoadadmobadapter.d$b */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/amoad/amoadadmobadapter/AMoAdRewardedAd$Companion;", "", "()V", "TAG", "", "AMoAdAdMobAdapter_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    static {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("d", "AMoAdRewardedAd::class.java.simpleName");
        f = "d";
    }

    public AMoAdRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> adLoadCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationRewardedAdConfiguration, "mediationRewardedAdConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        this.b = mediationRewardedAdConfiguration;
        this.c = adLoadCallback;
    }

    public final void a() {
        java.lang.String string = this.b.getServerParameters().getString(com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        if (string == null) {
            this.c.onFailure(new com.google.android.gms.ads.AdError(101, "Missing parameter", "com.amoad.amoadadmobadapter"));
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(string);
            java.lang.String sid = jSONObject.optString("sid");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sid, "sid");
            java.lang.String str = sid;
            if ((str.length() == 0) || !java.util.regex.Pattern.matches("[a-f0-9]{64}", str)) {
                this.c.onFailure(new com.google.android.gms.ads.AdError(101, "parameter missing sid", "com.amoad.amoadadmobadapter"));
                return;
            }
            java.lang.String strOptString = jSONObject.optString("tag");
            boolean zAreEqual = kotlin.jvm.internal.Intrinsics.areEqual(jSONObject.optString("is_cancellable", com.json.mediationsdk.metadata.a.g), com.json.mediationsdk.metadata.a.g);
            com.amoad.AMoAdLogger.getInstance().i("AMoAdAdapter: Loading rewardedAd in AMoAd with sid:" + sid + ", tag:" + strOptString);
            android.content.Context context = this.b.getContext();
            com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideoSharedInstance = com.amoad.AMoAdInterstitialVideo.sharedInstance(context, sid, strOptString);
            this.d = aMoAdInterstitialVideoSharedInstance;
            if (aMoAdInterstitialVideoSharedInstance != null) {
                aMoAdInterstitialVideoSharedInstance.setCancellable(zAreEqual);
            }
            com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo = this.d;
            if (aMoAdInterstitialVideo != null) {
                aMoAdInterstitialVideo.setListener(new com.amoad.amoadadmobadapter.AMoAdRewardedAd.a(this, this.c));
            }
            com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo2 = this.d;
            if (aMoAdInterstitialVideo2 != null) {
                aMoAdInterstitialVideo2.dismiss(context);
            }
            com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo3 = this.d;
            if (aMoAdInterstitialVideo3 != null) {
                aMoAdInterstitialVideo3.load(context);
            }
        } catch (java.lang.Exception e) {
            this.c.onFailure(new com.google.android.gms.ads.AdError(101, "parameter decodeFromString error:" + e.getMessage(), "com.amoad.amoadadmobadapter"));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(android.content.Context context) {
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideo2 = this.d;
        if (aMoAdInterstitialVideo2 == null) {
            return;
        }
        boolean z = false;
        if (aMoAdInterstitialVideo2 != null && aMoAdInterstitialVideo2.isLoaded()) {
            z = true;
        }
        if (!z) {
            this.c.onFailure(new com.google.android.gms.ads.AdError(102, "No ads to show", "com.amoad.amoadadmobadapter"));
            return;
        }
        kotlin.Unit unit = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (aMoAdInterstitialVideo = this.d) != null) {
            aMoAdInterstitialVideo.show(activity);
            unit = kotlin.Unit.INSTANCE;
        }
        if (unit == null) {
            this.c.onFailure(new com.google.android.gms.ads.AdError(103, "An Activity context is required to show rewarded ad.", "com.amoad.amoadadmobadapter"));
        }
    }
}
