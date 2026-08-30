package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfdf {
    private static com.google.android.gms.internal.ads.zzfdf zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcw zzc;
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();

    zzfdf(android.content.Context context, com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzb = context;
        this.zzc = zzcwVar;
    }

    static com.google.android.gms.ads.internal.client.zzcw zza(android.content.Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzcv.asInterface((android.os.IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(android.content.Context.class).newInstance(context));
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static com.google.android.gms.internal.ads.zzfdf zzd(android.content.Context context) {
        synchronized (com.google.android.gms.internal.ads.zzfdf.class) {
            com.google.android.gms.internal.ads.zzfdf zzfdfVar = zza;
            if (zzfdfVar != null) {
                return zzfdfVar;
            }
            android.content.Context applicationContext = context.getApplicationContext();
            long jLongValue = ((java.lang.Long) com.google.android.gms.internal.ads.zzbem.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcw zzcwVarZza = null;
            if (jLongValue > 0 && jLongValue <= 244410203) {
                zzcwVarZza = zza(applicationContext);
            }
            com.google.android.gms.internal.ads.zzfdf zzfdfVar2 = new com.google.android.gms.internal.ads.zzfdf(applicationContext, zzcwVarZza);
            zza = zzfdfVar2;
            return zzfdfVar2;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzfb zzg() {
        com.google.android.gms.ads.internal.client.zzcw zzcwVar = this.zzc;
        if (zzcwVar != null) {
            try {
                return zzcwVar.getLiteSdkVersion();
            } catch (android.os.RemoteException unused) {
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.ads.zzbpe zzb() {
        return (com.google.android.gms.internal.ads.zzbpe) this.zzd.get();
    }

    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzfb zzfbVarZzg;
        com.google.android.gms.ads.internal.zzv.zzq();
        boolean zZzF = com.google.android.gms.ads.internal.util.zzs.zzF(this.zzb);
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel(244410000, i2, true, zZzF);
        return (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbem.zzc.zze()).booleanValue() && (zzfbVarZzg = zzg()) != null) ? new com.google.android.gms.ads.internal.util.client.VersionInfoParcel(244410000, zzfbVarZzg.zza(), true, zZzF) : versionInfoParcel;
    }

    public final java.lang.String zze() {
        com.google.android.gms.ads.internal.client.zzfb zzfbVarZzg = zzg();
        if (zzfbVarZzg != null) {
            return zzfbVarZzg.zzb();
        }
        return null;
    }

    public final void zzf(com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        com.google.android.gms.internal.ads.zzbpe adapterCreator;
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbem.zza.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzfde.zza(this.zzd, null, zzbpeVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcw zzcwVar = this.zzc;
        if (zzcwVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcwVar.getAdapterCreator();
            } catch (android.os.RemoteException unused) {
                adapterCreator = null;
            }
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzbpeVar = adapterCreator;
        }
        com.google.android.gms.internal.ads.zzfde.zza(atomicReference, null, zzbpeVar);
    }
}
