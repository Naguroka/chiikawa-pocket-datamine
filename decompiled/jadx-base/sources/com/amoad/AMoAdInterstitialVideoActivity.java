package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class AMoAdInterstitialVideoActivity extends androidx.appcompat.app.AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.amoad.AMoAdInterstitialVideo f131a;
    private com.amoad.AMoAdNativeMainVideoView b;
    private com.amoad.u c;
    private android.view.View d;
    private com.amoad.ah e;
    private boolean f = false;
    private android.content.BroadcastReceiver g = new android.content.BroadcastReceiver() { // from class: com.amoad.AMoAdInterstitialVideoActivity.1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(android.content.Context context, android.content.Intent intent) {
            com.amoad.AMoAdInterstitialVideoActivity.this.a();
        }
    };
    private android.view.View.OnClickListener h = new android.view.View.OnClickListener() { // from class: com.amoad.AMoAdInterstitialVideoActivity.2
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            com.amoad.AMoAdInterstitialVideoActivity.this.a();
        }
    };
    private com.amoad.NativeVideoView.b i = new com.amoad.NativeVideoView.b() { // from class: com.amoad.AMoAdInterstitialVideoActivity.3
        @Override // com.amoad.NativeVideoView.b
        public final void a(com.amoad.NativeVideoView.State state) {
            boolean z = state == com.amoad.NativeVideoView.State.PlaybackCompleted || state == com.amoad.NativeVideoView.State.Error;
            com.amoad.AMoAdInterstitialVideoActivity.a(com.amoad.AMoAdInterstitialVideoActivity.this.c, com.amoad.AMoAdInterstitialVideoActivity.this.f131a.isCancellable() || z);
            com.amoad.AMoAdInterstitialVideoActivity.a(com.amoad.AMoAdInterstitialVideoActivity.this.d, com.amoad.AMoAdInterstitialVideoActivity.this.c.getVisibility() == 0);
            com.amoad.AMoAdInterstitialVideoActivity.a(com.amoad.AMoAdInterstitialVideoActivity.this.e, z);
        }
    };

    class a extends androidx.constraintlayout.widget.ConstraintLayout {
        a(android.content.Context context, java.lang.String str) {
            super(context);
            if (com.amoad.AMoAdInterstitialVideoActivity.this.b.getParent() != null) {
                ((android.view.ViewGroup) com.amoad.AMoAdInterstitialVideoActivity.this.b.getParent()).removeView(com.amoad.AMoAdInterstitialVideoActivity.this.b);
            }
            addView(com.amoad.AMoAdInterstitialVideoActivity.this.b);
            com.amoad.AMoAdInterstitialVideoActivity.this.b.setId(1);
            androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
            constraintSet.setDimensionRatio(1, str);
            constraintSet.constrainWidth(1, 0);
            constraintSet.constrainHeight(1, 0);
            constraintSet.connect(1, 3, 0, 3);
            constraintSet.connect(1, 4, 0, 4);
            constraintSet.connect(1, 6, 0, 6);
            constraintSet.connect(1, 7, 0, 7);
            constraintSet.applyTo(this);
            addView(com.amoad.AMoAdInterstitialVideoActivity.this.c);
            addView(com.amoad.AMoAdInterstitialVideoActivity.this.d);
            addView(com.amoad.AMoAdInterstitialVideoActivity.this.e);
            setBackgroundResource(android.R.color.black);
        }

        private int a() {
            int measuredWidth = com.amoad.AMoAdInterstitialVideoActivity.this.c.getMeasuredWidth();
            int i = measuredWidth - ((int) (measuredWidth * com.amoad.AMoAdInterstitialVideoActivity.this.b.f137a.I.d));
            if (i <= 0) {
                return 0;
            }
            return i / 2;
        }

        @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
        protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            com.amoad.AMoAdInterstitialVideoActivity.this.b.f137a.I.b.layout(com.amoad.AMoAdInterstitialVideoActivity.this.c, com.amoad.AMoAdInterstitialVideoActivity.this.b);
            com.amoad.AMoAdPlacement.BOTTOM_LEFT.layout(com.amoad.AMoAdInterstitialVideoActivity.this.e, com.amoad.AMoAdInterstitialVideoActivity.this.b);
            int top = com.amoad.AMoAdInterstitialVideoActivity.this.c.getTop() + a();
            int left = com.amoad.AMoAdInterstitialVideoActivity.this.c.getLeft() + a();
            com.amoad.AMoAdInterstitialVideoActivity.this.d.layout(left, top, ((int) (com.amoad.AMoAdInterstitialVideoActivity.this.c.getMeasuredWidth() * com.amoad.AMoAdInterstitialVideoActivity.this.b.f137a.I.d)) + left, ((int) (com.amoad.AMoAdInterstitialVideoActivity.this.c.getMeasuredHeight() * com.amoad.AMoAdInterstitialVideoActivity.this.b.f137a.I.d)) + top);
        }
    }

    private java.lang.String a(int i, int i2) {
        return (getResources().getConfiguration().orientation == 2) != (i > i2) ? java.lang.String.format(com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_WITH_SCAR_FORMAT, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i)) : java.lang.String.format(com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_WITH_SCAR_FORMAT, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        finish();
        e();
    }

    private void a(android.content.Context context) {
        com.amoad.AMoAdInterstitialVideo aMoAdInterstitialVideoSharedInstance = com.amoad.AMoAdInterstitialVideo.sharedInstance(context, getIntent().getExtras().getString("com.amoad.AMoAdInterstitialVideoActivity.extra.sid"), getIntent().getExtras().getString("com.amoad.AMoAdInterstitialVideoActivity.extra.tag"));
        this.f131a = aMoAdInterstitialVideoSharedInstance;
        com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView = aMoAdInterstitialVideoSharedInstance.f120a;
        this.b = aMoAdNativeMainVideoView;
        if (aMoAdNativeMainVideoView.f137a == null) {
            this.f131a.c(this);
            a();
            return;
        }
        b();
        this.c = new com.amoad.u(context, this.b.f137a.I.c);
        android.view.View view = new android.view.View(context);
        this.d = view;
        view.setOnClickListener(this.h);
        this.e = new com.amoad.ah(context);
        setContentView(new com.amoad.AMoAdInterstitialVideoActivity.a(context, a(this.b.f137a.x, this.b.f137a.y)));
        c();
        b(context);
    }

    static /* synthetic */ void a(android.view.View view, boolean z) {
        view.setVisibility(z ? 0 : 4);
    }

    private void b() {
        this.b.b.a(this.i);
    }

    private void b(android.content.Context context) {
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(context).registerReceiver(this.g, new android.content.IntentFilter("com.amoad.AMoAdInterstitialVideoActivity.action.dismiss"));
    }

    private void c() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        getWindow().getDecorView().setSystemUiVisibility(4);
    }

    private void d() {
        this.f131a.a((android.app.Activity) this);
    }

    private void e() {
        if (this.f) {
            return;
        }
        this.f131a.b(this);
        this.f = true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.c.getVisibility() == 0) {
            a();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        a((android.content.Context) this);
        if (bundle != null || this.b.f137a == null) {
            return;
        }
        d();
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        a((android.content.Context) this);
        if (bundle != null || this.b.f137a == null) {
            return;
        }
        d();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(this.g);
        this.b.b.b(this.i);
        if (isFinishing()) {
            e();
        }
    }
}
