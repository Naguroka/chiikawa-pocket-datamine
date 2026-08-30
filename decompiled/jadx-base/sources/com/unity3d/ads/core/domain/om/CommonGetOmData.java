package com.unity3d.ads.core.domain.om;

/* JADX INFO: compiled from: CommonGetOmData.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/om/CommonGetOmData;", "Lcom/unity3d/ads/core/domain/om/GetOmData;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "(Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "invoke", "Lcom/unity3d/ads/core/data/model/OMData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonGetOmData implements com.unity3d.ads.core.domain.om.GetOmData {
    private final com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository;

    public CommonGetOmData(com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.om.GetOmData
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMData> continuation) {
        return this.openMeasurementRepository.getOmData();
    }
}
