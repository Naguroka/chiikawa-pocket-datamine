package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgjo extends java.lang.ThreadLocal {
    zzgjo() {
    }

    @javax.annotation.Nullable
    protected static final javax.crypto.Cipher zza() {
        try {
            javax.crypto.Cipher cipher = (javax.crypto.Cipher) com.google.android.gms.internal.ads.zzguw.zza.zza("ChaCha20-Poly1305");
            if (com.google.android.gms.internal.ads.zzgjp.zzf(cipher)) {
                return cipher;
            }
            return null;
        } catch (java.security.GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    @javax.annotation.Nullable
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        return zza();
    }
}
