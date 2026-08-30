package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzakx {
    private static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("\\{([^}]*)\\}");
    private static final java.util.regex.Pattern zzd = java.util.regex.Pattern.compile(java.lang.String.format(java.util.Locale.US, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    private static final java.util.regex.Pattern zze = java.util.regex.Pattern.compile(java.lang.String.format(java.util.Locale.US, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    private static final java.util.regex.Pattern zzf = java.util.regex.Pattern.compile("\\\\an(\\d+)");
    public final int zza;
    public final android.graphics.PointF zzb;

    private zzakx(int i, android.graphics.PointF pointF) {
        this.zza = i;
        this.zzb = pointF;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097 A[Catch: RuntimeException -> 0x000a, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x000a, blocks: (B:22:0x008b, B:24:0x0097, B:26:0x009e), top: B:35:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x000a A[SYNTHETIC] */
    public static com.google.android.gms.internal.ads.zzakx zza(java.lang.String str) {
        java.util.regex.Matcher matcher;
        int iZzd;
        android.graphics.PointF pointF;
        java.lang.String strGroup;
        java.lang.String strGroup2;
        java.util.regex.Matcher matcher2 = zzc.matcher(str);
        android.graphics.PointF pointF2 = null;
        int i = -1;
        while (matcher2.find()) {
            java.lang.String strGroup3 = matcher2.group(1);
            strGroup3.getClass();
            try {
                try {
                    java.util.regex.Matcher matcher3 = zzd.matcher(strGroup3);
                    java.util.regex.Matcher matcher4 = zze.matcher(strGroup3);
                    boolean zFind = matcher3.find();
                    boolean zFind2 = matcher4.find();
                    if (zFind) {
                        if (zFind2) {
                            com.google.android.gms.internal.ads.zzdo.zze("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + strGroup3 + "'");
                        }
                        strGroup = matcher3.group(1);
                        strGroup2 = matcher3.group(2);
                    } else {
                        if (zFind2) {
                            java.lang.String strGroup4 = matcher4.group(1);
                            java.lang.String strGroup5 = matcher4.group(2);
                            strGroup = strGroup4;
                            strGroup2 = strGroup5;
                        } else {
                            pointF = null;
                        }
                        if (pointF != null) {
                            pointF2 = pointF;
                        }
                        matcher = zzf.matcher(strGroup3);
                        if (matcher.find()) {
                            java.lang.String strGroup6 = matcher.group(1);
                            strGroup6.getClass();
                            java.lang.String str2 = strGroup6;
                            iZzd = com.google.android.gms.internal.ads.zzaky.zzd(strGroup6);
                        } else {
                            iZzd = -1;
                        }
                        if (iZzd != -1) {
                            i = iZzd;
                        }
                    }
                    strGroup.getClass();
                    java.lang.String str3 = strGroup;
                    float f = java.lang.Float.parseFloat(strGroup.trim());
                    strGroup2.getClass();
                    java.lang.String str4 = strGroup2;
                    pointF = new android.graphics.PointF(f, java.lang.Float.parseFloat(strGroup2.trim()));
                    if (pointF != null) {
                        pointF2 = pointF;
                    }
                } catch (java.lang.RuntimeException unused) {
                }
                matcher = zzf.matcher(strGroup3);
                if (matcher.find()) {
                    java.lang.String strGroup7 = matcher.group(1);
                    strGroup7.getClass();
                    java.lang.String str5 = strGroup7;
                    iZzd = com.google.android.gms.internal.ads.zzaky.zzd(strGroup7);
                } else {
                    iZzd = -1;
                }
                if (iZzd != -1) {
                    i = iZzd;
                }
            } catch (java.lang.RuntimeException unused2) {
            }
        }
        return new com.google.android.gms.internal.ads.zzakx(i, pointF2);
    }

    public static java.lang.String zzb(java.lang.String str) {
        return zzc.matcher(str).replaceAll("");
    }
}
