package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzpn extends com.google.android.gms.measurement.internal.zzaz {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzpn(com.google.android.gms.measurement.internal.zzpv zzpvVar, com.google.android.gms.measurement.internal.zzjs zzjsVar) {
        super(zzjsVar);
        this.zza = zzpvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zzc() {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
        zzpvVar.zzaX().zzg();
        java.lang.String str = (java.lang.String) zzpvVar.zzr.pollFirst();
        if (str != null) {
            zzpvVar.zzJ = zzpvVar.zzaU().elapsedRealtime();
            zzpvVar.zzaW().zzj().zzb("Sending trigger URI notification to app", str);
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            com.google.android.gms.measurement.internal.zzpv.zzaK(zzpvVar.zzaT(), intent);
        }
        zzpvVar.zzaJ();
    }
}
