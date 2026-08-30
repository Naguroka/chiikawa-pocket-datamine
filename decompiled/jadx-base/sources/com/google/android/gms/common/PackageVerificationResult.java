package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class PackageVerificationResult {
    private final java.lang.String zza;
    private final boolean zzb;

    @javax.annotation.Nullable
    private final java.lang.String zzc;

    @javax.annotation.Nullable
    private final java.lang.Throwable zzd;

    private PackageVerificationResult(java.lang.String str, int i, boolean z, @javax.annotation.Nullable java.lang.String str2, @javax.annotation.Nullable java.lang.Throwable th) {
        this.zza = str;
        this.zzb = z;
        this.zzc = str2;
        this.zzd = th;
    }

    public static com.google.android.gms.common.PackageVerificationResult zza(java.lang.String str, java.lang.String str2, @javax.annotation.Nullable java.lang.Throwable th) {
        return new com.google.android.gms.common.PackageVerificationResult(str, 1, false, str2, th);
    }

    public static com.google.android.gms.common.PackageVerificationResult zzd(java.lang.String str, int i) {
        return new com.google.android.gms.common.PackageVerificationResult(str, i, true, null, null);
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        java.lang.String str = this.zzc;
        java.lang.Throwable th = this.zzd;
        java.lang.String strConcat = "PackageVerificationRslt: ".concat(java.lang.String.valueOf(str));
        if (th == null) {
            throw new java.lang.SecurityException(strConcat);
        }
        throw new java.lang.SecurityException(strConcat, th);
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
