package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaec implements com.google.android.gms.internal.ads.zzadm {
    final /* synthetic */ com.google.android.gms.internal.ads.zzaef zza;
    private final long zzb;

    public zzaec(com.google.android.gms.internal.ads.zzaef zzaefVar, long j) {
        this.zza = zzaefVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        com.google.android.gms.internal.ads.zzadk zzadkVarZza = this.zza.zzi[0].zza(j);
        int i = 1;
        while (true) {
            com.google.android.gms.internal.ads.zzaef zzaefVar = this.zza;
            if (i >= zzaefVar.zzi.length) {
                return zzadkVarZza;
            }
            com.google.android.gms.internal.ads.zzadk zzadkVarZza2 = zzaefVar.zzi[i].zza(j);
            if (zzadkVarZza2.zza.zzc < zzadkVarZza.zza.zzc) {
                zzadkVarZza = zzadkVarZza2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
