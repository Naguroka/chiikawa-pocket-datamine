package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class BlockingServiceConnection implements android.content.ServiceConnection {
    boolean zza = false;
    private final java.util.concurrent.BlockingQueue zzb = new java.util.concurrent.LinkedBlockingQueue();

    public android.os.IBinder getService() throws java.lang.InterruptedException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
        if (this.zza) {
            throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
        }
        this.zza = true;
        return (android.os.IBinder) this.zzb.take();
    }

    public android.os.IBinder getServiceWithTimeout(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.zza) {
            throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
        }
        this.zza = true;
        android.os.IBinder iBinder = (android.os.IBinder) this.zzb.poll(j, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new java.util.concurrent.TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.zzb.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
