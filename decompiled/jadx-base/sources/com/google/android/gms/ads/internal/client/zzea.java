package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzea extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzeb {
    public zzea() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static com.google.android.gms.ads.internal.client.zzeb zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzeb ? (com.google.android.gms.ads.internal.client.zzeb) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzdz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzee zzecVar;
        switch (i) {
            case 1:
                zzl();
                parcel2.writeNoException();
                return true;
            case 2:
                zzk();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcel);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzj(zZzg);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 5:
                int iZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeInt(iZzh);
                return true;
            case 6:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 7:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 8:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzecVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzecVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzee ? (com.google.android.gms.ads.internal.client.zzee) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzec(strongBinder);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzm(zzecVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 10:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                int i4 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzee zzeeVarZzi = zzi();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzeeVarZzi);
                return true;
            case 12:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i5 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 13:
                zzn();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
