package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzw extends android.content.BroadcastReceiver {
    private final com.google.android.gms.measurement.internal.zzio zza;

    public zzw(com.google.android.gms.measurement.internal.zzio zzioVar) {
        this.zza = zzioVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        byte b;
        if (intent == null) {
            this.zza.zzaW().zzk().zza("App receiver called with null intent");
            return;
        }
        java.lang.String action = intent.getAction();
        if (action == null) {
            this.zza.zzaW().zzk().zza("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            final com.google.android.gms.measurement.internal.zzio zzioVar = this.zza;
            com.google.android.gms.internal.measurement.zzqr.zzb();
            if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaW)) {
                zzioVar.zzaW().zzj().zza("App receiver notified triggers are available");
                zzioVar.zzaX().zzq(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzu
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.measurement.internal.zzio zzioVar2 = zzioVar;
                        if (!zzioVar2.zzw().zzan()) {
                            zzioVar2.zzaW().zzk().zza("registerTrigger called but app not eligible");
                            return;
                        }
                        zzioVar2.zzq().zzI();
                        final com.google.android.gms.measurement.internal.zzlw zzlwVarZzq = zzioVar2.zzq();
                        java.util.Objects.requireNonNull(zzlwVarZzq);
                        new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzt
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzlwVarZzq.zzL();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        if (b != 1) {
            this.zza.zzaW().zzk().zza("App receiver called with unknown action");
            return;
        }
        com.google.android.gms.measurement.internal.zzio zzioVar2 = this.zza;
        if (zzioVar2.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaR)) {
            zzioVar2.zzaW().zzj().zza("[sgtm] App Receiver notified batches are available");
            zzioVar2.zzaX().zzq(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzv
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza.zzs().zzj(((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzC.zza(null)).longValue());
                }
            });
        }
    }
}
