package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/ironsource/q6;", "", "Lcom/ironsource/q6$b;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/q6$b;", "b", "()Lcom/ironsource/q6$b;", "features", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", com.json.v2.c, "Lorg/json/JSONObject;", "bannerConfigurations", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.ironsource.q6.b features;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.ironsource.q6.b> adUnits;

    /* JADX INFO: renamed from: com.ironsource.q6$a, reason: from Kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Lcom/ironsource/q6$b;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lorg/json/JSONObject;)Lcom/ironsource/q6$b;"}, k = 3, mv = {1, 8, 0})
    static final class JSONObject extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<org.json.JSONObject, com.ironsource.q6.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.json.q6.JSONObject f3192a = new com.json.q6.JSONObject();

        JSONObject() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.q6.b invoke(org.json.JSONObject it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            return new com.ironsource.q6.b(it);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/ironsource/q6$b;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", com.json.s6.f3266a, "", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", com.json.s6.b, "c", "e", "isLoadWhileShow", "", "F", "()F", com.json.s6.d, "", "", "Ljava/util/List;", "()Ljava/util/List;", "bannerAdSizeFallbackList", "Lorg/json/JSONObject;", "features", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.Integer bannerInterval;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final java.lang.Boolean isAutoRefresh;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final java.lang.Boolean isLoadWhileShow;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final float maxScreenHeightPercentage;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final java.util.List<java.lang.String> bannerAdSizeFallbackList;

        public b(org.json.JSONObject features) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "features");
            this.bannerInterval = features.has(com.json.s6.f3266a) ? java.lang.Integer.valueOf(features.optInt(com.json.s6.f3266a)) : null;
            this.isAutoRefresh = features.has(com.json.s6.b) ? java.lang.Boolean.valueOf(features.optBoolean(com.json.s6.b)) : null;
            this.isLoadWhileShow = features.has("isLoadWhileShow") ? java.lang.Boolean.valueOf(features.optBoolean("isLoadWhileShow")) : null;
            this.maxScreenHeightPercentage = features.has(com.json.s6.d) ? features.optInt(com.json.s6.d) / 100.0f : 0.15f;
            java.util.List<java.lang.String> listB = features.has(com.json.s6.e) ? com.json.hk.b(features.getJSONArray(com.json.s6.e)) : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.json.mediationsdk.l.f2983a, com.json.mediationsdk.l.d});
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listB, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.bannerAdSizeFallbackList = listB;
        }

        public final java.util.List<java.lang.String> a() {
            return this.bannerAdSizeFallbackList;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final java.lang.Integer getBannerInterval() {
            return this.bannerInterval;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getMaxScreenHeightPercentage() {
            return this.maxScreenHeightPercentage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final java.lang.Boolean getIsAutoRefresh() {
            return this.isAutoRefresh;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final java.lang.Boolean getIsLoadWhileShow() {
            return this.isLoadWhileShow;
        }
    }

    public q6(org.json.JSONObject bannerConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerConfigurations, "bannerConfigurations");
        this.features = new com.ironsource.q6.b(bannerConfigurations);
        this.adUnits = new com.json.v2(bannerConfigurations).a(com.json.q6.JSONObject.f3192a);
    }

    public final java.util.Map<java.lang.String, com.ironsource.q6.b> a() {
        return this.adUnits;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.ironsource.q6.b getFeatures() {
        return this.features;
    }
}
