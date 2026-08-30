package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/yu;", "", "Lorg/json/JSONObject;", "tokenData", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "context", "", "", "[Ljava/lang/String;", "mTokenKeyList", "Lcom/ironsource/ee;", "b", "Lcom/ironsource/ee;", "mGlobalDataReader", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class yu {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String[] mTokenKeyList = com.json.xu.INSTANCE.a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.ee mGlobalDataReader = new com.json.ee();

    private final org.json.JSONObject a(org.json.JSONObject tokenData) throws org.json.JSONException {
        org.json.JSONObject jSONObjectB = com.json.fe.b(tokenData.optJSONObject(com.json.ce.s));
        if (jSONObjectB != null) {
            tokenData.put(com.json.ce.s, jSONObjectB);
        }
        return tokenData;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the new method getToken(context: Context)")
    public final org.json.JSONObject a() throws org.json.JSONException {
        org.json.JSONObject jSONObjectA = this.mGlobalDataReader.a(this.mTokenKeyList);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(jSONObjectA);
    }

    public final org.json.JSONObject a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        org.json.JSONObject jSONObjectA = this.mGlobalDataReader.a(context, this.mTokenKeyList);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(jSONObjectA);
    }
}
