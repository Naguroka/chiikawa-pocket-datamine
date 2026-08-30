package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhv implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhw zza;
    private final java.lang.String zzb;

    zzhv(com.google.android.gms.measurement.internal.zzhw zzhwVar, java.lang.String str) {
        this.zza = zzhwVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (iBinder == null) {
            this.zza.zza.zzaW().zzk().zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbr zzbrVarZzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
            if (zzbrVarZzb == null) {
                this.zza.zza.zzaW().zzk().zza("Install Referrer Service implementation was not found");
                return;
            }
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zza.zza;
            zzioVar.zzaW().zzj().zza("Install Referrer Service connected");
            zzioVar.zzaX().zzq(new com.google.android.gms.measurement.internal.zzhu(this, zzbrVarZzb, this));
        } catch (java.lang.RuntimeException e) {
            this.zza.zza.zzaW().zzk().zzb("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.zza.zza.zzaW().zzj().zza("Install Referrer Service disconnected");
    }
}
