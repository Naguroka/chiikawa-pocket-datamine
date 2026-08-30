package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: AndroidLegacyUserConsentRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidLegacyUserConsentRepository;", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "legacyUserConsentDataSource", "Lcom/unity3d/ads/core/data/datasource/LegacyUserConsentDataSource;", "(Lcom/unity3d/ads/core/data/datasource/LegacyUserConsentDataSource;)V", "legacyFlowUserConsent", "", "getLegacyFlowUserConsent", "()Ljava/lang/String;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidLegacyUserConsentRepository implements com.unity3d.ads.core.data.repository.LegacyUserConsentRepository {
    private final com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource legacyUserConsentDataSource;

    public AndroidLegacyUserConsentRepository(com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource legacyUserConsentDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyUserConsentDataSource, "legacyUserConsentDataSource");
        this.legacyUserConsentDataSource = legacyUserConsentDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.LegacyUserConsentRepository
    public java.lang.String getLegacyFlowUserConsent() {
        return this.legacyUserConsentDataSource.getPrivacyData();
    }
}
