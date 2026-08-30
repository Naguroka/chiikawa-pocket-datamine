package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzg implements com.google.android.gms.drive.events.ListenerToken {
    private final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zzcy;
    private com.google.android.gms.common.internal.ICancelToken zzcz = null;

    public zzg(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey) {
        this.zzcy = listenerKey;
    }

    public final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zzad() {
        return this.zzcy;
    }

    public final void setCancelToken(com.google.android.gms.common.internal.ICancelToken iCancelToken) {
        this.zzcz = iCancelToken;
    }

    public final boolean cancel() {
        com.google.android.gms.common.internal.ICancelToken iCancelToken = this.zzcz;
        if (iCancelToken == null) {
            return false;
        }
        try {
            iCancelToken.cancel();
            return true;
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }
}
