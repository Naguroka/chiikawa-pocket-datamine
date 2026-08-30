package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\t\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/or;", "", "Lcom/ironsource/hs;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/hs;", "c", "()Lcom/ironsource/hs;", "fullResponse", "Lcom/ironsource/vp;", "b", "Lcom/ironsource/vp;", "d", "()Lcom/ironsource/vp;", com.json.pr.f3168a, "Lcom/ironsource/xp;", "Lcom/ironsource/xp;", "e", "()Lcom/ironsource/xp;", com.json.pr.b, "Lcom/ironsource/q8;", "Lcom/ironsource/q8;", "()Lcom/ironsource/q8;", "configurations", "Lcom/ironsource/jc;", "Lcom/ironsource/jc;", "()Lcom/ironsource/jc;", com.json.pr.d, "<init>", "(Lcom/ironsource/hs;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class or {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.hs fullResponse;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.vp providerOrder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.xp providerSettings;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.q8 configurations;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.jc experiments;

    public or(com.json.hs fullResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullResponse, "fullResponse");
        this.fullResponse = fullResponse;
        org.json.JSONObject jSONObjectOptJSONObject = fullResponse.i().optJSONObject(com.json.pr.f3168a);
        this.providerOrder = new com.json.vp(jSONObjectOptJSONObject == null ? new org.json.JSONObject() : jSONObjectOptJSONObject);
        org.json.JSONObject jSONObjectOptJSONObject2 = fullResponse.i().optJSONObject(com.json.pr.b);
        this.providerSettings = new com.json.xp(jSONObjectOptJSONObject2 == null ? new org.json.JSONObject() : jSONObjectOptJSONObject2);
        org.json.JSONObject jSONObjectOptJSONObject3 = fullResponse.i().optJSONObject("configurations");
        this.configurations = new com.json.q8(jSONObjectOptJSONObject3 == null ? new org.json.JSONObject() : jSONObjectOptJSONObject3);
        org.json.JSONObject jSONObjectOptJSONObject4 = fullResponse.i().optJSONObject(com.json.pr.d);
        this.experiments = new com.json.jc(jSONObjectOptJSONObject4 == null ? new org.json.JSONObject() : jSONObjectOptJSONObject4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.q8 getConfigurations() {
        return this.configurations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.json.jc getExperiments() {
        return this.experiments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.json.hs getFullResponse() {
        return this.fullResponse;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.json.vp getProviderOrder() {
        return this.providerOrder;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final com.json.xp getProviderSettings() {
        return this.providerSettings;
    }
}
