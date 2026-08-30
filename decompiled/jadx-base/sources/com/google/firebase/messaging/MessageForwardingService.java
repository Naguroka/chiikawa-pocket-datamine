package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
public class MessageForwardingService extends androidx.core.app.JobIntentService {
    public static final java.lang.String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    private static final java.lang.String TAG = "FIREBASE_MSG_FWDR";

    public static void enqueueWork(android.content.Context context, android.content.Intent intent) {
        enqueueWork(context, (java.lang.Class<?>) com.google.firebase.messaging.MessageForwardingService.class, 1000, intent);
    }

    @Override // androidx.core.app.JobIntentService
    protected void onHandleWork(android.content.Intent intent) {
        handleIntent(this, intent, com.google.firebase.messaging.cpp.MessageWriter.defaultInstance());
    }

    static void handleIntent(android.content.Context context, android.content.Intent intent, com.google.firebase.messaging.cpp.MessageWriter messageWriter) {
        java.lang.String action;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onHandleIntent ");
        if (intent == null) {
            action = "null intent";
        } else {
            action = intent.getAction() == null ? "(null)" : intent.getAction();
        }
        com.google.firebase.messaging.cpp.DebugLogging.log(TAG, sb.append(action).toString());
        if (intent == null || intent.getAction() == null || !intent.getAction().equals(ACTION_REMOTE_INTENT)) {
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        com.google.firebase.messaging.cpp.DebugLogging.log(TAG, "extras: " + (extras != null ? extras.toString() : "(null)"));
        if (extras != null) {
            com.google.firebase.messaging.RemoteMessage remoteMessage = new com.google.firebase.messaging.RemoteMessage(extras);
            com.google.firebase.messaging.cpp.DebugLogging.log(TAG, "message: " + remoteMessage.toString());
            if (remoteMessage.getFrom() == null || remoteMessage.getMessageId() == null) {
                return;
            }
            messageWriter.writeMessage(context, remoteMessage, true, intent.getData());
        }
    }
}
