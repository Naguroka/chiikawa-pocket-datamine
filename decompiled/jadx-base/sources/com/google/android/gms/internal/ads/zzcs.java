package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcs {
    private static final java.lang.String zzc = java.lang.Integer.toString(0, 36);
    private static final java.lang.String zzd = java.lang.Integer.toString(1, 36);
    public final java.lang.String zza;
    public final int zzb;

    public zzcs(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final android.os.Bundle zza() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(zzc, this.zza);
        bundle.putInt(zzd, this.zzb);
        return bundle;
    }
}
