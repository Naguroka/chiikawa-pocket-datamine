package com.google.android.gms.nearby.messages;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public interface Messages {
    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> getPermissionStatus(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    void handleIntent(android.content.Intent intent, com.google.android.gms.nearby.messages.MessageListener messageListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> publish(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.Message message);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> publish(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.Message message, com.google.android.gms.nearby.messages.PublishOptions publishOptions);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> registerStatusCallback(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.StatusCallback statusCallback);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.MessageListener messageListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.MessageListener messageListener, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unpublish(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.Message message);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unregisterStatusCallback(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.StatusCallback statusCallback);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.MessageListener messageListener);
}
