package com.amoad.amoadadmobadapter;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J$\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0016J$\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0013H\u0016J$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0013H\u0016¨\u0006\u001c"}, d2 = {"Lcom/amoad/amoadadmobadapter/AMoAdAdapter;", "Lcom/google/android/gms/ads/mediation/Adapter;", "()V", "getSDKVersionInfo", "Lcom/google/android/gms/ads/mediation/VersionInfo;", "getVersionInfo", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "context", "Landroid/content/Context;", "initializationCompleteCallback", "Lcom/google/android/gms/ads/mediation/InitializationCompleteCallback;", "list", "", "Lcom/google/android/gms/ads/mediation/MediationConfiguration;", "loadBannerAd", "mediationBannerAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "callback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "loadRewardedAd", "mediationRewardedAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAd;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdCallback;", "loadRewardedInterstitialAd", "AMoAdAdMobAdapter_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AMoAdAdapter extends com.google.android.gms.ads.mediation.Adapter {
    @Override // com.google.android.gms.ads.mediation.Adapter
    public final com.google.android.gms.ads.mediation.VersionInfo getSDKVersionInfo() {
        java.util.List listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) "5.2.30", new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null);
        return listSplit$default.size() >= 3 ? new com.google.android.gms.ads.mediation.VersionInfo(java.lang.Integer.parseInt((java.lang.String) listSplit$default.get(0)), java.lang.Integer.parseInt((java.lang.String) listSplit$default.get(1)), java.lang.Integer.parseInt((java.lang.String) listSplit$default.get(2))) : new com.google.android.gms.ads.mediation.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public final com.google.android.gms.ads.mediation.VersionInfo getVersionInfo() {
        java.util.List listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) com.amoad.amoadadmobadapter.AMoAdAdapterBuildConfig.a(), new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null);
        return listSplit$default.size() >= 3 ? new com.google.android.gms.ads.mediation.VersionInfo(java.lang.Integer.parseInt((java.lang.String) listSplit$default.get(0)), java.lang.Integer.parseInt((java.lang.String) listSplit$default.get(1)), java.lang.Integer.parseInt((java.lang.String) listSplit$default.get(2))) : new com.google.android.gms.ads.mediation.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public final void initialize(android.content.Context context, com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationCompleteCallback, "initializationCompleteCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        initializationCompleteCallback.onInitializationSucceeded();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    @Override // com.google.android.gms.ads.mediation.Adapter
    public final void loadBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> callback) {
        java.lang.String string;
        com.amoad.AMoAdView.RotateTransition rotateTransition;
        java.lang.String string2 = "none";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.amoad.amoadadmobadapter.AMoAdBannerAd aMoAdBannerAd = new com.amoad.amoadadmobadapter.AMoAdBannerAd(mediationBannerAdConfiguration, callback);
        java.lang.String string3 = aMoAdBannerAd.b.getServerParameters().getString(com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        if (string3 == null) {
            aMoAdBannerAd.c.onFailure(new com.google.android.gms.ads.AdError(101, "Missing parameter", "com.amoad.amoadadmobadapter"));
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(string3);
            try {
                java.lang.String string4 = jSONObject.getString("sid");
                try {
                    string = jSONObject.getString("rotate_transition");
                } catch (java.lang.Exception unused) {
                    string = "none";
                }
                if (string != null) {
                    switch (string) {
                        case "rotate":
                            rotateTransition = com.amoad.AMoAdView.RotateTransition.ROTATE;
                            break;
                        case "alpha":
                            rotateTransition = com.amoad.AMoAdView.RotateTransition.ALPHA;
                            break;
                        case "scale":
                            rotateTransition = com.amoad.AMoAdView.RotateTransition.SCALE;
                            break;
                        case "translate":
                            rotateTransition = com.amoad.AMoAdView.RotateTransition.TRANSLATE;
                            break;
                        default:
                            rotateTransition = com.amoad.AMoAdView.RotateTransition.NONE;
                            break;
                    }
                } else {
                    rotateTransition = com.amoad.AMoAdView.RotateTransition.NONE;
                }
                try {
                    string2 = jSONObject.getString("click_transition");
                } catch (java.lang.Exception unused2) {
                }
                com.amoad.AMoAdView.ClickTransition clickTransition = kotlin.jvm.internal.Intrinsics.areEqual(string2, "jump") ? com.amoad.AMoAdView.ClickTransition.JUMP : com.amoad.AMoAdView.ClickTransition.NONE;
                com.amoad.AMoAdLogger.getInstance().i("AMoAdAdapter: Loading AdView in AMoAd with sid:" + string4 + ", rotate_transition:" + rotateTransition + ", click_transition:" + clickTransition);
                com.amoad.AMoAdView aMoAdView = new com.amoad.AMoAdView(aMoAdBannerAd.b.getContext());
                aMoAdView.setCallback(new com.amoad.amoadadmobadapter.AMoAdBannerAd.a(aMoAdBannerAd, aMoAdBannerAd.c));
                aMoAdView.setRotateTransition(rotateTransition);
                aMoAdView.setClickTransition(clickTransition);
                aMoAdView.setSid(string4, true);
                aMoAdBannerAd.d = aMoAdView;
            } catch (java.lang.Exception unused3) {
                aMoAdBannerAd.c.onFailure(new com.google.android.gms.ads.AdError(101, "parameter missing sid", "com.amoad.amoadadmobadapter"));
            }
        } catch (java.lang.Exception e) {
            aMoAdBannerAd.c.onFailure(new com.google.android.gms.ads.AdError(101, "parameter decodeFromString error:" + e.getMessage(), "com.amoad.amoadadmobadapter"));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public final void loadRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationRewardedAdConfiguration, "mediationRewardedAdConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        new com.amoad.amoadadmobadapter.AMoAdRewardedAd(mediationRewardedAdConfiguration, callback).a();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public final void loadRewardedInterstitialAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationRewardedAdConfiguration, "mediationRewardedAdConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        new com.amoad.amoadadmobadapter.AMoAdRewardedAd(mediationRewardedAdConfiguration, callback).a();
    }
}
