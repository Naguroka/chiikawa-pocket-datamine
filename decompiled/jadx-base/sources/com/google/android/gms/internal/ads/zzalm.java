package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzalm {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final com.google.android.gms.internal.ads.zzdy zzc = new com.google.android.gms.internal.ads.zzdy();
    private final java.lang.StringBuilder zzd = new java.lang.StringBuilder();

    static java.lang.String zza(com.google.android.gms.internal.ads.zzdy zzdyVar, java.lang.StringBuilder sb) {
        zzc(zzdyVar);
        if (zzdyVar.zzb() == 0) {
            return null;
        }
        java.lang.String strZzd = zzd(zzdyVar, sb);
        if (!"".equals(strZzd)) {
            return strZzd;
        }
        char cZzm = (char) zzdyVar.zzm();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(cZzm);
        return sb2.toString();
    }

    static void zzc(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        while (true) {
            for (boolean z = true; zzdyVar.zzb() > 0 && z; z = false) {
                char c = (char) zzdyVar.zzN()[zzdyVar.zzd()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzdyVar.zzM(1);
                } else {
                    int iZzd = zzdyVar.zzd();
                    int iZze = zzdyVar.zze();
                    byte[] bArrZzN = zzdyVar.zzN();
                    if (iZzd + 2 <= iZze) {
                        int i = iZzd + 1;
                        if (bArrZzN[iZzd] == 47) {
                            int i2 = i + 1;
                            if (bArrZzN[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzN[i2]) == '*' && ((char) bArrZzN[i3]) == '/') {
                                        iZze = i3 + 1;
                                        i2 = iZze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzdyVar.zzM(iZze - zzdyVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static java.lang.String zzd(com.google.android.gms.internal.ads.zzdy zzdyVar, java.lang.StringBuilder sb) {
        char c;
        sb.setLength(0);
        int iZzd = zzdyVar.zzd();
        int iZze = zzdyVar.zze();
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (iZzd < iZze && !z) {
                    c = (char) zzdyVar.zzN()[iZzd];
                    if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                        break;
                    }
                    z = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c);
            iZzd++;
        }
        zzdyVar.zzM(iZzd - zzdyVar.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:105:0x0202  */
    /* JADX WARN: Code duplicated, block: B:107:0x020a  */
    /* JADX WARN: Code duplicated, block: B:108:0x020f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0217  */
    /* JADX WARN: Code duplicated, block: B:116:0x022a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0230  */
    /* JADX WARN: Code duplicated, block: B:120:0x0238  */
    /* JADX WARN: Code duplicated, block: B:122:0x0240  */
    /* JADX WARN: Code duplicated, block: B:123:0x0245  */
    /* JADX WARN: Code duplicated, block: B:125:0x024d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0252  */
    /* JADX WARN: Code duplicated, block: B:128:0x025a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0262  */
    /* JADX WARN: Code duplicated, block: B:131:0x0267  */
    /* JADX WARN: Code duplicated, block: B:133:0x026f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0277  */
    /* JADX WARN: Code duplicated, block: B:136:0x027c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0284  */
    /* JADX WARN: Code duplicated, block: B:140:0x0294  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:143:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:153:0x02da  */
    /* JADX WARN: Code duplicated, block: B:154:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x02eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:177:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0044  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01db  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e3  */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x0294, please report this as an issue */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        java.lang.String strTrim;
        java.lang.String string;
        java.util.regex.Matcher matcher;
        java.lang.String strGroup;
        int iHashCode;
        byte b;
        boolean z;
        int i = 0;
        this.zzd.setLength(0);
        int iZzd = zzdyVar.zzd();
        while (!android.text.TextUtils.isEmpty(zzdyVar.zzz(java.nio.charset.StandardCharsets.UTF_8))) {
        }
        this.zzc.zzJ(zzdyVar.zzN(), zzdyVar.zzd());
        this.zzc.zzL(iZzd);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zzc;
            java.lang.StringBuilder sb = this.zzd;
            zzc(zzdyVar2);
            if (zzdyVar2.zzb() >= 5 && "::cue".equals(zzdyVar2.zzB(5, java.nio.charset.StandardCharsets.UTF_8))) {
                int iZzd2 = zzdyVar2.zzd();
                java.lang.String strZza = zza(zzdyVar2, sb);
                if (strZza == null) {
                    strTrim = null;
                } else if ("{".equals(strZza)) {
                    zzdyVar2.zzL(iZzd2);
                    strTrim = "";
                } else {
                    if ("(".equals(strZza)) {
                        int iZzd3 = zzdyVar2.zzd();
                        int iZze = zzdyVar2.zze();
                        int i2 = i;
                        while (iZzd3 < iZze && i2 == 0) {
                            int i3 = iZzd3 + 1;
                            i2 = ((char) zzdyVar2.zzN()[iZzd3]) == ')' ? 1 : i;
                            iZzd3 = i3;
                        }
                        strTrim = zzdyVar2.zzB((iZzd3 - 1) - zzdyVar2.zzd(), java.nio.charset.StandardCharsets.UTF_8).trim();
                    } else {
                        strTrim = null;
                    }
                    if (!")".equals(zza(zzdyVar2, sb))) {
                        strTrim = null;
                    }
                }
            } else {
                strTrim = null;
            }
            if (strTrim == null || !"{".equals(zza(this.zzc, this.zzd))) {
                break;
            }
            com.google.android.gms.internal.ads.zzaln zzalnVar = new com.google.android.gms.internal.ads.zzaln();
            if (!"".equals(strTrim)) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != -1) {
                    java.util.regex.Matcher matcher2 = zza.matcher(strTrim.substring(iIndexOf));
                    if (matcher2.matches()) {
                        java.lang.String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        zzalnVar.zzv(strGroup2);
                    }
                    strTrim = strTrim.substring(i, iIndexOf);
                }
                int i4 = com.google.android.gms.internal.ads.zzei.zza;
                java.lang.String[] strArrSplit = strTrim.split("\\.", -1);
                java.lang.String str = strArrSplit[i];
                int iIndexOf2 = str.indexOf(35);
                if (iIndexOf2 != -1) {
                    zzalnVar.zzu(str.substring(i, iIndexOf2));
                    zzalnVar.zzt(str.substring(iIndexOf2 + 1));
                } else {
                    zzalnVar.zzu(str);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    zzalnVar.zzs((java.lang.String[]) java.util.Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            int i5 = i;
            java.lang.String strZza2 = null;
            while (i5 == 0) {
                com.google.android.gms.internal.ads.zzdy zzdyVar3 = this.zzc;
                java.lang.StringBuilder sb2 = this.zzd;
                int iZzd4 = zzdyVar3.zzd();
                strZza2 = zza(zzdyVar3, sb2);
                i5 = (strZza2 == null || "}".equals(strZza2)) ? 1 : i;
                if (i5 == 0) {
                    this.zzc.zzL(iZzd4);
                    com.google.android.gms.internal.ads.zzdy zzdyVar4 = this.zzc;
                    java.lang.StringBuilder sb3 = this.zzd;
                    zzc(zzdyVar4);
                    java.lang.String strZzd = zzd(zzdyVar4, sb3);
                    if (!"".equals(strZzd) && ":".equals(zza(zzdyVar4, sb3))) {
                        zzc(zzdyVar4);
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        int i6 = i;
                        while (true) {
                            if (i6 != 0) {
                                string = sb4.toString();
                                break;
                            }
                            int iZzd5 = zzdyVar4.zzd();
                            java.lang.String strZza3 = zza(zzdyVar4, sb3);
                            if (strZza3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strZza3) || ";".equals(strZza3)) {
                                zzdyVar4.zzL(iZzd5);
                                i6 = 1;
                            } else {
                                sb4.append(strZza3);
                            }
                        }
                        if (string != null && !"".equals(string)) {
                            int iZzd6 = zzdyVar4.zzd();
                            java.lang.String strZza4 = zza(zzdyVar4, sb3);
                            if (";".equals(strZza4)) {
                                if ("color".equals(strZzd)) {
                                    zzalnVar.zzk(com.google.android.gms.internal.ads.zzcz.zza(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzalnVar.zzh(com.google.android.gms.internal.ads.zzcz.zza(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzalnVar.zzp(1);
                                    } else if ("under".equals(string)) {
                                        zzalnVar.zzp(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if (androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL.equals(string)) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    zzalnVar.zzj(z);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if (androidx.media3.extractor.text.ttml.TtmlNode.UNDERLINE.equals(string)) {
                                        zzalnVar.zzq(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzalnVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if (androidx.media3.extractor.text.ttml.TtmlNode.BOLD.equals(string)) {
                                        zzalnVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if (androidx.media3.extractor.text.ttml.TtmlNode.ITALIC.equals(string)) {
                                        zzalnVar.zzo(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(com.google.android.gms.internal.ads.zzftt.zza(string));
                                    if (matcher.matches()) {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592) {
                                                    b = -1;
                                                } else {
                                                    b = 0;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b = 2;
                                        } else {
                                            b = -1;
                                        }
                                        if (b != 0) {
                                            zzalnVar.zzn(1);
                                        } else if (b != 1) {
                                            zzalnVar.zzn(2);
                                        } else {
                                            if (b == 2) {
                                                throw new java.lang.IllegalStateException();
                                            }
                                            zzalnVar.zzn(3);
                                        }
                                        java.lang.String strGroup3 = matcher.group(1);
                                        strGroup3.getClass();
                                        zzalnVar.zzm(java.lang.Float.parseFloat(strGroup3));
                                    } else {
                                        com.google.android.gms.internal.ads.zzdo.zzf("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    }
                                } else {
                                    continue;
                                }
                            } else if ("}".equals(strZza4)) {
                                zzdyVar4.zzL(iZzd6);
                                if ("color".equals(strZzd)) {
                                    zzalnVar.zzk(com.google.android.gms.internal.ads.zzcz.zza(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzalnVar.zzh(com.google.android.gms.internal.ads.zzcz.zza(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzalnVar.zzp(1);
                                    } else if ("under".equals(string)) {
                                        zzalnVar.zzp(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if (androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL.equals(string) || string.startsWith("digits")) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    zzalnVar.zzj(z);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if (androidx.media3.extractor.text.ttml.TtmlNode.UNDERLINE.equals(string)) {
                                        zzalnVar.zzq(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzalnVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if (androidx.media3.extractor.text.ttml.TtmlNode.BOLD.equals(string)) {
                                        zzalnVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if (androidx.media3.extractor.text.ttml.TtmlNode.ITALIC.equals(string)) {
                                        zzalnVar.zzo(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(com.google.android.gms.internal.ads.zzftt.zza(string));
                                    if (matcher.matches()) {
                                        com.google.android.gms.internal.ads.zzdo.zzf("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592 && strGroup.equals("px")) {
                                                    b = 0;
                                                } else {
                                                    b = -1;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b = 2;
                                        } else {
                                            b = -1;
                                        }
                                        if (b != 0) {
                                            zzalnVar.zzn(1);
                                        } else if (b != 1) {
                                            zzalnVar.zzn(2);
                                        } else {
                                            if (b == 2) {
                                                throw new java.lang.IllegalStateException();
                                            }
                                            zzalnVar.zzn(3);
                                        }
                                        java.lang.String strGroup4 = matcher.group(1);
                                        strGroup4.getClass();
                                        zzalnVar.zzm(java.lang.Float.parseFloat(strGroup4));
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i = 0;
            }
            if ("}".equals(strZza2)) {
                arrayList.add(zzalnVar);
            }
            i = 0;
        }
        return arrayList;
    }
}
