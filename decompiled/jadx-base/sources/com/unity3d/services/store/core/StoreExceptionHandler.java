package com.unity3d.services.store.core;

/* JADX INFO: compiled from: StoreExceptionHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH&¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/store/core/StoreExceptionHandler;", "", "handleStoreException", "", "storeEvent", "Lcom/unity3d/services/store/StoreEvent;", "operationId", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface StoreExceptionHandler {
    void handleStoreException(com.unity3d.services.store.StoreEvent storeEvent, int operationId, java.lang.Exception exception);
}
