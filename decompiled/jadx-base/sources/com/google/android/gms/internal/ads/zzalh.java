package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzalh {
    public static com.google.android.gms.internal.ads.zzali zza(com.google.android.gms.internal.ads.zzali zzaliVar, java.lang.String[] strArr, java.util.Map map) {
        int length;
        int i = 0;
        if (zzaliVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (com.google.android.gms.internal.ads.zzali) map.get(strArr[0]);
            }
            if (length2 > 1) {
                com.google.android.gms.internal.ads.zzali zzaliVar2 = new com.google.android.gms.internal.ads.zzali();
                while (i < length2) {
                    zzaliVar2.zzl((com.google.android.gms.internal.ads.zzali) map.get(strArr[i]));
                    i++;
                }
                return zzaliVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzaliVar.zzl((com.google.android.gms.internal.ads.zzali) map.get(strArr[0]));
                return zzaliVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    zzaliVar.zzl((com.google.android.gms.internal.ads.zzali) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return zzaliVar;
    }
}
