package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzly implements com.google.android.gms.internal.measurement.zznf {
    private static final com.google.android.gms.internal.measurement.zzly zza = new com.google.android.gms.internal.measurement.zzly();

    private zzly() {
    }

    public static com.google.android.gms.internal.measurement.zzly zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final com.google.android.gms.internal.measurement.zzne zzb(java.lang.Class cls) {
        if (!com.google.android.gms.internal.measurement.zzmd.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        try {
            return (com.google.android.gms.internal.measurement.zzne) com.google.android.gms.internal.measurement.zzmd.zzci(cls.asSubclass(com.google.android.gms.internal.measurement.zzmd.class)).zzl(3, null, null);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final boolean zzc(java.lang.Class cls) {
        return com.google.android.gms.internal.measurement.zzmd.class.isAssignableFrom(cls);
    }
}
