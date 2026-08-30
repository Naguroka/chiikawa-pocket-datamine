package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdw extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.ads.internal.client.zzdy {
    zzdw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final android.os.Bundle zze() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(5, zza());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, android.os.Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final com.google.android.gms.ads.internal.client.zzw zzf() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(4, zza());
        com.google.android.gms.ads.internal.client.zzw zzwVar = (com.google.android.gms.ads.internal.client.zzw) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, com.google.android.gms.ads.internal.client.zzw.CREATOR);
        parcelZzcZ.recycle();
        return zzwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.lang.String zzg() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(1, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.lang.String zzh() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(6, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.lang.String zzi() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(2, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.util.List zzj() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(3, zza());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZzcZ.createTypedArrayList(com.google.android.gms.ads.internal.client.zzw.CREATOR);
        parcelZzcZ.recycle();
        return arrayListCreateTypedArrayList;
    }
}
