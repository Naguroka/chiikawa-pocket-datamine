package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzalx {
    public static float zza(java.lang.String str) throws java.lang.NumberFormatException {
        if (str.endsWith("%")) {
            return java.lang.Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new java.lang.NumberFormatException("Percentages must end with %");
    }

    public static long zzb(java.lang.String str) throws java.lang.NumberFormatException {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        java.lang.String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (java.lang.String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + java.lang.Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            j2 += java.lang.Long.parseLong(strArrSplit[1]);
        }
        return j2 * 1000;
    }
}
