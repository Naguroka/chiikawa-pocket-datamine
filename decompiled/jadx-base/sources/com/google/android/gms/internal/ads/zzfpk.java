package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfpk {
    final com.google.android.gms.internal.ads.zzfpn zza;
    final boolean zzb;

    private zzfpk(com.google.android.gms.internal.ads.zzfpn zzfpnVar) {
        this.zza = zzfpnVar;
        this.zzb = zzfpnVar != null;
    }

    public static com.google.android.gms.internal.ads.zzfpk zzb(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzfpn zzfplVar;
        try {
            try {
                try {
                    android.os.IBinder iBinderInstantiate = com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    android.os.IBinder iBinder = iBinderInstantiate;
                    if (iBinderInstantiate == null) {
                        zzfplVar = null;
                    } else {
                        android.os.IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfplVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzfpn ? (com.google.android.gms.internal.ads.zzfpn) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzfpl(iBinderInstantiate);
                    }
                    com.google.android.gms.internal.ads.zzfpn zzfpnVar = zzfplVar;
                    zzfplVar.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, null);
                    android.util.Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new com.google.android.gms.internal.ads.zzfpk(zzfplVar);
                } catch (java.lang.Exception e) {
                    throw new com.google.android.gms.internal.ads.zzfom(e);
                }
            } catch (java.lang.Exception e2) {
                throw new com.google.android.gms.internal.ads.zzfom(e2);
            }
        } catch (android.os.RemoteException | com.google.android.gms.internal.ads.zzfom | java.lang.NullPointerException | java.lang.SecurityException unused) {
            android.util.Log.d("GASS", "Cannot dynamite load clearcut");
            return new com.google.android.gms.internal.ads.zzfpk(new com.google.android.gms.internal.ads.zzfpo());
        }
    }

    public static com.google.android.gms.internal.ads.zzfpk zzc() {
        com.google.android.gms.internal.ads.zzfpo zzfpoVar = new com.google.android.gms.internal.ads.zzfpo();
        android.util.Log.d("GASS", "Clearcut logging disabled");
        return new com.google.android.gms.internal.ads.zzfpk(zzfpoVar);
    }

    public final com.google.android.gms.internal.ads.zzfpi zza(byte[] bArr) {
        return new com.google.android.gms.internal.ads.zzfpi(this, bArr, null);
    }
}
