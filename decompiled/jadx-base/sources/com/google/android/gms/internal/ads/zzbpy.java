package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbpy implements com.google.android.gms.ads.mediation.InitializationCompleteCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzblr zza;

    zzbpy(com.google.android.gms.internal.ads.zzbqf zzbqfVar, com.google.android.gms.internal.ads.zzblr zzblrVar) {
        this.zza = zzblrVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(java.lang.String str) {
        try {
            this.zza.zze(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }
}
