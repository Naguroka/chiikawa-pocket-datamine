package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzev extends com.google.android.gms.internal.ads.zzblt {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzex zza;

    /* synthetic */ zzev(com.google.android.gms.ads.internal.client.zzex zzexVar, com.google.android.gms.ads.internal.client.zzew zzewVar) {
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzb(java.util.List list) throws android.os.RemoteException {
        int i;
        java.util.ArrayList arrayList;
        synchronized (this.zza.zzc) {
            this.zza.zzf = false;
            this.zza.zzg = true;
            arrayList = new java.util.ArrayList(this.zza.zze);
            this.zza.zze.clear();
        }
        com.google.android.gms.ads.initialization.InitializationStatus initializationStatusZzA = com.google.android.gms.ads.internal.client.zzex.zzA(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((com.google.android.gms.ads.initialization.OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(initializationStatusZzA);
        }
    }
}
