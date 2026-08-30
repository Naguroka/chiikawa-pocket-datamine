package com.unity3d.services.core.properties;

/* JADX INFO: loaded from: classes6.dex */
public class MadeWithUnityDetector {
    public static final java.lang.String UNITY_PLAYER_CLASS_NAME = "com.unity3d.player.UnityPlayer";

    public static boolean isMadeWithUnity() {
        try {
            java.lang.Class.forName(UNITY_PLAYER_CLASS_NAME);
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }
}
