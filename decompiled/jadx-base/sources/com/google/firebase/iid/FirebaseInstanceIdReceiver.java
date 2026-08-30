package com.google.firebase.iid;

/* JADX INFO: loaded from: classes5.dex */
public final class FirebaseInstanceIdReceiver extends com.google.android.gms.cloudmessaging.CloudMessagingReceiver {
    private static final java.lang.String TAG = "FirebaseMessaging";

    private static android.content.Intent createServiceIntent(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        return new android.content.Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    protected int onMessageReceive(android.content.Context context, com.google.android.gms.cloudmessaging.CloudMessage cloudMessage) {
        try {
            return ((java.lang.Integer) com.google.android.gms.tasks.Tasks.await(new com.google.firebase.messaging.FcmBroadcastProcessor(context).process(cloudMessage.getIntent()))).intValue();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            android.util.Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    protected void onNotificationDismissed(android.content.Context context, android.os.Bundle bundle) {
        android.content.Intent intentCreateServiceIntent = createServiceIntent(context, com.google.android.gms.cloudmessaging.CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS, bundle);
        if (com.google.firebase.messaging.MessagingAnalytics.shouldUploadScionMetrics(intentCreateServiceIntent)) {
            com.google.firebase.messaging.MessagingAnalytics.logNotificationDismiss(intentCreateServiceIntent);
        }
    }
}
