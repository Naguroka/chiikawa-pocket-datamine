package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzewl implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;

    public zzewl(com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        this.zza = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzewk
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.util.HashMap map = new java.util.HashMap();
                java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzW);
                if (str != null && !str.isEmpty()) {
                    if (android.os.Build.VERSION.SDK_INT >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzX)).intValue()) {
                        for (java.lang.String str2 : str.split(",", -1)) {
                            map.put(str2, com.google.android.gms.ads.internal.util.zzcj.zza(str2));
                        }
                    }
                }
                return new com.google.android.gms.internal.ads.zzewm(map);
            }
        });
    }
}
