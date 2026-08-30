package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/e2;", "Lcom/ironsource/bt;", "Lorg/json/JSONObject;", "Lcom/ironsource/zs;", "Lcom/ironsource/c2;", "record", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/at;", com.ironsource.y8.a.t, "b", "", "", "Lcom/ironsource/qn;", "Ljava/util/Map;", "networkInstancesHistory", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class e2 implements com.json.bt<org.json.JSONObject>, com.json.zs<com.json.c2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.Map<java.lang.String, com.json.qn> networkInstancesHistory = new java.util.LinkedHashMap();

    @Override // com.json.zs
    public void a(com.json.c2 record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "record");
        java.lang.String networkInstanceId = record.getNetworkInstanceId();
        java.util.Map<java.lang.String, com.json.qn> map = this.networkInstancesHistory;
        com.json.qn qnVar = map.get(networkInstanceId);
        if (qnVar == null) {
            qnVar = new com.json.qn();
            map.put(networkInstanceId, qnVar);
        }
        qnVar.a(record.a(new com.json.d2()));
    }

    @Override // com.json.te
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject a(com.json.at mode) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, com.json.qn> entry : this.networkInstancesHistory.entrySet()) {
            java.lang.String key = entry.getKey();
            org.json.JSONObject jSONObjectA = entry.getValue().a(mode);
            if (jSONObjectA.length() > 0) {
                jSONObject.put(kotlin.text.StringsKt.substringAfterLast$default(key, "_", (java.lang.String) null, 2, (java.lang.Object) null), jSONObjectA);
            }
        }
        return jSONObject;
    }
}
