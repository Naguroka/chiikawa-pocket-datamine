package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class AcknowledgePurchaseParams {
    private java.lang.String zza;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class Builder {
        private java.lang.String zza;

        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(com.android.billingclient.api.zza zzaVar) {
        }

        public com.android.billingclient.api.AcknowledgePurchaseParams build() {
            java.lang.String str = this.zza;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("Purchase token must be set");
            }
            com.android.billingclient.api.AcknowledgePurchaseParams acknowledgePurchaseParams = new com.android.billingclient.api.AcknowledgePurchaseParams(null);
            acknowledgePurchaseParams.zza = str;
            return acknowledgePurchaseParams;
        }

        public com.android.billingclient.api.AcknowledgePurchaseParams.Builder setPurchaseToken(java.lang.String str) {
            this.zza = str;
            return this;
        }
    }

    private AcknowledgePurchaseParams() {
        throw null;
    }

    /* synthetic */ AcknowledgePurchaseParams(com.android.billingclient.api.zza zzaVar) {
    }

    public static com.android.billingclient.api.AcknowledgePurchaseParams.Builder newBuilder() {
        return new com.android.billingclient.api.AcknowledgePurchaseParams.Builder(null);
    }

    public java.lang.String getPurchaseToken() {
        return this.zza;
    }
}
