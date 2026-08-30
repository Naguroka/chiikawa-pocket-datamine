package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbzi extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbzm zza;

    zzbzi(com.google.android.gms.internal.ads.zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        com.google.android.gms.internal.ads.zzbzm zzbzmVar = this.zza;
        com.google.android.gms.internal.ads.zzbco zzbcoVar = new com.google.android.gms.internal.ads.zzbco(zzbzmVar.zze, zzbzmVar.zzf.afmaVersion);
        synchronized (this.zza.zza) {
            try {
                com.google.android.gms.ads.internal.zzv.zze();
                com.google.android.gms.internal.ads.zzbcr.zza(this.zza.zzh, zzbcoVar);
            } catch (java.lang.IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
