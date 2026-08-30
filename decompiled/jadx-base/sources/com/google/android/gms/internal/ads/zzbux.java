package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbux extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbuy {
    public zzbux() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbvc zzbvaVar = null;
        com.google.android.gms.internal.ads.zzbvd zzbvdVar = null;
        com.google.android.gms.internal.ads.zzbvc zzbvaVar2 = null;
        com.google.android.gms.internal.ads.zzbvc zzbvaVar3 = null;
        com.google.android.gms.internal.ads.zzbvc zzbvaVar4 = null;
        switch (i) {
            case 1:
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, null);
                return true;
            case 2:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbuz) {
                    }
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                com.google.android.gms.internal.ads.zzbvk zzbvkVar = (com.google.android.gms.internal.ads.zzbvk) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbvk.CREATOR);
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvaVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.ads.zzbvc ? (com.google.android.gms.internal.ads.zzbvc) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.ads.zzbva(strongBinder2);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzg(zzbvkVar, zzbvaVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.internal.ads.zzbvk zzbvkVar2 = (com.google.android.gms.internal.ads.zzbvk) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbvk.CREATOR);
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvaVar4 = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.ads.zzbvc ? (com.google.android.gms.internal.ads.zzbvc) iInterfaceQueryLocalInterface3 : new com.google.android.gms.internal.ads.zzbva(strongBinder3);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzf(zzbvkVar2, zzbvaVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.internal.ads.zzbvk zzbvkVar3 = (com.google.android.gms.internal.ads.zzbvk) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbvk.CREATOR);
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvaVar3 = iInterfaceQueryLocalInterface4 instanceof com.google.android.gms.internal.ads.zzbvc ? (com.google.android.gms.internal.ads.zzbvc) iInterfaceQueryLocalInterface4 : new com.google.android.gms.internal.ads.zzbva(strongBinder4);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zze(zzbvkVar3, zzbvaVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                java.lang.String string = parcel.readString();
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvaVar2 = iInterfaceQueryLocalInterface5 instanceof com.google.android.gms.internal.ads.zzbvc ? (com.google.android.gms.internal.ads.zzbvc) iInterfaceQueryLocalInterface5 : new com.google.android.gms.internal.ads.zzbva(strongBinder5);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzh(string, zzbvaVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.internal.ads.zzbuu zzbuuVar = (com.google.android.gms.internal.ads.zzbuu) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbuu.CREATOR);
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbvdVar = iInterfaceQueryLocalInterface6 instanceof com.google.android.gms.internal.ads.zzbvd ? (com.google.android.gms.internal.ads.zzbvd) iInterfaceQueryLocalInterface6 : new com.google.android.gms.internal.ads.zzbvd(strongBinder6);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzi(zzbuuVar, zzbvdVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
