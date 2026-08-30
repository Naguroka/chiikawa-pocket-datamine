package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zabo implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.common.api.internal.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final com.google.android.gms.common.api.Api.Client zac;
    private final com.google.android.gms.common.api.internal.ApiKey zad;
    private final com.google.android.gms.common.api.internal.zaac zae;
    private final int zah;
    private final com.google.android.gms.common.api.internal.zacq zai;
    private boolean zaj;
    private final java.util.Queue zab = new java.util.LinkedList();
    private final java.util.Set zaf = new java.util.HashSet();
    private final java.util.Map zag = new java.util.HashMap();
    private final java.util.List zak = new java.util.ArrayList();
    private com.google.android.gms.common.ConnectionResult zal = null;
    private int zam = 0;

    public zabo(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, com.google.android.gms.common.api.GoogleApi googleApi) {
        this.zaa = googleApiManager;
        com.google.android.gms.common.api.Api.Client clientZab = googleApi.zab(googleApiManager.zas.getLooper(), this);
        this.zac = clientZab;
        this.zad = googleApi.getApiKey();
        this.zae = new com.google.android.gms.common.api.internal.zaac();
        this.zah = googleApi.zaa();
        if (clientZab.requiresSignIn()) {
            this.zai = googleApi.zac(googleApiManager.zaj, googleApiManager.zas);
        } else {
            this.zai = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.google.android.gms.common.Feature zaC(com.google.android.gms.common.Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            com.google.android.gms.common.Feature[] availableFeatures = this.zac.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new com.google.android.gms.common.Feature[0];
            }
            androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(availableFeatures.length);
            for (com.google.android.gms.common.Feature feature : availableFeatures) {
                arrayMap.put(feature.getName(), java.lang.Long.valueOf(feature.getVersion()));
            }
            for (com.google.android.gms.common.Feature feature2 : featureArr) {
                java.lang.Long l = (java.lang.Long) arrayMap.get(feature2.getName());
                if (l == null || l.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final void zaD(com.google.android.gms.common.ConnectionResult connectionResult) {
        java.util.Iterator it = this.zaf.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.zal) it.next()).zac(this.zad, connectionResult, com.google.android.gms.common.internal.Objects.equal(connectionResult, com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS) ? this.zac.getEndpointPackageName() : null);
        }
        this.zaf.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaE(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
        zaF(status, null, false);
    }

    private final void zaF(com.google.android.gms.common.api.Status status, java.lang.Exception exc, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
        if ((status == null) == (exc == null)) {
            throw new java.lang.IllegalArgumentException("Status XOR exception should be null");
        }
        java.util.Iterator it = this.zab.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.internal.zai zaiVar = (com.google.android.gms.common.api.internal.zai) it.next();
            if (!z || zaiVar.zac == 2) {
                if (status != null) {
                    zaiVar.zad(status);
                } else {
                    zaiVar.zae(exc);
                }
                it.remove();
            }
        }
    }

    private final void zaG() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zab);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.common.api.internal.zai zaiVar = (com.google.android.gms.common.api.internal.zai) arrayList.get(i);
            if (!this.zac.isConnected()) {
                return;
            }
            if (zaM(zaiVar)) {
                this.zab.remove(zaiVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaH() {
        zan();
        zaD(com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS);
        zaL();
        java.util.Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.internal.zacg zacgVar = (com.google.android.gms.common.api.internal.zacg) it.next();
            if (zaC(zacgVar.zaa.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    zacgVar.zaa.registerListener(this.zac, new com.google.android.gms.tasks.TaskCompletionSource<>());
                } catch (android.os.DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (android.os.RemoteException e) {
                    e = e;
                    android.util.Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (java.lang.RuntimeException e2) {
                    e = e2;
                    android.util.Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        zaG();
        zaJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaI(int i) {
        zan();
        this.zaj = true;
        this.zae.zae(i, this.zac.getLastDisconnectMessage());
        com.google.android.gms.common.api.internal.ApiKey apiKey = this.zad;
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zas.sendMessageDelayed(android.os.Message.obtain(googleApiManager.zas, 9, apiKey), 5000L);
        com.google.android.gms.common.api.internal.ApiKey apiKey2 = this.zad;
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zas.sendMessageDelayed(android.os.Message.obtain(googleApiManager2.zas, 11, apiKey2), com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        this.zaa.zal.zac();
        java.util.Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.zacg) it.next()).zac.run();
        }
    }

    private final void zaJ() {
        this.zaa.zas.removeMessages(12, this.zad);
        com.google.android.gms.common.api.internal.ApiKey apiKey = this.zad;
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zas.sendMessageDelayed(googleApiManager.zas.obtainMessage(12, apiKey), this.zaa.zaf);
    }

    private final void zaK(com.google.android.gms.common.api.internal.zai zaiVar) {
        zaiVar.zag(this.zae, zaA());
        try {
            zaiVar.zaf(this);
        } catch (android.os.DeadObjectException unused) {
            onConnectionSuspended(1);
            this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void zaL() {
        if (this.zaj) {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zas.removeMessages(11, this.zad);
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
            googleApiManager2.zas.removeMessages(9, this.zad);
            this.zaj = false;
        }
    }

    private final boolean zaM(com.google.android.gms.common.api.internal.zai zaiVar) {
        if (!(zaiVar instanceof com.google.android.gms.common.api.internal.zac)) {
            zaK(zaiVar);
            return true;
        }
        com.google.android.gms.common.api.internal.zac zacVar = (com.google.android.gms.common.api.internal.zac) zaiVar;
        com.google.android.gms.common.Feature featureZaC = zaC(zacVar.zab(this));
        if (featureZaC == null) {
            zaK(zaiVar);
            return true;
        }
        android.util.Log.w("GoogleApiManager", this.zac.getClass().getName() + " could not execute call because it requires feature (" + featureZaC.getName() + ", " + featureZaC.getVersion() + ").");
        if (!this.zaa.zat || !zacVar.zaa(this)) {
            zacVar.zae(new com.google.android.gms.common.api.UnsupportedApiCallException(featureZaC));
            return true;
        }
        com.google.android.gms.common.api.internal.zabp zabpVar = new com.google.android.gms.common.api.internal.zabp(this.zad, featureZaC, null);
        int iIndexOf = this.zak.indexOf(zabpVar);
        if (iIndexOf >= 0) {
            com.google.android.gms.common.api.internal.zabp zabpVar2 = (com.google.android.gms.common.api.internal.zabp) this.zak.get(iIndexOf);
            this.zaa.zas.removeMessages(15, zabpVar2);
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zas.sendMessageDelayed(android.os.Message.obtain(googleApiManager.zas, 15, zabpVar2), 5000L);
            return false;
        }
        this.zak.add(zabpVar);
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zas.sendMessageDelayed(android.os.Message.obtain(googleApiManager2.zas, 15, zabpVar), 5000L);
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager3 = this.zaa;
        googleApiManager3.zas.sendMessageDelayed(android.os.Message.obtain(googleApiManager3.zas, 16, zabpVar), com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(2, null);
        if (zaN(connectionResult)) {
            return false;
        }
        this.zaa.zaG(connectionResult, this.zah);
        return false;
    }

    private final boolean zaN(com.google.android.gms.common.ConnectionResult connectionResult) {
        synchronized (com.google.android.gms.common.api.internal.GoogleApiManager.zac) {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            if (googleApiManager.zap == null || !googleApiManager.zaq.contains(this.zad)) {
                return false;
            }
            this.zaa.zap.zah(connectionResult, this.zah);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaO(boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
        if (!this.zac.isConnected() || !this.zag.isEmpty()) {
            return false;
        }
        if (!this.zae.zag()) {
            this.zac.disconnect("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        zaJ();
        return false;
    }

    static /* bridge */ /* synthetic */ void zal(com.google.android.gms.common.api.internal.zabo zaboVar, com.google.android.gms.common.api.internal.zabp zabpVar) {
        if (zaboVar.zak.contains(zabpVar) && !zaboVar.zaj) {
            if (zaboVar.zac.isConnected()) {
                zaboVar.zaG();
            } else {
                zaboVar.zao();
            }
        }
    }

    static /* bridge */ /* synthetic */ void zam(com.google.android.gms.common.api.internal.zabo zaboVar, com.google.android.gms.common.api.internal.zabp zabpVar) {
        com.google.android.gms.common.Feature[] featureArrZab;
        if (zaboVar.zak.remove(zabpVar)) {
            zaboVar.zaa.zas.removeMessages(15, zabpVar);
            zaboVar.zaa.zas.removeMessages(16, zabpVar);
            com.google.android.gms.common.Feature feature = zabpVar.zab;
            java.util.ArrayList arrayList = new java.util.ArrayList(zaboVar.zab.size());
            for (com.google.android.gms.common.api.internal.zai zaiVar : zaboVar.zab) {
                if ((zaiVar instanceof com.google.android.gms.common.api.internal.zac) && (featureArrZab = ((com.google.android.gms.common.api.internal.zac) zaiVar).zab(zaboVar)) != null && com.google.android.gms.common.util.ArrayUtils.contains(featureArrZab, feature)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                com.google.android.gms.common.api.internal.zai zaiVar2 = (com.google.android.gms.common.api.internal.zai) arrayList.get(i);
                zaboVar.zab.remove(zaiVar2);
                zaiVar2.zae(new com.google.android.gms.common.api.UnsupportedApiCallException(feature));
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        if (android.os.Looper.myLooper() == this.zaa.zas.getLooper()) {
            zaH();
        } else {
            this.zaa.zas.post(new com.google.android.gms.common.api.internal.zabk(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        zar(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        if (android.os.Looper.myLooper() == this.zaa.zas.getLooper()) {
            zaI(i);
        } else {
            this.zaa.zas.post(new com.google.android.gms.common.api.internal.zabl(this, i));
        }
    }

    public final boolean zaA() {
        return this.zac.requiresSignIn();
    }

    public final boolean zaB() {
        return zaO(true);
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api api, boolean z) {
        throw null;
    }

    public final int zab() {
        return this.zah;
    }

    final int zac() {
        return this.zam;
    }

    public final com.google.android.gms.common.ConnectionResult zad() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
        return this.zal;
    }

    public final com.google.android.gms.common.api.Api.Client zaf() {
        return this.zac;
    }

    public final java.util.Map zah() {
        return this.zag;
    }

    public final void zan() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
        this.zal = null;
    }

    public final void zao() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
        if (this.zac.isConnected() || this.zac.isConnecting()) {
            return;
        }
        try {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            int iZab = googleApiManager.zal.zab(googleApiManager.zaj, this.zac);
            if (iZab != 0) {
                com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(iZab, null);
                android.util.Log.w("GoogleApiManager", "The service for " + this.zac.getClass().getName() + " is not available: " + connectionResult.toString());
                zar(connectionResult, null);
                return;
            }
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
            com.google.android.gms.common.api.Api.Client client = this.zac;
            com.google.android.gms.common.api.internal.zabr zabrVar = new com.google.android.gms.common.api.internal.zabr(googleApiManager2, client, this.zad);
            if (client.requiresSignIn()) {
                ((com.google.android.gms.common.api.internal.zacq) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zai)).zae(zabrVar);
            }
            try {
                this.zac.connect(zabrVar);
            } catch (java.lang.SecurityException e) {
                zar(new com.google.android.gms.common.ConnectionResult(10), e);
            }
        } catch (java.lang.IllegalStateException e2) {
            zar(new com.google.android.gms.common.ConnectionResult(10), e2);
        }
    }

    public final void zap(com.google.android.gms.common.api.internal.zai zaiVar) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
        if (this.zac.isConnected()) {
            if (zaM(zaiVar)) {
                zaJ();
                return;
            } else {
                this.zab.add(zaiVar);
                return;
            }
        }
        this.zab.add(zaiVar);
        com.google.android.gms.common.ConnectionResult connectionResult = this.zal;
        if (connectionResult == null || !connectionResult.hasResolution()) {
            zao();
        } else {
            zar(this.zal, null);
        }
    }

    final void zaq() {
        this.zam++;
    }

    public final void zar(com.google.android.gms.common.ConnectionResult connectionResult, java.lang.Exception exc) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
        com.google.android.gms.common.api.internal.zacq zacqVar = this.zai;
        if (zacqVar != null) {
            zacqVar.zaf();
        }
        zan();
        this.zaa.zal.zac();
        zaD(connectionResult);
        if ((this.zac instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.getErrorCode() != 24) {
            this.zaa.zag = true;
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zas.sendMessageDelayed(googleApiManager.zas.obtainMessage(19), 300000L);
        }
        if (connectionResult.getErrorCode() == 4) {
            zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zab);
            return;
        }
        if (connectionResult.getErrorCode() == 25) {
            zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zaH(this.zad, connectionResult));
            return;
        }
        if (this.zab.isEmpty()) {
            this.zal = connectionResult;
            return;
        }
        if (exc != null) {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
            zaF(null, exc, false);
            return;
        }
        if (!this.zaa.zat) {
            zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zaH(this.zad, connectionResult));
            return;
        }
        zaF(com.google.android.gms.common.api.internal.GoogleApiManager.zaH(this.zad, connectionResult), null, true);
        if (this.zab.isEmpty() || zaN(connectionResult) || this.zaa.zaG(connectionResult, this.zah)) {
            return;
        }
        if (connectionResult.getErrorCode() == 18) {
            this.zaj = true;
        }
        if (!this.zaj) {
            zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zaH(this.zad, connectionResult));
            return;
        }
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zas.sendMessageDelayed(android.os.Message.obtain(googleApiManager2.zas, 9, this.zad), 5000L);
    }

    public final void zas(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
        com.google.android.gms.common.api.Api.Client client = this.zac;
        client.disconnect("onSignInFailed for " + client.getClass().getName() + " with " + java.lang.String.valueOf(connectionResult));
        zar(connectionResult, null);
    }

    public final void zat(com.google.android.gms.common.api.internal.zal zalVar) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
        this.zaf.add(zalVar);
    }

    public final void zau() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
        if (this.zaj) {
            zao();
        }
    }

    public final void zav() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
        zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zaa);
        this.zae.zaf();
        for (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey : (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[]) this.zag.keySet().toArray(new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[0])) {
            zap(new com.google.android.gms.common.api.internal.zah(listenerKey, new com.google.android.gms.tasks.TaskCompletionSource()));
        }
        zaD(new com.google.android.gms.common.ConnectionResult(4));
        if (this.zac.isConnected()) {
            this.zac.onUserSignOut(new com.google.android.gms.common.api.internal.zabn(this));
        }
    }

    public final void zaw() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zas);
        if (this.zaj) {
            zaL();
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            zaE(googleApiManager.zak.isGooglePlayServicesAvailable(googleApiManager.zaj) == 18 ? new com.google.android.gms.common.api.Status(21, "Connection timed out waiting for Google Play services update to complete.") : new com.google.android.gms.common.api.Status(22, "API failed to connect while resuming due to an unknown error."));
            this.zac.disconnect("Timing out connection while resuming.");
        }
    }

    final boolean zaz() {
        return this.zac.isConnected();
    }
}
