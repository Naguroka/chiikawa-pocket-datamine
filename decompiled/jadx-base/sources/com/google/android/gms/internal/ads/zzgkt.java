package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgkt {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzgkt.class.getName());
    private static final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean(false);

    private zzgkt() {
    }

    static java.lang.Boolean zza() {
        try {
            return (java.lang.Boolean) java.lang.Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zza.logp(java.util.logging.Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return false;
        }
    }

    public static boolean zzb() {
        return zzb.get();
    }
}
