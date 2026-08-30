package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J+\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\tH&¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/AdapterNetworkData;", "", "allData", "Lorg/json/JSONObject;", "dataByKeyIgnoreCase", "T", "desiredKey", "", "valueType", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "networkDataByAdUnit", "adUnit", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AdapterNetworkData {
    org.json.JSONObject allData();

    <T> T dataByKeyIgnoreCase(java.lang.String desiredKey, java.lang.Class<T> valueType);

    org.json.JSONObject networkDataByAdUnit(com.ironsource.mediationsdk.IronSource.AD_UNIT adUnit);
}
