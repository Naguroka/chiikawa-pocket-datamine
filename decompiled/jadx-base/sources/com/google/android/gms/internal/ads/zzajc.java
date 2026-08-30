package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzajc {
    public final boolean zza;
    public final java.lang.String zzb;
    public final com.google.android.gms.internal.ads.zzads zzc;
    public final int zzd;
    public final byte[] zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzajc(boolean z, java.lang.String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        byte b = 0;
        int i4 = 1;
        com.google.android.gms.internal.ads.zzcw.zzd((i == 0) ^ (bArr2 == null));
        this.zza = z;
        this.zzb = str;
        this.zzd = i;
        this.zze = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals(androidx.media3.common.C.CENC_TYPE_cbc1)) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals(androidx.media3.common.C.CENC_TYPE_cbcs)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 3049879:
                    if (!str.equals(androidx.media3.common.C.CENC_TYPE_cenc)) {
                        b = -1;
                    }
                    break;
                case 3049895:
                    if (!str.equals(androidx.media3.common.C.CENC_TYPE_cens)) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b != 0 && b != 1) {
                if (b == 2 || b == 3) {
                    i4 = 2;
                } else {
                    com.google.android.gms.internal.ads.zzdo.zzf("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                }
            }
        }
        this.zzc = new com.google.android.gms.internal.ads.zzads(i4, bArr, i2, i3);
    }
}
