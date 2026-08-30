package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class GmsClientSupervisor {
    static android.os.HandlerThread zza = null;
    private static final java.lang.Object zzb = new java.lang.Object();
    private static int zzc = 9;
    private static com.google.android.gms.common.internal.zzs zzd = null;
    private static java.util.concurrent.Executor zze = null;
    private static boolean zzf = false;

    public static int getDefaultBindFlags() {
        return 4225;
    }

    public static com.google.android.gms.common.internal.GmsClientSupervisor getInstance(android.content.Context context) {
        synchronized (zzb) {
            if (zzd == null) {
                zzd = new com.google.android.gms.common.internal.zzs(context.getApplicationContext(), zzf ? getOrStartHandlerThread().getLooper() : context.getMainLooper(), zze);
            }
        }
        return zzd;
    }

    public static android.os.HandlerThread getOrStartHandlerThread() {
        synchronized (zzb) {
            android.os.HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("GoogleApiHandler", zzc);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    public static void setDefaultBindExecutor(java.util.concurrent.Executor executor) {
        synchronized (zzb) {
            com.google.android.gms.common.internal.zzs zzsVar = zzd;
            if (zzsVar != null) {
                zzsVar.zzi(executor);
            }
            zze = executor;
        }
    }

    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int i) {
        synchronized (zzb) {
            if (zza != null) {
                return false;
            }
            zzc = i;
            return true;
        }
    }

    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzb) {
            com.google.android.gms.common.internal.zzs zzsVar = zzd;
            if (zzsVar != null && !zzf) {
                zzsVar.zzj(getOrStartHandlerThread().getLooper());
            }
            zzf = true;
        }
    }

    public boolean bindService(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        return zza(new com.google.android.gms.common.internal.zzo(componentName, 4225), serviceConnection, str, null).isSuccess();
    }

    public void unbindService(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        zzb(new com.google.android.gms.common.internal.zzo(componentName, 4225), serviceConnection, str);
    }

    protected abstract com.google.android.gms.common.ConnectionResult zza(com.google.android.gms.common.internal.zzo zzoVar, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor);

    protected abstract void zzb(com.google.android.gms.common.internal.zzo zzoVar, android.content.ServiceConnection serviceConnection, java.lang.String str);

    public final void zzc(java.lang.String str, java.lang.String str2, int i, android.content.ServiceConnection serviceConnection, java.lang.String str3, boolean z) {
        zzb(new com.google.android.gms.common.internal.zzo(str, str2, 4225, z), serviceConnection, str3);
    }

    public void unbindService(java.lang.String str, android.content.ServiceConnection serviceConnection, java.lang.String str2) {
        zzb(new com.google.android.gms.common.internal.zzo(str, 4225, false), serviceConnection, str2);
    }

    public boolean bindService(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor) {
        return zza(new com.google.android.gms.common.internal.zzo(componentName, 4225), serviceConnection, str, executor).isSuccess();
    }

    public static android.os.HandlerThread getOrStartHandlerThread(int i) {
        synchronized (zzb) {
            android.os.HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("GoogleApiHandler", i);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    public boolean bindService(java.lang.String str, android.content.ServiceConnection serviceConnection, java.lang.String str2) {
        return zza(new com.google.android.gms.common.internal.zzo(str, 4225, false), serviceConnection, str2, null).isSuccess();
    }
}
