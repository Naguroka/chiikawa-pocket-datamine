package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0016R\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/ironsource/yg;", "Lcom/ironsource/xg;", "Lcom/ironsource/xg$a;", "", "configKey", "", "e", "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "c", "(Ljava/lang/String;)Ljava/lang/Boolean;", "", "b", "(Ljava/lang/String;)Ljava/lang/Integer;", "d", "controllerConfig", "", "Lorg/json/JSONObject;", com.ironsource.y8.a.b, com.ironsource.y8.a.c, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class yg implements com.json.xg, com.ironsource.xg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private org.json.JSONObject controllerConfig = new org.json.JSONObject();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private org.json.JSONObject networkConfig = new org.json.JSONObject();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private org.json.JSONObject epConfig = new org.json.JSONObject();

    private final java.lang.Object e(java.lang.String configKey) {
        org.json.JSONObject jSONObject;
        if (this.epConfig.has(configKey)) {
            jSONObject = this.epConfig;
        } else if (this.networkConfig.has(configKey)) {
            jSONObject = this.networkConfig;
        } else {
            if (!this.controllerConfig.has(configKey)) {
                return null;
            }
            jSONObject = this.controllerConfig;
        }
        return jSONObject.get(configKey);
    }

    @Override // com.json.xg
    public org.json.JSONObject a(java.lang.String configKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configKey, "configKey");
        java.lang.Object objE = e(configKey);
        if (objE instanceof org.json.JSONObject) {
            return (org.json.JSONObject) objE;
        }
        return null;
    }

    @Override // com.ironsource.xg.a
    public void a(org.json.JSONObject controllerConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        this.controllerConfig = controllerConfig;
        org.json.JSONObject jSONObjectOptJSONObject = controllerConfig.optJSONObject(com.ironsource.y8.a.b);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new org.json.JSONObject();
        }
        this.networkConfig = jSONObjectOptJSONObject;
        org.json.JSONObject jSONObjectOptJSONObject2 = this.controllerConfig.optJSONObject(com.ironsource.y8.a.c);
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new org.json.JSONObject();
        }
        this.epConfig = jSONObjectOptJSONObject2;
    }

    @Override // com.json.xg
    public java.lang.Integer b(java.lang.String configKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configKey, "configKey");
        java.lang.Object objE = e(configKey);
        if (objE instanceof java.lang.Integer) {
            return (java.lang.Integer) objE;
        }
        return null;
    }

    @Override // com.json.xg
    public java.lang.Boolean c(java.lang.String configKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configKey, "configKey");
        java.lang.Object objE = e(configKey);
        if (objE instanceof java.lang.Boolean) {
            return (java.lang.Boolean) objE;
        }
        return null;
    }

    @Override // com.json.xg
    public java.lang.String d(java.lang.String configKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configKey, "configKey");
        java.lang.Object objE = e(configKey);
        if (objE instanceof java.lang.String) {
            return (java.lang.String) objE;
        }
        return null;
    }
}
