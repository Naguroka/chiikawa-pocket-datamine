package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfnt {
    private final android.content.Context zza;
    private final android.os.Looper zzb;

    public zzfnt(android.content.Context context, android.os.Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(java.lang.String str) {
        com.google.android.gms.internal.ads.zzfog zzfogVarZza = com.google.android.gms.internal.ads.zzfoj.zza();
        zzfogVarZza.zza(this.zza.getPackageName());
        zzfogVarZza.zzc(2);
        com.google.android.gms.internal.ads.zzfod zzfodVarZza = com.google.android.gms.internal.ads.zzfof.zza();
        zzfodVarZza.zza(str);
        zzfodVarZza.zzb(2);
        zzfogVarZza.zzb(zzfodVarZza);
        new com.google.android.gms.internal.ads.zzfnu(this.zza, this.zzb, (com.google.android.gms.internal.ads.zzfoj) zzfogVarZza.zzbr()).zza();
    }
}
