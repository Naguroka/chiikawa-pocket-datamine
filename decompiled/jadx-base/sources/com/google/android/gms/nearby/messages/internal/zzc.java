package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzc {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    private final byte[] zzb;

    protected zzc(byte[] bArr) {
        this.zzb = bArr;
    }

    public static java.lang.String zza(byte[] bArr) {
        int length = bArr.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length);
        for (byte b : bArr) {
            char[] cArr = zza;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public static byte[] zzb(java.lang.String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((java.lang.Character.digit(str.charAt(i2), 16) << 4) + java.lang.Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass().isAssignableFrom(getClass())) {
            return java.util.Arrays.equals(this.zzb, ((com.google.android.gms.nearby.messages.internal.zzc) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.zzb);
    }

    public java.lang.String toString() {
        return zza(this.zzb);
    }

    public final byte[] zzc() {
        return this.zzb;
    }

    public final java.lang.String zzd() {
        return zza(this.zzb);
    }
}
