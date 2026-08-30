package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcv {
    private static final java.lang.String zzb = java.lang.Integer.toString(0, 36);
    public final java.lang.String zza;

    public zzcv(java.lang.String str) {
        this.zza = str;
    }

    public final android.os.Bundle zza() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(zzb, this.zza);
        return bundle;
    }
}
