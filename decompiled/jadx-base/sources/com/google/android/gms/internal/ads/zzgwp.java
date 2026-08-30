package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgwp {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    com.google.android.gms.internal.ads.zzgwq zzc;

    private zzgwp() {
    }

    /* synthetic */ zzgwp(com.google.android.gms.internal.ads.zzgwo zzgwoVar) {
    }

    public static int zzD(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static int zzE(int i, java.io.InputStream inputStream) throws java.io.IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered a malformed varint.");
    }

    public static long zzF(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static com.google.android.gms.internal.ads.zzgwp zzG(java.io.InputStream inputStream, int i) {
        if (inputStream != null) {
            return new com.google.android.gms.internal.ads.zzgwm(inputStream, 4096, null);
        }
        byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
        int length = bArr.length;
        return zzH(bArr, 0, 0, false);
    }

    static com.google.android.gms.internal.ads.zzgwp zzH(byte[] bArr, int i, int i2, boolean z) {
        com.google.android.gms.internal.ads.zzgwk zzgwkVar = new com.google.android.gms.internal.ads.zzgwk(bArr, i, i2, z, null);
        try {
            zzgwkVar.zzd(i2);
            return zzgwkVar;
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public abstract boolean zzA() throws java.io.IOException;

    public abstract boolean zzB() throws java.io.IOException;

    public abstract double zza() throws java.io.IOException;

    public abstract float zzb() throws java.io.IOException;

    public abstract int zzc();

    public abstract int zzd(int i) throws com.google.android.gms.internal.ads.zzgyg;

    public abstract int zze() throws java.io.IOException;

    public abstract int zzf() throws java.io.IOException;

    public abstract int zzg() throws java.io.IOException;

    public abstract int zzj() throws java.io.IOException;

    public abstract int zzk() throws java.io.IOException;

    public abstract int zzl() throws java.io.IOException;

    public abstract int zzm() throws java.io.IOException;

    public abstract long zzn() throws java.io.IOException;

    public abstract long zzo() throws java.io.IOException;

    public abstract long zzs() throws java.io.IOException;

    public abstract long zzt() throws java.io.IOException;

    public abstract long zzu() throws java.io.IOException;

    public abstract com.google.android.gms.internal.ads.zzgwj zzv() throws java.io.IOException;

    public abstract java.lang.String zzw() throws java.io.IOException;

    public abstract java.lang.String zzx() throws java.io.IOException;

    public abstract void zzy(int i) throws com.google.android.gms.internal.ads.zzgyg;

    public abstract void zzz(int i);
}
