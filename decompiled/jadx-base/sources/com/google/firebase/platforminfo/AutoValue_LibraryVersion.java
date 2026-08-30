package com.google.firebase.platforminfo;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_LibraryVersion extends com.google.firebase.platforminfo.LibraryVersion {
    private final java.lang.String libraryName;
    private final java.lang.String version;

    AutoValue_LibraryVersion(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null libraryName");
        }
        this.libraryName = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null version");
        }
        this.version = str2;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    @javax.annotation.Nonnull
    public java.lang.String getLibraryName() {
        return this.libraryName;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    @javax.annotation.Nonnull
    public java.lang.String getVersion() {
        return this.version;
    }

    public java.lang.String toString() {
        return "LibraryVersion{libraryName=" + this.libraryName + ", version=" + this.version + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.platforminfo.LibraryVersion)) {
            return false;
        }
        com.google.firebase.platforminfo.LibraryVersion libraryVersion = (com.google.firebase.platforminfo.LibraryVersion) obj;
        return this.libraryName.equals(libraryVersion.getLibraryName()) && this.version.equals(libraryVersion.getVersion());
    }

    public int hashCode() {
        return ((this.libraryName.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode();
    }
}
