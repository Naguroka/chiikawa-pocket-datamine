package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustPlayStorePurchase {
    private final java.lang.String productId;
    private final java.lang.String purchaseToken;

    public AdjustPlayStorePurchase(java.lang.String str, java.lang.String str2) {
        this.productId = str;
        this.purchaseToken = str2;
    }

    public java.lang.String getProductId() {
        return this.productId;
    }

    public java.lang.String getPurchaseToken() {
        return this.purchaseToken;
    }
}
