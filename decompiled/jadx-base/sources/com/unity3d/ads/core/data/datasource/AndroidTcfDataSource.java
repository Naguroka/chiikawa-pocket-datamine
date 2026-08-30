package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidTcfDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidTcfDataSource;", "Lcom/unity3d/ads/core/data/datasource/TcfDataSource;", "()V", "tcfString", "", "getTcfString", "()Ljava/lang/String;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidTcfDataSource implements com.unity3d.ads.core.data.datasource.TcfDataSource {
    public static final java.lang.String TCF_TCSTRING_KEY = "IABTCF_TCString";

    @Override // com.unity3d.ads.core.data.datasource.TcfDataSource
    public java.lang.String getTcfString() {
        return com.unity3d.services.core.preferences.AndroidPreferences.getString(com.unity3d.services.core.properties.ClientProperties.getAppName() + "_settings", TCF_TCSTRING_KEY);
    }
}
