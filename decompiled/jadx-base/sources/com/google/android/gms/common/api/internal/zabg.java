package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zabg implements com.google.android.gms.common.api.internal.zaby, com.google.android.gms.common.api.internal.zau {
    final java.util.Map zaa;
    final com.google.android.gms.common.internal.ClientSettings zac;
    final java.util.Map zad;
    final com.google.android.gms.common.api.Api.AbstractClientBuilder zae;
    int zaf;
    final com.google.android.gms.common.api.internal.zabc zag;
    final com.google.android.gms.common.api.internal.zabx zah;
    private final java.util.concurrent.locks.Lock zai;
    private final java.util.concurrent.locks.Condition zaj;
    private final android.content.Context zak;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zal;
    private final com.google.android.gms.common.api.internal.zabf zam;
    private volatile com.google.android.gms.common.api.internal.zabd zan;
    final java.util.Map zab = new java.util.HashMap();
    private com.google.android.gms.common.ConnectionResult zao = null;

    public zabg(android.content.Context context, com.google.android.gms.common.api.internal.zabc zabcVar, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, java.util.Map map, com.google.android.gms.common.internal.ClientSettings clientSettings, java.util.Map map2, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder, java.util.ArrayList arrayList, com.google.android.gms.common.api.internal.zabx zabxVar) {
        this.zak = context;
        this.zai = lock;
        this.zal = googleApiAvailabilityLight;
        this.zaa = map;
        this.zac = clientSettings;
        this.zad = map2;
        this.zae = abstractClientBuilder;
        this.zag = zabcVar;
        this.zah = zabxVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.gms.common.api.internal.zat) arrayList.get(i)).zaa(this);
        }
        this.zam = new com.google.android.gms.common.api.internal.zabf(this, looper);
        this.zaj = lock.newCondition();
        this.zan = new com.google.android.gms.common.api.internal.zaav(this);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zai.lock();
        try {
            this.zan.zag(bundle);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zai.lock();
        try {
            this.zan.zai(i);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api api, boolean z) {
        this.zai.lock();
        try {
            this.zan.zah(connectionResult, api, z);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final com.google.android.gms.common.ConnectionResult zab() {
        zaq();
        while (this.zan instanceof com.google.android.gms.common.api.internal.zaau) {
            try {
                this.zaj.await();
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                return new com.google.android.gms.common.ConnectionResult(15, null);
            }
        }
        if (this.zan instanceof com.google.android.gms.common.api.internal.zaai) {
            return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
        }
        com.google.android.gms.common.ConnectionResult connectionResult = this.zao;
        return connectionResult != null ? connectionResult : new com.google.android.gms.common.ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final com.google.android.gms.common.ConnectionResult zac(long j, java.util.concurrent.TimeUnit timeUnit) {
        zaq();
        long nanos = timeUnit.toNanos(j);
        while (this.zan instanceof com.google.android.gms.common.api.internal.zaau) {
            if (nanos <= 0) {
                zar();
                return new com.google.android.gms.common.ConnectionResult(14, null);
            }
            try {
                nanos = this.zaj.awaitNanos(nanos);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                return new com.google.android.gms.common.ConnectionResult(15, null);
            }
            java.lang.Thread.currentThread().interrupt();
            return new com.google.android.gms.common.ConnectionResult(15, null);
        }
        if (this.zan instanceof com.google.android.gms.common.api.internal.zaai) {
            return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
        }
        com.google.android.gms.common.ConnectionResult connectionResult = this.zao;
        return connectionResult != null ? connectionResult : new com.google.android.gms.common.ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final com.google.android.gms.common.ConnectionResult zad(com.google.android.gms.common.api.Api api) {
        java.util.Map map = this.zaa;
        com.google.android.gms.common.api.Api.AnyClientKey anyClientKeyZab = api.zab();
        if (!map.containsKey(anyClientKeyZab)) {
            return null;
        }
        if (((com.google.android.gms.common.api.Api.Client) this.zaa.get(anyClientKeyZab)).isConnected()) {
            return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
        }
        if (this.zab.containsKey(anyClientKeyZab)) {
            return (com.google.android.gms.common.ConnectionResult) this.zab.get(anyClientKeyZab);
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zae(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.zan.zaa(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaf(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        return this.zan.zab(apiMethodImpl);
    }

    final void zai() {
        this.zai.lock();
        try {
            this.zag.zak();
            this.zan = new com.google.android.gms.common.api.internal.zaai(this);
            this.zan.zad();
            this.zaj.signalAll();
        } finally {
            this.zai.unlock();
        }
    }

    final void zaj() {
        this.zai.lock();
        try {
            this.zan = new com.google.android.gms.common.api.internal.zaau(this, this.zac, this.zad, this.zal, this.zae, this.zai, this.zak);
            this.zan.zad();
            this.zaj.signalAll();
        } finally {
            this.zai.unlock();
        }
    }

    final void zak(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zai.lock();
        try {
            this.zao = connectionResult;
            this.zan = new com.google.android.gms.common.api.internal.zaav(this);
            this.zan.zad();
            this.zaj.signalAll();
        } finally {
            this.zai.unlock();
        }
    }

    final void zal(com.google.android.gms.common.api.internal.zabe zabeVar) {
        com.google.android.gms.common.api.internal.zabf zabfVar = this.zam;
        zabfVar.sendMessage(zabfVar.obtainMessage(1, zabeVar));
    }

    final void zam(java.lang.RuntimeException runtimeException) {
        com.google.android.gms.common.api.internal.zabf zabfVar = this.zam;
        zabfVar.sendMessage(zabfVar.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final void zaq() {
        this.zan.zae();
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final void zar() {
        if (this.zan.zaj()) {
            this.zab.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final void zas(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.append((java.lang.CharSequence) str).append("mState=").println(this.zan);
        for (com.google.android.gms.common.api.Api api : this.zad.keySet()) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            printWriter.append((java.lang.CharSequence) str).append((java.lang.CharSequence) api.zad()).println(":");
            ((com.google.android.gms.common.api.Api.Client) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.api.Api.Client) this.zaa.get(api.zab()))).dump(strValueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final void zat() {
        if (this.zan instanceof com.google.android.gms.common.api.internal.zaai) {
            ((com.google.android.gms.common.api.internal.zaai) this.zan).zaf();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final void zau() {
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final boolean zaw() {
        return this.zan instanceof com.google.android.gms.common.api.internal.zaai;
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final boolean zax() {
        return this.zan instanceof com.google.android.gms.common.api.internal.zaau;
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final boolean zay(com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener) {
        return false;
    }
}
