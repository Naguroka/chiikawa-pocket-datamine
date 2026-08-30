package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzakv implements com.google.android.gms.internal.ads.zzakf {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final com.google.android.gms.internal.ads.zzaku zzc;
    private final com.google.android.gms.internal.ads.zzdy zzd;
    private java.util.Map zze;
    private float zzf;
    private float zzg;

    public zzakv() {
        this(null);
    }

    private static float zzb(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zzc(long j, java.util.List list, java.util.List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((java.lang.Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((java.lang.Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, java.lang.Long.valueOf(j));
        list2.add(i, i == 0 ? new java.util.ArrayList() : new java.util.ArrayList((java.util.Collection) list2.get(i - 1)));
        return i;
    }

    private static long zzd(java.lang.String str) {
        java.util.regex.Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        java.lang.String strGroup = matcher.group(1);
        int i = com.google.android.gms.internal.ads.zzei.zza;
        long j = java.lang.Long.parseLong(strGroup) * 3600000000L;
        long j2 = java.lang.Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (java.lang.Long.parseLong(matcher.group(3)) * 1000000) + (java.lang.Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void zze(com.google.android.gms.internal.ads.zzdy zzdyVar, java.nio.charset.Charset charset) {
        while (true) {
            java.lang.String strZzz = zzdyVar.zzz(charset);
            if (strZzz == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strZzz)) {
                while (true) {
                    java.lang.String strZzz2 = zzdyVar.zzz(charset);
                    if (strZzz2 == null || (zzdyVar.zzb() != 0 && zzdyVar.zza(charset) == '[')) {
                        break;
                    }
                    java.lang.String[] strArrSplit = strZzz2.split(":");
                    if (strArrSplit.length == 2) {
                        byte b = 0;
                        java.lang.String strZza = com.google.android.gms.internal.ads.zzftt.zza(strArrSplit[0].trim());
                        switch (strZza.hashCode()) {
                            case 1879649548:
                                if (!strZza.equals("playresx")) {
                                    b = -1;
                                }
                                break;
                            case 1879649549:
                                if (!strZza.equals("playresy")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        if (b == 0) {
                            this.zzf = java.lang.Float.parseFloat(strArrSplit[1].trim());
                        } else if (b == 1) {
                            try {
                                this.zzg = java.lang.Float.parseFloat(strArrSplit[1].trim());
                            } catch (java.lang.NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strZzz)) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                com.google.android.gms.internal.ads.zzakw zzakwVarZza = null;
                while (true) {
                    java.lang.String strZzz3 = zzdyVar.zzz(charset);
                    if (strZzz3 != null && (zzdyVar.zzb() == 0 || zzdyVar.zza(charset) != '[')) {
                        if (strZzz3.startsWith("Format:")) {
                            zzakwVarZza = com.google.android.gms.internal.ads.zzakw.zza(strZzz3);
                        } else if (strZzz3.startsWith("Style:")) {
                            if (zzakwVarZza == null) {
                                com.google.android.gms.internal.ads.zzdo.zzf("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzz3));
                            } else {
                                com.google.android.gms.internal.ads.zzaky zzakyVarZzb = com.google.android.gms.internal.ads.zzaky.zzb(strZzz3, zzakwVarZza);
                                if (zzakyVarZzb != null) {
                                    linkedHashMap.put(zzakyVarZzb.zza, zzakyVarZzb);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strZzz)) {
                com.google.android.gms.internal.ads.zzdo.zze("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strZzz)) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:132:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x019c  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ac  */
    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzake zzakeVar, com.google.android.gms.internal.ads.zzdb zzdbVar) {
        int i3;
        com.google.android.gms.internal.ads.zzdy zzdyVar;
        int i4;
        android.text.Layout.Alignment alignment;
        int i5;
        int i6;
        int i7;
        java.lang.Integer num;
        int i8;
        com.google.android.gms.internal.ads.zzakv zzakvVar = this;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        zzakvVar.zzd.zzJ(bArr, i + i2);
        zzakvVar.zzd.zzL(i);
        java.nio.charset.Charset charsetZzC = zzakvVar.zzd.zzC();
        if (charsetZzC == null) {
            charsetZzC = java.nio.charset.StandardCharsets.UTF_8;
        }
        if (!zzakvVar.zzb) {
            zzakvVar.zze(zzakvVar.zzd, charsetZzC);
        }
        com.google.android.gms.internal.ads.zzdy zzdyVar2 = zzakvVar.zzd;
        com.google.android.gms.internal.ads.zzaku zzakuVarZza = zzakvVar.zzb ? zzakvVar.zzc : null;
        while (true) {
            java.lang.String strZzz = zzdyVar2.zzz(charsetZzC);
            if (strZzz == null) {
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    java.util.List list = (java.util.List) arrayList.get(i9);
                    if (!list.isEmpty()) {
                        if (i9 != arrayList.size() - 1) {
                            throw new java.lang.IllegalStateException();
                        }
                        zzdbVar.zza(new com.google.android.gms.internal.ads.zzajx(list, ((java.lang.Long) arrayList2.get(i9)).longValue(), ((java.lang.Long) arrayList2.get(i9 + 1)).longValue() - ((java.lang.Long) arrayList2.get(i9)).longValue()));
                        i3 = 1;
                    } else if (i9 != 0) {
                        i3 = 1;
                    } else {
                        i9 = 0;
                        if (i9 != arrayList.size() - 1) {
                            throw new java.lang.IllegalStateException();
                        }
                        zzdbVar.zza(new com.google.android.gms.internal.ads.zzajx(list, ((java.lang.Long) arrayList2.get(i9)).longValue(), ((java.lang.Long) arrayList2.get(i9 + 1)).longValue() - ((java.lang.Long) arrayList2.get(i9)).longValue()));
                        i3 = 1;
                    }
                    i9 += i3;
                }
                return;
            }
            if (strZzz.startsWith("Format:")) {
                zzakuVarZza = com.google.android.gms.internal.ads.zzaku.zza(strZzz);
            } else {
                if (strZzz.startsWith("Dialogue:")) {
                    if (zzakuVarZza == null) {
                        com.google.android.gms.internal.ads.zzdo.zzf("SsaParser", "Skipping dialogue line before complete format: ".concat(strZzz));
                    } else {
                        com.google.android.gms.internal.ads.zzcw.zzd(strZzz.startsWith("Dialogue:"));
                        java.lang.String[] strArrSplit = strZzz.substring(9).split(",", zzakuVarZza.zze);
                        if (strArrSplit.length != zzakuVarZza.zze) {
                            com.google.android.gms.internal.ads.zzdo.zzf("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strZzz));
                        } else {
                            long jZzd = zzd(strArrSplit[zzakuVarZza.zza]);
                            if (jZzd == androidx.media3.common.C.TIME_UNSET) {
                                com.google.android.gms.internal.ads.zzdo.zzf("SsaParser", "Skipping invalid timing: ".concat(strZzz));
                            } else {
                                long jZzd2 = zzd(strArrSplit[zzakuVarZza.zzb]);
                                if (jZzd2 == androidx.media3.common.C.TIME_UNSET) {
                                    com.google.android.gms.internal.ads.zzdo.zzf("SsaParser", "Skipping invalid timing: ".concat(strZzz));
                                } else {
                                    java.util.Map map = zzakvVar.zze;
                                    com.google.android.gms.internal.ads.zzaky zzakyVar = (map == null || (i8 = zzakuVarZza.zzc) == -1) ? null : (com.google.android.gms.internal.ads.zzaky) map.get(strArrSplit[i8].trim());
                                    java.lang.String str = strArrSplit[zzakuVarZza.zzd];
                                    com.google.android.gms.internal.ads.zzakx zzakxVarZza = com.google.android.gms.internal.ads.zzakx.zza(str);
                                    java.lang.String strReplace = com.google.android.gms.internal.ads.zzakx.zzb(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f = zzakvVar.zzf;
                                    float f2 = zzakvVar.zzg;
                                    android.text.SpannableString spannableString = new android.text.SpannableString(strReplace);
                                    com.google.android.gms.internal.ads.zzcm zzcmVar = new com.google.android.gms.internal.ads.zzcm();
                                    zzcmVar.zzl(spannableString);
                                    if (zzakyVar != null) {
                                        java.lang.Integer num2 = zzakyVar.zzc;
                                        zzdyVar = zzdyVar2;
                                        if (num2 != null) {
                                            spannableString.setSpan(new android.text.style.ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (zzakyVar.zzj == 3 && (num = zzakyVar.zzd) != null) {
                                            spannableString.setSpan(new android.text.style.BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f3 = zzakyVar.zze;
                                        if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                            zzcmVar.zzn(f3 / f2, 1);
                                        }
                                        if (!zzakyVar.zzf) {
                                            i6 = 33;
                                            i7 = 0;
                                            if (zzakyVar.zzg) {
                                                i4 = 2;
                                                spannableString.setSpan(new android.text.style.StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                            if (zzakyVar.zzh) {
                                                spannableString.setSpan(new android.text.style.UnderlineSpan(), i7, spannableString.length(), i6);
                                            }
                                            if (zzakyVar.zzi) {
                                                spannableString.setSpan(new android.text.style.StrikethroughSpan(), i7, spannableString.length(), i6);
                                            }
                                        } else if (zzakyVar.zzg) {
                                            i6 = 33;
                                            i7 = 0;
                                            spannableString.setSpan(new android.text.style.StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i6 = 33;
                                            i7 = 0;
                                            spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        i4 = 2;
                                        if (zzakyVar.zzh) {
                                            spannableString.setSpan(new android.text.style.UnderlineSpan(), i7, spannableString.length(), i6);
                                        }
                                        if (zzakyVar.zzi) {
                                            spannableString.setSpan(new android.text.style.StrikethroughSpan(), i7, spannableString.length(), i6);
                                        }
                                    } else {
                                        zzdyVar = zzdyVar2;
                                        zzakuVarZza = zzakuVarZza;
                                        jZzd2 = jZzd2;
                                        i4 = 2;
                                    }
                                    int i10 = zzakxVarZza.zza;
                                    if (i10 == -1) {
                                        i10 = zzakyVar != null ? zzakyVar.zzb : -1;
                                    }
                                    switch (i10) {
                                        case 0:
                                        default:
                                            com.google.android.gms.internal.ads.zzdo.zzf("SsaParser", "Unknown alignment: " + i10);
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = android.text.Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    zzcmVar.zzm(alignment);
                                    int i11 = Integer.MIN_VALUE;
                                    switch (i10) {
                                        case 0:
                                        default:
                                            com.google.android.gms.internal.ads.zzdo.zzf("SsaParser", "Unknown alignment: " + i10);
                                        case -1:
                                            i5 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i5 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i5 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i5 = i4;
                                            break;
                                    }
                                    zzcmVar.zzi(i5);
                                    switch (i10) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            com.google.android.gms.internal.ads.zzdo.zzf("SsaParser", "Unknown alignment: " + i10);
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i11 = i4;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i11 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i11 = 0;
                                            break;
                                    }
                                    zzcmVar.zzf(i11);
                                    android.graphics.PointF pointF = zzakxVarZza.zzb;
                                    if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                        zzcmVar.zzh(zzb(zzcmVar.zzb()));
                                        zzcmVar.zze(zzb(zzcmVar.zza()), 0);
                                    } else {
                                        zzcmVar.zzh(pointF.x / f);
                                        zzcmVar.zze(zzakxVarZza.zzb.y / f2, 0);
                                    }
                                    com.google.android.gms.internal.ads.zzco zzcoVarZzp = zzcmVar.zzp();
                                    int iZzc = zzc(jZzd2, arrayList2, arrayList);
                                    for (int iZzc2 = zzc(jZzd, arrayList2, arrayList); iZzc2 < iZzc; iZzc2++) {
                                        ((java.util.List) arrayList.get(iZzc2)).add(zzcoVarZzp);
                                    }
                                }
                            }
                        }
                    }
                    zzdyVar = zzdyVar2;
                    zzakuVarZza = zzakuVarZza;
                } else {
                    zzdyVar = zzdyVar2;
                    zzakuVarZza = zzakuVarZza;
                }
                zzakvVar = this;
                charsetZzC = charsetZzC;
                zzdyVar2 = zzdyVar;
                zzakuVarZza = zzakuVarZza;
            }
        }
    }

    public zzakv(java.util.List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new com.google.android.gms.internal.ads.zzdy();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        java.lang.String strZzB = com.google.android.gms.internal.ads.zzei.zzB((byte[]) list.get(0));
        com.google.android.gms.internal.ads.zzcw.zzd(strZzB.startsWith("Format:"));
        com.google.android.gms.internal.ads.zzaku zzakuVarZza = com.google.android.gms.internal.ads.zzaku.zza(strZzB);
        zzakuVarZza.getClass();
        this.zzc = zzakuVarZza;
        zze(new com.google.android.gms.internal.ads.zzdy((byte[]) list.get(1)), java.nio.charset.StandardCharsets.UTF_8);
    }
}
