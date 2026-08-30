package com.unity3d.ads.core.configuration;

/* JADX INFO: compiled from: AlternativeFlowReader.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\tH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "", "configurationReader", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/services/core/configuration/ConfigurationReader;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "isAlternativeFlowEnabled", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isAlternativeFlowRead", "invoke", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AlternativeFlowReader {
    private final com.unity3d.services.core.configuration.ConfigurationReader configurationReader;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isAlternativeFlowEnabled;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isAlternativeFlowRead;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AlternativeFlowReader(com.unity3d.services.core.configuration.ConfigurationReader configurationReader, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationReader, "configurationReader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.configurationReader = configurationReader;
        this.sessionRepository = sessionRepository;
        this.isAlternativeFlowRead = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this.isAlternativeFlowEnabled = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
    }

    public final boolean invoke() {
        if (!this.isAlternativeFlowRead.getValue().booleanValue()) {
            this.isAlternativeFlowEnabled.setValue(java.lang.Boolean.valueOf(this.configurationReader.getCurrentConfiguration().getExperiments().isBoldSdkNextSessionEnabled() || this.sessionRepository.getNativeConfiguration().getFeatureFlags().getBoldSdkNextSessionEnabled()));
            this.isAlternativeFlowRead.setValue(true);
        }
        return this.isAlternativeFlowEnabled.getValue().booleanValue();
    }
}
