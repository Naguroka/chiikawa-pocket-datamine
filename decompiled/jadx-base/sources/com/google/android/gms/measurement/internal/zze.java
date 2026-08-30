package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zze {
    private final com.google.android.gms.measurement.internal.zzju zza;

    zze(com.google.android.gms.measurement.internal.zzju zzjuVar) {
        this.zza = zzjuVar;
    }

    static com.google.android.gms.measurement.internal.zze zza(java.lang.String str) {
        return new com.google.android.gms.measurement.internal.zze((android.text.TextUtils.isEmpty(str) || str.length() > 1) ? com.google.android.gms.measurement.internal.zzju.UNINITIALIZED : com.google.android.gms.measurement.internal.zzjx.zzg(str.charAt(0)));
    }

    final com.google.android.gms.measurement.internal.zzju zzb() {
        return this.zza;
    }

    final java.lang.String zzc() {
        return java.lang.String.valueOf(com.google.android.gms.measurement.internal.zzjx.zza(this.zza));
    }
}
