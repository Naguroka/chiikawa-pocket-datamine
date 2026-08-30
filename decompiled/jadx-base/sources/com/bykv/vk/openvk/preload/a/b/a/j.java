package com.bykv.vk.openvk.preload.a.b.a;

/* JADX INFO: compiled from: TimeTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends com.bykv.vk.openvk.preload.a.q<java.sql.Time> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.bykv.vk.openvk.preload.a.r f1633a = new com.bykv.vk.openvk.preload.a.r() { // from class: com.bykv.vk.openvk.preload.a.b.a.j.1
        @Override // com.bykv.vk.openvk.preload.a.r
        public final <T> com.bykv.vk.openvk.preload.a.q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            if (aVar.a() == java.sql.Time.class) {
                return new com.bykv.vk.openvk.preload.a.b.a.j();
            }
            return null;
        }
    };
    private final java.text.DateFormat b = new java.text.SimpleDateFormat("hh:mm:ss a");

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized java.sql.Time a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.j();
            return null;
        }
        try {
            return new java.sql.Time(this.b.parse(aVar.h()).getTime());
        } catch (java.text.ParseException e) {
            throw new com.bykv.vk.openvk.preload.a.o(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.q
    public synchronized void a(com.bykv.vk.openvk.preload.a.d.c cVar, java.sql.Time time) throws java.io.IOException {
        cVar.b(time == null ? null : this.b.format((java.util.Date) time));
    }
}
