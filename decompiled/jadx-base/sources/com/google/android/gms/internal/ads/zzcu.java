package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcu {
    private static final java.lang.String zzd = java.lang.Integer.toString(0, 36);
    private static final java.lang.String zze = java.lang.Integer.toString(1, 36);
    private static final java.lang.String zzf = java.lang.Integer.toString(2, 36);
    public final int zza;
    public final int zzb;
    public final int zzc;

    public zzcu(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public final android.os.Bundle zza() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(zzd, this.zza);
        bundle.putInt(zze, this.zzb);
        bundle.putInt(zzf, this.zzc);
        return bundle;
    }
}
