package com.bykv.vk.openvk.preload.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: SubBranchInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l<IN, OUT> extends com.bykv.vk.openvk.preload.b.d<IN, OUT> {
    private java.util.Map<java.lang.String, com.bykv.vk.openvk.preload.b.l.a> d;

    l() {
    }

    final java.util.Map<java.lang.String, com.bykv.vk.openvk.preload.b.l.a> a() {
        return this.d;
    }

    static boolean a(java.util.List<com.bykv.vk.openvk.preload.b.h> list) {
        return !list.isEmpty() && list.get(list.size() - 1).f1701a == com.bykv.vk.openvk.preload.b.f.class;
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    protected final void a(java.lang.Object... objArr) {
        java.lang.Object obj;
        super.a(objArr);
        if (objArr == null || objArr.length != 1 || (obj = objArr[0]) == null) {
            throw new java.lang.IllegalStateException("args error");
        }
        try {
            this.d = (java.util.Map) obj;
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    /* JADX INFO: compiled from: SubBranchInterceptor.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.util.Map<java.lang.String, com.bykv.vk.openvk.preload.b.l.a> f1705a = new java.util.HashMap();

        public final com.bykv.vk.openvk.preload.b.l.a a(java.lang.String str) {
            if (this.f1705a.containsKey(str)) {
                throw new java.lang.IllegalArgumentException("duplicated branch name");
            }
            com.bykv.vk.openvk.preload.b.l.a aVar = new com.bykv.vk.openvk.preload.b.l.a();
            this.f1705a.put(str, aVar);
            return aVar;
        }

        public final com.bykv.vk.openvk.preload.b.h a(java.lang.Class<? extends com.bykv.vk.openvk.preload.b.l> cls) {
            return com.bykv.vk.openvk.preload.b.h.a.a().a(cls).a(this.f1705a).a((com.bykv.vk.openvk.preload.b.b.a) null).b();
        }
    }

    /* JADX INFO: compiled from: SubBranchInterceptor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.util.List<com.bykv.vk.openvk.preload.b.h> f1704a = new java.util.ArrayList();

        public final com.bykv.vk.openvk.preload.b.l.a a(com.bykv.vk.openvk.preload.b.h hVar) {
            this.f1704a.add(hVar);
            return this;
        }

        public final com.bykv.vk.openvk.preload.b.l.a a(java.util.List<com.bykv.vk.openvk.preload.b.h> list) {
            this.f1704a.addAll(list);
            return this;
        }
    }
}
