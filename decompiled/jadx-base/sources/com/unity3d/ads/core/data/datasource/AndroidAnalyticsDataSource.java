package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidAnalyticsDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidAnalyticsDataSource;", "Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;", "()V", "userId", "", "getUserId", "()Ljava/lang/String;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidAnalyticsDataSource implements com.unity3d.ads.core.data.datasource.AnalyticsDataSource {
    @Override // com.unity3d.ads.core.data.datasource.AnalyticsDataSource
    public java.lang.String getUserId() {
        return com.unity3d.services.core.preferences.AndroidPreferences.getString(com.unity3d.services.core.properties.ClientProperties.getAppName() + ".v2.playerprefs", "unity.cloud_userid");
    }
}
