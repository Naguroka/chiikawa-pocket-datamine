package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgkx {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    /* synthetic */ zzgkx(java.util.Map map, java.util.Map map2, com.google.android.gms.internal.ads.zzgkw zzgkwVar) {
        this.zza = map;
        this.zzb = map2;
    }

    public static com.google.android.gms.internal.ads.zzgkv zza() {
        return new com.google.android.gms.internal.ads.zzgkv(null);
    }

    public final java.lang.Enum zzb(java.lang.Object obj) throws java.security.GeneralSecurityException {
        java.lang.Enum r0 = (java.lang.Enum) this.zzb.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new java.security.GeneralSecurityException("Unable to convert object enum: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
    }

    public final java.lang.Object zzc(java.lang.Enum r3) throws java.security.GeneralSecurityException {
        java.lang.Object obj = this.zza.get(r3);
        if (obj != null) {
            return obj;
        }
        throw new java.security.GeneralSecurityException("Unable to convert proto enum: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(r3))));
    }
}
