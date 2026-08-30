package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbg extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.nearby.messages.MessagesOptions> implements com.google.android.gms.nearby.messages.MessagesClient {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.nearby.messages.internal.zzai> zzb;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.nearby.messages.internal.zzai, com.google.android.gms.nearby.messages.MessagesOptions> zzc;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.nearby.messages.MessagesOptions> zzd;
    private final int zze;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.nearby.messages.internal.zzai> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zzb = clientKey;
        com.google.android.gms.nearby.messages.internal.zzav zzavVar = new com.google.android.gms.nearby.messages.internal.zzav();
        zzc = zzavVar;
        zzd = new com.google.android.gms.common.api.Api<>("Nearby.MESSAGES_API", zzavVar, clientKey);
    }

    public zzbg(android.app.Activity activity, com.google.android.gms.nearby.messages.MessagesOptions messagesOptions) {
        super(activity, zzd, messagesOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = 1;
        activity.getApplication().registerActivityLifecycleCallbacks(new com.google.android.gms.nearby.messages.internal.zzba(activity, this, null));
    }

    static /* synthetic */ void zzg(com.google.android.gms.nearby.messages.internal.zzbg zzbgVar, int i) {
        final int i2 = 1;
        zzbgVar.zzl(new com.google.android.gms.nearby.messages.internal.zzbb(i2) { // from class: com.google.android.gms.nearby.messages.internal.zzat
            @Override // com.google.android.gms.nearby.messages.internal.zzbb
            public final void zza(com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) throws android.os.RemoteException {
                int i3 = com.google.android.gms.nearby.messages.internal.zzbg.zza;
                zzaiVar.zzB(1);
            }
        }, 0);
    }

    private final <T> com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> zzh(com.google.android.gms.tasks.TaskCompletionSource<T> taskCompletionSource) {
        return registerListener(new com.google.android.gms.nearby.messages.internal.zzay(this, taskCompletionSource), com.google.android.gms.common.api.Status.class.getName());
    }

    private final <T> com.google.android.gms.tasks.Task<java.lang.Void> zzi(T t, int i) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(t, t.getClass().getName()), i).addOnCompleteListener(new com.google.android.gms.nearby.messages.internal.zzaz(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private final <T> com.google.android.gms.common.api.internal.ListenerHolder<T> zzj(T t) {
        if (t == null) {
            return null;
        }
        return (com.google.android.gms.common.api.internal.ListenerHolder<T>) registerListener(t, t.getClass().getName());
    }

    private final <T> com.google.android.gms.tasks.Task<java.lang.Void> zzk(com.google.android.gms.common.api.internal.ListenerHolder<T> listenerHolder, final com.google.android.gms.nearby.messages.internal.zzbb zzbbVar, final com.google.android.gms.nearby.messages.internal.zzbb zzbbVar2, int i) {
        return doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().withHolder(listenerHolder).register(new com.google.android.gms.common.api.internal.RemoteCall(this, zzbbVar) { // from class: com.google.android.gms.nearby.messages.internal.zzau
            private final com.google.android.gms.nearby.messages.internal.zzbg zza;
            private final com.google.android.gms.nearby.messages.internal.zzbb zzb;

            {
                this.zza = this;
                this.zzb = zzbbVar;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                this.zza.zzc(this.zzb, (com.google.android.gms.nearby.messages.internal.zzai) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).unregister(new com.google.android.gms.common.api.internal.RemoteCall(this, zzbbVar2) { // from class: com.google.android.gms.nearby.messages.internal.zzak
            private final com.google.android.gms.nearby.messages.internal.zzbg zza;
            private final com.google.android.gms.nearby.messages.internal.zzbb zzb;

            {
                this.zza = this;
                this.zzb = zzbbVar2;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                this.zza.zzb(this.zzb, (com.google.android.gms.nearby.messages.internal.zzai) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(i).build());
    }

    private final com.google.android.gms.tasks.Task<java.lang.Void> zzl(final com.google.android.gms.nearby.messages.internal.zzbb zzbbVar, int i) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(i).run(new com.google.android.gms.common.api.internal.RemoteCall(this, zzbbVar) { // from class: com.google.android.gms.nearby.messages.internal.zzal
            private final com.google.android.gms.nearby.messages.internal.zzbg zza;
            private final com.google.android.gms.nearby.messages.internal.zzbb zzb;

            {
                this.zza = this;
                this.zzb = zzbbVar;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                this.zza.zza(this.zzb, (com.google.android.gms.nearby.messages.internal.zzai) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).build());
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    protected final com.google.android.gms.common.internal.ClientSettings.Builder createClientSettingsBuilder() {
        com.google.android.gms.common.internal.ClientSettings.Builder builderCreateClientSettingsBuilder = super.createClientSettingsBuilder();
        if (getApiOptions() != null) {
            java.lang.String str = getApiOptions().zze;
        }
        return builderCreateClientSettingsBuilder;
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final void handleIntent(android.content.Intent intent, com.google.android.gms.nearby.messages.MessageListener messageListener) {
        com.google.android.gms.internal.nearby.zzho.zzc(intent, messageListener);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> publish(com.google.android.gms.nearby.messages.Message message) {
        com.google.android.gms.nearby.messages.PublishOptions publishOptions = com.google.android.gms.nearby.messages.PublishOptions.DEFAULT;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(message);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(publishOptions);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderZzj = zzj(message);
        return zzk(listenerHolderZzj, new com.google.android.gms.nearby.messages.internal.zzaj(this, message, new com.google.android.gms.nearby.messages.internal.zzaw(this, zzj(publishOptions.getCallback()), listenerHolderZzj), publishOptions), new com.google.android.gms.nearby.messages.internal.zzam(message), 1291);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> registerStatusCallback(com.google.android.gms.nearby.messages.StatusCallback statusCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(statusCallback);
        final com.google.android.gms.common.api.internal.ListenerHolder listenerHolderZzj = zzj(statusCallback);
        return zzk(listenerHolderZzj, new com.google.android.gms.nearby.messages.internal.zzbb(listenerHolderZzj) { // from class: com.google.android.gms.nearby.messages.internal.zzar
            private final com.google.android.gms.common.api.internal.ListenerHolder zza;

            {
                this.zza = listenerHolderZzj;
            }

            @Override // com.google.android.gms.nearby.messages.internal.zzbb
            public final void zza(com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) throws android.os.RemoteException {
                com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.StatusCallback> listenerHolder2 = this.zza;
                int i = com.google.android.gms.nearby.messages.internal.zzbg.zza;
                zzaiVar.zzz(listenerHolder, listenerHolder2);
            }
        }, new com.google.android.gms.nearby.messages.internal.zzbb(listenerHolderZzj) { // from class: com.google.android.gms.nearby.messages.internal.zzas
            private final com.google.android.gms.common.api.internal.ListenerHolder zza;

            {
                this.zza = listenerHolderZzj;
            }

            @Override // com.google.android.gms.nearby.messages.internal.zzbb
            public final void zza(com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) throws android.os.RemoteException {
                com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.StatusCallback> listenerHolder2 = this.zza;
                int i = com.google.android.gms.nearby.messages.internal.zzbg.zza;
                zzaiVar.zzA(listenerHolder, listenerHolder2);
            }
        }, 1270);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> subscribe(android.app.PendingIntent pendingIntent) {
        com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions = com.google.android.gms.nearby.messages.SubscribeOptions.DEFAULT;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(subscribeOptions);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderZzj = zzj(subscribeOptions.getCallback());
        return zzl(new com.google.android.gms.nearby.messages.internal.zzap(this, pendingIntent, listenerHolderZzj == null ? null : new com.google.android.gms.nearby.messages.internal.zzbf(listenerHolderZzj), subscribeOptions), 1288);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> unpublish(com.google.android.gms.nearby.messages.Message message) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(message);
        return zzi(message, 1290);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> unregisterStatusCallback(com.google.android.gms.nearby.messages.StatusCallback statusCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(statusCallback);
        return zzi(statusCallback, 1271);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> unsubscribe(final android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        return zzl(new com.google.android.gms.nearby.messages.internal.zzbb(pendingIntent) { // from class: com.google.android.gms.nearby.messages.internal.zzaq
            private final android.app.PendingIntent zza;

            {
                this.zza = pendingIntent;
            }

            @Override // com.google.android.gms.nearby.messages.internal.zzbb
            public final void zza(com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) throws android.os.RemoteException {
                android.app.PendingIntent pendingIntent2 = this.zza;
                int i = com.google.android.gms.nearby.messages.internal.zzbg.zza;
                zzaiVar.zzy(listenerHolder, pendingIntent2);
            }
        }, 1287);
    }

    final /* synthetic */ void zza(com.google.android.gms.nearby.messages.internal.zzbb zzbbVar, com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        zzbbVar.zza(zzaiVar, zzh(taskCompletionSource));
    }

    final /* synthetic */ void zzb(com.google.android.gms.nearby.messages.internal.zzbb zzbbVar, com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        zzbbVar.zza(zzaiVar, zzh(taskCompletionSource));
    }

    final /* synthetic */ void zzc(com.google.android.gms.nearby.messages.internal.zzbb zzbbVar, com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        zzbbVar.zza(zzaiVar, zzh(taskCompletionSource));
    }

    final /* synthetic */ void zzd(android.app.PendingIntent pendingIntent, com.google.android.gms.nearby.messages.internal.zzbf zzbfVar, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions, com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) throws android.os.RemoteException {
        zzaiVar.zzv(listenerHolder, pendingIntent, zzbfVar, subscribeOptions, this.zze);
    }

    final /* synthetic */ void zze(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.nearby.messages.internal.zzbf zzbfVar, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions, com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder2) throws android.os.RemoteException {
        zzaiVar.zzt(listenerHolder2, listenerHolder, zzbfVar, subscribeOptions, null, this.zze);
    }

    final /* synthetic */ void zzf(com.google.android.gms.nearby.messages.Message message, com.google.android.gms.nearby.messages.internal.zzbd zzbdVar, com.google.android.gms.nearby.messages.PublishOptions publishOptions, com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) throws android.os.RemoteException {
        zzaiVar.zzq(listenerHolder, com.google.android.gms.nearby.messages.internal.zzae.zza(message), zzbdVar, publishOptions, this.zze);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> unsubscribe(com.google.android.gms.nearby.messages.MessageListener messageListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(messageListener);
        return zzi(messageListener, 1286);
    }

    public zzbg(android.content.Context context, com.google.android.gms.nearby.messages.MessagesOptions messagesOptions) {
        super(context, zzd, messagesOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = com.google.android.gms.nearby.messages.internal.zzai.zzp(context);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> subscribe(android.app.PendingIntent pendingIntent, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(subscribeOptions);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderZzj = zzj(subscribeOptions.getCallback());
        return zzl(new com.google.android.gms.nearby.messages.internal.zzap(this, pendingIntent, listenerHolderZzj == null ? null : new com.google.android.gms.nearby.messages.internal.zzbf(listenerHolderZzj), subscribeOptions), 1288);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> publish(com.google.android.gms.nearby.messages.Message message, com.google.android.gms.nearby.messages.PublishOptions publishOptions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(message);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(publishOptions);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderZzj = zzj(message);
        return zzk(listenerHolderZzj, new com.google.android.gms.nearby.messages.internal.zzaj(this, message, new com.google.android.gms.nearby.messages.internal.zzaw(this, zzj(publishOptions.getCallback()), listenerHolderZzj), publishOptions), new com.google.android.gms.nearby.messages.internal.zzam(message), 1291);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> subscribe(com.google.android.gms.nearby.messages.MessageListener messageListener) {
        com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions = com.google.android.gms.nearby.messages.SubscribeOptions.DEFAULT;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(messageListener);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(subscribeOptions);
        com.google.android.gms.common.internal.Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderZzj = zzj(messageListener);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderZzj2 = zzj(subscribeOptions.getCallback());
        return zzk(listenerHolderZzj, new com.google.android.gms.nearby.messages.internal.zzan(this, listenerHolderZzj, new com.google.android.gms.nearby.messages.internal.zzax(this, listenerHolderZzj2, listenerHolderZzj2), subscribeOptions), new com.google.android.gms.nearby.messages.internal.zzao(listenerHolderZzj), 1289);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> subscribe(com.google.android.gms.nearby.messages.MessageListener messageListener, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(messageListener);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(subscribeOptions);
        com.google.android.gms.common.internal.Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderZzj = zzj(messageListener);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderZzj2 = zzj(subscribeOptions.getCallback());
        return zzk(listenerHolderZzj, new com.google.android.gms.nearby.messages.internal.zzan(this, listenerHolderZzj, new com.google.android.gms.nearby.messages.internal.zzax(this, listenerHolderZzj2, listenerHolderZzj2), subscribeOptions), new com.google.android.gms.nearby.messages.internal.zzao(listenerHolderZzj), 1289);
    }
}
