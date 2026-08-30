package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcau implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcaw zza;

    zzcau(com.google.android.gms.internal.ads.zzcaw zzcawVar) {
        this.zza = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzcaw zzcawVar = this.zza;
        if (zzcawVar.zzq != null) {
            if (!zzcawVar.zzr) {
                zzcawVar.zzq.zzg();
                this.zza.zzr = true;
            }
            this.zza.zzq.zze();
        }
    }
}
