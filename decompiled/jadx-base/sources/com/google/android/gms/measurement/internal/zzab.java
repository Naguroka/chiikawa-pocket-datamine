package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzab {
    final java.lang.String zzb;
    final int zzc;
    java.lang.Boolean zzd;
    java.lang.Boolean zze;
    java.lang.Long zzf;
    java.lang.Long zzg;

    zzab(java.lang.String str, int i) {
        this.zzb = str;
        this.zzc = i;
    }

    private static java.lang.Boolean zzd(java.lang.String str, int i, boolean z, java.lang.String str2, java.util.List list, java.lang.String str3, com.google.android.gms.measurement.internal.zzhe zzheVar) {
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(java.util.Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return java.lang.Boolean.valueOf(java.util.regex.Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (java.util.regex.PatternSyntaxException unused) {
                    if (zzheVar != null) {
                        zzheVar.zzk().zzb("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return java.lang.Boolean.valueOf(str.startsWith(str2));
            case 3:
                return java.lang.Boolean.valueOf(str.endsWith(str2));
            case 4:
                return java.lang.Boolean.valueOf(str.contains(str2));
            case 5:
                return java.lang.Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return java.lang.Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    static java.lang.Boolean zze(java.math.BigDecimal bigDecimal, com.google.android.gms.internal.measurement.zzfp zzfpVar, double d) {
        java.math.BigDecimal bigDecimal2;
        java.math.BigDecimal bigDecimal3;
        java.math.BigDecimal bigDecimal4;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfpVar);
        if (zzfpVar.zzg()) {
            if (zzfpVar.zzm() != 1) {
                if (zzfpVar.zzm() == 5) {
                    if (!zzfpVar.zzk() || !zzfpVar.zzj()) {
                        return null;
                    }
                } else if (!zzfpVar.zzh()) {
                    return null;
                }
                int iZzm = zzfpVar.zzm();
                if (zzfpVar.zzm() == 5) {
                    if (com.google.android.gms.measurement.internal.zzqa.zzA(zzfpVar.zze()) && com.google.android.gms.measurement.internal.zzqa.zzA(zzfpVar.zzd())) {
                        try {
                            java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal(zzfpVar.zze());
                            bigDecimal4 = new java.math.BigDecimal(zzfpVar.zzd());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (java.lang.NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!com.google.android.gms.measurement.internal.zzqa.zzA(zzfpVar.zzc())) {
                    return null;
                }
                try {
                    bigDecimal2 = new java.math.BigDecimal(zzfpVar.zzc());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (java.lang.NumberFormatException unused2) {
                }
                if (iZzm == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i = iZzm - 1;
                if (i == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i != 3) {
                    if (i == 4 && bigDecimal3 != null) {
                        return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d != 0.0d) {
                    return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new java.math.BigDecimal(d).multiply(new java.math.BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new java.math.BigDecimal(d).multiply(new java.math.BigDecimal(2)))) < 0);
                }
                return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    static java.lang.Boolean zzf(java.lang.String str, com.google.android.gms.internal.measurement.zzfv zzfvVar, com.google.android.gms.measurement.internal.zzhe zzheVar) {
        java.util.List list;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfvVar);
        if (str == null || !zzfvVar.zzi() || zzfvVar.zzj() == 1 || (zzfvVar.zzj() != 7 ? !zzfvVar.zzh() : zzfvVar.zza() == 0)) {
            return null;
        }
        int iZzj = zzfvVar.zzj();
        boolean zZzf = zzfvVar.zzf();
        java.lang.String strZzd = (zZzf || iZzj == 2 || iZzj == 7) ? zzfvVar.zzd() : zzfvVar.zzd().toUpperCase(java.util.Locale.ENGLISH);
        if (zzfvVar.zza() == 0) {
            list = null;
        } else {
            java.util.List listZze = zzfvVar.zze();
            if (!zZzf) {
                java.util.ArrayList arrayList = new java.util.ArrayList(listZze.size());
                java.util.Iterator it = listZze.iterator();
                while (it.hasNext()) {
                    arrayList.add(((java.lang.String) it.next()).toUpperCase(java.util.Locale.ENGLISH));
                }
                listZze = java.util.Collections.unmodifiableList(arrayList);
            }
            list = listZze;
        }
        return zzd(str, iZzj, zZzf, strZzd, list, iZzj == 2 ? strZzd : null, zzheVar);
    }

    static java.lang.Boolean zzg(double d, com.google.android.gms.internal.measurement.zzfp zzfpVar) {
        try {
            return zze(new java.math.BigDecimal(d), zzfpVar, java.lang.Math.ulp(d));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    static java.lang.Boolean zzh(long j, com.google.android.gms.internal.measurement.zzfp zzfpVar) {
        try {
            return zze(new java.math.BigDecimal(j), zzfpVar, 0.0d);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    static java.lang.Boolean zzi(java.lang.String str, com.google.android.gms.internal.measurement.zzfp zzfpVar) {
        if (!com.google.android.gms.measurement.internal.zzqa.zzA(str)) {
            return null;
        }
        try {
            return zze(new java.math.BigDecimal(str), zzfpVar, 0.0d);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    static java.lang.Boolean zzj(java.lang.Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(bool.booleanValue() != z);
    }

    abstract int zza();

    abstract boolean zzb();

    abstract boolean zzc();
}
