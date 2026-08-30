package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfg extends com.google.android.gms.ads.internal.client.zzbq {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfi zza;

    /* synthetic */ zzfg(com.google.android.gms.ads.internal.client.zzfi zzfiVar, com.google.android.gms.ads.internal.client.zzfh zzfhVar) {
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final java.lang.String zze() throws android.os.RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final java.lang.String zzf() throws android.os.RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        zzh(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzh(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.ads.internal.client.zzff(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final boolean zzi() throws android.os.RemoteException {
        return false;
    }
}
