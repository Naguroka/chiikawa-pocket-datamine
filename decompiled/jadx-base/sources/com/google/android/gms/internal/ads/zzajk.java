package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzajk extends com.google.android.gms.internal.ads.zzajt {
    private com.google.android.gms.internal.ads.zzacy zza;
    private com.google.android.gms.internal.ads.zzajj zzb;

    zzajk() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    protected final long zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        if (!zzd(zzdyVar.zzN())) {
            return -1L;
        }
        int i = (zzdyVar.zzN()[2] & 255) >> 4;
        if (i == 6) {
            zzdyVar.zzM(4);
            zzdyVar.zzx();
        } else if (i == 7) {
            i = 7;
            zzdyVar.zzM(4);
            zzdyVar.zzx();
        }
        int iZza = com.google.android.gms.internal.ads.zzacu.zza(zzdyVar, i);
        zzdyVar.zzL(0);
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(com.google.android.gms.internal.ads.zzdy zzdyVar, long j, com.google.android.gms.internal.ads.zzajq zzajqVar) {
        byte[] bArrZzN = zzdyVar.zzN();
        com.google.android.gms.internal.ads.zzacy zzacyVar = this.zza;
        if (zzacyVar == null) {
            com.google.android.gms.internal.ads.zzacy zzacyVar2 = new com.google.android.gms.internal.ads.zzacy(bArrZzN, 17);
            this.zza = zzacyVar2;
            zzajqVar.zza = zzacyVar2.zzc(java.util.Arrays.copyOfRange(bArrZzN, 9, zzdyVar.zze()), null);
            return true;
        }
        if ((bArrZzN[0] & 127) == 3) {
            com.google.android.gms.internal.ads.zzacx zzacxVarZzb = com.google.android.gms.internal.ads.zzacv.zzb(zzdyVar);
            com.google.android.gms.internal.ads.zzacy zzacyVarZzf = zzacyVar.zzf(zzacxVarZzb);
            this.zza = zzacyVarZzf;
            this.zzb = new com.google.android.gms.internal.ads.zzajj(zzacyVarZzf, zzacxVarZzb);
            return true;
        }
        if (!zzd(bArrZzN)) {
            return true;
        }
        com.google.android.gms.internal.ads.zzajj zzajjVar = this.zzb;
        if (zzajjVar != null) {
            zzajjVar.zza(j);
            zzajqVar.zzb = this.zzb;
        }
        zzajqVar.zza.getClass();
        return false;
    }
}
