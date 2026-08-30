package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class RunnableC1736s0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3947a;
    final /* synthetic */ com.unity3d.player.UnityPlayer b;

    RunnableC1736s0(com.unity3d.player.UnityPlayer unityPlayer, int i) {
        this.b = unityPlayer;
        this.f3947a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.S s = this.b.mSoftInput;
        if (s != null) {
            int i = this.f3947a;
            android.widget.EditText editText = s.c;
            if (editText != null) {
                if (i > 0) {
                    editText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i)});
                } else {
                    editText.setFilters(new android.text.InputFilter[0]);
                }
            }
        }
    }
}
