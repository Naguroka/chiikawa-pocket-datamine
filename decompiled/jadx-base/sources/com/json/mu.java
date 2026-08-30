package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002J-\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\tJ\u0016\u0010\u000b\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002J\n\u0010\u0005\u001a\u00020\r*\u00020\fJ\n\u0010\u0005\u001a\u00020\u000f*\u00020\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/ironsource/mu;", "", "", "list", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "elem", "", com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS, "([Ljava/lang/Object;)Ljava/util/List;", "methodArgs", "b", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "Lcom/unity3d/mediation/LevelPlayAdError;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "Ljava/lang/String;", "CONST_COMMA", "c", "CONST_START_OF_ARRAY", "d", "CONST_END_OF_ARRAY", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class mu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.mu f3048a = new com.json.mu();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final java.lang.String CONST_COMMA = ",";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final java.lang.String CONST_START_OF_ARRAY = "[";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final java.lang.String CONST_END_OF_ARRAY = "]";

    private mu() {
    }

    private final java.lang.String a(java.lang.Object elem) {
        return elem instanceof java.lang.String ? "'" + elem + '\'' : java.lang.String.valueOf(elem);
    }

    private final java.lang.String a(java.util.List<?> list) {
        java.util.Iterator<?> it = list.iterator();
        java.lang.String str = "[";
        while (it.hasNext()) {
            str = str + f3048a.a(it.next()) + ',';
        }
        return kotlin.text.StringsKt.removeSuffix(str, (java.lang.CharSequence) CONST_COMMA) + ']';
    }

    public final com.json.mediationsdk.adunit.adapter.utility.AdInfo a(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(levelPlayAdInfo, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("auctionId", levelPlayAdInfo.getAuctionId());
        jSONObject.put("adUnit", levelPlayAdInfo.getAdFormat());
        jSONObject.put(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, levelPlayAdInfo.getCountry());
        jSONObject.put(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_ABTEST, levelPlayAdInfo.getAb());
        jSONObject.put(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_SEGMENT_NAME, levelPlayAdInfo.getSegmentName());
        jSONObject.put("placement", levelPlayAdInfo.getPlacementName());
        jSONObject.put(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_NETWORK, levelPlayAdInfo.getAdNetwork());
        jSONObject.put("instanceName", levelPlayAdInfo.getInstanceName());
        jSONObject.put("instanceId", levelPlayAdInfo.getInstanceId());
        jSONObject.put("precision", levelPlayAdInfo.getPrecision());
        jSONObject.put(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_ENCRYPTED_CPM, levelPlayAdInfo.getEncryptedCPM());
        jSONObject.put("revenue", levelPlayAdInfo.getRevenue());
        return new com.json.mediationsdk.adunit.adapter.utility.AdInfo(new com.json.mediationsdk.impressionData.ImpressionData(jSONObject), null);
    }

    public final com.json.mediationsdk.logger.IronSourceError a(com.unity3d.mediation.LevelPlayAdError levelPlayAdError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(levelPlayAdError, "<this>");
        return new com.json.mediationsdk.logger.IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    public final java.util.List<java.lang.Object> a(java.lang.Object... items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "items");
        return kotlin.collections.CollectionsKt.listOf(java.util.Arrays.copyOf(items, items.length));
    }

    public final java.lang.String b(java.util.List<? extends java.lang.Object> methodArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodArgs, "methodArgs");
        java.lang.String str = new java.lang.String();
        for (java.lang.Object obj : methodArgs) {
            str = (str + (obj instanceof java.util.List ? f3048a.a((java.util.List<?>) obj) : f3048a.a(obj))) + ',';
        }
        return kotlin.text.StringsKt.removeSuffix(str, (java.lang.CharSequence) CONST_COMMA);
    }
}
