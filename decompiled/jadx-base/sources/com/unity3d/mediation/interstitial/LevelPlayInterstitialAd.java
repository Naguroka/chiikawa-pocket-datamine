package com.unity3d.mediation.interstitial;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAd;", "", "", "loadAd", "Landroid/app/Activity;", "activity", "", com.json.op.d, "showAd", "", "isAdReady", "Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAdListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getAdUnitId", "()Ljava/lang/String;", "adUnitId", "Lcom/ironsource/el;", "b", "Lcom/ironsource/el;", "adInternal", "<init>", "(Ljava/lang/String;)V", "Lcom/ironsource/cl$b;", "payload", "(Ljava/lang/String;Lcom/ironsource/cl$b;)V", "Companion", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class LevelPlayInterstitialAd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Companion INSTANCE = new com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String adUnitId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.el adInternal;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAd$Companion;", "", "()V", "isPlacementCapped", "", com.json.op.d, "", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final boolean isPlacementCapped(java.lang.String placementName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
            return com.json.cl.INSTANCE.a(placementName, com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(java.lang.String adUnitId) {
        this(adUnitId, new com.ironsource.cl.b(new com.json.l1(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, com.ironsource.b2.b.MEDIATION), new com.json.bd(), com.json.im.INSTANCE.d(), new com.ironsource.n9.a()));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public LevelPlayInterstitialAd(java.lang.String adUnitId, com.ironsource.cl.b payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        this.adUnitId = adUnitId;
        this.adInternal = new com.json.el(adUnitId, payload.getAdTools(), payload.getAdControllerFactory(), payload.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER java.lang.String(), payload.getCurrentTimeProvider());
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isPlacementCapped(java.lang.String str) {
        return INSTANCE.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(com.unity3d.mediation.interstitial.LevelPlayInterstitialAd levelPlayInterstitialAd, android.app.Activity activity, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        levelPlayInterstitialAd.showAd(activity, str);
    }

    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    public final boolean isAdReady() {
        return this.adInternal.b();
    }

    public final void loadAd() {
        this.adInternal.c();
    }

    public final void setListener(com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener listener) {
        this.adInternal.a(listener);
    }

    public final void showAd(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        showAd$default(this, activity, null, 2, null);
    }

    public final void showAd(android.app.Activity activity, java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.adInternal.a(activity, placementName);
    }
}
