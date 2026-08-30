package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: CommonSetInitializationState.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonSetInitializationState;", "Lcom/unity3d/ads/core/domain/SetInitializationState;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "", "state", "Lcom/unity3d/ads/core/data/model/InitializationState;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonSetInitializationState implements com.unity3d.ads.core.domain.SetInitializationState {
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public CommonSetInitializationState(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.SetInitializationState
    public void invoke(com.unity3d.ads.core.data.model.InitializationState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        this.sessionRepository.setInitializationState(state);
    }
}
