package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class QueryProductDetailsParams {
    private final com.google.android.gms.internal.play_billing.zzbt zza;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static class Builder {
        private com.google.android.gms.internal.play_billing.zzbt zza;

        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(com.android.billingclient.api.zzcy zzcyVar) {
        }

        public com.android.billingclient.api.QueryProductDetailsParams build() {
            if (this.zza != null) {
                return new com.android.billingclient.api.QueryProductDetailsParams(this, null);
            }
            throw new java.lang.IllegalArgumentException("Product list must be set to a non empty list.");
        }

        public com.android.billingclient.api.QueryProductDetailsParams.Builder setProductList(java.util.List<com.android.billingclient.api.QueryProductDetailsParams.Product> list) {
            if (list == null || list.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Product list cannot be empty.");
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            for (com.android.billingclient.api.QueryProductDetailsParams.Product product : list) {
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() > 1) {
                throw new java.lang.IllegalArgumentException("All products should be of the same product type.");
            }
            this.zza = com.google.android.gms.internal.play_billing.zzbt.zzj(list);
            return this;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static class Product {
        private final java.lang.String zza;
        private final java.lang.String zzb;

        /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
        public static class Builder {
            private java.lang.String zza;
            private java.lang.String zzb;

            private Builder() {
                throw null;
            }

            /* synthetic */ Builder(com.android.billingclient.api.zzcy zzcyVar) {
            }

            public com.android.billingclient.api.QueryProductDetailsParams.Product build() {
                if ("first_party".equals(this.zzb)) {
                    throw new java.lang.IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.zza == null) {
                    throw new java.lang.IllegalArgumentException("Product id must be provided.");
                }
                if (this.zzb != null) {
                    return new com.android.billingclient.api.QueryProductDetailsParams.Product(this, null);
                }
                throw new java.lang.IllegalArgumentException("Product type must be provided.");
            }

            public com.android.billingclient.api.QueryProductDetailsParams.Product.Builder setProductId(java.lang.String str) {
                this.zza = str;
                return this;
            }

            public com.android.billingclient.api.QueryProductDetailsParams.Product.Builder setProductType(java.lang.String str) {
                this.zzb = str;
                return this;
            }
        }

        /* synthetic */ Product(com.android.billingclient.api.QueryProductDetailsParams.Product.Builder builder, com.android.billingclient.api.zzcy zzcyVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
        }

        public static com.android.billingclient.api.QueryProductDetailsParams.Product.Builder newBuilder() {
            return new com.android.billingclient.api.QueryProductDetailsParams.Product.Builder(null);
        }

        public final java.lang.String zza() {
            return this.zza;
        }

        public final java.lang.String zzb() {
            return this.zzb;
        }
    }

    /* synthetic */ QueryProductDetailsParams(com.android.billingclient.api.QueryProductDetailsParams.Builder builder, com.android.billingclient.api.zzcy zzcyVar) {
        this.zza = builder.zza;
    }

    public static com.android.billingclient.api.QueryProductDetailsParams.Builder newBuilder() {
        return new com.android.billingclient.api.QueryProductDetailsParams.Builder(null);
    }

    public final com.google.android.gms.internal.play_billing.zzbt zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        return ((com.android.billingclient.api.QueryProductDetailsParams.Product) this.zza.get(0)).zzb();
    }
}
