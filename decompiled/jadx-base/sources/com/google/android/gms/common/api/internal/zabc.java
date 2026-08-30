package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zabc extends com.google.android.gms.common.api.GoogleApiClient implements com.google.android.gms.common.api.internal.zabx {
    com.google.android.gms.common.api.internal.zabv zab;
    final java.util.Map zac;
    java.util.Set zad;
    final com.google.android.gms.common.internal.ClientSettings zae;
    final java.util.Map zaf;
    final com.google.android.gms.common.api.Api.AbstractClientBuilder zag;
    java.util.Set zah;
    final com.google.android.gms.common.api.internal.zacz zai;
    private final java.util.concurrent.locks.Lock zaj;
    private final com.google.android.gms.common.internal.zak zak;
    private final int zam;
    private final android.content.Context zan;
    private final android.os.Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final com.google.android.gms.common.api.internal.zaba zas;
    private final com.google.android.gms.common.GoogleApiAvailability zat;
    private final com.google.android.gms.common.api.internal.ListenerHolders zau;
    private final java.util.ArrayList zav;
    private java.lang.Integer zaw;
    private final com.google.android.gms.common.internal.zaj zax;
    private com.google.android.gms.common.api.internal.zaby zal = null;
    final java.util.Queue zaa = new java.util.LinkedList();

    public zabc(android.content.Context context, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder, java.util.Map map, java.util.List list, java.util.List list2, java.util.Map map2, int i, int i2, java.util.ArrayList arrayList) {
        this.zaq = true != com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() ? com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS : 10000L;
        this.zar = 5000L;
        this.zad = new java.util.HashSet();
        this.zau = new com.google.android.gms.common.api.internal.ListenerHolders();
        this.zaw = null;
        this.zah = null;
        com.google.android.gms.common.api.internal.zaaw zaawVar = new com.google.android.gms.common.api.internal.zaaw(this);
        this.zax = zaawVar;
        this.zan = context;
        this.zaj = lock;
        this.zak = new com.google.android.gms.common.internal.zak(looper, zaawVar);
        this.zao = looper;
        this.zas = new com.google.android.gms.common.api.internal.zaba(this, looper);
        this.zat = googleApiAvailability;
        this.zam = i;
        if (i >= 0) {
            this.zaw = java.lang.Integer.valueOf(i2);
        }
        this.zaf = map;
        this.zac = map2;
        this.zav = arrayList;
        this.zai = new com.google.android.gms.common.api.internal.zacz();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.zak.zaf((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) it.next());
        }
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.zak.zag((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) it2.next());
        }
        this.zae = clientSettings;
        this.zag = abstractClientBuilder;
    }

    public static int zad(java.lang.Iterable iterable, boolean z) {
        java.util.Iterator it = iterable.iterator();
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        while (it.hasNext()) {
            com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client) it.next();
            zRequiresSignIn |= client.requiresSignIn();
            zProvidesSignIn |= client.providesSignIn();
        }
        if (zRequiresSignIn) {
            return (zProvidesSignIn && z) ? 2 : 1;
        }
        return 3;
    }

    static java.lang.String zag(int i) {
        if (i == 1) {
            return "SIGN_IN_MODE_REQUIRED";
        }
        if (i != 2) {
            return i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE";
        }
        return "SIGN_IN_MODE_OPTIONAL";
    }

    static /* bridge */ /* synthetic */ void zai(com.google.android.gms.common.api.internal.zabc zabcVar) {
        zabcVar.zaj.lock();
        try {
            if (zabcVar.zap) {
                zabcVar.zan();
            }
        } finally {
            zabcVar.zaj.unlock();
        }
    }

    static /* bridge */ /* synthetic */ void zaj(com.google.android.gms.common.api.internal.zabc zabcVar) {
        zabcVar.zaj.lock();
        try {
            if (zabcVar.zak()) {
                zabcVar.zan();
            }
        } finally {
            zabcVar.zaj.unlock();
        }
    }

    private final void zal(int i) {
        java.lang.Integer num = this.zaw;
        if (num == null) {
            this.zaw = java.lang.Integer.valueOf(i);
        } else if (num.intValue() != i) {
            throw new java.lang.IllegalStateException("Cannot use sign-in mode: " + zag(i) + ". Mode was already set to " + zag(this.zaw.intValue()));
        }
        if (this.zal != null) {
            return;
        }
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (com.google.android.gms.common.api.Api.Client client : this.zac.values()) {
            zRequiresSignIn |= client.requiresSignIn();
            zProvidesSignIn |= client.providesSignIn();
        }
        int iIntValue = this.zaw.intValue();
        if (iIntValue == 1) {
            if (!zRequiresSignIn) {
                throw new java.lang.IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (zProvidesSignIn) {
                throw new java.lang.IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (iIntValue == 2 && zRequiresSignIn) {
            this.zal = com.google.android.gms.common.api.internal.zaz.zag(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav);
            return;
        }
        this.zal = new com.google.android.gms.common.api.internal.zabg(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zam(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult, boolean z) {
        com.google.android.gms.common.internal.service.Common.zaa.zaa(googleApiClient).setResultCallback(new com.google.android.gms.common.api.internal.zaaz(this, statusPendingResult, z, googleApiClient));
    }

    private final void zan() {
        this.zak.zab();
        ((com.google.android.gms.common.api.internal.zaby) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zal)).zaq();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult blockingConnect() {
        boolean z = true;
        com.google.android.gms.common.internal.Preconditions.checkState(android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.zaj.lock();
        try {
            if (this.zam >= 0) {
                if (this.zaw == null) {
                    z = false;
                }
                com.google.android.gms.common.internal.Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                java.lang.Integer num = this.zaw;
                if (num == null) {
                    this.zaw = java.lang.Integer.valueOf(zad(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new java.lang.IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            zal(((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            com.google.android.gms.common.ConnectionResult connectionResultZab = ((com.google.android.gms.common.api.internal.zaby) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zal)).zab();
            this.zaj.unlock();
            return connectionResultZab;
        } catch (java.lang.Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> clearDefaultAccountAndReconnect() {
        com.google.android.gms.common.internal.Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        java.lang.Integer num = this.zaw;
        boolean z = true;
        if (num != null && num.intValue() == 2) {
            z = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(z, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult = new com.google.android.gms.common.api.internal.StatusPendingResult(this);
        if (this.zac.containsKey(com.google.android.gms.common.internal.service.Common.CLIENT_KEY)) {
            zam(this, statusPendingResult, false);
        } else {
            java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            com.google.android.gms.common.api.internal.zaax zaaxVar = new com.google.android.gms.common.api.internal.zaax(this, atomicReference, statusPendingResult);
            com.google.android.gms.common.api.internal.zaay zaayVar = new com.google.android.gms.common.api.internal.zaay(this, statusPendingResult);
            com.google.android.gms.common.api.GoogleApiClient.Builder builder = new com.google.android.gms.common.api.GoogleApiClient.Builder(this.zan);
            builder.addApi(com.google.android.gms.common.internal.service.Common.API);
            builder.addConnectionCallbacks(zaaxVar);
            builder.addOnConnectionFailedListener(zaayVar);
            builder.setHandler(this.zas);
            com.google.android.gms.common.api.GoogleApiClient googleApiClientBuild = builder.build();
            atomicReference.set(googleApiClientBuild);
            googleApiClientBuild.connect();
        }
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        this.zaj.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.zam >= 0) {
                com.google.android.gms.common.internal.Preconditions.checkState(this.zaw != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                java.lang.Integer num = this.zaw;
                if (num == null) {
                    this.zaw = java.lang.Integer.valueOf(zad(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new java.lang.IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int iIntValue = ((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaw)).intValue();
            this.zaj.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i = iIntValue;
                    }
                    com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Illegal sign-in mode: " + i);
                    zal(i);
                    zan();
                    this.zaj.unlock();
                    return;
                }
                i = iIntValue;
                com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Illegal sign-in mode: " + i);
                zal(i);
                zan();
                this.zaj.unlock();
                return;
            } finally {
                this.zaj.unlock();
            }
            z = true;
        } catch (java.lang.Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        this.zaj.lock();
        try {
            this.zai.zab();
            com.google.android.gms.common.api.internal.zaby zabyVar = this.zal;
            if (zabyVar != null) {
                zabyVar.zar();
            }
            this.zau.zab();
            for (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl : this.zaa) {
                apiMethodImpl.zan(null);
                apiMethodImpl.cancel();
            }
            this.zaa.clear();
            if (this.zal != null) {
                zak();
                this.zak.zaa();
            }
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.append((java.lang.CharSequence) str).append("mContext=").println(this.zan);
        printWriter.append((java.lang.CharSequence) str).append("mResuming=").print(this.zap);
        printWriter.append(" mWorkQueue.size()=").print(this.zaa.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zai.zab.size());
        com.google.android.gms.common.api.internal.zaby zabyVar = this.zal;
        if (zabyVar != null) {
            zabyVar.zas(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        com.google.android.gms.common.api.Api<?> api = t.getApi();
        com.google.android.gms.common.internal.Preconditions.checkArgument(this.zac.containsKey(t.getClientKey()), "GoogleApiClient is not configured to use " + (api != null ? api.zad() : "the API") + " required for this call.");
        this.zaj.lock();
        try {
            com.google.android.gms.common.api.internal.zaby zabyVar = this.zal;
            if (zabyVar == null) {
                this.zaa.add(t);
            } else {
                t = (T) zabyVar.zae(t);
            }
            return t;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T t) {
        java.util.Map map = this.zac;
        com.google.android.gms.common.api.Api<?> api = t.getApi();
        com.google.android.gms.common.internal.Preconditions.checkArgument(map.containsKey(t.getClientKey()), "GoogleApiClient is not configured to use " + (api != null ? api.zad() : "the API") + " required for this call.");
        this.zaj.lock();
        try {
            com.google.android.gms.common.api.internal.zaby zabyVar = this.zal;
            if (zabyVar == null) {
                throw new java.lang.IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.zap) {
                this.zaa.add(t);
                while (!this.zaa.isEmpty()) {
                    com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl = (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) this.zaa.remove();
                    this.zai.zaa(apiMethodImpl);
                    apiMethodImpl.setFailedResult(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
                }
            } else {
                t = (T) zabyVar.zaf(t);
            }
            this.zaj.unlock();
            return t;
        } catch (java.lang.Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <C extends com.google.android.gms.common.api.Api.Client> C getClient(com.google.android.gms.common.api.Api.AnyClientKey<C> anyClientKey) {
        C c = (C) this.zac.get(anyClientKey);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.Api<?> api) {
        com.google.android.gms.common.ConnectionResult connectionResult;
        this.zaj.lock();
        try {
            if (!isConnected() && !this.zap) {
                throw new java.lang.IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.zac.containsKey(api.zab())) {
                throw new java.lang.IllegalArgumentException(api.zad() + " was never registered with GoogleApiClient");
            }
            com.google.android.gms.common.ConnectionResult connectionResultZad = ((com.google.android.gms.common.api.internal.zaby) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zal)).zad(api);
            if (connectionResultZad != null) {
                this.zaj.unlock();
                return connectionResultZad;
            }
            if (this.zap) {
                connectionResult = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
            } else {
                android.util.Log.w("GoogleApiClientImpl", zaf());
                android.util.Log.wtf("GoogleApiClientImpl", api.zad() + " requested in getConnectionResult is not connected but is not present in the failed  connections map", new java.lang.Exception());
                connectionResult = new com.google.android.gms.common.ConnectionResult(8, null);
            }
            this.zaj.unlock();
            return connectionResult;
        } catch (java.lang.Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.content.Context getContext() {
        return this.zan;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.os.Looper getLooper() {
        return this.zao;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(com.google.android.gms.common.api.Api<?> api) {
        return this.zac.containsKey(api.zab());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(com.google.android.gms.common.api.Api<?> api) {
        com.google.android.gms.common.api.Api.Client client;
        return isConnected() && (client = (com.google.android.gms.common.api.Api.Client) this.zac.get(api.zab())) != null && client.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        com.google.android.gms.common.api.internal.zaby zabyVar = this.zal;
        return zabyVar != null && zabyVar.zaw();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        com.google.android.gms.common.api.internal.zaby zabyVar = this.zal;
        return zabyVar != null && zabyVar.zax();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zak.zaj(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zak.zak(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener) {
        com.google.android.gms.common.api.internal.zaby zabyVar = this.zal;
        return zabyVar != null && zabyVar.zay(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        com.google.android.gms.common.api.internal.zaby zabyVar = this.zal;
        if (zabyVar != null) {
            zabyVar.zau();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zaf(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zag(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(L l) {
        this.zaj.lock();
        try {
            return this.zau.zaa(l, this.zao, "NO_TYPE");
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(androidx.fragment.app.FragmentActivity fragmentActivity) {
        com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity = new com.google.android.gms.common.api.internal.LifecycleActivity((android.app.Activity) fragmentActivity);
        if (this.zam < 0) {
            throw new java.lang.IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        com.google.android.gms.common.api.internal.zak.zaa(lifecycleActivity).zae(this.zam);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zah(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zai(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabx
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult) {
        if (!this.zat.isPlayServicesPossiblyUpdating(this.zan, connectionResult.getErrorCode())) {
            zak();
        }
        if (this.zap) {
            return;
        }
        this.zak.zac(connectionResult);
        this.zak.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.zabx
    public final void zab(android.os.Bundle bundle) {
        while (!this.zaa.isEmpty()) {
            execute((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) this.zaa.remove());
        }
        this.zak.zad(bundle);
    }

    final java.lang.String zaf() {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        dump("", null, new java.io.PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    final boolean zak() {
        if (!this.zap) {
            return false;
        }
        this.zap = false;
        this.zas.removeMessages(2);
        this.zas.removeMessages(1);
        com.google.android.gms.common.api.internal.zabv zabvVar = this.zab;
        if (zabvVar != null) {
            zabvVar.zab();
            this.zab = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(com.google.android.gms.common.api.internal.zacx zacxVar) {
        this.zaj.lock();
        try {
            if (this.zah == null) {
                this.zah = new java.util.HashSet();
            }
            this.zah.add(zacxVar);
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(com.google.android.gms.common.api.internal.zacx zacxVar) {
        this.zaj.lock();
        try {
            java.util.Set set = this.zah;
            if (set == null) {
                android.util.Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new java.lang.Exception());
            } else if (set.remove(zacxVar)) {
                this.zaj.lock();
                try {
                    java.util.Set set2 = this.zah;
                    if (set2 == null) {
                        this.zaj.unlock();
                    } else {
                        boolean z = !set2.isEmpty();
                        this.zaj.unlock();
                        if (!z) {
                        }
                    }
                    com.google.android.gms.common.api.internal.zaby zabyVar = this.zal;
                    if (zabyVar != null) {
                        zabyVar.zat();
                    }
                } finally {
                    this.zaj.unlock();
                }
            } else {
                android.util.Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new java.lang.Exception());
            }
        } catch (java.lang.Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabx
    public final void zac(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.zap) {
                this.zap = true;
                if (this.zab == null && !com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                    try {
                        this.zab = this.zat.zac(this.zan.getApplicationContext(), new com.google.android.gms.common.api.internal.zabb(this));
                    } catch (java.lang.SecurityException unused) {
                    }
                }
                com.google.android.gms.common.api.internal.zaba zabaVar = this.zas;
                zabaVar.sendMessageDelayed(zabaVar.obtainMessage(1), this.zaq);
                com.google.android.gms.common.api.internal.zaba zabaVar2 = this.zas;
                zabaVar2.sendMessageDelayed(zabaVar2.obtainMessage(2), this.zar);
            }
            i = 1;
        }
        for (com.google.android.gms.common.api.internal.BasePendingResult basePendingResult : (com.google.android.gms.common.api.internal.BasePendingResult[]) this.zai.zab.toArray(new com.google.android.gms.common.api.internal.BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(com.google.android.gms.common.api.internal.zacz.zaa);
        }
        this.zak.zae(i);
        this.zak.zaa();
        if (i == 2) {
            zan();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult blockingConnect(long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.common.internal.Preconditions.checkState(android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.zaj.lock();
        try {
            java.lang.Integer num = this.zaw;
            if (num != null) {
                if (num.intValue() == 2) {
                    throw new java.lang.IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            } else {
                this.zaw = java.lang.Integer.valueOf(zad(this.zac.values(), false));
            }
            zal(((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            com.google.android.gms.common.ConnectionResult connectionResultZac = ((com.google.android.gms.common.api.internal.zaby) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zal)).zac(j, timeUnit);
            this.zaj.unlock();
            return connectionResultZac;
        } catch (java.lang.Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i) {
        this.zaj.lock();
        boolean z = true;
        if (i != 3 && i != 1) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
            }
        }
        try {
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Illegal sign-in mode: " + i);
            zal(i);
            zan();
        } finally {
            this.zaj.unlock();
        }
    }
}
