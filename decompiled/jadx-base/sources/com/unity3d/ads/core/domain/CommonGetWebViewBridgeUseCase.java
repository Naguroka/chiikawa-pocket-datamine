package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: CommonGetWebViewBridgeUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetWebViewBridgeUseCase;", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "invoke", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "webViewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonGetWebViewBridgeUseCase implements com.unity3d.ads.core.domain.GetWebViewBridgeUseCase {
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonGetWebViewBridgeUseCase() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CommonGetWebViewBridgeUseCase(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
    }

    public /* synthetic */ CommonGetWebViewBridgeUseCase(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlinx.coroutines.Dispatchers.getDefault() : coroutineDispatcher);
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    public com.unity3d.ads.adplayer.WebViewBridge invoke(com.unity3d.ads.adplayer.AndroidWebViewContainer webViewContainer, kotlinx.coroutines.CoroutineScope adPlayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        return new com.unity3d.ads.adplayer.CommonWebViewBridge(this.dispatcher, webViewContainer, adPlayerScope);
    }
}
