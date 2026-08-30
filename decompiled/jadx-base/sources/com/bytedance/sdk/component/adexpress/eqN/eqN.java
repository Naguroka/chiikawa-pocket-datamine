package com.bytedance.sdk.component.adexpress.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    public static void bg(com.bytedance.sdk.component.Kg.Kg kg, int i) {
        if (kg == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.bg.bg.bX bXVarBX = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX();
        java.util.concurrent.ExecutorService executorServiceYDt = bXVarBX != null ? bXVarBX.yDt() : null;
        if (executorServiceYDt != null) {
            kg.setPriority(i);
            executorServiceYDt.execute(kg);
        } else {
            com.bytedance.sdk.component.Kg.ldr.bg(kg, i);
        }
    }

    public static void IL(com.bytedance.sdk.component.Kg.Kg kg, int i) {
        if (kg == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.bg.bg.bX bXVarBX = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX();
        java.util.concurrent.ExecutorService executorServiceTa = bXVarBX != null ? bXVarBX.Ta() : null;
        if (executorServiceTa != null) {
            kg.setPriority(i);
            executorServiceTa.execute(kg);
        } else {
            com.bytedance.sdk.component.Kg.ldr.bg(kg);
        }
    }

    public static java.util.concurrent.ScheduledFuture bg(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return com.bytedance.sdk.component.Kg.ldr.ldr().schedule(runnable, j, timeUnit);
    }
}
