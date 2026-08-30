package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbxg extends com.google.android.gms.internal.ads.zzbwl {
    private final java.lang.String zza;
    private final int zzb;

    public zzbxg(com.google.android.gms.ads.rewarded.RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final int zze() throws android.os.RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final java.lang.String zzf() throws android.os.RemoteException {
        return this.zza;
    }

    public zzbxg(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
