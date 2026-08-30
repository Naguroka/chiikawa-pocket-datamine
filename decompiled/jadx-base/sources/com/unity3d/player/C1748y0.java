package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1748y0 extends com.unity3d.player.V0 {
    final /* synthetic */ android.graphics.Rect b;
    final /* synthetic */ com.unity3d.player.UnityPlayer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1748y0(com.unity3d.player.UnityPlayer unityPlayer, android.graphics.Rect rect) {
        super(unityPlayer);
        this.c = unityPlayer;
        this.b = rect;
    }

    @Override // com.unity3d.player.V0
    public final void a() {
        com.unity3d.player.UnityPlayer unityPlayer = this.c;
        android.graphics.Rect rect = this.b;
        unityPlayer.nativeSetInputArea(rect.left, rect.top, rect.right, rect.bottom);
    }
}
