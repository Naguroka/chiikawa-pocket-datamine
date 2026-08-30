package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzh implements com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> {
    final /* synthetic */ com.google.android.gms.internal.location.zzi zza;

    zzh(com.google.android.gms.internal.location.zzi zziVar) {
        this.zza = zziVar;
    }

    public final com.google.android.gms.internal.location.zzam zza() throws android.os.DeadObjectException {
        return (com.google.android.gms.internal.location.zzam) this.zza.getService();
    }
}
