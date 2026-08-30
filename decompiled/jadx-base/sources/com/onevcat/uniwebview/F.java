package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3656a;

    static {
        int[] iArr = new int[android.webkit.ConsoleMessage.MessageLevel.values().length];
        iArr[android.webkit.ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 1;
        iArr[android.webkit.ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
        iArr[android.webkit.ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
        iArr[android.webkit.ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
        iArr[android.webkit.ConsoleMessage.MessageLevel.TIP.ordinal()] = 5;
        f3656a = iArr;
    }
}
