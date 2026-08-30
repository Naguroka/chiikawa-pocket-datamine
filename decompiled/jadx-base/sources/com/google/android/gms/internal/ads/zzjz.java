package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzjz {
    public com.google.android.gms.internal.ads.zzlb zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzjz(com.google.android.gms.internal.ads.zzlb zzlbVar) {
        this.zza = zzlbVar;
    }

    public final void zza(int i) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i);
        this.zzb += i;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzlb zzlbVar) {
        this.zze |= this.zza != zzlbVar;
        this.zza = zzlbVar;
    }

    public final void zzc(int i) {
        if (this.zzc && this.zzd != 5) {
            com.google.android.gms.internal.ads.zzcw.zzd(i == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i;
    }
}
