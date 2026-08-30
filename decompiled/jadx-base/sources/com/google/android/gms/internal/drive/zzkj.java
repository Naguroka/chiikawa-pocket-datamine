package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzkj implements com.google.android.gms.internal.drive.zzlp {
    private static final com.google.android.gms.internal.drive.zzkj zzrp = new com.google.android.gms.internal.drive.zzkj();

    private zzkj() {
    }

    public static com.google.android.gms.internal.drive.zzkj zzcv() {
        return zzrp;
    }

    @Override // com.google.android.gms.internal.drive.zzlp
    public final boolean zzb(java.lang.Class<?> cls) {
        return com.google.android.gms.internal.drive.zzkk.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.drive.zzlp
    public final com.google.android.gms.internal.drive.zzlo zzc(java.lang.Class<?> cls) {
        if (!com.google.android.gms.internal.drive.zzkk.class.isAssignableFrom(cls)) {
            java.lang.String strValueOf = java.lang.String.valueOf(cls.getName());
            throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new java.lang.String("Unsupported message type: "));
        }
        try {
            return (com.google.android.gms.internal.drive.zzlo) com.google.android.gms.internal.drive.zzkk.zzd(cls.asSubclass(com.google.android.gms.internal.drive.zzkk.class)).zza(com.google.android.gms.internal.drive.zzkk.zze.zzrz, (java.lang.Object) null, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(cls.getName());
            throw new java.lang.RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new java.lang.String("Unable to get message info for "), e);
        }
    }
}
