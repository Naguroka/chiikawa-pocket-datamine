package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeoa implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final android.content.Context zzb;

    zzeoa(com.google.android.gms.internal.ads.zzgcs zzgcsVar, android.content.Context context) {
        this.zza = zzgcsVar;
        this.zzb = context;
    }

    private final android.content.Intent zzd() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkR)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver(null, intentFilter) : this.zzb.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean zze(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzenz
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeob zzc() throws java.lang.Exception {
        double intExtra;
        boolean zIsCharging;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlS)).booleanValue()) {
            android.os.BatteryManager batteryManager = (android.os.BatteryManager) this.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? ((double) batteryManager.getIntProperty(4)) / 100.0d : -1.0d;
            zIsCharging = batteryManager != null ? batteryManager.isCharging() : zze(zzd());
        } else {
            android.content.Intent intentZzd = zzd();
            boolean zZze = zze(intentZzd);
            intExtra = intentZzd != null ? ((double) intentZzd.getIntExtra("level", -1)) / ((double) intentZzd.getIntExtra("scale", -1)) : -1.0d;
            zIsCharging = zZze;
        }
        return new com.google.android.gms.internal.ads.zzeob(intExtra, zIsCharging);
    }
}
