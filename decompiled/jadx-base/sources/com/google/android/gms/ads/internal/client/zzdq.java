package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzdq extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzdr {
    public zzdq() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static com.google.android.gms.ads.internal.client.zzdr zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdr ? (com.google.android.gms.ads.internal.client.zzdr) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzdp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzu.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zze(zzuVar);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            int i3 = com.google.android.gms.internal.ads.zzayc.zza;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }
}
