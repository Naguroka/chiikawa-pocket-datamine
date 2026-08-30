package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: AndroidMediationRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidMediationRepository;", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "mediationDataSource", "Lcom/unity3d/ads/core/data/datasource/MediationDataSource;", "(Lcom/unity3d/ads/core/data/datasource/MediationDataSource;)V", "mediationProvider", "Lkotlin/Function0;", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "getMediationProvider", "()Lkotlin/jvm/functions/Function0;", "name", "", "getName", "()Ljava/lang/String;", "version", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidMediationRepository implements com.unity3d.ads.core.data.repository.MediationRepository {
    private final com.unity3d.ads.core.data.datasource.MediationDataSource mediationDataSource;

    public AndroidMediationRepository(com.unity3d.ads.core.data.datasource.MediationDataSource mediationDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationDataSource, "mediationDataSource");
        this.mediationDataSource = mediationDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public java.lang.String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public java.lang.String getVersion() {
        return this.mediationDataSource.getVersion();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public kotlin.jvm.functions.Function0<gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider> getMediationProvider() {
        return new kotlin.jvm.functions.Function0<gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider>() { // from class: com.unity3d.ads.core.data.repository.AndroidMediationRepository$mediationProvider$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider invoke() {
                gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider mediationProvider;
                java.lang.String name = this.this$0.getName();
                if (name != null) {
                    if (kotlin.text.StringsKt.startsWith$default(name, "AppLovinSdk_", false, 2, (java.lang.Object) null)) {
                        mediationProvider = gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
                    } else if (kotlin.text.StringsKt.equals(name, "AdMob", true)) {
                        mediationProvider = gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB;
                    } else if (kotlin.text.StringsKt.equals(name, "MAX", true)) {
                        mediationProvider = gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
                    } else {
                        mediationProvider = kotlin.text.StringsKt.equals(name, "ironSource", true) ? gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
                    }
                    if (mediationProvider != null) {
                        return mediationProvider;
                    }
                }
                return gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
            }
        };
    }
}
