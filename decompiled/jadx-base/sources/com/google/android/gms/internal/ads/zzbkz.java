package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbkz extends com.google.android.gms.ads.internal.zzc {
    zzbkz(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(com.google.android.gms.internal.ads.zzbvu.zza(context), looper, org.objectweb.asm.Opcodes.IF_ACMPNE, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzblg ? (com.google.android.gms.internal.ads.zzblg) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzblg(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final com.google.android.gms.internal.ads.zzblg zzp() throws android.os.DeadObjectException {
        return (com.google.android.gms.internal.ads.zzblg) super.getService();
    }
}
