package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbvv extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbvw {
    public zzbvv() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            java.lang.String strZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(strZzc);
        } else {
            if (i != 2) {
                return false;
            }
            int iZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeInt(iZzb);
        }
        return true;
    }
}
