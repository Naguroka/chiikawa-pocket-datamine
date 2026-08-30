package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zak implements android.os.Handler.Callback {
    private final com.google.android.gms.common.internal.zaj zab;
    private final android.os.Handler zah;
    private final java.util.ArrayList zac = new java.util.ArrayList();
    final java.util.ArrayList zaa = new java.util.ArrayList();
    private final java.util.ArrayList zad = new java.util.ArrayList();
    private volatile boolean zae = false;
    private final java.util.concurrent.atomic.AtomicInteger zaf = new java.util.concurrent.atomic.AtomicInteger(0);
    private boolean zag = false;
    private final java.lang.Object zai = new java.lang.Object();

    public zak(android.os.Looper looper, com.google.android.gms.common.internal.zaj zajVar) {
        this.zab = zajVar;
        this.zah = new com.google.android.gms.internal.base.zaq(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (message.what != 1) {
            android.util.Log.wtf("GmsClientEvents", "Don't know how to handle message: " + message.what, new java.lang.Exception());
            return false;
        }
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) message.obj;
        synchronized (this.zai) {
            if (this.zae && this.zab.isConnected() && this.zac.contains(connectionCallbacks)) {
                connectionCallbacks.onConnected(null);
            }
        }
        return true;
    }

    public final void zaa() {
        this.zae = false;
        this.zaf.incrementAndGet();
    }

    public final void zab() {
        this.zae = true;
    }

    public final void zac(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zah, "onConnectionFailure must only be called on the Handler thread");
        this.zah.removeMessages(1);
        synchronized (this.zai) {
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener> arrayList = new java.util.ArrayList(this.zad);
            int i = this.zaf.get();
            for (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener : arrayList) {
                if (this.zae && this.zaf.get() == i) {
                    if (this.zad.contains(onConnectionFailedListener)) {
                        onConnectionFailedListener.onConnectionFailed(connectionResult);
                    }
                }
                return;
            }
        }
    }

    public final void zad(android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zah, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.zai) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zag);
            this.zah.removeMessages(1);
            this.zag = true;
            com.google.android.gms.common.internal.Preconditions.checkState(this.zaa.isEmpty());
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> arrayList = new java.util.ArrayList(this.zac);
            int i = this.zaf.get();
            for (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList) {
                if (!this.zae || !this.zab.isConnected() || this.zaf.get() != i) {
                    break;
                    break;
                    break;
                } else if (!this.zaa.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(bundle);
                }
            }
            this.zaa.clear();
            this.zag = false;
        }
    }

    public final void zae(int i) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zah, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.zah.removeMessages(1);
        synchronized (this.zai) {
            this.zag = true;
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> arrayList = new java.util.ArrayList(this.zac);
            int i2 = this.zaf.get();
            for (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList) {
                if (!this.zae || this.zaf.get() != i2) {
                    break;
                    break;
                } else if (this.zac.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i);
                }
            }
            this.zaa.clear();
            this.zag = false;
        }
    }

    public final void zaf(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            if (this.zac.contains(connectionCallbacks)) {
                android.util.Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + java.lang.String.valueOf(connectionCallbacks) + " is already registered");
            } else {
                this.zac.add(connectionCallbacks);
            }
        }
        if (this.zab.isConnected()) {
            android.os.Handler handler = this.zah;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void zag(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            if (this.zad.contains(onConnectionFailedListener)) {
                android.util.Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + java.lang.String.valueOf(onConnectionFailedListener) + " is already registered");
            } else {
                this.zad.add(onConnectionFailedListener);
            }
        }
    }

    public final void zah(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            if (!this.zac.remove(connectionCallbacks)) {
                android.util.Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + java.lang.String.valueOf(connectionCallbacks) + " not found");
            } else if (this.zag) {
                this.zaa.add(connectionCallbacks);
            }
        }
    }

    public final void zai(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            if (!this.zad.remove(onConnectionFailedListener)) {
                android.util.Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + java.lang.String.valueOf(onConnectionFailedListener) + " not found");
            }
        }
    }

    public final boolean zaj(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean zContains;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            zContains = this.zac.contains(connectionCallbacks);
        }
        return zContains;
    }

    public final boolean zak(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean zContains;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            zContains = this.zad.contains(onConnectionFailedListener);
        }
        return zContains;
    }
}
