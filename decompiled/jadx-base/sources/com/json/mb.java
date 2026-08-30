package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/ironsource/mb;", "Lcom/ironsource/kf;", "Lcom/ironsource/kf$a;", "Lorg/json/JSONObject;", "config", com.ironsource.y8.a.c, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "f", "", "c", "", "e", "b", "d", "Lorg/json/JSONObject;", "g", "()Lorg/json/JSONObject;", com.json.nb.f3074a, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class mb implements com.json.kf, com.ironsource.kf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private org.json.JSONObject config = new org.json.JSONObject();

    private final org.json.JSONObject g() {
        org.json.JSONObject jSONObjectOptJSONObject = this.config.optJSONObject(com.json.nb.f3074a);
        return jSONObjectOptJSONObject == null ? new org.json.JSONObject() : jSONObjectOptJSONObject;
    }

    @Override // com.ironsource.kf.a
    public void a(org.json.JSONObject epConfig) {
        if (epConfig == null) {
            epConfig = this.config;
        }
        this.config = epConfig;
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("setEpConfig: " + this.config);
    }

    @Override // com.json.ob
    public boolean a() {
        return g().optBoolean(com.json.pb.e);
    }

    @Override // com.json.ob
    public long b() {
        java.lang.String strOptString = g().optString(com.json.pb.d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(strOptString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 2000L;
    }

    @Override // com.json.ob
    public int c() {
        java.lang.String strOptString = g().optString(com.json.pb.b);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(strOptString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @Override // com.json.kf
    /* JADX INFO: renamed from: config, reason: from getter */
    public org.json.JSONObject getConfig() {
        return this.config;
    }

    @Override // com.json.ob
    public boolean d() {
        return g().optBoolean(com.json.pb.f, true);
    }

    @Override // com.json.ob
    public long e() {
        java.lang.String strOptString = g().optString(com.json.pb.c);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(strOptString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 0L;
    }

    @Override // com.json.ob
    public boolean f() {
        java.lang.String strOptString = g().optString(com.json.pb.f3157a);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        java.lang.String lowerCase = strOptString.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, com.json.mediationsdk.metadata.a.g);
    }
}
