package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaa {
    private final java.lang.String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* synthetic */ zzaa(java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, com.google.android.gms.common.zzr zzrVar, com.google.android.gms.common.zzz zzzVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z4;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    final com.google.android.gms.common.zzs zza(android.content.Context context) {
        return new com.google.android.gms.common.zzs(this.zza, this.zzb, false, com.google.android.gms.dynamic.ObjectWrapper.wrap(context), false, true, null);
    }

    final boolean zzb() {
        return this.zzc;
    }
}
