package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzed extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzee {
    public zzed() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zzi();
        } else if (i == 2) {
            zzh();
        } else if (i == 3) {
            zzg();
        } else if (i == 4) {
            zze();
        } else {
            if (i != 5) {
                return false;
            }
            boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcel);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzf(zZzg);
        }
        parcel2.writeNoException();
        return true;
    }
}
