package com.unity3d.services.store.gpbl.proxies;

/* JADX INFO: loaded from: classes6.dex */
public class BillingClientStateListenerProxy extends com.unity3d.services.core.reflection.GenericListenerProxy {
    private static java.lang.String onBillingServiceDisconnectedMethodName = "onBillingServiceDisconnected";
    private static java.lang.String onBillingSetupFinishedMethodName = "onBillingSetupFinished";
    private com.unity3d.services.store.gpbl.listeners.BillingClientStateListener billingClientStateListener;

    public BillingClientStateListenerProxy(com.unity3d.services.store.gpbl.listeners.BillingClientStateListener billingClientStateListener) {
        this.billingClientStateListener = billingClientStateListener;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public java.lang.Class<?> getProxyClass() throws java.lang.ClassNotFoundException {
        return getProxyListenerClass();
    }

    public static java.lang.Class<?> getProxyListenerClass() throws java.lang.ClassNotFoundException {
        return java.lang.Class.forName("com.android.billingclient.api.BillingClientStateListener");
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        if (method.getName().equals(onBillingSetupFinishedMethodName)) {
            onBillingSetupFinished(objArr[0]);
        } else if (method.getName().equals(onBillingServiceDisconnectedMethodName)) {
            onBillingServiceDisconnected();
        } else {
            return super.invoke(obj, method, objArr);
        }
        return null;
    }

    private void onBillingSetupFinished(java.lang.Object obj) {
        com.unity3d.services.store.gpbl.listeners.BillingClientStateListener billingClientStateListener = this.billingClientStateListener;
        if (billingClientStateListener != null) {
            billingClientStateListener.onBillingSetupFinished(new com.unity3d.services.store.gpbl.bridges.BillingResultBridge(obj));
        }
    }

    private void onBillingServiceDisconnected() {
        com.unity3d.services.store.gpbl.listeners.BillingClientStateListener billingClientStateListener = this.billingClientStateListener;
        if (billingClientStateListener != null) {
            billingClientStateListener.onBillingServiceDisconnected();
        }
    }
}
