package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class U extends android.app.Dialog implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected android.content.Context f3896a;
    protected com.unity3d.player.UnityPlayer b;
    protected com.unity3d.player.P c;
    protected com.unity3d.player.S d;
    private com.unity3d.player.C e;

    public U(android.content.Context context, com.unity3d.player.UnityPlayer unityPlayer) {
        super(context);
        this.c = null;
        this.d = null;
        this.e = null;
        this.f3896a = context;
        this.b = unityPlayer;
    }

    public final android.graphics.Rect a() {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.b.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        this.b.getLocationOnScreen(iArr);
        android.graphics.Point point = new android.graphics.Point(rect.left - iArr[0], rect.height() - this.c.getHeight());
        android.graphics.Point point2 = new android.graphics.Point();
        getWindow().getWindowManager().getDefaultDisplay().getSize(point2);
        int height = this.b.getHeight();
        int i = height - point2.y;
        int i2 = height - point.y;
        int height2 = this.c.getHeight() + i;
        com.unity3d.player.UnityPlayer unityPlayer = this.b;
        if (i2 != height2) {
            unityPlayer.reportSoftInputIsVisible(true);
        } else {
            unityPlayer.reportSoftInputIsVisible(false);
        }
        return new android.graphics.Rect(point.x, point.y, this.c.getWidth(), i2);
    }

    public final void a(com.unity3d.player.S s, boolean z, boolean z2) {
        this.d = s;
        android.view.Window window = getWindow();
        window.requestFeature(1);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.x = 0;
        attributes.y = 0;
        window.setAttributes(attributes);
        b();
        this.c = createSoftInputView(this.d.c);
        window.setLayout(-1, -2);
        window.clearFlags(2);
        window.clearFlags(androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE);
        window.clearFlags(67108864);
        if (!z2) {
            window.addFlags(32);
            window.addFlags(262144);
        }
        a(z);
        getWindow().setSoftInputMode(5);
        this.e = com.unity3d.player.D.a(this, 1000000, new com.unity3d.player.T(this));
    }

    public final void a(boolean z) {
        com.unity3d.player.P p = this.c;
        if (z) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) p.b.getLayoutParams();
            layoutParams.height = 1;
            p.b.setLayoutParams(layoutParams);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) p.f3886a.getLayoutParams();
            layoutParams2.height = 1;
            p.f3886a.setLayoutParams(layoutParams2);
            android.graphics.Rect rect = p.e;
            p.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            p.setVisibility(4);
        } else {
            p.setVisibility(0);
            android.graphics.Rect rect2 = p.d;
            p.setPadding(rect2.left, rect2.top, rect2.right, rect2.bottom);
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) p.b.getLayoutParams();
            layoutParams3.height = -2;
            p.b.setLayoutParams(layoutParams3);
            android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) p.f3886a.getLayoutParams();
            layoutParams4.height = -2;
            p.f3886a.setLayoutParams(layoutParams4);
        }
        p.invalidate();
        p.requestLayout();
    }

    public final void b() {
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(0);
        if (!com.unity3d.player.PlatformSupport.VANILLA_ICE_CREAM_SUPPORT) {
            getWindow().setBackgroundDrawable(colorDrawable);
            return;
        }
        android.graphics.Insets insets = this.b.getActivity().getWindow().getDecorView().getRootWindowInsets().getInsets(android.view.WindowInsets.Type.displayCutout());
        getWindow().setBackgroundDrawable(new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) colorDrawable, insets.left, insets.top, insets.right, 0));
    }

    protected com.unity3d.player.P createSoftInputView(android.widget.EditText editText) {
        com.unity3d.player.P p = new com.unity3d.player.P(this.f3896a, editText);
        p.f3886a.setOnClickListener(this);
        setContentView(p);
        return p;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.d.d() || !(motionEvent.getAction() == 4 || this.d.d)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        java.lang.Runnable runnable;
        com.unity3d.player.C c = this.e;
        if (c != null) {
            com.unity3d.player.a.c cVar = c.f3860a;
            if (!(cVar != null) || (runnable = ((com.unity3d.player.B) cVar).f3858a) == null) {
                return;
            }
            runnable.run();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.unity3d.player.S s = this.d;
        s.a(s.b(), false);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        com.unity3d.player.C c = this.e;
        if (c != null) {
            c.unregisterOnBackPressedCallback();
            this.e = null;
        }
        super.onStop();
    }
}
