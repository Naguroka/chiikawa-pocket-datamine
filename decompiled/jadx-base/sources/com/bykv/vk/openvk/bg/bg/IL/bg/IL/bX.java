package com.bykv.vk.openvk.bg.bg.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    public static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL> bg = new java.util.concurrent.ConcurrentHashMap<>();

    public static synchronized void bg(android.content.Context context, com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg interfaceC0072bg) {
        if (bXVar == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL> concurrentHashMap = bg;
        com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL il = concurrentHashMap.get(bXVar.yDt());
        if (il == null) {
            il = new com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL(context, bXVar);
            concurrentHashMap.put(bXVar.yDt(), il);
            java.lang.Object[] objArr = new java.lang.Object[3];
            java.lang.Integer.valueOf(bXVar.bX());
            bXVar.yDt();
        }
        il.bg(interfaceC0072bg);
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        java.lang.Integer.valueOf(bXVar.bX());
        bXVar.yDt();
    }

    public static synchronized void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL ilRemove = bg.remove(bXVar.yDt());
        if (ilRemove != null) {
            ilRemove.bg(true);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.Integer.valueOf(bXVar.bX());
        bXVar.yDt();
    }
}
