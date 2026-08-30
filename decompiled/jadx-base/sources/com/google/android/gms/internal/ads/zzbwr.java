package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbwr extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbws {
    public zzbwr() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwm zzbwkVar;
        switch (i) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbwkVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzbwkVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbwm ? (com.google.android.gms.internal.ads.zzbwm) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbwk(strongBinder);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzk(zzbwkVar);
                break;
            case 4:
                int i3 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzh(i3);
                break;
            case 5:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzi(zzeVar);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
