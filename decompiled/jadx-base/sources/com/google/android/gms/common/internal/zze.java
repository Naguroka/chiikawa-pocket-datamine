package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zze implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zze(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i) {
        this.zza = baseGmsClient;
        this.zzb = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zza;
        if (iBinder == null) {
            com.google.android.gms.common.internal.BaseGmsClient.zzk(baseGmsClient, 16);
            return;
        }
        synchronized (baseGmsClient.zzq) {
            com.google.android.gms.common.internal.BaseGmsClient baseGmsClient2 = this.zza;
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            baseGmsClient2.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.IGmsServiceBroker)) ? new com.google.android.gms.common.internal.zzac(iBinder) : (com.google.android.gms.common.internal.IGmsServiceBroker) iInterfaceQueryLocalInterface;
        }
        this.zza.zzl(0, null, this.zzb);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.zza.zzq) {
            this.zza.zzr = null;
        }
        com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zza;
        baseGmsClient.zzb.sendMessage(baseGmsClient.zzb.obtainMessage(6, this.zzb, 1));
    }
}
