package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcc implements android.content.ServiceConnection {
    final /* synthetic */ com.android.billingclient.api.zzce zza;

    /* synthetic */ zzcc(com.android.billingclient.api.zzce zzceVar, com.android.billingclient.api.zzcd zzcdVar) {
        java.util.Objects.requireNonNull(zzceVar);
        this.zza = zzceVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Billing Override Service connected.");
        com.android.billingclient.api.zzce zzceVar = this.zza;
        zzceVar.zzc = com.google.android.gms.internal.play_billing.zzat.zzc(iBinder);
        zzceVar.zzb = 2;
        zzceVar.zzaG(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service disconnected.");
        com.android.billingclient.api.zzce zzceVar = this.zza;
        zzceVar.zzc = null;
        zzceVar.zzb = 0;
    }
}
