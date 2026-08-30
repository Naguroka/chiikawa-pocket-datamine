package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbn extends com.google.android.gms.internal.play_billing.zzan {
    final java.lang.ref.WeakReference zza;
    final android.os.ResultReceiver zzb;

    /* synthetic */ zzbn(java.lang.ref.WeakReference weakReference, android.os.ResultReceiver resultReceiver, com.android.billingclient.api.zzbp zzbpVar) {
        this.zza = weakReference;
        this.zzb = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzao
    public final void zza(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.ResultReceiver resultReceiver = this.zzb;
        if (resultReceiver == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        android.app.Activity activity = (android.app.Activity) this.zza.get();
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            resultReceiver.send(0, null);
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.android.billingclient.api.ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", resultReceiver);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (java.util.concurrent.CancellationException e) {
            this.zzb.send(0, null);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception caught while launching intent for in-app messaging.", e);
        }
    }
}
