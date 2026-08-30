package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ironsource/jc;", "", "", com.ironsource.y8.h.W, "c", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/lang/Boolean;", "", "b", "(Ljava/lang/String;)Ljava/lang/Integer;", "Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "experimentsJson", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final org.json.JSONObject experimentsJson;

    public jc(org.json.JSONObject jSONObject) {
        this.experimentsJson = jSONObject;
    }

    public final java.lang.Boolean a(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        org.json.JSONObject jSONObject = this.experimentsJson;
        java.lang.Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof java.lang.Boolean) {
            return (java.lang.Boolean) objOpt;
        }
        return null;
    }

    public final java.lang.Integer b(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        org.json.JSONObject jSONObject = this.experimentsJson;
        java.lang.Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof java.lang.Integer) {
            return (java.lang.Integer) objOpt;
        }
        return null;
    }

    public final java.lang.String c(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        org.json.JSONObject jSONObject = this.experimentsJson;
        java.lang.Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof java.lang.String) {
            return (java.lang.String) objOpt;
        }
        return null;
    }
}
