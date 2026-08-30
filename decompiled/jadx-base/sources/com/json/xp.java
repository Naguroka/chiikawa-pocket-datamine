package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R#\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u0006\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ironsource/xp;", "", "Lcom/ironsource/vn;", "networkSettings", "", "b", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "Lorg/json/JSONObject;", com.json.pr.b, "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class xp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.Map<java.lang.String, com.json.vn> networkSettings;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "kotlin.jvm.PlatformType", "networkName", "Lkotlin/Pair;", "Lcom/ironsource/vn;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Pair<? extends java.lang.String, ? extends com.json.vn>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f3561a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(org.json.JSONObject jSONObject) {
            super(1);
            this.f3561a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.Pair<java.lang.String, com.json.vn> invoke(java.lang.String networkName) throws org.json.JSONException {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkName, "networkName");
            org.json.JSONObject jSONObject = this.f3561a.getJSONObject(networkName);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "providerSettings.getJSONObject(networkName)");
            return kotlin.TuplesKt.to(networkName, new com.json.vn(networkName, jSONObject));
        }
    }

    public xp(org.json.JSONObject providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        java.util.Iterator<java.lang.String> itKeys = providerSettings.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(itKeys, "providerSettings\n          .keys()");
        java.util.Map<java.lang.String, com.json.vn> map = kotlin.collections.MapsKt.toMap(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.asSequence(itKeys), new com.ironsource.xp.a(providerSettings)));
        this.networkSettings = map;
        for (java.util.Map.Entry<java.lang.String, com.json.vn> entry : map.entrySet()) {
            entry.getKey();
            com.json.vn value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final com.json.vn a(com.json.vn networkSettings) {
        return this.networkSettings.get(networkSettings.getCom.ironsource.wn.e java.lang.String());
    }

    private final boolean b(com.json.vn networkSettings) {
        if (networkSettings.getIsMultipleInstances()) {
            return networkSettings.getProviderTypeForReflection().length() > 0;
        }
        return false;
    }

    public final java.util.Map<java.lang.String, com.json.vn> a() {
        return this.networkSettings;
    }
}
