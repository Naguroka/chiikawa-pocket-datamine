package com.bytedance.sdk.openadsdk.eqN.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    public static final com.bytedance.sdk.openadsdk.eqN.bg.IL bg = new com.bytedance.sdk.openadsdk.eqN.bg.IL(0);
    public static final com.bytedance.sdk.openadsdk.eqN.bg.IL IL = new com.bytedance.sdk.openadsdk.eqN.bg.IL(1);
    public static final com.bytedance.sdk.openadsdk.eqN.bg.IL bX = new com.bytedance.sdk.openadsdk.eqN.bg.IL(2);
    public static final com.bytedance.sdk.openadsdk.eqN.bg.IL eqN = new com.bytedance.sdk.openadsdk.eqN.bg.IL(0);
    public static final com.bytedance.sdk.openadsdk.eqN.bg.IL zx = new com.bytedance.sdk.openadsdk.eqN.bg.IL(1);
    public static final com.bytedance.sdk.openadsdk.eqN.bg.IL ldr = new com.bytedance.sdk.openadsdk.eqN.bg.IL(2);

    public static void bg(com.bytedance.sdk.openadsdk.eqN.bg.IL il, boolean z, int i, long j) {
        try {
            il.iR.getAndSet(true);
            if (z) {
                il.bg.incrementAndGet();
                il.bX.addAndGet(j);
                return;
            }
            il.IL.incrementAndGet();
            java.lang.Integer num = il.ldr.get(java.lang.Integer.valueOf(i));
            if (num != null) {
                il.ldr.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(num.intValue() + 1));
            } else {
                il.ldr.put(java.lang.Integer.valueOf(i), 1);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.eqN.bg.IL il, boolean z) {
        try {
            il.iR.getAndSet(true);
            if (z) {
                il.bg.incrementAndGet();
            } else {
                il.IL.incrementAndGet();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.eqN.bg.IL il) {
        try {
            il.iR.getAndSet(true);
            il.zx.incrementAndGet();
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void bg() {
        try {
            com.bytedance.sdk.openadsdk.eqN.bg.IL il = bg;
            if (il.iR.get()) {
                com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", il.bg().toString());
            }
            com.bytedance.sdk.openadsdk.eqN.bg.IL il2 = IL;
            if (il2.iR.get()) {
                com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_net_state", "tt_sdk_event_net_state", il2.bg().toString());
            }
            com.bytedance.sdk.openadsdk.eqN.bg.IL il3 = bX;
            if (il3.iR.get()) {
                com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", il3.bg().toString());
            }
            com.bytedance.sdk.openadsdk.eqN.bg.IL il4 = eqN;
            if (il4.iR.get()) {
                com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", il4.IL().toString());
            }
            com.bytedance.sdk.openadsdk.eqN.bg.IL il5 = zx;
            if (il5.iR.get()) {
                com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_db_state", "tt_sdk_event_db_state", il5.IL().toString());
            }
            com.bytedance.sdk.openadsdk.eqN.bg.IL il6 = ldr;
            if (il6.iR.get()) {
                com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", il6.IL().toString());
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void IL() {
        try {
            com.bytedance.sdk.openadsdk.yDt.bX.IL("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.eqN.bg.IL("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_net_ad");
            com.bytedance.sdk.openadsdk.yDt.bX.IL("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.eqN.bg.IL("tt_sdk_event_net_state", "tt_sdk_event_net_state", ""));
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_net_state");
            com.bytedance.sdk.openadsdk.yDt.bX.IL("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.eqN.bg.IL("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_net_trail");
            com.bytedance.sdk.openadsdk.yDt.bX.IL("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.eqN.bg.IL("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_db_ad");
            com.bytedance.sdk.openadsdk.yDt.bX.IL("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.eqN.bg.IL("tt_sdk_event_db_state", "tt_sdk_event_db_state", ""));
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_db_state");
            com.bytedance.sdk.openadsdk.yDt.bX.IL("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.eqN.bg.IL("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_db_trail");
        } catch (java.lang.Throwable unused) {
        }
    }
}
