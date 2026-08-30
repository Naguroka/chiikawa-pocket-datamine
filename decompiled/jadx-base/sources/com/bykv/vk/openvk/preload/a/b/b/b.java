package com.bykv.vk.openvk.preload.a.b.b;

/* JADX INFO: compiled from: ReflectionAccessor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.bykv.vk.openvk.preload.a.b.b.b f1662a;

    public abstract void a(java.lang.reflect.AccessibleObject accessibleObject);

    static {
        f1662a = com.bykv.vk.openvk.preload.a.b.d.a() < 9 ? new com.bykv.vk.openvk.preload.a.b.b.a() : new com.bykv.vk.openvk.preload.a.b.b.c();
    }

    public static com.bykv.vk.openvk.preload.a.b.b.b a() {
        return f1662a;
    }
}
