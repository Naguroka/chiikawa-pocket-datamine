package com.unity3d.ads.core.domain.om;

/* JADX INFO: compiled from: CommonIsOMActivated.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/om/CommonIsOMActivated;", "Lcom/unity3d/ads/core/domain/om/IsOMActivated;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "(Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "invoke", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonIsOMActivated implements com.unity3d.ads.core.domain.om.IsOMActivated {
    private final com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository;

    public CommonIsOMActivated(com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.om.IsOMActivated
    public boolean invoke() {
        return this.openMeasurementRepository.isOMActive();
    }
}
