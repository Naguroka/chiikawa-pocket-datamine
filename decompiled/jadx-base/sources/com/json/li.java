package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/ironsource/li;", "", "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.li f2887a = new com.json.li();

    private li() {
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONObject a() throws org.json.JSONException {
        org.json.JSONObject jSONObjectPut = new org.json.JSONObject().put("data", com.json.mediationsdk.utils.IronSourceAES.encode(com.json.jb.b().c(), new com.json.ki().a().toString()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "InitProvider()\n        .…ATA_KEY, encryptedData) }");
        return jSONObjectPut;
    }
}
