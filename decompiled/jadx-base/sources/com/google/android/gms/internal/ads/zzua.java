package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzua extends com.google.android.gms.internal.ads.zzbq {
    private final com.google.android.gms.internal.ads.zzar zzb;

    public zzua(com.google.android.gms.internal.ads.zzar zzarVar) {
        this.zzb = zzarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zza(java.lang.Object obj) {
        return obj == com.google.android.gms.internal.ads.zztz.zzc ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final com.google.android.gms.internal.ads.zzbo zzd(int i, com.google.android.gms.internal.ads.zzbo zzboVar, boolean z) {
        zzboVar.zzi(z ? 0 : null, z ? com.google.android.gms.internal.ads.zztz.zzc : null, 0, androidx.media3.common.C.TIME_UNSET, 0L, com.google.android.gms.internal.ads.zzb.zza, true);
        return zzboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final com.google.android.gms.internal.ads.zzbp zze(int i, com.google.android.gms.internal.ads.zzbp zzbpVar, long j) {
        zzbpVar.zza(com.google.android.gms.internal.ads.zzbp.zza, this.zzb, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, false, true, null, 0L, androidx.media3.common.C.TIME_UNSET, 0, 0, 0L);
        zzbpVar.zzk = true;
        return zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final java.lang.Object zzf(int i) {
        return com.google.android.gms.internal.ads.zztz.zzc;
    }
}
