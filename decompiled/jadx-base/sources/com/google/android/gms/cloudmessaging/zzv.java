package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzv {
    private static com.google.android.gms.cloudmessaging.zzv zza;
    private final android.content.Context zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private com.google.android.gms.cloudmessaging.zzp zzd = new com.google.android.gms.cloudmessaging.zzp(this, null);
    private int zze = 1;

    zzv(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public static synchronized com.google.android.gms.cloudmessaging.zzv zzb(android.content.Context context) {
        if (zza == null) {
            com.google.android.gms.internal.cloudmessaging.zze.zza();
            zza = new com.google.android.gms.cloudmessaging.zzv(context, java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory("MessengerIpcClient"))));
        }
        return zza;
    }

    private final synchronized int zzf() {
        int i;
        i = this.zze;
        this.zze = i + 1;
        return i;
    }

    private final synchronized com.google.android.gms.tasks.Task zzg(com.google.android.gms.cloudmessaging.zzs zzsVar) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            android.util.Log.d("MessengerIpcClient", "Queueing ".concat(zzsVar.toString()));
        }
        if (!this.zzd.zzg(zzsVar)) {
            com.google.android.gms.cloudmessaging.zzp zzpVar = new com.google.android.gms.cloudmessaging.zzp(this, null);
            this.zzd = zzpVar;
            zzpVar.zzg(zzsVar);
        }
        return zzsVar.zzb.getTask();
    }

    public final com.google.android.gms.tasks.Task zzc(int i, android.os.Bundle bundle) {
        return zzg(new com.google.android.gms.cloudmessaging.zzr(zzf(), i, bundle));
    }

    public final com.google.android.gms.tasks.Task zzd(int i, android.os.Bundle bundle) {
        return zzg(new com.google.android.gms.cloudmessaging.zzu(zzf(), i, bundle));
    }
}
