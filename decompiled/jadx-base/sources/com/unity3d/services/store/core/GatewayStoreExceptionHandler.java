package com.unity3d.services.store.core;

/* JADX INFO: compiled from: GatewayStoreExceptionHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/unity3d/services/store/core/GatewayStoreExceptionHandler;", "Lcom/unity3d/services/store/core/StoreExceptionHandler;", "()V", "handleStoreException", "", "storeEvent", "Lcom/unity3d/services/store/StoreEvent;", "operationId", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GatewayStoreExceptionHandler implements com.unity3d.services.store.core.StoreExceptionHandler {
    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(com.unity3d.services.store.StoreEvent storeEvent, int operationId, java.lang.Exception exception) throws java.lang.Exception {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeEvent, "storeEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
        throw exception;
    }
}
