package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzom extends com.google.android.gms.measurement.internal.zzaz {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzon zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzom(com.google.android.gms.measurement.internal.zzon zzonVar, com.google.android.gms.measurement.internal.zzjs zzjsVar) {
        super(zzjsVar);
        this.zza = zzonVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zzc() {
        com.google.android.gms.measurement.internal.zzon zzonVar = this.zza;
        com.google.android.gms.measurement.internal.zzop zzopVar = zzonVar.zzc;
        zzopVar.zzg();
        com.google.android.gms.measurement.internal.zzio zzioVar = zzopVar.zzu;
        zzonVar.zzd(false, false, zzioVar.zzaU().elapsedRealtime());
        zzopVar.zzu.zzd().zzf(zzioVar.zzaU().elapsedRealtime());
    }
}
