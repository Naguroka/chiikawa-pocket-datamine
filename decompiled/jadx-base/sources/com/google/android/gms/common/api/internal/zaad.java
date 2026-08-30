package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zaad extends com.google.android.gms.common.api.internal.zap {
    private final androidx.collection.ArraySet zad;
    private final com.google.android.gms.common.api.internal.GoogleApiManager zae;

    zaad(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment, com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.zad = new androidx.collection.ArraySet();
        this.zae = googleApiManager;
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    public static void zad(android.app.Activity activity, com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, com.google.android.gms.common.api.internal.ApiKey apiKey) {
        com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(activity);
        com.google.android.gms.common.api.internal.zaad zaadVar = (com.google.android.gms.common.api.internal.zaad) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", com.google.android.gms.common.api.internal.zaad.class);
        if (zaadVar == null) {
            zaadVar = new com.google.android.gms.common.api.internal.zaad(fragment, googleApiManager, com.google.android.gms.common.GoogleApiAvailability.getInstance());
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(apiKey, "ApiKey cannot be null");
        zaadVar.zad.add(apiKey);
        googleApiManager.zaA(zaadVar);
    }

    private final void zae() {
        if (this.zad.isEmpty()) {
            return;
        }
        this.zae.zaA(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        zae();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        zae();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        this.zae.zaB(this);
    }

    final androidx.collection.ArraySet zaa() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zab(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        this.zae.zax(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zac() {
        this.zae.zay();
    }
}
