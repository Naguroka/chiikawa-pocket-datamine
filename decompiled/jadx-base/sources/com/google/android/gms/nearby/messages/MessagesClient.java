package com.google.android.gms.nearby.messages;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface MessagesClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.nearby.messages.MessagesOptions> {
    void handleIntent(android.content.Intent intent, com.google.android.gms.nearby.messages.MessageListener messageListener);

    com.google.android.gms.tasks.Task<java.lang.Void> publish(com.google.android.gms.nearby.messages.Message message);

    com.google.android.gms.tasks.Task<java.lang.Void> publish(com.google.android.gms.nearby.messages.Message message, com.google.android.gms.nearby.messages.PublishOptions publishOptions);

    com.google.android.gms.tasks.Task<java.lang.Void> registerStatusCallback(com.google.android.gms.nearby.messages.StatusCallback statusCallback);

    com.google.android.gms.tasks.Task<java.lang.Void> subscribe(android.app.PendingIntent pendingIntent);

    com.google.android.gms.tasks.Task<java.lang.Void> subscribe(android.app.PendingIntent pendingIntent, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions);

    com.google.android.gms.tasks.Task<java.lang.Void> subscribe(com.google.android.gms.nearby.messages.MessageListener messageListener);

    com.google.android.gms.tasks.Task<java.lang.Void> subscribe(com.google.android.gms.nearby.messages.MessageListener messageListener, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions);

    com.google.android.gms.tasks.Task<java.lang.Void> unpublish(com.google.android.gms.nearby.messages.Message message);

    com.google.android.gms.tasks.Task<java.lang.Void> unregisterStatusCallback(com.google.android.gms.nearby.messages.StatusCallback statusCallback);

    com.google.android.gms.tasks.Task<java.lang.Void> unsubscribe(android.app.PendingIntent pendingIntent);

    com.google.android.gms.tasks.Task<java.lang.Void> unsubscribe(com.google.android.gms.nearby.messages.MessageListener messageListener);
}
