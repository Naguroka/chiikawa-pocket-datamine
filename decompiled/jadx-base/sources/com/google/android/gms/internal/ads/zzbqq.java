package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbqq extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbqr {
    public zzbqq() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzg(iObjectWrapperAsInterface);
        } else if (i == 2) {
            java.lang.String string = parcel.readString();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zze(string);
        } else if (i == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzf(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            com.google.android.gms.internal.ads.zzbpn zzbpnVarZzb = com.google.android.gms.internal.ads.zzbpm.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzh(zzbpnVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
