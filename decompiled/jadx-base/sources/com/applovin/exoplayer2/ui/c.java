package com.applovin.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
abstract class c {
    public static java.lang.String a(int i) {
        return com.applovin.impl.xp.a("rgba(%d,%d,%d,%.3f)", java.lang.Integer.valueOf(android.graphics.Color.red(i)), java.lang.Integer.valueOf(android.graphics.Color.green(i)), java.lang.Integer.valueOf(android.graphics.Color.blue(i)), java.lang.Double.valueOf(((double) android.graphics.Color.alpha(i)) / 255.0d));
    }

    public static java.lang.String a(java.lang.String str) {
        return "." + str + ",." + str + " *";
    }
}
