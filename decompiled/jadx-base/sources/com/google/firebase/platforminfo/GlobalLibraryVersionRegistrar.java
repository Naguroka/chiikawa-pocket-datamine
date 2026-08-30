package com.google.firebase.platforminfo;

/* JADX INFO: loaded from: classes5.dex */
public class GlobalLibraryVersionRegistrar {
    private static volatile com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar INSTANCE;
    private final java.util.Set<com.google.firebase.platforminfo.LibraryVersion> infos = new java.util.HashSet();

    GlobalLibraryVersionRegistrar() {
    }

    public void registerVersion(java.lang.String str, java.lang.String str2) {
        synchronized (this.infos) {
            this.infos.add(com.google.firebase.platforminfo.LibraryVersion.create(str, str2));
        }
    }

    java.util.Set<com.google.firebase.platforminfo.LibraryVersion> getRegisteredVersions() {
        java.util.Set<com.google.firebase.platforminfo.LibraryVersion> setUnmodifiableSet;
        synchronized (this.infos) {
            setUnmodifiableSet = java.util.Collections.unmodifiableSet(this.infos);
        }
        return setUnmodifiableSet;
    }

    public static com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar getInstance() {
        com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = INSTANCE;
        if (globalLibraryVersionRegistrar == null) {
            synchronized (com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar.class) {
                globalLibraryVersionRegistrar = INSTANCE;
                if (globalLibraryVersionRegistrar == null) {
                    globalLibraryVersionRegistrar = new com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar();
                    INSTANCE = globalLibraryVersionRegistrar;
                }
            }
        }
        return globalLibraryVersionRegistrar;
    }
}
