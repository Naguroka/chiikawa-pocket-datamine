package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzp implements android.content.ServiceConnection, com.google.android.gms.common.internal.zzt {
    final /* synthetic */ com.google.android.gms.common.internal.zzs zza;
    private final java.util.Map zzb = new java.util.HashMap();
    private int zzc = 2;
    private boolean zzd;
    private android.os.IBinder zze;
    private final com.google.android.gms.common.internal.zzo zzf;
    private android.content.ComponentName zzg;

    public zzp(com.google.android.gms.common.internal.zzs zzsVar, com.google.android.gms.common.internal.zzo zzoVar) {
        this.zza = zzsVar;
        this.zzf = zzoVar;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.ConnectionResult zzd(com.google.android.gms.common.internal.zzp zzpVar, java.lang.String str, java.util.concurrent.Executor executor) {
        com.google.android.gms.common.ConnectionResult connectionResult;
        try {
            android.content.Intent intentZza = com.google.android.gms.common.internal.zzak.zza(zzpVar.zza.zzc, zzpVar.zzf);
            zzpVar.zzc = 3;
            android.os.StrictMode.VmPolicy vmPolicyZza = com.google.android.gms.common.util.zzc.zza();
            try {
                com.google.android.gms.common.internal.zzs zzsVar = zzpVar.zza;
                boolean zZza = zzsVar.zzf.zza(zzsVar.zzc, str, intentZza, zzpVar, 4225, executor);
                zzpVar.zzd = zZza;
                if (zZza) {
                    zzpVar.zza.zzd.sendMessageDelayed(zzpVar.zza.zzd.obtainMessage(1, zzpVar.zzf), zzpVar.zza.zzh);
                    connectionResult = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
                } else {
                    zzpVar.zzc = 2;
                    try {
                        com.google.android.gms.common.internal.zzs zzsVar2 = zzpVar.zza;
                        zzsVar2.zzf.unbindService(zzsVar2.zzc, zzpVar);
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                    connectionResult = new com.google.android.gms.common.ConnectionResult(16);
                }
                return connectionResult;
            } finally {
                android.os.StrictMode.setVmPolicy(vmPolicyZza);
            }
        } catch (com.google.android.gms.common.internal.zzai e) {
            return e.zza;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this.zza.zzb) {
            this.zza.zzd.removeMessages(1, this.zzf);
            this.zze = iBinder;
            this.zzg = componentName;
            java.util.Iterator it = this.zzb.values().iterator();
            while (it.hasNext()) {
                ((android.content.ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.zzc = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.zza.zzb) {
            this.zza.zzd.removeMessages(1, this.zzf);
            this.zze = null;
            this.zzg = componentName;
            java.util.Iterator it = this.zzb.values().iterator();
            while (it.hasNext()) {
                ((android.content.ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.zzc = 2;
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final android.content.ComponentName zzb() {
        return this.zzg;
    }

    public final android.os.IBinder zzc() {
        return this.zze;
    }

    public final void zze(android.content.ServiceConnection serviceConnection, android.content.ServiceConnection serviceConnection2, java.lang.String str) {
        this.zzb.put(serviceConnection, serviceConnection2);
    }

    public final void zzf(android.content.ServiceConnection serviceConnection, java.lang.String str) {
        this.zzb.remove(serviceConnection);
    }

    public final void zzg(java.lang.String str) {
        this.zza.zzd.removeMessages(1, this.zzf);
        com.google.android.gms.common.internal.zzs zzsVar = this.zza;
        zzsVar.zzf.unbindService(zzsVar.zzc, this);
        this.zzd = false;
        this.zzc = 2;
    }

    public final boolean zzh(android.content.ServiceConnection serviceConnection) {
        return this.zzb.containsKey(serviceConnection);
    }

    public final boolean zzi() {
        return this.zzb.isEmpty();
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
