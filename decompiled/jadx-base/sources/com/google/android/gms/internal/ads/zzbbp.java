package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbbp {
    com.google.android.gms.internal.ads.zzayf zza;
    boolean zzb;
    private final java.util.concurrent.ExecutorService zzc;

    public zzbbp() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    public zzbbp(final android.content.Context context) {
        java.util.concurrent.ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbbk
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeW)).booleanValue();
                com.google.android.gms.internal.ads.zzbbp zzbbpVar = this.zza;
                android.content.Context context2 = context;
                if (zBooleanValue) {
                    try {
                        zzbbpVar.zza = (com.google.android.gms.internal.ads.zzayf) com.google.android.gms.ads.internal.util.client.zzs.zzb(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbbl
                            @Override // com.google.android.gms.ads.internal.util.client.zzq
                            public final java.lang.Object zza(java.lang.Object obj) {
                                return com.google.android.gms.internal.ads.zzaye.zzb((android.os.IBinder) obj);
                            }
                        });
                        zzbbpVar.zza.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzbbpVar.zzb = true;
                    } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
