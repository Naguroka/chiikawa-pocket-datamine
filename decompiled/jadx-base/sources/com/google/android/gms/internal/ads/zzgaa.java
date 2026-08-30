package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgaa {
    private static final com.google.android.gms.internal.ads.zzgaa zza;

    static {
        new com.google.android.gms.internal.ads.zzfzx("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new com.google.android.gms.internal.ads.zzfzx("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new com.google.android.gms.internal.ads.zzfzz("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new com.google.android.gms.internal.ads.zzfzz("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zza = new com.google.android.gms.internal.ads.zzfzw("base16()", "0123456789ABCDEF");
    }

    zzgaa() {
    }

    public static com.google.android.gms.internal.ads.zzgaa zzi() {
        return zza;
    }

    abstract int zza(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.android.gms.internal.ads.zzfzy;

    abstract void zzc(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException;

    abstract int zzd(int i);

    abstract int zze(int i);

    public abstract com.google.android.gms.internal.ads.zzgaa zzf();

    java.lang.CharSequence zzg(java.lang.CharSequence charSequence) {
        throw null;
    }

    public final java.lang.String zzj(byte[] bArr, int i, int i2) {
        com.google.android.gms.internal.ads.zzfun.zzk(0, i2, bArr.length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zze(i2));
        try {
            zzc(sb, bArr, 0, i2);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final byte[] zzk(java.lang.CharSequence charSequence) {
        try {
            java.lang.CharSequence charSequenceZzg = zzg(charSequence);
            int iZzd = zzd(charSequenceZzg.length());
            byte[] bArr = new byte[iZzd];
            int iZza = zza(bArr, charSequenceZzg);
            if (iZza == iZzd) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (com.google.android.gms.internal.ads.zzfzy e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }
}
