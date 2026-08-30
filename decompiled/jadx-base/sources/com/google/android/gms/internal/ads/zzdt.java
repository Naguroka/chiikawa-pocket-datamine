package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdt extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.DisplayInfoListener {
    private final com.google.android.gms.internal.ads.zzdw zza;

    public zzdt(com.google.android.gms.internal.ads.zzdw zzdwVar) {
        this.zza = zzdwVar;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        com.google.android.gms.internal.ads.zzdw.zzc(this.zza, true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}
