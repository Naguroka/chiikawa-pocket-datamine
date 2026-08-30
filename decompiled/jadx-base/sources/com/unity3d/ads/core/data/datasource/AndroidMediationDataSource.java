package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidMediationDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidMediationDataSource;", "Lcom/unity3d/ads/core/data/datasource/MediationDataSource;", "publicStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "(Lcom/unity3d/services/core/misc/JsonStorage;)V", "name", "", "getName", "()Ljava/lang/String;", "version", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidMediationDataSource implements com.unity3d.ads.core.data.datasource.MediationDataSource {
    private static final java.lang.String MEDIATION_NAME = "name";
    public static final java.lang.String MEDIATION_NAME_KEY = "mediation.name.value";
    private static final java.lang.String MEDIATION_STORAGE_NAME = "mediation";
    private static final java.lang.String MEDIATION_VALUE = "value";
    private static final java.lang.String MEDIATION_VERSION = "version";
    public static final java.lang.String MEDIATION_VERSION_KEY = "mediation.version.value";
    private final com.unity3d.services.core.misc.JsonStorage publicStorage;

    public AndroidMediationDataSource(com.unity3d.services.core.misc.JsonStorage publicStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicStorage, "publicStorage");
        this.publicStorage = publicStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    public java.lang.String getName() {
        return (java.lang.String) this.publicStorage.get(MEDIATION_NAME_KEY);
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    public java.lang.String getVersion() {
        return (java.lang.String) this.publicStorage.get(MEDIATION_VERSION_KEY);
    }
}
