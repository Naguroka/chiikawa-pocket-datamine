package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaky {
    public final java.lang.String zza;
    public final int zzb;
    public final java.lang.Integer zzc;
    public final java.lang.Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzaky(java.lang.String str, int i, java.lang.Integer num, java.lang.Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = i2;
    }

    public static com.google.android.gms.internal.ads.zzaky zzb(java.lang.String str, com.google.android.gms.internal.ads.zzakw zzakwVar) {
        int i;
        com.google.android.gms.internal.ads.zzcw.zzd(str.startsWith("Style:"));
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = zzakwVar.zzk;
        if (length != i2) {
            com.google.android.gms.internal.ads.zzdo.zzf("SsaStyle", java.lang.String.format(java.util.Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(length), str));
            return null;
        }
        try {
            java.lang.String strTrim = strArrSplit[zzakwVar.zza].trim();
            int i3 = zzakwVar.zzb;
            int iZzd = i3 != -1 ? zzd(strArrSplit[i3].trim()) : -1;
            int i4 = zzakwVar.zzc;
            java.lang.Integer numZzc = i4 != -1 ? zzc(strArrSplit[i4].trim()) : null;
            int i5 = zzakwVar.zzd;
            java.lang.Integer numZzc2 = i5 != -1 ? zzc(strArrSplit[i5].trim()) : null;
            int i6 = zzakwVar.zze;
            float f = -3.4028235E38f;
            if (i6 != -1) {
                java.lang.String strTrim2 = strArrSplit[i6].trim();
                try {
                    f = java.lang.Float.parseFloat(strTrim2);
                } catch (java.lang.NumberFormatException e) {
                    com.google.android.gms.internal.ads.zzdo.zzg("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e);
                }
            }
            int i7 = zzakwVar.zzf;
            boolean z = i7 != -1 && zze(strArrSplit[i7].trim());
            int i8 = zzakwVar.zzg;
            boolean z2 = i8 != -1 && zze(strArrSplit[i8].trim());
            int i9 = zzakwVar.zzh;
            boolean z3 = i9 != -1 && zze(strArrSplit[i9].trim());
            int i10 = zzakwVar.zzi;
            boolean z4 = i10 != -1 && zze(strArrSplit[i10].trim());
            int i11 = zzakwVar.zzj;
            if (i11 != -1) {
                java.lang.String strTrim3 = strArrSplit[i11].trim();
                try {
                    int i12 = java.lang.Integer.parseInt(strTrim3.trim());
                    if (i12 == 1 || i12 == 3) {
                        i = i12;
                    } else {
                        com.google.android.gms.internal.ads.zzdo.zzf("SsaStyle", "Ignoring unknown BorderStyle: ".concat(java.lang.String.valueOf(strTrim3)));
                        i = -1;
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
            } else {
                i = -1;
            }
            return new com.google.android.gms.internal.ads.zzaky(strTrim, iZzd, numZzc, numZzc2, f, z, z2, z3, z4, i);
        } catch (java.lang.RuntimeException e2) {
            com.google.android.gms.internal.ads.zzdo.zzg("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e2);
            return null;
        }
    }

    public static java.lang.Integer zzc(java.lang.String str) {
        try {
            long j = str.startsWith("&H") ? java.lang.Long.parseLong(str.substring(2), 16) : java.lang.Long.parseLong(str);
            com.google.android.gms.internal.ads.zzcw.zzd(j <= androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE);
            return java.lang.Integer.valueOf(android.graphics.Color.argb(com.google.android.gms.internal.ads.zzgaq.zzb(((j >> 24) & 255) ^ 255), com.google.android.gms.internal.ads.zzgaq.zzb(j & 255), com.google.android.gms.internal.ads.zzgaq.zzb((j >> 8) & 255), com.google.android.gms.internal.ads.zzgaq.zzb((j >> 16) & 255)));
        } catch (java.lang.IllegalArgumentException e) {
            com.google.android.gms.internal.ads.zzdo.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(java.lang.String str) {
        try {
            int i = java.lang.Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i;
                default:
                    com.google.android.gms.internal.ads.zzdo.zzf("SsaStyle", "Ignoring unknown alignment: ".concat(java.lang.String.valueOf(str)));
                    return -1;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
    }

    private static boolean zze(java.lang.String str) {
        try {
            int i = java.lang.Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (java.lang.NumberFormatException e) {
            com.google.android.gms.internal.ads.zzdo.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
