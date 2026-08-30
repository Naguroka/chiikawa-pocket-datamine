package com.bytedance.sdk.component.iR.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends com.bytedance.sdk.component.iR.IL.bX {
    com.bytedance.sdk.component.IL.bg.yDt bg;

    public eqN(com.bytedance.sdk.component.IL.bg.VB vb) {
        super(vb);
        this.bg = null;
    }

    public void eqN(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
        }
        this.bg = com.bytedance.sdk.component.IL.bg.yDt.bg(com.bytedance.sdk.component.IL.bg.WR.bg("application/json; charset=utf-8"), str);
    }

    public void bg(org.json.JSONObject jSONObject) {
        this.bg = com.bytedance.sdk.component.IL.bg.yDt.bg(com.bytedance.sdk.component.IL.bg.WR.bg("application/json; charset=utf-8"), jSONObject != null ? jSONObject.toString() : com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON);
    }

    public void bg(java.lang.String str, byte[] bArr) {
        this.bg = com.bytedance.sdk.component.IL.bg.yDt.bg(com.bytedance.sdk.component.IL.bg.WR.bg(str), bArr);
    }

    public void bg(final com.bytedance.sdk.component.iR.bg.bg bgVar) {
        try {
            com.bytedance.sdk.component.IL.bg.Ta.bg bgVar2 = new com.bytedance.sdk.component.IL.bg.Ta.bg();
            if (android.text.TextUtils.isEmpty(this.Kg)) {
                bgVar.bg(this, new java.io.IOException("Url is Empty"));
                return;
            }
            if (!android.text.TextUtils.isEmpty(this.zx)) {
                bgVar2.bg(this.zx);
            }
            if (this.ldr > 0) {
                bgVar2.bg(this.ldr);
            }
            bgVar2.IL(this.Kg);
            if (this.bg == null) {
                if (bgVar != null) {
                    bgVar.bg(this, new java.io.IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                bg(bgVar2);
                bgVar2.bg((java.lang.Object) bX());
                this.bX.bg(bgVar2.bg(this.bg).IL()).bg(new com.bytedance.sdk.component.IL.bg.bX() { // from class: com.bytedance.sdk.component.iR.IL.eqN.1
                    @Override // com.bytedance.sdk.component.IL.bg.bX
                    public void bg(com.bytedance.sdk.component.IL.bg.IL il, java.io.IOException iOException) {
                        com.bytedance.sdk.component.iR.bg.bg bgVar3 = bgVar;
                        if (bgVar3 != null) {
                            bgVar3.bg(com.bytedance.sdk.component.iR.IL.eqN.this, iOException);
                        }
                    }

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.bytedance.sdk.component.IL.bg.bX
                    public void bg(com.bytedance.sdk.component.IL.bg.IL il, com.bytedance.sdk.component.IL.bg.Lq lq) throws java.io.IOException {
                        com.bytedance.sdk.component.iR.IL il2;
                        com.bytedance.sdk.component.iR.bg.bg bgVar3 = bgVar;
                        if (bgVar3 != null) {
                            if (lq == null) {
                                bgVar3.bg(com.bytedance.sdk.component.iR.IL.eqN.this, new java.io.IOException("No response"));
                                return;
                            }
                            com.bytedance.sdk.component.iR.IL il3 = null;
                            java.io.IOException iOException = null;
                            try {
                                java.util.HashMap map = new java.util.HashMap();
                                com.bytedance.sdk.component.IL.bg.ldr ldrVarIR = lq.iR();
                                if (ldrVarIR != null) {
                                    for (int i = 0; i < ldrVarIR.bg(); i++) {
                                        java.lang.String strBg = ldrVarIR.bg(i);
                                        java.lang.String strIL = ldrVarIR.IL(i);
                                        map.put(strBg, strIL);
                                        if (strBg != null && strBg.equalsIgnoreCase("content-type")) {
                                            map.put("content-type", strIL == null ? "" : strIL.toLowerCase());
                                        }
                                    }
                                }
                                try {
                                    if (com.bytedance.sdk.component.iR.eqN.bg.bg(map)) {
                                        byte[] bArrEqN = lq.ldr().eqN();
                                        il2 = new com.bytedance.sdk.component.iR.IL(lq.eqN(), lq.bX(), lq.zx(), map, null, lq.IL(), lq.bg());
                                        il2.bg(bArrEqN);
                                    } else if (com.bytedance.sdk.component.iR.IL.eqN.this.WR) {
                                        byte[] bArrEqN2 = lq.ldr().eqN();
                                        com.bytedance.sdk.component.iR.IL.eqN eqn = com.bytedance.sdk.component.iR.IL.eqN.this;
                                        il2 = new com.bytedance.sdk.component.iR.IL(lq.eqN(), lq.bX(), lq.zx(), map, new java.lang.String(bArrEqN2, eqn.bg(eqn.bg(lq.ldr()))), lq.IL(), lq.bg());
                                        il2.bg(bArrEqN2);
                                    } else {
                                        il2 = new com.bytedance.sdk.component.iR.IL(lq.eqN(), lq.bX(), lq.zx(), map, lq.ldr().IL(), lq.IL(), lq.bg());
                                    }
                                    com.bytedance.sdk.component.iR.IL.eqN.this.bg(il2, lq);
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    il3 = il2;
                                    il2 = il3;
                                    iOException = new java.io.IOException(th);
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                            }
                            if (il2 != null) {
                                bgVar.bg(com.bytedance.sdk.component.iR.IL.eqN.this, il2);
                                return;
                            }
                            com.bytedance.sdk.component.iR.bg.bg bgVar4 = bgVar;
                            if (bgVar4 instanceof com.bytedance.sdk.component.iR.bg.IL) {
                                com.bytedance.sdk.component.iR.bg.IL il4 = (com.bytedance.sdk.component.iR.bg.IL) bgVar4;
                                com.bytedance.sdk.component.iR.IL.eqN eqn2 = com.bytedance.sdk.component.iR.IL.eqN.this;
                                if (iOException == null) {
                                    iOException = new java.io.IOException("Unexpected exception");
                                }
                                il4.bg(eqn2, iOException, new com.bytedance.sdk.component.iR.IL(lq.eqN(), lq.bX(), lq.zx(), null, null, lq.IL(), lq.bg()));
                                return;
                            }
                            com.bytedance.sdk.component.iR.IL.eqN eqn3 = com.bytedance.sdk.component.iR.IL.eqN.this;
                            if (iOException == null) {
                                iOException = new java.io.IOException("Unexpected exception");
                            }
                            bgVar4.bg(eqn3, iOException);
                        }
                    }
                });
            }
        } catch (java.lang.Throwable th) {
            bgVar.bg(this, new java.io.IOException(th.getMessage()));
        }
    }

    public com.bytedance.sdk.component.iR.IL bg() {
        com.bytedance.sdk.component.iR.IL il;
        try {
            com.bytedance.sdk.component.IL.bg.Ta.bg bgVar = new com.bytedance.sdk.component.IL.bg.Ta.bg();
            if (android.text.TextUtils.isEmpty(this.Kg)) {
                return new com.bytedance.sdk.component.iR.IL(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            bgVar.IL(this.Kg);
            if (this.bg == null) {
                return new com.bytedance.sdk.component.iR.IL(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            bg(bgVar);
            bgVar.bg((java.lang.Object) bX());
            com.bytedance.sdk.component.IL.bg.Lq lqIL = this.bX.bg(bgVar.bg(this.bg).IL()).IL();
            if (lqIL == null) {
                return null;
            }
            java.util.HashMap map = new java.util.HashMap();
            com.bytedance.sdk.component.IL.bg.ldr ldrVarIR = lqIL.iR();
            if (ldrVarIR != null) {
                for (int i = 0; i < ldrVarIR.bg(); i++) {
                    java.lang.String strBg = ldrVarIR.bg(i);
                    java.lang.String strIL = ldrVarIR.IL(i);
                    map.put(strBg, strIL);
                    if (strBg != null && strBg.equalsIgnoreCase("content-type")) {
                        map.put("content-type", strIL == null ? "" : strIL.toLowerCase());
                    }
                }
            }
            if (com.bytedance.sdk.component.iR.eqN.bg.bg(map)) {
                byte[] bArrEqN = lqIL.ldr().eqN();
                il = new com.bytedance.sdk.component.iR.IL(lqIL.eqN(), lqIL.bX(), lqIL.zx(), map, null, lqIL.IL(), lqIL.bg());
                il.bg(bArrEqN);
            } else if (this.WR) {
                byte[] bArrEqN2 = lqIL.ldr().eqN();
                il = new com.bytedance.sdk.component.iR.IL(lqIL.eqN(), lqIL.bX(), lqIL.zx(), map, new java.lang.String(bArrEqN2, bg(bg(lqIL.ldr()))), lqIL.IL(), lqIL.bg());
                il.bg(bArrEqN2);
            } else {
                il = new com.bytedance.sdk.component.iR.IL(lqIL.eqN(), lqIL.bX(), lqIL.zx(), map, lqIL.ldr().IL(), lqIL.IL(), lqIL.bg());
            }
            bg(il, lqIL);
            return il;
        } catch (java.lang.Throwable th) {
            return new com.bytedance.sdk.component.iR.IL(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public com.bytedance.sdk.component.IL.bg.yDt eqN() {
        return this.bg;
    }

    public void bg(java.lang.String str, boolean z) {
        if (z) {
            bg("application/json; charset=utf-8", zx(str));
            IL(com.google.common.net.HttpHeaders.CONTENT_ENCODING, "gzip");
        } else {
            eqN(str);
        }
    }

    private byte[] zx(java.lang.String str) throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.util.zip.GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            try {
                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    try {
                        java.util.zip.GZIPOutputStream gZIPOutputStream2 = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream2.write(str.getBytes(com.json.zb.N));
                            try {
                                gZIPOutputStream2.close();
                            } catch (java.io.IOException e) {
                                com.bytedance.sdk.component.utils.PX.bg("PostExecutor", e.toString());
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (java.io.IOException e2) {
                            e = e2;
                            gZIPOutputStream = gZIPOutputStream2;
                            com.bytedance.sdk.component.utils.PX.bg("PostExecutor", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (java.io.IOException e3) {
                                    com.bytedance.sdk.component.utils.PX.bg("PostExecutor", e3.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            return byteArray;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (java.io.IOException e4) {
                                    com.bytedance.sdk.component.utils.PX.bg("PostExecutor", e4.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (java.io.IOException e5) {
                                    com.bytedance.sdk.component.utils.PX.bg("PostExecutor", e5.toString());
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (java.io.IOException e6) {
                        e = e6;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.io.IOException e7) {
                com.bytedance.sdk.component.utils.PX.bg("PostExecutor", e7.toString());
            }
        } catch (java.io.IOException e8) {
            e = e8;
            byteArrayOutputStream = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        return byteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.charset.Charset bg(com.bytedance.sdk.component.IL.bg.WR wr) {
        try {
            return wr != null ? wr.bg(com.bytedance.sdk.component.IL.bg.IL.WR.bg) : com.bytedance.sdk.component.IL.bg.IL.WR.bg;
        } catch (java.lang.Exception unused) {
            return com.bytedance.sdk.component.IL.bg.IL.WR.bg;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.component.IL.bg.WR bg(com.bytedance.sdk.component.IL.bg.xxp xxpVar) {
        try {
            return xxpVar.zx();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.component.iR.IL il, com.bytedance.sdk.component.IL.bg.Lq lq) {
        if (il == null || lq == null) {
            return;
        }
        il.bg(lq.WR());
    }
}
