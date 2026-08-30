package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: CommonGetAdPlayer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetAdPlayer;", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "executeAdViewerRequest", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "invoke", "Lcom/unity3d/ads/adplayer/AdPlayer;", "webviewBridge", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "webviewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "opportunityId", "Lcom/google/protobuf/ByteString;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonGetAdPlayer implements com.unity3d.ads.core.domain.GetAdPlayer {
    private final kotlinx.coroutines.CoroutineScope adPlayerScope;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.ExecuteAdViewerRequest executeAdViewerRequest;
    private final com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public CommonGetAdPlayer(com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.domain.ExecuteAdViewerRequest executeAdViewerRequest, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, kotlinx.coroutines.CoroutineScope adPlayerScope, com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executeAdViewerRequest, "executeAdViewerRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.executeAdViewerRequest = executeAdViewerRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.defaultDispatcher = defaultDispatcher;
        this.adPlayerScope = adPlayerScope;
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayer
    public com.unity3d.ads.adplayer.AdPlayer invoke(com.unity3d.ads.adplayer.WebViewBridge webviewBridge, com.unity3d.ads.adplayer.AndroidWebViewContainer webviewContainer, com.google.protobuf.ByteString opportunityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webviewBridge, "webviewBridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webviewContainer, "webviewContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer = new com.unity3d.ads.adplayer.WebViewAdPlayer(webviewBridge, this.deviceInfoRepository, this.sessionRepository, this.executeAdViewerRequest, this.defaultDispatcher, this.sendDiagnosticEvent, webviewContainer, this.adPlayerScope);
        if (com.unity3d.services.banners.BannerViewCache.getInstance().getBannerView(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toUUID(opportunityId).toString()) == null) {
            return new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer(webViewAdPlayer, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859String(opportunityId), webviewContainer, this.deviceInfoRepository, this.sessionRepository, this.openMeasurementRepository);
        }
        return new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859String(opportunityId), webviewContainer, this.openMeasurementRepository);
    }
}
