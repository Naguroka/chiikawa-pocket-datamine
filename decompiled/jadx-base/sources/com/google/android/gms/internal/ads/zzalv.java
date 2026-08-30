package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzalv {
    public static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("(\\S+?):(\\S+)");
    private static final java.util.Map zzc;
    private static final java.util.Map zzd;

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put("white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        map.put("lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        map.put("cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        map.put("red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        map.put("yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        map.put("magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        map.put("blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        map.put("black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        zzc = java.util.Collections.unmodifiableMap(map);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("bg_white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        map2.put("bg_lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        map2.put("bg_red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        map2.put("bg_blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        map2.put("bg_black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        zzd = java.util.Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    static android.text.SpannedString zza(java.lang.String str, java.lang.String str2, java.util.List list) {
        byte b;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char c = 0;
        int i = 0;
        while (i < str2.length()) {
            int length = i + 1;
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, length);
                int iIndexOf2 = str2.indexOf(32, length);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = java.lang.Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    java.lang.String strSubstring = str2.substring(length, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (strSubstring.equals("amp")) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                        } else if (strSubstring.equals("lt")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (strSubstring.equals("gt")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        spannableStringBuilder.append(kotlin.text.Typography.less);
                    } else if (b == 1) {
                        spannableStringBuilder.append(kotlin.text.Typography.greater);
                    } else if (b == 2) {
                        spannableStringBuilder.append(' ');
                    } else if (b != 3) {
                        com.google.android.gms.internal.ads.zzdo.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                    } else {
                        spannableStringBuilder.append(kotlin.text.Typography.amp);
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((java.lang.CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
                c = 0;
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (length < str2.length()) {
                char cCharAt2 = str2.charAt(length);
                int iIndexOf3 = str2.indexOf(62, length);
                length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i2 = length - 2;
                char c2 = str2.charAt(i2) == '/' ? (char) 1 : c;
                int i3 = i + (cCharAt2 == '/' ? 2 : 1);
                if (c2 == 0) {
                    i2 = length - 1;
                }
                java.lang.String strSubstring2 = str2.substring(i3, i2);
                if (!strSubstring2.trim().isEmpty()) {
                    java.lang.String strTrim = strSubstring2.trim();
                    com.google.android.gms.internal.ads.zzcw.zzd(!strTrim.isEmpty());
                    int i4 = com.google.android.gms.internal.ads.zzei.zza;
                    java.lang.String str3 = strTrim.split("[ \\.]", 2)[c];
                    switch (str3) {
                        case "b":
                        case "c":
                        case "i":
                        case "lang":
                        case "ruby":
                        case "rt":
                        case "u":
                        case "v":
                            if (cCharAt2 == '/') {
                                while (!arrayDeque.isEmpty()) {
                                    com.google.android.gms.internal.ads.zzalr zzalrVar = (com.google.android.gms.internal.ads.zzalr) arrayDeque.pop();
                                    zzg(str, zzalrVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new com.google.android.gms.internal.ads.zzalq(zzalrVar, spannableStringBuilder.length(), null));
                                    }
                                    if (zzalrVar.zza.equals(str3)) {
                                        break;
                                    }
                                }
                                break;
                            } else {
                                if (c2 == 0) {
                                    arrayDeque.push(com.google.android.gms.internal.ads.zzalr.zza(strSubstring2, spannableStringBuilder.length()));
                                }
                                break;
                            }
                            break;
                    }
                }
            }
            i = length;
            c = 0;
        }
        while (!arrayDeque.isEmpty()) {
            zzg(str, (com.google.android.gms.internal.ads.zzalr) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzg(str, com.google.android.gms.internal.ads.zzalr.zzb(), java.util.Collections.emptyList(), spannableStringBuilder, list);
        return android.text.SpannedString.valueOf(spannableStringBuilder);
    }

    static com.google.android.gms.internal.ads.zzcm zzb(java.lang.String str) {
        com.google.android.gms.internal.ads.zzalt zzaltVar = new com.google.android.gms.internal.ads.zzalt();
        zzh(str, zzaltVar);
        return zzaltVar.zza();
    }

    public static com.google.android.gms.internal.ads.zzalo zzc(com.google.android.gms.internal.ads.zzdy zzdyVar, java.util.List list) {
        java.lang.String strZzz = zzdyVar.zzz(java.nio.charset.StandardCharsets.UTF_8);
        if (strZzz != null) {
            java.util.regex.Pattern pattern = zza;
            java.util.regex.Matcher matcher = pattern.matcher(strZzz);
            if (matcher.matches()) {
                return zze(null, matcher, zzdyVar, list);
            }
            java.lang.String strZzz2 = zzdyVar.zzz(java.nio.charset.StandardCharsets.UTF_8);
            if (strZzz2 != null) {
                java.util.regex.Matcher matcher2 = pattern.matcher(strZzz2);
                if (matcher2.matches()) {
                    return zze(strZzz.trim(), matcher2, zzdyVar, list);
                }
            }
        }
        return null;
    }

    private static int zzd(java.util.List list, java.lang.String str, com.google.android.gms.internal.ads.zzalr zzalrVar) {
        java.util.List listZzf = zzf(list, str, zzalrVar);
        for (int i = 0; i < listZzf.size(); i++) {
            com.google.android.gms.internal.ads.zzaln zzalnVar = ((com.google.android.gms.internal.ads.zzals) listZzf.get(i)).zzb;
            if (zzalnVar.zze() != -1) {
                return zzalnVar.zze();
            }
        }
        return -1;
    }

    private static com.google.android.gms.internal.ads.zzalo zze(java.lang.String str, java.util.regex.Matcher matcher, com.google.android.gms.internal.ads.zzdy zzdyVar, java.util.List list) {
        com.google.android.gms.internal.ads.zzalt zzaltVar = new com.google.android.gms.internal.ads.zzalt();
        try {
            java.lang.String strGroup = matcher.group(1);
            strGroup.getClass();
            java.lang.String str2 = strGroup;
            zzaltVar.zza = com.google.android.gms.internal.ads.zzalx.zzb(strGroup);
            java.lang.String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            java.lang.String str3 = strGroup2;
            zzaltVar.zzb = com.google.android.gms.internal.ads.zzalx.zzb(strGroup2);
            java.lang.String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zzh(strGroup3, zzaltVar);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String strZzz = zzdyVar.zzz(java.nio.charset.StandardCharsets.UTF_8);
            while (!android.text.TextUtils.isEmpty(strZzz)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strZzz.trim());
                strZzz = zzdyVar.zzz(java.nio.charset.StandardCharsets.UTF_8);
            }
            zzaltVar.zzc = zza(str, sb.toString(), list);
            return new com.google.android.gms.internal.ads.zzalo(zzaltVar.zza().zzp(), zzaltVar.zza, zzaltVar.zzb);
        } catch (java.lang.NumberFormatException unused) {
            com.google.android.gms.internal.ads.zzdo.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(java.lang.String.valueOf(matcher.group())));
            return null;
        }
    }

    private static java.util.List zzf(java.util.List list, java.lang.String str, com.google.android.gms.internal.ads.zzalr zzalrVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.google.android.gms.internal.ads.zzaln zzalnVar = (com.google.android.gms.internal.ads.zzaln) list.get(i);
            int iZzf = zzalnVar.zzf(str, zzalrVar.zza, zzalrVar.zzd, zzalrVar.zzc);
            if (iZzf > 0) {
                arrayList.add(new com.google.android.gms.internal.ads.zzals(iZzf, zzalnVar));
            }
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    private static void zzg(java.lang.String str, com.google.android.gms.internal.ads.zzalr zzalrVar, java.util.List list, android.text.SpannableStringBuilder spannableStringBuilder, java.util.List list2) {
        byte b;
        int i = zzalrVar.zzb;
        int length = spannableStringBuilder.length();
        java.lang.String str2 = zzalrVar.zza;
        int iHashCode = str2.hashCode();
        int i2 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals("v")) {
                                        b = 5;
                                    } else {
                                        b = -1;
                                    }
                                } else if (str2.equals("u")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                            } else if (str2.equals("c")) {
                                b = 4;
                            } else {
                                b = -1;
                            }
                        } else if (str2.equals("b")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (str2.equals(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_RUBY)) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str2.equals(com.json.ce.p)) {
                    b = 6;
                } else {
                    b = -1;
                }
            } else if (str2.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT)) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str2.equals("")) {
            b = 7;
        } else {
            b = -1;
        }
        switch (b) {
            case 0:
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, length, 33);
                break;
            case 2:
                int iZzd = zzd(list2, str, zzalrVar);
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                arrayList.addAll(list);
                java.util.Collections.sort(arrayList, com.google.android.gms.internal.ads.zzalq.zza);
                int i3 = zzalrVar.zzb;
                int i4 = 0;
                int length2 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((com.google.android.gms.internal.ads.zzalq) arrayList.get(i4)).zzb.zza)) {
                        com.google.android.gms.internal.ads.zzalq zzalqVar = (com.google.android.gms.internal.ads.zzalq) arrayList.get(i4);
                        int iZzd2 = zzd(list2, str, zzalqVar.zzb);
                        if (iZzd2 == i2) {
                            iZzd2 = iZzd != i2 ? iZzd : 1;
                        }
                        int i5 = zzalqVar.zzb.zzb - length2;
                        int i6 = zzalqVar.zzc - length2;
                        java.lang.CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                        spannableStringBuilder.delete(i5, i6);
                        spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.zzcs(charSequenceSubSequence.toString(), iZzd2), i3, i5, 33);
                        length2 += charSequenceSubSequence.length();
                        i3 = i5;
                    }
                    i4++;
                    i2 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, length, 33);
                break;
            case 4:
                for (java.lang.String str3 : zzalrVar.zzd) {
                    java.util.Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        java.util.Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(((java.lang.Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.zzcv(zzalrVar.zzc), i, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        java.util.List listZzf = zzf(list2, str, zzalrVar);
        for (int i7 = 0; i7 < listZzf.size(); i7++) {
            com.google.android.gms.internal.ads.zzaln zzalnVar = ((com.google.android.gms.internal.ads.zzals) listZzf.get(i7)).zzb;
            if (zzalnVar != null) {
                if (zzalnVar.zzg() != -1) {
                    com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new android.text.style.StyleSpan(zzalnVar.zzg()), i, length, 33);
                }
                if (zzalnVar.zzz()) {
                    spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, length, 33);
                }
                if (zzalnVar.zzy()) {
                    com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new android.text.style.ForegroundColorSpan(zzalnVar.zzc()), i, length, 33);
                }
                if (zzalnVar.zzx()) {
                    com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new android.text.style.BackgroundColorSpan(zzalnVar.zzb()), i, length, 33);
                }
                if (zzalnVar.zzr() != null) {
                    com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new android.text.style.TypefaceSpan(zzalnVar.zzr()), i, length, 33);
                }
                int iZzd3 = zzalnVar.zzd();
                if (iZzd3 == 1) {
                    com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) zzalnVar.zza(), true), i, length, 33);
                } else if (iZzd3 == 2) {
                    com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new android.text.style.RelativeSizeSpan(zzalnVar.zza()), i, length, 33);
                } else if (iZzd3 == 3) {
                    com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new android.text.style.RelativeSizeSpan(zzalnVar.zza() / 100.0f), i, length, 33);
                }
                if (zzalnVar.zzw()) {
                    spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.zzcr(), i, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zzh(java.lang.String str, com.google.android.gms.internal.ads.zzalt zzaltVar) {
        java.util.regex.Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            java.lang.String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = 2;
            java.lang.String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                byte b = -1;
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        java.lang.String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                    b = 1;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    b = 2;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals(androidx.media3.extractor.text.ttml.TtmlNode.END)) {
                                    b = 3;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals(androidx.media3.extractor.text.ttml.TtmlNode.START)) {
                                    b = 0;
                                }
                                break;
                        }
                        if (b == 0) {
                            i2 = 0;
                        } else if (b == 1 || b == 2) {
                            i2 = 1;
                        } else if (b != 3) {
                            com.google.android.gms.internal.ads.zzdo.zzf("WebvttCueParser", "Invalid anchor value: ".concat(java.lang.String.valueOf(strSubstring)));
                            i2 = Integer.MIN_VALUE;
                        }
                        zzaltVar.zzg = i2;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzaltVar.zze = com.google.android.gms.internal.ads.zzalx.zza(strGroup2);
                        zzaltVar.zzf = 0;
                    } else {
                        zzaltVar.zze = java.lang.Integer.parseInt(strGroup2);
                        zzaltVar.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            if (strGroup2.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                b = 2;
                            }
                            break;
                        case -1074341483:
                            if (strGroup2.equals("middle")) {
                                b = 3;
                            }
                            break;
                        case 100571:
                            if (strGroup2.equals(androidx.media3.extractor.text.ttml.TtmlNode.END)) {
                                b = 4;
                            }
                            break;
                        case 3317767:
                            if (strGroup2.equals(androidx.media3.extractor.text.ttml.TtmlNode.LEFT)) {
                                b = 1;
                            }
                            break;
                        case 108511772:
                            if (strGroup2.equals(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT)) {
                                b = 5;
                            }
                            break;
                        case 109757538:
                            if (strGroup2.equals(androidx.media3.extractor.text.ttml.TtmlNode.START)) {
                                b = 0;
                            }
                            break;
                    }
                    if (b != 0) {
                        if (b == 1) {
                            i = 4;
                        } else if (b == 2 || b == 3) {
                            i = 2;
                        } else if (b != 4) {
                            i = 5;
                            if (b != 5) {
                                com.google.android.gms.internal.ads.zzdo.zzf("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                            }
                        } else {
                            i = 3;
                        }
                    }
                    zzaltVar.zzd = i;
                } else if (com.ironsource.y8.h.L.equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        java.lang.String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                if (strSubstring2.equals("line-left")) {
                                    b = 0;
                                }
                                break;
                            case -1364013995:
                                if (strSubstring2.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                                    b = 2;
                                }
                                break;
                            case -1276788989:
                                if (strSubstring2.equals("line-right")) {
                                    b = 4;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring2.equals("middle")) {
                                    b = 3;
                                }
                                break;
                            case 100571:
                                if (strSubstring2.equals(androidx.media3.extractor.text.ttml.TtmlNode.END)) {
                                    b = 5;
                                }
                                break;
                            case 109757538:
                                if (strSubstring2.equals(androidx.media3.extractor.text.ttml.TtmlNode.START)) {
                                    b = 1;
                                }
                                break;
                        }
                        if (b == 0 || b == 1) {
                            i = 0;
                        } else if (b != 2 && b != 3) {
                            if (b == 4 || b == 5) {
                                i = 2;
                            } else {
                                com.google.android.gms.internal.ads.zzdo.zzf("WebvttCueParser", "Invalid anchor value: ".concat(java.lang.String.valueOf(strSubstring2)));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        zzaltVar.zzi = i;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzaltVar.zzh = com.google.android.gms.internal.ads.zzalx.zza(strGroup2);
                } else if ("size".equals(strGroup)) {
                    zzaltVar.zzj = com.google.android.gms.internal.ads.zzalx.zza(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            b = 0;
                        }
                    } else if (strGroup2.equals("lr")) {
                        b = 1;
                    }
                    if (b != 0) {
                        if (b != 1) {
                            com.google.android.gms.internal.ads.zzdo.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    zzaltVar.zzk = i;
                } else {
                    com.google.android.gms.internal.ads.zzdo.zzf("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (java.lang.NumberFormatException unused) {
                com.google.android.gms.internal.ads.zzdo.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(java.lang.String.valueOf(matcher.group())));
            }
        }
    }
}
