package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaep implements com.google.android.gms.internal.ads.zzabx {
    private final com.google.android.gms.internal.ads.zzacy zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzact zzc = new com.google.android.gms.internal.ads.zzact();

    /* synthetic */ zzaep(com.google.android.gms.internal.ads.zzacy zzacyVar, int i, com.google.android.gms.internal.ads.zzaeq zzaeqVar) {
        this.zza = zzacyVar;
        this.zzb = i;
    }

    private final long zzc(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        while (zzacoVar.zze() < zzacoVar.zzd() - 6) {
            com.google.android.gms.internal.ads.zzacy zzacyVar = this.zza;
            int i = this.zzb;
            com.google.android.gms.internal.ads.zzact zzactVar = this.zzc;
            long jZze = zzacoVar.zze();
            byte[] bArr = new byte[2];
            zzacoVar.zzh(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzacoVar.zzj();
                zzacoVar.zzg((int) (jZze - zzacoVar.zzf()));
            } else {
                com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(16);
                java.lang.System.arraycopy(bArr, 0, zzdyVar.zzN(), 0, 2);
                zzdyVar.zzK(com.google.android.gms.internal.ads.zzacr.zza(zzacoVar, zzdyVar.zzN(), 2, 14));
                zzacoVar.zzj();
                zzacoVar.zzg((int) (jZze - zzacoVar.zzf()));
                if (com.google.android.gms.internal.ads.zzacu.zzc(zzdyVar, zzacyVar, i, zzactVar)) {
                    break;
                }
            }
            zzacoVar.zzg(1);
        }
        if (zzacoVar.zze() < zzacoVar.zzd() - 6) {
            return this.zzc.zza;
        }
        zzacoVar.zzg((int) (zzacoVar.zzd() - zzacoVar.zze()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final com.google.android.gms.internal.ads.zzabw zza(com.google.android.gms.internal.ads.zzaco zzacoVar, long j) throws java.io.IOException {
        long jZzf = zzacoVar.zzf();
        long jZzc = zzc(zzacoVar);
        long jZze = zzacoVar.zze();
        zzacoVar.zzg(java.lang.Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzacoVar);
        long jZze2 = zzacoVar.zze();
        if (jZzc > j || jZzc2 <= j) {
            return jZzc2 <= j ? com.google.android.gms.internal.ads.zzabw.zzf(jZzc2, jZze2) : com.google.android.gms.internal.ads.zzabw.zzd(jZzc, jZzf);
        }
        return com.google.android.gms.internal.ads.zzabw.zze(jZze);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final /* synthetic */ void zzb() {
    }
}
