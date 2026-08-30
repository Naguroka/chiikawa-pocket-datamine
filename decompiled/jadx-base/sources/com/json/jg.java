package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class jg extends com.ironsource.ig.a<com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener> implements com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener {

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2821a;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener b;

        a(java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f2821a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.jg.this.a(this.f2821a, "onRewardedVideoAdLoadSuccess()");
            this.b.onRewardedVideoAdLoadSuccess(this.f2821a);
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2822a;
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError b;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener c;

        b(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f2822a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.jg.this.a(this.f2822a, "onRewardedVideoAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onRewardedVideoAdLoadFailed(this.f2822a, this.b);
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2823a;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener b;

        c(java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f2823a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.jg.this.a(this.f2823a, "onRewardedVideoAdOpened()");
            this.b.onRewardedVideoAdOpened(this.f2823a);
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2824a;
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError b;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener c;

        d(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f2824a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.jg.this.a(this.f2824a, "onRewardedVideoAdShowFailed() error = " + this.b.getErrorMessage());
            this.c.onRewardedVideoAdShowFailed(this.f2824a, this.b);
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2825a;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener b;

        e(java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f2825a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.jg.this.a(this.f2825a, "onRewardedVideoAdClicked()");
            this.b.onRewardedVideoAdClicked(this.f2825a);
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2826a;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener b;

        f(java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f2826a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.jg.this.a(this.f2826a, "onRewardedVideoAdRewarded()");
            this.b.onRewardedVideoAdRewarded(this.f2826a);
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2827a;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener b;

        g(java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f2827a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.jg.this.a(this.f2827a, "onRewardedVideoAdClosed()");
            this.b.onRewardedVideoAdClosed(this.f2827a);
        }
    }

    jg() {
    }

    jg(com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        b(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(java.lang.String str) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new com.ironsource.jg.e(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(java.lang.String str) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new com.ironsource.jg.g(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new com.ironsource.jg.b(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(java.lang.String str) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new com.ironsource.jg.a(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(java.lang.String str) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new com.ironsource.jg.c(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(java.lang.String str) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new com.ironsource.jg.f(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new com.ironsource.jg.d(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }
}
