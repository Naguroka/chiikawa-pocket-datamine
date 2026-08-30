package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class ViewOnKeyListenerC1701b implements android.view.View.OnKeyListener {
    ViewOnKeyListenerC1701b() {
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        return i == 4 && keyEvent.getAction() == 1;
    }
}
