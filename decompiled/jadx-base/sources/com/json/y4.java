package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/y4;", "", "Lorg/json/JSONObject;", "tokenData", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ce$a;", "Lcom/ironsource/ce$a;", "adUnit", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "mAuctionKeyList", "Lcom/ironsource/ee;", "c", "Lcom/ironsource/ee;", "mGlobalDataReader", "<init>", "(Lcom/ironsource/ce$a;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.ironsource.ce.a adUnit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.ArrayList<java.lang.String> mAuctionKeyList = new java.util.ArrayList<>(new com.json.w4().a());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.ee mGlobalDataReader = new com.json.ee();

    public y4(com.ironsource.ce.a aVar) {
        this.adUnit = aVar;
    }

    private final org.json.JSONObject a(org.json.JSONObject tokenData) throws org.json.JSONException {
        org.json.JSONObject jSONObjectB = com.json.fe.b(tokenData.optJSONObject(com.json.ce.s));
        if (jSONObjectB != null) {
            tokenData.put(com.json.ce.s, jSONObjectB);
        }
        return tokenData;
    }

    public final org.json.JSONObject a() {
        com.ironsource.ce.a aVar = this.adUnit;
        org.json.JSONObject jSONObjectA = aVar != null ? this.mGlobalDataReader.a(this.mAuctionKeyList, aVar) : null;
        if (jSONObjectA == null) {
            jSONObjectA = this.mGlobalDataReader.a(this.mAuctionKeyList);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return a(jSONObjectA);
    }
}
