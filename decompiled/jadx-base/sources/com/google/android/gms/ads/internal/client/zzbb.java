package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzbb {
    private static final com.google.android.gms.ads.internal.client.zzcp zza;

    static {
        com.google.android.gms.ads.internal.client.zzcp zzcnVar = null;
        try {
            java.lang.Object objNewInstance = com.google.android.gms.ads.internal.client.zzba.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (objNewInstance instanceof android.os.IBinder) {
                android.os.IBinder iBinder = (android.os.IBinder) objNewInstance;
                if (iBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzcnVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcp ? (com.google.android.gms.ads.internal.client.zzcp) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzcn(iBinder);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (java.lang.Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzcnVar;
    }

    zzbb() {
    }

    private final java.lang.Object zze() {
        com.google.android.gms.ads.internal.client.zzcp zzcpVar = zza;
        if (zzcpVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzb(zzcpVar);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final java.lang.Object zzf() {
        try {
            return zzc();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }

    protected abstract java.lang.Object zza();

    protected abstract java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException;

    protected abstract java.lang.Object zzc() throws android.os.RemoteException;

    public final java.lang.Object zzd(android.content.Context context, boolean z) {
        boolean z2;
        java.lang.Object objZze;
        if (!z) {
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            if (!com.google.android.gms.ads.internal.util.client.zzf.zzs(context, 12451000)) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID) <= com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID));
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeg.zza.zze()).booleanValue()) {
            z2 = false;
        } else if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeg.zzb.zze()).booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z | z4;
            z2 = false;
        }
        if (z3) {
            objZze = zze();
            if (objZze == null && !z2) {
                objZze = zzf();
            }
        } else {
            java.lang.Object objZzf = zzf();
            if (objZzf == null) {
                if (com.google.android.gms.ads.internal.client.zzbc.zze().nextInt(((java.lang.Long) com.google.android.gms.internal.ads.zzbeu.zza.zze()).intValue()) == 0) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    com.google.android.gms.ads.internal.client.zzbc.zzb().zzn(context, com.google.android.gms.ads.internal.client.zzbc.zzc().afmaVersion, "gmob-apps", bundle, true);
                }
            }
            objZze = objZzf == null ? zze() : objZzf;
        }
        return objZze == null ? zza() : objZze;
    }
}
