package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\n\u0010\u0019R#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0006\u0010\u001f¨\u0006#"}, d2 = {"Lcom/ironsource/q8;", "", "Lorg/json/JSONObject;", "configurations", "", "adFormatKey", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/s;", "Lcom/ironsource/s;", "rewardedConfigurations", "b", "interstitialConfigurations", "Lcom/ironsource/q6;", "c", "Lcom/ironsource/q6;", "()Lcom/ironsource/q6;", "bannerConfigurations", "Lcom/ironsource/om;", "d", "Lcom/ironsource/om;", "()Lcom/ironsource/om;", "nativeAdConfigurations", "Lcom/ironsource/w3;", "e", "Lcom/ironsource/w3;", "()Lcom/ironsource/w3;", "applicationConfigurations", "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "adFormatsConfigurations", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.s rewardedConfigurations;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.s interstitialConfigurations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.q6 bannerConfigurations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.om nativeAdConfigurations;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.w3 applicationConfigurations;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.json.s> adFormatsConfigurations;

    public q8(org.json.JSONObject configurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
        com.json.s sVar = new com.json.s(a(configurations, "rewarded"));
        this.rewardedConfigurations = sVar;
        com.json.s sVar2 = new com.json.s(a(configurations, "interstitial"));
        this.interstitialConfigurations = sVar2;
        this.bannerConfigurations = new com.json.q6(a(configurations, "banner"));
        this.nativeAdConfigurations = new com.json.om(a(configurations, "nativeAd"));
        org.json.JSONObject jSONObjectOptJSONObject = configurations.optJSONObject("application");
        this.applicationConfigurations = new com.json.w3(jSONObjectOptJSONObject == null ? new org.json.JSONObject() : jSONObjectOptJSONObject);
        this.adFormatsConfigurations = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, sVar2), kotlin.TuplesKt.to(com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, sVar));
    }

    private final org.json.JSONObject a(org.json.JSONObject configurations, java.lang.String adFormatKey) {
        org.json.JSONObject jSONObjectOptJSONObject = configurations.optJSONObject("adFormats");
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(adFormatKey) : null;
        return jSONObjectOptJSONObject2 == null ? new org.json.JSONObject() : jSONObjectOptJSONObject2;
    }

    public final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.json.s> a() {
        return this.adFormatsConfigurations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.json.w3 getApplicationConfigurations() {
        return this.applicationConfigurations;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.json.q6 getBannerConfigurations() {
        return this.bannerConfigurations;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.json.om getNativeAdConfigurations() {
        return this.nativeAdConfigurations;
    }
}
