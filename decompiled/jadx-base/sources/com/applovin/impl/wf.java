package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wf {

    private static class a extends com.applovin.impl.e {
        transient com.applovin.exoplayer2.common.base.Supplier g;

        a(java.util.Map map, com.applovin.exoplayer2.common.base.Supplier supplier) {
            super(map);
            this.g = (com.applovin.exoplayer2.common.base.Supplier) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(supplier);
        }

        @Override // com.applovin.impl.h
        java.util.Set c() {
            return i();
        }

        @Override // com.applovin.impl.h
        java.util.Map b() {
            return h();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.applovin.impl.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public java.util.List g() {
            return (java.util.List) this.g.get();
        }
    }

    static boolean a(com.applovin.impl.tf tfVar, java.lang.Object obj) {
        if (obj == tfVar) {
            return true;
        }
        if (obj instanceof com.applovin.impl.tf) {
            return tfVar.a().equals(((com.applovin.impl.tf) obj).a());
        }
        return false;
    }

    public static com.applovin.impl.ec a(java.util.Map map, com.applovin.exoplayer2.common.base.Supplier supplier) {
        return new com.applovin.impl.wf.a(map, supplier);
    }
}
