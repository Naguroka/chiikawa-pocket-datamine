package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0989Rm {
    public static java.lang.String[] A00 = {"rQIl5N7VPfKdYPJpPoAtVMyZMy99P4x9", "PltMJoJUoNKUoiKU9g8E45vZ11YXhZ8c", "Dj15PNqThKzSJ5rgUYjkzYgIYwsmp7Zv", "a9uitInFNtOBWkculkeZqlUrDZJBx3st", "kUexiMbXZkBESUK3bD4l7MKYNSBSiv", "1n8Xv0E0fXzBNE5usuBA1Nf27I3K4LP8", "4DPNNdejLcG9vMJExCrSPytZ3gIlmbXA", "2XzQKkBGevJk3AOuOkjVAKczu2O9ZI"};

    public static boolean A00(android.view.View view) {
        if (view.getBackground() != null) {
            if (android.os.Build.VERSION.SDK_INT >= 19) {
                android.graphics.drawable.Drawable background = view.getBackground();
                java.lang.String[] strArr = A00;
                if (strArr[5].charAt(16) == strArr[3].charAt(16)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A00;
                strArr2[5] = "VvWjmMzUCUeRE9wUm3LNaHxJA9d87V8N";
                strArr2[3] = "PH96s8M7TksfMzMk3oUF4ojCQwFkmMAr";
                if (background.getAlpha() <= 0) {
                }
            }
            return false;
        }
        return true;
    }
}
