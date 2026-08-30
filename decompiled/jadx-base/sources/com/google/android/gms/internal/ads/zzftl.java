package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzftl implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.internal.ads.zzftn zza;

    /* synthetic */ zzftl(com.google.android.gms.internal.ads.zzftn zzftnVar, com.google.android.gms.internal.ads.zzftm zzftmVar) {
        this.zza = zzftnVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, final android.os.IBinder iBinder) {
        this.zza.zzc.zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        this.zza.zzo(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzftj
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.zzfrn zzfrnVarZzb = com.google.android.gms.internal.ads.zzfrm.zzb(iBinder);
                com.google.android.gms.internal.ads.zzftl zzftlVar = this.zza;
                zzftlVar.zza.zzj = zzfrnVarZzb;
                zzftlVar.zza.zzc.zzc("linkToDeath", new java.lang.Object[0]);
                try {
                    android.os.IInterface iInterface = zzftlVar.zza.zzj;
                    iInterface.getClass();
                    iInterface.asBinder().linkToDeath(zzftlVar.zza.zzh, 0);
                } catch (android.os.RemoteException e) {
                    zzftlVar.zza.zzc.zzb(e, "linkToDeath failed", new java.lang.Object[0]);
                }
                zzftlVar.zza.zzf = false;
                synchronized (zzftlVar.zza.zze) {
                    java.util.Iterator it = zzftlVar.zza.zze.iterator();
                    while (it.hasNext()) {
                        ((java.lang.Runnable) it.next()).run();
                    }
                    zzftlVar.zza.zze.clear();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.zza.zzc.zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        this.zza.zzo(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzftk
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.zzftl zzftlVar = this.zza;
                zzftlVar.zza.zzc.zzc("unlinkToDeath", new java.lang.Object[0]);
                android.os.IInterface iInterface = zzftlVar.zza.zzj;
                iInterface.getClass();
                iInterface.asBinder().unlinkToDeath(zzftlVar.zza.zzh, 0);
                zzftlVar.zza.zzj = null;
                zzftlVar.zza.zzf = false;
            }
        });
    }
}
