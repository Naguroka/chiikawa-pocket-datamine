package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1702b0 extends android.widget.EditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.S f3910a;
    final /* synthetic */ com.unity3d.player.C1704c0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1702b0(com.unity3d.player.C1704c0 c1704c0, android.content.Context context, com.unity3d.player.S s) {
        super(context);
        this.b = c1704c0;
        this.f3910a = s;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 1) {
                this.b.h.onBackPressed();
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            com.unity3d.player.S s = this.f3910a;
            s.a(s.b(), false);
            return true;
        }
        if (i != 111 || keyEvent.getAction() != 0) {
            return super.onKeyPreIme(i, keyEvent);
        }
        com.unity3d.player.S s2 = this.f3910a;
        s2.a(s2.b(), true);
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            requestFocus();
            this.f3910a.f();
        }
    }
}
