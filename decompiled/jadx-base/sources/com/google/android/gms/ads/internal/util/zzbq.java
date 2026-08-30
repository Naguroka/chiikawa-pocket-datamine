package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbq extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.util.zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            java.lang.String string = parcel.readString();
            java.lang.String string2 = parcel.readString();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            boolean zZzf = zzf(iObjectWrapperAsInterface, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else if (i == 2) {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zze(iObjectWrapperAsInterface2);
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            boolean zZzg = zzg(iObjectWrapperAsInterface3, zzaVar);
            parcel2.writeNoException();
            parcel2.writeInt(zZzg ? 1 : 0);
        }
        return true;
    }
}
