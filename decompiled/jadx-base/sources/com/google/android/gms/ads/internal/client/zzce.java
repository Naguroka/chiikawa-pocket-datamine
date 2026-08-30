package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzce extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzcf {
    public zzce() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.ads.internal.client.zzft zzftVar = (com.google.android.gms.ads.internal.client.zzft) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzft.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zze(zzftVar);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zzft zzftVar2 = (com.google.android.gms.ads.internal.client.zzft) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzft.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzf(zzftVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
