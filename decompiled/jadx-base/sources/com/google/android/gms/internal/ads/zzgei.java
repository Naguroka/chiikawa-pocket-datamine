package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgei {
    private static final java.util.concurrent.CopyOnWriteArrayList zza = new java.util.concurrent.CopyOnWriteArrayList();

    public static com.google.android.gms.internal.ads.zzgeh zza(java.lang.String str) throws java.security.GeneralSecurityException {
        for (com.google.android.gms.internal.ads.zzgeh zzgehVar : zza) {
            if (zzgehVar.zza()) {
                return zzgehVar;
            }
        }
        throw new java.security.GeneralSecurityException("No KMS client does support: ".concat(java.lang.String.valueOf(str)));
    }
}
