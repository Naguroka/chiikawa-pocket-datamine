package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class Q implements android.widget.TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.S f3889a;

    Q(com.unity3d.player.S s) {
        this.f3889a = s;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (i == 6) {
            com.unity3d.player.S s = this.f3889a;
            s.a(s.b(), false);
        }
        return false;
    }
}
