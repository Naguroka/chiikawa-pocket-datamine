package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzlg extends com.google.android.gms.internal.ads.zztu {
    private final com.google.android.gms.internal.ads.zzbp zzc;

    zzlg(com.google.android.gms.internal.ads.zzlh zzlhVar, com.google.android.gms.internal.ads.zzbq zzbqVar) {
        super(zzbqVar);
        this.zzc = new com.google.android.gms.internal.ads.zzbp();
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzbq
    public final com.google.android.gms.internal.ads.zzbo zzd(int i, com.google.android.gms.internal.ads.zzbo zzboVar, boolean z) {
        com.google.android.gms.internal.ads.zzbo zzboVarZzd = this.zzb.zzd(i, zzboVar, z);
        if (this.zzb.zze(zzboVarZzd.zzc, this.zzc, 0L).zzb()) {
            java.lang.Object obj = zzboVar.zza;
            java.lang.Object obj2 = zzboVar.zzb;
            int i2 = zzboVar.zzc;
            long j = zzboVar.zzd;
            long j2 = zzboVar.zze;
            zzboVarZzd.zzi(obj, obj2, i2, j, 0L, com.google.android.gms.internal.ads.zzb.zza, true);
        } else {
            zzboVarZzd.zzf = true;
        }
        return zzboVarZzd;
    }
}
