package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseMessagingService extends com.google.firebase.messaging.EnhancedIntentService {
    public static final java.lang.String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final java.lang.String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final java.lang.String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final java.lang.String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final java.util.Queue<java.lang.String> recentlyReceivedMessageIds = new java.util.ArrayDeque(10);
    private com.google.android.gms.cloudmessaging.Rpc rpc;

    public void onDeletedMessages() {
    }

    public void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }

    @java.lang.Deprecated
    public void onMessageSent(java.lang.String str) {
    }

    public void onNewToken(java.lang.String str) {
    }

    @java.lang.Deprecated
    public void onSendError(java.lang.String str, java.lang.Exception exc) {
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    protected android.content.Intent getStartCommandIntent(android.content.Intent intent) {
        return com.google.firebase.messaging.ServiceStarter.getInstance().getMessagingEvent();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra("token"));
        } else {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Unknown intent action: " + intent.getAction());
        }
    }

    private void handleMessageIntent(android.content.Intent intent) {
        if (!alreadyReceivedMessage(intent.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID))) {
            passMessageIntentToSdk(intent);
        }
        getRpc(this).messageHandled(new com.google.android.gms.cloudmessaging.CloudMessage(intent));
    }

    private void passMessageIntentToSdk(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE);
        if (stringExtra == null) {
            stringExtra = com.google.firebase.messaging.Constants.MessageTypes.MESSAGE;
        }
        stringExtra.hashCode();
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                com.google.firebase.messaging.MessagingAnalytics.logNotificationReceived(intent);
                dispatchMessage(intent);
                break;
            case "send_error":
                onSendError(getMessageId(intent), new com.google.firebase.messaging.SendException(intent.getStringExtra("error")));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID));
                break;
            default:
                android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    private void dispatchMessage(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new android.os.Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (com.google.firebase.messaging.NotificationParams.isNotification(extras)) {
            com.google.firebase.messaging.NotificationParams notificationParams = new com.google.firebase.messaging.NotificationParams(extras);
            java.util.concurrent.ExecutorService executorServiceNewNetworkIOExecutor = com.google.firebase.messaging.FcmExecutors.newNetworkIOExecutor();
            try {
                if (new com.google.firebase.messaging.DisplayNotification(this, notificationParams, executorServiceNewNetworkIOExecutor).handleNotification()) {
                    executorServiceNewNetworkIOExecutor.shutdown();
                    return;
                } else {
                    executorServiceNewNetworkIOExecutor.shutdown();
                    if (com.google.firebase.messaging.MessagingAnalytics.shouldUploadScionMetrics(intent)) {
                        com.google.firebase.messaging.MessagingAnalytics.logNotificationForeground(intent);
                    }
                }
            } catch (java.lang.Throwable th) {
                executorServiceNewNetworkIOExecutor.shutdown();
                throw th;
            }
        }
        onMessageReceived(new com.google.firebase.messaging.RemoteMessage(extras));
    }

    private boolean alreadyReceivedMessage(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        java.util.Queue<java.lang.String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            if (!android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
                return true;
            }
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Received duplicate message: " + str);
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private java.lang.String getMessageId(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID);
        return stringExtra == null ? intent.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER) : stringExtra;
    }

    private com.google.android.gms.cloudmessaging.Rpc getRpc(android.content.Context context) {
        if (this.rpc == null) {
            this.rpc = new com.google.android.gms.cloudmessaging.Rpc(context.getApplicationContext());
        }
        return this.rpc;
    }

    static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    void setRpcForTesting(com.google.android.gms.cloudmessaging.Rpc rpc) {
        this.rpc = rpc;
    }
}
