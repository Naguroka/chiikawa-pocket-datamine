package com.unity3d.services.store.core;

/* JADX INFO: compiled from: WebViewStoreExceptionHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0002J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J,\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/unity3d/services/store/core/WebViewStoreExceptionHandler;", "Lcom/unity3d/services/store/core/StoreExceptionHandler;", "_webViewErrorHandler", "Lcom/unity3d/services/ads/gmascar/handlers/WebViewErrorHandler;", "(Lcom/unity3d/services/ads/gmascar/handlers/WebViewErrorHandler;)V", "getStoreError", "Lcom/unity3d/services/store/StoreError;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "handleStoreException", "", "storeEvent", "Lcom/unity3d/services/store/StoreEvent;", "operationId", "", "sendErrorToWebView", "storeError", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebViewStoreExceptionHandler implements com.unity3d.services.store.core.StoreExceptionHandler {
    private final com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler _webViewErrorHandler;

    public WebViewStoreExceptionHandler(com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler _webViewErrorHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(_webViewErrorHandler, "_webViewErrorHandler");
        this._webViewErrorHandler = _webViewErrorHandler;
    }

    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(com.unity3d.services.store.StoreEvent storeEvent, int operationId, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeEvent, "storeEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
        sendErrorToWebView(storeEvent, getStoreError(exception), operationId, exception);
    }

    private final void sendErrorToWebView(com.unity3d.services.store.StoreEvent storeEvent, com.unity3d.services.store.StoreError storeError, int operationId, java.lang.Exception exception) {
        this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.WebViewAdsError) new com.unity3d.services.store.core.StoreWebViewError(storeEvent, exception.getMessage(), java.lang.Integer.valueOf(operationId), storeError, exception.getMessage()));
    }

    private final com.unity3d.services.store.StoreError getStoreError(java.lang.Exception exception) {
        if (exception instanceof java.lang.NoSuchMethodException) {
            return com.unity3d.services.store.StoreError.NO_SUCH_METHOD;
        }
        if (exception instanceof java.lang.IllegalAccessException) {
            return com.unity3d.services.store.StoreError.ILLEGAL_ACCESS;
        }
        if (exception instanceof org.json.JSONException) {
            return com.unity3d.services.store.StoreError.JSON_ERROR;
        }
        if (exception instanceof java.lang.reflect.InvocationTargetException) {
            return com.unity3d.services.store.StoreError.INVOCATION_TARGET;
        }
        return exception instanceof java.lang.ClassNotFoundException ? com.unity3d.services.store.StoreError.CLASS_NOT_FOUND : com.unity3d.services.store.StoreError.UNKNOWN_ERROR;
    }
}
