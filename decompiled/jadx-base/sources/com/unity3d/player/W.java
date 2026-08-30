package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class W extends android.widget.EditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.S f3900a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W(android.content.Context context, com.unity3d.player.S s) {
        super(context);
        this.f3900a = s;
    }

    @Override // android.widget.TextView
    public final void onEditorAction(int i) {
        if (i == 6) {
            com.unity3d.player.S s = this.f3900a;
            s.a(s.b(), false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 1) {
                com.unity3d.player.S s = this.f3900a;
                s.a(s.b(), false);
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i != 66 || keyEvent.getAction() != 0 || (getInputType() & 131072) != 0) {
            return super.onKeyPreIme(i, keyEvent);
        }
        com.unity3d.player.S s2 = this.f3900a;
        s2.a(s2.b(), false);
        return true;
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        this.f3900a.b.reportSoftInputSelection(i, i2 - i);
    }
}
