package com.bytedance.sdk.component.bg;

/* JADX INFO: loaded from: classes3.dex */
class iR implements com.bytedance.sdk.component.bg.rri.bg {
    private final com.bytedance.sdk.component.bg.LZ IL;
    private final boolean Kg;
    private final boolean WR;
    private final com.bytedance.sdk.component.bg.Kg bg;
    private final com.bytedance.sdk.component.bg.bg eo;
    private final com.bytedance.sdk.component.bg.Ta iR;
    private final java.util.Map<java.lang.String, com.bytedance.sdk.component.bg.IL> bX = new java.util.HashMap();
    private final java.util.Map<java.lang.String, com.bytedance.sdk.component.bg.eqN.IL> eqN = new java.util.HashMap();
    private final java.util.List<com.bytedance.sdk.component.bg.xxp> zx = new java.util.ArrayList();
    private final java.util.Set<com.bytedance.sdk.component.bg.eqN> ldr = new java.util.HashSet();

    iR(com.bytedance.sdk.component.bg.eo eoVar, com.bytedance.sdk.component.bg.bg bgVar, com.bytedance.sdk.component.bg.tC tCVar) {
        this.eo = bgVar;
        this.bg = eoVar.eqN;
        com.bytedance.sdk.component.bg.LZ lz = new com.bytedance.sdk.component.bg.LZ(tCVar, eoVar.PX, eoVar.Ta);
        this.IL = lz;
        lz.bg(this);
        lz.bg(eoVar.vb);
        this.iR = eoVar.WR;
        this.Kg = eoVar.Kg;
        this.WR = eoVar.Lq;
    }

    com.bytedance.sdk.component.bg.iR.bg bg(com.bytedance.sdk.component.bg.xxp xxpVar, com.bytedance.sdk.component.bg.ldr ldrVar) throws java.lang.Exception {
        com.bytedance.sdk.component.bg.IL il = this.bX.get(xxpVar.eqN);
        if (il != null) {
            try {
                com.bytedance.sdk.component.bg.kMt kmtIL = IL(ldrVar.IL, il);
                ldrVar.eqN = kmtIL;
                if (kmtIL == null) {
                    new java.lang.StringBuilder("Permission denied, call: ").append(xxpVar);
                    throw new com.bytedance.sdk.component.bg.tuV(-1);
                }
                if (il instanceof com.bytedance.sdk.component.bg.zx) {
                    new java.lang.StringBuilder("Processing stateless call: ").append(xxpVar);
                    return bg(xxpVar, (com.bytedance.sdk.component.bg.zx) il, ldrVar);
                }
                if (il instanceof com.bytedance.sdk.component.bg.bX) {
                    new java.lang.StringBuilder("Processing raw call: ").append(xxpVar);
                    return bg(xxpVar, (com.bytedance.sdk.component.bg.bX) il, kmtIL);
                }
            } catch (com.bytedance.sdk.component.bg.tC.bg unused) {
                new java.lang.StringBuilder("No remote permission config fetched, call pending: ").append(xxpVar);
                this.zx.add(xxpVar);
                return new com.bytedance.sdk.component.bg.iR.bg(false, com.bytedance.sdk.component.bg.JAA.bg());
            }
        }
        com.bytedance.sdk.component.bg.eqN.IL il2 = this.eqN.get(xxpVar.eqN);
        if (il2 != null) {
            com.bytedance.sdk.component.bg.eqN eqnBg = il2.bg();
            eqnBg.bg(xxpVar.eqN);
            com.bytedance.sdk.component.bg.kMt kmtIL2 = IL(ldrVar.IL, eqnBg);
            ldrVar.eqN = kmtIL2;
            if (kmtIL2 == null) {
                new java.lang.StringBuilder("Permission denied, call: ").append(xxpVar);
                eqnBg.eqN();
                throw new com.bytedance.sdk.component.bg.tuV(-1);
            }
            new java.lang.StringBuilder("Processing stateful call: ").append(xxpVar);
            return bg(xxpVar, eqnBg, ldrVar);
        }
        new java.lang.StringBuilder("Received call: ").append(xxpVar);
        return null;
    }

    void bg(java.lang.String str, com.bytedance.sdk.component.bg.zx<?, ?> zxVar) {
        zxVar.bg(str);
        this.bX.put(str, zxVar);
    }

    void bg(java.lang.String str, com.bytedance.sdk.component.bg.eqN.IL il) {
        this.eqN.put(str, il);
    }

    void bg() {
        java.util.Iterator<com.bytedance.sdk.component.bg.eqN> it = this.ldr.iterator();
        while (it.hasNext()) {
            it.next().zx();
        }
        this.ldr.clear();
        this.bX.clear();
        this.eqN.clear();
        this.IL.IL(this);
    }

    private com.bytedance.sdk.component.bg.iR.bg bg(com.bytedance.sdk.component.bg.xxp xxpVar, com.bytedance.sdk.component.bg.zx zxVar, com.bytedance.sdk.component.bg.ldr ldrVar) throws java.lang.Exception {
        return new com.bytedance.sdk.component.bg.iR.bg(true, com.bytedance.sdk.component.bg.JAA.bg(this.bg.bg(zxVar.bg(bg(xxpVar.zx, (com.bytedance.sdk.component.bg.IL) zxVar), ldrVar))));
    }

    private com.bytedance.sdk.component.bg.iR.bg bg(final com.bytedance.sdk.component.bg.xxp xxpVar, final com.bytedance.sdk.component.bg.eqN eqn, com.bytedance.sdk.component.bg.ldr ldrVar) throws java.lang.Exception {
        this.ldr.add(eqn);
        eqn.bg(bg(xxpVar.zx, eqn), ldrVar, new com.bytedance.sdk.component.bg.eqN.bg() { // from class: com.bytedance.sdk.component.bg.iR.1
            @Override // com.bytedance.sdk.component.bg.eqN.bg
            public void bg(java.lang.Object obj) {
                if (com.bytedance.sdk.component.bg.iR.this.eo == null) {
                    return;
                }
                com.bytedance.sdk.component.bg.iR.this.eo.IL(com.bytedance.sdk.component.bg.JAA.bg(com.bytedance.sdk.component.bg.iR.this.bg.bg(obj)), xxpVar);
                com.bytedance.sdk.component.bg.iR.this.ldr.remove(eqn);
            }

            @Override // com.bytedance.sdk.component.bg.eqN.bg
            public void bg(java.lang.Throwable th) {
                if (com.bytedance.sdk.component.bg.iR.this.eo == null) {
                    return;
                }
                com.bytedance.sdk.component.bg.iR.this.eo.IL(com.bytedance.sdk.component.bg.JAA.bg(th), xxpVar);
                com.bytedance.sdk.component.bg.iR.this.ldr.remove(eqn);
            }
        });
        return new com.bytedance.sdk.component.bg.iR.bg(false, com.bytedance.sdk.component.bg.JAA.bg());
    }

    private com.bytedance.sdk.component.bg.iR.bg bg(final com.bytedance.sdk.component.bg.xxp xxpVar, com.bytedance.sdk.component.bg.bX bXVar, com.bytedance.sdk.component.bg.kMt kmt) throws java.lang.Exception {
        new com.bytedance.sdk.component.bg.Fy(xxpVar.eqN, kmt, new com.bytedance.sdk.component.bg.Fy.bg() { // from class: com.bytedance.sdk.component.bg.iR.2
        });
        return new com.bytedance.sdk.component.bg.iR.bg(false, com.bytedance.sdk.component.bg.JAA.bg());
    }

    private java.lang.Object bg(java.lang.String str, com.bytedance.sdk.component.bg.IL il) throws org.json.JSONException {
        return this.bg.bg(str, bg(il)[0]);
    }

    private com.bytedance.sdk.component.bg.kMt IL(java.lang.String str, com.bytedance.sdk.component.bg.IL il) {
        if (this.WR) {
            return com.bytedance.sdk.component.bg.kMt.PRIVATE;
        }
        return this.IL.bg(this.Kg, str, il);
    }

    private static java.lang.reflect.Type[] bg(java.lang.Object obj) {
        java.lang.reflect.Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass == null) {
            throw new java.lang.IllegalStateException("Method is not parameterized?!");
        }
        return ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments();
    }

    static final class bg {
        java.lang.String IL;
        boolean bg;

        private bg(boolean z, java.lang.String str) {
            this.bg = z;
            this.IL = str;
        }
    }
}
