package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbh extends com.google.android.gms.internal.play_billing.zzy {
    final com.android.billingclient.api.ExternalOfferReportingDetailsListener zza;
    final com.android.billingclient.api.zzch zzb;
    final int zzc;

    /* synthetic */ zzbh(com.android.billingclient.api.ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, com.android.billingclient.api.zzch zzchVar, int i, com.android.billingclient.api.zzbp zzbpVar) {
        this.zza = externalOfferReportingDetailsListener;
        this.zzb = zzchVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzz
    public final void zza(android.os.Bundle bundle) throws android.os.RemoteException {
        if (bundle == null) {
            com.android.billingclient.api.zzch zzchVar = this.zzb;
            com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.NULL_BUNDLE_FROM_CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL;
            com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzh;
            int i = com.android.billingclient.api.zzcg.zza;
            zzchVar.zzb(com.android.billingclient.api.zzcg.zzb(zzieVar, 24, billingResult, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
        com.android.billingclient.api.BillingResult billingResultZza = com.android.billingclient.api.zzcj.zza(iZzb, com.google.android.gms.internal.play_billing.zzc.zzj(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + iZzb);
            com.android.billingclient.api.zzch zzchVar2 = this.zzb;
            com.google.android.gms.internal.play_billing.zzie zzieVar2 = com.google.android.gms.internal.play_billing.zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            int i2 = com.android.billingclient.api.zzcg.zza;
            zzchVar2.zzb(com.android.billingclient.api.zzcg.zzb(zzieVar2, 24, billingResultZza, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(billingResultZza, null);
            return;
        }
        try {
            this.zza.onExternalOfferReportingDetailsResponse(billingResultZza, new com.android.billingclient.api.ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (org.json.JSONException e) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e);
            com.android.billingclient.api.zzch zzchVar3 = this.zzb;
            com.google.android.gms.internal.play_billing.zzie zzieVar3 = com.google.android.gms.internal.play_billing.zzie.ERROR_DECODING_EXTERNAL_OFFER_REPORTING_DETAILS;
            com.android.billingclient.api.BillingResult billingResult2 = com.android.billingclient.api.zzcj.zzh;
            int i3 = com.android.billingclient.api.zzcg.zza;
            zzchVar3.zzb(com.android.billingclient.api.zzcg.zzb(zzieVar3, 24, billingResult2, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(billingResult2, null);
        }
    }
}
