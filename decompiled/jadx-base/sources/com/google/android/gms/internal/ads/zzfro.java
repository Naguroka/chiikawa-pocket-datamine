package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfro extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzfrp {
    public zzfro() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
        zzb(bundle);
        return true;
    }
}
