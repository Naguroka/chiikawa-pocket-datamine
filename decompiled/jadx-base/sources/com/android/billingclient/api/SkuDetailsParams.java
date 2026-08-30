package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class SkuDetailsParams {
    private java.lang.String zza;
    private java.util.List zzb;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static class Builder {
        private java.lang.String zza;
        private java.util.List zzb;

        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(com.android.billingclient.api.zzdb zzdbVar) {
        }

        public com.android.billingclient.api.SkuDetailsParams build() {
            java.lang.String str = this.zza;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("SKU type must be set");
            }
            if (this.zzb == null) {
                throw new java.lang.IllegalArgumentException("SKU list must be set");
            }
            com.android.billingclient.api.SkuDetailsParams skuDetailsParams = new com.android.billingclient.api.SkuDetailsParams();
            skuDetailsParams.zza = str;
            skuDetailsParams.zzb = this.zzb;
            return skuDetailsParams;
        }

        public com.android.billingclient.api.SkuDetailsParams.Builder setSkusList(java.util.List<java.lang.String> list) {
            this.zzb = new java.util.ArrayList(list);
            return this;
        }

        public com.android.billingclient.api.SkuDetailsParams.Builder setType(java.lang.String str) {
            this.zza = str;
            return this;
        }
    }

    public static com.android.billingclient.api.SkuDetailsParams.Builder newBuilder() {
        return new com.android.billingclient.api.SkuDetailsParams.Builder(null);
    }

    public java.lang.String getSkuType() {
        return this.zza;
    }

    public java.util.List<java.lang.String> getSkusList() {
        return this.zzb;
    }
}
