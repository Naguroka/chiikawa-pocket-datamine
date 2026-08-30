package com.unity3d.services.store.gpbl.bridges;

/* JADX INFO: loaded from: classes6.dex */
public class PurchasesResultBridge extends com.unity3d.services.core.reflection.GenericBridge {
    private static final java.lang.String getBillingResultMethodName = "getBillingResult";
    private static final java.lang.String getPurchasesListMethodName = "getPurchasesList";
    private final java.lang.Object _purchasesResult;

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.Purchase$PurchasesResult";
    }

    public PurchasesResultBridge(java.lang.Object obj) {
        super(new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.PurchasesResultBridge.1
            {
                put(com.unity3d.services.store.gpbl.bridges.PurchasesResultBridge.getBillingResultMethodName, new java.lang.Class[0]);
                put(com.unity3d.services.store.gpbl.bridges.PurchasesResultBridge.getPurchasesListMethodName, new java.lang.Class[0]);
            }
        });
        this._purchasesResult = obj;
    }

    public com.unity3d.services.store.gpbl.bridges.BillingResultBridge getBillingResult() {
        return new com.unity3d.services.store.gpbl.bridges.BillingResultBridge(callNonVoidMethod(getBillingResultMethodName, this._purchasesResult, new java.lang.Object[0]));
    }

    public java.util.List<com.unity3d.services.store.gpbl.bridges.PurchaseBridge> getPurchasesList() {
        java.util.List list = (java.util.List) callNonVoidMethod(getPurchasesListMethodName, this._purchasesResult, new java.lang.Object[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.unity3d.services.store.gpbl.bridges.PurchaseBridge(it.next()));
            }
        }
        return arrayList;
    }
}
