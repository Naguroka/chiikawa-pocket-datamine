package com.apm.insight;

/* JADX INFO: loaded from: classes3.dex */
public interface ICrashFilter {
    boolean onJavaCrashFilter(java.lang.Throwable th, java.lang.Thread thread);

    boolean onNativeCrashFilter(java.lang.String str, java.lang.String str2);
}
