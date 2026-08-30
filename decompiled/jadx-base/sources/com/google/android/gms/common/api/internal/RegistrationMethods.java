package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class RegistrationMethods<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    public final com.google.android.gms.common.api.internal.RegisterListenerMethod<A, L> register;
    public final com.google.android.gms.common.api.internal.UnregisterListenerMethod zaa;
    public final java.lang.Runnable zab;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public static class Builder<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
        private com.google.android.gms.common.api.internal.RemoteCall zaa;
        private com.google.android.gms.common.api.internal.RemoteCall zab;
        private com.google.android.gms.common.api.internal.ListenerHolder zad;
        private com.google.android.gms.common.Feature[] zae;
        private int zag;
        private java.lang.Runnable zac = new java.lang.Runnable() { // from class: com.google.android.gms.common.api.internal.zach
            @Override // java.lang.Runnable
            public final void run() {
            }
        };
        private boolean zaf = true;

        private Builder() {
        }

        /* synthetic */ Builder(com.google.android.gms.common.api.internal.zack zackVar) {
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods<A, L> build() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zaa != null, "Must set register function");
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zab != null, "Must set unregister function");
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zad != null, "Must set holder");
            return new com.google.android.gms.common.api.internal.RegistrationMethods<>(new com.google.android.gms.common.api.internal.zaci(this, this.zad, this.zae, this.zaf, this.zag), new com.google.android.gms.common.api.internal.zacj(this, (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad.getListenerKey(), "Key must not be null")), this.zac, null);
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> onConnectionSuspended(java.lang.Runnable runnable) {
            this.zac = runnable;
            return this;
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> register(com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> setAutoResolveMissingFeatures(boolean z) {
            this.zaf = z;
            return this;
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> setFeatures(com.google.android.gms.common.Feature... featureArr) {
            this.zae = featureArr;
            return this;
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> setMethodKey(int i) {
            this.zag = i;
            return this;
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> unregister(com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean>> remoteCall) {
            this.zab = remoteCall;
            return this;
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> withHolder(com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolder) {
            this.zad = listenerHolder;
            return this;
        }
    }

    /* synthetic */ RegistrationMethods(com.google.android.gms.common.api.internal.RegisterListenerMethod registerListenerMethod, com.google.android.gms.common.api.internal.UnregisterListenerMethod unregisterListenerMethod, java.lang.Runnable runnable, com.google.android.gms.common.api.internal.zack zackVar) {
        this.register = registerListenerMethod;
        this.zaa = unregisterListenerMethod;
        this.zab = runnable;
    }

    public static <A extends com.google.android.gms.common.api.Api.AnyClient, L> com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> builder() {
        return new com.google.android.gms.common.api.internal.RegistrationMethods.Builder<>(null);
    }
}
