package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zak extends com.google.android.gms.common.api.internal.zap {
    private final android.util.SparseArray zad;

    private zak(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, com.google.android.gms.common.GoogleApiAvailability.getInstance());
        this.zad = new android.util.SparseArray();
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static com.google.android.gms.common.api.internal.zak zaa(com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity) {
        com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(lifecycleActivity);
        com.google.android.gms.common.api.internal.zak zakVar = (com.google.android.gms.common.api.internal.zak) fragment.getCallbackOrNull("AutoManageHelper", com.google.android.gms.common.api.internal.zak.class);
        return zakVar != null ? zakVar : new com.google.android.gms.common.api.internal.zak(fragment);
    }

    private final com.google.android.gms.common.api.internal.zaj zai(int i) {
        if (this.zad.size() <= i) {
            return null;
        }
        android.util.SparseArray sparseArray = this.zad;
        return (com.google.android.gms.common.api.internal.zaj) sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        for (int i = 0; i < this.zad.size(); i++) {
            com.google.android.gms.common.api.internal.zaj zajVarZai = zai(i);
            if (zajVarZai != null) {
                printWriter.append((java.lang.CharSequence) str).append("GoogleApiClient #").print(zajVarZai.zaa);
                printWriter.println(":");
                zajVarZai.zab.dump(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        android.util.SparseArray sparseArray = this.zad;
        android.util.Log.d("AutoManageHelper", "onStart " + this.zaa + " " + java.lang.String.valueOf(sparseArray));
        if (this.zab.get() == null) {
            for (int i = 0; i < this.zad.size(); i++) {
                com.google.android.gms.common.api.internal.zaj zajVarZai = zai(i);
                if (zajVarZai != null) {
                    zajVarZai.zab.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i = 0; i < this.zad.size(); i++) {
            com.google.android.gms.common.api.internal.zaj zajVarZai = zai(i);
            if (zajVarZai != null) {
                zajVarZai.zab.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zab(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        android.util.Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            android.util.Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new java.lang.Exception());
            return;
        }
        com.google.android.gms.common.api.internal.zaj zajVar = (com.google.android.gms.common.api.internal.zaj) this.zad.get(i);
        if (zajVar != null) {
            zae(i);
            com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zajVar.zac;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zac() {
        for (int i = 0; i < this.zad.size(); i++) {
            com.google.android.gms.common.api.internal.zaj zajVarZai = zai(i);
            if (zajVarZai != null) {
                zajVarZai.zab.connect();
            }
        }
    }

    public final void zad(int i, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        com.google.android.gms.common.internal.Preconditions.checkState(this.zad.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        com.google.android.gms.common.api.internal.zam zamVar = (com.google.android.gms.common.api.internal.zam) this.zab.get();
        android.util.Log.d("AutoManageHelper", "starting AutoManage for client " + i + " " + this.zaa + " " + java.lang.String.valueOf(zamVar));
        com.google.android.gms.common.api.internal.zaj zajVar = new com.google.android.gms.common.api.internal.zaj(this, i, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(zajVar);
        this.zad.put(i, zajVar);
        if (this.zaa && zamVar == null) {
            android.util.Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void zae(int i) {
        com.google.android.gms.common.api.internal.zaj zajVar = (com.google.android.gms.common.api.internal.zaj) this.zad.get(i);
        this.zad.remove(i);
        if (zajVar != null) {
            zajVar.zab.unregisterConnectionFailedListener(zajVar);
            zajVar.zab.disconnect();
        }
    }
}
