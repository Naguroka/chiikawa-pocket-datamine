package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public class BuildIdInfo {
    private final java.lang.String arch;
    private final java.lang.String buildId;
    private final java.lang.String libraryName;

    public BuildIdInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.libraryName = str;
        this.arch = str2;
        this.buildId = str3;
    }

    public java.lang.String getLibraryName() {
        return this.libraryName;
    }

    public java.lang.String getArch() {
        return this.arch;
    }

    public java.lang.String getBuildId() {
        return this.buildId;
    }
}
