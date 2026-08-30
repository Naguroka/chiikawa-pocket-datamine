package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbq extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzg(zzmVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            java.lang.String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else if (i == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            int i3 = com.google.android.gms.internal.ads.zzayc.zza;
            parcel2.writeInt(zZzi ? 1 : 0);
        } else if (i == 4) {
            java.lang.String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i != 5) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
            int i4 = parcel.readInt();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzh(zzmVar2, i4);
            parcel2.writeNoException();
        }
        return true;
    }
}
