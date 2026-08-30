package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzew extends com.google.android.gms.internal.measurement.zzdd {
    private final com.google.android.gms.measurement.internal.zzkc zza;

    zzew(com.google.android.gms.measurement.internal.zzkc zzkcVar) {
        this.zza = zzkcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final int zze() {
        return java.lang.System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final void zzf(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        this.zza.onEvent(str, str2, bundle, j);
    }
}
