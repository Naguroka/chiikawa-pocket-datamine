package com.bytedance.sdk.openadsdk.core.Ta.zx;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    public static final com.bykv.vk.openvk.bg.bg.bg.zx.bg bg = new com.bykv.vk.openvk.bg.bg.IL.bg.IL.bg();

    private static boolean bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        return true;
    }

    public static void bg(final com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, final com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg interfaceC0072bg) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        com.bytedance.sdk.openadsdk.AdSlot adSlot;
        if ((bXVar.bX() > 0 || bXVar.eo()) && bXVar.Lq() != -2) {
            if (bXVar.Lq() != 1) {
                bXVar.eqN(androidx.media3.common.PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
                bXVar.zx(androidx.media3.common.PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
                bXVar.ldr(androidx.media3.common.PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
                boolean z = bXVar.zx("material_meta") != null && (bXVar.zx("material_meta") instanceof com.bytedance.sdk.openadsdk.core.model.tuV);
                boolean z2 = bXVar.zx("ad_slot") != null && (bXVar.zx("ad_slot") instanceof com.bytedance.sdk.openadsdk.AdSlot);
                if (z && z2) {
                    tuv = (com.bytedance.sdk.openadsdk.core.model.tuV) bXVar.zx("material_meta");
                    com.bytedance.sdk.openadsdk.AdSlot adSlot2 = (com.bytedance.sdk.openadsdk.AdSlot) bXVar.zx("ad_slot");
                    IL(bXVar, tuv, adSlot2);
                    adSlot = adSlot2;
                } else {
                    tuv = null;
                    adSlot = null;
                }
                final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                final com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = tuv;
                final com.bytedance.sdk.openadsdk.AdSlot adSlot3 = adSlot;
                final com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg interfaceC0072bg2 = new com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg() { // from class: com.bytedance.sdk.openadsdk.core.Ta.zx.bg.1
                    @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                    public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar2, int i) {
                        com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg interfaceC0072bg3 = interfaceC0072bg;
                        if (interfaceC0072bg3 != null) {
                            interfaceC0072bg3.bg(bXVar2, i);
                        }
                        if (tuv2 == null || adSlot3 == null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.Ta.zx.bg.IL(bXVar, tuv2, adSlot3, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }

                    @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                    public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar2, int i, java.lang.String str) {
                        com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg interfaceC0072bg3 = interfaceC0072bg;
                        if (interfaceC0072bg3 != null) {
                            interfaceC0072bg3.bg(bXVar2, i, str);
                        }
                        if (tuv2 == null || adSlot3 == null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.Ta.zx.bg.IL(bXVar, tuv2, adSlot3, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, i, str);
                    }

                    @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                    public void IL(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar2, int i) {
                        com.bytedance.sdk.openadsdk.AdSlot adSlot4;
                        com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg interfaceC0072bg3 = interfaceC0072bg;
                        if (interfaceC0072bg3 != null) {
                            interfaceC0072bg3.bg(bXVar2, i);
                        }
                        com.bytedance.sdk.openadsdk.core.model.tuV tuv3 = tuv2;
                        if (tuv3 != null && (adSlot4 = adSlot3) != null) {
                            com.bytedance.sdk.openadsdk.core.Ta.zx.bg.bX(bXVar, tuv3, adSlot4);
                        }
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        bXVar.yDt();
                    }
                };
                if (!bg(bXVar.Ta())) {
                    if (interfaceC0072bg != null) {
                        interfaceC0072bg.bg(bXVar, 404, "unexpected url: " + bXVar.Ta());
                    }
                    IL(bXVar, tuv, adSlot, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, -1, "video url is invalid");
                    return;
                } else {
                    com.bytedance.sdk.component.Kg.Kg kg = new com.bytedance.sdk.component.Kg.Kg("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.Ta.zx.bg.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                com.bytedance.sdk.openadsdk.core.Ta.zx.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), bXVar, interfaceC0072bg2);
                            } catch (java.lang.Throwable th) {
                                th.getMessage();
                            }
                        }
                    };
                    if (com.bytedance.sdk.openadsdk.utils.VJ.zx()) {
                        com.bytedance.sdk.openadsdk.utils.VJ.IL(kg);
                        return;
                    } else {
                        kg.run();
                        return;
                    }
                }
            }
        }
        if (interfaceC0072bg != null) {
            interfaceC0072bg.bg(bXVar, 100);
        }
    }

    private static void IL(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        if (bg(bXVar)) {
            com.bytedance.sdk.openadsdk.yDt.bX.bg("load_video_start", new com.bytedance.sdk.openadsdk.eqN.zx.IL.bg(tuv, com.bytedance.sdk.openadsdk.utils.ayS.bX(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(tuv, (java.lang.String) null, -1, bXVar), new com.bytedance.sdk.openadsdk.eqN.zx.IL.VB(bXVar.Ta(), bXVar.eo() ? bXVar.WR() : bXVar.bX())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot, long j, int i, java.lang.String str) {
        if (bg(bXVar)) {
            java.lang.String strBX = com.bytedance.sdk.openadsdk.utils.ayS.bX(adSlot.getDurationSlotType());
            org.json.JSONObject jSONObjectBg = com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(tuv, (java.lang.String) null, -1, bXVar);
            com.bytedance.sdk.openadsdk.eqN.zx.IL.eo eoVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.eo();
            eoVar.bg(bXVar.Ta());
            eoVar.bg(bXVar.bX());
            eoVar.IL(j);
            eoVar.bg(i);
            if (android.text.TextUtils.isEmpty(str)) {
                str = "";
            }
            eoVar.IL(str);
            eoVar.bX("");
            com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg((com.bytedance.sdk.openadsdk.eqN.zx.IL.bg<com.bytedance.sdk.openadsdk.eqN.zx.IL.eo>) new com.bytedance.sdk.openadsdk.eqN.zx.IL.bg(tuv, strBX, jSONObjectBg, eoVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot, long j) {
        if (bg(bXVar)) {
            java.lang.String strBX = com.bytedance.sdk.openadsdk.utils.ayS.bX(adSlot.getDurationSlotType());
            org.json.JSONObject jSONObjectBg = com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(tuv, (java.lang.String) null, -1, bXVar);
            com.bytedance.sdk.openadsdk.eqN.zx.IL.PX px = new com.bytedance.sdk.openadsdk.eqN.zx.IL.PX();
            px.bg(bXVar.Ta());
            px.bg(bXVar.bX());
            px.IL(j);
            if (bXVar.tuV() == 1) {
                px.bX(1L);
            } else {
                px.bX(0L);
            }
            com.bytedance.sdk.openadsdk.yDt.bX.bg("load_video_success", new com.bytedance.sdk.openadsdk.eqN.zx.IL.bg(tuv, strBX, jSONObjectBg, px));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bX(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        if (bg(bXVar)) {
            com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.IL((com.bytedance.sdk.openadsdk.eqN.zx.IL.bg<com.bytedance.sdk.openadsdk.eqN.zx.IL.WR>) new com.bytedance.sdk.openadsdk.eqN.zx.IL.bg(tuv, com.bytedance.sdk.openadsdk.utils.ayS.bX(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(tuv, (java.lang.String) null, -1, bXVar), new com.bytedance.sdk.openadsdk.eqN.zx.IL.WR(bXVar.Ta(), bXVar.bX())));
        }
    }

    public static boolean bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        return com.bytedance.sdk.component.IL.bg.iR.bX(str) != null;
    }
}
