package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzba zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzlq(com.google.android.gms.measurement.internal.zzlw zzlwVar, com.google.android.gms.measurement.internal.zzba zzbaVar) {
        this.zza = zzbaVar;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zzb;
        com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVar.zzu;
        com.google.android.gms.measurement.internal.zzht zzhtVarZzm = zzioVar.zzm();
        com.google.android.gms.measurement.internal.zzio zzioVar2 = zzhtVarZzm.zzu;
        zzhtVarZzm.zzg();
        com.google.android.gms.measurement.internal.zzba zzbaVarZzf = zzhtVarZzm.zzf();
        com.google.android.gms.measurement.internal.zzba zzbaVar = this.zza;
        if (!com.google.android.gms.measurement.internal.zzjx.zzs(zzbaVar.zza(), zzbaVarZzf.zza())) {
            zzioVar.zzaW().zzi().zzb("Lower precedence consent source ignored, proposed source", java.lang.Integer.valueOf(zzbaVar.zza()));
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = zzhtVarZzm.zzb().edit();
        editorEdit.putString("dma_consent_settings", zzbaVar.zzj());
        editorEdit.apply();
        zzioVar.zzaW().zzj().zzb("Setting DMA consent(FE)", zzbaVar);
        com.google.android.gms.measurement.internal.zzio zzioVar3 = zzlwVar.zzu;
        if (zzioVar3.zzu().zzac()) {
            zzioVar3.zzu().zzU();
        } else {
            zzioVar3.zzu().zzR(false);
        }
    }
}
