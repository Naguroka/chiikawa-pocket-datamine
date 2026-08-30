package com.bytedance.sdk.openadsdk.bX;

/* JADX INFO: loaded from: classes4.dex */
public class eo {
    private java.lang.String Lq;
    private java.lang.String PX;
    private java.lang.String Ta;
    private java.lang.String VB;
    private com.bytedance.sdk.openadsdk.FilterWord VzQ;
    protected com.bytedance.sdk.openadsdk.IListenerManager ldr;
    private int vb;
    private int xxp;
    private java.lang.String yDt;
    public static com.bytedance.sdk.openadsdk.FilterWord bg = new com.bytedance.sdk.openadsdk.FilterWord("", "");
    public static int IL = 1;
    public static int bX = 2;
    public static int eqN = 3;
    public static int zx = 4;
    private final java.util.Set<com.bytedance.sdk.openadsdk.bX.eo.bX> iR = new java.util.HashSet();
    private final java.util.Set<com.bytedance.sdk.openadsdk.bX.eo.IL> Kg = new java.util.HashSet();
    private final java.util.Set<com.bytedance.sdk.openadsdk.bX.eo.eqN> WR = new java.util.HashSet();
    private final java.util.Set<com.bytedance.sdk.openadsdk.bX.eo.bg> eo = new java.util.HashSet();

    public interface IL {
        void bg(int i);
    }

    public interface bX {
        void bg(com.bytedance.sdk.openadsdk.FilterWord filterWord);
    }

    public interface bg {
        void bg(java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list);
    }

    public interface eqN {
        void bg(java.lang.String str);
    }

    public void bg() {
        this.iR.clear();
        this.Kg.clear();
        this.WR.clear();
        this.eo.clear();
    }

    public void bg(java.lang.String str) {
        this.VB = str;
    }

    public void IL(java.lang.String str) {
        this.PX = str;
    }

    public void bg(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
        this.VzQ = filterWord;
        eo();
    }

    public com.bytedance.sdk.openadsdk.FilterWord IL() {
        return this.VzQ;
    }

    public boolean bX() {
        com.bytedance.sdk.openadsdk.FilterWord filterWord = this.VzQ;
        return (filterWord == null || filterWord.equals(bg)) ? false : true;
    }

    private void eo() {
        java.util.Iterator<com.bytedance.sdk.openadsdk.bX.eo.bX> it = this.iR.iterator();
        while (it.hasNext()) {
            it.next().bg(this.VzQ);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.bX.eo.bX bXVar) {
        this.iR.add(bXVar);
    }

    public void bg(com.bytedance.sdk.openadsdk.bX.eo.IL il) {
        this.Kg.add(il);
    }

    public void bg(com.bytedance.sdk.openadsdk.bX.eo.eqN eqn) {
        this.WR.add(eqn);
    }

    public void bg(com.bytedance.sdk.openadsdk.bX.eo.bg bgVar) {
        this.eo.add(bgVar);
    }

    public void eqN() {
        if (!bX() && !android.text.TextUtils.isEmpty(this.yDt)) {
            this.VzQ = new com.bytedance.sdk.openadsdk.FilterWord("0:00", this.yDt);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.VzQ);
        if (!android.text.TextUtils.isEmpty(this.VB)) {
            if (android.text.TextUtils.isEmpty(this.yDt)) {
                com.bytedance.sdk.openadsdk.bX.IL.bg().bg(this.VB, arrayList, this.PX);
            } else {
                com.bytedance.sdk.openadsdk.bX.IL.bg().bg(this.VB, arrayList, this.Lq, this.yDt, this.PX);
            }
        }
        if (!android.text.TextUtils.isEmpty(this.Ta)) {
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                zx("onItemClickClosed");
            } else {
                com.bytedance.sdk.openadsdk.core.bX.eqN.bg bgVarZx = com.bytedance.sdk.openadsdk.core.WR.IL().zx(this.Ta);
                if (bgVarZx != null) {
                    bgVarZx.bg();
                    com.bytedance.sdk.openadsdk.core.WR.IL().ldr(this.Ta);
                }
            }
        }
        java.util.Iterator<com.bytedance.sdk.openadsdk.bX.eo.IL> it = this.Kg.iterator();
        while (it.hasNext()) {
            it.next().bg(IL);
        }
        bg(bg);
        bX("");
    }

    public void zx() {
        java.util.Iterator<com.bytedance.sdk.openadsdk.bX.eo.IL> it = this.Kg.iterator();
        while (it.hasNext()) {
            it.next().bg(bX);
        }
    }

    public void ldr() {
        java.util.Iterator<com.bytedance.sdk.openadsdk.bX.eo.IL> it = this.Kg.iterator();
        while (it.hasNext()) {
            it.next().bg(zx);
        }
    }

    public void bg(java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list) {
        java.util.Iterator<com.bytedance.sdk.openadsdk.bX.eo.bg> it = this.eo.iterator();
        while (it.hasNext()) {
            it.next().bg(list);
        }
    }

    private void zx(final java.lang.String str) {
        com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.bX.eo.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.bX.eo.this.Ta)) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.bX.eo.this.bg(6).executeDisLikeClosedCallback(com.bytedance.sdk.openadsdk.bX.eo.this.Ta, str);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("TTDislikeManager", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    protected com.bytedance.sdk.openadsdk.IListenerManager bg(int i) {
        if (this.ldr == null) {
            this.ldr = com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg().bg(i));
        }
        return this.ldr;
    }

    public static void bg(final int i, final java.lang.String str, final com.bytedance.sdk.openadsdk.core.bX.eqN.bg bgVar) {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.bX.eo.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.bg bgVarBg = com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg();
                    if (i != 6 || bgVar == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.multipro.aidl.IL.IL il = new com.bytedance.sdk.openadsdk.multipro.aidl.IL.IL(str, bgVar);
                        com.bytedance.sdk.openadsdk.IListenerManager iListenerManagerAsInterface = com.bytedance.sdk.openadsdk.multipro.aidl.bg.eqN.asInterface(bgVarBg.bg(6));
                        if (iListenerManagerAsInterface != null) {
                            iListenerManagerAsInterface.registerDisLikeClosedListener(str, il);
                        }
                    } catch (android.os.RemoteException e) {
                        com.bytedance.sdk.component.utils.PX.bg("TTDislikeManager", e.getMessage());
                    }
                }
            }, 5);
        }
    }

    public static void bg(final int i, final java.lang.String str) {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.bX.eo.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.bg bgVarBg = com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg();
                    if (i == 6) {
                        try {
                            com.bytedance.sdk.openadsdk.IListenerManager iListenerManagerAsInterface = com.bytedance.sdk.openadsdk.multipro.aidl.bg.eqN.asInterface(bgVarBg.bg(6));
                            if (iListenerManagerAsInterface != null) {
                                iListenerManagerAsInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }

    public void bX(java.lang.String str) {
        this.yDt = str;
        java.util.Iterator<com.bytedance.sdk.openadsdk.bX.eo.eqN> it = this.WR.iterator();
        while (it.hasNext()) {
            it.next().bg(this.yDt);
        }
    }

    public java.lang.String iR() {
        return this.yDt;
    }

    public void eqN(java.lang.String str) {
        this.Lq = str;
    }

    public void bg(int i, int i2) {
        this.vb = i;
        this.xxp = i2;
    }

    public int Kg() {
        return this.vb;
    }

    public boolean WR() {
        return this.vb < this.xxp;
    }
}
