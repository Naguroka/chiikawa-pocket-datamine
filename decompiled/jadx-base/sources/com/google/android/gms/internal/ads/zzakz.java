package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzakz implements com.google.android.gms.internal.ads.zzakf {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("\\{\\\\.*?\\}");
    private final java.lang.StringBuilder zzc = new java.lang.StringBuilder();
    private final java.util.ArrayList zzd = new java.util.ArrayList();
    private final com.google.android.gms.internal.ads.zzdy zze = new com.google.android.gms.internal.ads.zzdy();

    public static float zzb(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private static long zzc(java.util.regex.Matcher matcher, int i) {
        java.lang.String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? java.lang.Long.parseLong(strGroup) * 3600000 : 0L;
        java.lang.String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = j + (java.lang.Long.parseLong(strGroup2) * 60000);
        java.lang.String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = j2 + (java.lang.Long.parseLong(strGroup3) * 1000);
        java.lang.String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += java.lang.Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0197  */
    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzake zzakeVar, com.google.android.gms.internal.ads.zzdb zzdbVar) {
        java.lang.String str;
        byte b;
        byte b2;
        int i3;
        com.google.android.gms.internal.ads.zzco zzcoVarZzp;
        com.google.android.gms.internal.ads.zzakz zzakzVar = this;
        zzakzVar.zze.zzJ(bArr, i + i2);
        zzakzVar.zze.zzL(i);
        java.nio.charset.Charset charsetZzC = zzakzVar.zze.zzC();
        if (charsetZzC == null) {
            charsetZzC = java.nio.charset.StandardCharsets.UTF_8;
        }
        while (true) {
            java.lang.String strZzz = zzakzVar.zze.zzz(charsetZzC);
            if (strZzz == null) {
                return;
            }
            if (strZzz.length() != 0) {
                try {
                    java.lang.Integer.parseInt(strZzz);
                    java.lang.String strZzz2 = zzakzVar.zze.zzz(charsetZzC);
                    if (strZzz2 == null) {
                        com.google.android.gms.internal.ads.zzdo.zzf("SubripParser", "Unexpected end");
                        return;
                    }
                    java.util.regex.Matcher matcher = zza.matcher(strZzz2);
                    if (matcher.matches()) {
                        long jZzc = zzc(matcher, 1);
                        long jZzc2 = zzc(matcher, 6);
                        int i4 = 0;
                        zzakzVar.zzc.setLength(0);
                        zzakzVar.zzd.clear();
                        java.lang.String strZzz3 = zzakzVar.zze.zzz(charsetZzC);
                        while (!android.text.TextUtils.isEmpty(strZzz3)) {
                            if (zzakzVar.zzc.length() > 0) {
                                zzakzVar.zzc.append("<br>");
                            }
                            java.lang.StringBuilder sb = zzakzVar.zzc;
                            java.util.ArrayList arrayList = zzakzVar.zzd;
                            java.lang.String strTrim = strZzz3.trim();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(strTrim);
                            java.util.regex.Matcher matcher2 = zzb.matcher(strTrim);
                            int i5 = i4;
                            while (matcher2.find()) {
                                java.lang.String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i5;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i5 += length;
                            }
                            sb.append(sb2.toString());
                            strZzz3 = zzakzVar.zze.zzz(charsetZzC);
                            i4 = 0;
                        }
                        android.text.Spanned spannedFromHtml = android.text.Html.fromHtml(zzakzVar.zzc.toString());
                        int i6 = 0;
                        while (true) {
                            if (i6 < zzakzVar.zzd.size()) {
                                str = (java.lang.String) zzakzVar.zzd.get(i6);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i6++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        com.google.android.gms.internal.ads.zzcm zzcmVar = new com.google.android.gms.internal.ads.zzcm();
                        zzcmVar.zzl(spannedFromHtml);
                        if (str == null) {
                            zzcoVarZzp = zzcmVar.zzp();
                        } else {
                            switch (str) {
                                case "{\an1}":
                                    b = 0;
                                    break;
                                case "{\an3}":
                                    b = 3;
                                    break;
                                case "{\an4}":
                                    b = 1;
                                    break;
                                case "{\an6}":
                                    b = 4;
                                    break;
                                case "{\an7}":
                                    b = 2;
                                    break;
                                case "{\an9}":
                                    b = 5;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            if (b == 0 || b == 1 || b == 2) {
                                zzcmVar.zzi(0);
                            } else if (b == 3 || b == 4 || b == 5) {
                                zzcmVar.zzi(2);
                            } else {
                                zzcmVar.zzi(1);
                            }
                            switch (str) {
                                case "{\an1}":
                                    b2 = 0;
                                    break;
                                case "{\an2}":
                                    b2 = 1;
                                    break;
                                case "{\an3}":
                                    b2 = 2;
                                    break;
                                case "{\an7}":
                                    b2 = 3;
                                    break;
                                case "{\an8}":
                                    b2 = 4;
                                    break;
                                case "{\an9}":
                                    b2 = 5;
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            if (b2 == 0 || b2 == 1) {
                                i3 = 2;
                            } else {
                                if (b2 == 2) {
                                    i3 = 2;
                                } else if (b2 == 3 || b2 == 4 || b2 == 5) {
                                    zzcmVar.zzf(0);
                                } else {
                                    zzcmVar.zzf(1);
                                }
                                zzcmVar.zzh(zzb(zzcmVar.zzb()));
                                zzcmVar.zze(zzb(zzcmVar.zza()), 0);
                                zzcoVarZzp = zzcmVar.zzp();
                            }
                            zzcmVar.zzf(i3);
                            zzcmVar.zzh(zzb(zzcmVar.zzb()));
                            zzcmVar.zze(zzb(zzcmVar.zza()), 0);
                            zzcoVarZzp = zzcmVar.zzp();
                        }
                        zzdbVar.zza(new com.google.android.gms.internal.ads.zzajx(com.google.android.gms.internal.ads.zzfxn.zzo(zzcoVarZzp), jZzc, jZzc2 - jZzc));
                    } else {
                        com.google.android.gms.internal.ads.zzdo.zzf("SubripParser", "Skipping invalid timing: ".concat(strZzz2));
                    }
                } catch (java.lang.NumberFormatException unused) {
                    com.google.android.gms.internal.ads.zzdo.zzf("SubripParser", "Skipping invalid index: ".concat(strZzz));
                }
            }
            zzakzVar = this;
        }
    }
}
