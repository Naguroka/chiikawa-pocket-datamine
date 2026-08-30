package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfjx {
    private final java.lang.Object zza;
    private final long zzb;
    private final com.google.android.gms.common.util.Clock zzc;
    private final long zzd = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzA)).longValue() * 1000;

    public zzfjx(java.lang.Object obj, com.google.android.gms.common.util.Clock clock) {
        this.zza = obj;
        this.zzc = clock;
        this.zzb = clock.currentTimeMillis();
    }

    public final long zza() {
        return (this.zzd + java.lang.Math.min(java.lang.Math.max(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzv)).longValue(), -900000L), 10000L)) - (this.zzc.currentTimeMillis() - this.zzb);
    }

    public final java.lang.Object zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzc.currentTimeMillis() >= this.zzb + this.zzd;
    }
}
