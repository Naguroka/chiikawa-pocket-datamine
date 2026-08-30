package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzax extends android.os.ResultReceiver {
    final /* synthetic */ com.android.billingclient.api.InAppMessageResponseListener zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzax(com.android.billingclient.api.BillingClientImpl billingClientImpl, android.os.Handler handler, com.android.billingclient.api.InAppMessageResponseListener inAppMessageResponseListener) {
        super(handler);
        this.zza = inAppMessageResponseListener;
        java.util.Objects.requireNonNull(billingClientImpl);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, android.os.Bundle bundle) {
        this.zza.onInAppMessageResponse(com.google.android.gms.internal.play_billing.zzc.zzi(bundle, "BillingClient"));
    }
}
