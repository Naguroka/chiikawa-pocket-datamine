package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaut implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzauu zza;

    zzaut(com.google.android.gms.internal.ads.zzauu zzauuVar) {
        this.zza = zzauuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.zza.zzb != null) {
            return;
        }
        synchronized (com.google.android.gms.internal.ads.zzauu.zzc) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbcl.zzcF.zze()).booleanValue();
            } catch (java.lang.IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    com.google.android.gms.internal.ads.zzauu.zza = com.google.android.gms.internal.ads.zzfpk.zzb(this.zza.zze.zza, "ADSHIELD", null);
                } catch (java.lang.Throwable unused2) {
                }
            }
            z = zBooleanValue;
            this.zza.zzb = java.lang.Boolean.valueOf(z);
            com.google.android.gms.internal.ads.zzauu.zzc.open();
        }
    }
}
