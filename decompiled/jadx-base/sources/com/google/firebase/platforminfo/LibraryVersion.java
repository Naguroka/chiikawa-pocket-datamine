package com.google.firebase.platforminfo;

/* JADX INFO: loaded from: classes5.dex */
abstract class LibraryVersion {
    @javax.annotation.Nonnull
    public abstract java.lang.String getLibraryName();

    @javax.annotation.Nonnull
    public abstract java.lang.String getVersion();

    LibraryVersion() {
    }

    static com.google.firebase.platforminfo.LibraryVersion create(java.lang.String str, java.lang.String str2) {
        return new com.google.firebase.platforminfo.AutoValue_LibraryVersion(str, str2);
    }
}
