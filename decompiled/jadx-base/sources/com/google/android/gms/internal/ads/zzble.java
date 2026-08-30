package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzble extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzblf {
    public zzble() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.ParcelFileDescriptor.CREATOR);
        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
        zzb(parcelFileDescriptor);
        return true;
    }
}
