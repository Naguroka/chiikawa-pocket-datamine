package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidKnownStore.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidKnownStore;", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "GOOGLE", "GOOGLE_MARKET", "AMAZON", "SAMSUNG", "XIAOMI", "HUAWEI", "OPPO", "VIVO", "UNKNOWN", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum AndroidKnownStore {
    GOOGLE("com.android.vending"),
    GOOGLE_MARKET(com.json.zo.f3623a),
    AMAZON("com.amazon.venezia"),
    SAMSUNG("com.sec.android.app.samsungapps"),
    XIAOMI("com.xiaomi.market"),
    HUAWEI("com.huawei.appmarket"),
    OPPO("com.oppo.market"),
    VIVO("com.bbk.appstore"),
    UNKNOWN("unknown");

    private final java.lang.String packageName;

    AndroidKnownStore(java.lang.String str) {
        this.packageName = str;
    }

    public final java.lang.String getPackageName() {
        return this.packageName;
    }
}
