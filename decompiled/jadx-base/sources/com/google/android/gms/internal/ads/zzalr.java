package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzalr {
    public final java.lang.String zza;
    public final int zzb;
    public final java.lang.String zzc;
    public final java.util.Set zzd;

    private zzalr(java.lang.String str, int i, java.lang.String str2, java.util.Set set) {
        this.zzb = i;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static com.google.android.gms.internal.ads.zzalr zza(java.lang.String str, int i) {
        java.lang.String str2;
        java.lang.String strTrim = str.trim();
        com.google.android.gms.internal.ads.zzcw.zzd(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            java.lang.String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        int i2 = com.google.android.gms.internal.ads.zzei.zza;
        java.lang.String[] strArrSplit = strTrim.split("\\.", -1);
        java.lang.String str3 = strArrSplit[0];
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i3 = 1; i3 < strArrSplit.length; i3++) {
            hashSet.add(strArrSplit[i3]);
        }
        return new com.google.android.gms.internal.ads.zzalr(str3, i, str2, hashSet);
    }

    public static com.google.android.gms.internal.ads.zzalr zzb() {
        return new com.google.android.gms.internal.ads.zzalr("", 0, "", java.util.Collections.emptySet());
    }
}
