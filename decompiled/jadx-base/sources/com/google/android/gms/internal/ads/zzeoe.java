package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeoe implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzeym zza;

    zzeoe(com.google.android.gms.internal.ads.zzeym zzeymVar) {
        this.zza = zzeymVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        com.google.android.gms.internal.ads.zzeym zzeymVar = this.zza;
        if (zzeymVar == null) {
            return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzeod(null));
        }
        java.lang.String strZza = zzeymVar.zza();
        return com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(strZza) ? com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzeod(null)) : com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzeod(strZza));
    }
}
