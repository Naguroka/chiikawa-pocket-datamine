package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0002\u0007\u0013B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ironsource/s;", "", "", "", "Lcom/ironsource/s$d;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Map;", "c", "()Ljava/util/Map;", com.json.op.c, "b", "Lcom/ironsource/s$d;", "()Lcom/ironsource/s$d;", "features", com.json.v2.c, "Lorg/json/JSONObject;", "configurations", "<init>", "(Lorg/json/JSONObject;)V", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class s {
    public static final java.lang.String e = "capping";
    public static final java.lang.String f = "pacing";
    public static final java.lang.String g = "delivery";
    public static final java.lang.String h = "progressiveLoadingConfig";
    public static final java.lang.String i = "expiredDurationInMinutes";
    public static final java.lang.String j = "reward";
    public static final java.lang.String k = "name";
    public static final java.lang.String l = "amount";
    public static final java.lang.String m = "virtualItemName";
    public static final java.lang.String n = "virtualItemCount";
    public static final long o = 60;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.Map<java.lang.String, com.ironsource.s.d> placements;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.ironsource.s.d features;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.ironsource.s.d> adUnits;

    /* JADX INFO: renamed from: com.ironsource.s$a, reason: from Kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Lcom/ironsource/s$d;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lorg/json/JSONObject;)Lcom/ironsource/s$d;"}, k = 3, mv = {1, 8, 0})
    static final class JSONObject extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<org.json.JSONObject, com.ironsource.s.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.json.s.JSONObject f3257a = new com.json.s.JSONObject();

        JSONObject() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.s.d invoke(org.json.JSONObject it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            return new com.ironsource.s.d(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$b, reason: from Kotlin metadata and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Lcom/ironsource/s$d;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lorg/json/JSONObject;)Lcom/ironsource/s$d;"}, k = 3, mv = {1, 8, 0})
    static final class C1525b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<org.json.JSONObject, com.ironsource.s.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.json.s.C1525b f3258a = new com.json.s.C1525b();

        C1525b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.s.d invoke(org.json.JSONObject it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            return new com.ironsource.s.d(it);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006&"}, d2 = {"Lcom/ironsource/s$d;", "", "Lcom/ironsource/e8;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/e8;", "b", "()Lcom/ironsource/e8;", com.json.s.e, "Lcom/ironsource/yo;", "Lcom/ironsource/yo;", "e", "()Lcom/ironsource/yo;", com.json.s.f, "Lcom/ironsource/la;", "c", "Lcom/ironsource/la;", "()Lcom/ironsource/la;", com.json.s.g, "", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", com.json.s.i, "Lcom/ironsource/cq;", "Lcom/ironsource/cq;", "()Lcom/ironsource/cq;", "adUnitReward", "f", "placementReward", "Lcom/ironsource/sp;", "g", "Lcom/ironsource/sp;", "()Lcom/ironsource/sp;", com.json.s.h, "Lorg/json/JSONObject;", "features", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.json.e8 capping;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final com.json.yo pacing;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final com.json.la delivery;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final java.lang.Long expiredDurationInMinutes;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final com.json.cq adUnitReward;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final com.json.cq placementReward;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final com.json.sp progressiveLoadingConfig;

        public d(org.json.JSONObject features) throws org.json.JSONException {
            com.json.e8 e8Var;
            com.json.yo yoVar;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "features");
            com.json.sp spVar = null;
            if (features.has(com.json.s.e)) {
                org.json.JSONObject jSONObject = features.getJSONObject(com.json.s.e);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "features.getJSONObject(key)");
                e8Var = new com.json.e8(jSONObject);
            } else {
                e8Var = null;
            }
            this.capping = e8Var;
            if (features.has(com.json.s.f)) {
                org.json.JSONObject jSONObject2 = features.getJSONObject(com.json.s.f);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "features.getJSONObject(key)");
                yoVar = new com.json.yo(jSONObject2);
            } else {
                yoVar = null;
            }
            this.pacing = yoVar;
            this.delivery = features.has(com.json.s.g) ? new com.json.la(features.getBoolean(com.json.s.g)) : null;
            this.expiredDurationInMinutes = features.has(com.json.s.i) ? java.lang.Long.valueOf(features.getLong(com.json.s.i)) : null;
            org.json.JSONObject jSONObjectOptJSONObject = features.optJSONObject(com.json.s.j);
            this.adUnitReward = jSONObjectOptJSONObject != null ? new com.json.cq(jSONObjectOptJSONObject, "name", "amount") : null;
            com.json.cq cqVar = new com.json.cq(features, com.json.s.m, com.json.s.n);
            java.lang.String name = cqVar.getName();
            boolean z = false;
            if (!(name == null || name.length() == 0) && cqVar.getAmount() != null) {
                z = true;
            }
            this.placementReward = z ? cqVar : null;
            if (features.has(com.json.s.h)) {
                org.json.JSONObject jSONObject3 = features.getJSONObject(com.json.s.h);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "features.getJSONObject(key)");
                spVar = new com.json.sp(jSONObject3);
            }
            this.progressiveLoadingConfig = spVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final com.json.cq getAdUnitReward() {
            return this.adUnitReward;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final com.json.e8 getCapping() {
            return this.capping;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final com.json.la getDelivery() {
            return this.delivery;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final java.lang.Long getExpiredDurationInMinutes() {
            return this.expiredDurationInMinutes;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final com.json.yo getPacing() {
            return this.pacing;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final com.json.cq getPlacementReward() {
            return this.placementReward;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final com.json.sp getProgressiveLoadingConfig() {
            return this.progressiveLoadingConfig;
        }
    }

    public s(org.json.JSONObject configurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.placements = new com.json.op(configurations).a(com.json.s.C1525b.f3258a);
        this.features = new com.ironsource.s.d(configurations);
        this.adUnits = new com.json.v2(configurations).a(com.json.s.JSONObject.f3257a);
    }

    public final java.util.Map<java.lang.String, com.ironsource.s.d> a() {
        return this.adUnits;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.ironsource.s.d getFeatures() {
        return this.features;
    }

    public final java.util.Map<java.lang.String, com.ironsource.s.d> c() {
        return this.placements;
    }
}
