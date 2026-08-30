package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1716i0 extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.player.C1709f f3927a;
    private com.unity3d.player.UnityPlayer b;
    private com.unity3d.player.K c;

    public C1716i0(android.content.Context context, com.unity3d.player.UnityPlayer unityPlayer) {
        int i;
        super(context);
        this.c = new com.unity3d.player.K(context);
        this.b = unityPlayer;
        com.unity3d.player.C1709f c1709f = new com.unity3d.player.C1709f(context, unityPlayer);
        this.f3927a = c1709f;
        c1709f.setId(context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName()));
        if (a()) {
            this.f3927a.getHolder().setFormat(-3);
            this.f3927a.setZOrderOnTop(true);
            i = 0;
        } else {
            this.f3927a.getHolder().setFormat(-1);
            i = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        }
        setBackgroundColor(i);
        this.f3927a.getHolder().addCallback(new com.unity3d.player.SurfaceHolderCallbackC1714h0(this));
        this.f3927a.setFocusable(true);
        this.f3927a.setFocusableInTouchMode(true);
        this.f3927a.setContentDescription(a(context));
        addView(this.f3927a, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
    }

    private static java.lang.String a(android.content.Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, context.getPackageName()));
    }

    private static boolean a() {
        android.app.Activity activity = com.unity3d.player.UnityPlayer.currentActivity;
        if (activity == null) {
            return false;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{android.R.attr.windowIsTranslucent});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    final void a(float f) {
        this.f3927a.a(f);
    }

    public final void b() {
        com.unity3d.player.K k = this.c;
        com.unity3d.player.UnityPlayer unityPlayer = this.b;
        com.unity3d.player.J j = k.b;
        if (j != null && j.getParent() != null) {
            unityPlayer.removeView(k.b);
        }
        this.c.b = null;
    }

    public final boolean c() {
        com.unity3d.player.C1709f c1709f = this.f3927a;
        return c1709f != null && c1709f.a();
    }
}
