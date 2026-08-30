package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
abstract class AbstractC1749z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static boolean f3955a = false;

    protected static void Log(int i, java.lang.String str) {
        if (f3955a) {
            return;
        }
        if (i == 6) {
            android.util.Log.e("Unity", str);
        }
        if (i == 5) {
            android.util.Log.w("Unity", str);
        }
    }
}
