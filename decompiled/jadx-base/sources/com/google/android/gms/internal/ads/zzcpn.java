package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcpn implements com.google.android.gms.internal.ads.zzcwn {
    private final com.google.android.gms.internal.ads.zzcex zza;
    private final com.google.android.gms.internal.ads.zzdrw zzb;
    private final com.google.android.gms.internal.ads.zzfbo zzc;

    zzcpn(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        this.zza = zzcexVar;
        this.zzb = zzdrwVar;
        this.zzc = zzfboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        com.google.android.gms.internal.ads.zzcex zzcexVar;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmK)).booleanValue() || (zzcexVar = this.zza) == null) {
            return;
        }
        java.lang.String str = true != com.google.android.gms.ads.internal.util.zzac.zza(zzcexVar.zzF()) ? "0" : "1";
        com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = this.zzb.zza();
        zzdrvVarZza.zzb("action", "hcp");
        zzdrvVarZza.zzb("hcp", str);
        zzdrvVarZza.zzc(this.zzc);
        zzdrvVarZza.zzg();
    }
}
