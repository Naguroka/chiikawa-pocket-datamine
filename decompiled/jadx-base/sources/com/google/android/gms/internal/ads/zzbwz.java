package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbwz implements com.google.android.gms.ads.rewarded.RewardItem {
    private final com.google.android.gms.internal.ads.zzbwm zza;

    public zzbwz(com.google.android.gms.internal.ads.zzbwm zzbwmVar) {
        this.zza = zzbwmVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        com.google.android.gms.internal.ads.zzbwm zzbwmVar = this.zza;
        if (zzbwmVar != null) {
            try {
                return zzbwmVar.zze();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final java.lang.String getType() {
        com.google.android.gms.internal.ads.zzbwm zzbwmVar = this.zza;
        if (zzbwmVar != null) {
            try {
                return zzbwmVar.zzf();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
