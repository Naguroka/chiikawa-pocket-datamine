package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbqw extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbqx {
    public zzbqw() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.internal.ads.zzbpt zzbptVarZzb = com.google.android.gms.internal.ads.zzbps.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzg(zzbptVarZzb);
        } else if (i == 2) {
            java.lang.String string = parcel.readString();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zze(string);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
