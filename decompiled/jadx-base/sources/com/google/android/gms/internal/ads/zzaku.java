package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaku {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzaku(int i, int i2, int i3, int i4, int i5) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
    }

    public static com.google.android.gms.internal.ads.zzaku zza(java.lang.String str) {
        byte b;
        com.google.android.gms.internal.ads.zzcw.zzd(str.startsWith("Format:"));
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i2 == -1 || i3 == -1 || i5 == -1) {
                    return null;
                }
                return new com.google.android.gms.internal.ads.zzaku(i2, i3, i4, i5, length);
            }
            switch (com.google.android.gms.internal.ads.zzftt.zza(strArrSplit[i].trim())) {
                case "end":
                    b = 1;
                    break;
                case "text":
                    b = 3;
                    break;
                case "start":
                    b = 0;
                    break;
                case "style":
                    b = 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i2 = i;
            } else if (b == 1) {
                i3 = i;
            } else if (b == 2) {
                i4 = i;
            } else if (b == 3) {
                i5 = i;
            }
            i++;
        }
    }
}
