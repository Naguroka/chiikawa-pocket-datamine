package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class LKE {

    public interface IL {
        void IL();

        void bg();

        void bg(android.view.View view, boolean z);

        void bg(boolean z);
    }

    public static void bg(final android.view.ViewGroup viewGroup, boolean z, int i, com.bytedance.sdk.openadsdk.utils.LKE.IL il, java.util.List<android.view.ViewGroup> list) {
        viewGroup.setTag(520093765, il);
        viewGroup.setTag(520093766, java.lang.Integer.valueOf(i));
        if (viewGroup.getTag(520093764) == java.lang.Boolean.TRUE) {
            return;
        }
        final com.bytedance.sdk.openadsdk.utils.LKE.bg bgVar = new com.bytedance.sdk.openadsdk.utils.LKE.bg(viewGroup);
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.get(i2).setOnHierarchyChangeListener(new android.view.ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.LKE.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(android.view.View view, android.view.View view2) {
                        bgVar.bg = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
                        bgVar.bg = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(bgVar);
        if (z) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.LKE.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        com.bytedance.sdk.openadsdk.utils.LKE.IL il2 = (com.bytedance.sdk.openadsdk.utils.LKE.IL) viewGroup.getTag(520093765);
                        android.view.ViewGroup viewGroup2 = viewGroup;
                        com.bytedance.sdk.openadsdk.utils.LKE.IL(viewGroup2, il2, (java.lang.Integer) viewGroup2.getTag(520093766));
                    } catch (java.lang.Exception e) {
                        com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new android.view.ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.LKE.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z2) {
                try {
                    com.bytedance.sdk.openadsdk.utils.LKE.IL il2 = (com.bytedance.sdk.openadsdk.utils.LKE.IL) viewGroup.getTag(520093765);
                    if (il2 != null) {
                        il2.bg(z2);
                        android.view.ViewGroup viewGroup2 = viewGroup;
                        com.bytedance.sdk.openadsdk.utils.LKE.IL(viewGroup2, il2, (java.lang.Integer) viewGroup2.getTag(520093766));
                    }
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.LKE.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View view) {
                com.bytedance.sdk.openadsdk.utils.LKE.IL il2 = (com.bytedance.sdk.openadsdk.utils.LKE.IL) viewGroup.getTag(520093765);
                if (il2 != null) {
                    il2.bg();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View view) {
                com.bytedance.sdk.openadsdk.utils.LKE.IL il2 = (com.bytedance.sdk.openadsdk.utils.LKE.IL) viewGroup.getTag(520093765);
                if (il2 != null) {
                    il2.IL();
                }
            }
        });
        viewGroup.setTag(520093764, java.lang.Boolean.TRUE);
    }

    class bg implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ android.view.ViewGroup IL;
        android.view.View bg = null;

        bg(android.view.ViewGroup viewGroup) {
            this.IL = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                com.bytedance.sdk.openadsdk.utils.LKE.IL il = (com.bytedance.sdk.openadsdk.utils.LKE.IL) this.IL.getTag(520093765);
                if (this.bg != null) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    this.bg.getGlobalVisibleRect(rect);
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    this.IL.getGlobalVisibleRect(rect2);
                    if (rect.contains(rect2)) {
                        if (il != null) {
                            il.bg(this.IL, false);
                        }
                        this.IL.setTag(520093763, java.lang.Boolean.FALSE);
                        return;
                    } else {
                        if (il != null) {
                            il.bg(this.IL, true);
                        }
                        this.IL.setTag(520093763, java.lang.Boolean.TRUE);
                        return;
                    }
                }
                android.view.ViewGroup viewGroup = this.IL;
                com.bytedance.sdk.openadsdk.utils.LKE.IL(viewGroup, il, (java.lang.Integer) viewGroup.getTag(520093766));
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("onGlobalLayout exception " + this.IL.getTag(520093765), "ViewUtils", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL(android.view.View view, com.bytedance.sdk.openadsdk.utils.LKE.IL il, java.lang.Integer num) {
        if (il == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        if (bg(view, num.intValue())) {
            il.bg(view, true);
        }
    }

    private static boolean bg(android.view.View view, int i) {
        return com.bytedance.sdk.openadsdk.core.VW.bg(view, 20, i);
    }
}
