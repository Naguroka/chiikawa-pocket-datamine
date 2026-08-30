package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaz implements com.google.android.gms.common.api.internal.zaby {
    private final android.content.Context zaa;
    private final com.google.android.gms.common.api.internal.zabc zab;
    private final android.os.Looper zac;
    private final com.google.android.gms.common.api.internal.zabg zad;
    private final com.google.android.gms.common.api.internal.zabg zae;
    private final java.util.Map zaf;
    private final com.google.android.gms.common.api.Api.Client zah;
    private android.os.Bundle zai;
    private final java.util.concurrent.locks.Lock zam;
    private final java.util.Set zag = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    private com.google.android.gms.common.ConnectionResult zaj = null;
    private com.google.android.gms.common.ConnectionResult zak = null;
    private boolean zal = false;
    private int zan = 0;

    private zaz(android.content.Context context, com.google.android.gms.common.api.internal.zabc zabcVar, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, java.util.Map map, java.util.Map map2, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder, com.google.android.gms.common.api.Api.Client client, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.Map map3, java.util.Map map4) {
        this.zaa = context;
        this.zab = zabcVar;
        this.zam = lock;
        this.zac = looper;
        this.zah = client;
        this.zad = new com.google.android.gms.common.api.internal.zabg(context, zabcVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new com.google.android.gms.common.api.internal.zaw(this, null));
        this.zae = new com.google.android.gms.common.api.internal.zabg(context, zabcVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new com.google.android.gms.common.api.internal.zax(this, null));
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        java.util.Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            arrayMap.put((com.google.android.gms.common.api.Api.AnyClientKey) it.next(), this.zad);
        }
        java.util.Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            arrayMap.put((com.google.android.gms.common.api.Api.AnyClientKey) it2.next(), this.zae);
        }
        this.zaf = java.util.Collections.unmodifiableMap(arrayMap);
    }

    private final void zaB() {
        java.util.Iterator it = this.zag.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.SignInConnectionListener) it.next()).onComplete();
        }
        this.zag.clear();
    }

    private final boolean zaC() {
        com.google.android.gms.common.ConnectionResult connectionResult = this.zak;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final boolean zaD(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        com.google.android.gms.common.api.internal.zabg zabgVar = (com.google.android.gms.common.api.internal.zabg) this.zaf.get(apiMethodImpl.getClientKey());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zabgVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabgVar.equals(this.zae);
    }

    private static boolean zaE(com.google.android.gms.common.ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    public static com.google.android.gms.common.api.internal.zaz zag(android.content.Context context, com.google.android.gms.common.api.internal.zabc zabcVar, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, java.util.Map map, com.google.android.gms.common.internal.ClientSettings clientSettings, java.util.Map map2, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder, java.util.ArrayList arrayList) {
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap();
        com.google.android.gms.common.api.Api.Client client = null;
        for (java.util.Map.Entry entry : map.entrySet()) {
            com.google.android.gms.common.api.Api.Client client2 = (com.google.android.gms.common.api.Api.Client) entry.getValue();
            if (true == client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                arrayMap.put((com.google.android.gms.common.api.Api.AnyClientKey) entry.getKey(), client2);
            } else {
                arrayMap2.put((com.google.android.gms.common.api.Api.AnyClientKey) entry.getKey(), client2);
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkState(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        androidx.collection.ArrayMap arrayMap3 = new androidx.collection.ArrayMap();
        androidx.collection.ArrayMap arrayMap4 = new androidx.collection.ArrayMap();
        for (com.google.android.gms.common.api.Api api : map2.keySet()) {
            com.google.android.gms.common.api.Api.AnyClientKey anyClientKeyZab = api.zab();
            if (arrayMap.containsKey(anyClientKeyZab)) {
                arrayMap3.put(api, (java.lang.Boolean) map2.get(api));
            } else {
                if (!arrayMap2.containsKey(anyClientKeyZab)) {
                    throw new java.lang.IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                arrayMap4.put(api, (java.lang.Boolean) map2.get(api));
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.common.api.internal.zat zatVar = (com.google.android.gms.common.api.internal.zat) arrayList.get(i);
            if (arrayMap3.containsKey(zatVar.zaa)) {
                arrayList2.add(zatVar);
            } else {
                if (!arrayMap4.containsKey(zatVar.zaa)) {
                    throw new java.lang.IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(zatVar);
            }
        }
        return new com.google.android.gms.common.api.internal.zaz(context, zabcVar, lock, looper, googleApiAvailabilityLight, arrayMap, arrayMap2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    static /* bridge */ /* synthetic */ void zan(com.google.android.gms.common.api.internal.zaz zazVar, int i, boolean z) {
        zazVar.zab.zac(i, z);
        zazVar.zak = null;
        zazVar.zaj = null;
    }

    static /* bridge */ /* synthetic */ void zao(com.google.android.gms.common.api.internal.zaz zazVar, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = zazVar.zai;
        if (bundle2 == null) {
            zazVar.zai = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    static /* bridge */ /* synthetic */ void zap(com.google.android.gms.common.api.internal.zaz zazVar) {
        com.google.android.gms.common.ConnectionResult connectionResult;
        if (!zaE(zazVar.zaj)) {
            if (zazVar.zaj != null && zaE(zazVar.zak)) {
                zazVar.zae.zar();
                zazVar.zaA((com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull(zazVar.zaj));
                return;
            }
            com.google.android.gms.common.ConnectionResult connectionResult2 = zazVar.zaj;
            if (connectionResult2 == null || (connectionResult = zazVar.zak) == null) {
                return;
            }
            if (zazVar.zae.zaf < zazVar.zad.zaf) {
                connectionResult2 = connectionResult;
            }
            zazVar.zaA(connectionResult2);
            return;
        }
        if (zaE(zazVar.zak) || zazVar.zaC()) {
            int i = zazVar.zan;
            if (i == 1) {
                zazVar.zaB();
            } else if (i != 2) {
                android.util.Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new java.lang.AssertionError());
            } else {
                ((com.google.android.gms.common.api.internal.zabc) com.google.android.gms.common.internal.Preconditions.checkNotNull(zazVar.zab)).zab(zazVar.zai);
                zazVar.zaB();
            }
            zazVar.zan = 0;
            return;
        }
        com.google.android.gms.common.ConnectionResult connectionResult3 = zazVar.zak;
        if (connectionResult3 != null) {
            if (zazVar.zan == 1) {
                zazVar.zaB();
            } else {
                zazVar.zaA(connectionResult3);
                zazVar.zad.zar();
            }
        }
    }

    private final android.app.PendingIntent zaz() {
        com.google.android.gms.common.api.Api.Client client = this.zah;
        if (client == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(this.zaa, java.lang.System.identityHashCode(this.zab), client.getSignInIntent(), com.google.android.gms.internal.base.zal.zaa | androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final com.google.android.gms.common.ConnectionResult zab() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final com.google.android.gms.common.ConnectionResult zac(long j, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final com.google.android.gms.common.ConnectionResult zad(com.google.android.gms.common.api.Api api) {
        if (com.google.android.gms.common.internal.Objects.equal(this.zaf.get(api.zab()), this.zae)) {
            return zaC() ? new com.google.android.gms.common.ConnectionResult(4, zaz()) : this.zae.zad(api);
        }
        return this.zad.zad(api);
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zae(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!zaD(apiMethodImpl)) {
            this.zad.zae(apiMethodImpl);
            return apiMethodImpl;
        }
        if (zaC()) {
            apiMethodImpl.setFailedResult(new com.google.android.gms.common.api.Status(4, (java.lang.String) null, zaz()));
            return apiMethodImpl;
        }
        this.zae.zae(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaf(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!zaD(apiMethodImpl)) {
            return this.zad.zaf(apiMethodImpl);
        }
        if (!zaC()) {
            return this.zae.zaf(apiMethodImpl);
        }
        apiMethodImpl.setFailedResult(new com.google.android.gms.common.api.Status(4, (java.lang.String) null, zaz()));
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final void zaq() {
        this.zan = 2;
        this.zal = false;
        this.zak = null;
        this.zaj = null;
        this.zad.zaq();
        this.zae.zaq();
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final void zar() {
        this.zak = null;
        this.zaj = null;
        this.zan = 0;
        this.zad.zar();
        this.zae.zar();
        zaB();
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final void zas(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.append((java.lang.CharSequence) str).append("authClient").println(":");
        this.zae.zas(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((java.lang.CharSequence) str).append("anonClient").println(":");
        this.zad.zas(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final void zat() {
        this.zad.zat();
        this.zae.zat();
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final void zau() {
        this.zam.lock();
        try {
            boolean zZax = zax();
            this.zae.zar();
            this.zak = new com.google.android.gms.common.ConnectionResult(4);
            if (zZax) {
                new com.google.android.gms.internal.base.zaq(this.zac).post(new com.google.android.gms.common.api.internal.zav(this));
            } else {
                zaB();
            }
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final boolean zaw() {
        this.zam.lock();
        try {
            boolean z = false;
            if (this.zad.zaw() && (this.zae.zaw() || zaC() || this.zan == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final boolean zax() {
        this.zam.lock();
        try {
            return this.zan == 2;
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaby
    public final boolean zay(com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener) {
        this.zam.lock();
        try {
            boolean z = false;
            if ((zax() || zaw()) && !this.zae.zaw()) {
                this.zag.add(signInConnectionListener);
                z = true;
                if (this.zan == 0) {
                    this.zan = 1;
                }
                this.zak = null;
                this.zae.zaq();
            }
            return z;
        } finally {
            this.zam.unlock();
        }
    }

    private final void zaA(com.google.android.gms.common.ConnectionResult connectionResult) {
        int i = this.zan;
        if (i == 1) {
            zaB();
        } else if (i != 2) {
            android.util.Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new java.lang.Exception());
        } else {
            this.zab.zaa(connectionResult);
            zaB();
        }
        this.zan = 0;
    }
}
