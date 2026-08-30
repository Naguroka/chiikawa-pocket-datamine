package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: AndroidDeveloperConsentRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidDeveloperConsentRepository;", "Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;", "developerConsentDataSource", "Lcom/unity3d/ads/core/data/datasource/DeveloperConsentDataSource;", "(Lcom/unity3d/ads/core/data/datasource/DeveloperConsentDataSource;)V", "developerConsent", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "getDeveloperConsent", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidDeveloperConsentRepository implements com.unity3d.ads.core.data.repository.DeveloperConsentRepository {
    private final gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent developerConsent;

    public AndroidDeveloperConsentRepository(com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource developerConsentDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(developerConsentDataSource, "developerConsentDataSource");
        this.developerConsent = developerConsentDataSource.getDeveloperConsent();
    }

    @Override // com.unity3d.ads.core.data.repository.DeveloperConsentRepository
    public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        return this.developerConsent;
    }
}
