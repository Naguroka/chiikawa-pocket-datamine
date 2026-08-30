package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbvb extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbvc {
    public zzbvb() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.ParcelFileDescriptor.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else if (i == 2) {
            com.google.android.gms.ads.internal.util.zzbb zzbbVar = (com.google.android.gms.ads.internal.util.zzbb) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zze(zzbbVar);
        } else {
            if (i != 3) {
                return false;
            }
            android.os.ParcelFileDescriptor parcelFileDescriptor2 = (android.os.ParcelFileDescriptor) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.ParcelFileDescriptor.CREATOR);
            com.google.android.gms.internal.ads.zzbvk zzbvkVar = (com.google.android.gms.internal.ads.zzbvk) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbvk.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzg(parcelFileDescriptor2, zzbvkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
