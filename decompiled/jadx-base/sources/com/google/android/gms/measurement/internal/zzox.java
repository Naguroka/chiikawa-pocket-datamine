package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzox extends com.google.android.gms.measurement.internal.zzaz {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzoy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzox(com.google.android.gms.measurement.internal.zzoy zzoyVar, com.google.android.gms.measurement.internal.zzjs zzjsVar) {
        super(zzjsVar);
        this.zza = zzoyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zzc() {
        com.google.android.gms.measurement.internal.zzoy zzoyVar = this.zza;
        zzoyVar.zza();
        zzoyVar.zzu.zzaW().zzj().zza("Starting upload from DelayedRunnable");
        zzoyVar.zzg.zzat();
    }
}
