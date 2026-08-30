package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class X extends com.unity3d.player.S {
    private boolean h;
    private android.os.Handler i;
    private java.lang.Runnable j;

    public X(android.content.Context context, com.unity3d.player.UnityPlayer unityPlayer) {
        super(context, unityPlayer);
        this.h = false;
    }

    @Override // com.unity3d.player.S
    public final void a(boolean z) {
        android.widget.EditText editText;
        int i;
        this.d = z;
        if (z) {
            editText = this.c;
            i = 4;
        } else {
            editText = this.c;
            i = 0;
        }
        editText.setVisibility(i);
        this.c.invalidate();
        this.c.requestLayout();
    }

    @Override // com.unity3d.player.S
    public final void c() {
        java.lang.Runnable runnable;
        android.os.Handler handler = this.i;
        if (handler != null && (runnable = this.j) != null) {
            handler.removeCallbacks(runnable);
        }
        this.b.removeView(this.c);
        this.h = false;
        invokeOnClose();
    }

    @Override // com.unity3d.player.S
    protected android.widget.EditText createEditText(com.unity3d.player.S s) {
        return new com.unity3d.player.W(this.f3892a, s);
    }

    @Override // com.unity3d.player.S
    public final boolean d() {
        return false;
    }

    @Override // com.unity3d.player.S
    public final void e() {
        if (this.h) {
            return;
        }
        this.b.addView(this.c);
        this.b.bringChildToFront(this.c);
        this.c.setVisibility(0);
        this.c.requestFocus();
        this.j = new com.unity3d.player.V(this);
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.i = handler;
        handler.postDelayed(this.j, 400L);
        this.h = true;
    }
}
