package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgu {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(java.lang.String str, java.lang.String str2) {
        long j = -1;
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                j = java.lang.Long.parseLong(str);
            } catch (java.lang.NumberFormatException unused) {
                com.google.android.gms.internal.ads.zzdo.zzc("HttpUtil", "Unexpected Content-Length [" + str + com.ironsource.y8.i.e);
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return j;
        }
        java.util.regex.Matcher matcher = zza.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            java.lang.String strGroup = matcher.group(2);
            strGroup.getClass();
            java.lang.String str3 = strGroup;
            long j2 = java.lang.Long.parseLong(strGroup);
            java.lang.String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            java.lang.String str4 = strGroup2;
            long j3 = (j2 - java.lang.Long.parseLong(strGroup2)) + 1;
            if (j < 0) {
                return j3;
            }
            if (j == j3) {
                return j;
            }
            com.google.android.gms.internal.ads.zzdo.zzf("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + com.ironsource.y8.i.e);
            return java.lang.Math.max(j, j3);
        } catch (java.lang.NumberFormatException unused2) {
            com.google.android.gms.internal.ads.zzdo.zzc("HttpUtil", "Unexpected Content-Range [" + str2 + com.ironsource.y8.i.e);
            return j;
        }
    }

    public static long zzb(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1L;
        }
        java.util.regex.Matcher matcher = zzb.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        java.lang.String strGroup = matcher.group(1);
        strGroup.getClass();
        return java.lang.Long.parseLong(strGroup);
    }
}
