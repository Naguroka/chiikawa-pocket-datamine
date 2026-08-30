package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbk extends com.google.android.gms.internal.play_billing.zzae {
    final java.lang.ref.WeakReference zza;
    final android.os.ResultReceiver zzb;

    /* synthetic */ zzbk(java.lang.ref.WeakReference weakReference, android.os.ResultReceiver resultReceiver, com.android.billingclient.api.zzbp zzbpVar) {
        this.zza = weakReference;
        this.zzb = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public final void zza(android.os.Bundle bundle) throws android.os.RemoteException {
        if (bundle == null) {
            this.zzb.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Response bundle doesn't contain a response code");
            this.zzb.send(6, bundle);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unable to launch intent for external offer dialog" + iZzb);
            this.zzb.send(iZzb, bundle);
            return;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "The PendingIntent for the external offer dialog is null");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            this.zzb.send(6, bundle2);
            return;
        }
        try {
            android.app.Activity activity = (android.app.Activity) this.zza.get();
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.android.billingclient.api.ProxyBillingActivityV2.class);
            intent.putExtra("external_payment_dialog_result_receiver", this.zzb);
            intent.putExtra("external_payment_dialog_pending_intent", pendingIntent);
            activity.startActivity(intent);
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Runtime error while launching intent for the external offer dialog.", e);
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt("RESPONSE_CODE", 6);
            bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle3.putInt("INTERNAL_LOG_ERROR_REASON", com.google.android.gms.internal.play_billing.zzie.RUNTIME_EXCEPTION_ON_LAUNCHING_EXTERNAL_PAYMENT_DIALOG_INTENT.zza());
            bundle3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", java.lang.String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzbj.zzb(e.getMessage())));
            this.zzb.send(6, bundle3);
        }
    }
}
