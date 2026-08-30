package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzacj {
    public final java.lang.String zza;

    private zzacj(int i, int i2, java.lang.String str) {
        this.zza = str;
    }

    public static com.google.android.gms.internal.ads.zzacj zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        java.lang.String str;
        zzdyVar.zzM(2);
        int iZzm = zzdyVar.zzm();
        int i = iZzm >> 1;
        int i2 = iZzm & 1;
        int iZzm2 = zzdyVar.zzm() >> 3;
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        int i3 = iZzm2 | (i2 << 5);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new com.google.android.gms.internal.ads.zzacj(i, i3, sb.toString());
    }
}
