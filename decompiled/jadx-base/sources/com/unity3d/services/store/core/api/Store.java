package com.unity3d.services.store.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class Store {
    private static final com.unity3d.services.store.core.WebViewStoreExceptionHandler WEB_VIEW_STORE_EXCEPTION_HANDLER;
    private static final com.unity3d.services.store.core.StoreEventListenerFactory storeEventListenerFactory;
    private static final com.unity3d.services.store.StoreMonitor storeMonitor;

    static {
        com.unity3d.services.store.core.WebViewStoreExceptionHandler webViewStoreExceptionHandler = new com.unity3d.services.store.core.WebViewStoreExceptionHandler(new com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler());
        WEB_VIEW_STORE_EXCEPTION_HANDLER = webViewStoreExceptionHandler;
        storeEventListenerFactory = (com.unity3d.services.store.core.StoreEventListenerFactory) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.store.core.StoreEventListenerFactory.class);
        storeMonitor = new com.unity3d.services.store.StoreMonitor(webViewStoreExceptionHandler);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void initialize(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        try {
            storeMonitor.initialize(storeEventListenerFactory.invoke());
            webViewCallback.invoke(new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            webViewCallback.error(com.unity3d.services.store.StoreError.UNKNOWN_ERROR, e.getMessage(), e.getClass().getName());
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void startPurchaseTracking(org.json.JSONArray jSONArray, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (!storeMonitor.isInitialized()) {
            webViewCallback.error(com.unity3d.services.store.StoreError.NOT_INITIALIZED, new java.lang.Object[0]);
            return;
        }
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (org.json.JSONException e) {
                webViewCallback.error(com.unity3d.services.store.StoreError.JSON_ERROR, e.getMessage());
                return;
            }
        }
        storeMonitor.startPurchaseTracking(arrayList, storeEventListenerFactory.invoke(-1, true));
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void stopPurchaseTracking(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.store.StoreMonitor storeMonitor2 = storeMonitor;
        if (!storeMonitor2.isInitialized()) {
            webViewCallback.error(com.unity3d.services.store.StoreError.NOT_INITIALIZED, new java.lang.Object[0]);
        } else {
            storeMonitor2.stopPurchaseTracking();
            webViewCallback.invoke(new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void isFeatureSupported(final java.lang.Integer num, final java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (!storeMonitor.isInitialized()) {
            webViewCallback.error(com.unity3d.services.store.StoreError.NOT_INITIALIZED, new java.lang.Object[0]);
        } else {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.unity3d.services.store.core.api.Store$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.Integer num2 = num;
                    com.unity3d.services.store.core.api.Store.storeMonitor.isFeatureSupported(num2.intValue(), str, com.unity3d.services.store.core.api.Store.storeEventListenerFactory.invoke(num2.intValue()));
                }
            }).start();
            webViewCallback.invoke(new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getPurchases(java.lang.Integer num, java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.store.StoreMonitor storeMonitor2 = storeMonitor;
        if (!storeMonitor2.isInitialized()) {
            webViewCallback.error(com.unity3d.services.store.StoreError.NOT_INITIALIZED, new java.lang.Object[0]);
        } else {
            storeMonitor2.getPurchases(num.intValue(), str, storeEventListenerFactory.invoke(num.intValue()));
            webViewCallback.invoke(new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getPurchaseHistory(java.lang.Integer num, java.lang.String str, java.lang.Integer num2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.store.StoreMonitor storeMonitor2 = storeMonitor;
        if (!storeMonitor2.isInitialized()) {
            webViewCallback.error(com.unity3d.services.store.StoreError.NOT_INITIALIZED, new java.lang.Object[0]);
        } else {
            storeMonitor2.getPurchaseHistory(num.intValue(), str, num2.intValue(), storeEventListenerFactory.invoke(num.intValue()));
            webViewCallback.invoke(new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getSkuDetails(java.lang.Integer num, java.lang.String str, org.json.JSONArray jSONArray, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (!storeMonitor.isInitialized()) {
            webViewCallback.error(com.unity3d.services.store.StoreError.NOT_INITIALIZED, new java.lang.Object[0]);
            return;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            storeMonitor.getSkuDetails(num.intValue(), str, arrayList, storeEventListenerFactory.invoke(num.intValue()));
        } catch (org.json.JSONException e) {
            WEB_VIEW_STORE_EXCEPTION_HANDLER.handleStoreException(com.unity3d.services.store.StoreEvent.SKU_DETAILS_LIST_REQUEST_ERROR, num.intValue(), e);
        }
        webViewCallback.invoke(new java.lang.Object[0]);
    }
}
