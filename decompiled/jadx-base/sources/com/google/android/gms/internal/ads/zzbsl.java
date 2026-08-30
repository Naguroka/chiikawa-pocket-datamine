package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbsl implements com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement {
    private final com.google.android.gms.internal.ads.zzbgq zza;

    public zzbsl(com.google.android.gms.internal.ads.zzbgq zzbgqVar) {
        this.zza = zzbgqVar;
        try {
            zzbgqVar.zzm();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(android.view.View view) {
        try {
            this.zza.zzp(com.google.android.gms.dynamic.ObjectWrapper.wrap(view));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return false;
        }
    }
}
