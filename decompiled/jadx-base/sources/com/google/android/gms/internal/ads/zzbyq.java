package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbyq extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbyr {
    public zzbyq() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
        } else if (i == 2) {
            java.lang.String string = parcel.readString();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzb(string);
        } else {
            if (i != 3) {
                return false;
            }
            java.lang.String string2 = parcel.readString();
            java.lang.String string3 = parcel.readString();
            android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzc(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
