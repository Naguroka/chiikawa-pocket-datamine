package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzs {
    private final android.content.Context zza;
    private final com.android.billingclient.api.PurchasesUpdatedListener zzb;
    private final com.android.billingclient.api.zzb zzc;
    private final com.android.billingclient.api.UserChoiceBillingListener zzd;
    private final com.android.billingclient.api.zzch zze;
    private final com.android.billingclient.api.zzr zzf = new com.android.billingclient.api.zzr(this, true);
    private final com.android.billingclient.api.zzr zzg = new com.android.billingclient.api.zzr(this, false);
    private boolean zzh;

    zzs(android.content.Context context, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, com.android.billingclient.api.zzco zzcoVar, com.android.billingclient.api.zzb zzbVar, com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener, com.android.billingclient.api.zzch zzchVar) {
        this.zza = context;
        this.zzb = purchasesUpdatedListener;
        this.zzc = zzbVar;
        this.zzd = userChoiceBillingListener;
        this.zze = zzchVar;
    }

    final com.android.billingclient.api.PurchasesUpdatedListener zzd() {
        return this.zzb;
    }

    final void zzf() {
        com.android.billingclient.api.zzr zzrVar = this.zzf;
        android.content.Context context = this.zza;
        zzrVar.zzc(context);
        this.zzg.zzc(context);
    }

    final void zzg(boolean z) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.zzh = z;
        com.android.billingclient.api.zzr zzrVar = this.zzg;
        android.content.Context context = this.zza;
        zzrVar.zza(context, intentFilter2);
        if (this.zzh) {
            this.zzf.zzb(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.zzf.zza(context, intentFilter);
        }
    }
}
