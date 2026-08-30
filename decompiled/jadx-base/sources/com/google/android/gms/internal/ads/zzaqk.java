package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaqk {
    private final int zza;
    private final java.util.List zzb;
    private final int zzc;
    private final java.io.InputStream zzd;

    public zzaqk(int i, java.util.List list, int i2, java.io.InputStream inputStream) {
        this.zza = i;
        this.zzb = list;
        this.zzc = i2;
        this.zzd = inputStream;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final java.io.InputStream zzc() {
        java.io.InputStream inputStream = this.zzd;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final java.util.List zzd() {
        return java.util.Collections.unmodifiableList(this.zzb);
    }
}
