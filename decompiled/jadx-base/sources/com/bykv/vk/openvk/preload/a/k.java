package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: JsonObject.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends com.bykv.vk.openvk.preload.a.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.g<java.lang.String, com.bykv.vk.openvk.preload.a.h> f1692a = new com.bykv.vk.openvk.preload.a.b.g<>();

    public final void a(java.lang.String str, com.bykv.vk.openvk.preload.a.h hVar) {
        com.bykv.vk.openvk.preload.a.b.g<java.lang.String, com.bykv.vk.openvk.preload.a.h> gVar = this.f1692a;
        if (hVar == null) {
            hVar = com.bykv.vk.openvk.preload.a.j.f1691a;
        }
        gVar.put(str, hVar);
    }

    public final java.util.Set<java.util.Map.Entry<java.lang.String, com.bykv.vk.openvk.preload.a.h>> g() {
        return this.f1692a.entrySet();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.bykv.vk.openvk.preload.a.k) && ((com.bykv.vk.openvk.preload.a.k) obj).f1692a.equals(this.f1692a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f1692a.hashCode();
    }
}
