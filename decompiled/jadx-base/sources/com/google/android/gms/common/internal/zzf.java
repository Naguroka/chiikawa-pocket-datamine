package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzf extends com.google.android.gms.common.internal.zza {
    public final android.os.IBinder zze;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i, android.os.IBinder iBinder, android.os.Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.zzf = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final void zzb(com.google.android.gms.common.ConnectionResult connectionResult) {
        if (this.zzf.zzx != null) {
            this.zzf.zzx.onConnectionFailed(connectionResult);
        }
        this.zzf.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final boolean zzd() {
        try {
            android.os.IBinder iBinder = this.zze;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(iBinder);
            java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.zzf.getServiceDescriptor().equals(interfaceDescriptor)) {
                android.util.Log.w("GmsClient", "service descriptor mismatch: " + this.zzf.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            android.os.IInterface iInterfaceCreateServiceInterface = this.zzf.createServiceInterface(this.zze);
            if (iInterfaceCreateServiceInterface == null || !(com.google.android.gms.common.internal.BaseGmsClient.zzn(this.zzf, 2, 4, iInterfaceCreateServiceInterface) || com.google.android.gms.common.internal.BaseGmsClient.zzn(this.zzf, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            this.zzf.zzC = null;
            com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zzf;
            android.os.Bundle connectionHint = baseGmsClient.getConnectionHint();
            if (baseGmsClient.zzw == null) {
                return true;
            }
            this.zzf.zzw.onConnected(connectionHint);
            return true;
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
