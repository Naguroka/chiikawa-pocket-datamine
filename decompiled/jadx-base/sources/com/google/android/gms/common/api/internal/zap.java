package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zap extends com.google.android.gms.common.api.internal.LifecycleCallback implements android.content.DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final java.util.concurrent.atomic.AtomicReference zab;
    protected final com.google.android.gms.common.GoogleApiAvailability zac;
    private final android.os.Handler zad;

    zap(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zab = new java.util.concurrent.atomic.AtomicReference(null);
        this.zad = new com.google.android.gms.internal.base.zaq(android.os.Looper.getMainLooper());
        this.zac = googleApiAvailability;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        this.zab.set(null);
        zab(connectionResult, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zad() {
        this.zab.set(null);
        zac();
    }

    private static final int zae(com.google.android.gms.common.api.internal.zam zamVar) {
        if (zamVar == null) {
            return -1;
        }
        return zamVar.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        com.google.android.gms.common.api.internal.zam zamVar = (com.google.android.gms.common.api.internal.zam) this.zab.get();
        if (i != 1) {
            if (i == 2) {
                int iIsGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(getActivity());
                if (iIsGooglePlayServicesAvailable == 0) {
                    zad();
                    return;
                } else {
                    if (zamVar == null) {
                        return;
                    }
                    if (zamVar.zab().getErrorCode() == 18 && iIsGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            zad();
            return;
        } else if (i2 == 0) {
            if (zamVar != null) {
                zaa(new com.google.android.gms.common.ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, zamVar.zab().toString()), zae(zamVar));
                return;
            }
            return;
        }
        if (zamVar != null) {
            zaa(zamVar.zab(), zamVar.zaa());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        zaa(new com.google.android.gms.common.ConnectionResult(13, null), zae((com.google.android.gms.common.api.internal.zam) this.zab.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zab.set(bundle.getBoolean("resolving_error", false) ? new com.google.android.gms.common.api.internal.zam(new com.google.android.gms.common.ConnectionResult(bundle.getInt("failed_status"), (android.app.PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.google.android.gms.common.api.internal.zam zamVar = (com.google.android.gms.common.api.internal.zam) this.zab.get();
        if (zamVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", zamVar.zaa());
        bundle.putInt("failed_status", zamVar.zab().getErrorCode());
        bundle.putParcelable("failed_resolution", zamVar.zab().getResolution());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.zaa = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.zaa = false;
    }

    protected abstract void zab(com.google.android.gms.common.ConnectionResult connectionResult, int i);

    protected abstract void zac();

    public final void zah(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        com.google.android.gms.common.api.internal.zam zamVar = new com.google.android.gms.common.api.internal.zam(connectionResult, i);
        do {
            atomicReference = this.zab;
            if (kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReference, null, zamVar)) {
                this.zad.post(new com.google.android.gms.common.api.internal.zao(this, zamVar));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
