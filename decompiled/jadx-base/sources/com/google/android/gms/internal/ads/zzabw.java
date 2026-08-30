package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzabw {
    public static final com.google.android.gms.internal.ads.zzabw zza = new com.google.android.gms.internal.ads.zzabw(-3, androidx.media3.common.C.TIME_UNSET, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzabw(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static com.google.android.gms.internal.ads.zzabw zzd(long j, long j2) {
        return new com.google.android.gms.internal.ads.zzabw(-1, j, j2);
    }

    public static com.google.android.gms.internal.ads.zzabw zze(long j) {
        return new com.google.android.gms.internal.ads.zzabw(0, androidx.media3.common.C.TIME_UNSET, j);
    }

    public static com.google.android.gms.internal.ads.zzabw zzf(long j, long j2) {
        return new com.google.android.gms.internal.ads.zzabw(-2, j, j2);
    }
}
