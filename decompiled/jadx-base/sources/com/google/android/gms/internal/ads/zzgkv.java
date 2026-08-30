package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgkv {
    final java.util.Map zza = new java.util.HashMap();
    final java.util.Map zzb = new java.util.HashMap();

    private zzgkv() {
    }

    public final com.google.android.gms.internal.ads.zzgkv zza(java.lang.Enum r2, java.lang.Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgkx zzb() {
        return new com.google.android.gms.internal.ads.zzgkx(java.util.Collections.unmodifiableMap(this.zza), java.util.Collections.unmodifiableMap(this.zzb), null);
    }

    /* synthetic */ zzgkv(com.google.android.gms.internal.ads.zzgkw zzgkwVar) {
    }
}
