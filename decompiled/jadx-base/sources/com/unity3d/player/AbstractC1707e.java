package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
abstract class AbstractC1707e {
    public static android.window.OnBackInvokedDispatcher a(java.lang.Object obj) {
        if (obj instanceof android.app.Activity) {
            return ((android.app.Activity) obj).getOnBackInvokedDispatcher();
        }
        if (obj instanceof android.app.Dialog) {
            return ((android.app.Dialog) obj).getOnBackInvokedDispatcher();
        }
        throw new java.lang.IllegalArgumentException("Unsupported context type when getting '" + obj.getClass().getName() + "' OnBackInvokedDispatcher");
    }

    public static void a(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher, int i, android.window.OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(i, onBackInvokedCallback);
    }

    public static void a(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher, android.window.OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }
}
