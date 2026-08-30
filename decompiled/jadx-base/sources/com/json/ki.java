package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ironsource/ki;", "", "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/ArrayList;", "", "Ljava/util/ArrayList;", "mInitKeyList", "Lcom/ironsource/ee;", "b", "Lcom/ironsource/ee;", "mGlobalDataReader", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ki {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.ArrayList<java.lang.String> mInitKeyList = new java.util.ArrayList<>(new com.json.ji().a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.ee mGlobalDataReader = new com.json.ee();

    public final org.json.JSONObject a() throws org.json.JSONException {
        org.json.JSONObject jSONObjectA = this.mGlobalDataReader.a(this.mInitKeyList);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return jSONObjectA;
    }
}
