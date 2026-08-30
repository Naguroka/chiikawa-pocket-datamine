package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: MediationRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/repository/MediationRepository;", "", "mediationProvider", "Lkotlin/Function0;", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "getMediationProvider", "()Lkotlin/jvm/functions/Function0;", "name", "", "getName", "()Ljava/lang/String;", "version", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MediationRepository {
    kotlin.jvm.functions.Function0<gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider> getMediationProvider();

    java.lang.String getName();

    java.lang.String getVersion();
}
