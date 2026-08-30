package com.google.firebase.messaging.cpp;

/* JADX INFO: loaded from: classes5.dex */
public class ListenerService extends com.google.firebase.messaging.FirebaseMessagingService {
    public static final java.lang.String MESSAGE_TYPE_DELETED = "deleted_messages";
    public static final java.lang.String MESSAGE_TYPE_SEND_ERROR = "send_error";
    public static final java.lang.String MESSAGE_TYPE_SEND_EVENT = "send_event";
    private static final java.lang.String TAG = "FIREBASE_LISTENER";
    private final com.google.firebase.messaging.cpp.MessageWriter messageWriter;

    public ListenerService() {
        this(com.google.firebase.messaging.cpp.MessageWriter.defaultInstance());
    }

    public ListenerService(com.google.firebase.messaging.cpp.MessageWriter messageWriter) {
        this.messageWriter = messageWriter;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onDeletedMessages() {
        com.google.firebase.messaging.cpp.DebugLogging.log(TAG, "onDeletedMessages");
        this.messageWriter.writeMessageEventToInternalStorage(this, null, "deleted_messages", null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        this.messageWriter.writeMessage(this, remoteMessage, false, null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageSent(java.lang.String str) {
        com.google.firebase.messaging.cpp.DebugLogging.log(TAG, java.lang.String.format("onMessageSent messageId=%s", str));
        this.messageWriter.writeMessageEventToInternalStorage(this, str, "send_event", null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onSendError(java.lang.String str, java.lang.Exception exc) {
        com.google.firebase.messaging.cpp.DebugLogging.log(TAG, java.lang.String.format("onSendError messageId=%s exception=%s", str, exc.toString()));
        this.messageWriter.writeMessageEventToInternalStorage(this, str, "send_error", exc.toString());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(java.lang.String str) {
        com.google.firebase.messaging.cpp.DebugLogging.log(TAG, java.lang.String.format("onNewToken token=%s", str));
        com.google.firebase.messaging.cpp.RegistrationIntentService.writeTokenToInternalStorage(this, str);
    }
}
