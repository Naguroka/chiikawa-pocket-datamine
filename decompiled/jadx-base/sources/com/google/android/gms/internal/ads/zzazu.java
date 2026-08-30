package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzazu extends com.google.android.gms.internal.ads.zzazl {
    private java.security.MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzazu(int i) {
        int i2 = i >> 3;
        this.zzc = (i & 7) > 0 ? i2 + 1 : i2;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzazl
    public final byte[] zzb(java.lang.String str) {
        synchronized (this.zza) {
            java.security.MessageDigest messageDigestZza = zza();
            this.zzb = messageDigestZza;
            if (messageDigestZza == null) {
                return new byte[0];
            }
            messageDigestZza.reset();
            this.zzb.update(str.getBytes(java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING)));
            byte[] bArrDigest = this.zzb.digest();
            int length = bArrDigest.length;
            int i = this.zzc;
            if (length > i) {
                length = i;
            }
            byte[] bArr = new byte[length];
            java.lang.System.arraycopy(bArrDigest, 0, bArr, 0, length);
            if ((this.zzd & 7) > 0) {
                long j = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        j <<= 8;
                    }
                    j += (long) (bArr[i2] & 255);
                }
                long j2 = j >>> (8 - (this.zzd & 7));
                int i3 = this.zzc;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        break;
                    }
                    bArr[i3] = (byte) (255 & j2);
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
