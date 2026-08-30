package com.google.firebase.crashlytics.internal;

/* JADX INFO: loaded from: classes5.dex */
public class RemoteConfigDeferredProxy {
    private final com.google.firebase.inject.Deferred<com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop> remoteConfigInteropDeferred;

    public RemoteConfigDeferredProxy(com.google.firebase.inject.Deferred<com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop> deferred) {
        this.remoteConfigInteropDeferred = deferred;
    }

    public void setupListener(com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata) {
        if (userMetadata == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener = new com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener(userMetadata);
            this.remoteConfigInteropDeferred.whenAvailable(new com.google.firebase.inject.Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy$$ExternalSyntheticLambda0
                @Override // com.google.firebase.inject.Deferred.DeferredHandler
                public final void handle(com.google.firebase.inject.Provider provider) {
                    com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy.lambda$setupListener$0(crashlyticsRemoteConfigListener, provider);
                }
            });
        }
    }

    static /* synthetic */ void lambda$setupListener$0(com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, com.google.firebase.inject.Provider provider) {
        ((com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop) provider.get()).registerRolloutsStateSubscriber("firebase", crashlyticsRemoteConfigListener);
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Registering RemoteConfig Rollouts subscriber");
    }
}
