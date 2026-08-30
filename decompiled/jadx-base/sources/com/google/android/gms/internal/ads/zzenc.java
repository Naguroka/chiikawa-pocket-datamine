package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzenc implements com.google.android.gms.internal.ads.zzetr {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.internal.ads.zzbzm zzb;

    zzenc(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzbzm zzbzmVar) {
        this.zza = executor;
        this.zzb = zzbzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcW)).booleanValue() ? com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzend(null)) : com.google.android.gms.internal.ads.zzgch.zzm(this.zzb.zzk(), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzenb
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new com.google.android.gms.internal.ads.zzend(arrayList);
            }
        }, this.zza);
    }
}
