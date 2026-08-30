package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzca implements com.google.android.gms.internal.play_billing.zzcs {
    final /* synthetic */ androidx.core.util.Consumer zza;
    final /* synthetic */ java.lang.Runnable zzb;
    final /* synthetic */ com.android.billingclient.api.zzce zzc;
    final /* synthetic */ int zzd;

    zzca(com.android.billingclient.api.zzce zzceVar, int i, androidx.core.util.Consumer consumer, java.lang.Runnable runnable) {
        this.zzd = i;
        this.zza = consumer;
        this.zzb = runnable;
        java.util.Objects.requireNonNull(zzceVar);
        this.zzc = zzceVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final void zza(java.lang.Throwable th) {
        if (th instanceof java.util.concurrent.TimeoutException) {
            this.zzc.zzaF(com.google.android.gms.internal.play_billing.zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, com.android.billingclient.api.zzcj.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            this.zzc.zzaF(com.google.android.gms.internal.play_billing.zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, com.android.billingclient.api.zzcj.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.zzb.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int iIntValue = num.intValue();
        com.android.billingclient.api.zzce zzceVar = this.zzc;
        if (!com.android.billingclient.api.zzce.zzaC(iIntValue)) {
            this.zzb.run();
        } else {
            this.zza.accept(zzceVar.zzaD(this.zzd, num.intValue()));
        }
    }
}
