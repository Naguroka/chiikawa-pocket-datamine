package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcn {
    private boolean zza;
    private com.google.android.datatransport.Transport zzb;

    zzcn(android.content.Context context) {
        try {
            com.google.android.datatransport.runtime.TransportRuntime.initialize(context);
            this.zzb = com.google.android.datatransport.runtime.TransportRuntime.getInstance().newFactory(com.google.android.datatransport.cct.CCTDestination.INSTANCE).getTransport("PLAY_BILLING_LIBRARY", com.google.android.gms.internal.play_billing.zzji.class, com.google.android.datatransport.Encoding.of("proto"), new com.google.android.datatransport.Transformer() { // from class: com.android.billingclient.api.zzcm
                @Override // com.google.android.datatransport.Transformer
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ((com.google.android.gms.internal.play_billing.zzji) obj).zzM();
                }
            });
        } catch (java.lang.Throwable unused) {
            this.zza = true;
        }
    }

    public final void zza(com.google.android.gms.internal.play_billing.zzji zzjiVar) {
        if (this.zza) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.zzb.send(com.google.android.datatransport.Event.ofData(zzjiVar));
        } catch (java.lang.Throwable unused) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingLogger", "logging failed.");
        }
    }
}
