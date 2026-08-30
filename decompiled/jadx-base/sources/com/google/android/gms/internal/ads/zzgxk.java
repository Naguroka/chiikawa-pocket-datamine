package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgxk implements com.google.android.gms.internal.ads.zzgza {
    private static final com.google.android.gms.internal.ads.zzgxk zza = new com.google.android.gms.internal.ads.zzgxk();

    private zzgxk() {
    }

    public static com.google.android.gms.internal.ads.zzgxk zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final com.google.android.gms.internal.ads.zzgyz zzb(java.lang.Class cls) {
        if (!com.google.android.gms.internal.ads.zzgxr.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        try {
            return (com.google.android.gms.internal.ads.zzgyz) com.google.android.gms.internal.ads.zzgxr.zzbh(cls.asSubclass(com.google.android.gms.internal.ads.zzgxr.class)).zzbO();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final boolean zzc(java.lang.Class cls) {
        return com.google.android.gms.internal.ads.zzgxr.class.isAssignableFrom(cls);
    }
}
