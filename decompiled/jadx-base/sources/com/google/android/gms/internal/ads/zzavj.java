package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzavj extends com.google.android.gms.internal.ads.zzatq {
    public long zza;
    public long zzb;

    public zzavj() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    public zzavj(java.lang.String str) {
        this.zza = -1L;
        this.zzb = -1L;
        java.util.HashMap mapZza = zza(str);
        if (mapZza != null) {
            this.zza = ((java.lang.Long) mapZza.get(0)).longValue();
            this.zzb = ((java.lang.Long) mapZza.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    protected final java.util.HashMap zzb() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(0, java.lang.Long.valueOf(this.zza));
        map.put(1, java.lang.Long.valueOf(this.zzb));
        return map;
    }
}
