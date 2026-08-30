package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class p5 extends com.ironsource.ig.a<com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener> {

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3143a;
        final /* synthetic */ com.json.mediationsdk.logger.IronSourceError b;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener c;

        a(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f3143a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.p5.this.a(this.f3143a, "onBannerAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onBannerAdLoadFailed(this.f3143a, this.b);
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3144a;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener b;

        b(java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f3144a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.p5.this.a(this.f3144a, "onBannerAdLoaded()");
            this.b.onBannerAdLoaded(this.f3144a);
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3145a;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener b;

        c(java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f3145a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.p5.this.a(this.f3145a, "onBannerAdShown()");
            this.b.onBannerAdShown(this.f3145a);
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3146a;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener b;

        d(java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f3146a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.p5.this.a(this.f3146a, "onBannerAdClicked()");
            this.b.onBannerAdClicked(this.f3146a);
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3147a;
        final /* synthetic */ com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener b;

        e(java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f3147a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.p5.this.a(this.f3147a, "onBannerAdLeftApplication()");
            this.b.onBannerAdLeftApplication(this.f3147a);
        }
    }

    public void a(java.lang.String str) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new com.ironsource.p5.d(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void a(java.lang.String str, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new com.ironsource.p5.a(str, ironSourceError, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void b(java.lang.String str) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new com.ironsource.p5.e(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void c(java.lang.String str) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new com.ironsource.p5.b(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void d(java.lang.String str) {
        com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new com.ironsource.p5.c(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }
}
