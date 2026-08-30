package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaqj {
    public static long zza(java.lang.String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (java.text.ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                com.google.android.gms.internal.ads.zzapy.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            com.google.android.gms.internal.ads.zzapy.zzc(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static com.google.android.gms.internal.ads.zzaov zzb(com.google.android.gms.internal.ads.zzapi zzapiVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map map = zzapiVar.zzc;
        if (map == null) {
            return null;
        }
        java.lang.String str = (java.lang.String) map.get(com.google.common.net.HttpHeaders.DATE);
        long jZza = str != null ? zza(str) : 0L;
        java.lang.String str2 = (java.lang.String) map.get(com.google.common.net.HttpHeaders.CACHE_CONTROL);
        int i = 0;
        if (str2 != null) {
            java.lang.String[] strArrSplit = str2.split(",", 0);
            z = false;
            j = 0;
            j2 = 0;
            while (i < strArrSplit.length) {
                java.lang.String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j2 = java.lang.Long.parseLong(strTrim.substring(8));
                    } catch (java.lang.Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j = java.lang.Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        java.lang.String str3 = (java.lang.String) map.get(com.google.common.net.HttpHeaders.EXPIRES);
        long jZza2 = str3 != null ? zza(str3) : 0L;
        java.lang.String str4 = (java.lang.String) map.get(com.google.common.net.HttpHeaders.LAST_MODIFIED);
        long jZza3 = str4 != null ? zza(str4) : 0L;
        java.lang.String str5 = (java.lang.String) map.get(com.google.common.net.HttpHeaders.ETAG);
        if (i != 0) {
            j4 = jCurrentTimeMillis + (j2 * 1000);
            j3 = z ? j4 : (j * 1000) + j4;
        } else {
            j3 = 0;
            if (jZza <= 0 || jZza2 < jZza) {
                j4 = 0;
            } else {
                j4 = jCurrentTimeMillis + (jZza2 - jZza);
                j3 = j4;
            }
        }
        com.google.android.gms.internal.ads.zzaov zzaovVar = new com.google.android.gms.internal.ads.zzaov();
        zzaovVar.zza = zzapiVar.zzb;
        zzaovVar.zzb = str5;
        zzaovVar.zzf = j4;
        zzaovVar.zze = j3;
        zzaovVar.zzc = jZza;
        zzaovVar.zzd = jZza3;
        zzaovVar.zzg = map;
        zzaovVar.zzh = zzapiVar.zzd;
        return zzaovVar;
    }

    static java.lang.String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new java.util.Date(j));
    }

    private static java.text.SimpleDateFormat zzd(java.lang.String str) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, java.util.Locale.US);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
