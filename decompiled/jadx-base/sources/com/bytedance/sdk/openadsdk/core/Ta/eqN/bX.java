package com.bytedance.sdk.openadsdk.core.Ta.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bykv.vk.openvk.bg.bg.IL.eqN.eqN {
    private final com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.bg eqN;
    private final java.util.List<com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL> bg = java.util.Collections.synchronizedList(new java.util.ArrayList());
    private int IL = 1;
    private int bX = 1;

    public interface IL extends com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg {
        void bg(int i, int i2);
    }

    static /* synthetic */ int bg(com.bytedance.sdk.openadsdk.core.Ta.eqN.bX bXVar) {
        int i = bXVar.bX;
        bXVar.bX = i + 1;
        return i;
    }

    public bX() {
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.bg bgVar = new com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.bg();
        this.eqN = bgVar;
        super.bg(bgVar);
        bg(500);
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.eqN
    public long vb() {
        return super.vb() * ((long) this.IL);
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.eqN
    public long xxp() {
        return super.xxp() + (((long) (this.bX - 1)) * super.vb());
    }

    public void bX(int i) {
        this.IL = java.lang.Math.max(1, i);
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.eqN
    public void bg(com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg interfaceC0070bg) {
        if (interfaceC0070bg instanceof com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) {
            if (this.bg.contains(interfaceC0070bg)) {
                return;
            }
            this.bg.add((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) interfaceC0070bg);
            return;
        }
        super.bg(interfaceC0070bg);
    }

    public int Fy() {
        return this.bX;
    }

    private class bg implements com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg {
        private bg() {
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
        public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar) {
            com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.bg(com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this);
            if (com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bX <= com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.IL) {
                java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
                while (it.hasNext()) {
                    ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it.next()).bg(com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bX, com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.IL);
                }
                com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.WR();
                return;
            }
            java.util.Iterator it2 = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
            while (it2.hasNext()) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it2.next()).bg(bgVar);
            }
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
        public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, long j) {
            java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
            while (it.hasNext()) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it.next()).bg(bgVar, j);
            }
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
        public void IL(com.bykv.vk.openvk.bg.bg.bg.bg bgVar) {
            java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
            while (it.hasNext()) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it.next()).IL(bgVar);
            }
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
        public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, com.bykv.vk.openvk.bg.bg.bg.bX.bg bgVar2) {
            java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
            while (it.hasNext()) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it.next()).bg(bgVar, bgVar2);
            }
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
        public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, boolean z) {
            java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
            while (it.hasNext()) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it.next()).bg(bgVar, z);
            }
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
        public void bX(com.bykv.vk.openvk.bg.bg.bg.bg bgVar) {
            java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
            while (it.hasNext()) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it.next()).bX(bgVar);
            }
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
        public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, int i, int i2) {
            java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
            while (it.hasNext()) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it.next()).bg(bgVar, i, i2);
            }
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
        public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, int i, int i2, int i3) {
            java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
            while (it.hasNext()) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it.next()).bg(bgVar, i, i2, i3);
            }
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
        public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, int i) {
            java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
            while (it.hasNext()) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it.next()).bg(bgVar, i);
            }
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
        public void IL(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, int i) {
            java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
            while (it.hasNext()) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it.next()).IL(bgVar, i);
            }
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
        public void bg(com.bykv.vk.openvk.bg.bg.bg.bg bgVar, long j, long j2) {
            java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
            while (it.hasNext()) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it.next()).bg(bgVar, j, j2);
            }
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
        public void eqN(com.bykv.vk.openvk.bg.bg.bg.bg bgVar) {
            java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
            while (it.hasNext()) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it.next()).eqN(bgVar);
            }
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg
        public void zx(com.bykv.vk.openvk.bg.bg.bg.bg bgVar) {
            java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.this.bg.iterator();
            while (it.hasNext()) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bX.IL) it.next()).zx(bgVar);
            }
        }
    }
}
