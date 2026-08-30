package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: JsonElement.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public boolean f() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public java.lang.Number a() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public java.lang.String b() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public double c() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public long d() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public int e() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public java.lang.String toString() {
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            com.bykv.vk.openvk.preload.a.d.c cVar = new com.bykv.vk.openvk.preload.a.d.c(stringWriter);
            cVar.a(true);
            com.bykv.vk.openvk.preload.falconx.a.a.a(this, cVar);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
