package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: CommonGetAdObject.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetAdObject;", "Lcom/unity3d/ads/core/domain/GetAdObject;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "(Lcom/unity3d/ads/core/data/repository/AdRepository;)V", "invoke", "Lcom/unity3d/ads/core/data/model/AdObject;", "opportunityId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonGetAdObject implements com.unity3d.ads.core.domain.GetAdObject {
    private final com.unity3d.ads.core.data.repository.AdRepository adRepository;

    public CommonGetAdObject(com.unity3d.ads.core.data.repository.AdRepository adRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        this.adRepository = adRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetAdObject
    public java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.AdObject> continuation) {
        return this.adRepository.getAd(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859ByteString(str), continuation);
    }
}
