package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: classes4.dex */
public class PAGVideoMediaView extends com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView implements com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg {
    private com.bytedance.sdk.openadsdk.core.Ta.IL.ldr IL;
    private final com.bytedance.sdk.openadsdk.bg.IL.bg bX;
    private com.bytedance.sdk.openadsdk.core.model.tuV eqN;

    public PAGVideoMediaView(android.content.Context context, android.view.View view, com.bytedance.sdk.openadsdk.bg.IL.bg bgVar) {
        super(context);
        bg(view);
        this.bX = bgVar;
    }

    private void bg(android.view.View view) {
        if (view instanceof com.bytedance.sdk.openadsdk.core.Ta.IL.ldr) {
            com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = (com.bytedance.sdk.openadsdk.core.Ta.IL.ldr) view;
            this.IL = ldrVar;
            addView(ldrVar, -1, -1);
        }
    }

    private void bg() {
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = this.IL;
        if (ldrVar != null) {
            ldrVar.yDt();
        }
    }

    private boolean IL() {
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = this.IL;
        if (ldrVar != null) {
            return ldrVar.PX();
        }
        return false;
    }

    public void handleInterruptVideo() {
        if (IL()) {
            return;
        }
        bg();
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.bg.IL.bg bgVar = this.bX;
        if (bgVar == null) {
            return;
        }
        bgVar.bg(new com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof com.bytedance.sdk.openadsdk.core.IL.bg) {
            ((com.bytedance.sdk.openadsdk.core.IL.bg) onClickListener).bg((com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = this.IL;
        if (ldrVar != null) {
            ldrVar.Lq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = this.IL;
        if (ldrVar == null || ldrVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.IL.getNativeVideoController().zx();
    }

    public void setMaterialMeta(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.eqN = tuv;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.utils.bX.bg(this, this.eqN);
    }
}
