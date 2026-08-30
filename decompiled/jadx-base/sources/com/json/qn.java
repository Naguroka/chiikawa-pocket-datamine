package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/qn;", "Lcom/ironsource/bt;", "Lorg/json/JSONObject;", "Lcom/ironsource/zs;", "Lcom/ironsource/on;", "record", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/at;", com.ironsource.y8.a.t, "b", "", "", "Lcom/ironsource/e3;", "Ljava/util/Map;", "advertiserBundlesHistory", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class qn implements com.json.bt<org.json.JSONObject>, com.json.zs<com.json.on> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.Map<java.lang.String, com.json.e3> advertiserBundlesHistory = new java.util.LinkedHashMap();

    @Override // com.json.zs
    public void a(com.json.on record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "record");
        java.lang.String advertiserBundleId = record.getAdvertiserBundleId();
        java.util.Map<java.lang.String, com.json.e3> map = this.advertiserBundlesHistory;
        com.json.e3 e3Var = map.get(advertiserBundleId);
        if (e3Var == null) {
            e3Var = new com.json.e3();
            map.put(advertiserBundleId, e3Var);
        }
        e3Var.a(record.a(new com.json.pn()));
    }

    @Override // com.json.te
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject a(com.json.at mode) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, com.json.e3> entry : this.advertiserBundlesHistory.entrySet()) {
            java.lang.String key = entry.getKey();
            org.json.JSONArray jSONArrayA = entry.getValue().a(mode);
            if (jSONArrayA.length() > 0) {
                jSONObject.put(key, jSONArrayA);
            }
        }
        return jSONObject;
    }
}
