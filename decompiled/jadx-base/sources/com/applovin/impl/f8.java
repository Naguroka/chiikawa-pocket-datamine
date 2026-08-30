package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class f8 extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f781a;

    private static java.lang.String a(int i) {
        if (i == 1) {
            return "Player release timed out.";
        }
        if (i != 2) {
            return i != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }

    public f8(int i) {
        super(a(i));
        this.f781a = i;
    }
}
