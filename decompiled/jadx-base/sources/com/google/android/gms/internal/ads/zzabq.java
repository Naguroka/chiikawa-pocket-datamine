package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzabq {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    public static com.google.android.gms.internal.ads.zzabo zza(com.google.android.gms.internal.ads.zzdx zzdxVar) {
        int i;
        int i2;
        int iZzd;
        int iZzd2 = zzdxVar.zzd(16);
        int iZzd3 = zzdxVar.zzd(16);
        if (iZzd3 == 65535) {
            iZzd3 = zzdxVar.zzd(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iZzd3 + i;
        if (iZzd2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int iZzd4 = zzdxVar.zzd(2);
        int i5 = 0;
        if (iZzd4 == 3) {
            int i6 = 0;
            while (true) {
                iZzd = i6 + zzdxVar.zzd(2);
                if (!zzdxVar.zzp()) {
                    break;
                }
                i6 = (iZzd + 1) << 2;
            }
            iZzd4 = iZzd + 3;
        }
        int i7 = iZzd4;
        int iZzd5 = zzdxVar.zzd(10);
        if (zzdxVar.zzp() && zzdxVar.zzd(3) > 0) {
            zzdxVar.zzn(2);
        }
        int i8 = true != zzdxVar.zzp() ? 44100 : 48000;
        int iZzd6 = zzdxVar.zzd(4);
        if (i8 == 44100 && iZzd6 == 13) {
            i2 = zzb[13];
        } else {
            if (i8 == 48000 && iZzd6 < 14) {
                i5 = zzb[iZzd6];
                int i9 = iZzd5 % 5;
                if (i9 == 1) {
                    if (iZzd6 != 3 || iZzd6 == 8) {
                        i5++;
                    }
                } else if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4 && (iZzd6 == 3 || iZzd6 == 8 || iZzd6 == 11)) {
                            i5++;
                        }
                    } else if (iZzd6 != 3) {
                        i5++;
                    } else {
                        i5++;
                    }
                } else if (iZzd6 == 8 || iZzd6 == 11) {
                    i5++;
                }
            }
            i2 = i5;
        }
        return new com.google.android.gms.internal.ads.zzabo(i7, 2, i8, i4, i2, null);
    }

    public static void zzb(int i, com.google.android.gms.internal.ads.zzdy zzdyVar) {
        zzdyVar.zzI(7);
        byte[] bArrZzN = zzdyVar.zzN();
        bArrZzN[0] = -84;
        bArrZzN[1] = 64;
        bArrZzN[2] = -1;
        bArrZzN[3] = -1;
        bArrZzN[4] = (byte) ((i >> 16) & 255);
        bArrZzN[5] = (byte) ((i >> 8) & 255);
        bArrZzN[6] = (byte) (i & 255);
    }
}
