package com.bykv.vk.openvk.preload.geckox.e.a;

/* JADX INFO: compiled from: FileLoader.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.io.File f1733a;

    protected abstract java.io.InputStream a(java.io.File file, java.lang.String str) throws java.io.IOException;

    protected abstract boolean b(java.io.File file, java.lang.String str) throws java.io.IOException;

    public a(java.io.File file) {
        this.f1733a = file;
    }

    public final java.io.InputStream a(java.lang.String str) throws java.io.IOException {
        return a(this.f1733a, str);
    }

    public final boolean b(java.lang.String str) throws java.io.IOException {
        return b(this.f1733a, str);
    }

    public a() {
    }
}
