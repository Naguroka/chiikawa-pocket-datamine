package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgha implements com.google.android.gms.internal.ads.zzgdn {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final java.util.Set zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzgdn zze;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzc = java.util.Collections.unmodifiableSet(hashSet);
    }

    @java.lang.Deprecated
    zzgha(com.google.android.gms.internal.ads.zzgsp zzgspVar, com.google.android.gms.internal.ads.zzgdn zzgdnVar) throws java.security.GeneralSecurityException {
        if (!zzc.contains(zzgspVar.zzi())) {
            throw new java.lang.IllegalArgumentException("Unsupported DEK key type: " + zzgspVar.zzi() + ". Only Tink AEAD key types are supported.");
        }
        this.zzd = zzgspVar.zzi();
        com.google.android.gms.internal.ads.zzgsn zzgsnVarZzb = com.google.android.gms.internal.ads.zzgsp.zzb(zzgspVar);
        zzgsnVarZzb.zza(com.google.android.gms.internal.ads.zzgtp.RAW);
        com.google.android.gms.internal.ads.zzgeq.zza(((com.google.android.gms.internal.ads.zzgsp) zzgsnVarZzb.zzbr()).zzaV());
        this.zze = zzgdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        try {
            java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new java.security.GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrZza = this.zze.zza(bArr3, zzb);
            java.lang.String str = this.zzd;
            com.google.android.gms.internal.ads.zzgwj zzgwjVar = com.google.android.gms.internal.ads.zzgwj.zzb;
            return ((com.google.android.gms.internal.ads.zzgdn) com.google.android.gms.internal.ads.zzgmh.zza().zzc(com.google.android.gms.internal.ads.zzgmk.zzc().zza(com.google.android.gms.internal.ads.zzgnh.zza(str, com.google.android.gms.internal.ads.zzgwj.zzv(bArrZza, 0, bArrZza.length), com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, com.google.android.gms.internal.ads.zzgtp.RAW, null), com.google.android.gms.internal.ads.zzgdw.zza()), com.google.android.gms.internal.ads.zzgdn.class)).zza(bArr4, bArr2);
        } catch (java.lang.IndexOutOfBoundsException | java.lang.NegativeArraySizeException | java.nio.BufferUnderflowException e) {
            throw new java.security.GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
