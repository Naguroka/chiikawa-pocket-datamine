package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzwh extends com.google.android.gms.internal.ads.zztu {
    private final com.google.android.gms.internal.ads.zzar zzc;

    public zzwh(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzar zzarVar) {
        super(zzbqVar);
        this.zzc = zzarVar;
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzbq
    public final com.google.android.gms.internal.ads.zzbp zze(int i, com.google.android.gms.internal.ads.zzbp zzbpVar, long j) {
        this.zzb.zze(i, zzbpVar, j);
        com.google.android.gms.internal.ads.zzar zzarVar = this.zzc;
        zzbpVar.zzd = zzarVar;
        com.google.android.gms.internal.ads.zzam zzamVar = zzarVar.zzb;
        zzbpVar.zzc = null;
        return zzbpVar;
    }
}
