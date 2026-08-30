package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzav {
    private final com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> zza;
    private final android.content.Context zzb;
    private boolean zzc = false;
    private final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationListener>, com.google.android.gms.internal.location.zzau> zzd = new java.util.HashMap();
    private final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey, com.google.android.gms.internal.location.zzas> zze = new java.util.HashMap();
    private final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationCallback>, com.google.android.gms.internal.location.zzar> zzf = new java.util.HashMap();

    public zzav(android.content.Context context, com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> zzbgVar) {
        this.zzb = context;
        this.zza = zzbgVar;
    }

    public final android.location.Location zza(java.lang.String str) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzh) this.zza).zza.checkConnected();
        return ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzn(str);
    }

    @java.lang.Deprecated
    public final android.location.Location zzb() throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzh) this.zza).zza.checkConnected();
        return ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzm();
    }

    public final com.google.android.gms.location.LocationAvailability zzc() throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzh) this.zza).zza.checkConnected();
        return ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzs(this.zzb.getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationListener> listenerHolder, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        com.google.android.gms.internal.location.zzau zzauVar;
        com.google.android.gms.internal.location.zzau zzauVar2;
        ((com.google.android.gms.internal.location.zzh) this.zza).zza.checkConnected();
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationListener> listenerKey = listenerHolder.getListenerKey();
        if (listenerKey == null) {
            zzauVar2 = null;
        } else {
            synchronized (this.zzd) {
                zzauVar = this.zzd.get(listenerKey);
                if (zzauVar == null) {
                    zzauVar = new com.google.android.gms.internal.location.zzau(listenerHolder);
                }
                this.zzd.put(listenerKey, zzauVar);
            }
            zzauVar2 = zzauVar;
        }
        if (zzauVar2 == null) {
            return;
        }
        ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzo(new com.google.android.gms.internal.location.zzbc(1, com.google.android.gms.internal.location.zzba.zza(null, locationRequest), zzauVar2, null, null, zzaiVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(com.google.android.gms.internal.location.zzba zzbaVar, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationCallback> listenerHolder, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        com.google.android.gms.internal.location.zzar zzarVar;
        ((com.google.android.gms.internal.location.zzh) this.zza).zza.checkConnected();
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationCallback> listenerKey = listenerHolder.getListenerKey();
        if (listenerKey == null) {
            zzarVar = null;
        } else {
            synchronized (this.zzf) {
                com.google.android.gms.internal.location.zzar zzarVar2 = this.zzf.get(listenerKey);
                if (zzarVar2 == null) {
                    zzarVar2 = new com.google.android.gms.internal.location.zzar(listenerHolder);
                }
                zzarVar = zzarVar2;
                this.zzf.put(listenerKey, zzarVar);
            }
        }
        com.google.android.gms.internal.location.zzar zzarVar3 = zzarVar;
        if (zzarVar3 == null) {
            return;
        }
        ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzo(new com.google.android.gms.internal.location.zzbc(1, zzbaVar, null, null, zzarVar3, zzaiVar));
    }

    public final void zzf(com.google.android.gms.internal.location.zzba zzbaVar, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzh) this.zza).zza.checkConnected();
        ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzo(com.google.android.gms.internal.location.zzbc.zzb(zzbaVar, pendingIntent, zzaiVar));
    }

    public final void zzg(com.google.android.gms.location.LocationRequest locationRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzh) this.zza).zza.checkConnected();
        ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzo(com.google.android.gms.internal.location.zzbc.zzb(com.google.android.gms.internal.location.zzba.zza(null, locationRequest), pendingIntent, zzaiVar));
    }

    public final void zzh(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationListener> listenerKey, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzh) this.zza).zza.checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.zzd) {
            com.google.android.gms.internal.location.zzau zzauVarRemove = this.zzd.remove(listenerKey);
            if (zzauVarRemove != null) {
                zzauVarRemove.zzc();
                ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzo(com.google.android.gms.internal.location.zzbc.zza(zzauVarRemove, zzaiVar));
            }
        }
    }

    public final void zzi(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationCallback> listenerKey, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzh) this.zza).zza.checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.zzf) {
            com.google.android.gms.internal.location.zzar zzarVarRemove = this.zzf.remove(listenerKey);
            if (zzarVarRemove != null) {
                zzarVarRemove.zzc();
                ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzo(com.google.android.gms.internal.location.zzbc.zzc(zzarVarRemove, zzaiVar));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzj(android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzh) this.zza).zza.checkConnected();
        ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzo(new com.google.android.gms.internal.location.zzbc(2, null, null, pendingIntent, null, zzaiVar));
    }

    public final void zzk(boolean z) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzh) this.zza).zza.checkConnected();
        ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzp(z);
        this.zzc = z;
    }

    public final void zzl(android.location.Location location) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzh) this.zza).zza.checkConnected();
        ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzq(location);
    }

    public final void zzm(com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzh) this.zza).zza.checkConnected();
        ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzr(zzaiVar);
    }

    public final void zzn() throws android.os.RemoteException {
        synchronized (this.zzd) {
            for (com.google.android.gms.internal.location.zzau zzauVar : this.zzd.values()) {
                if (zzauVar != null) {
                    ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzo(com.google.android.gms.internal.location.zzbc.zza(zzauVar, null));
                }
            }
            this.zzd.clear();
        }
        synchronized (this.zzf) {
            for (com.google.android.gms.internal.location.zzar zzarVar : this.zzf.values()) {
                if (zzarVar != null) {
                    ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzo(com.google.android.gms.internal.location.zzbc.zzc(zzarVar, null));
                }
            }
            this.zzf.clear();
        }
        synchronized (this.zze) {
            for (com.google.android.gms.internal.location.zzas zzasVar : this.zze.values()) {
                if (zzasVar != null) {
                    ((com.google.android.gms.internal.location.zzh) this.zza).zza().zzu(new com.google.android.gms.internal.location.zzl(2, null, zzasVar, null));
                }
            }
            this.zze.clear();
        }
    }

    public final void zzo() throws android.os.RemoteException {
        if (this.zzc) {
            zzk(false);
        }
    }
}
