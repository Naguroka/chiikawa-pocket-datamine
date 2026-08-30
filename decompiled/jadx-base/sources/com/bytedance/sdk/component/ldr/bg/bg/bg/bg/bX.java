package com.bytedance.sdk.component.ldr.bg.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bX {
    private final android.content.Context bg;
    protected final java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> IL = new java.util.ArrayList();
    private boolean bX = false;
    private final java.lang.Runnable eqN = new java.lang.Runnable() { // from class: com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX.this) {
                if (com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX.this.IL.isEmpty()) {
                    com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX.this.bX = false;
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX.this.IL);
                com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX.this.IL.clear();
                com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX.this.bX = false;
                com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX.this.eqN(arrayList);
            }
        }
    };

    public abstract java.lang.String IL();

    public bX(android.content.Context context) {
        this.bg = context;
    }

    private void bg() {
        if (this.bX) {
            return;
        }
        com.bytedance.sdk.component.ldr.bg.iR.bg.bg().postDelayed(this.eqN, com.bytedance.sdk.component.ldr.bg.iR.bg.IL());
        this.bX = true;
    }

    protected void bX(java.util.List<java.lang.String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            java.util.Iterator<com.bytedance.sdk.component.ldr.bg.eqN.bg> it = this.IL.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.ldr.bg.eqN.bg next = it.next();
                if (next != null) {
                    java.lang.String strBX = next.bX();
                    if (!android.text.TextUtils.isEmpty(strBX) && list.contains(strBX)) {
                        it.remove();
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            IL();
            th.getMessage();
        }
    }

    public synchronized void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        if (bgVar.iR() != null && !android.text.TextUtils.isEmpty(bgVar.bX())) {
            this.IL.add(bgVar);
            bg();
        }
    }

    public android.content.Context zx() {
        return this.bg;
    }

    public void eqN(java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list) {
        com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(zx(), IL(), list);
    }
}
