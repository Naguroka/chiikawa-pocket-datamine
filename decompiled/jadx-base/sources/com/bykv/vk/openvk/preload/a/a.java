package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: DefaultDateTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
final class a extends com.bykv.vk.openvk.preload.a.q<java.util.Date> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class<? extends java.util.Date> f1613a;
    private final java.util.List<java.text.DateFormat> b;

    @Override // com.bykv.vk.openvk.preload.a.q
    public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, java.util.Date date) throws java.io.IOException {
        java.util.Date date2 = date;
        if (date2 == null) {
            cVar.h();
            return;
        }
        synchronized (this.b) {
            cVar.b(this.b.get(0).format(date2));
        }
    }

    public a(java.lang.Class<? extends java.util.Date> cls, int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.b = arrayList;
        if (cls == java.util.Date.class || cls == java.sql.Date.class || cls == java.sql.Timestamp.class) {
            this.f1613a = cls;
            arrayList.add(java.text.DateFormat.getDateTimeInstance(i, i2, java.util.Locale.US));
            if (!java.util.Locale.getDefault().equals(java.util.Locale.US)) {
                arrayList.add(java.text.DateFormat.getDateTimeInstance(i, i2));
            }
            if (com.bykv.vk.openvk.preload.a.b.d.b()) {
                arrayList.add(com.bykv.vk.openvk.preload.falconx.a.a.a(i, i2));
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Date type must be one of " + java.util.Date.class + ", " + java.sql.Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    private java.util.Date a(java.lang.String str) {
        synchronized (this.b) {
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
    }

    public final java.lang.String toString() {
        java.text.DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof java.text.SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((java.text.SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final /* synthetic */ java.util.Date a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.j();
            return null;
        }
        java.util.Date dateA = a(aVar.h());
        java.lang.Class<? extends java.util.Date> cls = this.f1613a;
        if (cls == java.util.Date.class) {
            return dateA;
        }
        if (cls == java.sql.Timestamp.class) {
            return new java.sql.Timestamp(dateA.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(dateA.getTime());
        }
        throw new java.lang.AssertionError();
    }
}
