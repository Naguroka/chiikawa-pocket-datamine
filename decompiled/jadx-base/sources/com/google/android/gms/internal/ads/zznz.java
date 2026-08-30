package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zznz {
    final /* synthetic */ com.google.android.gms.internal.ads.zzoa zza;
    private final java.lang.String zzb;
    private int zzc;
    private long zzd;
    private com.google.android.gms.internal.ads.zzug zze;
    private boolean zzf;
    private boolean zzg;

    public zznz(com.google.android.gms.internal.ads.zzoa zzoaVar, java.lang.String str, int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        this.zza = zzoaVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzugVar == null ? -1L : zzugVar.zzd;
        if (zzugVar == null || !zzugVar.zzb()) {
            return;
        }
        this.zze = zzugVar;
    }

    public final void zzg(int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        if (this.zzd == -1 && i == this.zzc && zzugVar != null) {
            com.google.android.gms.internal.ads.zzoa zzoaVar = this.zza;
            long j = zzugVar.zzd;
            if (j >= zzoaVar.zzl()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        if (zzugVar == null) {
            return i == this.zzc;
        }
        com.google.android.gms.internal.ads.zzug zzugVar2 = this.zze;
        if (zzugVar2 == null) {
            return !zzugVar.zzb() && zzugVar.zzd == this.zzd;
        }
        return zzugVar.zzd == zzugVar2.zzd && zzugVar.zzb == zzugVar2.zzb && zzugVar.zzc == zzugVar2.zzc;
    }

    public final boolean zzk(com.google.android.gms.internal.ads.zzlu zzluVar) {
        com.google.android.gms.internal.ads.zzug zzugVar = zzluVar.zzd;
        if (zzugVar == null) {
            return this.zzc != zzluVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzugVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        com.google.android.gms.internal.ads.zzbq zzbqVar = zzluVar.zzb;
        int iZza = zzbqVar.zza(zzugVar.zza);
        int iZza2 = zzbqVar.zza(this.zze.zza);
        com.google.android.gms.internal.ads.zzug zzugVar2 = zzluVar.zzd;
        if (zzugVar2.zzd < this.zze.zzd || iZza < iZza2) {
            return false;
        }
        if (iZza > iZza2) {
            return true;
        }
        if (!zzugVar2.zzb()) {
            int i = zzluVar.zzd.zze;
            return i == -1 || i > this.zze.zzb;
        }
        com.google.android.gms.internal.ads.zzug zzugVar3 = zzluVar.zzd;
        int i2 = zzugVar3.zzb;
        int i3 = zzugVar3.zzc;
        com.google.android.gms.internal.ads.zzug zzugVar4 = this.zze;
        int i4 = zzugVar4.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzugVar4.zzc;
        }
        return true;
    }

    public final boolean zzl(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzbq zzbqVar2) {
        int i = this.zzc;
        if (i < zzbqVar.zzc()) {
            zzbqVar.zze(i, this.zza.zzc, 0L);
            int i2 = this.zza.zzc.zzn;
            while (true) {
                if (i2 > this.zza.zzc.zzo) {
                    i = -1;
                    break;
                }
                int iZza = zzbqVar2.zza(zzbqVar.zzf(i2));
                if (iZza != -1) {
                    i = zzbqVar2.zzd(iZza, this.zza.zzd, false).zzc;
                    break;
                }
                i2++;
            }
        } else if (i >= zzbqVar2.zzc()) {
            i = -1;
            break;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        com.google.android.gms.internal.ads.zzug zzugVar = this.zze;
        return zzugVar == null || zzbqVar2.zza(zzugVar.zza) != -1;
    }
}
