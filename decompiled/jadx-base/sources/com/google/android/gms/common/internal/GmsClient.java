package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class GmsClient<T extends android.os.IInterface> extends com.google.android.gms.common.internal.BaseGmsClient<T> implements com.google.android.gms.common.api.Api.Client, com.google.android.gms.common.internal.zaj {
    private static volatile java.util.concurrent.Executor zaa;
    private final com.google.android.gms.common.internal.ClientSettings zab;
    private final java.util.Set zac;
    private final android.accounts.Account zad;

    protected GmsClient(android.content.Context context, android.os.Handler handler, int i, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        super(context, handler, com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(context), com.google.android.gms.common.GoogleApiAvailability.getInstance(), i, null, null);
        this.zab = (com.google.android.gms.common.internal.ClientSettings) com.google.android.gms.common.internal.Preconditions.checkNotNull(clientSettings);
        this.zad = clientSettings.getAccount();
        this.zac = zab(clientSettings.getAllRequestedScopes());
    }

    private final java.util.Set zab(java.util.Set set) {
        java.util.Set<com.google.android.gms.common.api.Scope> setValidateScopes = validateScopes(set);
        java.util.Iterator<com.google.android.gms.common.api.Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new java.lang.IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setValidateScopes;
    }

    public static void zaf(java.util.concurrent.Executor executor) {
        zaa = executor;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.accounts.Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected java.util.concurrent.Executor getBindServiceExecutor() {
        return zaa;
    }

    protected final com.google.android.gms.common.internal.ClientSettings getClientSettings() {
        return this.zab;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public com.google.android.gms.common.Feature[] getRequiredFeatures() {
        return new com.google.android.gms.common.Feature[0];
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : java.util.Collections.emptySet();
    }

    protected java.util.Set<com.google.android.gms.common.api.Scope> validateScopes(java.util.Set<com.google.android.gms.common.api.Scope> set) {
        return set;
    }

    protected GmsClient(android.content.Context context, android.os.Looper looper, int i, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        this(context, looper, com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(context), com.google.android.gms.common.GoogleApiAvailability.getInstance(), i, clientSettings, null, null);
    }

    @java.lang.Deprecated
    protected GmsClient(android.content.Context context, android.os.Looper looper, int i, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i, clientSettings, (com.google.android.gms.common.api.internal.ConnectionCallbacks) connectionCallbacks, (com.google.android.gms.common.api.internal.OnConnectionFailedListener) onConnectionFailedListener);
    }

    protected GmsClient(android.content.Context context, android.os.Looper looper, int i, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(context), com.google.android.gms.common.GoogleApiAvailability.getInstance(), i, clientSettings, (com.google.android.gms.common.api.internal.ConnectionCallbacks) com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks), (com.google.android.gms.common.api.internal.OnConnectionFailedListener) com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener));
    }

    protected GmsClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability, int i, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i, connectionCallbacks == null ? null : new com.google.android.gms.common.internal.zah(connectionCallbacks), onConnectionFailedListener == null ? null : new com.google.android.gms.common.internal.zai(onConnectionFailedListener), clientSettings.zac());
        this.zab = clientSettings;
        this.zad = clientSettings.getAccount();
        this.zac = zab(clientSettings.getAllRequestedScopes());
    }
}
