package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1750z0 extends com.unity3d.player.V0 {
    final /* synthetic */ boolean b;
    final /* synthetic */ com.unity3d.player.UnityPlayer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1750z0(com.unity3d.player.UnityPlayer unityPlayer, boolean z) {
        super(unityPlayer);
        this.c = unityPlayer;
        this.b = z;
    }

    @Override // com.unity3d.player.V0
    public final void a() {
        this.c.nativeSetKeyboardIsVisible(this.b);
    }
}
