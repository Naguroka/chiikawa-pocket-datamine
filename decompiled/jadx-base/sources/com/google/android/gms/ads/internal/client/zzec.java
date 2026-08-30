package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzec extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.ads.internal.client.zzee {
    zzec(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zze() throws android.os.RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        int i = com.google.android.gms.internal.ads.zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() throws android.os.RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() throws android.os.RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() throws android.os.RemoteException {
        zzda(1, zza());
    }
}
