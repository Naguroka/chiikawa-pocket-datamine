package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1742v0 extends com.unity3d.player.V0 {
    final /* synthetic */ boolean b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ int d;
    final /* synthetic */ com.unity3d.player.UnityPlayer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1742v0(com.unity3d.player.UnityPlayer unityPlayer, boolean z, java.lang.String str, int i) {
        super(unityPlayer);
        this.e = unityPlayer;
        this.b = z;
        this.c = str;
        this.d = i;
    }

    @Override // com.unity3d.player.V0
    public final void a() {
        if (this.b) {
            this.e.nativeSoftInputCanceled();
        } else {
            java.lang.String str = this.c;
            if (str != null) {
                this.e.nativeSetInputString(str);
            }
        }
        if (this.d == 1) {
            this.e.nativeSoftInputClosed();
        }
    }
}
