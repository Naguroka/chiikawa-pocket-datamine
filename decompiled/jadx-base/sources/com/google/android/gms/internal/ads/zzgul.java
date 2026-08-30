package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgul extends java.lang.ThreadLocal {
    zzgul() {
    }

    protected static final javax.crypto.Cipher zza() {
        try {
            return (javax.crypto.Cipher) com.google.android.gms.internal.ads.zzguw.zza.zza("AES/CTR/NOPADDING");
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        return zza();
    }
}
