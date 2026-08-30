package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbup extends com.google.android.gms.ads.internal.zzc {
    public zzbup(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(com.google.android.gms.internal.ads.zzbvu.zza(context), looper, 8, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbuy ? (com.google.android.gms.internal.ads.zzbuy) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbuw(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    public final com.google.android.gms.internal.ads.zzbuy zzp() throws android.os.DeadObjectException {
        return (com.google.android.gms.internal.ads.zzbuy) super.getService();
    }
}
