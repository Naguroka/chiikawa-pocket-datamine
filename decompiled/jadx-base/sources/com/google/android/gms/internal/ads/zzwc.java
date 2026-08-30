package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzwc extends com.google.android.gms.internal.ads.zzbq {
    private static final java.lang.Object zzb = new java.lang.Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final com.google.android.gms.internal.ads.zzar zzf;
    private final com.google.android.gms.internal.ads.zzal zzg;

    static {
        com.google.android.gms.internal.ads.zzaf zzafVar = new com.google.android.gms.internal.ads.zzaf();
        zzafVar.zza("SinglePeriodTimeline");
        zzafVar.zzb(android.net.Uri.EMPTY);
        zzafVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zza(java.lang.Object obj) {
        return zzb.equals(obj) ? 0 : -1;
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
        com.google.android.gms.internal.ads.zzcw.zza(i, 0, 1);
        zzboVar.zzi(null, z ? zzb : null, 0, this.zzc, 0L, com.google.android.gms.internal.ads.zzb.zza, false);
        return zzboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final com.google.android.gms.internal.ads.zzbp zze(int i, com.google.android.gms.internal.ads.zzbp zzbpVar, long j) {
        com.google.android.gms.internal.ads.zzcw.zza(i, 0, 1);
        java.lang.Object obj = com.google.android.gms.internal.ads.zzbp.zza;
        com.google.android.gms.internal.ads.zzar zzarVar = this.zzf;
        long j2 = this.zzd;
        zzbpVar.zza(obj, zzarVar, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, this.zze, false, this.zzg, 0L, j2, 0, 0, 0L);
        return zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final java.lang.Object zzf(int i) {
        com.google.android.gms.internal.ads.zzcw.zza(i, 0, 1);
        return zzb;
    }

    public zzwc(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, java.lang.Object obj, com.google.android.gms.internal.ads.zzar zzarVar, com.google.android.gms.internal.ads.zzal zzalVar) {
        this.zzc = j4;
        this.zzd = j5;
        this.zze = z;
        zzarVar.getClass();
        this.zzf = zzarVar;
        this.zzg = zzalVar;
    }
}
