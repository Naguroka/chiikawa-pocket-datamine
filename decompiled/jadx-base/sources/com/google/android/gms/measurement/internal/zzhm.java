package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhm extends android.content.BroadcastReceiver {
    private final com.google.android.gms.measurement.internal.zzpv zza;
    private boolean zzb;
    private boolean zzc;

    zzhm(com.google.android.gms.measurement.internal.zzpv zzpvVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzpvVar);
        this.zza = zzpvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
        zzpvVar.zzM();
        java.lang.String action = intent.getAction();
        zzpvVar.zzaW().zzj().zzb("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            zzpvVar.zzaW().zzk().zzb("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zZzd = zzpvVar.zzp().zzd();
        if (this.zzc != zZzd) {
            this.zzc = zZzd;
            zzpvVar.zzaX().zzq(new com.google.android.gms.measurement.internal.zzhl(this, zZzd));
        }
    }

    public final void zzb() {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
        zzpvVar.zzM();
        zzpvVar.zzaX().zzg();
        if (this.zzb) {
            return;
        }
        zzpvVar.zzaT().registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzc = zzpvVar.zzp().zzd();
        zzpvVar.zzaW().zzj().zzb("Registering connectivity change receiver. Network connected", java.lang.Boolean.valueOf(this.zzc));
        this.zzb = true;
    }

    public final void zzc() {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
        zzpvVar.zzM();
        zzpvVar.zzaX().zzg();
        zzpvVar.zzaX().zzg();
        if (this.zzb) {
            zzpvVar.zzaW().zzj().zza("Unregistering connectivity change receiver");
            this.zzb = false;
            this.zzc = false;
            try {
                zzpvVar.zzaT().unregisterReceiver(this);
            } catch (java.lang.IllegalArgumentException e) {
                this.zza.zzaW().zze().zzb("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
