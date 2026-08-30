package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class Api<O extends com.google.android.gms.common.api.Api.ApiOptions> {
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder zaa;
    private final com.google.android.gms.common.api.Api.ClientKey zab;
    private final java.lang.String zac;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public static abstract class AbstractClientBuilder<T extends com.google.android.gms.common.api.Api.Client, O> extends com.google.android.gms.common.api.Api.BaseClientBuilder<T, O> {
        @java.lang.Deprecated
        public T buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, O o, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return (T) buildClient(context, looper, clientSettings, (java.lang.Object) o, (com.google.android.gms.common.api.internal.ConnectionCallbacks) connectionCallbacks, (com.google.android.gms.common.api.internal.OnConnectionFailedListener) onConnectionFailedListener);
        }

        public T buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, O o, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
            throw new java.lang.UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public interface AnyClient {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public static class AnyClientKey<C extends com.google.android.gms.common.api.Api.AnyClient> {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public interface ApiOptions {
        public static final com.google.android.gms.common.api.Api.ApiOptions.NoOptions NO_OPTIONS = new com.google.android.gms.common.api.Api.ApiOptions.NoOptions(null);

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
        public interface HasAccountOptions extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions, com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions {
            android.accounts.Account getAccount();
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
        public interface HasGoogleSignInAccountOptions extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions {
            com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleSignInAccount();
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
        public interface HasOptions extends com.google.android.gms.common.api.Api.ApiOptions {
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
        public static final class NoOptions implements com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions {
            private NoOptions() {
                throw null;
            }

            /* synthetic */ NoOptions(com.google.android.gms.common.api.zaa zaaVar) {
            }
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
        public interface NotRequiredOptions extends com.google.android.gms.common.api.Api.ApiOptions {
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
        public interface Optional extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions, com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public static abstract class BaseClientBuilder<T extends com.google.android.gms.common.api.Api.AnyClient, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public java.util.List<com.google.android.gms.common.api.Scope> getImpliedScopes(O o) {
            return java.util.Collections.emptyList();
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public interface Client extends com.google.android.gms.common.api.Api.AnyClient {
        void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        void disconnect();

        void disconnect(java.lang.String str);

        void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

        com.google.android.gms.common.Feature[] getAvailableFeatures();

        java.lang.String getEndpointPackageName();

        java.lang.String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, java.util.Set<com.google.android.gms.common.api.Scope> set);

        com.google.android.gms.common.Feature[] getRequiredFeatures();

        java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn();

        android.os.IBinder getServiceBrokerBinder();

        android.content.Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks signOutCallbacks);

        boolean providesSignIn();

        boolean requiresAccount();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public static final class ClientKey<C extends com.google.android.gms.common.api.Api.Client> extends com.google.android.gms.common.api.Api.AnyClientKey<C> {
    }

    public <C extends com.google.android.gms.common.api.Api.Client> Api(java.lang.String str, com.google.android.gms.common.api.Api.AbstractClientBuilder<C, O> abstractClientBuilder, com.google.android.gms.common.api.Api.ClientKey<C> clientKey) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(abstractClientBuilder, "Cannot construct an Api with a null ClientBuilder");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(clientKey, "Cannot construct an Api with a null ClientKey");
        this.zac = str;
        this.zaa = abstractClientBuilder;
        this.zab = clientKey;
    }

    public final com.google.android.gms.common.api.Api.AbstractClientBuilder zaa() {
        return this.zaa;
    }

    public final com.google.android.gms.common.api.Api.AnyClientKey zab() {
        return this.zab;
    }

    public final com.google.android.gms.common.api.Api.BaseClientBuilder zac() {
        return this.zaa;
    }

    public final java.lang.String zad() {
        return this.zac;
    }
}
