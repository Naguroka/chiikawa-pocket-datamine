package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class PX {
    private static java.lang.String IL;
    private static java.lang.String bg;

    public static void bg() {
        com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bg(new com.bytedance.sdk.component.adexpress.bg.bg.IL() { // from class: com.bytedance.sdk.openadsdk.core.Kg.PX.1
            @Override // com.bytedance.sdk.component.adexpress.bg.bg.IL
            public int bg(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.IL
            public android.database.Cursor bg(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
                return new com.bytedance.sdk.openadsdk.multipro.aidl.bX(com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.IL
            public int bg(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.IL
            public void bg(java.lang.String str, android.content.ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bg(new com.bytedance.sdk.component.adexpress.bg.bg.bX() { // from class: com.bytedance.sdk.openadsdk.core.Kg.PX.2
            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public int PX() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public int WR() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public int bg() {
                if (com.bytedance.sdk.openadsdk.core.VzQ.eqN() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.VzQ.eqN().eqN();
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public android.content.Context IL() {
                return com.bytedance.sdk.openadsdk.core.VzQ.bg();
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public android.os.Handler bX() {
                return com.bytedance.sdk.openadsdk.core.yDt.bX();
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public void eqN() {
                if ((com.bytedance.sdk.openadsdk.core.VzQ.eqN().lM() == 0 || com.bytedance.sdk.openadsdk.core.VzQ.eqN().GZ() == 0) && (com.bytedance.sdk.openadsdk.core.VzQ.eqN().gXn() == 0 || com.bytedance.sdk.openadsdk.core.VzQ.eqN().bCU() == 0)) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.zx.zx.bg().bg(com.bytedance.sdk.openadsdk.core.VzQ.eqN().lM());
                com.bytedance.sdk.component.adexpress.zx.zx.bg().IL(com.bytedance.sdk.openadsdk.core.VzQ.eqN().gXn());
                android.os.MessageQueue[] messageQueueArr = new android.os.MessageQueue[1];
                bg(com.bytedance.sdk.openadsdk.core.yDt.bX().getLooper().getQueue());
            }

            /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.Kg.PX$2$1, reason: invalid class name */
            class AnonymousClass1 implements java.lang.Runnable {
                final /* synthetic */ android.os.MessageQueue[] bg;

                AnonymousClass1(android.os.MessageQueue[] messageQueueArr) {
                    this.bg = messageQueueArr;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.bg[0] = android.os.Looper.myQueue();
                    bg(this.bg[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void bg(android.os.MessageQueue messageQueue) {
                if (messageQueue != null) {
                    messageQueue.addIdleHandler(new android.os.MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.Kg.PX.2.2
                        @Override // android.os.MessageQueue.IdleHandler
                        public boolean queueIdle() {
                            if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().GZ() > 0) {
                                com.bytedance.sdk.openadsdk.core.widget.bg.IL il = new com.bytedance.sdk.openadsdk.core.widget.bg.IL();
                                il.bg(false);
                                il.IL();
                            }
                            if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().bCU() > 0) {
                                com.bytedance.sdk.openadsdk.core.widget.bg.IL il2 = new com.bytedance.sdk.openadsdk.core.widget.bg.IL();
                                il2.bg(true);
                                il2.IL();
                            }
                            return false;
                        }
                    });
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public com.bytedance.sdk.component.adexpress.bg.bX.bg zx() {
                return com.bytedance.sdk.openadsdk.core.VzQ.bX().bg();
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public com.bytedance.sdk.component.iR.IL.bg ldr() {
                com.bytedance.sdk.component.iR.IL.bg bgVarEqN = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().eqN();
                bgVarEqN.bg(8);
                bgVarEqN.bg("express_down");
                return bgVarEqN;
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public com.bytedance.sdk.component.iR.IL.IL iR() {
                com.bytedance.sdk.component.iR.IL.IL ilBX = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().bX();
                ilBX.bg(8);
                ilBX.bg("express_get");
                return ilBX;
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public java.lang.String Kg() {
                return com.bytedance.sdk.openadsdk.core.WR.IL().eqN();
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public int eo() {
                return com.bytedance.sdk.openadsdk.core.VzQ.eqN().lM();
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public int VB() {
                return com.bytedance.sdk.openadsdk.core.VzQ.eqN().gXn();
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public java.util.concurrent.ExecutorService Ta() {
                if (com.bytedance.sdk.openadsdk.utils.VJ.VB()) {
                    return com.bytedance.sdk.openadsdk.utils.VJ.eqN();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public java.util.concurrent.ExecutorService yDt() {
                if (com.bytedance.sdk.openadsdk.utils.VJ.VB()) {
                    return com.bytedance.sdk.openadsdk.utils.VJ.WR();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public int Lq() {
                return com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg());
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public int vb() {
                return com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg());
            }

            @Override // com.bytedance.sdk.component.adexpress.bg.bg.bX
            public boolean xxp() {
                return com.bytedance.sdk.openadsdk.Fy.bg.bg("destroy_render_script", false);
            }
        });
        com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bg(new com.bytedance.sdk.component.adexpress.bg.bg.eqN() { // from class: com.bytedance.sdk.openadsdk.core.Kg.PX.3
            @Override // com.bytedance.sdk.component.adexpress.bg.bg.eqN
            public void bg(int i) {
                com.bytedance.sdk.openadsdk.yDt.bX.bg().bg(com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().IL(i).ldr(com.bytedance.sdk.openadsdk.core.Kg.bg(i)));
            }
        });
        com.bytedance.sdk.component.WR.bg.bg.bg().bg(new com.bytedance.sdk.component.WR.bg.IL() { // from class: com.bytedance.sdk.openadsdk.core.Kg.PX.4
            @Override // com.bytedance.sdk.component.WR.bg.IL
            public void bg(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.eqN.bX.bX(com.bytedance.sdk.openadsdk.utils.IL.bg(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.WR.bg.IL
            public void bg(com.bytedance.sdk.component.WR.IL.bg bgVar, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, long j) {
                com.bytedance.sdk.openadsdk.core.model.tuV tuvBX = com.bytedance.sdk.openadsdk.core.model.tuV.bX();
                tuvBX.xxp(bgVar.bg());
                tuvBX.Fy(bgVar.IL());
                tuvBX.VzQ(bgVar.bX());
                com.bytedance.sdk.openadsdk.eqN.bX.IL(tuvBX, str, str2, jSONObject, j);
            }
        });
    }

    public static java.lang.String IL() {
        java.lang.String strBX;
        if (bg == null) {
            bg = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVarIL = com.bytedance.sdk.component.adexpress.bg.IL.Kg.IL();
        if (bgVarIL != null && (strBX = bgVarIL.bX()) != null && !strBX.equals(bg)) {
            bg = strBX;
            com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sp", "js_render_ver", strBX);
        }
        return bg;
    }

    public static java.lang.String bX() {
        java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> mapBg;
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar;
        java.lang.String strBX;
        if (IL == null) {
            IL = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVarIL = com.bytedance.sdk.component.adexpress.bg.IL.Kg.IL();
        if (bgVarIL != null && (mapBg = bgVarIL.bg()) != null && (bgVar = mapBg.get("v3")) != null && (strBX = bgVar.bX()) != null && !strBX.equals(IL)) {
            IL = strBX;
            com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sp", "js_render_v3_ver", strBX);
        }
        return IL;
    }
}
