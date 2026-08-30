package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfra {
    private final java.lang.String zza;
    private final long zzb;

    public zzfra() {
        this.zza = null;
        this.zzb = -1L;
    }

    public zzfra(java.lang.String str, long j) {
        this.zza = str;
        this.zzb = j;
    }

    public final long zza() {
        return this.zzb;
    }

    public final java.lang.String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb > 0;
    }
}
