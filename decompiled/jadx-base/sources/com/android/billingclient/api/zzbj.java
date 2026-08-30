package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbj extends com.google.android.gms.internal.play_billing.zzac {
    final com.android.billingclient.api.BillingConfigResponseListener zza;
    final com.android.billingclient.api.zzch zzb;
    final int zzc;

    /* synthetic */ zzbj(com.android.billingclient.api.BillingConfigResponseListener billingConfigResponseListener, com.android.billingclient.api.zzch zzchVar, int i, com.android.billingclient.api.zzbp zzbpVar) {
        this.zza = billingConfigResponseListener;
        this.zzb = zzchVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzad
    public final void zza(android.os.Bundle bundle) throws android.os.RemoteException {
        if (bundle == null) {
            com.android.billingclient.api.zzch zzchVar = this.zzb;
            com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.NULL_BUNDLE_FROM_GET_BILLING_CONFIG_SERVICE_CALL;
            com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzh;
            int i = com.android.billingclient.api.zzcg.zza;
            zzchVar.zzb(com.android.billingclient.api.zzcg.zzb(zzieVar, 13, billingResult, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
            this.zza.onBillingConfigResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
        java.lang.String strZzj = com.google.android.gms.internal.play_billing.zzc.zzj(bundle, "BillingClient");
        com.android.billingclient.api.BillingResult.Builder builderNewBuilder = com.android.billingclient.api.BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(iZzb);
        builderNewBuilder.setDebugMessage(strZzj);
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "getBillingConfig() failed. Response code: " + iZzb);
            com.android.billingclient.api.BillingResult billingResultBuild = builderNewBuilder.build();
            com.android.billingclient.api.zzch zzchVar2 = this.zzb;
            com.google.android.gms.internal.play_billing.zzie zzieVar2 = com.google.android.gms.internal.play_billing.zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            int i2 = com.android.billingclient.api.zzcg.zza;
            zzchVar2.zzb(com.android.billingclient.api.zzcg.zzb(zzieVar2, 13, billingResultBuild, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
            this.zza.onBillingConfigResponse(billingResultBuild, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            builderNewBuilder.setResponseCode(6);
            com.android.billingclient.api.BillingResult billingResultBuild2 = builderNewBuilder.build();
            com.android.billingclient.api.zzch zzchVar3 = this.zzb;
            com.google.android.gms.internal.play_billing.zzie zzieVar3 = com.google.android.gms.internal.play_billing.zzie.MISSING_BILLING_CONFIG_IN_GET_BILLING_CONFIG_RESPONSE;
            int i3 = com.android.billingclient.api.zzcg.zza;
            zzchVar3.zzb(com.android.billingclient.api.zzcg.zzb(zzieVar3, 13, billingResultBuild2, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
            this.zza.onBillingConfigResponse(billingResultBuild2, null);
            return;
        }
        try {
            this.zza.onBillingConfigResponse(builderNewBuilder.build(), new com.android.billingclient.api.BillingConfig(bundle.getString("BILLING_CONFIG")));
        } catch (org.json.JSONException e) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e);
            com.android.billingclient.api.zzch zzchVar4 = this.zzb;
            com.google.android.gms.internal.play_billing.zzie zzieVar4 = com.google.android.gms.internal.play_billing.zzie.ERROR_DECODING_BILLING_CONFIG_DATA;
            com.android.billingclient.api.BillingResult billingResult2 = com.android.billingclient.api.zzcj.zzh;
            int i4 = com.android.billingclient.api.zzcg.zza;
            zzchVar4.zzb(com.android.billingclient.api.zzcg.zzb(zzieVar4, 13, billingResult2, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED), this.zzc);
            this.zza.onBillingConfigResponse(billingResult2, null);
        }
    }
}
