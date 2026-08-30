package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbk extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzbl {
    public zzbk() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                zzd();
                break;
            case 2:
                int i3 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zze(i3);
                break;
            case 3:
                break;
            case 4:
                zzi();
                break;
            case 5:
                zzj();
                break;
            case 6:
                zzc();
                break;
            case 7:
                zzg();
                break;
            case 8:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzf(zzeVar);
                break;
            case 9:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
