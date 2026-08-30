package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetClientInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\t\u001a\u00020\nH\u0096\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetClientInfo;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "mediationRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "omidManager", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;Lcom/unity3d/ads/core/data/manager/OmidManager;)V", "invoke", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetClientInfo implements com.unity3d.ads.core.domain.GetClientInfo {
    private final com.unity3d.ads.core.data.repository.MediationRepository mediationRepository;
    private final com.unity3d.ads.core.data.manager.OmidManager omidManager;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidGetClientInfo(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.MediationRepository mediationRepository, com.unity3d.ads.core.data.manager.OmidManager omidManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationRepository, "mediationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omidManager, "omidManager");
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
        this.omidManager = omidManager;
    }

    @Override // com.unity3d.ads.core.domain.GetClientInfo
    public gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo invoke() {
        gatewayprotocol.v1.ClientInfoKt.Dsl.Companion companion = gatewayprotocol.v1.ClientInfoKt.Dsl.INSTANCE;
        gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder builderNewBuilder = gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.ClientInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setSdkVersion(41205);
        dsl_create.setSdkVersionName("4.12.5");
        java.lang.String gameId = this.sessionRepository.getGameId();
        if (gameId != null) {
            dsl_create.setGameId(gameId);
        }
        dsl_create.setTest(this.sessionRepository.isTestModeEnabled());
        dsl_create.setPlatform(gatewayprotocol.v1.ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
        dsl_create.setMediationProvider(this.mediationRepository.getMediationProvider().invoke());
        java.lang.String name = this.mediationRepository.getName();
        if (name != null && dsl_create.getMediationProvider() == gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
            dsl_create.setCustomMediationName(name);
        }
        java.lang.String version = this.mediationRepository.getVersion();
        if (version != null) {
            dsl_create.setMediationVersion(version);
        }
        dsl_create.setOmidVersion(this.omidManager.getVersion());
        dsl_create.setOmidPartnerVersion("1");
        dsl_create.setSdkDevelopmentPlatform(com.unity3d.services.core.properties.MadeWithUnityDetector.isMadeWithUnity() ? "Unity" : "");
        return dsl_create._build();
    }
}
