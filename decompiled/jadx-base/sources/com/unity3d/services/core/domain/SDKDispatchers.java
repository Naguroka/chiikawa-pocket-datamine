package com.unity3d.services.core.domain;

/* JADX INFO: compiled from: SDKDispatchers.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/core/domain/SDKDispatchers;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "()V", "default", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "io", "getIo", com.ironsource.y8.h.Z, "getMain", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SDKDispatchers implements com.unity3d.services.core.domain.ISDKDispatchers {
    private final kotlinx.coroutines.CoroutineDispatcher io = kotlinx.coroutines.Dispatchers.getIO();
    private final kotlinx.coroutines.CoroutineDispatcher default = kotlinx.coroutines.Dispatchers.getDefault();
    private final kotlinx.coroutines.CoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public kotlinx.coroutines.CoroutineDispatcher getIo() {
        return this.io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public kotlinx.coroutines.CoroutineDispatcher getDefault() {
        return this.default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public kotlinx.coroutines.CoroutineDispatcher getMain() {
        return this.main;
    }
}
