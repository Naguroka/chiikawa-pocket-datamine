package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbh {
    private final java.lang.String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    /* synthetic */ zzbh(com.google.android.gms.ads.internal.util.zzbf zzbfVar, com.google.android.gms.ads.internal.util.zzbg zzbgVar) {
        int size = zzbfVar.zzb.size();
        this.zza = (java.lang.String[]) zzbfVar.zza.toArray(new java.lang.String[size]);
        this.zzb = zzc(zzbfVar.zzb);
        this.zzc = zzc(zzbfVar.zzc);
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(java.util.List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((java.lang.Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public final java.util.List zza() {
        com.google.android.gms.ads.internal.util.zzbh zzbhVar = this;
        java.util.ArrayList arrayList = new java.util.ArrayList(zzbhVar.zza.length);
        int i = 0;
        while (true) {
            java.lang.String[] strArr = zzbhVar.zza;
            if (i >= strArr.length) {
                return arrayList;
            }
            java.lang.String str = strArr[i];
            double[] dArr = zzbhVar.zzc;
            double[] dArr2 = zzbhVar.zzb;
            int[] iArr = zzbhVar.zzd;
            double d = dArr[i];
            double d2 = dArr2[i];
            int i2 = iArr[i];
            arrayList.add(new com.google.android.gms.ads.internal.util.zzbe(str, d, d2, ((double) i2) / ((double) zzbhVar.zze), i2));
            i++;
            zzbhVar = this;
        }
    }

    public final void zzb(double d) {
        this.zze++;
        int i = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i >= dArr.length) {
                return;
            }
            double d2 = dArr[i];
            if (d2 <= d && d < this.zzb[i]) {
                int[] iArr = this.zzd;
                iArr[i] = iArr[i] + 1;
            }
            if (d < d2) {
                return;
            } else {
                i++;
            }
        }
    }
}
