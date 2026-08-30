package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzakw {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzakw(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = i7;
        this.zzh = i8;
        this.zzi = i9;
        this.zzj = i10;
        this.zzk = i11;
    }

    public static com.google.android.gms.internal.ads.zzakw zza(java.lang.String str) {
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i2 != -1) {
                    return new com.google.android.gms.internal.ads.zzakw(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, length);
                }
                return null;
            }
            switch (com.google.android.gms.internal.ads.zzftt.zza(strArrSplit[i].trim())) {
                case "name":
                    i2 = i;
                    break;
                case "alignment":
                    i3 = i;
                    break;
                case "primarycolour":
                    i4 = i;
                    break;
                case "outlinecolour":
                    i5 = i;
                    break;
                case "fontsize":
                    i6 = i;
                    break;
                case "bold":
                    i7 = i;
                    break;
                case "italic":
                    i8 = i;
                    break;
                case "underline":
                    i9 = i;
                    break;
                case "strikeout":
                    i10 = i;
                    break;
                case "borderstyle":
                    i11 = i;
                    break;
            }
            i++;
        }
    }
}
