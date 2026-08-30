package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class gg extends com.ironsource.ig.a<com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener> implements com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener {

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2686a;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener b;

        a(java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f2686a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.gg.this.a(this.f2686a, "onInterstitialAdReady()");
            this.b.onInterstitialAdReady(this.f2686a);
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2687a;
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError b;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener c;

        b(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f2687a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.gg.this.a(this.f2687a, "onInterstitialAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdLoadFailed(this.f2687a, this.b);
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2688a;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener b;

        c(java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f2688a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.gg.this.a(this.f2688a, "onInterstitialAdOpened()");
            this.b.onInterstitialAdOpened(this.f2688a);
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2689a;
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError b;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener c;

        d(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f2689a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.gg.this.a(this.f2689a, "onInterstitialAdShowFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdShowFailed(this.f2689a, this.b);
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2690a;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener b;

        e(java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f2690a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.gg.this.a(this.f2690a, "onInterstitialAdClicked()");
            this.b.onInterstitialAdClicked(this.f2690a);
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2691a;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener b;

        f(java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f2691a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.gg.this.a(this.f2691a, "onInterstitialAdClosed()");
            this.b.onInterstitialAdClosed(this.f2691a);
        }
    }

    gg() {
    }

    gg(com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        b(iSDemandOnlyInterstitialListener);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(java.lang.String str) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new com.ironsource.gg.e(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(java.lang.String str) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new com.ironsource.gg.f(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new com.ironsource.gg.b(str, ironSourceError, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(java.lang.String str) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new com.ironsource.gg.c(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(java.lang.String str) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new com.ironsource.gg.a(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new com.ironsource.gg.d(str, ironSourceError, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }
}
