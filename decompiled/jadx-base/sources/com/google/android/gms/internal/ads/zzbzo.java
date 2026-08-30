package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbzo {
    private java.math.BigInteger zza = java.math.BigInteger.ONE;
    private java.lang.String zzb = "0";

    public final synchronized java.lang.String zza() {
        java.lang.String string;
        string = this.zza.toString();
        this.zza = this.zza.add(java.math.BigInteger.ONE);
        this.zzb = string;
        return string;
    }

    public final synchronized java.lang.String zzb() {
        return this.zzb;
    }
}
