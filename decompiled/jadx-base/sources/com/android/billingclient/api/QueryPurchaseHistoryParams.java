package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class QueryPurchaseHistoryParams {

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static class Builder {
        private java.lang.String zza;

        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(com.android.billingclient.api.zzcz zzczVar) {
        }

        public com.android.billingclient.api.QueryPurchaseHistoryParams build() {
            if (this.zza != null) {
                return new com.android.billingclient.api.QueryPurchaseHistoryParams(this, null);
            }
            throw new java.lang.IllegalArgumentException("Product type must be set");
        }

        public com.android.billingclient.api.QueryPurchaseHistoryParams.Builder setProductType(java.lang.String str) {
            this.zza = str;
            return this;
        }
    }

    /* synthetic */ QueryPurchaseHistoryParams(com.android.billingclient.api.QueryPurchaseHistoryParams.Builder builder, com.android.billingclient.api.zzcz zzczVar) {
    }

    public static com.android.billingclient.api.QueryPurchaseHistoryParams.Builder newBuilder() {
        return new com.android.billingclient.api.QueryPurchaseHistoryParams.Builder(null);
    }
}
