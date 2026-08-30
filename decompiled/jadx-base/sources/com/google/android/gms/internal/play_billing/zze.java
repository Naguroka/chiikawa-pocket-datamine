package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zze {
    static final com.google.android.gms.internal.play_billing.zze zza;
    static final com.google.android.gms.internal.play_billing.zze zzb;
    final java.lang.Throwable zzc;

    static {
        if (com.google.android.gms.internal.play_billing.zzo.zza) {
            zzb = null;
            zza = null;
        } else {
            zzb = new com.google.android.gms.internal.play_billing.zze(false, null);
            zza = new com.google.android.gms.internal.play_billing.zze(true, null);
        }
    }

    zze(boolean z, java.lang.Throwable th) {
        this.zzc = th;
    }
}
