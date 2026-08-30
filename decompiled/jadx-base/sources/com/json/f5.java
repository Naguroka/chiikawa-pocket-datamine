package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u0007\fBI\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010&\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b'\u0010(J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0004R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0019\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u0012\u0010 R\u0019\u0010&\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006)"}, d2 = {"Lcom/ironsource/f5;", "", "Lcom/ironsource/mediationsdk/demandOnly/a;", com.json.mediationsdk.d.h, "", "instanceId", "Lcom/ironsource/j5;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "providerName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "auctionId", "Lcom/ironsource/mediationsdk/demandOnly/a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lcom/ironsource/mediationsdk/demandOnly/a;", "c", "Lcom/ironsource/j5;", "e", "()Lcom/ironsource/j5;", "genericNotifications", "Lorg/json/JSONObject;", "d", "Lorg/json/JSONObject;", "f", "()Lorg/json/JSONObject;", "genericParams", "configurations", "Lcom/ironsource/z4;", "Lcom/ironsource/z4;", "()Lcom/ironsource/z4;", "auctionReportUrls", "Lcom/ironsource/k5;", "g", "Lcom/ironsource/k5;", "()Lcom/ironsource/k5;", com.json.j5.s, "<init>", "(Ljava/lang/String;Lcom/ironsource/mediationsdk/demandOnly/a;Lcom/ironsource/j5;Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/z4;Lcom/ironsource/k5;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class f5 {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final com.json.f5.Companion INSTANCE = new com.json.f5.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String auctionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.mediationsdk.demandOnly.a waterfall;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.j5 genericNotifications;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final org.json.JSONObject genericParams;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final org.json.JSONObject configurations;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final com.json.z4 auctionReportUrls;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final com.json.k5 serverData;

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0006\u0010\u0004\u001a\u00020\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\b\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0016\u0010!\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/ironsource/f5$a;", "", "Lorg/json/JSONObject;", "auctionResponse", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "settingsJsonObject", "Lcom/ironsource/mediationsdk/demandOnly/a;", "Lcom/ironsource/j5;", "c", "d", "b", com.json.mediationsdk.d.h, "", "instanceId", "Lcom/ironsource/z4;", "Lcom/ironsource/k5;", "Lcom/ironsource/f5;", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "auctionData", "Ljava/lang/String;", "()Ljava/lang/String;", "auctionId", "Lcom/ironsource/mediationsdk/demandOnly/a;", "e", "Lcom/ironsource/j5;", "genericNotifications", "f", "genericParams", "g", "configurations", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/ironsource/z4;", "auctionReportUrls", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/ironsource/k5;", com.json.j5.s, "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final org.json.JSONObject auctionData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final java.lang.String instanceId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final java.lang.String auctionId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final com.json.mediationsdk.demandOnly.a waterfall;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final com.json.j5 genericNotifications;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final org.json.JSONObject genericParams;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final org.json.JSONObject configurations;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final com.json.z4 auctionReportUrls;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final com.json.k5 serverData;

        public a(org.json.JSONObject auctionData, java.lang.String instanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            this.auctionData = auctionData;
            this.instanceId = instanceId;
            org.json.JSONObject jSONObjectA = a(auctionData);
            this.auctionId = auctionData.optString("auctionId");
            com.json.mediationsdk.demandOnly.a aVarA = a(auctionData, jSONObjectA);
            this.waterfall = aVarA;
            this.genericNotifications = c(jSONObjectA);
            this.genericParams = d(jSONObjectA);
            this.configurations = b(jSONObjectA);
            this.auctionReportUrls = a(aVarA, instanceId);
            this.serverData = b(aVarA, instanceId);
        }

        private final com.json.mediationsdk.demandOnly.a a(org.json.JSONObject auctionResponse, org.json.JSONObject settingsJsonObject) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONObject jSONObjectOptJSONObject = settingsJsonObject.optJSONObject(com.json.mediationsdk.d.d);
            org.json.JSONArray jSONArrayOptJSONArray = auctionResponse.optJSONArray(com.json.mediationsdk.d.h);
            if (jSONArrayOptJSONArray != null) {
                kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.RangesKt.until(0, jSONArrayOptJSONArray.length());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator<java.lang.Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((kotlin.collections.IntIterator) it).nextInt();
                    com.json.j5 j5Var = new com.json.j5(jSONArrayOptJSONArray.getJSONObject(iNextInt), iNextInt, jSONObjectOptJSONObject);
                    if (!j5Var.m()) {
                        j5Var = null;
                    }
                    if (j5Var != null) {
                        arrayList2.add(j5Var);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new com.json.mediationsdk.demandOnly.a.C0238a(arrayList);
        }

        private final com.json.z4 a(com.json.mediationsdk.demandOnly.a waterfall, java.lang.String instanceId) {
            com.json.j5 j5VarA = waterfall.a(instanceId);
            if (j5VarA == null) {
                return null;
            }
            com.json.z4 z4Var = new com.json.z4();
            z4Var.a(j5VarA.b());
            z4Var.c(j5VarA.h());
            z4Var.b(j5VarA.g());
            return z4Var;
        }

        private final org.json.JSONObject a(org.json.JSONObject auctionResponse) {
            org.json.JSONObject jSONObjectOptJSONObject = auctionResponse.optJSONObject("settings");
            return jSONObjectOptJSONObject == null ? new org.json.JSONObject() : jSONObjectOptJSONObject;
        }

        private final com.json.k5 b(com.json.mediationsdk.demandOnly.a waterfall, java.lang.String instanceId) {
            com.json.j5 j5VarA = waterfall.a(instanceId);
            if (j5VarA == null) {
                return null;
            }
            java.lang.String strK = j5VarA.k();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strK, "it.serverData");
            return new com.json.k5(strK);
        }

        private final org.json.JSONObject b(org.json.JSONObject settingsJsonObject) {
            return settingsJsonObject.optJSONObject("configurations");
        }

        private final com.json.j5 c(org.json.JSONObject settingsJsonObject) {
            return new com.json.j5(settingsJsonObject);
        }

        private final org.json.JSONObject d(org.json.JSONObject settingsJsonObject) {
            return settingsJsonObject.optJSONObject("genericParams");
        }

        public final com.json.f5 a() {
            return new com.json.f5(this.auctionId, this.waterfall, this.genericNotifications, this.genericParams, this.configurations, this.auctionReportUrls, this.serverData);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final org.json.JSONObject getAuctionData() {
            return this.auctionData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final java.lang.String getInstanceId() {
            return this.instanceId;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f5$b, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u000b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/ironsource/f5$b;", "", "Lcom/ironsource/f5;", "auctionResponse", "", "instanceId", "Lkotlin/Result;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/ironsource/f5;Ljava/lang/String;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "auctionData", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final java.lang.Object a(com.json.f5 auctionResponse, java.lang.String instanceId) {
            com.json.lg lgVar;
            java.lang.Object objCreateFailure;
            java.lang.String auctionId = auctionResponse.getAuctionId();
            if (auctionId == null || auctionId.length() == 0) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                lgVar = new com.json.lg(com.json.tb.f3430a.i());
            } else if (auctionResponse.i()) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                lgVar = new com.json.lg(com.json.tb.f3430a.f());
            } else {
                com.json.j5 j5VarA = auctionResponse.a(instanceId);
                if (j5VarA != null) {
                    java.lang.String strK = j5VarA.k();
                    if (strK == null || strK.length() == 0) {
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        lgVar = new com.json.lg(com.json.tb.f3430a.e());
                    } else {
                        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                        objCreateFailure = auctionResponse;
                    }
                    return kotlin.Result.m1301constructorimpl(objCreateFailure);
                }
                kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                lgVar = new com.json.lg(com.json.tb.f3430a.j());
            }
            objCreateFailure = kotlin.ResultKt.createFailure(lgVar);
            return kotlin.Result.m1301constructorimpl(objCreateFailure);
        }

        public final java.lang.Object a(org.json.JSONObject auctionData, java.lang.String instanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            return a(new com.ironsource.f5.a(auctionData, instanceId).a(), instanceId);
        }
    }

    public f5(java.lang.String str, com.json.mediationsdk.demandOnly.a waterfall, com.json.j5 genericNotifications, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.z4 z4Var, com.json.k5 k5Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericNotifications, "genericNotifications");
        this.auctionId = str;
        this.waterfall = waterfall;
        this.genericNotifications = genericNotifications;
        this.genericParams = jSONObject;
        this.configurations = jSONObject2;
        this.auctionReportUrls = z4Var;
        this.serverData = k5Var;
    }

    private final com.json.j5 a(com.json.mediationsdk.demandOnly.a waterfall, java.lang.String instanceId) {
        return waterfall.a(instanceId);
    }

    public final com.json.j5 a(java.lang.String providerName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
        return a(this.waterfall, providerName);
    }

    public final java.lang.String a() {
        com.json.k5 k5Var = this.serverData;
        if (k5Var != null) {
            return k5Var.d();
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getAuctionId() {
        return this.auctionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.json.z4 getAuctionReportUrls() {
        return this.auctionReportUrls;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final org.json.JSONObject getConfigurations() {
        return this.configurations;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final com.json.j5 getGenericNotifications() {
        return this.genericNotifications;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final org.json.JSONObject getGenericParams() {
        return this.genericParams;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final com.json.k5 getServerData() {
        return this.serverData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final com.json.mediationsdk.demandOnly.a getWaterfall() {
        return this.waterfall;
    }

    public final boolean i() {
        return this.waterfall.isEmpty();
    }
}
