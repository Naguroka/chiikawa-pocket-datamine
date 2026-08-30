package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzdd extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.internal.measurement.zzde {
    public zzdd() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            java.lang.String string = parcel.readString();
            java.lang.String string2 = parcel.readString();
            android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
            long j = parcel.readLong();
            com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
            zzf(string, string2, bundle, j);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int iZze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(iZze);
        }
        return true;
    }
}
