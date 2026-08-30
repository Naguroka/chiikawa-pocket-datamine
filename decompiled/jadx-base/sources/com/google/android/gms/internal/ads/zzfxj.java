package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfxj extends com.google.android.gms.internal.ads.zzfwh implements java.io.Serializable {
    final java.lang.Object zza;
    final java.lang.Object zzb;

    zzfxj(java.lang.Object obj, java.lang.Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzfwh, java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfwh, java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwh, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
