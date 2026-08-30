package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbf {
    private final java.util.List zza = new java.util.ArrayList();
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.List zzc = new java.util.ArrayList();

    public final com.google.android.gms.ads.internal.util.zzbf zza(java.lang.String str, double d, double d2) {
        int i = 0;
        while (i < this.zza.size()) {
            double dDoubleValue = ((java.lang.Double) this.zzc.get(i)).doubleValue();
            double dDoubleValue2 = ((java.lang.Double) this.zzb.get(i)).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            }
            i++;
        }
        this.zza.add(i, str);
        this.zzc.add(i, java.lang.Double.valueOf(d));
        this.zzb.add(i, java.lang.Double.valueOf(d2));
        return this;
    }

    public final com.google.android.gms.ads.internal.util.zzbh zzb() {
        return new com.google.android.gms.ads.internal.util.zzbh(this, null);
    }
}
