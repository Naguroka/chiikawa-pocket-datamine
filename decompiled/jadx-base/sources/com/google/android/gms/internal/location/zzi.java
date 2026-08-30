package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzi extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.internal.location.zzam> {
    protected final com.google.android.gms.internal.location.zzbg<com.google.android.gms.internal.location.zzam> zze;
    private final java.lang.String zzf;

    public zzi(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, java.lang.String str, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zze = new com.google.android.gms.internal.location.zzh(this);
        this.zzf = str;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* bridge */ /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.location.zzam ? (com.google.android.gms.internal.location.zzam) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.location.zzal(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
        return com.google.android.gms.location.zzu.zzf;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("client_name", this.zzf);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
