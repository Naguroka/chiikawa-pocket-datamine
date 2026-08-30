package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeug implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final android.content.Context zzb;

    public zzeug(com.google.android.gms.internal.ads.zzgcs zzgcsVar, android.content.Context context) {
        this.zza = zzgcsVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeuf
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeue zzc() throws java.lang.Exception {
        boolean zIsActiveNetworkMetered;
        int i;
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.zzb.getSystemService("phone");
        java.lang.String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzv.zzq();
        int i2 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzB(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.zzb.getSystemService("connectivity");
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i2 = iOrdinal;
            } else {
                i = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        } else {
            zIsActiveNetworkMetered = false;
            i = -2;
        }
        return new com.google.android.gms.internal.ads.zzeue(networkOperator, i, com.google.android.gms.ads.internal.zzv.zzr().zzm(this.zzb), phoneType, zIsActiveNetworkMetered, i2);
    }
}
