package com.json.mediationsdk.testSuite;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0014J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;", "Landroid/app/Activity;", "Lcom/ironsource/bi;", "Lorg/json/JSONObject;", "b", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/widget/RelativeLayout$LayoutParams;", "c", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "onDestroy", "onUIReady", "onClosed", "Landroid/widget/RelativeLayout;", "getContainer", "Landroid/widget/RelativeLayout;", "mContainer", "Lcom/ironsource/nu;", "Lcom/ironsource/nu;", "mWebViewWrapper", "Lcom/ironsource/iu;", "Lcom/ironsource/iu;", "mNativeBridge", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class TestSuiteActivity extends android.app.Activity implements com.json.bi {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private android.widget.RelativeLayout mContainer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private com.json.nu mWebViewWrapper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private com.json.iu mNativeBridge;

    private final java.lang.String a() {
        android.os.Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.mediationsdk.testSuite.TestSuiteActivity this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final org.json.JSONObject b() {
        boolean z;
        java.lang.String strB = new com.json.wt().b(this);
        if (strB != null) {
            try {
                z = strB.length() == 0;
            } catch (java.lang.Exception unused) {
                return new org.json.JSONObject();
            }
        }
        return z ? new org.json.JSONObject() : new org.json.JSONObject(strB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.mediationsdk.testSuite.TestSuiteActivity this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.nu nuVar = this$0.mWebViewWrapper;
        com.json.nu nuVar2 = null;
        if (nuVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            nuVar = null;
        }
        if (nuVar.getMAppWebView().getParent() == null) {
            android.widget.RelativeLayout relativeLayout = this$0.mContainer;
            if (relativeLayout == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            com.json.nu nuVar3 = this$0.mWebViewWrapper;
            if (nuVar3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                nuVar3 = null;
            }
            relativeLayout.removeView(nuVar3.getMLoadingScreenWebView());
            android.widget.RelativeLayout relativeLayout2 = this$0.mContainer;
            if (relativeLayout2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout2 = null;
            }
            com.json.nu nuVar4 = this$0.mWebViewWrapper;
            if (nuVar4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                nuVar4 = null;
            }
            relativeLayout2.addView(nuVar4.getMAppWebView(), this$0.c());
            com.json.nu nuVar5 = this$0.mWebViewWrapper;
            if (nuVar5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            } else {
                nuVar2 = nuVar5;
            }
            nuVar2.b();
        }
    }

    private final android.widget.RelativeLayout.LayoutParams c() {
        return new android.widget.RelativeLayout.LayoutParams(-1, -1);
    }

    public final android.widget.RelativeLayout getContainer() {
        android.widget.RelativeLayout relativeLayout = this.mContainer;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.json.bi
    public void onClosed() {
        runOnUiThread(new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.mediationsdk.testSuite.TestSuiteActivity.a(this.f$0);
            }
        });
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this);
        this.mContainer = relativeLayout;
        setContentView(relativeLayout, c());
        com.json.nu nuVar = new com.json.nu(this, this, b(), a());
        this.mWebViewWrapper = nuVar;
        com.json.iu iuVar = new com.json.iu(nuVar);
        this.mNativeBridge = iuVar;
        iuVar.d();
        android.widget.RelativeLayout relativeLayout2 = this.mContainer;
        com.json.nu nuVar2 = null;
        if (relativeLayout2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout2 = null;
        }
        com.json.nu nuVar3 = this.mWebViewWrapper;
        if (nuVar3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            nuVar2 = nuVar3;
        }
        relativeLayout2.addView(nuVar2.getMLoadingScreenWebView(), c());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        com.json.iu iuVar = this.mNativeBridge;
        com.json.nu nuVar = null;
        if (iuVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mNativeBridge");
            iuVar = null;
        }
        iuVar.a();
        android.widget.RelativeLayout relativeLayout = this.mContainer;
        if (relativeLayout == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        com.json.nu nuVar2 = this.mWebViewWrapper;
        if (nuVar2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            nuVar = nuVar2;
        }
        nuVar.a();
        super.onDestroy();
    }

    @Override // com.json.bi
    public void onUIReady() {
        runOnUiThread(new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.mediationsdk.testSuite.TestSuiteActivity.b(this.f$0);
            }
        });
    }
}
