package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zztj implements com.google.android.gms.internal.ads.zzvy {
    public final com.google.android.gms.internal.ads.zzvy zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zztk zzb;
    private boolean zzc;

    public zztj(com.google.android.gms.internal.ads.zztk zztkVar, com.google.android.gms.internal.ads.zzvy zzvyVar) {
        this.zzb = zztkVar;
        this.zza = zzvyVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zza(com.google.android.gms.internal.ads.zzke zzkeVar, com.google.android.gms.internal.ads.zzhh zzhhVar, int i) {
        com.google.android.gms.internal.ads.zztk zztkVar = this.zzb;
        if (zztkVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhhVar.zzc(4);
            return -4;
        }
        long jZzb = zztkVar.zzb();
        int iZza = this.zza.zza(zzkeVar, zzhhVar, i);
        if (iZza != -5) {
            long j = this.zzb.zzb;
            if (j == Long.MIN_VALUE || ((iZza != -4 || zzhhVar.zze < j) && !(iZza == -3 && jZzb == Long.MIN_VALUE && !zzhhVar.zzd))) {
                return iZza;
            }
            zzhhVar.zzb();
            zzhhVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        com.google.android.gms.internal.ads.zzab zzabVar = zzkeVar.zza;
        zzabVar.getClass();
        int i2 = zzabVar.zzG;
        if (i2 != 0) {
            int i3 = this.zzb.zzb == Long.MIN_VALUE ? zzabVar.zzH : 0;
            com.google.android.gms.internal.ads.zzz zzzVarZzb = zzabVar.zzb();
            zzzVarZzb.zzG(i2);
            zzzVarZzb.zzH(i3);
            zzkeVar.zza = zzzVarZzb.zzag();
        } else if (zzabVar.zzH != 0) {
            i2 = 0;
            if (this.zzb.zzb == Long.MIN_VALUE) {
            }
            com.google.android.gms.internal.ads.zzz zzzVarZzb2 = zzabVar.zzb();
            zzzVarZzb2.zzG(i2);
            zzzVarZzb2.zzH(i3);
            zzkeVar.zza = zzzVarZzb2.zzag();
        }
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzd() throws java.io.IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
