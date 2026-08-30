package com.google.firebase;

/* JADX INFO: loaded from: classes5.dex */
public class MessagingUnityPlayerActivity extends com.unity3d.player.UnityPlayerActivity {
    private static final java.lang.String EXTRA_FROM = "google.message_id";
    private static final java.lang.String EXTRA_MESSAGE_ID_KEY = "google.message_id";
    private static final java.lang.String EXTRA_MESSAGE_ID_KEY_SERVER = "message_id";

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        java.lang.String string = extras.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID);
        java.lang.String string2 = extras.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID);
        if (string2 == null) {
            string2 = extras.getString("message_id");
        }
        if (string != null && string2 != null) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.google.firebase.messaging.MessageForwardingService.class);
            intent2.setAction(com.google.firebase.messaging.MessageForwardingService.ACTION_REMOTE_INTENT);
            intent2.putExtras(intent);
            intent2.setData(intent.getData());
            com.google.firebase.messaging.MessageForwardingService.enqueueWork(this, intent2);
        }
        setIntent(intent);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        if (this.mUnityPlayer != null) {
            this.mUnityPlayer.quit();
            this.mUnityPlayer = null;
        }
        super.onCreate(bundle);
    }
}
