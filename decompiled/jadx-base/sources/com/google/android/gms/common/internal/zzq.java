package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzq implements android.os.Handler.Callback {
    final /* synthetic */ com.google.android.gms.common.internal.zzs zza;

    /* synthetic */ zzq(com.google.android.gms.common.internal.zzs zzsVar, com.google.android.gms.common.internal.zzr zzrVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.zza.zzb) {
                com.google.android.gms.common.internal.zzo zzoVar = (com.google.android.gms.common.internal.zzo) message.obj;
                com.google.android.gms.common.internal.zzp zzpVar = (com.google.android.gms.common.internal.zzp) this.zza.zzb.get(zzoVar);
                if (zzpVar != null && zzpVar.zzi()) {
                    if (zzpVar.zzj()) {
                        zzpVar.zzg("GmsClientSupervisor");
                    }
                    this.zza.zzb.remove(zzoVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.zza.zzb) {
            com.google.android.gms.common.internal.zzo zzoVar2 = (com.google.android.gms.common.internal.zzo) message.obj;
            com.google.android.gms.common.internal.zzp zzpVar2 = (com.google.android.gms.common.internal.zzp) this.zza.zzb.get(zzoVar2);
            if (zzpVar2 != null && zzpVar2.zza() == 3) {
                android.util.Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + java.lang.String.valueOf(zzoVar2), new java.lang.Exception());
                android.content.ComponentName componentNameZzb = zzpVar2.zzb();
                if (componentNameZzb == null) {
                    componentNameZzb = zzoVar2.zza();
                }
                if (componentNameZzb == null) {
                    java.lang.String strZzc = zzoVar2.zzc();
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(strZzc);
                    java.lang.String str = strZzc;
                    componentNameZzb = new android.content.ComponentName(strZzc, "unknown");
                }
                zzpVar2.onServiceDisconnected(componentNameZzb);
            }
        }
        return true;
    }
}
