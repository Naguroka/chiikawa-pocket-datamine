package com.unity3d.services.store.gpbl.proxies;

/* JADX INFO: loaded from: classes6.dex */
public class PurchaseUpdatedListenerProxy extends com.unity3d.services.core.reflection.GenericListenerProxy {
    private static final java.lang.String onPurchasesUpdatedMethodName = "onPurchasesUpdated";
    private com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener purchaseUpdatedResponseListener;

    public PurchaseUpdatedListenerProxy(com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener purchaseUpdatedResponseListener) {
        this.purchaseUpdatedResponseListener = purchaseUpdatedResponseListener;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public java.lang.Class<?> getProxyClass() throws java.lang.ClassNotFoundException {
        return getProxyListenerClass();
    }

    public static java.lang.Class<?> getProxyListenerClass() throws java.lang.ClassNotFoundException {
        return java.lang.Class.forName("com.android.billingclient.api.PurchasesUpdatedListener");
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        if (method.getName().equals(onPurchasesUpdatedMethodName)) {
            onPurchasesUpdated(objArr[0], (java.util.List) objArr[1]);
            return null;
        }
        return super.invoke(obj, method, objArr);
    }

    public void onPurchasesUpdated(java.lang.Object obj, java.util.List<java.lang.Object> list) {
        java.util.ArrayList arrayList;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.unity3d.services.store.gpbl.bridges.PurchaseBridge(it.next()));
            }
        } else {
            arrayList = null;
        }
        com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener purchaseUpdatedResponseListener = this.purchaseUpdatedResponseListener;
        if (purchaseUpdatedResponseListener != null) {
            purchaseUpdatedResponseListener.onPurchaseUpdated(new com.unity3d.services.store.gpbl.bridges.BillingResultBridge(obj), arrayList);
        }
    }
}
