package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzq {
    private final android.os.Messenger zza;
    private final com.google.android.gms.cloudmessaging.zzd zzb;

    zzq(android.os.IBinder iBinder) throws android.os.RemoteException {
        java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (java.util.Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.zza = new android.os.Messenger(iBinder);
            this.zzb = null;
        } else {
            if (!java.util.Objects.equals(interfaceDescriptor, com.google.android.gms.cloudmessaging.IMessengerCompat.DESCRIPTOR)) {
                android.util.Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(java.lang.String.valueOf(interfaceDescriptor)));
                throw new android.os.RemoteException();
            }
            this.zzb = new com.google.android.gms.cloudmessaging.zzd(iBinder);
            this.zza = null;
        }
    }

    final void zza(android.os.Message message) throws android.os.RemoteException {
        android.os.Messenger messenger = this.zza;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        com.google.android.gms.cloudmessaging.zzd zzdVar = this.zzb;
        if (zzdVar == null) {
            throw new java.lang.IllegalStateException("Both messengers are null");
        }
        zzdVar.zzb(message);
    }
}
