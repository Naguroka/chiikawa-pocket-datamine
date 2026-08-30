package com.google.android.datatransport;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ProductData {
    public abstract java.lang.Integer getProductId();

    public static com.google.android.datatransport.ProductData withProductId(java.lang.Integer num) {
        return new com.google.android.datatransport.AutoValue_ProductData(num);
    }
}
