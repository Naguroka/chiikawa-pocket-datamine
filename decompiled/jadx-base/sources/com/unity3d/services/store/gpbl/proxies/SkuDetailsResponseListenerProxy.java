package com.unity3d.services.store.gpbl.proxies;

/* JADX INFO: loaded from: classes6.dex */
public class SkuDetailsResponseListenerProxy extends com.unity3d.services.core.reflection.GenericListenerProxy {
    private static final java.lang.String onSkuDetailsResponseMethodName = "onSkuDetailsResponse";
    private com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener skuDetailsResponseListener;

    public SkuDetailsResponseListenerProxy(com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener skuDetailsResponseListener) {
        this.skuDetailsResponseListener = skuDetailsResponseListener;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public java.lang.Class<?> getProxyClass() throws java.lang.ClassNotFoundException {
        return getProxyListenerClass();
    }

    public static java.lang.Class<?> getProxyListenerClass() throws java.lang.ClassNotFoundException {
        return java.lang.Class.forName("com.android.billingclient.api.SkuDetailsResponseListener");
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        if (method.getName().equals(onSkuDetailsResponseMethodName)) {
            onSkuDetailsResponse(objArr[0], (java.util.List) objArr[1]);
            return null;
        }
        return super.invoke(obj, method, objArr);
    }

    public void onSkuDetailsResponse(java.lang.Object obj, java.util.List<java.lang.Object> list) {
        java.util.ArrayList arrayList;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge(it.next()));
            }
        } else {
            arrayList = null;
        }
        com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener skuDetailsResponseListener = this.skuDetailsResponseListener;
        if (skuDetailsResponseListener != null) {
            skuDetailsResponseListener.onSkuDetailsUpdated(new com.unity3d.services.store.gpbl.bridges.BillingResultBridge(obj), arrayList);
        }
    }
}
