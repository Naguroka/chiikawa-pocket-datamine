package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zaaf extends com.google.android.gms.common.api.GoogleApiClient {
    private final java.lang.String zaa = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public zaaf(java.lang.String str) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult blockingConnect() {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> clearDefaultAccountAndReconnect() {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.Api<?> api) {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(com.google.android.gms.common.api.Api<?> api) {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(androidx.fragment.app.FragmentActivity fragmentActivity) {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult blockingConnect(long j, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException(this.zaa);
    }
}
