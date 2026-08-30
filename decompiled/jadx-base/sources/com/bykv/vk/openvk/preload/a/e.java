package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: GsonBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.c f1689a = com.bykv.vk.openvk.preload.a.b.c.f1664a;
    private com.bykv.vk.openvk.preload.a.p b = com.bykv.vk.openvk.preload.a.p.f1694a;
    private com.bykv.vk.openvk.preload.a.c c = com.bykv.vk.openvk.preload.a.b.f1614a;
    private final java.util.Map<java.lang.reflect.Type, com.bykv.vk.openvk.preload.geckox.a.a.c<?>> d = new java.util.HashMap();
    private final java.util.List<com.bykv.vk.openvk.preload.a.r> e = new java.util.ArrayList();
    private final java.util.List<com.bykv.vk.openvk.preload.a.r> f = new java.util.ArrayList();
    private boolean g = false;
    private int h = 2;
    private int i = 2;
    private boolean j = false;
    private boolean k = false;
    private boolean l = true;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;

    public final com.bykv.vk.openvk.preload.a.e a(java.lang.reflect.Type type, java.lang.Object obj) {
        com.bykv.vk.openvk.preload.falconx.a.a.a(true);
        this.e.add(com.bykv.vk.openvk.preload.a.b.a.m.a(com.bykv.vk.openvk.preload.a.c.a.a(type), (com.bykv.vk.openvk.preload.a.q) obj));
        return this;
    }

    public final com.bykv.vk.openvk.preload.a.d a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.e.size() + this.f.size() + 3);
        arrayList.addAll(this.e);
        java.util.Collections.reverse(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f);
        java.util.Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i = this.h;
        int i2 = this.i;
        if (i != 2 && i2 != 2) {
            com.bykv.vk.openvk.preload.a.a aVar = new com.bykv.vk.openvk.preload.a.a(java.util.Date.class, i, i2);
            com.bykv.vk.openvk.preload.a.a aVar2 = new com.bykv.vk.openvk.preload.a.a(java.sql.Timestamp.class, i, i2);
            com.bykv.vk.openvk.preload.a.a aVar3 = new com.bykv.vk.openvk.preload.a.a(java.sql.Date.class, i, i2);
            arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(java.util.Date.class, aVar));
            arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(java.sql.Timestamp.class, aVar2));
            arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(java.sql.Date.class, aVar3));
        }
        return new com.bykv.vk.openvk.preload.a.d(this.f1689a, this.c, this.d, this.l, this.b, this.h, this.i, this.e, this.f, arrayList);
    }
}
