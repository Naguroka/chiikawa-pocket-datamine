package com.bytedance.sdk.component.ldr.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.sdk.component.ldr.bg.bg.bg {
    private final com.bytedance.sdk.component.ldr.bg.bg.bX IL;
    private final java.util.Queue<java.lang.String> bX;
    private final com.bytedance.sdk.component.ldr.bg.bg.eqN bg;

    public IL() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
        this.bX = concurrentLinkedQueue;
        this.bg = new com.bytedance.sdk.component.ldr.bg.bg.ldr(concurrentLinkedQueue);
        this.IL = new com.bytedance.sdk.component.ldr.bg.bg.bX();
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public synchronized void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar, int i) {
        com.bytedance.sdk.component.ldr.bg.bg.eqN eqn;
        com.bytedance.sdk.component.ldr.bg.bg.bX bXVar;
        if (i != 5) {
            if (com.bytedance.sdk.component.ldr.bg.Kg.iR().vb().bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr()) && (eqn = this.bg) != null && bgVar != null) {
                eqn.bg(bgVar, i);
            }
            bXVar = this.IL;
            if (bXVar != null && bgVar != null) {
                bXVar.bg(bgVar, i);
            }
        } else {
            bXVar = this.IL;
            if (bXVar != null) {
                bXVar.bg(bgVar, i);
            }
        }
        throw th;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public synchronized void bg(int i, java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list) {
        java.util.Iterator<com.bytedance.sdk.component.ldr.bg.eqN.bg> it = list.iterator();
        while (it.hasNext()) {
            this.bX.remove(it.next().bX());
        }
        com.bytedance.sdk.component.ldr.bg.bg.eqN eqn = this.bg;
        if (eqn != null) {
            eqn.bg(i, list);
        }
        com.bytedance.sdk.component.ldr.bg.bg.bX bXVar = this.IL;
        if (bXVar != null) {
            bXVar.bg(i, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public synchronized java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> bg(int i, int i2, java.util.List<java.lang.String> list) {
        java.util.List list2;
        boolean z;
        java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg = this.bg.bg(i, i2, list);
        if (listBg != null && listBg.size() != 0) {
            listBg.size();
            if (i == 1 || i == 2) {
                list2 = listBg;
                java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listIL = this.IL.IL((com.bytedance.sdk.component.ldr.bg.eqN.bg) listBg.get(0), listBg.size());
                list2 = listBg;
                if (listIL != null && listIL.size() != 0) {
                    list2 = listBg;
                    listIL.size();
                    java.util.HashMap map = new java.util.HashMap();
                    for (com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar : listIL) {
                        map.put(bgVar.bX(), bgVar);
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList(this.bX);
                    for (com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar2 : listIL) {
                        java.util.Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            if (android.text.TextUtils.equals(bgVar2.bX(), (java.lang.String) it.next())) {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            map.remove(bgVar2.bX());
                        }
                    }
                    for (com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar3 : listBg) {
                        map.put(bgVar3.bX(), bgVar3);
                    }
                    listBg.clear();
                    java.util.Iterator it2 = map.keySet().iterator();
                    while (it2.hasNext()) {
                        listBg.add(map.get((java.lang.String) it2.next()));
                    }
                    listIL.clear();
                    list2 = listBg;
                }
            }
        } else {
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList(this.bX);
            if (list != null && !list.isEmpty()) {
                arrayList2.addAll(list);
            }
            java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg2 = this.IL.bg(i, i2, arrayList2);
            if (listBg2 != null && listBg2.size() != 0) {
                java.util.HashMap map2 = new java.util.HashMap();
                for (com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar4 : listBg2) {
                    map2.put(bgVar4.bX(), bgVar4);
                }
                arrayList2.size();
                if (arrayList2.size() != 0) {
                    for (java.lang.String str : arrayList2) {
                        if (map2.get(str) != null) {
                            map2.remove(str);
                        }
                    }
                }
                listBg2.clear();
                java.util.Iterator it3 = map2.keySet().iterator();
                while (it3.hasNext()) {
                    listBg2.add(map2.get((java.lang.String) it3.next()));
                }
            }
            list2 = listBg2;
        }
        if (list2 != null && !list2.isEmpty()) {
            java.util.Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                this.bX.offer(((com.bytedance.sdk.component.ldr.bg.eqN.bg) it4.next()).bX());
            }
            return list2;
        }
        return new java.util.ArrayList();
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public synchronized boolean bg(int i, boolean z) {
        if (this.bg.bg(i, z)) {
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.VW(), 1);
            return true;
        }
        if ((i != 1 && i != 2) || !this.IL.bg(i, z)) {
            return false;
        }
        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.VJ(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public void bg(int i, long j) {
        this.IL.bg(i, j);
        this.bg.bg(i, j);
    }
}
