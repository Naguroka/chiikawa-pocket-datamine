package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
abstract class AbstractC1747y {
    public static java.lang.String a(android.view.inputmethod.InputMethodSubtype inputMethodSubtype) {
        return com.unity3d.player.PlatformSupport.NOUGAT_SUPPORT ? inputMethodSubtype.getLanguageTag() : inputMethodSubtype.getLocale();
    }
}
