package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zze extends androidx.loader.content.AsyncTaskLoader<java.lang.Void> implements com.google.android.gms.common.api.internal.SignInConnectionListener {
    private java.util.concurrent.Semaphore zzbg;
    private java.util.Set<com.google.android.gms.common.api.GoogleApiClient> zzbh;

    public zze(android.content.Context context, java.util.Set<com.google.android.gms.common.api.GoogleApiClient> set) {
        super(context);
        this.zzbg = new java.util.concurrent.Semaphore(0);
        this.zzbh = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.loader.content.AsyncTaskLoader
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void loadInBackground() {
        java.util.Iterator<com.google.android.gms.common.api.GoogleApiClient> it = this.zzbh.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.zzbg.tryAcquire(i, 5L, java.util.concurrent.TimeUnit.SECONDS);
            return null;
        } catch (java.lang.InterruptedException e) {
            android.util.Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            java.lang.Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // androidx.loader.content.Loader
    protected final void onStartLoading() {
        this.zzbg.drainPermits();
        forceLoad();
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.zzbg.release();
    }
}
