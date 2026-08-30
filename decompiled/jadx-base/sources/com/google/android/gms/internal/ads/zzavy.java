package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzavy extends com.google.android.gms.internal.ads.zzatq {
    public java.lang.Long zza;
    public java.lang.Long zzb;

    public zzavy() {
    }

    public zzavy(java.lang.String str) {
        java.util.HashMap mapZza = zza(str);
        if (mapZza != null) {
            this.zza = (java.lang.Long) mapZza.get(0);
            this.zzb = (java.lang.Long) mapZza.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    protected final java.util.HashMap zzb() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        return map;
    }
}
