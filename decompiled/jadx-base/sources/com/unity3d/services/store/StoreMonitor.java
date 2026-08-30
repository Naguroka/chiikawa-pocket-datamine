package com.unity3d.services.store;

/* JADX INFO: compiled from: StoreMonitor.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J \u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0019J2\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!J \u0010\"\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010#\u001a\u00020$J&\u0010%\u001a\u00020\u000f2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00130'j\b\u0012\u0004\u0012\u00020\u0013`(2\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/unity3d/services/store/StoreMonitor;", "", "storeExceptionHandler", "Lcom/unity3d/services/store/core/StoreExceptionHandler;", "(Lcom/unity3d/services/store/core/StoreExceptionHandler;)V", "_isInitialized", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isInitialized", "()Z", "storeBilling", "Lcom/unity3d/services/store/gpbl/StoreBilling;", "storeLifecycleListener", "Lcom/unity3d/services/store/core/StoreLifecycleListener;", "getPurchaseHistory", "", "operationId", "", "purchaseType", "", "maxPurchases", "purchaseHistoryResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/PurchaseHistoryResponseListener;", "getPurchases", "purchasesResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;", "getSkuDetails", "skuList", "", "skuDetailsResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/SkuDetailsResponseListener;", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "billingInitializationListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "isFeatureSupported", "featureSupportedListener", "Lcom/unity3d/services/store/gpbl/listeners/FeatureSupportedListener;", "startPurchaseTracking", "purchaseTypes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "storeEventListener", "Lcom/unity3d/services/store/gpbl/listeners/StoreEventListener;", "stopPurchaseTracking", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StoreMonitor {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isInitialized;
    private com.unity3d.services.store.gpbl.StoreBilling storeBilling;
    private final com.unity3d.services.store.core.StoreExceptionHandler storeExceptionHandler;
    private com.unity3d.services.store.core.StoreLifecycleListener storeLifecycleListener;

    public StoreMonitor(com.unity3d.services.store.core.StoreExceptionHandler storeExceptionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeExceptionHandler, "storeExceptionHandler");
        this.storeExceptionHandler = storeExceptionHandler;
        this._isInitialized = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
    }

    public final boolean isInitialized() {
        return this._isInitialized.getValue().booleanValue();
    }

    public final void initialize(com.unity3d.services.store.gpbl.listeners.BillingInitializationListener billingInitializationListener) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        com.unity3d.services.store.gpbl.StoreBilling storeBilling = new com.unity3d.services.store.gpbl.StoreBilling(com.unity3d.services.core.properties.ClientProperties.getApplicationContext(), billingInitializationListener);
        this.storeBilling = storeBilling;
        storeBilling.initialize(billingInitializationListener);
        this._isInitialized.setValue(true);
    }

    public final int isFeatureSupported(int operationId, java.lang.String purchaseType, com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener featureSupportedListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSupportedListener, "featureSupportedListener");
        int iIsFeatureSupported = -1;
        try {
            com.unity3d.services.store.gpbl.StoreBilling storeBilling = this.storeBilling;
            iIsFeatureSupported = storeBilling != null ? storeBilling.isFeatureSupported(purchaseType) : -1;
            featureSupportedListener.onFeatureSupported(iIsFeatureSupported);
        } catch (java.lang.Exception e) {
            this.storeExceptionHandler.handleStoreException(com.unity3d.services.store.StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_ERROR, operationId, e);
        }
        return iIsFeatureSupported;
    }

    public final void getPurchases(int operationId, java.lang.String purchaseType, com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener purchasesResponseListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchasesResponseListener, "purchasesResponseListener");
        try {
            com.unity3d.services.store.gpbl.StoreBilling storeBilling = this.storeBilling;
            if (storeBilling == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            if (storeBilling != null) {
                storeBilling.getPurchases(purchaseType, purchasesResponseListener);
            }
        } catch (java.lang.Exception e) {
            this.storeExceptionHandler.handleStoreException(com.unity3d.services.store.StoreEvent.PURCHASES_REQUEST_ERROR, operationId, e);
        }
    }

    public final void getPurchaseHistory(int operationId, java.lang.String purchaseType, int maxPurchases, com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseHistoryResponseListener, "purchaseHistoryResponseListener");
        try {
            com.unity3d.services.store.gpbl.StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getPurchaseHistory(purchaseType, maxPurchases, purchaseHistoryResponseListener);
            }
        } catch (java.lang.Exception e) {
            this.storeExceptionHandler.handleStoreException(com.unity3d.services.store.StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_ERROR, operationId, e);
        }
    }

    public final void getSkuDetails(int operationId, java.lang.String purchaseType, java.util.List<java.lang.String> skuList, com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener skuDetailsResponseListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skuDetailsResponseListener, "skuDetailsResponseListener");
        try {
            com.unity3d.services.store.gpbl.StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getSkuDetails(purchaseType, skuList, skuDetailsResponseListener);
            }
        } catch (java.lang.Exception e) {
            this.storeExceptionHandler.handleStoreException(com.unity3d.services.store.StoreEvent.SKU_DETAILS_LIST_REQUEST_ERROR, operationId, e);
        }
    }

    public final void startPurchaseTracking(java.util.ArrayList<java.lang.String> purchaseTypes, com.unity3d.services.store.gpbl.listeners.StoreEventListener storeEventListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseTypes, "purchaseTypes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeEventListener, "storeEventListener");
        if (this.storeLifecycleListener != null) {
            stopPurchaseTracking();
        }
        com.unity3d.services.store.gpbl.StoreBilling storeBilling = this.storeBilling;
        kotlin.jvm.internal.Intrinsics.checkNotNull(storeBilling);
        this.storeLifecycleListener = new com.unity3d.services.store.core.StoreLifecycleListener(purchaseTypes, storeBilling, storeEventListener);
        com.unity3d.services.core.properties.ClientProperties.getApplication().registerActivityLifecycleCallbacks(this.storeLifecycleListener);
    }

    public final void stopPurchaseTracking() {
        if (this.storeLifecycleListener != null) {
            com.unity3d.services.core.properties.ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(this.storeLifecycleListener);
            this.storeLifecycleListener = null;
        }
    }
}
