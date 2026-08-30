package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzegs {
    private final com.google.android.gms.internal.ads.zzfdb zza;
    private final com.google.android.gms.internal.ads.zzdpj zzb;
    private final com.google.android.gms.internal.ads.zzdrw zzc;

    public zzegs(com.google.android.gms.internal.ads.zzfdb zzfdbVar, com.google.android.gms.internal.ads.zzdpj zzdpjVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = zzfdbVar;
        this.zzb = zzdpjVar;
        this.zzc = zzdrwVar;
    }

    public final void zza(com.google.android.gms.internal.ads.zzfbr zzfbrVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, int i, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzeda zzedaVar, long j) {
        com.google.android.gms.internal.ads.zzdpi zzdpiVarZza;
        com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = this.zzc.zza();
        zzdrvVarZza.zzd(zzfbrVar);
        zzdrvVarZza.zzc(zzfboVar);
        zzdrvVarZza.zzb("action", "adapter_status");
        zzdrvVarZza.zzb("adapter_l", java.lang.String.valueOf(j));
        zzdrvVarZza.zzb("sc", java.lang.Integer.toString(i));
        if (zzedaVar != null) {
            zzdrvVarZza.zzb("arec", java.lang.Integer.toString(zzedaVar.zzb().zza));
            java.lang.String strZza = this.zza.zza(zzedaVar.getMessage());
            if (strZza != null) {
                zzdrvVarZza.zzb("areec", strZza);
            }
        }
        com.google.android.gms.internal.ads.zzdpj zzdpjVar = this.zzb;
        java.util.Iterator it = zzfboVar.zzt.iterator();
        do {
            if (!it.hasNext()) {
                zzdpiVarZza = null;
                break;
            }
            zzdpiVarZza = zzdpjVar.zza((java.lang.String) it.next());
        } while (zzdpiVarZza == null);
        if (zzdpiVarZza != null) {
            zzdrvVarZza.zzb("ancn", zzdpiVarZza.zza);
            com.google.android.gms.internal.ads.zzbrs zzbrsVar = zzdpiVarZza.zzb;
            if (zzbrsVar != null) {
                zzdrvVarZza.zzb("adapter_v", zzbrsVar.toString());
            }
            com.google.android.gms.internal.ads.zzbrs zzbrsVar2 = zzdpiVarZza.zzc;
            if (zzbrsVar2 != null) {
                zzdrvVarZza.zzb("adapter_sv", zzbrsVar2.toString());
            }
        }
        zzdrvVarZza.zzg();
    }
}
