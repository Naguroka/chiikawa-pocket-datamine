package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
abstract class SoftInputProvider {
    public static int a() {
        int iNativeGetSoftInputType = nativeGetSoftInputType();
        for (int i : com.unity3d.player.a.a.b(3)) {
            if (com.unity3d.player.a.d.a(i) == iNativeGetSoftInputType) {
                return i;
            }
        }
        return 1;
    }

    private static final native int nativeGetSoftInputType();
}
