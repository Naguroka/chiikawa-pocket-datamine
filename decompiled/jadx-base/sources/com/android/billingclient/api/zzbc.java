package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbc implements com.android.billingclient.api.BillingClientStateListener {
    final /* synthetic */ com.google.android.gms.internal.play_billing.zzp zza;
    final /* synthetic */ com.android.billingclient.api.BillingClientImpl zzb;

    zzbc(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.google.android.gms.internal.play_billing.zzp zzpVar) {
        this.zza = zzpVar;
        java.util.Objects.requireNonNull(billingClientImpl);
        this.zzb = billingClientImpl;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Reconnection attempt failed.");
        try {
            this.zza.zzb(com.android.billingclient.api.zzcj.zzj);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception setting completer.", th);
        }
        com.android.billingclient.api.BillingClientImpl billingClientImpl = this.zzb;
        if (billingClientImpl.zzG != null) {
            billingClientImpl.zzag(new java.lang.Runnable() { // from class: com.android.billingclient.api.zzba
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.zza.zzb.zzG.onBillingServiceDisconnected();
                    } catch (java.lang.Throwable th2) {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception calling onBillingServiceDisconnected.", th2);
                    }
                }
            });
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(final com.android.billingclient.api.BillingResult billingResult) {
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Reconnection finished with result: " + billingResult.getResponseCode());
        try {
            this.zza.zzb(billingResult);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception setting completer.", th);
        }
        com.android.billingclient.api.BillingClientImpl billingClientImpl = this.zzb;
        if (billingClientImpl.zzG != null) {
            billingClientImpl.zzag(new java.lang.Runnable() { // from class: com.android.billingclient.api.zzbb
                @Override // java.lang.Runnable
                public final void run() {
                    com.android.billingclient.api.zzbc zzbcVar = this.zza;
                    try {
                        zzbcVar.zzb.zzG.onBillingSetupFinished(billingResult);
                    } catch (java.lang.Throwable th2) {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception calling onBillingSetupFinished.", th2);
                    }
                }
            });
        }
    }
}
