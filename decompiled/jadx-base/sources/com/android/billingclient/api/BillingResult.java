package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class BillingResult {
    private int zza;
    private int zzb;
    private java.lang.String zzc;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static class Builder {
        private int zza;
        private int zzb = 0;
        private java.lang.String zzc = "";

        private Builder() {
        }

        /* synthetic */ Builder(com.android.billingclient.api.zzci zzciVar) {
        }

        public com.android.billingclient.api.BillingResult build() {
            com.android.billingclient.api.BillingResult billingResult = new com.android.billingclient.api.BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            billingResult.zzc = this.zzc;
            return billingResult;
        }

        public com.android.billingclient.api.BillingResult.Builder setDebugMessage(java.lang.String str) {
            this.zzc = str;
            return this;
        }

        public com.android.billingclient.api.BillingResult.Builder setOnPurchasesUpdatedSubResponseCode(int i) {
            this.zzb = i;
            return this;
        }

        public com.android.billingclient.api.BillingResult.Builder setResponseCode(int i) {
            this.zza = i;
            return this;
        }
    }

    public static com.android.billingclient.api.BillingResult.Builder newBuilder() {
        return new com.android.billingclient.api.BillingResult.Builder(null);
    }

    public java.lang.String getDebugMessage() {
        return this.zzc;
    }

    public int getOnPurchasesUpdatedSubResponseCode() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    public java.lang.String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.zzc.zzk(this.zza) + ", Debug Message: " + this.zzc;
    }
}
