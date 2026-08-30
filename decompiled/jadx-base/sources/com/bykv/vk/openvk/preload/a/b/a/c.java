package com.bykv.vk.openvk.preload.a.b.a;

/* JADX INFO: compiled from: DateTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.bykv.vk.openvk.preload.a.q<java.util.Date> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.bykv.vk.openvk.preload.a.r f1623a = new com.bykv.vk.openvk.preload.a.r() { // from class: com.bykv.vk.openvk.preload.a.b.a.c.1
        @Override // com.bykv.vk.openvk.preload.a.r
        public final <T> com.bykv.vk.openvk.preload.a.q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            if (aVar.a() == java.util.Date.class) {
                return new com.bykv.vk.openvk.preload.a.b.a.c();
            }
            return null;
        }
    };
    private final java.util.List<java.text.DateFormat> b;

    public c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.b = arrayList;
        arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2, java.util.Locale.US));
        if (!java.util.Locale.getDefault().equals(java.util.Locale.US)) {
            arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.bykv.vk.openvk.preload.a.b.d.b()) {
            arrayList.add(com.bykv.vk.openvk.preload.falconx.a.a.a(2, 2));
        }
    }

    private synchronized java.util.Date a(java.lang.String str) {
        java.util.Iterator<java.text.DateFormat> it = this.b.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (java.text.ParseException unused) {
            }
        }
        try {
            return com.bykv.vk.openvk.preload.a.b.a.a.a.a(str, new java.text.ParsePosition(0));
        } catch (java.text.ParseException e) {
            throw new com.bykv.vk.openvk.preload.a.o(str, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.q
    public synchronized void a(com.bykv.vk.openvk.preload.a.d.c cVar, java.util.Date date) throws java.io.IOException {
        try {
            if (date == null) {
                cVar.h();
            } else {
                cVar.b(this.b.get(0).format(date));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final /* synthetic */ java.util.Date a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.j();
            return null;
        }
        return a(aVar.h());
    }
}
