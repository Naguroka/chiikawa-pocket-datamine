package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class zzak extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.internal.auth.zzan> {
    private final android.os.Bundle zzbv;

    public zzak(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.AuthProxyOptions authProxyOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 16, clientSettings, connectionCallbacks, onConnectionFailedListener);
        if (authProxyOptions != null) {
            throw new java.lang.NoSuchMethodError();
        }
        this.zzbv = new android.os.Bundle();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        com.google.android.gms.common.internal.ClientSettings clientSettings = getClientSettings();
        return (android.text.TextUtils.isEmpty(clientSettings.getAccountName()) || clientSettings.getApplicableScopes(com.google.android.gms.auth.api.AuthProxy.API).isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
        return this.zzbv;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.auth.zzan) {
            return (com.google.android.gms.internal.auth.zzan) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.auth.zzao(iBinder);
    }
}
