package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzad {
    private static final com.google.android.gms.common.zzad zzf = new com.google.android.gms.common.zzad(true, 3, 1, null, null, -1, null);
    final boolean zza;

    @javax.annotation.Nullable
    final java.lang.String zzb;

    @javax.annotation.Nullable
    final java.lang.Throwable zzc;

    @javax.annotation.Nullable
    final com.google.android.gms.common.zzad zzd;
    final int zze;

    private zzad(boolean z, int i, int i2, @javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th, long j, @javax.annotation.Nullable com.google.android.gms.common.zzad zzadVar) {
        this.zza = z;
        this.zze = i;
        this.zzb = str;
        this.zzc = th;
        this.zzd = zzadVar;
    }

    @java.lang.Deprecated
    static com.google.android.gms.common.zzad zzb() {
        return zzf;
    }

    static com.google.android.gms.common.zzad zzc(java.lang.String str) {
        return new com.google.android.gms.common.zzad(false, 1, 5, str, null, -1L, null);
    }

    static com.google.android.gms.common.zzad zzd(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.gms.common.zzad(false, 1, 5, str, th, -1L, null);
    }

    static com.google.android.gms.common.zzad zzf(int i, long j, @javax.annotation.Nullable com.google.android.gms.common.zzad zzadVar) {
        return new com.google.android.gms.common.zzad(true, i, 1, null, null, j, zzadVar);
    }

    static com.google.android.gms.common.zzad zzg(int i, int i2, java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th) {
        return new com.google.android.gms.common.zzad(false, i, i2, str, th, -1L, null);
    }

    @javax.annotation.Nullable
    java.lang.String zza() {
        return this.zzb;
    }

    final void zze() {
        if (this.zza || !android.util.Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            android.util.Log.d("GoogleCertificatesRslt", zza(), this.zzc);
        } else {
            android.util.Log.d("GoogleCertificatesRslt", zza());
        }
    }
}
