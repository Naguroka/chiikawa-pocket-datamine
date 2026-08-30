package com.bytedance.sdk.openadsdk.bg.IL;

/* JADX INFO: loaded from: classes4.dex */
public class Kg extends com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd {
    protected final com.bytedance.sdk.openadsdk.core.model.tuV IL;
    private boolean Kg;
    private boolean WR;
    protected final android.content.Context bX;
    protected com.bytedance.sdk.openadsdk.core.xxp bg;
    protected com.bytedance.sdk.openadsdk.bg.IL.bg eqN;
    protected java.lang.String iR;
    protected int ldr;
    protected int zx;

    private java.lang.String bg(int i) {
        if (i != 1) {
            return i != 2 ? "embeded_ad" : "interaction";
        }
        return "banner_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    public Kg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, boolean z) {
        if (tuv == null) {
            com.bytedance.sdk.component.utils.PX.IL("materialMeta can't been null");
        }
        this.IL = tuv;
        this.bX = context;
        this.zx = i;
        this.ldr = tuv.IGR();
        this.iR = com.bytedance.sdk.openadsdk.utils.ayS.bX(i);
        if (z) {
            this.eqN = new com.bytedance.sdk.openadsdk.bg.IL.bg(context, tuv, this.iR);
            this.bg = new com.bytedance.sdk.openadsdk.core.xxp(context, this, tuv, bg(i), this.eqN);
        }
    }

    private java.util.List<android.view.View> bg(java.util.List<android.view.View> list, java.util.List<android.view.View> list2) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                linkedList.add(list.get(i));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedList.add(list2.get(i2));
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
        if (tuv != null) {
            return tuv.jA();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public java.lang.Object getExtraInfo(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
        if (tuv == null || tuv.jA() == null) {
            return null;
        }
        try {
            return this.IL.jA().get(str);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTNativeAdImpl", th.getMessage());
            return null;
        }
    }

    protected boolean iR() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
        return (tuv == null || tuv.jz() == 5 || com.bytedance.sdk.openadsdk.core.VzQ.eqN().bX(this.ldr) != 1) ? false : true;
    }

    protected void bg(java.lang.String str) {
        this.iR = str;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(java.lang.Double d) {
        if (this.Kg) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.DDQ.bg(this.IL, d);
        this.Kg = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(java.lang.Double d, java.lang.String str, java.lang.String str2) {
        if (this.WR) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.DDQ.bg(this.IL, d, str, str2);
        this.WR = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(android.view.ViewGroup viewGroup, java.util.List<android.view.View> list, java.util.List<android.view.View> list2, android.view.View view, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null) {
            com.bytedance.sdk.component.utils.PX.IL("container can't been null");
            return;
        }
        if (list == null) {
            com.bytedance.sdk.component.utils.PX.IL("clickView can't been null");
        } else if (list.size() <= 0) {
            com.bytedance.sdk.component.utils.PX.IL("clickViews size must been more than 1");
        } else {
            bg(viewGroup, null, list, list2, view, new com.bytedance.sdk.openadsdk.bg.IL.iR(pAGNativeAdInteractionListener));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(android.view.ViewGroup viewGroup, java.util.List<android.view.View> list, java.util.List<android.view.View> list2, android.view.View view, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    public void bg(android.view.ViewGroup viewGroup, java.util.List<android.view.View> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3, android.view.View view, final com.bytedance.sdk.openadsdk.bg.IL.ldr ldrVar) {
        if (viewGroup == null) {
            com.bytedance.sdk.component.utils.PX.IL("container can't been null");
            return;
        }
        if (list2 == null) {
            com.bytedance.sdk.component.utils.PX.IL("clickView can't been null");
            return;
        }
        if (list2.size() <= 0) {
            com.bytedance.sdk.component.utils.PX.IL("clickViews size must been more than 1");
            return;
        }
        if (iR()) {
            list3 = bg(list2, list3);
        }
        java.util.List<android.view.View> list4 = list3;
        if (view != null && ldrVar != null && ldrVar.IL()) {
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bg.IL.Kg.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view2) {
                    final java.lang.String strBg = com.bytedance.sdk.openadsdk.utils.rri.bg();
                    com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.bg(com.bytedance.sdk.openadsdk.bg.IL.Kg.this.IL, strBg, new com.bytedance.sdk.openadsdk.core.bX.eqN.bg() { // from class: com.bytedance.sdk.openadsdk.bg.IL.Kg.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.bX.eqN.bg
                        public void bg() {
                            ldrVar.bg();
                            com.bytedance.sdk.openadsdk.core.WR.IL().ldr(strBg);
                            com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView pAGMediaViewBg = com.bytedance.sdk.openadsdk.bg.IL.Kg.this.Kg().bg();
                            if (pAGMediaViewBg != null) {
                                pAGMediaViewBg.close();
                            }
                        }
                    });
                }
            });
        }
        this.bg.bg(viewGroup, list, list2, list4, view, ldrVar);
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
        com.bytedance.sdk.openadsdk.rri.bg.zx.bg(viewGroup, this.IL, (tuv == null || tuv.tC() != 2) ? null : new com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.IL.JAA()));
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData getNativeAdData() {
        return new com.bytedance.sdk.openadsdk.bg.IL.eqN(Kg());
    }

    public com.bytedance.sdk.openadsdk.bg.IL.bg Kg() {
        return this.eqN;
    }
}
