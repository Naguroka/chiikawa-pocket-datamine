package com.unity3d.services.store;

/* JADX INFO: compiled from: WebViewStoreEventListener.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J \u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016J \u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015H\u0016J \u0010\u001a\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015H\u0016J \u0010\u001b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/unity3d/services/store/WebViewStoreEventListener;", "Lcom/unity3d/services/store/gpbl/listeners/StoreEventListener;", "operationId", "", "storeWebViewEventSender", "Lcom/unity3d/services/store/StoreWebViewEventSender;", "isLifecycleListener", "", "(ILcom/unity3d/services/store/StoreWebViewEventSender;Z)V", "getOperationId", "()I", "onBillingServiceDisconnected", "", "onBillingSetupFinished", "billingResult", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "onFeatureSupported", "featureSupported", "onIsAlreadyInitialized", "onPurchaseHistoryUpdated", "purchaseHistoryRecordList", "", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseHistoryRecordBridge;", "onPurchaseResponse", "purchases", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseBridge;", "onPurchaseUpdated", "onSkuDetailsUpdated", "skuDetailsList", "Lcom/unity3d/services/store/gpbl/bridges/SkuDetailsBridge;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebViewStoreEventListener implements com.unity3d.services.store.gpbl.listeners.StoreEventListener {
    private final boolean isLifecycleListener;
    private final int operationId;
    private final com.unity3d.services.store.StoreWebViewEventSender storeWebViewEventSender;

    public WebViewStoreEventListener(int i, com.unity3d.services.store.StoreWebViewEventSender storeWebViewEventSender, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeWebViewEventSender, "storeWebViewEventSender");
        this.operationId = i;
        this.storeWebViewEventSender = storeWebViewEventSender;
        this.isLifecycleListener = z;
    }

    public /* synthetic */ WebViewStoreEventListener(int i, com.unity3d.services.store.StoreWebViewEventSender storeWebViewEventSender, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, storeWebViewEventSender, (i2 & 4) != 0 ? false : z);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.StoreEventListener
    public int getOperationId() {
        return this.operationId;
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
    public void onIsAlreadyInitialized() {
        this.storeWebViewEventSender.send(com.unity3d.services.store.StoreEvent.INITIALIZATION_REQUEST_RESULT, java.lang.Integer.valueOf(com.unity3d.services.store.gpbl.BillingResultResponseCode.OK.getResponseCode()));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener
    public void onFeatureSupported(int featureSupported) {
        this.storeWebViewEventSender.send(com.unity3d.services.store.StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_RESULT, java.lang.Integer.valueOf(getOperationId()), java.lang.Integer.valueOf(featureSupported));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingSetupFinished(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (billingResult.getResponseCode() == com.unity3d.services.store.gpbl.BillingResultResponseCode.OK) {
            com.unity3d.services.store.StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            com.unity3d.services.store.StoreEvent storeEvent = com.unity3d.services.store.StoreEvent.INITIALIZATION_REQUEST_RESULT;
            com.unity3d.services.store.gpbl.BillingResultResponseCode responseCode = billingResult.getResponseCode();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(responseCode, "billingResult.responseCode");
            storeWebViewEventSender.send(storeEvent, responseCode);
            return;
        }
        com.unity3d.services.store.StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        com.unity3d.services.store.StoreEvent storeEvent2 = com.unity3d.services.store.StoreEvent.INITIALIZATION_REQUEST_FAILED;
        com.unity3d.services.store.gpbl.BillingResultResponseCode responseCode2 = billingResult.getResponseCode();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(responseCode2, "billingResult.responseCode");
        storeWebViewEventSender2.send(storeEvent2, responseCode2);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        this.storeWebViewEventSender.send(com.unity3d.services.store.StoreEvent.DISCONNECTED_RESULT, new java.lang.Object[0]);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener
    public void onPurchaseHistoryUpdated(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge> purchaseHistoryRecordList) {
        org.json.JSONArray jSONArray;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        com.unity3d.services.store.StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        com.unity3d.services.store.StoreEvent storeEvent = com.unity3d.services.store.StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_RESULT;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(getOperationId());
        com.unity3d.services.store.gpbl.BillingResultResponseCode responseCode = billingResult.getResponseCode();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(responseCode, "billingResult.responseCode");
        objArr[1] = responseCode;
        if (purchaseHistoryRecordList == null || (jSONArray = com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt.toJsonArray(purchaseHistoryRecordList)) == null) {
            jSONArray = new org.json.JSONArray();
        }
        objArr[2] = jSONArray;
        storeWebViewEventSender.send(storeEvent, objArr);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener
    public void onSkuDetailsUpdated(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge> skuDetailsList) {
        org.json.JSONArray jSONArray;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        com.unity3d.services.store.StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        com.unity3d.services.store.StoreEvent storeEvent = com.unity3d.services.store.StoreEvent.SKU_DETAILS_LIST_REQUEST_RESULT;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(getOperationId());
        if (skuDetailsList == null || (jSONArray = com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt.toJsonArray(skuDetailsList)) == null) {
            jSONArray = new org.json.JSONArray();
        }
        objArr[1] = jSONArray;
        storeWebViewEventSender.send(storeEvent, objArr);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
    public void onPurchaseResponse(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseBridge> purchases) {
        org.json.JSONArray jSONArray;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (getOperationId() != -1) {
            arrayList.add(java.lang.Integer.valueOf(getOperationId()));
        }
        if (billingResult.getResponseCode() == com.unity3d.services.store.gpbl.BillingResultResponseCode.OK) {
            if (purchases == null || (jSONArray = com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt.toJsonArray(purchases)) == null) {
                jSONArray = new org.json.JSONArray();
            }
            arrayList.add(jSONArray);
            com.unity3d.services.store.StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            com.unity3d.services.store.StoreEvent storeEvent = this.isLifecycleListener ? com.unity3d.services.store.StoreEvent.PURCHASES_ON_RESUME_RESULT : com.unity3d.services.store.StoreEvent.PURCHASES_REQUEST_RESULT;
            java.lang.Object[] array = arrayList.toArray(new java.lang.Object[0]);
            storeWebViewEventSender.send(storeEvent, java.util.Arrays.copyOf(array, array.length));
            return;
        }
        arrayList.add(billingResult.getResponseCode());
        com.unity3d.services.store.StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        com.unity3d.services.store.StoreEvent storeEvent2 = this.isLifecycleListener ? com.unity3d.services.store.StoreEvent.PURCHASES_ON_RESUME_ERROR : com.unity3d.services.store.StoreEvent.PURCHASES_REQUEST_ERROR;
        java.lang.Object[] array2 = arrayList.toArray(new java.lang.Object[0]);
        storeWebViewEventSender2.send(storeEvent2, java.util.Arrays.copyOf(array2, array2.length));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
    public void onPurchaseUpdated(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseBridge> purchases) {
        org.json.JSONArray jSONArray;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (billingResult.getResponseCode() == com.unity3d.services.store.gpbl.BillingResultResponseCode.OK) {
            com.unity3d.services.store.StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            com.unity3d.services.store.StoreEvent storeEvent = com.unity3d.services.store.StoreEvent.PURCHASES_UPDATED_RESULT;
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (purchases == null || (jSONArray = com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt.toJsonArray(purchases)) == null) {
                jSONArray = new org.json.JSONArray();
            }
            objArr[0] = jSONArray;
            storeWebViewEventSender.send(storeEvent, objArr);
            return;
        }
        com.unity3d.services.store.StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        com.unity3d.services.store.StoreEvent storeEvent2 = com.unity3d.services.store.StoreEvent.PURCHASES_UPDATED_ERROR;
        com.unity3d.services.store.gpbl.BillingResultResponseCode responseCode = billingResult.getResponseCode();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(responseCode, "billingResult.responseCode");
        storeWebViewEventSender2.send(storeEvent2, responseCode);
    }
}
