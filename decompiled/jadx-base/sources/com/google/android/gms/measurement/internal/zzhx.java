package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhx {
    private final com.google.android.gms.measurement.internal.zzhx.zza zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
    public interface zza {
        void doStartService(android.content.Context context, android.content.Intent intent);
    }

    public zzhx(com.google.android.gms.measurement.internal.zzhx.zza zzaVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaVar);
        this.zza = zzaVar;
    }

    public final void zza(android.content.Context context, android.content.Intent intent) {
        com.google.android.gms.measurement.internal.zzio zzioVarZzp = com.google.android.gms.measurement.internal.zzio.zzp(context, null, null);
        com.google.android.gms.measurement.internal.zzhe zzheVarZzaW = zzioVarZzp.zzaW();
        if (intent == null) {
            zzheVarZzaW.zzk().zza("Receiver called with null intent");
            return;
        }
        zzioVarZzp.zzaV();
        java.lang.String action = intent.getAction();
        zzheVarZzaW.zzj().zzb("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzheVarZzaW.zzk().zza("Install Referrer Broadcasts are deprecated");
            }
        } else {
            android.content.Intent className = new android.content.Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzheVarZzaW.zzj().zza("Starting wakeful intent.");
            this.zza.doStartService(context, className);
        }
    }
}
