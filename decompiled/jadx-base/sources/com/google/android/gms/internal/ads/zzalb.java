package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzalb {
    private static final java.util.regex.Pattern zzd = java.util.regex.Pattern.compile("\\s+");
    private static final com.google.android.gms.internal.ads.zzfxs zze = com.google.android.gms.internal.ads.zzfxs.zzp("auto", "none");
    private static final com.google.android.gms.internal.ads.zzfxs zzf = com.google.android.gms.internal.ads.zzfxs.zzq(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_DOT, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_SESAME, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final com.google.android.gms.internal.ads.zzfxs zzg = com.google.android.gms.internal.ads.zzfxs.zzp(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_FILLED, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    private static final com.google.android.gms.internal.ads.zzfxs zzh = com.google.android.gms.internal.ads.zzfxs.zzq(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER, androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_BEFORE, androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_OUTSIDE);
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzalb(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public static com.google.android.gms.internal.ads.zzalb zza(java.lang.String str) {
        byte b;
        int i;
        if (str == null) {
            return null;
        }
        java.lang.String strZza = com.google.android.gms.internal.ads.zzftt.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        com.google.android.gms.internal.ads.zzfxs zzfxsVarZzm = com.google.android.gms.internal.ads.zzfxs.zzm(android.text.TextUtils.split(strZza, zzd));
        java.lang.String str2 = (java.lang.String) com.google.android.gms.internal.ads.zzfxt.zza(com.google.android.gms.internal.ads.zzfzp.zzb(zzh, zzfxsVarZzm), androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int iHashCode = str2.hashCode();
        int i2 = -1;
        int i3 = 0;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER)) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str2.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
            b = 1;
        } else {
            b = -1;
        }
        if (b != 0) {
            i = b != 1 ? 1 : -2;
        } else {
            i = 2;
        }
        com.google.android.gms.internal.ads.zzfzn zzfznVarZzb = com.google.android.gms.internal.ads.zzfzp.zzb(zze, zzfxsVarZzm);
        if (zzfznVarZzb.isEmpty()) {
            com.google.android.gms.internal.ads.zzfzn zzfznVarZzb2 = com.google.android.gms.internal.ads.zzfzp.zzb(zzg, zzfxsVarZzm);
            com.google.android.gms.internal.ads.zzfzn zzfznVarZzb3 = com.google.android.gms.internal.ads.zzfzp.zzb(zzf, zzfxsVarZzm);
            if (!zzfznVarZzb2.isEmpty() || !zzfznVarZzb3.isEmpty()) {
                java.lang.String str3 = (java.lang.String) com.google.android.gms.internal.ads.zzfxt.zza(zzfznVarZzb2, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
                int i4 = ((str3.hashCode() == 3417674 && str3.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) ? (byte) 0 : (byte) -1) != 0 ? 1 : 2;
                java.lang.String str4 = (java.lang.String) com.google.android.gms.internal.ads.zzfxt.zza(zzfznVarZzb3, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        i2 = 0;
                    }
                } else if (str4.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    i2 = 1;
                }
                if (i2 == 0) {
                    i2 = 2;
                } else if (i2 != 1) {
                    i3 = i4;
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                i3 = i4;
            }
        } else {
            java.lang.String str5 = (java.lang.String) zzfznVarZzb.iterator().next();
            if (((str5.hashCode() == 3387192 && str5.equals("none")) ? (byte) 0 : (byte) -1) == 0) {
                i2 = 0;
            }
        }
        return new com.google.android.gms.internal.ads.zzalb(i2, i3, i);
    }
}
