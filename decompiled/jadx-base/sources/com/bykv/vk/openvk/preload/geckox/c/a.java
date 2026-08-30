package com.bykv.vk.openvk.preload.geckox.c;

/* JADX INFO: compiled from: BooleanTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends com.bykv.vk.openvk.preload.a.q<java.lang.Boolean> {
    @Override // com.bykv.vk.openvk.preload.a.q
    public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, java.lang.Boolean bool) throws java.io.IOException {
        java.lang.Boolean bool2 = bool;
        if (bool2 == null) {
            cVar.h();
        } else {
            cVar.a(bool2);
        }
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.a$1, reason: invalid class name */
    /* JADX INFO: compiled from: BooleanTypeAdapter.java */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1727a;

        static {
            int[] iArr = new int[com.bykv.vk.openvk.preload.a.d.b.values().length];
            f1727a = iArr;
            try {
                iArr[com.bykv.vk.openvk.preload.a.d.b.BOOLEAN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f1727a[com.bykv.vk.openvk.preload.a.d.b.NULL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f1727a[com.bykv.vk.openvk.preload.a.d.b.NUMBER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final /* synthetic */ java.lang.Boolean a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = aVar.f();
        int i = com.bykv.vk.openvk.preload.geckox.c.a.AnonymousClass1.f1727a[bVarF.ordinal()];
        if (i == 1) {
            return java.lang.Boolean.valueOf(aVar.i());
        }
        if (i == 2) {
            aVar.j();
            return null;
        }
        if (i == 3) {
            return java.lang.Boolean.valueOf(aVar.m() != 0);
        }
        throw new com.bykv.vk.openvk.preload.a.l("Expected BOOLEAN or NUMBER but was ".concat(java.lang.String.valueOf(bVarF)));
    }
}
