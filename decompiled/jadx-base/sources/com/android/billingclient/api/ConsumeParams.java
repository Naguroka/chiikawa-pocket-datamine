package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConsumeParams {
    private java.lang.String zza;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class Builder {
        private java.lang.String zza;

        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(com.android.billingclient.api.zzck zzckVar) {
        }

        public com.android.billingclient.api.ConsumeParams build() {
            java.lang.String str = this.zza;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("Purchase token must be set");
            }
            com.android.billingclient.api.ConsumeParams consumeParams = new com.android.billingclient.api.ConsumeParams(null);
            consumeParams.zza = str;
            return consumeParams;
        }

        public com.android.billingclient.api.ConsumeParams.Builder setPurchaseToken(java.lang.String str) {
            this.zza = str;
            return this;
        }
    }

    private ConsumeParams() {
        throw null;
    }

    /* synthetic */ ConsumeParams(com.android.billingclient.api.zzck zzckVar) {
    }

    public static com.android.billingclient.api.ConsumeParams.Builder newBuilder() {
        return new com.android.billingclient.api.ConsumeParams.Builder(null);
    }

    public java.lang.String getPurchaseToken() {
        return this.zza;
    }
}
