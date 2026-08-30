package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfxo {
    private final java.lang.Object zza;
    private final java.lang.Object zzb;
    private final java.lang.Object zzc;

    zzfxo(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    final java.lang.IllegalArgumentException zza() {
        java.lang.Object obj = this.zzc;
        java.lang.Object obj2 = this.zzb;
        java.lang.Object obj3 = this.zza;
        return new java.lang.IllegalArgumentException("Multiple entries with same key: " + java.lang.String.valueOf(obj3) + com.ironsource.y8.i.b + java.lang.String.valueOf(obj2) + " and " + java.lang.String.valueOf(obj3) + com.ironsource.y8.i.b + java.lang.String.valueOf(obj));
    }
}
