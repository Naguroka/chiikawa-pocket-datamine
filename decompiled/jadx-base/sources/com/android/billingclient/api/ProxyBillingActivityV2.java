package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyBillingActivityV2 extends androidx.activity.ComponentActivity {
    private androidx.activity.result.ActivityResultLauncher zza;
    private androidx.activity.result.ActivityResultLauncher zzb;
    private androidx.activity.result.ActivityResultLauncher zzc;
    private android.os.ResultReceiver zzd;
    private android.os.ResultReceiver zze;
    private android.os.ResultReceiver zzf;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zza = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult(), new androidx.activity.result.ActivityResultCallback() { // from class: com.android.billingclient.api.zzct
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                this.zza.zza((androidx.activity.result.ActivityResult) obj);
            }
        });
        this.zzb = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult(), new androidx.activity.result.ActivityResultCallback() { // from class: com.android.billingclient.api.zzcu
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                this.zza.zzb((androidx.activity.result.ActivityResult) obj);
            }
        });
        this.zzc = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult(), new androidx.activity.result.ActivityResultCallback() { // from class: com.android.billingclient.api.zzcv
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                this.zza.zzc((androidx.activity.result.ActivityResult) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.zzd = (android.os.ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.zze = (android.os.ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.zzf = (android.os.ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzc.zzm("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.zzd = (android.os.ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.zza.launch(new androidx.activity.result.IntentSenderRequest.Builder(pendingIntent).build());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.zze = (android.os.ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.zzb.launch(new androidx.activity.result.IntentSenderRequest.Builder(pendingIntent2).build());
        } else if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            android.app.PendingIntent pendingIntent3 = (android.app.PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.zzf = (android.os.ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.zzc.launch(new androidx.activity.result.IntentSenderRequest.Builder(pendingIntent3).build());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        android.os.ResultReceiver resultReceiver = this.zzd;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        android.os.ResultReceiver resultReceiver2 = this.zze;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        android.os.ResultReceiver resultReceiver3 = this.zzf;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }

    final void zza(androidx.activity.result.ActivityResult activityResult) {
        android.content.Intent data = activityResult.getData();
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzh(data, "ProxyBillingActivityV2").getResponseCode();
        android.os.ResultReceiver resultReceiver = this.zzd;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + responseCode);
        }
        finish();
    }

    final void zzb(androidx.activity.result.ActivityResult activityResult) {
        android.content.Intent data = activityResult.getData();
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzh(data, "ProxyBillingActivityV2").getResponseCode();
        android.os.ResultReceiver resultReceiver = this.zze;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", java.lang.String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", java.lang.Integer.valueOf(activityResult.getResultCode()), java.lang.Integer.valueOf(responseCode)));
        }
        finish();
    }

    final void zzc(androidx.activity.result.ActivityResult activityResult) {
        android.content.Intent data = activityResult.getData();
        android.os.Bundle extras = data == null ? null : data.getExtras();
        if (activityResult.getResultCode() != -1) {
            if (extras == null) {
                extras = new android.os.Bundle();
            }
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", java.lang.String.format("External offer flow finished with resultCode: %s", java.lang.Integer.valueOf(activityResult.getResultCode())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", com.google.android.gms.internal.play_billing.zzie.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", java.lang.String.format("External offer flow finished with error resultCode: %s", java.lang.Integer.valueOf(activityResult.getResultCode())));
        }
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzh(data, "ProxyBillingActivityV2").getResponseCode();
        android.os.ResultReceiver resultReceiver = this.zzf;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, extras);
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", java.lang.String.format("External offer flow finished with billing responseCode: %s", java.lang.Integer.valueOf(responseCode)));
        }
        finish();
    }
}
