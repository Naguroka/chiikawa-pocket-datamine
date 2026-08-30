package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfcv {
    private final com.google.android.gms.internal.ads.zzfbo zza;
    private final com.google.android.gms.internal.ads.zzfbr zzb;
    private final com.google.android.gms.internal.ads.zzfja zzc;
    private final com.google.android.gms.internal.ads.zzfir zzd;
    private final com.google.android.gms.internal.ads.zzfhh zze;
    private final com.google.android.gms.internal.ads.zzcmk zzf;

    public zzfcv(com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzfir zzfirVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar, com.google.android.gms.internal.ads.zzcmk zzcmkVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar) {
        this.zza = zzfboVar;
        this.zzb = zzfbrVar;
        this.zzc = zzfjaVar;
        this.zzd = zzfirVar;
        this.zzf = zzcmkVar;
        this.zze = zzfhhVar;
    }

    public final void zza(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((java.lang.String) it.next(), 2);
        }
    }

    public final void zzb(java.lang.String str, int i) {
        com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zza;
        if (zzfboVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i);
            return;
        }
        this.zzc.zzd(str, zzfboVar.zzax, this.zze);
    }

    public final void zzc(java.util.List list, int i) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.google.android.gms.internal.ads.zzgch.zzr((((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjT)).booleanValue() && com.google.android.gms.internal.ads.zzcmk.zzj(str)) ? this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzbc.zze()) : com.google.android.gms.internal.ads.zzgch.zzh(str), new com.google.android.gms.internal.ads.zzfcu(this, i), com.google.android.gms.internal.ads.zzbzw.zza);
        }
    }
}
