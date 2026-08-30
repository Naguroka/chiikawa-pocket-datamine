package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class RunnableC1740u0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3951a;
    final /* synthetic */ int b;
    final /* synthetic */ com.unity3d.player.UnityPlayer c;

    RunnableC1740u0(com.unity3d.player.UnityPlayer unityPlayer, int i, int i2) {
        this.c = unityPlayer;
        this.f3951a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        com.unity3d.player.S s = this.c.mSoftInput;
        if (s != null) {
            int i2 = this.f3951a;
            int i3 = this.b;
            android.widget.EditText editText = s.c;
            if (editText == null || editText.getText().length() < (i = i3 + i2)) {
                return;
            }
            s.c.setSelection(i2, i);
        }
    }
}
