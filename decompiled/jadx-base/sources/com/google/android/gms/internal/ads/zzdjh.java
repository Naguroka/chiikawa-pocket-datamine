package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdjh {
    private final com.google.android.gms.internal.ads.zzdrw zza;

    zzdjh(com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = zzdrwVar;
    }

    public final void zza(android.view.View view, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmK)).booleanValue() || view == null) {
            return;
        }
        java.lang.String str = true != com.google.android.gms.ads.internal.util.zzac.zza(view) ? "0" : "1";
        com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = this.zza.zza();
        zzdrvVarZza.zzb("action", "hcp");
        zzdrvVarZza.zzb("hcp", str);
        zzdrvVarZza.zzc(zzfboVar);
        zzdrvVarZza.zzg();
    }
}
