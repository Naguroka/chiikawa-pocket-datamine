package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class QueryProductDetailsResult {
    private final java.util.List<com.android.billingclient.api.ProductDetails> productDetailsList;
    private final java.util.List<com.android.billingclient.api.UnfetchedProduct> unfetchedProductList;

    QueryProductDetailsResult(java.util.List<com.android.billingclient.api.ProductDetails> list, java.util.List<com.android.billingclient.api.UnfetchedProduct> list2) {
        this.productDetailsList = list;
        this.unfetchedProductList = list2;
    }

    public static com.android.billingclient.api.QueryProductDetailsResult create(java.util.List<com.android.billingclient.api.ProductDetails> list, java.util.List<com.android.billingclient.api.UnfetchedProduct> list2) {
        return new com.android.billingclient.api.QueryProductDetailsResult(list, list2);
    }

    public java.util.List<com.android.billingclient.api.ProductDetails> getProductDetailsList() {
        return this.productDetailsList;
    }

    public java.util.List<com.android.billingclient.api.UnfetchedProduct> getUnfetchedProductList() {
        return this.unfetchedProductList;
    }
}
