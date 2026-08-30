package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfq extends com.google.android.gms.internal.ads.zzbwo {
    private static void zzr(final com.google.android.gms.internal.ads.zzbww zzbwwVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfp
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.zzbww zzbwwVar2 = zzbwwVar;
                if (zzbwwVar2 != null) {
                    try {
                        zzbwwVar2.zze(1);
                    } catch (android.os.RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final android.os.Bundle zzb() throws android.os.RemoteException {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final com.google.android.gms.ads.internal.client.zzdy zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final com.google.android.gms.internal.ads.zzbwm zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final java.lang.String zze() throws android.os.RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzbww zzbwwVar) throws android.os.RemoteException {
        zzr(zzbwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzbww zzbwwVar) throws android.os.RemoteException {
        zzr(zzbwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(com.google.android.gms.ads.internal.client.zzdo zzdoVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzk(com.google.android.gms.internal.ads.zzbws zzbwsVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzl(com.google.android.gms.internal.ads.zzbxd zzbxdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzo() throws android.os.RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(com.google.android.gms.internal.ads.zzbwx zzbwxVar) throws android.os.RemoteException {
    }
}
