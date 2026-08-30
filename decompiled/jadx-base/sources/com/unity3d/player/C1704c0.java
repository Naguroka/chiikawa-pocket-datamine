package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1704c0 extends com.unity3d.player.S {
    com.unity3d.player.U h;

    public C1704c0(android.content.Context context, com.unity3d.player.UnityPlayer unityPlayer) {
        super(context, unityPlayer);
    }

    @Override // com.unity3d.player.S
    public final void a(java.lang.String str, int i, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str2, int i2, boolean z5, boolean z6) {
        com.unity3d.player.U u = new com.unity3d.player.U(this.f3892a, this.b);
        this.h = u;
        u.a(this, z5, z6);
        this.h.setOnDismissListener(new com.unity3d.player.Y(this));
        super.a(str, i, z, z2, z3, z4, str2, i2, z5, z6);
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(new com.unity3d.player.Z(this));
        this.c.requestFocus();
        this.h.setOnCancelListener(new com.unity3d.player.DialogInterfaceOnCancelListenerC1700a0(this));
    }

    @Override // com.unity3d.player.S
    public final void a(boolean z) {
        this.d = z;
        this.h.a(z);
    }

    @Override // com.unity3d.player.S
    public final void c() {
        this.h.dismiss();
    }

    @Override // com.unity3d.player.S
    protected android.widget.EditText createEditText(com.unity3d.player.S s) {
        return new com.unity3d.player.C1702b0(this, this.f3892a, s);
    }

    @Override // com.unity3d.player.S
    public final void e() {
        this.h.show();
    }

    protected void reportSoftInputArea() {
        if (this.h.isShowing()) {
            this.b.reportSoftInputArea(this.h.a());
        }
    }
}
