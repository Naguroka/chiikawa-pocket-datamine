package com.bykv.vk.openvk.preload.a.c;

/* JADX INFO: compiled from: TypeToken.java */
/* JADX INFO: loaded from: classes3.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Class<? super T> f1679a;
    private java.lang.reflect.Type b;
    private int c;

    protected a() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof java.lang.Class) {
            throw new java.lang.RuntimeException("Missing type parameter.");
        }
        java.lang.reflect.Type typeA = com.bykv.vk.openvk.preload.a.b.a.a(((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.b = typeA;
        this.f1679a = (java.lang.Class<? super T>) com.bykv.vk.openvk.preload.a.b.a.b(typeA);
        this.c = this.b.hashCode();
    }

    private a(java.lang.reflect.Type type) {
        java.lang.reflect.Type typeA = com.bykv.vk.openvk.preload.a.b.a.a((java.lang.reflect.Type) com.bykv.vk.openvk.preload.falconx.a.a.a(type));
        this.b = typeA;
        this.f1679a = (java.lang.Class<? super T>) com.bykv.vk.openvk.preload.a.b.a.b(typeA);
        this.c = this.b.hashCode();
    }

    public final java.lang.Class<? super T> a() {
        return this.f1679a;
    }

    public final java.lang.reflect.Type b() {
        return this.b;
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.bykv.vk.openvk.preload.a.c.a) && com.bykv.vk.openvk.preload.a.b.a.a(this.b, ((com.bykv.vk.openvk.preload.a.c.a) obj).b);
    }

    public final java.lang.String toString() {
        return com.bykv.vk.openvk.preload.a.b.a.c(this.b);
    }

    public static com.bykv.vk.openvk.preload.a.c.a<?> a(java.lang.reflect.Type type) {
        return new com.bykv.vk.openvk.preload.a.c.a<>(type);
    }

    public static <T> com.bykv.vk.openvk.preload.a.c.a<T> a(java.lang.Class<T> cls) {
        return new com.bykv.vk.openvk.preload.a.c.a<>(cls);
    }
}
