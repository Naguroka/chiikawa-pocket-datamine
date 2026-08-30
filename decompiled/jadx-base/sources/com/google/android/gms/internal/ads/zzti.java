package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzti implements com.google.android.gms.internal.ads.zzuz {
    private final com.google.android.gms.internal.ads.zzacs zza;
    private com.google.android.gms.internal.ads.zzacn zzb;
    private com.google.android.gms.internal.ads.zzaco zzc;

    public zzti(com.google.android.gms.internal.ads.zzacs zzacsVar) {
        this.zza = zzacsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final int zza(com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzacn zzacnVar = this.zzb;
        zzacnVar.getClass();
        com.google.android.gms.internal.ads.zzaco zzacoVar = this.zzc;
        zzacoVar.getClass();
        return zzacnVar.zzb(zzacoVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long zzb() {
        com.google.android.gms.internal.ads.zzaco zzacoVar = this.zzc;
        if (zzacoVar != null) {
            return zzacoVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void zzc() {
        com.google.android.gms.internal.ads.zzacn zzacnVar = this.zzb;
        if (zzacnVar != null && (zzacnVar instanceof com.google.android.gms.internal.ads.zzahs)) {
            ((com.google.android.gms.internal.ads.zzahs) zzacnVar).zza();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    @Override // com.google.android.gms.internal.ads.zzuz
    public final void zzd(com.google.android.gms.internal.ads.zzl zzlVar, android.net.Uri uri, java.util.Map map, long j, long j2, com.google.android.gms.internal.ads.zzacq zzacqVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzacc zzaccVar = new com.google.android.gms.internal.ads.zzacc(zzlVar, j, j2);
        this.zzc = zzaccVar;
        if (this.zzb != null) {
            return;
        }
        com.google.android.gms.internal.ads.zzacn[] zzacnVarArrZza = this.zza.zza(uri, map);
        int length = zzacnVarArrZza.length;
        com.google.android.gms.internal.ads.zzfxk zzfxkVarZzi = com.google.android.gms.internal.ads.zzfxn.zzi(length);
        if (length == 1) {
            this.zzb = zzacnVarArrZza[0];
        } else {
            for (int i = 0; i < length; i++) {
                com.google.android.gms.internal.ads.zzacn zzacnVar = zzacnVarArrZza[i];
                try {
                    if (zzacnVar.zzi(zzaccVar)) {
                        this.zzb = zzacnVar;
                        com.google.android.gms.internal.ads.zzcw.zzf(zzacnVar != null || zzaccVar.zzf() == j);
                        zzaccVar.zzj();
                        break;
                    } else {
                        zzfxkVarZzi.zzh(zzacnVar.zzd());
                        boolean z = this.zzb != null || zzaccVar.zzf() == j;
                        com.google.android.gms.internal.ads.zzcw.zzf(z);
                        zzaccVar.zzj();
                    }
                } catch (java.io.EOFException unused) {
                    if (this.zzb != null || zzaccVar.zzf() == j) {
                    }
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.internal.ads.zzcw.zzf(this.zzb != null || zzaccVar.zzf() == j);
                    zzaccVar.zzj();
                    throw th;
                }
                com.google.android.gms.internal.ads.zzcw.zzf(z);
                zzaccVar.zzj();
            }
            if (this.zzb == null) {
                java.util.Iterator it = com.google.android.gms.internal.ads.zzfyd.zzb(com.google.android.gms.internal.ads.zzfxn.zzm(zzacnVarArrZza), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzth
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final java.lang.Object apply(java.lang.Object obj) {
                        com.google.android.gms.internal.ads.zzacn zzacnVar2 = (com.google.android.gms.internal.ads.zzacn) obj;
                        zzacnVar2.zzc();
                        return zzacnVar2.getClass().getSimpleName();
                    }
                }).iterator();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                com.google.android.gms.internal.ads.zzfuf.zzc(sb, it, ", ");
                throw new com.google.android.gms.internal.ads.zzwk("None of the available extractors (" + sb.toString() + ") could read the stream.", uri, zzfxkVarZzi.zzi());
            }
        }
        this.zzb.zze(zzacqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void zzf(long j, long j2) {
        com.google.android.gms.internal.ads.zzacn zzacnVar = this.zzb;
        zzacnVar.getClass();
        zzacnVar.zzf(j, j2);
    }
}
