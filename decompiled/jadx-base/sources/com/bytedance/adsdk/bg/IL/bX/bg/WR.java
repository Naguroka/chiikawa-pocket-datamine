package com.bytedance.adsdk.bg.IL.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class WR extends com.bytedance.adsdk.bg.IL.bX.bg.ldr {
    @Override // com.bytedance.adsdk.bg.IL.bX.bg.ldr
    public int bg(java.lang.String str, int i, java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> deque, com.bytedance.adsdk.bg.IL.bX.bg bgVar) {
        com.bytedance.adsdk.bg.IL.IL.bg bgVarPollFirst;
        if (')' != bg(i, str)) {
            return bgVar.bg(str, i, deque);
        }
        java.util.LinkedList<com.bytedance.adsdk.bg.IL.IL.bg> linkedList = new java.util.LinkedList();
        while (true) {
            bgVarPollFirst = deque.pollFirst();
            if (bgVarPollFirst == null || bgVarPollFirst.bg() == com.bytedance.adsdk.bg.IL.eqN.IL.METHOD || bgVarPollFirst.bg() == com.bytedance.adsdk.bg.IL.eqN.eqN.LEFT_PAREN) {
                break;
            }
            linkedList.addFirst(bgVarPollFirst);
        }
        if (bgVarPollFirst == null) {
            throw new java.lang.IllegalArgumentException(str.substring(0, i));
        }
        if (bgVarPollFirst.bg() != com.bytedance.adsdk.bg.IL.eqN.IL.METHOD) {
            deque.push(com.bytedance.adsdk.bg.IL.zx.IL.bg(linkedList, str, i));
            return i + 1;
        }
        com.bytedance.adsdk.bg.IL.IL.bg.eo eoVar = (com.bytedance.adsdk.bg.IL.IL.bg.eo) bgVarPollFirst;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        for (com.bytedance.adsdk.bg.IL.IL.bg bgVar2 : linkedList) {
            if (bgVar2.bg() == com.bytedance.adsdk.bg.IL.eqN.eqN.COMMA) {
                linkedList2.add(com.bytedance.adsdk.bg.IL.zx.IL.bg(linkedList3, str, i));
                linkedList3.clear();
            } else {
                linkedList3.addLast(bgVar2);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(com.bytedance.adsdk.bg.IL.zx.IL.bg(linkedList3, str, i));
        }
        eoVar.bg((com.bytedance.adsdk.bg.IL.IL.bg[]) linkedList2.toArray(new com.bytedance.adsdk.bg.IL.IL.bg[linkedList2.size()]));
        int i2 = i + 1;
        deque.push(eoVar);
        return i2;
    }
}
