package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: AdPlayerScope.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayerScope;", "Lkotlinx/coroutines/CoroutineScope;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdPlayerScope implements kotlinx.coroutines.CoroutineScope {
    private final /* synthetic */ kotlinx.coroutines.CoroutineScope $$delegate_0;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher;

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public AdPlayerScope(kotlinx.coroutines.CoroutineDispatcher defaultDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.defaultDispatcher = defaultDispatcher;
        this.$$delegate_0 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(defaultDispatcher);
    }
}
