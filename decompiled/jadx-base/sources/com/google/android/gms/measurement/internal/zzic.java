package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzic extends androidx.collection.LruCache {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzif zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzic(com.google.android.gms.measurement.internal.zzif zzifVar, int i) {
        super(20);
        this.zza = zzifVar;
    }

    @Override // androidx.collection.LruCache
    protected final /* bridge */ /* synthetic */ java.lang.Object create(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.measurement.internal.zzif zzifVar = this.zza;
        return zzifVar.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbn) ? com.google.android.gms.measurement.internal.zzif.zze(zzifVar, str) : com.google.android.gms.measurement.internal.zzif.zzd(zzifVar, str);
    }
}
