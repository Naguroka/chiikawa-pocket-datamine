package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1746x0 extends com.unity3d.player.V0 {
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ com.unity3d.player.UnityPlayer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1746x0(com.unity3d.player.UnityPlayer unityPlayer, int i, int i2) {
        super(unityPlayer);
        this.d = unityPlayer;
        this.b = i;
        this.c = i2;
    }

    @Override // com.unity3d.player.V0
    public final void a() {
        this.d.nativeSetInputSelection(this.b, this.c);
    }
}
