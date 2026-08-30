package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzhaj extends com.google.android.gms.internal.ads.zzhah {
    zzhaj() {
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final /* bridge */ /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzgxr zzgxrVar = (com.google.android.gms.internal.ads.zzgxr) obj;
        com.google.android.gms.internal.ads.zzhai zzhaiVar = zzgxrVar.zzt;
        if (zzhaiVar != com.google.android.gms.internal.ads.zzhai.zzc()) {
            return zzhaiVar;
        }
        com.google.android.gms.internal.ads.zzhai zzhaiVarZzf = com.google.android.gms.internal.ads.zzhai.zzf();
        zzgxrVar.zzt = zzhaiVarZzf;
        return zzhaiVarZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final /* synthetic */ java.lang.Object zzb() {
        return com.google.android.gms.internal.ads.zzhai.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final /* synthetic */ java.lang.Object zzc(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzhai zzhaiVar = (com.google.android.gms.internal.ads.zzhai) obj;
        zzhaiVar.zzh();
        return zzhaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final /* bridge */ /* synthetic */ void zzd(java.lang.Object obj, int i, int i2) {
        ((com.google.android.gms.internal.ads.zzhai) obj).zzj((i << 3) | 5, java.lang.Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final /* bridge */ /* synthetic */ void zze(java.lang.Object obj, int i, long j) {
        ((com.google.android.gms.internal.ads.zzhai) obj).zzj((i << 3) | 1, java.lang.Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final /* bridge */ /* synthetic */ void zzf(java.lang.Object obj, int i, java.lang.Object obj2) {
        ((com.google.android.gms.internal.ads.zzhai) obj).zzj((i << 3) | 3, (com.google.android.gms.internal.ads.zzhai) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final /* bridge */ /* synthetic */ void zzg(java.lang.Object obj, int i, com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        ((com.google.android.gms.internal.ads.zzhai) obj).zzj((i << 3) | 2, zzgwjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final /* bridge */ /* synthetic */ void zzh(java.lang.Object obj, int i, long j) {
        ((com.google.android.gms.internal.ads.zzhai) obj).zzj(i << 3, java.lang.Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final void zzi(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.zzgxr) obj).zzt.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final /* synthetic */ void zzj(java.lang.Object obj, java.lang.Object obj2) {
        ((com.google.android.gms.internal.ads.zzgxr) obj).zzt = (com.google.android.gms.internal.ads.zzhai) obj2;
    }
}
