package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbm extends com.google.android.gms.internal.play_billing.zzai {
    final com.android.billingclient.api.ExternalOfferAvailabilityListener zza;
    final com.android.billingclient.api.zzch zzb;
    final int zzc;

    /* synthetic */ zzbm(com.android.billingclient.api.ExternalOfferAvailabilityListener externalOfferAvailabilityListener, com.android.billingclient.api.zzch zzchVar, int i, com.android.billingclient.api.zzbp zzbpVar) {
        this.zza = externalOfferAvailabilityListener;
        this.zzb = zzchVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaj
    public final void zza(android.os.Bundle bundle) throws android.os.RemoteException {
        if (bundle == null) {
            com.android.billingclient.api.zzch zzchVar = this.zzb;
            com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.NULL_BUNDLE_FROM_IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL;
            com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzh;
            int i = com.android.billingclient.api.zzcg.zza;
            zzchVar.zzb(com.android.billingclient.api.zzcg.zzb(zzieVar, 23, billingResult, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
            this.zza.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
        com.android.billingclient.api.BillingResult billingResultZza = com.android.billingclient.api.zzcj.zza(iZzb, com.google.android.gms.internal.play_billing.zzc.zzj(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + iZzb);
            com.android.billingclient.api.zzch zzchVar2 = this.zzb;
            com.google.android.gms.internal.play_billing.zzie zzieVar2 = com.google.android.gms.internal.play_billing.zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            int i2 = com.android.billingclient.api.zzcg.zza;
            zzchVar2.zzb(com.android.billingclient.api.zzcg.zzb(zzieVar2, 23, billingResultZza, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
        }
        this.zza.onExternalOfferAvailabilityResponse(billingResultZza);
    }
}
