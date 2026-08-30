package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbow {
    private static com.google.android.gms.internal.ads.zzbow zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean(false);

    zzbow() {
    }

    public static com.google.android.gms.internal.ads.zzbow zza() {
        if (zza == null) {
            zza = new com.google.android.gms.internal.ads.zzbow();
        }
        return zza;
    }

    public final java.lang.Thread zzb(final android.content.Context context, final java.lang.String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbov
            @Override // java.lang.Runnable
            public final void run() {
                android.content.Context context2 = context;
                com.google.android.gms.internal.ads.zzbcl.zza(context2);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaG)).booleanValue()) {
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("measurementEnabled", ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzav)).booleanValue());
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaC)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((com.google.android.gms.internal.ads.zzcgw) com.google.android.gms.ads.internal.util.client.zzs.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbou
                        @Override // com.google.android.gms.ads.internal.util.client.zzq
                        public final java.lang.Object zza(java.lang.Object obj) {
                            return com.google.android.gms.internal.ads.zzcgv.zzb((android.os.IBinder) obj);
                        }
                    })).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context2), new com.google.android.gms.internal.ads.zzbot(com.google.android.gms.measurement.api.AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str, bundle)));
                } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
