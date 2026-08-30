package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyBillingActivity extends android.app.Activity {
    private static final java.lang.String KEY_ACTIVITY_CODE = "activity_code";
    static final java.lang.String KEY_IN_APP_MESSAGE_RESULT_RECEIVER = "in_app_message_result_receiver";
    private static final java.lang.String KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED = "send_cancelled_broadcast_if_finished";
    private static final int REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW = 110;
    private static final int REQUEST_CODE_IN_APP_MESSAGE_FLOW = 101;
    private static final int REQUEST_CODE_LAUNCH_ACTIVITY = 100;
    private static final int RESULT_CODE_PLAY_CANCELED_WITH_ON_CREATE_RUNTIME_EXCEPTION = 5;
    static final int RESULT_CODE_PLAY_CANCELLED = 3;
    static final int RESULT_CODE_PLAY_CANCELLED_WITHOUT_COMPLETE_ACTION = 4;
    private static final java.lang.String TAG = "ProxyBillingActivity";
    private int activityCode;
    private long billingClientTransactionId;
    private android.os.ResultReceiver inAppMessageResultReceiver;
    private boolean isFlowFromFirstPartyClient;
    private boolean sendCancelledBroadcastIfFinished;
    private boolean wasServiceAutoReconnected;

    private com.google.android.gms.internal.play_billing.zzie getReasonForNullData(int i) {
        if (i == -1) {
            return com.google.android.gms.internal.play_billing.zzie.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i == 0) {
            return com.google.android.gms.internal.play_billing.zzie.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i == 3) {
            return com.google.android.gms.internal.play_billing.zzie.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
        }
        if (i != 4) {
            return i != 5 ? com.google.android.gms.internal.play_billing.zzie.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : com.google.android.gms.internal.play_billing.zzie.NULL_DATA_WITH_ON_CREATE_RUNTIME_EXCEPTION_RESULT_CODE;
        }
        return com.google.android.gms.internal.play_billing.zzie.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
    }

    private android.content.Intent makeAlternativeBillingIntent(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private android.content.Intent makePurchaseUpdatedIntentWithInternalErrorReason(com.google.android.gms.internal.play_billing.zzie zzieVar, long j) {
        android.content.Intent intentMakePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
        intentMakePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 6);
        intentMakePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        com.android.billingclient.api.BillingResult.Builder builderNewBuilder = com.android.billingclient.api.BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(6);
        builderNewBuilder.setDebugMessage("An internal error occurred.");
        com.android.billingclient.api.BillingResult billingResultBuild = builderNewBuilder.build();
        int i = com.android.billingclient.api.zzcg.zza;
        intentMakePurchasesUpdatedIntent.putExtra("FAILURE_LOGGING_PAYLOAD", com.android.billingclient.api.zzcg.zzb(zzieVar, 2, billingResultBuild, null, com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED).zzM());
        intentMakePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentMakePurchasesUpdatedIntent.putExtra("billingClientTransactionId", j);
        intentMakePurchasesUpdatedIntent.putExtra("wasServiceAutoReconnected", this.wasServiceAutoReconnected);
        return intentMakePurchasesUpdatedIntent;
    }

    private android.content.Intent makePurchasesUpdatedIntent() {
        android.content.Intent intent = new android.content.Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        android.content.Intent intentMakePurchaseUpdatedIntentWithInternalErrorReason;
        super.onActivityResult(i, i2, intent);
        if (i == 100 || i == 110) {
            int responseCode = com.google.android.gms.internal.play_billing.zzc.zzh(intent, TAG).getResponseCode();
            int i3 = -1;
            if (i2 != -1) {
                com.google.android.gms.internal.play_billing.zzc.zzn(TAG, "Activity finished with resultCode " + i2 + " and billing's responseCode: " + responseCode);
                i3 = i2;
            } else if (responseCode != 0) {
                i2 = -1;
                com.google.android.gms.internal.play_billing.zzc.zzn(TAG, "Activity finished with resultCode " + i2 + " and billing's responseCode: " + responseCode);
                i3 = i2;
            }
            if (intent == null) {
                com.google.android.gms.internal.play_billing.zzc.zzn(TAG, "Got null data with resultCode " + i3 + "!");
                intentMakePurchaseUpdatedIntentWithInternalErrorReason = makePurchaseUpdatedIntentWithInternalErrorReason(getReasonForNullData(i3), this.billingClientTransactionId);
            } else if (intent.getExtras() != null) {
                java.lang.String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    intentMakePurchaseUpdatedIntentWithInternalErrorReason = makeAlternativeBillingIntent(string);
                    intentMakePurchaseUpdatedIntentWithInternalErrorReason.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    intentMakePurchaseUpdatedIntentWithInternalErrorReason = makePurchasesUpdatedIntent();
                    intentMakePurchaseUpdatedIntentWithInternalErrorReason.putExtras(intent.getExtras());
                    intentMakePurchaseUpdatedIntentWithInternalErrorReason.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentMakePurchaseUpdatedIntentWithInternalErrorReason.putExtra("billingClientTransactionId", this.billingClientTransactionId);
                intentMakePurchaseUpdatedIntentWithInternalErrorReason.putExtra("wasServiceAutoReconnected", this.wasServiceAutoReconnected);
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn(TAG, "Got null bundle!");
                intentMakePurchaseUpdatedIntentWithInternalErrorReason = makePurchaseUpdatedIntentWithInternalErrorReason(com.google.android.gms.internal.play_billing.zzie.NULL_BUNDLE_IN_ACTIVITY_RESULT, this.billingClientTransactionId);
            }
            if (i == 110) {
                intentMakePurchaseUpdatedIntentWithInternalErrorReason.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentMakePurchaseUpdatedIntentWithInternalErrorReason);
        } else if (i == 101) {
            int iZza = com.google.android.gms.internal.play_billing.zzc.zza(intent, TAG);
            android.os.ResultReceiver resultReceiver = this.inAppMessageResultReceiver;
            if (resultReceiver != null) {
                resultReceiver.send(iZza, intent == null ? null : intent.getExtras());
            }
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn(TAG, "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.sendCancelledBroadcastIfFinished = false;
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        android.app.PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.zzc.zzm(TAG, "Launching Play Store billing flow from savedInstanceState");
            this.sendCancelledBroadcastIfFinished = bundle.getBoolean(KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED, false);
            if (bundle.containsKey(KEY_IN_APP_MESSAGE_RESULT_RECEIVER)) {
                this.inAppMessageResultReceiver = (android.os.ResultReceiver) bundle.getParcelable(KEY_IN_APP_MESSAGE_RESULT_RECEIVER);
            }
            this.isFlowFromFirstPartyClient = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.activityCode = bundle.getInt(KEY_ACTIVITY_CODE, 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.billingClientTransactionId = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.wasServiceAutoReconnected = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzc.zzm(TAG, "Launching Play Store billing flow");
        this.activityCode = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (android.app.PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.isFlowFromFirstPartyClient = true;
                this.activityCode = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (android.app.PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.inAppMessageResultReceiver = (android.os.ResultReceiver) getIntent().getParcelableExtra(KEY_IN_APP_MESSAGE_RESULT_RECEIVER);
            this.activityCode = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.billingClientTransactionId = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.wasServiceAutoReconnected = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.sendCancelledBroadcastIfFinished = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.activityCode, new android.content.Intent(), 0, 0, 0);
        } catch (android.content.IntentSender.SendIntentException e) {
            com.google.android.gms.internal.play_billing.zzc.zzo(TAG, "Got exception while trying to start a purchase flow.", e);
            android.os.ResultReceiver resultReceiver = this.inAppMessageResultReceiver;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                android.content.Intent intentMakePurchaseUpdatedIntentWithInternalErrorReason = makePurchaseUpdatedIntentWithInternalErrorReason(com.google.android.gms.internal.play_billing.zzie.INTENT_SENDER_EXCEPTION, this.billingClientTransactionId);
                if (this.isFlowFromFirstPartyClient) {
                    intentMakePurchaseUpdatedIntentWithInternalErrorReason.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentMakePurchaseUpdatedIntentWithInternalErrorReason);
            }
            this.sendCancelledBroadcastIfFinished = false;
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.sendCancelledBroadcastIfFinished) {
            android.content.Intent intentMakePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
            intentMakePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 1);
            intentMakePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.isFlowFromFirstPartyClient) {
                intentMakePurchasesUpdatedIntent.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.activityCode;
            if (i == 110 || i == 100) {
                intentMakePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentMakePurchasesUpdatedIntent.putExtra("billingClientTransactionId", this.billingClientTransactionId);
            }
            sendBroadcast(intentMakePurchasesUpdatedIntent);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        android.os.ResultReceiver resultReceiver = this.inAppMessageResultReceiver;
        if (resultReceiver != null) {
            bundle.putParcelable(KEY_IN_APP_MESSAGE_RESULT_RECEIVER, resultReceiver);
        }
        bundle.putBoolean(KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED, this.sendCancelledBroadcastIfFinished);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.isFlowFromFirstPartyClient);
        bundle.putInt(KEY_ACTIVITY_CODE, this.activityCode);
        bundle.putLong("billingClientTransactionId", this.billingClientTransactionId);
        bundle.putBoolean("wasServiceAutoReconnected", this.wasServiceAutoReconnected);
    }
}
