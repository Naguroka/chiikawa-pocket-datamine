package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzext implements com.google.android.gms.internal.ads.zzelc {
    final /* synthetic */ com.google.android.gms.internal.ads.zzexu zza;

    zzext(com.google.android.gms.internal.ads.zzexu zzexuVar) {
        this.zza = zzexuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcog zzcogVar = (com.google.android.gms.internal.ads.zzcog) obj;
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzcog zzcogVar2 = this.zza.zza;
            if (zzcogVar2 != null) {
                zzcogVar2.zzb();
            }
            com.google.android.gms.internal.ads.zzexu zzexuVar = this.zza;
            zzexuVar.zza = zzcogVar;
            zzcogVar.zzc(zzexuVar);
            com.google.android.gms.internal.ads.zzexu zzexuVar2 = this.zza;
            zzexuVar2.zzg.zzk(new com.google.android.gms.internal.ads.zzcoh(zzcogVar, zzexuVar2, zzexuVar2.zzg, zzexuVar2.zzi));
            zzcogVar.zzk();
        }
    }
}
