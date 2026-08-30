package com.bykv.vk.openvk.bg.bg.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
public class PX {
    private final java.util.ArrayList<com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg> bX;
    private final int eqN;
    private final int iR;
    private int ldr;
    private int zx = -1;
    private static final java.util.Set<java.lang.String> bg = new java.util.HashSet();
    private static final java.util.Set<java.lang.String> IL = new java.util.HashSet();

    PX(java.util.List<java.lang.String> list) {
        int iIntValue;
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("urls can't be empty");
        }
        int size = list.size();
        this.eqN = size;
        this.bX = new java.util.ArrayList<>(size);
        java.util.ArrayList arrayList = null;
        java.util.ArrayList arrayList2 = null;
        for (java.lang.String str : list) {
            com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg bgVar = new com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg(str);
            if (bg.contains(str)) {
                arrayList2 = arrayList2 == null ? new java.util.ArrayList() : arrayList2;
                arrayList2.add(bgVar);
            } else if (IL.contains(str)) {
                arrayList = arrayList == null ? new java.util.ArrayList() : arrayList;
                arrayList.add(bgVar);
            } else {
                this.bX.add(bgVar);
            }
        }
        if (arrayList != null) {
            this.bX.addAll(arrayList);
        }
        if (arrayList2 != null) {
            this.bX.addAll(arrayList2);
        }
        java.lang.Integer num = com.bykv.vk.openvk.bg.bg.IL.IL.zx.WR;
        if (num == null || num.intValue() <= 0) {
            iIntValue = this.eqN >= 2 ? 1 : 2;
        } else {
            iIntValue = num.intValue();
        }
        this.iR = iIntValue;
    }

    PX(java.lang.String str) {
        java.util.ArrayList<com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg> arrayList = new java.util.ArrayList<>(1);
        this.bX = arrayList;
        arrayList.add(new com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg(str));
        this.eqN = 1;
        this.iR = 1;
    }

    boolean bg() {
        return this.ldr < this.iR;
    }

    com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg IL() {
        if (!bg()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.zx + 1;
        if (i >= this.eqN - 1) {
            this.zx = -1;
            this.ldr++;
        } else {
            this.zx = i;
        }
        com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg bgVar = this.bX.get(i);
        bgVar.IL = (this.ldr * this.eqN) + this.zx;
        return bgVar;
    }

    public class bg {
        int IL;
        final java.lang.String bg;

        bg(java.lang.String str) {
            this.bg = str;
        }

        void bg() {
            com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg.add(this.bg);
        }

        void IL() {
            com.bykv.vk.openvk.bg.bg.IL.IL.PX.IL.add(this.bg);
        }

        public java.lang.String toString() {
            return this.bg;
        }
    }
}
