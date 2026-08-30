package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcnb implements com.google.android.gms.internal.ads.zzbjp {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcnc zza;

    zzcnb(com.google.android.gms.internal.ads.zzcnc zzcncVar) {
        this.zza = zzcncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        if (com.google.android.gms.internal.ads.zzcnc.zzg(this.zza, map)) {
            this.zza.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcna
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza.zzd.zzj();
                }
            });
        }
    }
}
