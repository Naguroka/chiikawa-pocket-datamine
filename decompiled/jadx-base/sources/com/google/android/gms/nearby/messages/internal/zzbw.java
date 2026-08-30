package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbw implements com.google.android.gms.nearby.messages.Messages {
    public static final com.google.android.gms.nearby.messages.internal.zzbw zza = new com.google.android.gms.nearby.messages.internal.zzbw();
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.nearby.messages.internal.zzai> zzb = new com.google.android.gms.common.api.Api.ClientKey<>();
    public static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.nearby.messages.internal.zzai, com.google.android.gms.nearby.messages.MessagesOptions> zzc = new com.google.android.gms.nearby.messages.internal.zzbi();

    private zzbw() {
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> getPermissionStatus(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new com.google.android.gms.nearby.messages.internal.zzbp(this, googleApiClient));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final void handleIntent(android.content.Intent intent, com.google.android.gms.nearby.messages.MessageListener messageListener) {
        com.google.android.gms.internal.nearby.zzho.zzc(intent, messageListener);
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> publish(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.Message message) {
        com.google.android.gms.nearby.messages.PublishOptions publishOptions = com.google.android.gms.nearby.messages.PublishOptions.DEFAULT;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(message);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(publishOptions);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderRegisterListener = publishOptions.getCallback() == null ? null : googleApiClient.registerListener(publishOptions.getCallback());
        return googleApiClient.execute(new com.google.android.gms.nearby.messages.internal.zzbj(this, googleApiClient, message, listenerHolderRegisterListener != null ? new com.google.android.gms.nearby.messages.internal.zzbs(listenerHolderRegisterListener) : null, publishOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> registerStatusCallback(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.StatusCallback statusCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(statusCallback);
        return googleApiClient.execute(new com.google.android.gms.nearby.messages.internal.zzbq(this, googleApiClient, googleApiClient.registerListener(statusCallback)));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions = com.google.android.gms.nearby.messages.SubscribeOptions.DEFAULT;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(subscribeOptions);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderRegisterListener = subscribeOptions.getCallback() == null ? null : googleApiClient.registerListener(subscribeOptions.getCallback());
        return googleApiClient.execute(new com.google.android.gms.nearby.messages.internal.zzbm(this, googleApiClient, pendingIntent, listenerHolderRegisterListener != null ? new com.google.android.gms.nearby.messages.internal.zzbv(listenerHolderRegisterListener) : null, subscribeOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unpublish(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.Message message) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(message);
        return googleApiClient.execute(new com.google.android.gms.nearby.messages.internal.zzbk(this, googleApiClient, message));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unregisterStatusCallback(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.StatusCallback statusCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(statusCallback);
        return googleApiClient.execute(new com.google.android.gms.nearby.messages.internal.zzbh(this, googleApiClient, googleApiClient.registerListener(statusCallback)));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        return googleApiClient.execute(new com.google.android.gms.nearby.messages.internal.zzbo(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.MessageListener messageListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(messageListener);
        return googleApiClient.execute(new com.google.android.gms.nearby.messages.internal.zzbn(this, googleApiClient, googleApiClient.registerListener(messageListener)));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> publish(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.Message message, com.google.android.gms.nearby.messages.PublishOptions publishOptions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(message);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(publishOptions);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderRegisterListener = publishOptions.getCallback() == null ? null : googleApiClient.registerListener(publishOptions.getCallback());
        return googleApiClient.execute(new com.google.android.gms.nearby.messages.internal.zzbj(this, googleApiClient, message, listenerHolderRegisterListener != null ? new com.google.android.gms.nearby.messages.internal.zzbs(listenerHolderRegisterListener) : null, publishOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(subscribeOptions);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderRegisterListener = subscribeOptions.getCallback() == null ? null : googleApiClient.registerListener(subscribeOptions.getCallback());
        return googleApiClient.execute(new com.google.android.gms.nearby.messages.internal.zzbm(this, googleApiClient, pendingIntent, listenerHolderRegisterListener != null ? new com.google.android.gms.nearby.messages.internal.zzbv(listenerHolderRegisterListener) : null, subscribeOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.MessageListener messageListener) {
        com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions = com.google.android.gms.nearby.messages.SubscribeOptions.DEFAULT;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(messageListener);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(subscribeOptions);
        com.google.android.gms.common.internal.Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderRegisterListener = googleApiClient.registerListener(messageListener);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderRegisterListener2 = subscribeOptions.getCallback() == null ? null : googleApiClient.registerListener(subscribeOptions.getCallback());
        return googleApiClient.execute(new com.google.android.gms.nearby.messages.internal.zzbl(this, googleApiClient, listenerHolderRegisterListener, listenerHolderRegisterListener2 != null ? new com.google.android.gms.nearby.messages.internal.zzbv(listenerHolderRegisterListener2) : null, subscribeOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.MessageListener messageListener, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(messageListener);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(subscribeOptions);
        com.google.android.gms.common.internal.Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderRegisterListener = googleApiClient.registerListener(messageListener);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderRegisterListener2 = subscribeOptions.getCallback() == null ? null : googleApiClient.registerListener(subscribeOptions.getCallback());
        return googleApiClient.execute(new com.google.android.gms.nearby.messages.internal.zzbl(this, googleApiClient, listenerHolderRegisterListener, listenerHolderRegisterListener2 != null ? new com.google.android.gms.nearby.messages.internal.zzbv(listenerHolderRegisterListener2) : null, subscribeOptions));
    }
}
