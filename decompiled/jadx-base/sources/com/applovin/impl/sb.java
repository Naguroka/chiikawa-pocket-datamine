package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class sb implements com.applovin.adview.AppLovinInterstitialAdDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f1245a;
    private final java.lang.ref.WeakReference b;
    private final java.util.Map c = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private volatile com.applovin.sdk.AppLovinAdLoadListener d;
    private volatile com.applovin.sdk.AppLovinAdDisplayListener e;
    private volatile com.applovin.sdk.AppLovinAdVideoPlaybackListener f;
    private volatile com.applovin.sdk.AppLovinAdClickListener g;
    private volatile com.applovin.impl.sdk.ad.b h;

    public java.lang.String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    public java.util.Map h() {
        return this.c;
    }

    public com.applovin.sdk.AppLovinAdDisplayListener c() {
        return this.e;
    }

    public com.applovin.sdk.AppLovinAdVideoPlaybackListener d() {
        return this.f;
    }

    public com.applovin.impl.sdk.ad.b f() {
        return this.h;
    }

    public sb(com.applovin.sdk.AppLovinSdk appLovinSdk, android.content.Context context) {
        if (appLovinSdk == null) {
            throw new java.lang.IllegalArgumentException("No sdk specified");
        }
        if (context != null) {
            this.f1245a = appLovinSdk.a();
            this.b = new java.lang.ref.WeakReference(context);
            return;
        }
        throw new java.lang.IllegalArgumentException("No context specified");
    }

    class a implements com.applovin.sdk.AppLovinAdLoadListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
            com.applovin.impl.sb.this.b(appLovinAd);
            com.applovin.impl.sb.this.showAndRender(appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            com.applovin.impl.sb.this.b(i);
        }
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new com.applovin.impl.sb.a());
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.sdk.AppLovinAd appLovinAdA = com.applovin.impl.yp.a(appLovinAd, this.f1245a);
        android.content.Context contextE = e();
        java.lang.String strA = a(appLovinAdA, appLovinAd, contextE);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
            a(appLovinAd, strA);
        } else {
            a((com.applovin.impl.sdk.ad.b) appLovinAdA, contextE);
        }
    }

    public com.applovin.sdk.AppLovinAdClickListener b() {
        return this.g;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        this.d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        this.g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(java.lang.String str, java.lang.Object obj) {
        if (str != null) {
            this.c.put(str, obj);
            return;
        }
        throw new java.lang.IllegalArgumentException("No key specified");
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(com.applovin.sdk.AppLovinAd appLovinAd, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle) {
        if (viewGroup != null && lifecycle != null) {
            com.applovin.sdk.AppLovinAd appLovinAdA = com.applovin.impl.yp.a(appLovinAd, this.f1245a);
            android.content.Context contextE = e();
            java.lang.String strA = a(appLovinAdA, appLovinAd, contextE);
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
                a(appLovinAd, strA);
                return;
            }
            com.applovin.adview.AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new com.applovin.adview.AppLovinFullscreenAdViewObserver(lifecycle, this, this.f1245a);
            lifecycle.addObserver(appLovinFullscreenAdViewObserver);
            a((com.applovin.impl.sdk.ad.b) appLovinAdA, viewGroup, appLovinFullscreenAdViewObserver, contextE);
            return;
        }
        com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
        a(appLovinAd, "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
    }

    class b implements com.applovin.impl.o9.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f1247a;
        final /* synthetic */ com.applovin.adview.AppLovinFullscreenAdViewObserver b;
        final /* synthetic */ android.view.ViewGroup c;

        b(android.content.Context context, com.applovin.adview.AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, android.view.ViewGroup viewGroup) {
            this.f1247a = context;
            this.b = appLovinFullscreenAdViewObserver;
            this.c = viewGroup;
        }

        @Override // com.applovin.impl.o9.d
        public void a(com.applovin.impl.o9 o9Var) {
            if (com.applovin.impl.r.a((android.app.Activity) this.f1247a)) {
                com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                com.applovin.impl.sb.a(com.applovin.impl.sb.this.h, com.applovin.impl.sb.this.e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", null, null);
                return;
            }
            this.b.setPresenter(o9Var);
            try {
                o9Var.a(this.c);
            } catch (java.lang.Throwable th) {
                java.lang.String str = "Failed to show interstitial: presenter threw exception " + th;
                com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", str);
                com.applovin.impl.sb.a(com.applovin.impl.sb.this.h, com.applovin.impl.sb.this.e, str, null, null);
            }
        }

        @Override // com.applovin.impl.o9.d
        public void a(java.lang.String str, java.lang.Throwable th) {
            com.applovin.impl.sb.a(com.applovin.impl.sb.this.h, com.applovin.impl.sb.this.e, str, th, null);
        }
    }

    private long g() {
        java.lang.String str = this.f1245a.f0().getExtraParameters().get("fullscreen_ad_display_delay_enabled");
        if (str == null || java.lang.Boolean.parseBoolean(str)) {
            return java.lang.Math.max(0L, ((java.lang.Long) this.f1245a.a(com.applovin.impl.sj.c2)).longValue());
        }
        return 0L;
    }

    private void i() {
        if (this.f1245a.e().a() == null) {
            this.f1245a.C().c(com.applovin.impl.ba.r);
        }
    }

    private android.content.Context e() {
        return (android.content.Context) this.b.get();
    }

    public void a() {
        this.g = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    private void b(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.applovin.adview.AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f1245a.a0());
        com.applovin.adview.AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f1245a.e().a() == null && ((java.lang.Boolean) this.f1245a.a(com.applovin.impl.sj.B2)).booleanValue()) {
            intent.addFlags(8388608);
        }
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        if (context instanceof android.app.Activity) {
            context.startActivity(intent);
            ((android.app.Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    private void a(com.applovin.sdk.AppLovinAd appLovinAd, java.lang.String str) {
        if (this.e != null) {
            if (this.e instanceof com.applovin.impl.pb) {
                ((com.applovin.impl.pb) this.e).onAdDisplayFailed(str);
            } else {
                this.e.adHidden(appLovinAd);
            }
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, java.lang.String str, java.lang.Throwable th, com.applovin.adview.AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.n.c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof com.applovin.impl.pb) {
            com.applovin.impl.fc.a(appLovinAdDisplayListener, str);
        } else {
            com.applovin.impl.fc.b(appLovinAdDisplayListener, bVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sb$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.sdk.AppLovinAd appLovinAd) {
        if (this.d != null) {
            this.d.adReceived(appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        if (this.d != null) {
            this.d.failedToReceiveAd(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.content.Context context) {
        this.f1245a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1245a.I().a("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
        }
        b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.view.ViewGroup viewGroup, android.content.Context context, com.applovin.adview.AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.f1245a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1245a.I().a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        com.applovin.impl.o9.a(this.h, this.g, this.e, this.f, this.c, this.f1245a, (android.app.Activity) context, new com.applovin.impl.sb.b(context, appLovinFullscreenAdViewObserver, viewGroup));
    }

    private void a(com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f1245a.j().loadNextAd(com.applovin.sdk.AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private java.lang.String a(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.sdk.AppLovinAd appLovinAd2, android.content.Context context) {
        if (context == null) {
            com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        }
        if (appLovinAd == null) {
            com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        }
        if (!((com.applovin.impl.sdk.ad.AppLovinAdImpl) appLovinAd).hasShown() || !((java.lang.Boolean) this.f1245a.a(com.applovin.impl.sj.M1)).booleanValue()) {
            return null;
        }
        com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
        return "Attempting to show ad again";
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, android.content.Context context, final java.lang.Runnable runnable) {
        if (android.text.TextUtils.isEmpty(bVar.I()) && bVar.e1() && !com.applovin.impl.e4.a(context) && (context instanceof android.app.Activity)) {
            android.app.AlertDialog alertDialogCreate = new android.app.AlertDialog.Builder(context).setTitle(bVar.P()).setMessage(bVar.O()).setPositiveButton(bVar.N(), (android.content.DialogInterface.OnClickListener) null).create();
            alertDialogCreate.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: com.applovin.impl.sb$$ExternalSyntheticLambda5
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
            alertDialogCreate.show();
            return;
        }
        runnable.run();
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, final android.content.Context context) {
        i();
        this.f1245a.f().a(bVar);
        this.h = bVar;
        final long jG = g();
        this.f1245a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1245a.I().a("InterstitialAdDialogWrapper", "Presenting ad with delay " + jG + "ms...");
        }
        if (((java.lang.Boolean) this.f1245a.a(com.applovin.impl.sj.Y0)).booleanValue()) {
            this.f1245a.g().a(this.h);
        }
        a(bVar, context, new java.lang.Runnable() { // from class: com.applovin.impl.sb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(context, jG);
            }
        });
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, final android.view.ViewGroup viewGroup, final com.applovin.adview.AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, final android.content.Context context) {
        i();
        this.f1245a.f().a(bVar);
        this.h = bVar;
        final long jG = g();
        this.f1245a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1245a.I().a("InterstitialAdDialogWrapper", "Presenting ad with delay " + jG + "ms...");
        }
        if (((java.lang.Boolean) this.f1245a.a(com.applovin.impl.sj.Y0)).booleanValue()) {
            this.f1245a.g().a(this.h);
        }
        a(bVar, context, new java.lang.Runnable() { // from class: com.applovin.impl.sb$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(context, viewGroup, appLovinFullscreenAdViewObserver, jG);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final android.content.Context context, long j) {
        new android.os.Handler(context.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.sb$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(context);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final android.content.Context context, final android.view.ViewGroup viewGroup, final com.applovin.adview.AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, long j) {
        new android.os.Handler(context.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.sb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(viewGroup, context, appLovinFullscreenAdViewObserver);
            }
        }, j);
    }
}
