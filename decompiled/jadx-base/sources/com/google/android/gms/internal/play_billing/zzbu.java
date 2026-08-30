package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbu {
    private final java.lang.Object zza;
    private final java.lang.Object zzb;
    private final java.lang.Object zzc;

    zzbu(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
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
