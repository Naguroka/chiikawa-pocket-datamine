package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzafh {
    private static final java.lang.String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final java.lang.String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final java.lang.String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static com.google.android.gms.internal.ads.zzafd zza(java.lang.String str) throws java.io.IOException {
        long j;
        try {
            org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new java.io.StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw com.google.android.gms.internal.ads.zzbc.zza("Couldn't find xmp metadata", null);
            }
            com.google.android.gms.internal.ads.zzfxn zzfxnVarZzn = com.google.android.gms.internal.ads.zzfxn.zzn();
            long j2 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, "rdf:Description")) {
                    java.lang.String[] strArr = zza;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        java.lang.String strZza = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, strArr[i2]);
                        if (strZza != null) {
                            if (java.lang.Integer.parseInt(strZza) != 1) {
                                return null;
                            }
                            java.lang.String[] strArr2 = zzb;
                            int i3 = 0;
                            while (true) {
                                if (i3 < 4) {
                                    java.lang.String strZza2 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, strArr2[i3]);
                                    if (strZza2 != null) {
                                        j = java.lang.Long.parseLong(strZza2);
                                        if (j != -1) {
                                            break;
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                break;
                            }
                            java.lang.String[] strArr3 = zzc;
                            while (true) {
                                if (i >= 2) {
                                    zzfxnVarZzn = com.google.android.gms.internal.ads.zzfxn.zzn();
                                    break;
                                }
                                java.lang.String strZza3 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, strArr3[i]);
                                if (strZza3 != null) {
                                    zzfxnVarZzn = com.google.android.gms.internal.ads.zzfxn.zzp(new com.google.android.gms.internal.ads.zzafc(androidx.media3.common.MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new com.google.android.gms.internal.ads.zzafc(androidx.media3.common.MimeTypes.VIDEO_MP4, "MotionPhoto", java.lang.Long.parseLong(strZza3), 0L));
                                    break;
                                }
                                i++;
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, "Container:Directory")) {
                    zzfxnVarZzn = zzb(xmlPullParserNewPullParser, "Container", "Item");
                } else if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    zzfxnVarZzn = zzb(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!com.google.android.gms.internal.ads.zzej.zzb(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (zzfxnVarZzn.isEmpty()) {
                return null;
            }
            return new com.google.android.gms.internal.ads.zzafd(j2, zzfxnVarZzn);
        } catch (com.google.android.gms.internal.ads.zzbc | java.lang.NumberFormatException | org.xmlpull.v1.XmlPullParserException unused) {
            com.google.android.gms.internal.ads.zzdo.zzf("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static com.google.android.gms.internal.ads.zzfxn zzb(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, java.lang.String str2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
        do {
            java.lang.String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParser, strConcat)) {
                java.lang.String strConcat2 = str2.concat(":Mime");
                java.lang.String strConcat3 = str2.concat(":Semantic");
                java.lang.String strConcat4 = str2.concat(":Length");
                java.lang.String strConcat5 = str2.concat(":Padding");
                java.lang.String strZza = com.google.android.gms.internal.ads.zzej.zza(xmlPullParser, strConcat2);
                java.lang.String strZza2 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParser, strConcat3);
                java.lang.String strZza3 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParser, strConcat4);
                java.lang.String strZza4 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParser, strConcat5);
                if (strZza == null || strZza2 == null) {
                    return com.google.android.gms.internal.ads.zzfxn.zzn();
                }
                zzfxkVar.zzf(new com.google.android.gms.internal.ads.zzafc(strZza, strZza2, strZza3 != null ? java.lang.Long.parseLong(strZza3) : 0L, strZza4 != null ? java.lang.Long.parseLong(strZza4) : 0L));
            }
        } while (!com.google.android.gms.internal.ads.zzej.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfxkVar.zzi();
    }
}
