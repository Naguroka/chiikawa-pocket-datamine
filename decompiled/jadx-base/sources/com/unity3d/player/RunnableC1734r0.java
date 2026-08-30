package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class RunnableC1734r0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f3945a;
    final /* synthetic */ com.unity3d.player.UnityPlayer b;

    RunnableC1734r0(com.unity3d.player.UnityPlayer unityPlayer, java.lang.String str) {
        this.b = unityPlayer;
        this.f3945a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        android.widget.EditText editText;
        com.unity3d.player.S s = this.b.mSoftInput;
        if (s == null || (str = this.f3945a) == null || (editText = s.c) == null) {
            return;
        }
        editText.setText(str);
        s.c.setSelection(str.length());
    }
}
