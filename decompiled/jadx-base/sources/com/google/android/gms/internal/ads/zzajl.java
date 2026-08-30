package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzajl implements com.google.android.gms.internal.ads.zzacn {
    private com.google.android.gms.internal.ads.zzacq zza;
    private com.google.android.gms.internal.ads.zzajt zzb;
    private boolean zzc;

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zza(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzajn zzajnVar = new com.google.android.gms.internal.ads.zzajn();
        if (zzajnVar.zzb(zzacoVar, true) && (zzajnVar.zza & 2) == 2) {
            int iMin = java.lang.Math.min(zzajnVar.zze, 8);
            com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(iMin);
            zzacoVar.zzh(zzdyVar.zzN(), 0, iMin);
            zzdyVar.zzL(0);
            if (zzdyVar.zzb() >= 5 && zzdyVar.zzm() == 127 && zzdyVar.zzu() == 1179402563) {
                this.zzb = new com.google.android.gms.internal.ads.zzajk();
            } else {
                zzdyVar.zzL(0);
                try {
                    if (com.google.android.gms.internal.ads.zzadz.zzd(1, zzdyVar, true)) {
                        this.zzb = new com.google.android.gms.internal.ads.zzajv();
                    } else {
                        zzdyVar.zzL(0);
                        if (com.google.android.gms.internal.ads.zzajp.zzd(zzdyVar)) {
                            this.zzb = new com.google.android.gms.internal.ads.zzajp();
                        }
                    }
                } catch (com.google.android.gms.internal.ads.zzbc unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zza);
        if (this.zzb == null) {
            if (!zza(zzacoVar)) {
                throw com.google.android.gms.internal.ads.zzbc.zza("Failed to determine bitstream type", null);
            }
            zzacoVar.zzj();
        }
        if (!this.zzc) {
            com.google.android.gms.internal.ads.zzadt zzadtVarZzw = this.zza.zzw(0, 1);
            this.zza.zzD();
            this.zzb.zzh(this.zza, zzadtVarZzw);
            this.zzc = true;
        }
        return this.zzb.zze(zzacoVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ com.google.android.gms.internal.ads.zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ java.util.List zzd() {
        return com.google.android.gms.internal.ads.zzfxn.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(com.google.android.gms.internal.ads.zzacq zzacqVar) {
        this.zza = zzacqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        com.google.android.gms.internal.ads.zzajt zzajtVar = this.zzb;
        if (zzajtVar != null) {
            zzajtVar.zzj(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        try {
            return zza(zzacoVar);
        } catch (com.google.android.gms.internal.ads.zzbc unused) {
            return false;
        }
    }
}
