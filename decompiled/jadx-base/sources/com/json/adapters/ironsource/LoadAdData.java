package com.json.adapters.ironsource;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ironsource/adapters/ironsource/LoadAdData;", "", "adData", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "localAdData", "adUnitId", "", "isMultipleAdObjectsFlow", "", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LoadAdData {
    private final org.json.JSONObject localAdData;

    /* JADX WARN: Multi-variable type inference failed */
    public LoadAdData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public LoadAdData(org.json.JSONObject jSONObject) {
        this.localAdData = jSONObject == null ? new org.json.JSONObject() : jSONObject;
    }

    public /* synthetic */ LoadAdData(org.json.JSONObject jSONObject, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jSONObject);
    }

    public final java.lang.String adUnitId() {
        java.lang.String it = this.localAdData.optString("adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final boolean isMultipleAdObjectsFlow() {
        return this.localAdData.optBoolean("isMultipleAdUnits", false);
    }
}
