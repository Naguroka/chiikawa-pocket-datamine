package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class PX implements com.bytedance.sdk.openadsdk.oem.bg {
    private static com.bytedance.sdk.openadsdk.component.reward.bg.bg IL;
    private static boolean bX;
    private static final com.bytedance.sdk.openadsdk.utils.PX bg = new com.bytedance.sdk.openadsdk.utils.PX();

    public static void bg(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        com.bytedance.sdk.openadsdk.core.model.tC tCVarFW = bgVar.IL.fW();
        if (tCVarFW == null || !tCVarFW.bg()) {
            return;
        }
        IL = bgVar;
        com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver iPMiBroadcastReceiverBg = com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.bg(bgVar.Dxa);
        if (iPMiBroadcastReceiverBg != null) {
            iPMiBroadcastReceiverBg.bg(bg);
        }
    }

    public static void bg() {
        if (IL == null) {
            return;
        }
        IL = null;
        com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver iPMiBroadcastReceiverBg = com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        if (iPMiBroadcastReceiverBg != null) {
            iPMiBroadcastReceiverBg.bg();
        }
        bX = false;
    }

    public static void IL() {
        bX = true;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.bg
    public void bg(java.lang.String str, final int i) {
        com.bytedance.sdk.openadsdk.core.model.bX bXVarRiO;
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = IL;
        if (bgVar == null || (bXVarRiO = bgVar.IL.RiO()) == null) {
            return;
        }
        java.lang.String strBX = bXVarRiO.bX();
        if (android.text.TextUtils.isEmpty(strBX) || !strBX.equals(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.PX.1
            @Override // java.lang.Runnable
            public void run() {
                int i2;
                if (com.bytedance.sdk.openadsdk.utils.PX.IL == null || (i2 = i) <= 0 || i2 > 5) {
                    return;
                }
                boolean z = true;
                boolean z2 = i2 == 1;
                if (com.bytedance.sdk.openadsdk.utils.PX.bX) {
                    com.bytedance.sdk.openadsdk.utils.PX.IL.qC.eqN();
                    java.util.HashMap map = new java.util.HashMap();
                    map.put("click_scence", 4);
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, com.bytedance.sdk.openadsdk.utils.PX.IL.IL, new com.bytedance.sdk.openadsdk.core.model.eo.bg().bg(), com.bytedance.sdk.openadsdk.utils.PX.IL.zx, true, (java.util.Map<java.lang.String, java.lang.Object>) map, 1);
                } else {
                    z = z2;
                }
                if (z) {
                    com.bytedance.sdk.openadsdk.utils.PX.bg();
                }
            }
        });
    }
}
