package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdy extends com.google.android.gms.internal.measurement.zzda {
    final /* synthetic */ java.lang.Runnable zza;

    zzdy(com.google.android.gms.internal.measurement.zzdz zzdzVar, java.lang.Runnable runnable) {
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void zze() {
        this.zza.run();
    }
}
