package com.google.android.datatransport;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ProductData extends com.google.android.datatransport.ProductData {
    private final java.lang.Integer productId;

    AutoValue_ProductData(java.lang.Integer num) {
        this.productId = num;
    }

    @Override // com.google.android.datatransport.ProductData
    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public java.lang.String toString() {
        return "ProductData{productId=" + this.productId + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.ProductData)) {
            return false;
        }
        java.lang.Integer num = this.productId;
        java.lang.Integer productId = ((com.google.android.datatransport.ProductData) obj).getProductId();
        if (num == null) {
            return productId == null;
        }
        return num.equals(productId);
    }

    public int hashCode() {
        java.lang.Integer num = this.productId;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }
}
