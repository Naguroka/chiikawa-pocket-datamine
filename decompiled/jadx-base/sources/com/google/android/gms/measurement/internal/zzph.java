package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzph {
    private final java.lang.String zza;
    private final java.util.Map zzb;
    private final com.google.android.gms.measurement.internal.zzmf zzc;
    private final com.google.android.gms.internal.measurement.zzim zzd;

    zzph(java.lang.String str, java.util.Map map, com.google.android.gms.measurement.internal.zzmf zzmfVar, com.google.android.gms.internal.measurement.zzim zzimVar) {
        this.zza = str;
        this.zzb = map;
        this.zzc = zzmfVar;
        this.zzd = zzimVar;
    }

    public final com.google.android.gms.measurement.internal.zzmf zza() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.measurement.zzim zzb() {
        return this.zzd;
    }

    public final java.lang.String zzc() {
        return this.zza;
    }

    public final java.util.Map zzd() {
        java.util.Map map = this.zzb;
        return map == null ? java.util.Collections.emptyMap() : map;
    }
}
