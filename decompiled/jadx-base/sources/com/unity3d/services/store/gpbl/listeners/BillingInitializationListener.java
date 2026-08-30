package com.unity3d.services.store.gpbl.listeners;

/* JADX INFO: compiled from: BillingInitializationListener.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "Lcom/unity3d/services/store/gpbl/listeners/PurchaseUpdatedResponseListener;", "onIsAlreadyInitialized", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BillingInitializationListener extends com.unity3d.services.store.gpbl.listeners.BillingClientStateListener, com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener {
    void onIsAlreadyInitialized();
}
