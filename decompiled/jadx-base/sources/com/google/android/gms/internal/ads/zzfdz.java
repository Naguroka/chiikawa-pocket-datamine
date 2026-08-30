package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfdz {
    private final com.google.android.gms.internal.ads.zzfdy zza = new com.google.android.gms.internal.ads.zzfdy();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    zzfdz() {
    }

    public final com.google.android.gms.internal.ads.zzfdy zza() {
        com.google.android.gms.internal.ads.zzfdy zzfdyVar = this.zza;
        com.google.android.gms.internal.ads.zzfdy zzfdyVarClone = zzfdyVar.clone();
        zzfdyVar.zza = false;
        zzfdyVar.zzb = false;
        return zzfdyVarClone;
    }

    public final java.lang.String zzb() {
        return "\n\tPool does not exist: " + this.zzd + "\n\tNew pools created: " + this.zzb + "\n\tPools removed: " + this.zzc + "\n\tEntries added: " + this.zzf + "\n\tNo entries retrieved: " + this.zze + "\n";
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}
