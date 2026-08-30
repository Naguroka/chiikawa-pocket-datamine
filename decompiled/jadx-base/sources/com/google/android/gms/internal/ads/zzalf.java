package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzalf implements com.google.android.gms.internal.ads.zzakf {
    private final org.xmlpull.v1.XmlPullParserFactory zzi;
    private static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final java.util.regex.Pattern zzd = java.util.regex.Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final java.util.regex.Pattern zze = java.util.regex.Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final java.util.regex.Pattern zzf = java.util.regex.Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final java.util.regex.Pattern zzg = java.util.regex.Pattern.compile("^(\\d+) (\\d+)$");
    private static final com.google.android.gms.internal.ads.zzald zzh = new com.google.android.gms.internal.ads.zzald(30.0f, 1, 1);

    /* JADX WARN: Code duplicated, block: B:50:0x0101  */
    private static long zzc(java.lang.String str, com.google.android.gms.internal.ads.zzald zzaldVar) throws com.google.android.gms.internal.ads.zzakb {
        double d;
        double d2;
        java.util.regex.Matcher matcher = zzc.matcher(str);
        byte b = 2;
        if (matcher.matches()) {
            java.lang.String strGroup = matcher.group(1);
            strGroup.getClass();
            long j = java.lang.Long.parseLong(strGroup) * 3600;
            java.lang.String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j2 = java.lang.Long.parseLong(strGroup2) * 60;
            java.lang.String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d3 = j + j2;
            double d4 = java.lang.Long.parseLong(strGroup3);
            java.lang.String strGroup4 = matcher.group(4);
            double d5 = 0.0d;
            double d6 = strGroup4 != null ? java.lang.Double.parseDouble(strGroup4) : 0.0d;
            double d7 = d3 + d4;
            java.lang.String strGroup5 = matcher.group(5);
            double d8 = strGroup5 != null ? java.lang.Long.parseLong(strGroup5) / zzaldVar.zza : 0.0d;
            double d9 = d7 + d6;
            java.lang.String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d5 = (java.lang.Long.parseLong(strGroup6) / ((double) zzaldVar.zzb)) / ((double) zzaldVar.zza);
            }
            return (long) ((d9 + d8 + d5) * 1000000.0d);
        }
        java.util.regex.Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new com.google.android.gms.internal.ads.zzakb("Malformed time expression: ".concat(java.lang.String.valueOf(str)));
        }
        java.lang.String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d10 = java.lang.Double.parseDouble(strGroup7);
        java.lang.String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode != 115) {
                            if (iHashCode == 116 && strGroup8.equals("t")) {
                                b = 5;
                            } else {
                                b = -1;
                            }
                        } else if (!strGroup8.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS)) {
                            b = -1;
                        }
                    } else if (strGroup8.equals("ms")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                } else if (strGroup8.equals("m")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strGroup8.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS)) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (strGroup8.equals("f")) {
            b = 4;
        } else {
            b = -1;
        }
        if (b != 0) {
            if (b != 1) {
                if (b == 3) {
                    d2 = 1000.0d;
                } else if (b == 4) {
                    d2 = zzaldVar.zza;
                } else if (b == 5) {
                    d2 = zzaldVar.zzc;
                }
                d10 /= d2;
            } else {
                d = 60.0d;
            }
            return (long) (d10 * 1000000.0d);
        }
        d = 3600.0d;
        d10 *= d;
        return (long) (d10 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    private static android.text.Layout.Alignment zzd(java.lang.String str) {
        byte b;
        switch (com.google.android.gms.internal.ads.zzftt.zza(str)) {
            case "center":
                b = 4;
                break;
            case "end":
                b = 3;
                break;
            case "left":
                b = 0;
                break;
            case "right":
                b = 2;
                break;
            case "start":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1) {
            return android.text.Layout.Alignment.ALIGN_NORMAL;
        }
        if (b == 2 || b == 3) {
            return android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (b != 4) {
            return null;
        }
        return android.text.Layout.Alignment.ALIGN_CENTER;
    }

    private static com.google.android.gms.internal.ads.zzali zze(com.google.android.gms.internal.ads.zzali zzaliVar) {
        return zzaliVar == null ? new com.google.android.gms.internal.ads.zzali() : zzaliVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static com.google.android.gms.internal.ads.zzali zzf(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.android.gms.internal.ads.zzali zzaliVar) {
        java.util.regex.Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            byte b = -1;
            switch (xmlPullParser.getAttributeName(i)) {
                case "id":
                    if (!androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        zzaliVar = zze(zzaliVar);
                        zzaliVar.zzs(attributeValue);
                        break;
                    }
                    break;
                case "backgroundColor":
                    zzaliVar = zze(zzaliVar);
                    try {
                        zzaliVar.zzm(com.google.android.gms.internal.ads.zzcz.zzb(attributeValue));
                        break;
                    } catch (java.lang.IllegalArgumentException unused) {
                        com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Failed parsing background value: ".concat(java.lang.String.valueOf(attributeValue)));
                        break;
                    }
                    break;
                case "color":
                    zzaliVar = zze(zzaliVar);
                    try {
                        zzaliVar.zzo(com.google.android.gms.internal.ads.zzcz.zzb(attributeValue));
                        break;
                    } catch (java.lang.IllegalArgumentException unused2) {
                        com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Failed parsing color value: ".concat(java.lang.String.valueOf(attributeValue)));
                        break;
                    }
                    break;
                case "fontFamily":
                    zzaliVar = zze(zzaliVar);
                    zzaliVar.zzp(attributeValue);
                    break;
                case "fontSize":
                    try {
                        zzaliVar = zze(zzaliVar);
                        int i2 = com.google.android.gms.internal.ads.zzei.zza;
                        java.lang.String[] strArrSplit = attributeValue.split("\\s+", -1);
                        int length = strArrSplit.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                throw new com.google.android.gms.internal.ads.zzakb("Invalid number of entries for fontSize: " + length + ".");
                            }
                            matcher = zze.matcher(strArrSplit[1]);
                            com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            throw new com.google.android.gms.internal.ads.zzakb("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                        java.lang.String strGroup = matcher.group(3);
                        strGroup.getClass();
                        java.lang.String str = strGroup;
                        int iHashCode = strGroup.hashCode();
                        if (iHashCode != 37) {
                            if (iHashCode != 3240) {
                                if (iHashCode == 3592 && strGroup.equals("px")) {
                                    b = 0;
                                }
                            } else if (strGroup.equals("em")) {
                                b = 1;
                            }
                        } else if (strGroup.equals("%")) {
                            b = 2;
                        }
                        if (b == 0) {
                            zzaliVar.zzr(1);
                        } else if (b == 1) {
                            zzaliVar.zzr(2);
                        } else {
                            if (b != 2) {
                                throw new com.google.android.gms.internal.ads.zzakb("Invalid unit for fontSize: '" + strGroup + "'.");
                            }
                            zzaliVar.zzr(3);
                        }
                        java.lang.String strGroup2 = matcher.group(1);
                        strGroup2.getClass();
                        java.lang.String str2 = strGroup2;
                        zzaliVar.zzq(java.lang.Float.parseFloat(strGroup2));
                        break;
                    } catch (com.google.android.gms.internal.ads.zzakb unused3) {
                        com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Failed parsing fontSize value: ".concat(java.lang.String.valueOf(attributeValue)));
                        break;
                    }
                    break;
                case "fontWeight":
                    zzaliVar = zze(zzaliVar);
                    zzaliVar.zzn(androidx.media3.extractor.text.ttml.TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case "fontStyle":
                    zzaliVar = zze(zzaliVar);
                    zzaliVar.zzt(androidx.media3.extractor.text.ttml.TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case "textAlign":
                    zzaliVar = zze(zzaliVar);
                    zzaliVar.zzz(zzd(attributeValue));
                    break;
                case "multiRowAlign":
                    zzaliVar = zze(zzaliVar);
                    zzaliVar.zzv(zzd(attributeValue));
                    break;
                case "textCombine":
                    java.lang.String strZza = com.google.android.gms.internal.ads.zzftt.zza(attributeValue);
                    int iHashCode2 = strZza.hashCode();
                    if (iHashCode2 != 96673) {
                        if (iHashCode2 == 3387192 && strZza.equals("none")) {
                            b = 0;
                        }
                    } else if (strZza.equals(androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL)) {
                        b = 1;
                    }
                    if (b == 0) {
                        zzaliVar = zze(zzaliVar);
                        zzaliVar.zzA(false);
                        break;
                    } else {
                        if (b == 1) {
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzA(true);
                        }
                        break;
                    }
                    break;
                case "ruby":
                    java.lang.String strZza2 = com.google.android.gms.internal.ads.zzftt.zza(attributeValue);
                    switch (strZza2.hashCode()) {
                        case -618561360:
                            if (strZza2.equals(androidx.media3.extractor.text.ttml.TtmlNode.RUBY_BASE_CONTAINER)) {
                                b = 2;
                            }
                            break;
                        case -410956671:
                            if (strZza2.equals(androidx.media3.extractor.text.ttml.TtmlNode.RUBY_CONTAINER)) {
                                b = 0;
                            }
                            break;
                        case -250518009:
                            if (strZza2.equals(androidx.media3.extractor.text.ttml.TtmlNode.RUBY_DELIMITER)) {
                                b = 5;
                            }
                            break;
                        case -136074796:
                            if (strZza2.equals(androidx.media3.extractor.text.ttml.TtmlNode.RUBY_TEXT_CONTAINER)) {
                                b = 4;
                            }
                            break;
                        case 3016401:
                            if (strZza2.equals(androidx.media3.extractor.text.ttml.TtmlNode.RUBY_BASE)) {
                                b = 1;
                            }
                            break;
                        case 3556653:
                            if (strZza2.equals("text")) {
                                b = 3;
                            }
                            break;
                    }
                    if (b == 0) {
                        zzaliVar = zze(zzaliVar);
                        zzaliVar.zzx(1);
                        break;
                    } else {
                        if (b == 1 || b == 2) {
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzx(2);
                        } else if (b == 3 || b == 4) {
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzx(3);
                        } else if (b == 5) {
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzx(4);
                        }
                        break;
                    }
                    break;
                case "rubyPosition":
                    java.lang.String strZza3 = com.google.android.gms.internal.ads.zzftt.zza(attributeValue);
                    int iHashCode3 = strZza3.hashCode();
                    if (iHashCode3 != -1392885889) {
                        if (iHashCode3 == 92734940 && strZza3.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER)) {
                            b = 1;
                        }
                    } else if (strZza3.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                        b = 0;
                    }
                    if (b == 0) {
                        zzaliVar = zze(zzaliVar);
                        zzaliVar.zzw(1);
                        break;
                    } else {
                        if (b == 1) {
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzw(2);
                        }
                        break;
                    }
                    break;
                case "textDecoration":
                    java.lang.String strZza4 = com.google.android.gms.internal.ads.zzftt.zza(attributeValue);
                    switch (strZza4.hashCode()) {
                        case -1461280213:
                            if (strZza4.equals(androidx.media3.extractor.text.ttml.TtmlNode.NO_UNDERLINE)) {
                                b = 3;
                            }
                            break;
                        case -1026963764:
                            if (strZza4.equals(androidx.media3.extractor.text.ttml.TtmlNode.UNDERLINE)) {
                                b = 2;
                            }
                            break;
                        case 913457136:
                            if (strZza4.equals(androidx.media3.extractor.text.ttml.TtmlNode.NO_LINETHROUGH)) {
                                b = 1;
                            }
                            break;
                        case 1679736913:
                            if (strZza4.equals(androidx.media3.extractor.text.ttml.TtmlNode.LINETHROUGH)) {
                                b = 0;
                            }
                            break;
                    }
                    if (b == 0) {
                        zzaliVar = zze(zzaliVar);
                        zzaliVar.zzu(true);
                        break;
                    } else {
                        if (b == 1) {
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzu(false);
                        } else if (b == 2) {
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzC(true);
                        } else if (b == 3) {
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzC(false);
                        }
                        break;
                    }
                    break;
                case "textEmphasis":
                    zzaliVar = zze(zzaliVar);
                    zzaliVar.zzB(com.google.android.gms.internal.ads.zzalb.zza(attributeValue));
                    break;
                case "shear":
                    zzaliVar = zze(zzaliVar);
                    java.util.regex.Matcher matcher2 = zza.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            java.lang.String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            java.lang.String str3 = strGroup3;
                            fMin = java.lang.Math.min(100.0f, java.lang.Math.max(-100.0f, java.lang.Float.parseFloat(strGroup3)));
                        } catch (java.lang.NumberFormatException e) {
                            com.google.android.gms.internal.ads.zzdo.zzg("TtmlParser", "Failed to parse shear: ".concat(java.lang.String.valueOf(attributeValue)), e);
                        }
                        break;
                    } else {
                        com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Invalid value for shear: ".concat(java.lang.String.valueOf(attributeValue)));
                    }
                    zzaliVar.zzy(fMin);
                    break;
            }
        }
        return zzaliVar;
    }

    private static java.lang.String[] zzg(java.lang.String str) {
        java.lang.String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new java.lang.String[0];
        }
        int i = com.google.android.gms.internal.ads.zzei.zza;
        return strTrim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzake zzakeVar, com.google.android.gms.internal.ads.zzdb zzdbVar) {
        com.google.android.gms.internal.ads.zzajz.zza(zzb(bArr, i, i2), zzakeVar, zzdbVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x0275 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x027b A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, LOOP:1: B:113:0x027b->B:254:0x050d, LOOP_START, PHI: r2 r5 r11
  0x027b: PHI (r2v44 java.lang.String) = (r2v18 java.lang.String), (r2v82 java.lang.String) binds: [B:112:0x0279, B:254:0x050d] A[DONT_GENERATE, DONT_INLINE]
  0x027b: PHI (r5v7 java.util.HashMap) = (r5v1 java.util.HashMap), (r5v30 java.util.HashMap) binds: [B:112:0x0279, B:254:0x050d] A[DONT_GENERATE, DONT_INLINE]
  0x027b: PHI (r11v11 com.google.android.gms.internal.ads.zzald) = (r11v5 com.google.android.gms.internal.ads.zzald), (r11v36 com.google.android.gms.internal.ads.zzald) binds: [B:112:0x0279, B:254:0x050d] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0284 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0293 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x029d A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, LOOP:2: B:118:0x029b->B:119:0x029d, LOOP_END, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x02af  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b7 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x02bb A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TRY_LEAVE, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x02c5 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TRY_ENTER, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02cb A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, LOOP:3: B:129:0x02cb->B:433:?, LOOP_START, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x02d6 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02ef A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:141:0x02fc A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0304 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TRY_LEAVE, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x031a  */
    /* JADX WARN: Code duplicated, block: B:154:0x034b A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0353 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0355 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TRY_LEAVE, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x035f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0392 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TRY_LEAVE, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:178:0x03d2 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x03d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x03da A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TRY_LEAVE, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:192:0x0419 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TRY_LEAVE, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0426  */
    /* JADX WARN: Code duplicated, block: B:198:0x042c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0436  */
    /* JADX WARN: Code duplicated, block: B:203:0x043e  */
    /* JADX WARN: Code duplicated, block: B:204:0x0440  */
    /* JADX WARN: Code duplicated, block: B:206:0x0443  */
    /* JADX WARN: Code duplicated, block: B:209:0x0447  */
    /* JADX WARN: Code duplicated, block: B:210:0x044e  */
    /* JADX WARN: Code duplicated, block: B:211:0x0458  */
    /* JADX WARN: Code duplicated, block: B:215:0x0467 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TRY_LEAVE, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0473  */
    /* JADX WARN: Code duplicated, block: B:220:0x0478  */
    /* JADX WARN: Code duplicated, block: B:223:0x047e  */
    /* JADX WARN: Code duplicated, block: B:226:0x0488  */
    /* JADX WARN: Code duplicated, block: B:228:0x0490  */
    /* JADX WARN: Code duplicated, block: B:229:0x0492  */
    /* JADX WARN: Code duplicated, block: B:231:0x049a  */
    /* JADX WARN: Code duplicated, block: B:232:0x049c  */
    /* JADX WARN: Code duplicated, block: B:234:0x049f  */
    /* JADX WARN: Code duplicated, block: B:240:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:241:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:244:0x04c7 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x04d2 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x04e4 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x04ef A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x04fc A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:254:0x050d A[LOOP:1: B:113:0x027b->B:254:0x050d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:255:0x0515  */
    /* JADX WARN: Code duplicated, block: B:263:0x0547  */
    /* JADX WARN: Code duplicated, block: B:265:0x054f  */
    /* JADX WARN: Code duplicated, block: B:266:0x0551  */
    /* JADX WARN: Code duplicated, block: B:268:0x0557  */
    /* JADX WARN: Code duplicated, block: B:269:0x0559  */
    /* JADX WARN: Code duplicated, block: B:271:0x0561  */
    /* JADX WARN: Code duplicated, block: B:272:0x0563  */
    /* JADX WARN: Code duplicated, block: B:274:0x056b  */
    /* JADX WARN: Code duplicated, block: B:275:0x056d  */
    /* JADX WARN: Code duplicated, block: B:277:0x0575  */
    /* JADX WARN: Code duplicated, block: B:278:0x0577  */
    /* JADX WARN: Code duplicated, block: B:280:0x057d  */
    /* JADX WARN: Code duplicated, block: B:281:0x057f  */
    /* JADX WARN: Code duplicated, block: B:283:0x0582  */
    /* JADX WARN: Code duplicated, block: B:285:0x0585  */
    /* JADX WARN: Code duplicated, block: B:287:0x0588  */
    /* JADX WARN: Code duplicated, block: B:289:0x058b  */
    /* JADX WARN: Code duplicated, block: B:291:0x058e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:292:0x0590  */
    /* JADX WARN: Code duplicated, block: B:295:0x059a  */
    /* JADX WARN: Code duplicated, block: B:299:0x05a3 A[Catch: zzakb -> 0x05ba, IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #15 {zzakb -> 0x05ba, blocks: (B:296:0x059b, B:299:0x05a3, B:302:0x05ad), top: B:423:0x059b }] */
    /* JADX WARN: Code duplicated, block: B:301:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:302:0x05ad A[Catch: zzakb -> 0x05ba, IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TRY_LEAVE, TryCatch #15 {zzakb -> 0x05ba, blocks: (B:296:0x059b, B:299:0x05a3, B:302:0x05ad), top: B:423:0x059b }] */
    /* JADX WARN: Code duplicated, block: B:304:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:308:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:310:0x05c7 A[Catch: zzakb -> 0x0607, IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #5 {zzakb -> 0x0607, blocks: (B:312:0x05d6, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:339:0x0619), top: B:407:0x05d6 }] */
    /* JADX WARN: Code duplicated, block: B:311:0x05cf A[Catch: zzakb -> 0x0607, IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #5 {zzakb -> 0x0607, blocks: (B:312:0x05d6, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:339:0x0619), top: B:407:0x05d6 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x05eb A[Catch: zzakb -> 0x0607, IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #5 {zzakb -> 0x0607, blocks: (B:312:0x05d6, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:339:0x0619), top: B:407:0x05d6 }] */
    /* JADX WARN: Code duplicated, block: B:321:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:323:0x05f5 A[Catch: zzakb -> 0x0607, IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #5 {zzakb -> 0x0607, blocks: (B:312:0x05d6, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:339:0x0619), top: B:407:0x05d6 }] */
    /* JADX WARN: Code duplicated, block: B:324:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:327:0x05fe A[Catch: zzakb -> 0x0607, IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #5 {zzakb -> 0x0607, blocks: (B:312:0x05d6, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:339:0x0619), top: B:407:0x05d6 }] */
    /* JADX WARN: Code duplicated, block: B:328:0x0601  */
    /* JADX WARN: Code duplicated, block: B:329:0x0605 A[PHI: r29 r36
  0x0605: PHI (r29v3 long) = (r29v1 long), (r29v5 long) binds: [B:320:0x05ef, B:327:0x05fe] A[DONT_GENERATE, DONT_INLINE]
  0x0605: PHI (r36v4 long) = (r36v1 long), (r36v6 long) binds: [B:320:0x05ef, B:327:0x05fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:332:0x0609  */
    /* JADX WARN: Code duplicated, block: B:335:0x060e  */
    /* JADX WARN: Code duplicated, block: B:337:0x0612 A[Catch: zzakb -> 0x0607, IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #5 {zzakb -> 0x0607, blocks: (B:312:0x05d6, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:339:0x0619), top: B:407:0x05d6 }] */
    /* JADX WARN: Code duplicated, block: B:338:0x0617 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:339:0x0619 A[Catch: zzakb -> 0x0607, IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TRY_LEAVE, TryCatch #5 {zzakb -> 0x0607, blocks: (B:312:0x05d6, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:339:0x0619), top: B:407:0x05d6 }] */
    /* JADX WARN: Code duplicated, block: B:342:0x061f  */
    /* JADX WARN: Code duplicated, block: B:343:0x0622  */
    /* JADX WARN: Code duplicated, block: B:344:0x0625  */
    /* JADX WARN: Code duplicated, block: B:349:0x063a A[Catch: zzakb -> 0x0647, IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TRY_LEAVE, TryCatch #4 {zzakb -> 0x0647, blocks: (B:347:0x0635, B:349:0x063a), top: B:405:0x0635 }] */
    /* JADX WARN: Code duplicated, block: B:397:0x0592 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x0536 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x0507 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0185  */
    /* JADX WARN: Code duplicated, block: B:64:0x0187 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0193 A[Catch: IOException -> 0x06e7, XmlPullParserException -> 0x06f1, TRY_LEAVE, TryCatch #17 {IOException -> 0x06e7, XmlPullParserException -> 0x06f1, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x017d, B:78:0x01da, B:81:0x01e8, B:83:0x01ee, B:85:0x01f6, B:87:0x01fe, B:89:0x0206, B:91:0x020e, B:93:0x0216, B:95:0x021c, B:97:0x0224, B:99:0x022c, B:101:0x0232, B:103:0x0238, B:105:0x0240, B:107:0x0248, B:110:0x0251, B:384:0x06cb, B:111:0x0275, B:113:0x027b, B:115:0x0284, B:117:0x0293, B:119:0x029d, B:121:0x02b1, B:123:0x02b7, B:251:0x0501, B:124:0x02bb, B:127:0x02c5, B:129:0x02cb, B:131:0x02d6, B:133:0x02dc, B:134:0x02e3, B:137:0x02ef, B:250:0x04fc, B:141:0x02fc, B:143:0x0304, B:147:0x031d, B:149:0x0324, B:151:0x0335, B:166:0x038a, B:168:0x0392, B:171:0x03a1, B:173:0x03a8, B:175:0x03b9, B:190:0x0411, B:192:0x0419, B:213:0x045f, B:215:0x0467, B:242:0x04b0, B:177:0x03c7, B:178:0x03d2, B:181:0x03da, B:184:0x03e6, B:186:0x03ed, B:188:0x03fc, B:243:0x04bc, B:244:0x04c7, B:245:0x04d2, B:153:0x0341, B:154:0x034b, B:157:0x0355, B:160:0x0360, B:162:0x0367, B:164:0x0376, B:246:0x04d9, B:247:0x04e4, B:248:0x04ef, B:256:0x0519, B:259:0x0536, B:312:0x05d6, B:293:0x0592, B:296:0x059b, B:358:0x0654, B:299:0x05a3, B:302:0x05ad, B:309:0x05c2, B:310:0x05c7, B:311:0x05cf, B:319:0x05eb, B:323:0x05f5, B:327:0x05fe, B:337:0x0612, B:345:0x0627, B:347:0x0635, B:349:0x063a, B:339:0x0619, B:64:0x0187, B:66:0x0193, B:69:0x019e, B:71:0x01a5, B:73:0x01b4, B:75:0x01c1, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0139, B:54:0x0152, B:56:0x0159, B:60:0x0173, B:364:0x0674, B:367:0x0686, B:369:0x0690, B:371:0x069b, B:373:0x06a8, B:377:0x06bc, B:381:0x06c4, B:387:0x06e2), top: B:427:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x019d  */
    public final com.google.android.gms.internal.ads.zzaka zzb(byte[] bArr, int i, int i2) {
        java.lang.String str;
        java.util.HashMap map;
        java.util.ArrayDeque arrayDeque;
        com.google.android.gms.internal.ads.zzalj zzaljVar;
        int i3;
        boolean zEquals;
        java.lang.String str2;
        java.util.HashMap map2;
        com.google.android.gms.internal.ads.zzald zzaldVar;
        com.google.android.gms.internal.ads.zzald zzaldVar2;
        int i4;
        com.google.android.gms.internal.ads.zzakb zzakbVar;
        int attributeCount;
        java.lang.String[] strArr;
        java.lang.String strSubstring;
        java.lang.String str3;
        long jZzc;
        long jZzc2;
        long jZzc3;
        int i5;
        com.google.android.gms.internal.ads.zzalc zzalcVar;
        long j;
        com.google.android.gms.internal.ads.zzalc zzalcVarZzb;
        long j2;
        long j3;
        java.lang.String attributeName;
        java.lang.String attributeValue;
        byte b;
        java.lang.String[] strArrZzg;
        java.lang.String strZza;
        java.lang.String strZza2;
        java.lang.String str4;
        java.util.regex.Pattern pattern;
        java.util.regex.Matcher matcher;
        java.util.regex.Pattern pattern2;
        java.util.regex.Matcher matcher2;
        float f;
        float f2;
        java.lang.String strZza3;
        java.util.regex.Matcher matcher3;
        java.util.regex.Matcher matcher4;
        float f3;
        float f4;
        java.lang.String strZza4;
        float f5;
        int i6;
        java.lang.String strZza5;
        int i7;
        com.google.android.gms.internal.ads.zzalg zzalgVar;
        java.lang.String strZza6;
        int iHashCode;
        byte b2;
        java.lang.String strZza7;
        int iHashCode2;
        byte b3;
        java.lang.String strZza8;
        java.lang.String strZza9;
        com.google.android.gms.internal.ads.zzali zzaliVarZzf;
        java.lang.String strZzE;
        java.lang.String[] strArrZzg2;
        int length;
        int i8;
        float f6;
        com.google.android.gms.internal.ads.zzald zzaldVar3;
        boolean z;
        java.lang.String strZza10;
        java.util.regex.Matcher matcher5;
        java.lang.String str5 = "";
        java.lang.String str6 = "http://www.w3.org/ns/ttml#parameter";
        try {
            org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = this.zzi.newPullParser();
            java.util.HashMap map3 = new java.util.HashMap();
            java.util.HashMap map4 = new java.util.HashMap();
            java.util.HashMap map5 = new java.util.HashMap();
            map4.put("", new com.google.android.gms.internal.ads.zzalg("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            xmlPullParserNewPullParser.setInput(new java.io.ByteArrayInputStream(bArr, i, i2), null);
            java.util.ArrayDeque arrayDeque2 = new java.util.ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            com.google.android.gms.internal.ads.zzald zzaldVar4 = zzh;
            com.google.android.gms.internal.ads.zzalj zzaljVar2 = null;
            com.google.android.gms.internal.ads.zzale zzaleVar = null;
            int i9 = 0;
            int i10 = 15;
            while (eventType != 1) {
                com.google.android.gms.internal.ads.zzalc zzalcVar2 = (com.google.android.gms.internal.ads.zzalc) arrayDeque2.peek();
                if (i9 == 0) {
                    java.lang.String name = xmlPullParserNewPullParser.getName();
                    str = str5;
                    if (eventType == 2) {
                        if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_TT.equals(name)) {
                            java.lang.String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str6, "frameRate");
                            int i11 = attributeValue2 != null ? java.lang.Integer.parseInt(attributeValue2) : 30;
                            java.lang.String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str6, "frameRateMultiplier");
                            if (attributeValue3 != null) {
                                int i12 = com.google.android.gms.internal.ads.zzei.zza;
                                java.lang.String[] strArrSplit = attributeValue3.split(" ", -1);
                                com.google.android.gms.internal.ads.zzcw.zze(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f6 = java.lang.Integer.parseInt(strArrSplit[0]) / java.lang.Integer.parseInt(strArrSplit[1]);
                            } else {
                                f6 = 1.0f;
                            }
                            com.google.android.gms.internal.ads.zzald zzaldVar5 = zzh;
                            int i13 = zzaldVar5.zzb;
                            java.lang.String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str6, "subFrameRate");
                            int i14 = attributeValue4 != null ? java.lang.Integer.parseInt(attributeValue4) : i13;
                            int i15 = zzaldVar5.zzc;
                            java.lang.String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str6, "tickRate");
                            com.google.android.gms.internal.ads.zzald zzaldVar6 = new com.google.android.gms.internal.ads.zzald(i11 * f6, i14, attributeValue5 != null ? java.lang.Integer.parseInt(attributeValue5) : i15);
                            java.lang.String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(str6, "cellResolution");
                            if (attributeValue6 == null) {
                                str6 = str6;
                                zzaldVar3 = zzaldVar6;
                                i10 = 15;
                            } else {
                                java.util.regex.Matcher matcher6 = zzg.matcher(attributeValue6);
                                if (matcher6.matches()) {
                                    try {
                                        java.lang.String strGroup = matcher6.group(1);
                                        strGroup.getClass();
                                        java.lang.String str7 = strGroup;
                                        int i16 = java.lang.Integer.parseInt(strGroup);
                                        java.lang.String strGroup2 = matcher6.group(2);
                                        strGroup2.getClass();
                                        java.lang.String str8 = strGroup2;
                                        int i17 = java.lang.Integer.parseInt(strGroup2);
                                        if (i16 == 0) {
                                            i10 = i17;
                                            z = false;
                                        } else if (i17 != 0) {
                                            i10 = i17;
                                            z = true;
                                        } else {
                                            z = false;
                                            i10 = 0;
                                        }
                                        try {
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            zzaldVar3 = zzaldVar6;
                                            try {
                                                sb.append("Invalid cell resolution ");
                                                sb.append(i16);
                                                sb.append(" ");
                                                sb.append(i10);
                                                com.google.android.gms.internal.ads.zzcw.zze(z, sb.toString());
                                            } catch (java.lang.NumberFormatException unused) {
                                                com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue6));
                                                i10 = 15;
                                            }
                                        } catch (java.lang.NumberFormatException unused2) {
                                            zzaldVar3 = zzaldVar6;
                                            com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue6));
                                            i10 = 15;
                                            strZza10 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
                                            if (strZza10 == null) {
                                                zzaleVar = null;
                                            } else {
                                                matcher5 = zzf.matcher(strZza10);
                                                if (matcher5.matches()) {
                                                    try {
                                                        java.lang.String strGroup3 = matcher5.group(1);
                                                        strGroup3.getClass();
                                                        java.lang.String str9 = strGroup3;
                                                        int i18 = java.lang.Integer.parseInt(strGroup3);
                                                        java.lang.String strGroup4 = matcher5.group(2);
                                                        strGroup4.getClass();
                                                        java.lang.String str10 = strGroup4;
                                                        zzaleVar = new com.google.android.gms.internal.ads.zzale(i18, java.lang.Integer.parseInt(strGroup4));
                                                    } catch (java.lang.NumberFormatException unused3) {
                                                        com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring malformed tts extent: ".concat(strZza10));
                                                        zzaleVar = null;
                                                    }
                                                } else {
                                                    com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZza10));
                                                }
                                                zzaleVar = null;
                                            }
                                            zzaldVar4 = zzaldVar3;
                                            zEquals = name.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_TT);
                                            str2 = androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA;
                                            if (zEquals) {
                                                if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD.equals(name)) {
                                                    while (true) {
                                                        xmlPullParserNewPullParser.next();
                                                        if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE)) {
                                                            strZza9 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE);
                                                            zzaliVarZzf = zzf(xmlPullParserNewPullParser, new com.google.android.gms.internal.ads.zzali());
                                                            if (strZza9 != null) {
                                                                strArrZzg2 = zzg(strZza9);
                                                                i8 = 0;
                                                                for (length = strArrZzg2.length; i8 < length; length = length) {
                                                                    zzaliVarZzf.zzl((com.google.android.gms.internal.ads.zzali) map3.get(strArrZzg2[i8]));
                                                                    i8++;
                                                                }
                                                            }
                                                            strZzE = zzaliVarZzf.zzE();
                                                            if (strZzE != null) {
                                                                map3.put(strZzE, zzaliVarZzf);
                                                            }
                                                        } else {
                                                            zzaldVar4 = zzaldVar4;
                                                            if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_REGION)) {
                                                                strZza = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, "id");
                                                                if (strZza == null) {
                                                                    str4 = str2;
                                                                    map2 = map3;
                                                                } else {
                                                                    strZza2 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, "origin");
                                                                    if (strZza2 != null) {
                                                                        pattern = zzb;
                                                                        matcher = pattern.matcher(strZza2);
                                                                        pattern2 = zzf;
                                                                        str4 = str2;
                                                                        matcher2 = pattern2.matcher(strZza2);
                                                                        if (matcher.matches()) {
                                                                            map2 = map3;
                                                                            java.lang.String strGroup5 = matcher.group(1);
                                                                            strGroup5.getClass();
                                                                            java.lang.String str11 = strGroup5;
                                                                            float f7 = java.lang.Float.parseFloat(strGroup5) / 100.0f;
                                                                            java.lang.String strGroup6 = matcher.group(2);
                                                                            strGroup6.getClass();
                                                                            java.lang.String str12 = strGroup6;
                                                                            f2 = java.lang.Float.parseFloat(strGroup6) / 100.0f;
                                                                            f = f7;
                                                                            strZza3 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
                                                                            if (strZza3 != null) {
                                                                                matcher3 = pattern.matcher(strZza3);
                                                                                matcher4 = pattern2.matcher(strZza3);
                                                                                if (matcher3.matches()) {
                                                                                    java.lang.String strGroup7 = matcher3.group(1);
                                                                                    strGroup7.getClass();
                                                                                    java.lang.String str13 = strGroup7;
                                                                                    float f8 = java.lang.Float.parseFloat(strGroup7) / 100.0f;
                                                                                    java.lang.String strGroup8 = matcher3.group(2);
                                                                                    strGroup8.getClass();
                                                                                    java.lang.String str14 = strGroup8;
                                                                                    f3 = java.lang.Float.parseFloat(strGroup8) / 100.0f;
                                                                                    f4 = f8;
                                                                                    strZza4 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                    if (strZza4 != null) {
                                                                                        strZza7 = com.google.android.gms.internal.ads.zzftt.zza(strZza4);
                                                                                        iHashCode2 = strZza7.hashCode();
                                                                                        if (iHashCode2 != -1364013995) {
                                                                                            if (iHashCode2 != 92734940) {
                                                                                                b3 = -1;
                                                                                            } else {
                                                                                                b3 = 1;
                                                                                            }
                                                                                        } else if (strZza7.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                                                                            b3 = 0;
                                                                                        } else {
                                                                                            b3 = -1;
                                                                                        }
                                                                                        if (b3 != 0) {
                                                                                            f5 = f2 + (f3 / 2.0f);
                                                                                            i6 = 1;
                                                                                        } else if (b3 != 1) {
                                                                                            f5 = f2;
                                                                                            i6 = 0;
                                                                                        } else {
                                                                                            f5 = f2 + f3;
                                                                                            i6 = 2;
                                                                                        }
                                                                                    } else {
                                                                                        f5 = f2;
                                                                                        i6 = 0;
                                                                                    }
                                                                                    float f9 = 1.0f / i10;
                                                                                    strZza5 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                                    if (strZza5 != null) {
                                                                                        strZza6 = com.google.android.gms.internal.ads.zzftt.zza(strZza5);
                                                                                        iHashCode = strZza6.hashCode();
                                                                                        if (iHashCode != 3694) {
                                                                                            if (iHashCode != 3553396) {
                                                                                                if (iHashCode != 3553576) {
                                                                                                    b2 = -1;
                                                                                                } else {
                                                                                                    b2 = 2;
                                                                                                }
                                                                                            } else if (strZza6.equals(androidx.media3.extractor.text.ttml.TtmlNode.VERTICAL_LR)) {
                                                                                                b2 = 1;
                                                                                            } else {
                                                                                                b2 = -1;
                                                                                            }
                                                                                        } else if (strZza6.equals("tb")) {
                                                                                            b2 = 0;
                                                                                        } else {
                                                                                            b2 = -1;
                                                                                        }
                                                                                        if (b2 != 0) {
                                                                                            i7 = 2;
                                                                                        } else {
                                                                                            i7 = 2;
                                                                                        }
                                                                                    } else {
                                                                                        i7 = Integer.MIN_VALUE;
                                                                                    }
                                                                                    zzalgVar = new com.google.android.gms.internal.ads.zzalg(strZza, f, f5, 0, i6, f4, f3, 1, f9, i7);
                                                                                } else if (matcher4.matches()) {
                                                                                    com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza2));
                                                                                } else if (zzaleVar == null) {
                                                                                    com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                                } else {
                                                                                    java.lang.String strGroup9 = matcher4.group(1);
                                                                                    strGroup9.getClass();
                                                                                    java.lang.String str15 = strGroup9;
                                                                                    int i19 = java.lang.Integer.parseInt(strGroup9);
                                                                                    java.lang.String strGroup10 = matcher4.group(2);
                                                                                    strGroup10.getClass();
                                                                                    java.lang.String str16 = strGroup10;
                                                                                    int i20 = java.lang.Integer.parseInt(strGroup10);
                                                                                    float f10 = i19 / zzaleVar.zza;
                                                                                    f3 = i20 / zzaleVar.zzb;
                                                                                    f4 = f10;
                                                                                    strZza4 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                    if (strZza4 != null) {
                                                                                        strZza7 = com.google.android.gms.internal.ads.zzftt.zza(strZza4);
                                                                                        iHashCode2 = strZza7.hashCode();
                                                                                        if (iHashCode2 != -1364013995) {
                                                                                            if (iHashCode2 != 92734940) {
                                                                                                b3 = -1;
                                                                                            } else {
                                                                                                b3 = 1;
                                                                                            }
                                                                                        } else if (strZza7.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                                                                            b3 = 0;
                                                                                        } else {
                                                                                            b3 = -1;
                                                                                        }
                                                                                        if (b3 != 0) {
                                                                                            f5 = f2 + (f3 / 2.0f);
                                                                                            i6 = 1;
                                                                                        } else if (b3 != 1) {
                                                                                            f5 = f2;
                                                                                            i6 = 0;
                                                                                        } else {
                                                                                            f5 = f2 + f3;
                                                                                            i6 = 2;
                                                                                        }
                                                                                    } else {
                                                                                        f5 = f2;
                                                                                        i6 = 0;
                                                                                    }
                                                                                    float f11 = 1.0f / i10;
                                                                                    strZza5 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                                    if (strZza5 != null) {
                                                                                        strZza6 = com.google.android.gms.internal.ads.zzftt.zza(strZza5);
                                                                                        iHashCode = strZza6.hashCode();
                                                                                        if (iHashCode != 3694) {
                                                                                            if (iHashCode != 3553396) {
                                                                                                if (iHashCode != 3553576) {
                                                                                                    b2 = -1;
                                                                                                } else {
                                                                                                    b2 = 2;
                                                                                                }
                                                                                            } else if (strZza6.equals(androidx.media3.extractor.text.ttml.TtmlNode.VERTICAL_LR)) {
                                                                                                b2 = 1;
                                                                                            } else {
                                                                                                b2 = -1;
                                                                                            }
                                                                                        } else if (strZza6.equals("tb")) {
                                                                                            b2 = 0;
                                                                                        } else {
                                                                                            b2 = -1;
                                                                                        }
                                                                                        if (b2 != 0) {
                                                                                            i7 = 2;
                                                                                        } else {
                                                                                            i7 = 2;
                                                                                        }
                                                                                    } else {
                                                                                        i7 = Integer.MIN_VALUE;
                                                                                    }
                                                                                    zzalgVar = new com.google.android.gms.internal.ads.zzalg(strZza, f, f5, 0, i6, f4, f3, 1, f11, i7);
                                                                                }
                                                                                if (zzalgVar != null) {
                                                                                    map4.put(zzalgVar.zza, zzalgVar);
                                                                                }
                                                                            } else {
                                                                                com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region without an extent");
                                                                            }
                                                                        } else {
                                                                            map2 = map3;
                                                                            if (!matcher2.matches()) {
                                                                                com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZza2));
                                                                            } else if (zzaleVar == null) {
                                                                                com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                            } else {
                                                                                java.lang.String strGroup11 = matcher2.group(1);
                                                                                strGroup11.getClass();
                                                                                java.lang.String str17 = strGroup11;
                                                                                int i21 = java.lang.Integer.parseInt(strGroup11);
                                                                                java.lang.String strGroup12 = matcher2.group(2);
                                                                                strGroup12.getClass();
                                                                                java.lang.String str18 = strGroup12;
                                                                                float f12 = java.lang.Integer.parseInt(strGroup12);
                                                                                f = i21 / zzaleVar.zza;
                                                                                f2 = f12 / zzaleVar.zzb;
                                                                                strZza3 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
                                                                                if (strZza3 != null) {
                                                                                    matcher3 = pattern.matcher(strZza3);
                                                                                    matcher4 = pattern2.matcher(strZza3);
                                                                                    if (matcher3.matches()) {
                                                                                        java.lang.String strGroup13 = matcher3.group(1);
                                                                                        strGroup13.getClass();
                                                                                        java.lang.String str19 = strGroup13;
                                                                                        float f13 = java.lang.Float.parseFloat(strGroup13) / 100.0f;
                                                                                        java.lang.String strGroup14 = matcher3.group(2);
                                                                                        strGroup14.getClass();
                                                                                        java.lang.String str110 = strGroup14;
                                                                                        f3 = java.lang.Float.parseFloat(strGroup14) / 100.0f;
                                                                                        f4 = f13;
                                                                                        strZza4 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                        if (strZza4 != null) {
                                                                                            strZza7 = com.google.android.gms.internal.ads.zzftt.zza(strZza4);
                                                                                            iHashCode2 = strZza7.hashCode();
                                                                                            if (iHashCode2 != -1364013995) {
                                                                                                if (iHashCode2 != 92734940) {
                                                                                                    b3 = -1;
                                                                                                } else {
                                                                                                    b3 = 1;
                                                                                                }
                                                                                            } else if (strZza7.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                                                                                b3 = 0;
                                                                                            } else {
                                                                                                b3 = -1;
                                                                                            }
                                                                                            if (b3 != 0) {
                                                                                                f5 = f2 + (f3 / 2.0f);
                                                                                                i6 = 1;
                                                                                            } else if (b3 != 1) {
                                                                                                f5 = f2;
                                                                                                i6 = 0;
                                                                                            } else {
                                                                                                f5 = f2 + f3;
                                                                                                i6 = 2;
                                                                                            }
                                                                                        } else {
                                                                                            f5 = f2;
                                                                                            i6 = 0;
                                                                                        }
                                                                                        float f14 = 1.0f / i10;
                                                                                        strZza5 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                                        if (strZza5 != null) {
                                                                                            strZza6 = com.google.android.gms.internal.ads.zzftt.zza(strZza5);
                                                                                            iHashCode = strZza6.hashCode();
                                                                                            if (iHashCode != 3694) {
                                                                                                if (iHashCode != 3553396) {
                                                                                                    if (iHashCode != 3553576) {
                                                                                                        b2 = -1;
                                                                                                    } else {
                                                                                                        b2 = 2;
                                                                                                    }
                                                                                                } else if (strZza6.equals(androidx.media3.extractor.text.ttml.TtmlNode.VERTICAL_LR)) {
                                                                                                    b2 = 1;
                                                                                                } else {
                                                                                                    b2 = -1;
                                                                                                }
                                                                                            } else if (strZza6.equals("tb")) {
                                                                                                b2 = 0;
                                                                                            } else {
                                                                                                b2 = -1;
                                                                                            }
                                                                                            if (b2 != 0) {
                                                                                                i7 = 2;
                                                                                            } else {
                                                                                                i7 = 2;
                                                                                            }
                                                                                        } else {
                                                                                            i7 = Integer.MIN_VALUE;
                                                                                        }
                                                                                        zzalgVar = new com.google.android.gms.internal.ads.zzalg(strZza, f, f5, 0, i6, f4, f3, 1, f14, i7);
                                                                                    } else if (matcher4.matches()) {
                                                                                        com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza2));
                                                                                    } else if (zzaleVar == null) {
                                                                                        com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                                    } else {
                                                                                        java.lang.String strGroup15 = matcher4.group(1);
                                                                                        strGroup15.getClass();
                                                                                        java.lang.String str111 = strGroup15;
                                                                                        int i110 = java.lang.Integer.parseInt(strGroup15);
                                                                                        java.lang.String strGroup16 = matcher4.group(2);
                                                                                        strGroup16.getClass();
                                                                                        java.lang.String str112 = strGroup16;
                                                                                        int i22 = java.lang.Integer.parseInt(strGroup16);
                                                                                        float f15 = i110 / zzaleVar.zza;
                                                                                        f3 = i22 / zzaleVar.zzb;
                                                                                        f4 = f15;
                                                                                        strZza4 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                        if (strZza4 != null) {
                                                                                            strZza7 = com.google.android.gms.internal.ads.zzftt.zza(strZza4);
                                                                                            iHashCode2 = strZza7.hashCode();
                                                                                            if (iHashCode2 != -1364013995) {
                                                                                                if (iHashCode2 != 92734940) {
                                                                                                    b3 = -1;
                                                                                                } else {
                                                                                                    b3 = 1;
                                                                                                }
                                                                                            } else if (strZza7.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                                                                                b3 = 0;
                                                                                            } else {
                                                                                                b3 = -1;
                                                                                            }
                                                                                            if (b3 != 0) {
                                                                                                f5 = f2 + (f3 / 2.0f);
                                                                                                i6 = 1;
                                                                                            } else if (b3 != 1) {
                                                                                                f5 = f2;
                                                                                                i6 = 0;
                                                                                            } else {
                                                                                                f5 = f2 + f3;
                                                                                                i6 = 2;
                                                                                            }
                                                                                        } else {
                                                                                            f5 = f2;
                                                                                            i6 = 0;
                                                                                        }
                                                                                        float f16 = 1.0f / i10;
                                                                                        strZza5 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                                        if (strZza5 != null) {
                                                                                            strZza6 = com.google.android.gms.internal.ads.zzftt.zza(strZza5);
                                                                                            iHashCode = strZza6.hashCode();
                                                                                            if (iHashCode != 3694) {
                                                                                                if (iHashCode != 3553396) {
                                                                                                    if (iHashCode != 3553576) {
                                                                                                        b2 = -1;
                                                                                                    } else {
                                                                                                        b2 = 2;
                                                                                                    }
                                                                                                } else if (strZza6.equals(androidx.media3.extractor.text.ttml.TtmlNode.VERTICAL_LR)) {
                                                                                                    b2 = 1;
                                                                                                } else {
                                                                                                    b2 = -1;
                                                                                                }
                                                                                            } else if (strZza6.equals("tb")) {
                                                                                                b2 = 0;
                                                                                            } else {
                                                                                                b2 = -1;
                                                                                            }
                                                                                            if (b2 != 0) {
                                                                                                i7 = 2;
                                                                                            } else {
                                                                                                i7 = 2;
                                                                                            }
                                                                                        } else {
                                                                                            i7 = Integer.MIN_VALUE;
                                                                                        }
                                                                                        zzalgVar = new com.google.android.gms.internal.ads.zzalg(strZza, f, f5, 0, i6, f4, f3, 1, f16, i7);
                                                                                    }
                                                                                    if (zzalgVar != null) {
                                                                                        map4.put(zzalgVar.zza, zzalgVar);
                                                                                    }
                                                                                } else {
                                                                                    com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region without an extent");
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str4 = str2;
                                                                        map2 = map3;
                                                                        com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region without an origin");
                                                                    }
                                                                }
                                                                zzalgVar = null;
                                                                if (zzalgVar != null) {
                                                                    map4.put(zzalgVar.zza, zzalgVar);
                                                                }
                                                            } else if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, str2)) {
                                                                do {
                                                                    xmlPullParserNewPullParser.next();
                                                                    if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, "image")) {
                                                                        map5.put(strZza8, xmlPullParserNewPullParser.nextText());
                                                                    }
                                                                } while (!com.google.android.gms.internal.ads.zzej.zzb(xmlPullParserNewPullParser, str2));
                                                            }
                                                            if (com.google.android.gms.internal.ads.zzej.zzb(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD)) {
                                                                zzaldVar2 = zzaldVar4;
                                                                arrayDeque = arrayDeque2;
                                                            } else {
                                                                zzaldVar4 = zzaldVar4;
                                                                str2 = str4;
                                                                map3 = map2;
                                                            }
                                                        }
                                                        str4 = str2;
                                                        map2 = map3;
                                                        if (com.google.android.gms.internal.ads.zzej.zzb(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD)) {
                                                            zzaldVar2 = zzaldVar4;
                                                            arrayDeque = arrayDeque2;
                                                        } else {
                                                            zzaldVar4 = zzaldVar4;
                                                            str2 = str4;
                                                            map3 = map2;
                                                        }
                                                    }
                                                } else {
                                                    map2 = map3;
                                                    zzaldVar = zzaldVar4;
                                                    attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                                    com.google.android.gms.internal.ads.zzali zzaliVarZzf2 = zzf(xmlPullParserNewPullParser, null);
                                                    strArr = null;
                                                    strSubstring = null;
                                                    str3 = str;
                                                    jZzc = -9223372036854775807L;
                                                    jZzc2 = -9223372036854775807L;
                                                    jZzc3 = -9223372036854775807L;
                                                    i5 = 0;
                                                    while (i5 < attributeCount) {
                                                        attributeName = xmlPullParserNewPullParser.getAttributeName(i5);
                                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(i5);
                                                        switch (attributeName) {
                                                            case "region":
                                                                b = 4;
                                                                break;
                                                            case "dur":
                                                                b = 2;
                                                                break;
                                                            case "end":
                                                                b = 1;
                                                                break;
                                                            case "begin":
                                                                b = 0;
                                                                break;
                                                            case "style":
                                                                b = 3;
                                                                break;
                                                            case "backgroundImage":
                                                                b = 5;
                                                                break;
                                                            default:
                                                                b = -1;
                                                                break;
                                                        }
                                                        if (b == 0) {
                                                            zzaldVar2 = zzaldVar;
                                                            i4 = 1;
                                                            jZzc2 = zzc(attributeValue, zzaldVar2);
                                                        } else if (b == 1) {
                                                            i4 = 1;
                                                            zzaldVar2 = zzaldVar;
                                                            jZzc = zzc(attributeValue, zzaldVar2);
                                                        } else if (b != 2) {
                                                            if (b == 3) {
                                                                i4 = 1;
                                                                strArrZzg = zzg(attributeValue);
                                                                if (strArrZzg.length > 0) {
                                                                    strArr = strArrZzg;
                                                                }
                                                            } else if (b == 4) {
                                                                i4 = 1;
                                                                if (map4.containsKey(attributeValue)) {
                                                                    str3 = attributeValue;
                                                                }
                                                            } else if (b != 5) {
                                                                i4 = 1;
                                                            } else if (attributeValue.startsWith("#")) {
                                                                i4 = 1;
                                                                strSubstring = attributeValue.substring(1);
                                                            } else {
                                                                i4 = 1;
                                                            }
                                                            zzaldVar2 = zzaldVar;
                                                        } else {
                                                            zzaldVar2 = zzaldVar;
                                                            i4 = 1;
                                                            jZzc3 = zzc(attributeValue, zzaldVar2);
                                                        }
                                                        i5++;
                                                        zzaldVar = zzaldVar2;
                                                        i4 = 0;
                                                    }
                                                    zzaldVar2 = zzaldVar;
                                                    i4 = 1;
                                                    if (zzalcVar2 != null) {
                                                        j3 = zzalcVar2.zzd;
                                                        if (j3 == androidx.media3.common.C.TIME_UNSET) {
                                                            zzalcVar = zzalcVar2;
                                                        } else {
                                                            if (jZzc2 != androidx.media3.common.C.TIME_UNSET) {
                                                                jZzc2 += j3;
                                                            } else {
                                                                jZzc2 = -9223372036854775807L;
                                                            }
                                                            if (jZzc != androidx.media3.common.C.TIME_UNSET) {
                                                                jZzc += j3;
                                                                zzalcVar = zzalcVar2;
                                                            } else {
                                                                zzalcVar = zzalcVar2;
                                                                jZzc = -9223372036854775807L;
                                                            }
                                                        }
                                                    } else {
                                                        zzalcVar = null;
                                                    }
                                                    if (jZzc != androidx.media3.common.C.TIME_UNSET) {
                                                        j = jZzc;
                                                    } else if (jZzc3 != androidx.media3.common.C.TIME_UNSET) {
                                                        j = jZzc2 + jZzc3;
                                                    } else if (zzalcVar != null) {
                                                        j2 = zzalcVar.zze;
                                                        if (j2 != androidx.media3.common.C.TIME_UNSET) {
                                                            j = j2;
                                                        } else {
                                                            j = -9223372036854775807L;
                                                        }
                                                    } else {
                                                        j = -9223372036854775807L;
                                                    }
                                                    zzalcVarZzb = com.google.android.gms.internal.ads.zzalc.zzb(xmlPullParserNewPullParser.getName(), jZzc2, j, zzaliVarZzf2, strArr, str3, strSubstring, zzalcVar);
                                                    arrayDeque = arrayDeque2;
                                                    arrayDeque.push(zzalcVarZzb);
                                                    if (zzalcVar2 != null) {
                                                        zzalcVar2.zzf(zzalcVarZzb);
                                                    }
                                                }
                                                zzaldVar4 = zzaldVar2;
                                                i9 = i9;
                                                map = map2;
                                            } else {
                                                if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD.equals(name)) {
                                                    while (true) {
                                                        xmlPullParserNewPullParser.next();
                                                        if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE)) {
                                                            strZza9 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE);
                                                            zzaliVarZzf = zzf(xmlPullParserNewPullParser, new com.google.android.gms.internal.ads.zzali());
                                                            if (strZza9 != null) {
                                                                strArrZzg2 = zzg(strZza9);
                                                                i8 = 0;
                                                                while (i8 < length) {
                                                                    zzaliVarZzf.zzl((com.google.android.gms.internal.ads.zzali) map3.get(strArrZzg2[i8]));
                                                                    i8++;
                                                                }
                                                            }
                                                            strZzE = zzaliVarZzf.zzE();
                                                            if (strZzE != null) {
                                                                map3.put(strZzE, zzaliVarZzf);
                                                            }
                                                        } else {
                                                            zzaldVar4 = zzaldVar4;
                                                            if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_REGION)) {
                                                                strZza = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, "id");
                                                                if (strZza == null) {
                                                                    str4 = str2;
                                                                    map2 = map3;
                                                                } else {
                                                                    strZza2 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, "origin");
                                                                    if (strZza2 != null) {
                                                                        pattern = zzb;
                                                                        matcher = pattern.matcher(strZza2);
                                                                        pattern2 = zzf;
                                                                        str4 = str2;
                                                                        matcher2 = pattern2.matcher(strZza2);
                                                                        if (matcher.matches()) {
                                                                            map2 = map3;
                                                                            try {
                                                                                java.lang.String strGroup17 = matcher.group(1);
                                                                                strGroup17.getClass();
                                                                                java.lang.String str113 = strGroup17;
                                                                                float f17 = java.lang.Float.parseFloat(strGroup17) / 100.0f;
                                                                                java.lang.String strGroup18 = matcher.group(2);
                                                                                strGroup18.getClass();
                                                                                java.lang.String str114 = strGroup18;
                                                                                f2 = java.lang.Float.parseFloat(strGroup18) / 100.0f;
                                                                                f = f17;
                                                                                strZza3 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
                                                                                if (strZza3 != null) {
                                                                                    matcher3 = pattern.matcher(strZza3);
                                                                                    matcher4 = pattern2.matcher(strZza3);
                                                                                    if (matcher3.matches()) {
                                                                                        try {
                                                                                            java.lang.String strGroup19 = matcher3.group(1);
                                                                                            strGroup19.getClass();
                                                                                            java.lang.String str115 = strGroup19;
                                                                                            float f18 = java.lang.Float.parseFloat(strGroup19) / 100.0f;
                                                                                            java.lang.String strGroup110 = matcher3.group(2);
                                                                                            strGroup110.getClass();
                                                                                            java.lang.String str116 = strGroup110;
                                                                                            f3 = java.lang.Float.parseFloat(strGroup110) / 100.0f;
                                                                                            f4 = f18;
                                                                                            strZza4 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                            if (strZza4 != null) {
                                                                                                strZza7 = com.google.android.gms.internal.ads.zzftt.zza(strZza4);
                                                                                                iHashCode2 = strZza7.hashCode();
                                                                                                if (iHashCode2 != -1364013995) {
                                                                                                    if (iHashCode2 != 92734940) {
                                                                                                        b3 = -1;
                                                                                                    } else {
                                                                                                        b3 = 1;
                                                                                                    }
                                                                                                } else if (strZza7.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                                                                                    b3 = 0;
                                                                                                } else {
                                                                                                    b3 = -1;
                                                                                                }
                                                                                                if (b3 != 0) {
                                                                                                    f5 = f2 + (f3 / 2.0f);
                                                                                                    i6 = 1;
                                                                                                } else if (b3 != 1) {
                                                                                                    f5 = f2;
                                                                                                    i6 = 0;
                                                                                                } else {
                                                                                                    f5 = f2 + f3;
                                                                                                    i6 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                f5 = f2;
                                                                                                i6 = 0;
                                                                                            }
                                                                                            float f19 = 1.0f / i10;
                                                                                            strZza5 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                                            if (strZza5 != null) {
                                                                                                strZza6 = com.google.android.gms.internal.ads.zzftt.zza(strZza5);
                                                                                                iHashCode = strZza6.hashCode();
                                                                                                if (iHashCode != 3694) {
                                                                                                    if (iHashCode != 3553396) {
                                                                                                        if (iHashCode != 3553576) {
                                                                                                            b2 = -1;
                                                                                                        } else {
                                                                                                            b2 = 2;
                                                                                                        }
                                                                                                    } else if (strZza6.equals(androidx.media3.extractor.text.ttml.TtmlNode.VERTICAL_LR)) {
                                                                                                        b2 = 1;
                                                                                                    } else {
                                                                                                        b2 = -1;
                                                                                                    }
                                                                                                } else if (strZza6.equals("tb")) {
                                                                                                    b2 = 0;
                                                                                                } else {
                                                                                                    b2 = -1;
                                                                                                }
                                                                                                if (b2 != 0) {
                                                                                                    i7 = 2;
                                                                                                } else {
                                                                                                    i7 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                i7 = Integer.MIN_VALUE;
                                                                                            }
                                                                                            zzalgVar = new com.google.android.gms.internal.ads.zzalg(strZza, f, f5, 0, i6, f4, f3, 1, f19, i7);
                                                                                        } catch (java.lang.NumberFormatException unused4) {
                                                                                            com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(strZza2));
                                                                                            zzalgVar = null;
                                                                                        }
                                                                                    } else if (matcher4.matches()) {
                                                                                        com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza2));
                                                                                    } else if (zzaleVar == null) {
                                                                                        com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                                    } else {
                                                                                        try {
                                                                                            java.lang.String strGroup111 = matcher4.group(1);
                                                                                            strGroup111.getClass();
                                                                                            java.lang.String str117 = strGroup111;
                                                                                            int i111 = java.lang.Integer.parseInt(strGroup111);
                                                                                            java.lang.String strGroup112 = matcher4.group(2);
                                                                                            strGroup112.getClass();
                                                                                            java.lang.String str118 = strGroup112;
                                                                                            int i23 = java.lang.Integer.parseInt(strGroup112);
                                                                                            float f110 = i111 / zzaleVar.zza;
                                                                                            f3 = i23 / zzaleVar.zzb;
                                                                                            f4 = f110;
                                                                                            strZza4 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                            if (strZza4 != null) {
                                                                                                strZza7 = com.google.android.gms.internal.ads.zzftt.zza(strZza4);
                                                                                                iHashCode2 = strZza7.hashCode();
                                                                                                if (iHashCode2 != -1364013995) {
                                                                                                    if (iHashCode2 != 92734940) {
                                                                                                        b3 = -1;
                                                                                                    } else {
                                                                                                        b3 = 1;
                                                                                                    }
                                                                                                } else if (strZza7.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                                                                                    b3 = 0;
                                                                                                } else {
                                                                                                    b3 = -1;
                                                                                                }
                                                                                                if (b3 != 0) {
                                                                                                    f5 = f2 + (f3 / 2.0f);
                                                                                                    i6 = 1;
                                                                                                } else if (b3 != 1) {
                                                                                                    f5 = f2;
                                                                                                    i6 = 0;
                                                                                                } else {
                                                                                                    f5 = f2 + f3;
                                                                                                    i6 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                f5 = f2;
                                                                                                i6 = 0;
                                                                                            }
                                                                                            float f111 = 1.0f / i10;
                                                                                            strZza5 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                                            if (strZza5 != null) {
                                                                                                strZza6 = com.google.android.gms.internal.ads.zzftt.zza(strZza5);
                                                                                                iHashCode = strZza6.hashCode();
                                                                                                if (iHashCode != 3694) {
                                                                                                    if (iHashCode != 3553396) {
                                                                                                        if (iHashCode != 3553576) {
                                                                                                            b2 = -1;
                                                                                                        } else {
                                                                                                            b2 = 2;
                                                                                                        }
                                                                                                    } else if (strZza6.equals(androidx.media3.extractor.text.ttml.TtmlNode.VERTICAL_LR)) {
                                                                                                        b2 = 1;
                                                                                                    } else {
                                                                                                        b2 = -1;
                                                                                                    }
                                                                                                } else if (strZza6.equals("tb")) {
                                                                                                    b2 = 0;
                                                                                                } else {
                                                                                                    b2 = -1;
                                                                                                }
                                                                                                if (b2 != 0) {
                                                                                                    i7 = 2;
                                                                                                } else {
                                                                                                    i7 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                i7 = Integer.MIN_VALUE;
                                                                                            }
                                                                                            zzalgVar = new com.google.android.gms.internal.ads.zzalg(strZza, f, f5, 0, i6, f4, f3, 1, f111, i7);
                                                                                        } catch (java.lang.NumberFormatException unused5) {
                                                                                            com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(strZza2));
                                                                                            zzalgVar = null;
                                                                                        }
                                                                                    }
                                                                                    if (zzalgVar != null) {
                                                                                        map4.put(zzalgVar.zza, zzalgVar);
                                                                                    }
                                                                                } else {
                                                                                    com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region without an extent");
                                                                                }
                                                                            } catch (java.lang.NumberFormatException unused6) {
                                                                                com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(strZza2));
                                                                            }
                                                                        } else {
                                                                            map2 = map3;
                                                                            if (!matcher2.matches()) {
                                                                                com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZza2));
                                                                            } else if (zzaleVar == null) {
                                                                                com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                            } else {
                                                                                try {
                                                                                    java.lang.String strGroup113 = matcher2.group(1);
                                                                                    strGroup113.getClass();
                                                                                    java.lang.String str119 = strGroup113;
                                                                                    int i24 = java.lang.Integer.parseInt(strGroup113);
                                                                                    java.lang.String strGroup114 = matcher2.group(2);
                                                                                    strGroup114.getClass();
                                                                                    java.lang.String str120 = strGroup114;
                                                                                    float f112 = java.lang.Integer.parseInt(strGroup114);
                                                                                    f = i24 / zzaleVar.zza;
                                                                                    f2 = f112 / zzaleVar.zzb;
                                                                                    strZza3 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
                                                                                    if (strZza3 != null) {
                                                                                        matcher3 = pattern.matcher(strZza3);
                                                                                        matcher4 = pattern2.matcher(strZza3);
                                                                                        if (matcher3.matches()) {
                                                                                            java.lang.String strGroup115 = matcher3.group(1);
                                                                                            strGroup115.getClass();
                                                                                            java.lang.String str1110 = strGroup115;
                                                                                            float f113 = java.lang.Float.parseFloat(strGroup115) / 100.0f;
                                                                                            java.lang.String strGroup116 = matcher3.group(2);
                                                                                            strGroup116.getClass();
                                                                                            java.lang.String str1111 = strGroup116;
                                                                                            f3 = java.lang.Float.parseFloat(strGroup116) / 100.0f;
                                                                                            f4 = f113;
                                                                                            strZza4 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                            if (strZza4 != null) {
                                                                                                strZza7 = com.google.android.gms.internal.ads.zzftt.zza(strZza4);
                                                                                                iHashCode2 = strZza7.hashCode();
                                                                                                if (iHashCode2 != -1364013995) {
                                                                                                    if (iHashCode2 != 92734940) {
                                                                                                        b3 = -1;
                                                                                                    } else {
                                                                                                        b3 = 1;
                                                                                                    }
                                                                                                } else if (strZza7.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                                                                                    b3 = 0;
                                                                                                } else {
                                                                                                    b3 = -1;
                                                                                                }
                                                                                                if (b3 != 0) {
                                                                                                    f5 = f2 + (f3 / 2.0f);
                                                                                                    i6 = 1;
                                                                                                } else if (b3 != 1) {
                                                                                                    f5 = f2;
                                                                                                    i6 = 0;
                                                                                                } else {
                                                                                                    f5 = f2 + f3;
                                                                                                    i6 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                f5 = f2;
                                                                                                i6 = 0;
                                                                                            }
                                                                                            float f114 = 1.0f / i10;
                                                                                            strZza5 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                                            if (strZza5 != null) {
                                                                                                strZza6 = com.google.android.gms.internal.ads.zzftt.zza(strZza5);
                                                                                                iHashCode = strZza6.hashCode();
                                                                                                if (iHashCode != 3694) {
                                                                                                    if (iHashCode != 3553396) {
                                                                                                        if (iHashCode != 3553576) {
                                                                                                            b2 = -1;
                                                                                                        } else {
                                                                                                            b2 = 2;
                                                                                                        }
                                                                                                    } else if (strZza6.equals(androidx.media3.extractor.text.ttml.TtmlNode.VERTICAL_LR)) {
                                                                                                        b2 = 1;
                                                                                                    } else {
                                                                                                        b2 = -1;
                                                                                                    }
                                                                                                } else if (strZza6.equals("tb")) {
                                                                                                    b2 = 0;
                                                                                                } else {
                                                                                                    b2 = -1;
                                                                                                }
                                                                                                if (b2 != 0) {
                                                                                                    i7 = 2;
                                                                                                } else {
                                                                                                    i7 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                i7 = Integer.MIN_VALUE;
                                                                                            }
                                                                                            zzalgVar = new com.google.android.gms.internal.ads.zzalg(strZza, f, f5, 0, i6, f4, f3, 1, f114, i7);
                                                                                        } else if (matcher4.matches()) {
                                                                                            com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza2));
                                                                                        } else if (zzaleVar == null) {
                                                                                            com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                                        } else {
                                                                                            java.lang.String strGroup117 = matcher4.group(1);
                                                                                            strGroup117.getClass();
                                                                                            java.lang.String str1112 = strGroup117;
                                                                                            int i112 = java.lang.Integer.parseInt(strGroup117);
                                                                                            java.lang.String strGroup118 = matcher4.group(2);
                                                                                            strGroup118.getClass();
                                                                                            java.lang.String str1113 = strGroup118;
                                                                                            int i25 = java.lang.Integer.parseInt(strGroup118);
                                                                                            float f115 = i112 / zzaleVar.zza;
                                                                                            f3 = i25 / zzaleVar.zzb;
                                                                                            f4 = f115;
                                                                                            strZza4 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                            if (strZza4 != null) {
                                                                                                strZza7 = com.google.android.gms.internal.ads.zzftt.zza(strZza4);
                                                                                                iHashCode2 = strZza7.hashCode();
                                                                                                if (iHashCode2 != -1364013995) {
                                                                                                    if (iHashCode2 != 92734940) {
                                                                                                        b3 = -1;
                                                                                                    } else {
                                                                                                        b3 = 1;
                                                                                                    }
                                                                                                } else if (strZza7.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                                                                                    b3 = 0;
                                                                                                } else {
                                                                                                    b3 = -1;
                                                                                                }
                                                                                                if (b3 != 0) {
                                                                                                    f5 = f2 + (f3 / 2.0f);
                                                                                                    i6 = 1;
                                                                                                } else if (b3 != 1) {
                                                                                                    f5 = f2;
                                                                                                    i6 = 0;
                                                                                                } else {
                                                                                                    f5 = f2 + f3;
                                                                                                    i6 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                f5 = f2;
                                                                                                i6 = 0;
                                                                                            }
                                                                                            float f116 = 1.0f / i10;
                                                                                            strZza5 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                                            if (strZza5 != null) {
                                                                                                strZza6 = com.google.android.gms.internal.ads.zzftt.zza(strZza5);
                                                                                                iHashCode = strZza6.hashCode();
                                                                                                if (iHashCode != 3694) {
                                                                                                    if (iHashCode != 3553396) {
                                                                                                        if (iHashCode != 3553576) {
                                                                                                            b2 = -1;
                                                                                                        } else {
                                                                                                            b2 = 2;
                                                                                                        }
                                                                                                    } else if (strZza6.equals(androidx.media3.extractor.text.ttml.TtmlNode.VERTICAL_LR)) {
                                                                                                        b2 = 1;
                                                                                                    } else {
                                                                                                        b2 = -1;
                                                                                                    }
                                                                                                } else if (strZza6.equals("tb")) {
                                                                                                    b2 = 0;
                                                                                                } else {
                                                                                                    b2 = -1;
                                                                                                }
                                                                                                if (b2 != 0) {
                                                                                                    i7 = 2;
                                                                                                } else {
                                                                                                    i7 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                i7 = Integer.MIN_VALUE;
                                                                                            }
                                                                                            zzalgVar = new com.google.android.gms.internal.ads.zzalg(strZza, f, f5, 0, i6, f4, f3, 1, f116, i7);
                                                                                        }
                                                                                        if (zzalgVar != null) {
                                                                                            map4.put(zzalgVar.zza, zzalgVar);
                                                                                        }
                                                                                    } else {
                                                                                        com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region without an extent");
                                                                                    }
                                                                                } catch (java.lang.NumberFormatException unused7) {
                                                                                    com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(strZza2));
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str4 = str2;
                                                                        map2 = map3;
                                                                        com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region without an origin");
                                                                    }
                                                                }
                                                                zzalgVar = null;
                                                                if (zzalgVar != null) {
                                                                    map4.put(zzalgVar.zza, zzalgVar);
                                                                }
                                                            } else if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, str2)) {
                                                                do {
                                                                    xmlPullParserNewPullParser.next();
                                                                    if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, "image")) {
                                                                        map5.put(strZza8, xmlPullParserNewPullParser.nextText());
                                                                    }
                                                                } while (!com.google.android.gms.internal.ads.zzej.zzb(xmlPullParserNewPullParser, str2));
                                                            }
                                                            if (com.google.android.gms.internal.ads.zzej.zzb(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD)) {
                                                                zzaldVar2 = zzaldVar4;
                                                                arrayDeque = arrayDeque2;
                                                            } else {
                                                                zzaldVar4 = zzaldVar4;
                                                                str2 = str4;
                                                                map3 = map2;
                                                            }
                                                        }
                                                        str4 = str2;
                                                        map2 = map3;
                                                        if (com.google.android.gms.internal.ads.zzej.zzb(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD)) {
                                                            zzaldVar2 = zzaldVar4;
                                                            arrayDeque = arrayDeque2;
                                                        } else {
                                                            zzaldVar4 = zzaldVar4;
                                                            str2 = str4;
                                                            map3 = map2;
                                                        }
                                                    }
                                                } else {
                                                    map2 = map3;
                                                    zzaldVar = zzaldVar4;
                                                    try {
                                                        attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                                        com.google.android.gms.internal.ads.zzali zzaliVarZzf3 = zzf(xmlPullParserNewPullParser, null);
                                                        strArr = null;
                                                        strSubstring = null;
                                                        str3 = str;
                                                        jZzc = -9223372036854775807L;
                                                        jZzc2 = -9223372036854775807L;
                                                        jZzc3 = -9223372036854775807L;
                                                        i5 = 0;
                                                        while (i5 < attributeCount) {
                                                            try {
                                                                attributeName = xmlPullParserNewPullParser.getAttributeName(i5);
                                                                attributeValue = xmlPullParserNewPullParser.getAttributeValue(i5);
                                                                switch (attributeName) {
                                                                    case -934795532:
                                                                        if (!attributeName.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_REGION)) {
                                                                            b = 4;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        break;
                                                                    case 99841:
                                                                        if (!attributeName.equals("dur")) {
                                                                            b = 2;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        break;
                                                                    case 100571:
                                                                        if (!attributeName.equals(androidx.media3.extractor.text.ttml.TtmlNode.END)) {
                                                                            b = 1;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        break;
                                                                    case 93616297:
                                                                        if (!attributeName.equals("begin")) {
                                                                            b = 0;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        break;
                                                                    case 109780401:
                                                                        if (!attributeName.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE)) {
                                                                            b = 3;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        break;
                                                                    case 1292595405:
                                                                        if (!attributeName.equals("backgroundImage")) {
                                                                            b = 5;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        b = -1;
                                                                        break;
                                                                }
                                                                if (b == 0) {
                                                                    zzaldVar2 = zzaldVar;
                                                                    i4 = 1;
                                                                    jZzc2 = zzc(attributeValue, zzaldVar2);
                                                                } else if (b == 1) {
                                                                    i4 = 1;
                                                                    zzaldVar2 = zzaldVar;
                                                                    jZzc = zzc(attributeValue, zzaldVar2);
                                                                } else if (b != 2) {
                                                                    if (b == 3) {
                                                                        i4 = 1;
                                                                        strArrZzg = zzg(attributeValue);
                                                                        if (strArrZzg.length > 0) {
                                                                            strArr = strArrZzg;
                                                                        }
                                                                    } else if (b == 4) {
                                                                        i4 = 1;
                                                                        if (map4.containsKey(attributeValue)) {
                                                                            str3 = attributeValue;
                                                                        }
                                                                    } else if (b != 5) {
                                                                        i4 = 1;
                                                                    } else {
                                                                        try {
                                                                            if (attributeValue.startsWith("#")) {
                                                                                i4 = 1;
                                                                                try {
                                                                                    strSubstring = attributeValue.substring(1);
                                                                                } catch (com.google.android.gms.internal.ads.zzakb e) {
                                                                                    e = e;
                                                                                    zzakbVar = e;
                                                                                    zzaldVar2 = zzaldVar;
                                                                                    arrayDeque = arrayDeque2;
                                                                                    com.google.android.gms.internal.ads.zzdo.zzg("TtmlParser", "Suppressing parser error", zzakbVar);
                                                                                    zzaldVar4 = zzaldVar2;
                                                                                    i9 = i4;
                                                                                    map = map2;
                                                                                    xmlPullParserNewPullParser.next();
                                                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                                                    map3 = map;
                                                                                    arrayDeque2 = arrayDeque;
                                                                                    str5 = str;
                                                                                    str6 = str6;
                                                                                }
                                                                            } else {
                                                                                i4 = 1;
                                                                            }
                                                                        } catch (com.google.android.gms.internal.ads.zzakb e2) {
                                                                            e = e2;
                                                                            i4 = 1;
                                                                        }
                                                                    }
                                                                    zzaldVar2 = zzaldVar;
                                                                } else {
                                                                    zzaldVar2 = zzaldVar;
                                                                    i4 = 1;
                                                                    jZzc3 = zzc(attributeValue, zzaldVar2);
                                                                }
                                                                try {
                                                                    i5++;
                                                                    zzaldVar = zzaldVar2;
                                                                    i4 = 0;
                                                                } catch (com.google.android.gms.internal.ads.zzakb e3) {
                                                                    e = e3;
                                                                    zzakbVar = e;
                                                                    arrayDeque = arrayDeque2;
                                                                    com.google.android.gms.internal.ads.zzdo.zzg("TtmlParser", "Suppressing parser error", zzakbVar);
                                                                    zzaldVar4 = zzaldVar2;
                                                                    i9 = i4;
                                                                    map = map2;
                                                                    xmlPullParserNewPullParser.next();
                                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                                    map3 = map;
                                                                    arrayDeque2 = arrayDeque;
                                                                    str5 = str;
                                                                    str6 = str6;
                                                                }
                                                            } catch (com.google.android.gms.internal.ads.zzakb e4) {
                                                                e = e4;
                                                                zzaldVar2 = zzaldVar;
                                                                i4 = 1;
                                                            }
                                                        }
                                                        zzaldVar2 = zzaldVar;
                                                        i4 = 1;
                                                        if (zzalcVar2 != null) {
                                                            j3 = zzalcVar2.zzd;
                                                            if (j3 == androidx.media3.common.C.TIME_UNSET) {
                                                                zzalcVar = zzalcVar2;
                                                            } else {
                                                                if (jZzc2 != androidx.media3.common.C.TIME_UNSET) {
                                                                    jZzc2 += j3;
                                                                } else {
                                                                    jZzc2 = -9223372036854775807L;
                                                                }
                                                                if (jZzc != androidx.media3.common.C.TIME_UNSET) {
                                                                    jZzc += j3;
                                                                    zzalcVar = zzalcVar2;
                                                                } else {
                                                                    zzalcVar = zzalcVar2;
                                                                    jZzc = -9223372036854775807L;
                                                                }
                                                            }
                                                        } else {
                                                            zzalcVar = null;
                                                        }
                                                        if (jZzc != androidx.media3.common.C.TIME_UNSET) {
                                                            j = jZzc;
                                                        } else if (jZzc3 != androidx.media3.common.C.TIME_UNSET) {
                                                            j = jZzc2 + jZzc3;
                                                        } else if (zzalcVar != null) {
                                                            j2 = zzalcVar.zze;
                                                            if (j2 != androidx.media3.common.C.TIME_UNSET) {
                                                                j = j2;
                                                            } else {
                                                                j = -9223372036854775807L;
                                                            }
                                                        } else {
                                                            j = -9223372036854775807L;
                                                        }
                                                        try {
                                                            zzalcVarZzb = com.google.android.gms.internal.ads.zzalc.zzb(xmlPullParserNewPullParser.getName(), jZzc2, j, zzaliVarZzf3, strArr, str3, strSubstring, zzalcVar);
                                                            arrayDeque = arrayDeque2;
                                                            try {
                                                                arrayDeque.push(zzalcVarZzb);
                                                                if (zzalcVar2 != null) {
                                                                    zzalcVar2.zzf(zzalcVarZzb);
                                                                }
                                                            } catch (com.google.android.gms.internal.ads.zzakb e5) {
                                                                e = e5;
                                                                zzakbVar = e;
                                                                com.google.android.gms.internal.ads.zzdo.zzg("TtmlParser", "Suppressing parser error", zzakbVar);
                                                                zzaldVar4 = zzaldVar2;
                                                                i9 = i4;
                                                            }
                                                        } catch (com.google.android.gms.internal.ads.zzakb e6) {
                                                            e = e6;
                                                            arrayDeque = arrayDeque2;
                                                        }
                                                    } catch (com.google.android.gms.internal.ads.zzakb e7) {
                                                        e = e7;
                                                        zzaldVar2 = zzaldVar;
                                                        arrayDeque = arrayDeque2;
                                                        i4 = 1;
                                                    }
                                                }
                                                zzaldVar4 = zzaldVar2;
                                                i9 = i9;
                                                map = map2;
                                            }
                                            xmlPullParserNewPullParser.next();
                                            eventType = xmlPullParserNewPullParser.getEventType();
                                            map3 = map;
                                            arrayDeque2 = arrayDeque;
                                            str5 = str;
                                            str6 = str6;
                                        }
                                    } catch (java.lang.NumberFormatException unused8) {
                                        str6 = str6;
                                    }
                                } else {
                                    com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue6));
                                    str6 = str6;
                                    zzaldVar3 = zzaldVar6;
                                    i10 = 15;
                                }
                            }
                            strZza10 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
                            if (strZza10 == null) {
                                zzaleVar = null;
                            } else {
                                matcher5 = zzf.matcher(strZza10);
                                if (matcher5.matches()) {
                                    com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZza10));
                                } else {
                                    java.lang.String strGroup20 = matcher5.group(1);
                                    strGroup20.getClass();
                                    java.lang.String str20 = strGroup20;
                                    int i113 = java.lang.Integer.parseInt(strGroup20);
                                    java.lang.String strGroup21 = matcher5.group(2);
                                    strGroup21.getClass();
                                    java.lang.String str121 = strGroup21;
                                    zzaleVar = new com.google.android.gms.internal.ads.zzale(i113, java.lang.Integer.parseInt(strGroup21));
                                }
                                zzaleVar = null;
                            }
                            zzaldVar4 = zzaldVar3;
                        } else {
                            str6 = str6;
                            arrayDeque2 = arrayDeque2;
                            zzaljVar2 = zzaljVar2;
                            i9 = i9;
                            zzaleVar = zzaleVar;
                            i10 = i10;
                        }
                        zEquals = name.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_TT);
                        str2 = androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA;
                        if (zEquals || name.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD) || name.equals("body") || name.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_DIV) || name.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P) || name.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_SPAN) || name.equals("br") || name.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE) || name.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLING) || name.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_LAYOUT) || name.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_REGION) || name.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA) || name.equals("image") || name.equals("data") || name.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_INFORMATION)) {
                            if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD.equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE)) {
                                        strZza9 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE);
                                        zzaliVarZzf = zzf(xmlPullParserNewPullParser, new com.google.android.gms.internal.ads.zzali());
                                        if (strZza9 != null) {
                                            strArrZzg2 = zzg(strZza9);
                                            i8 = 0;
                                            while (i8 < length) {
                                                zzaliVarZzf.zzl((com.google.android.gms.internal.ads.zzali) map3.get(strArrZzg2[i8]));
                                                i8++;
                                            }
                                        }
                                        strZzE = zzaliVarZzf.zzE();
                                        if (strZzE != null) {
                                            map3.put(strZzE, zzaliVarZzf);
                                        }
                                    } else {
                                        zzaldVar4 = zzaldVar4;
                                        if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_REGION)) {
                                            strZza = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, "id");
                                            if (strZza == null) {
                                                str4 = str2;
                                                map2 = map3;
                                            } else {
                                                strZza2 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, "origin");
                                                if (strZza2 != null) {
                                                    pattern = zzb;
                                                    matcher = pattern.matcher(strZza2);
                                                    pattern2 = zzf;
                                                    str4 = str2;
                                                    matcher2 = pattern2.matcher(strZza2);
                                                    if (matcher.matches()) {
                                                        map2 = map3;
                                                        java.lang.String strGroup119 = matcher.group(1);
                                                        strGroup119.getClass();
                                                        java.lang.String str1114 = strGroup119;
                                                        float f117 = java.lang.Float.parseFloat(strGroup119) / 100.0f;
                                                        java.lang.String strGroup120 = matcher.group(2);
                                                        strGroup120.getClass();
                                                        java.lang.String str1115 = strGroup120;
                                                        f2 = java.lang.Float.parseFloat(strGroup120) / 100.0f;
                                                        f = f117;
                                                        strZza3 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
                                                        if (strZza3 != null) {
                                                            matcher3 = pattern.matcher(strZza3);
                                                            matcher4 = pattern2.matcher(strZza3);
                                                            if (matcher3.matches()) {
                                                                java.lang.String strGroup1110 = matcher3.group(1);
                                                                strGroup1110.getClass();
                                                                java.lang.String str1116 = strGroup1110;
                                                                float f118 = java.lang.Float.parseFloat(strGroup1110) / 100.0f;
                                                                java.lang.String strGroup1111 = matcher3.group(2);
                                                                strGroup1111.getClass();
                                                                java.lang.String str1117 = strGroup1111;
                                                                f3 = java.lang.Float.parseFloat(strGroup1111) / 100.0f;
                                                                f4 = f118;
                                                                strZza4 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                if (strZza4 != null) {
                                                                    strZza7 = com.google.android.gms.internal.ads.zzftt.zza(strZza4);
                                                                    iHashCode2 = strZza7.hashCode();
                                                                    if (iHashCode2 != -1364013995) {
                                                                        if (iHashCode2 != 92734940 && strZza7.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER)) {
                                                                            b3 = 1;
                                                                        } else {
                                                                            b3 = -1;
                                                                        }
                                                                    } else if (strZza7.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                                                        b3 = 0;
                                                                    } else {
                                                                        b3 = -1;
                                                                    }
                                                                    if (b3 != 0) {
                                                                        f5 = f2 + (f3 / 2.0f);
                                                                        i6 = 1;
                                                                    } else if (b3 != 1) {
                                                                        f5 = f2;
                                                                        i6 = 0;
                                                                    } else {
                                                                        f5 = f2 + f3;
                                                                        i6 = 2;
                                                                    }
                                                                } else {
                                                                    f5 = f2;
                                                                    i6 = 0;
                                                                }
                                                                float f119 = 1.0f / i10;
                                                                strZza5 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                if (strZza5 != null) {
                                                                    strZza6 = com.google.android.gms.internal.ads.zzftt.zza(strZza5);
                                                                    iHashCode = strZza6.hashCode();
                                                                    if (iHashCode != 3694) {
                                                                        if (iHashCode != 3553396) {
                                                                            if (iHashCode != 3553576 && strZza6.equals(androidx.media3.extractor.text.ttml.TtmlNode.VERTICAL_RL)) {
                                                                                b2 = 2;
                                                                            } else {
                                                                                b2 = -1;
                                                                            }
                                                                        } else if (strZza6.equals(androidx.media3.extractor.text.ttml.TtmlNode.VERTICAL_LR)) {
                                                                            b2 = 1;
                                                                        } else {
                                                                            b2 = -1;
                                                                        }
                                                                    } else if (strZza6.equals("tb")) {
                                                                        b2 = 0;
                                                                    } else {
                                                                        b2 = -1;
                                                                    }
                                                                    if (b2 != 0 || b2 == 1) {
                                                                        i7 = 2;
                                                                    } else if (b2 != 2) {
                                                                        i7 = Integer.MIN_VALUE;
                                                                    } else {
                                                                        i7 = 1;
                                                                    }
                                                                } else {
                                                                    i7 = Integer.MIN_VALUE;
                                                                }
                                                                zzalgVar = new com.google.android.gms.internal.ads.zzalg(strZza, f, f5, 0, i6, f4, f3, 1, f119, i7);
                                                            } else if (matcher4.matches()) {
                                                                com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza2));
                                                            } else if (zzaleVar == null) {
                                                                com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                            } else {
                                                                java.lang.String strGroup1112 = matcher4.group(1);
                                                                strGroup1112.getClass();
                                                                java.lang.String str1118 = strGroup1112;
                                                                int i114 = java.lang.Integer.parseInt(strGroup1112);
                                                                java.lang.String strGroup1113 = matcher4.group(2);
                                                                strGroup1113.getClass();
                                                                java.lang.String str1119 = strGroup1113;
                                                                int i26 = java.lang.Integer.parseInt(strGroup1113);
                                                                float f1110 = i114 / zzaleVar.zza;
                                                                f3 = i26 / zzaleVar.zzb;
                                                                f4 = f1110;
                                                                strZza4 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                if (strZza4 != null) {
                                                                    strZza7 = com.google.android.gms.internal.ads.zzftt.zza(strZza4);
                                                                    iHashCode2 = strZza7.hashCode();
                                                                    if (iHashCode2 != -1364013995) {
                                                                        if (iHashCode2 != 92734940) {
                                                                            b3 = -1;
                                                                        } else {
                                                                            b3 = 1;
                                                                        }
                                                                    } else if (strZza7.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                                                        b3 = 0;
                                                                    } else {
                                                                        b3 = -1;
                                                                    }
                                                                    if (b3 != 0) {
                                                                        f5 = f2 + (f3 / 2.0f);
                                                                        i6 = 1;
                                                                    } else if (b3 != 1) {
                                                                        f5 = f2;
                                                                        i6 = 0;
                                                                    } else {
                                                                        f5 = f2 + f3;
                                                                        i6 = 2;
                                                                    }
                                                                } else {
                                                                    f5 = f2;
                                                                    i6 = 0;
                                                                }
                                                                float f1111 = 1.0f / i10;
                                                                strZza5 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                if (strZza5 != null) {
                                                                    strZza6 = com.google.android.gms.internal.ads.zzftt.zza(strZza5);
                                                                    iHashCode = strZza6.hashCode();
                                                                    if (iHashCode != 3694) {
                                                                        if (iHashCode != 3553396) {
                                                                            if (iHashCode != 3553576) {
                                                                                b2 = -1;
                                                                            } else {
                                                                                b2 = 2;
                                                                            }
                                                                        } else if (strZza6.equals(androidx.media3.extractor.text.ttml.TtmlNode.VERTICAL_LR)) {
                                                                            b2 = 1;
                                                                        } else {
                                                                            b2 = -1;
                                                                        }
                                                                    } else if (strZza6.equals("tb")) {
                                                                        b2 = 0;
                                                                    } else {
                                                                        b2 = -1;
                                                                    }
                                                                    if (b2 != 0) {
                                                                        i7 = 2;
                                                                    } else {
                                                                        i7 = 2;
                                                                    }
                                                                } else {
                                                                    i7 = Integer.MIN_VALUE;
                                                                }
                                                                zzalgVar = new com.google.android.gms.internal.ads.zzalg(strZza, f, f5, 0, i6, f4, f3, 1, f1111, i7);
                                                            }
                                                            if (zzalgVar != null) {
                                                                map4.put(zzalgVar.zza, zzalgVar);
                                                            }
                                                        } else {
                                                            com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region without an extent");
                                                        }
                                                    } else {
                                                        map2 = map3;
                                                        if (!matcher2.matches()) {
                                                            com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZza2));
                                                        } else if (zzaleVar == null) {
                                                            com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                        } else {
                                                            java.lang.String strGroup1114 = matcher2.group(1);
                                                            strGroup1114.getClass();
                                                            java.lang.String str1120 = strGroup1114;
                                                            int i27 = java.lang.Integer.parseInt(strGroup1114);
                                                            java.lang.String strGroup1115 = matcher2.group(2);
                                                            strGroup1115.getClass();
                                                            java.lang.String str122 = strGroup1115;
                                                            float f1112 = java.lang.Integer.parseInt(strGroup1115);
                                                            f = i27 / zzaleVar.zza;
                                                            f2 = f1112 / zzaleVar.zzb;
                                                            strZza3 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
                                                            if (strZza3 != null) {
                                                                matcher3 = pattern.matcher(strZza3);
                                                                matcher4 = pattern2.matcher(strZza3);
                                                                if (matcher3.matches()) {
                                                                    java.lang.String strGroup1116 = matcher3.group(1);
                                                                    strGroup1116.getClass();
                                                                    java.lang.String str11110 = strGroup1116;
                                                                    float f1113 = java.lang.Float.parseFloat(strGroup1116) / 100.0f;
                                                                    java.lang.String strGroup1117 = matcher3.group(2);
                                                                    strGroup1117.getClass();
                                                                    java.lang.String str11111 = strGroup1117;
                                                                    f3 = java.lang.Float.parseFloat(strGroup1117) / 100.0f;
                                                                    f4 = f1113;
                                                                    strZza4 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                    if (strZza4 != null) {
                                                                        strZza7 = com.google.android.gms.internal.ads.zzftt.zza(strZza4);
                                                                        iHashCode2 = strZza7.hashCode();
                                                                        if (iHashCode2 != -1364013995) {
                                                                            if (iHashCode2 != 92734940) {
                                                                                b3 = -1;
                                                                            } else {
                                                                                b3 = 1;
                                                                            }
                                                                        } else if (strZza7.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                                                            b3 = 0;
                                                                        } else {
                                                                            b3 = -1;
                                                                        }
                                                                        if (b3 != 0) {
                                                                            f5 = f2 + (f3 / 2.0f);
                                                                            i6 = 1;
                                                                        } else if (b3 != 1) {
                                                                            f5 = f2;
                                                                            i6 = 0;
                                                                        } else {
                                                                            f5 = f2 + f3;
                                                                            i6 = 2;
                                                                        }
                                                                    } else {
                                                                        f5 = f2;
                                                                        i6 = 0;
                                                                    }
                                                                    float f1114 = 1.0f / i10;
                                                                    strZza5 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                    if (strZza5 != null) {
                                                                        strZza6 = com.google.android.gms.internal.ads.zzftt.zza(strZza5);
                                                                        iHashCode = strZza6.hashCode();
                                                                        if (iHashCode != 3694) {
                                                                            if (iHashCode != 3553396) {
                                                                                if (iHashCode != 3553576) {
                                                                                    b2 = -1;
                                                                                } else {
                                                                                    b2 = 2;
                                                                                }
                                                                            } else if (strZza6.equals(androidx.media3.extractor.text.ttml.TtmlNode.VERTICAL_LR)) {
                                                                                b2 = 1;
                                                                            } else {
                                                                                b2 = -1;
                                                                            }
                                                                        } else if (strZza6.equals("tb")) {
                                                                            b2 = 0;
                                                                        } else {
                                                                            b2 = -1;
                                                                        }
                                                                        if (b2 != 0) {
                                                                            i7 = 2;
                                                                        } else {
                                                                            i7 = 2;
                                                                        }
                                                                    } else {
                                                                        i7 = Integer.MIN_VALUE;
                                                                    }
                                                                    zzalgVar = new com.google.android.gms.internal.ads.zzalg(strZza, f, f5, 0, i6, f4, f3, 1, f1114, i7);
                                                                } else if (matcher4.matches()) {
                                                                    com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza2));
                                                                } else if (zzaleVar == null) {
                                                                    com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                } else {
                                                                    java.lang.String strGroup1118 = matcher4.group(1);
                                                                    strGroup1118.getClass();
                                                                    java.lang.String str11112 = strGroup1118;
                                                                    int i115 = java.lang.Integer.parseInt(strGroup1118);
                                                                    java.lang.String strGroup1119 = matcher4.group(2);
                                                                    strGroup1119.getClass();
                                                                    java.lang.String str11113 = strGroup1119;
                                                                    int i28 = java.lang.Integer.parseInt(strGroup1119);
                                                                    float f1115 = i115 / zzaleVar.zza;
                                                                    f3 = i28 / zzaleVar.zzb;
                                                                    f4 = f1115;
                                                                    strZza4 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                    if (strZza4 != null) {
                                                                        strZza7 = com.google.android.gms.internal.ads.zzftt.zza(strZza4);
                                                                        iHashCode2 = strZza7.hashCode();
                                                                        if (iHashCode2 != -1364013995) {
                                                                            if (iHashCode2 != 92734940) {
                                                                                b3 = -1;
                                                                            } else {
                                                                                b3 = 1;
                                                                            }
                                                                        } else if (strZza7.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                                                            b3 = 0;
                                                                        } else {
                                                                            b3 = -1;
                                                                        }
                                                                        if (b3 != 0) {
                                                                            f5 = f2 + (f3 / 2.0f);
                                                                            i6 = 1;
                                                                        } else if (b3 != 1) {
                                                                            f5 = f2;
                                                                            i6 = 0;
                                                                        } else {
                                                                            f5 = f2 + f3;
                                                                            i6 = 2;
                                                                        }
                                                                    } else {
                                                                        f5 = f2;
                                                                        i6 = 0;
                                                                    }
                                                                    float f1116 = 1.0f / i10;
                                                                    strZza5 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                                                                    if (strZza5 != null) {
                                                                        strZza6 = com.google.android.gms.internal.ads.zzftt.zza(strZza5);
                                                                        iHashCode = strZza6.hashCode();
                                                                        if (iHashCode != 3694) {
                                                                            if (iHashCode != 3553396) {
                                                                                if (iHashCode != 3553576) {
                                                                                    b2 = -1;
                                                                                } else {
                                                                                    b2 = 2;
                                                                                }
                                                                            } else if (strZza6.equals(androidx.media3.extractor.text.ttml.TtmlNode.VERTICAL_LR)) {
                                                                                b2 = 1;
                                                                            } else {
                                                                                b2 = -1;
                                                                            }
                                                                        } else if (strZza6.equals("tb")) {
                                                                            b2 = 0;
                                                                        } else {
                                                                            b2 = -1;
                                                                        }
                                                                        if (b2 != 0) {
                                                                            i7 = 2;
                                                                        } else {
                                                                            i7 = 2;
                                                                        }
                                                                    } else {
                                                                        i7 = Integer.MIN_VALUE;
                                                                    }
                                                                    zzalgVar = new com.google.android.gms.internal.ads.zzalg(strZza, f, f5, 0, i6, f4, f3, 1, f1116, i7);
                                                                }
                                                                if (zzalgVar != null) {
                                                                    map4.put(zzalgVar.zza, zzalgVar);
                                                                }
                                                            } else {
                                                                com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region without an extent");
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    str4 = str2;
                                                    map2 = map3;
                                                    com.google.android.gms.internal.ads.zzdo.zzf("TtmlParser", "Ignoring region without an origin");
                                                }
                                            }
                                            zzalgVar = null;
                                            if (zzalgVar != null) {
                                                map4.put(zzalgVar.zza, zzalgVar);
                                            }
                                        } else if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, str2)) {
                                            do {
                                                xmlPullParserNewPullParser.next();
                                                if (com.google.android.gms.internal.ads.zzej.zzc(xmlPullParserNewPullParser, "image") && (strZza8 = com.google.android.gms.internal.ads.zzej.zza(xmlPullParserNewPullParser, "id")) != null) {
                                                    map5.put(strZza8, xmlPullParserNewPullParser.nextText());
                                                }
                                            } while (!com.google.android.gms.internal.ads.zzej.zzb(xmlPullParserNewPullParser, str2));
                                        }
                                        if (com.google.android.gms.internal.ads.zzej.zzb(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD)) {
                                            zzaldVar2 = zzaldVar4;
                                            arrayDeque = arrayDeque2;
                                        } else {
                                            zzaldVar4 = zzaldVar4;
                                            str2 = str4;
                                            map3 = map2;
                                        }
                                    }
                                    str4 = str2;
                                    map2 = map3;
                                    if (com.google.android.gms.internal.ads.zzej.zzb(xmlPullParserNewPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD)) {
                                        zzaldVar2 = zzaldVar4;
                                        arrayDeque = arrayDeque2;
                                    } else {
                                        zzaldVar4 = zzaldVar4;
                                        str2 = str4;
                                        map3 = map2;
                                    }
                                }
                            } else {
                                map2 = map3;
                                zzaldVar = zzaldVar4;
                                attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                com.google.android.gms.internal.ads.zzali zzaliVarZzf4 = zzf(xmlPullParserNewPullParser, null);
                                strArr = null;
                                strSubstring = null;
                                str3 = str;
                                jZzc = -9223372036854775807L;
                                jZzc2 = -9223372036854775807L;
                                jZzc3 = -9223372036854775807L;
                                i5 = 0;
                                while (i5 < attributeCount) {
                                    attributeName = xmlPullParserNewPullParser.getAttributeName(i5);
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(i5);
                                    switch (attributeName) {
                                        case -934795532:
                                            if (!attributeName.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_REGION)) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 99841:
                                            if (!attributeName.equals("dur")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 100571:
                                            if (!attributeName.equals(androidx.media3.extractor.text.ttml.TtmlNode.END)) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 93616297:
                                            if (!attributeName.equals("begin")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 109780401:
                                            if (!attributeName.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE)) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1292595405:
                                            if (!attributeName.equals("backgroundImage")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    if (b == 0) {
                                        zzaldVar2 = zzaldVar;
                                        i4 = 1;
                                        jZzc2 = zzc(attributeValue, zzaldVar2);
                                    } else if (b == 1) {
                                        i4 = 1;
                                        zzaldVar2 = zzaldVar;
                                        jZzc = zzc(attributeValue, zzaldVar2);
                                    } else if (b != 2) {
                                        if (b == 3) {
                                            i4 = 1;
                                            strArrZzg = zzg(attributeValue);
                                            if (strArrZzg.length > 0) {
                                                strArr = strArrZzg;
                                            }
                                        } else if (b == 4) {
                                            i4 = 1;
                                            if (map4.containsKey(attributeValue)) {
                                                str3 = attributeValue;
                                            }
                                        } else if (b != 5) {
                                            i4 = 1;
                                        } else if (attributeValue.startsWith("#")) {
                                            i4 = 1;
                                            strSubstring = attributeValue.substring(1);
                                        } else {
                                            i4 = 1;
                                        }
                                        zzaldVar2 = zzaldVar;
                                    } else {
                                        zzaldVar2 = zzaldVar;
                                        i4 = 1;
                                        jZzc3 = zzc(attributeValue, zzaldVar2);
                                    }
                                    i5++;
                                    zzaldVar = zzaldVar2;
                                    i4 = 0;
                                }
                                zzaldVar2 = zzaldVar;
                                i4 = 1;
                                if (zzalcVar2 != null) {
                                    j3 = zzalcVar2.zzd;
                                    if (j3 == androidx.media3.common.C.TIME_UNSET) {
                                        zzalcVar = zzalcVar2;
                                    } else {
                                        if (jZzc2 != androidx.media3.common.C.TIME_UNSET) {
                                            jZzc2 += j3;
                                        } else {
                                            jZzc2 = -9223372036854775807L;
                                        }
                                        if (jZzc != androidx.media3.common.C.TIME_UNSET) {
                                            jZzc += j3;
                                            zzalcVar = zzalcVar2;
                                        } else {
                                            zzalcVar = zzalcVar2;
                                            jZzc = -9223372036854775807L;
                                        }
                                    }
                                } else {
                                    zzalcVar = null;
                                }
                                if (jZzc != androidx.media3.common.C.TIME_UNSET) {
                                    j = jZzc;
                                } else if (jZzc3 != androidx.media3.common.C.TIME_UNSET) {
                                    j = jZzc2 + jZzc3;
                                } else if (zzalcVar != null) {
                                    j2 = zzalcVar.zze;
                                    if (j2 != androidx.media3.common.C.TIME_UNSET) {
                                        j = j2;
                                    } else {
                                        j = -9223372036854775807L;
                                    }
                                } else {
                                    j = -9223372036854775807L;
                                }
                                zzalcVarZzb = com.google.android.gms.internal.ads.zzalc.zzb(xmlPullParserNewPullParser.getName(), jZzc2, j, zzaliVarZzf4, strArr, str3, strSubstring, zzalcVar);
                                arrayDeque = arrayDeque2;
                                arrayDeque.push(zzalcVarZzb);
                                if (zzalcVar2 != null) {
                                    zzalcVar2.zzf(zzalcVarZzb);
                                }
                            }
                            zzaldVar4 = zzaldVar2;
                            i9 = i9;
                            map = map2;
                        } else {
                            com.google.android.gms.internal.ads.zzdo.zze("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            map = map3;
                            zzaleVar = zzaleVar;
                            i10 = i10;
                            zzaljVar2 = zzaljVar2;
                            arrayDeque = arrayDeque2;
                            i9 = 1;
                        }
                    } else {
                        str6 = str6;
                        java.util.HashMap map6 = map3;
                        arrayDeque = arrayDeque2;
                        zzaljVar = zzaljVar2;
                        i3 = i9;
                        if (eventType == 4) {
                            zzalcVar2.getClass();
                            zzalcVar2.zzf(com.google.android.gms.internal.ads.zzalc.zzc(xmlPullParserNewPullParser.getText()));
                        } else {
                            if (eventType == 3) {
                                if (xmlPullParserNewPullParser.getName().equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_TT)) {
                                    com.google.android.gms.internal.ads.zzalc zzalcVar3 = (com.google.android.gms.internal.ads.zzalc) arrayDeque.peek();
                                    zzalcVar3.getClass();
                                    map = map6;
                                    zzaljVar2 = new com.google.android.gms.internal.ads.zzalj(zzalcVar3, map, map4, map5);
                                } else {
                                    map = map6;
                                    zzaljVar2 = zzaljVar;
                                }
                                arrayDeque.pop();
                            }
                            i9 = i3;
                        }
                        map = map6;
                        zzaljVar2 = zzaljVar;
                        i9 = i3;
                    }
                } else {
                    str = str5;
                    str6 = str6;
                    map = map3;
                    arrayDeque = arrayDeque2;
                    zzaljVar = zzaljVar2;
                    i3 = i9;
                    if (eventType == 2) {
                        i9 = i3 + 1;
                    } else {
                        if (eventType == 3) {
                            i9 = i3 - 1;
                        }
                        zzaljVar2 = zzaljVar;
                        i9 = i3;
                    }
                    zzaljVar2 = zzaljVar;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                map3 = map;
                arrayDeque2 = arrayDeque;
                str5 = str;
                str6 = str6;
            }
            com.google.android.gms.internal.ads.zzalj zzaljVar3 = zzaljVar2;
            zzaljVar3.getClass();
            return zzaljVar3;
        } catch (java.io.IOException e8) {
            throw new java.lang.IllegalStateException("Unexpected error when reading input.", e8);
        } catch (org.xmlpull.v1.XmlPullParserException e9) {
            throw new java.lang.IllegalStateException("Unable to decode source", e9);
        }
    }

    public zzalf() {
        try {
            org.xmlpull.v1.XmlPullParserFactory xmlPullParserFactoryNewInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (org.xmlpull.v1.XmlPullParserException e) {
            throw new java.lang.RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
