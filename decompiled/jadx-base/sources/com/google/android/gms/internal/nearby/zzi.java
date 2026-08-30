package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzi extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.internal.nearby.zzl> {
    public zzi(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        super(context, looper, 69, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* bridge */ /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.nearby.zzl ? (com.google.android.gms.internal.nearby.zzl) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.nearby.zzl(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
