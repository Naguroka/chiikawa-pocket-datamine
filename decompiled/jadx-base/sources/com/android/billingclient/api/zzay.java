package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzay extends android.os.ResultReceiver {
    final /* synthetic */ com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener zza;
    final /* synthetic */ com.android.billingclient.api.BillingClientImpl zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzay(com.android.billingclient.api.BillingClientImpl billingClientImpl, android.os.Handler handler, com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        super(handler);
        this.zza = alternativeBillingOnlyInformationDialogListener;
        java.util.Objects.requireNonNull(billingClientImpl);
        this.zzb = billingClientImpl;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, android.os.Bundle bundle) {
        com.android.billingclient.api.BillingResult.Builder builderNewBuilder = com.android.billingclient.api.BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        if (i != 0) {
            if (bundle == null) {
                this.zzb.zzaM(this.zza, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.NULL_BUNDLE_IN_ALTERNATIVE_BILLING_ONLY_INFORMATION_DIALOG_RECEIVER, null);
                return;
            }
            builderNewBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzc.zzj(bundle, "BillingClient"));
            int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            com.android.billingclient.api.BillingClientImpl billingClientImpl = this.zzb;
            com.google.android.gms.internal.play_billing.zzie zzieVarZzb = i2 != 0 ? com.google.android.gms.internal.play_billing.zzie.zzb(i2) : com.google.android.gms.internal.play_billing.zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            com.android.billingclient.api.BillingResult billingResultBuild = builderNewBuilder.build();
            java.lang.String string = bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS");
            int i3 = com.android.billingclient.api.zzcg.zza;
            billingClientImpl.zzaO(com.android.billingclient.api.zzcg.zzb(zzieVarZzb, 16, billingResultBuild, string, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED));
        }
        this.zza.onAlternativeBillingOnlyInformationDialogResponse(builderNewBuilder.build());
    }
}
