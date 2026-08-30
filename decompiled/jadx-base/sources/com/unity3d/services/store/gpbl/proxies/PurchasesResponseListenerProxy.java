package com.unity3d.services.store.gpbl.proxies;

/* JADX INFO: loaded from: classes6.dex */
public class PurchasesResponseListenerProxy extends com.unity3d.services.core.reflection.GenericListenerProxy {
    private static final java.lang.String onQueryPurchasesResponseMethodName = "onQueryPurchasesResponse";
    private com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener purchasesResponseListener;

    public PurchasesResponseListenerProxy(com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener purchasesResponseListener) {
        this.purchasesResponseListener = purchasesResponseListener;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public java.lang.Class<?> getProxyClass() throws java.lang.ClassNotFoundException {
        return getProxyListenerClass();
    }

    public com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener getPurchasesResponseListener() {
        return this.purchasesResponseListener;
    }

    public static java.lang.Class<?> getProxyListenerClass() throws java.lang.ClassNotFoundException {
        return java.lang.Class.forName("com.android.billingclient.api.PurchasesResponseListener");
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        if (method.getName().equals(onQueryPurchasesResponseMethodName)) {
            onQueryPurchasesResponse(objArr[0], (java.util.List) objArr[1]);
            return null;
        }
        return super.invoke(obj, method, objArr);
    }

    public void onQueryPurchasesResponse(java.lang.Object obj, java.util.List<java.lang.Object> list) {
        java.util.ArrayList arrayList;
        com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResultBridge = new com.unity3d.services.store.gpbl.bridges.BillingResultBridge(obj);
        if (list != null) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.unity3d.services.store.gpbl.bridges.PurchaseBridge(it.next()));
            }
        } else {
            arrayList = null;
        }
        com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener purchasesResponseListener = this.purchasesResponseListener;
        if (purchasesResponseListener != null) {
            purchasesResponseListener.onPurchaseResponse(billingResultBridge, arrayList);
        }
    }
}
