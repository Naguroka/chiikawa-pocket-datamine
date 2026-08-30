package com.apm.insight.l;

/* JADX INFO: compiled from: DateUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.text.DateFormat f439a;

    public static java.text.DateFormat a() {
        if (f439a == null) {
            f439a = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault());
        }
        return f439a;
    }
}
