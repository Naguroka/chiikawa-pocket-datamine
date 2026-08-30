package com.unity3d.services.store.gpbl.proxies;

/* JADX INFO: loaded from: classes6.dex */
public class PurchaseHistoryResponseListenerProxy extends com.unity3d.services.core.reflection.GenericListenerProxy {
    private static final java.lang.String onPurchaseHistoryResponseMethodName = "onPurchaseHistoryResponse";
    private int _maxPurchases;
    private com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener purchaseHistoryResponseListener;

    public PurchaseHistoryResponseListenerProxy(com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener purchaseHistoryResponseListener, int i) {
        this.purchaseHistoryResponseListener = purchaseHistoryResponseListener;
        this._maxPurchases = i;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public java.lang.Class<?> getProxyClass() throws java.lang.ClassNotFoundException {
        return getProxyListenerClass();
    }

    public static java.lang.Class<?> getProxyListenerClass() throws java.lang.ClassNotFoundException {
        return java.lang.Class.forName("com.android.billingclient.api.PurchaseHistoryResponseListener");
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        if (method.getName().equals(onPurchaseHistoryResponseMethodName)) {
            onPurchaseHistoryResponse(objArr[0], (java.util.List) objArr[1]);
            return null;
        }
        return super.invoke(obj, method, objArr);
    }

    public void onPurchaseHistoryResponse(java.lang.Object obj, java.util.List<java.lang.Object> list) {
        java.util.ArrayList arrayList;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (int i = 0; i < this._maxPurchases && i < list.size(); i++) {
                arrayList.add(new com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge(list.get(i)));
            }
        } else {
            arrayList = null;
        }
        com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener purchaseHistoryResponseListener = this.purchaseHistoryResponseListener;
        if (purchaseHistoryResponseListener != null) {
            purchaseHistoryResponseListener.onPurchaseHistoryUpdated(new com.unity3d.services.store.gpbl.bridges.BillingResultBridge(obj), arrayList);
        }
    }
}
