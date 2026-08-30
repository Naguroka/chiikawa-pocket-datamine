package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzavi {
    private static javax.crypto.Cipher zza;
    private static final java.lang.Object zzb = new java.lang.Object();
    private static final java.lang.Object zzc = new java.lang.Object();

    public zzavi(java.security.SecureRandom secureRandom) {
    }

    private static final javax.crypto.Cipher zzc() throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException {
        javax.crypto.Cipher cipher;
        synchronized (zzc) {
            if (zza == null) {
                zza = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = zza;
        }
        return cipher;
    }

    public final java.lang.String zza(byte[] bArr, byte[] bArr2) throws com.google.android.gms.internal.ads.zzavh {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(1, secretKeySpec, (java.security.SecureRandom) null);
                bArrDoFinal = zzc().doFinal(bArr2);
                iv = zzc().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return com.google.android.gms.internal.ads.zzatr.zza(bArr3, false);
        } catch (java.security.InvalidKeyException e) {
            throw new com.google.android.gms.internal.ads.zzavh(this, e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new com.google.android.gms.internal.ads.zzavh(this, e2);
        } catch (javax.crypto.BadPaddingException e3) {
            throw new com.google.android.gms.internal.ads.zzavh(this, e3);
        } catch (javax.crypto.IllegalBlockSizeException e4) {
            throw new com.google.android.gms.internal.ads.zzavh(this, e4);
        } catch (javax.crypto.NoSuchPaddingException e5) {
            throw new com.google.android.gms.internal.ads.zzavh(this, e5);
        }
    }

    public final byte[] zzb(byte[] bArr, java.lang.String str) throws com.google.android.gms.internal.ads.zzavh {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrZzb = com.google.android.gms.internal.ads.zzatr.zzb(str, false);
            int length2 = bArrZzb.length;
            if (length2 <= 16) {
                throw new com.google.android.gms.internal.ads.zzavh(this);
            }
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrZzb);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(bArr2));
                bArrDoFinal = zzc().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (java.lang.IllegalArgumentException e) {
            throw new com.google.android.gms.internal.ads.zzavh(this, e);
        } catch (java.security.InvalidAlgorithmParameterException e2) {
            throw new com.google.android.gms.internal.ads.zzavh(this, e2);
        } catch (java.security.InvalidKeyException e3) {
            throw new com.google.android.gms.internal.ads.zzavh(this, e3);
        } catch (java.security.NoSuchAlgorithmException e4) {
            throw new com.google.android.gms.internal.ads.zzavh(this, e4);
        } catch (javax.crypto.BadPaddingException e5) {
            throw new com.google.android.gms.internal.ads.zzavh(this, e5);
        } catch (javax.crypto.IllegalBlockSizeException e6) {
            throw new com.google.android.gms.internal.ads.zzavh(this, e6);
        } catch (javax.crypto.NoSuchPaddingException e7) {
            throw new com.google.android.gms.internal.ads.zzavh(this, e7);
        }
    }
}
