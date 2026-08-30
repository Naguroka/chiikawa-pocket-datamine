package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/ironsource/w3;", "", "Lcom/ironsource/cm;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/cm;", "e", "()Lcom/ironsource/cm;", "logger", "", "b", "Z", "d", "()Z", com.json.y3.g, "Lcom/ironsource/a4;", "c", "Lcom/ironsource/a4;", "()Lcom/ironsource/a4;", com.json.y3.h, "Lcom/ironsource/h4;", "Lcom/ironsource/h4;", "()Lcom/ironsource/h4;", "generalSettings", "Lcom/ironsource/u3;", "Lcom/ironsource/u3;", "()Lcom/ironsource/u3;", "auctionSettings", "Lorg/json/JSONObject;", "applicationConfigurations", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.cm logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean integration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.a4 crashReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.h4 generalSettings;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.u3 auctionSettings;

    public w3(org.json.JSONObject applicationConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationConfigurations, "applicationConfigurations");
        org.json.JSONObject jSONObjectOptJSONObject = applicationConfigurations.optJSONObject(com.json.y3.f3571a);
        this.logger = new com.json.cm(jSONObjectOptJSONObject == null ? new org.json.JSONObject() : jSONObjectOptJSONObject);
        this.integration = applicationConfigurations.optBoolean(com.json.y3.g, false);
        org.json.JSONObject jSONObjectOptJSONObject2 = applicationConfigurations.optJSONObject(com.json.y3.h);
        this.crashReporter = new com.json.a4(jSONObjectOptJSONObject2 == null ? new org.json.JSONObject() : jSONObjectOptJSONObject2);
        org.json.JSONObject jSONObjectOptJSONObject3 = applicationConfigurations.optJSONObject("settings");
        this.generalSettings = new com.json.h4(jSONObjectOptJSONObject3 == null ? new org.json.JSONObject() : jSONObjectOptJSONObject3);
        org.json.JSONObject jSONObjectOptJSONObject4 = applicationConfigurations.optJSONObject(com.json.y3.f);
        this.auctionSettings = new com.json.u3(jSONObjectOptJSONObject4 == null ? new org.json.JSONObject() : jSONObjectOptJSONObject4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.u3 getAuctionSettings() {
        return this.auctionSettings;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.json.a4 getCrashReporter() {
        return this.crashReporter;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.json.h4 getGeneralSettings() {
        return this.generalSettings;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIntegration() {
        return this.integration;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final com.json.cm getLogger() {
        return this.logger;
    }
}
