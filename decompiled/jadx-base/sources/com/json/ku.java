package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u001d¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0007\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J(\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u000fH\u0016R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#¨\u0006("}, d2 = {"Lcom/ironsource/ku;", "Lcom/ironsource/ut$c;", "Lcom/ironsource/ut$d;", "Lcom/ironsource/ut$b;", "Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;", "activity", "Landroid/widget/RelativeLayout;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "marginPercentageFromTop", "Landroid/widget/FrameLayout$LayoutParams;", "b", "f", "Lcom/ironsource/au;", "loadAdConfig", "", "", "e", "c", "d", "", "description", "", "width", "height", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "mTestSuiteActivityWeakReference", "Landroid/os/Handler;", "Landroid/os/Handler;", "mHandler", "Landroid/widget/RelativeLayout;", "mBannerContainer", "Lcom/ironsource/mediationsdk/IronSourceBannerLayout;", "Lcom/ironsource/mediationsdk/IronSourceBannerLayout;", "mBannerLayout", "handler", "<init>", "(Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;Landroid/os/Handler;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ku implements com.ironsource.ut.c, com.ironsource.ut.d, com.ironsource.ut.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.ref.WeakReference<com.json.mediationsdk.testSuite.TestSuiteActivity> mTestSuiteActivityWeakReference;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final android.os.Handler mHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private android.widget.RelativeLayout mBannerContainer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private com.json.mediationsdk.IronSourceBannerLayout mBannerLayout;

    public ku(com.json.mediationsdk.testSuite.TestSuiteActivity activity, android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        this.mTestSuiteActivityWeakReference = new java.lang.ref.WeakReference<>(activity);
        this.mHandler = handler;
    }

    private final android.widget.RelativeLayout a(com.json.mediationsdk.testSuite.TestSuiteActivity activity) {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(activity);
        relativeLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.ku this$0) {
        android.widget.RelativeLayout container;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.widget.RelativeLayout relativeLayout = this$0.mBannerContainer;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        com.json.mediationsdk.testSuite.TestSuiteActivity testSuiteActivityF = this$0.f();
        if (testSuiteActivityF != null && (container = testSuiteActivityF.getContainer()) != null) {
            container.removeView(this$0.mBannerContainer);
        }
        this$0.mBannerContainer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.ku this$0, com.json.mediationsdk.testSuite.TestSuiteActivity testSuiteActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.widget.RelativeLayout relativeLayout = this$0.mBannerContainer;
        if (relativeLayout != null) {
            relativeLayout.addView(this$0.mBannerLayout);
        }
        testSuiteActivity.getContainer().addView(this$0.mBannerContainer);
    }

    private final android.widget.FrameLayout.LayoutParams b(double marginPercentageFromTop) {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) (((double) com.json.hu.f2727a.a()) * marginPercentageFromTop);
        return layoutParams;
    }

    private final com.json.mediationsdk.testSuite.TestSuiteActivity f() {
        return this.mTestSuiteActivityWeakReference.get();
    }

    @Override // com.ironsource.ut.b
    public void a(double marginPercentageFromTop) {
        if (this.mBannerContainer == null) {
            com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout = this.mBannerLayout;
            if (ironSourceBannerLayout != null) {
                ironSourceBannerLayout.setLayoutParams(b(marginPercentageFromTop));
            }
            final com.json.mediationsdk.testSuite.TestSuiteActivity testSuiteActivityF = f();
            if (testSuiteActivityF != null) {
                this.mBannerContainer = a(testSuiteActivityF);
                this.mHandler.post(new java.lang.Runnable() { // from class: com.ironsource.ku$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.json.ku.a(this.f$0, testSuiteActivityF);
                    }
                });
            }
        }
    }

    @Override // com.ironsource.ut.c
    public void a(com.json.au loadAdConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        com.json.hu huVar = com.json.hu.f2727a;
        huVar.a(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, loadAdConfig);
        huVar.g();
    }

    @Override // com.ironsource.ut.b
    public void a(com.json.au loadAdConfig, java.lang.String description, int width, int height) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        b();
        com.json.hu huVar = com.json.hu.f2727a;
        huVar.a(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, loadAdConfig);
        com.json.mediationsdk.testSuite.TestSuiteActivity testSuiteActivityF = f();
        if (testSuiteActivityF != null) {
            com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayoutA = huVar.a(testSuiteActivityF, huVar.a(description, width, height));
            this.mBannerLayout = ironSourceBannerLayoutA;
            huVar.b(ironSourceBannerLayoutA);
        }
    }

    @Override // com.ironsource.ut.d
    public boolean a() {
        return com.json.hu.f2727a.f();
    }

    @Override // com.ironsource.ut.b
    public void b() {
        com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout = this.mBannerLayout;
        if (ironSourceBannerLayout != null) {
            com.json.hu.f2727a.a(ironSourceBannerLayout);
        }
        this.mHandler.post(new java.lang.Runnable() { // from class: com.ironsource.ku$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.ku.a(this.f$0);
            }
        });
        this.mBannerLayout = null;
    }

    @Override // com.ironsource.ut.d
    public void b(com.json.au loadAdConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        com.json.hu huVar = com.json.hu.f2727a;
        huVar.a(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, loadAdConfig);
        huVar.h();
    }

    @Override // com.ironsource.ut.c
    public void c() {
        com.json.hu.f2727a.a((android.app.Activity) this.mTestSuiteActivityWeakReference.get());
    }

    @Override // com.ironsource.ut.d
    public void d() {
        com.json.hu.f2727a.b((android.app.Activity) this.mTestSuiteActivityWeakReference.get());
    }

    @Override // com.ironsource.ut.c
    public boolean e() {
        return com.json.hu.f2727a.e();
    }
}
