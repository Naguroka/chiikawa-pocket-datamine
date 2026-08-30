package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdnx implements com.google.android.gms.internal.ads.zzbkg {
    private final com.google.android.gms.internal.ads.zzcxa zza;
    private final com.google.android.gms.internal.ads.zzbwi zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    public zzdnx(com.google.android.gms.internal.ads.zzcxa zzcxaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        this.zza = zzcxaVar;
        this.zzb = zzfboVar.zzl;
        this.zzc = zzfboVar.zzj;
        this.zzd = zzfboVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    @javax.annotation.ParametersAreNonnullByDefault
    public final void zza(com.google.android.gms.internal.ads.zzbwi zzbwiVar) {
        int i;
        java.lang.String str;
        com.google.android.gms.internal.ads.zzbwi zzbwiVar2 = this.zzb;
        if (zzbwiVar2 != null) {
            zzbwiVar = zzbwiVar2;
        }
        if (zzbwiVar != null) {
            str = zzbwiVar.zza;
            i = zzbwiVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new com.google.android.gms.internal.ads.zzbvt(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzc() {
        this.zza.zzf();
    }
}
