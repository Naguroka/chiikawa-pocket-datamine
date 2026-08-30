package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaty {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static java.security.MessageDigest zzd;
    private static final java.lang.Object zze = new java.lang.Object();
    private static final java.lang.Object zzf = new java.lang.Object();
    static final java.util.concurrent.CountDownLatch zzb = new java.util.concurrent.CountDownLatch(1);

    static com.google.android.gms.internal.ads.zzatm zza(byte[] bArr, java.lang.String str) throws java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException {
        java.util.Vector vectorZzc = zzc(bArr, 255);
        if (vectorZzc == null || vectorZzc.isEmpty()) {
            return null;
        }
        com.google.android.gms.internal.ads.zzatm zzatmVarZza = com.google.android.gms.internal.ads.zzatn.zza();
        int size = vectorZzc.size();
        for (int i = 0; i < size; i++) {
            zzatmVarZza.zza(com.google.android.gms.internal.ads.zzgwj.zzv(zzh((byte[]) vectorZzc.get(i), str, false), 0, 256));
        }
        byte[] bArrZzf = zzf(bArr);
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = com.google.android.gms.internal.ads.zzgwj.zzb;
        zzatmVarZza.zzb(com.google.android.gms.internal.ads.zzgwj.zzv(bArrZzf, 0, bArrZzf.length));
        return zzatmVarZza;
    }

    static java.lang.String zzb(byte[] bArr, java.lang.String str) throws java.security.GeneralSecurityException, java.io.UnsupportedEncodingException {
        com.google.android.gms.internal.ads.zzatm zzatmVarZza = zza(bArr, str);
        return com.google.android.gms.internal.ads.zzatr.zza(zzatmVarZza == null ? zzh(zzg(4096).zzaV(), str, true) : ((com.google.android.gms.internal.ads.zzatn) zzatmVarZza.zzbr()).zzaV(), true);
    }

    static java.util.Vector zzc(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i2 = length + 254;
        java.util.Vector vector = new java.util.Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(java.util.Arrays.copyOfRange(bArr, i4, length2));
            } catch (java.lang.IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void zze() {
        synchronized (zzf) {
            if (!zza) {
                zza = true;
                new java.lang.Thread(new com.google.android.gms.internal.ads.zzatw(null)).start();
            }
        }
    }

    public static byte[] zzf(byte[] bArr) throws java.security.NoSuchAlgorithmException {
        byte[] bArrDigest;
        java.security.MessageDigest messageDigest;
        synchronized (zze) {
            zze();
            java.security.MessageDigest messageDigest2 = null;
            try {
                if (zzb.await(2L, java.util.concurrent.TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (java.lang.InterruptedException unused) {
            }
            if (messageDigest2 == null) {
                throw new java.security.NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigest2.reset();
            messageDigest2.update(bArr);
            bArrDigest = zzd.digest();
        }
        return bArrDigest;
    }

    static com.google.android.gms.internal.ads.zzasy zzg(int i) {
        com.google.android.gms.internal.ads.zzasc zzascVarZza = com.google.android.gms.internal.ads.zzasy.zza();
        zzascVarZza.zzD(4096L);
        return (com.google.android.gms.internal.ads.zzasy) zzascVarZza.zzbr();
    }

    private static byte[] zzh(byte[] bArr, java.lang.String str, boolean z) throws java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException {
        byte[] bArrArray;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = zzg(4096).zzaV();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new java.security.SecureRandom().nextBytes(bArr2);
            bArrArray = java.nio.ByteBuffer.allocate(i2).put(b).put(bArr).put(bArr2).array();
        } else {
            bArrArray = java.nio.ByteBuffer.allocate(i2).put(b).put(bArr).array();
        }
        if (z) {
            bArrArray = java.nio.ByteBuffer.allocate(256).put(zzf(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        com.google.android.gms.internal.ads.zzatz[] zzatzVarArr = new com.google.android.gms.internal.ads.zzaun().zzcG;
        int length3 = zzatzVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzatzVarArr[i3].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new com.google.android.gms.internal.ads.zzatp(str.getBytes(com.adjust.sdk.Constants.ENCODING)).zza(bArr3);
        }
        return bArr3;
    }
}
