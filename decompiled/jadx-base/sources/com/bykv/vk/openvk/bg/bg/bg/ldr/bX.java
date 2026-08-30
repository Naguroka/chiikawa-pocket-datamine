package com.bykv.vk.openvk.bg.bg.bg.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends com.bykv.vk.openvk.bg.bg.bg.ldr.zx implements android.view.SurfaceHolder.Callback, com.bykv.vk.openvk.bg.bg.bg.ldr.IL {
    private static final java.util.ArrayList<com.bykv.vk.openvk.bg.bg.bg.ldr.ldr> bX = new java.util.ArrayList<>();
    private com.bykv.vk.openvk.bg.bg.bg.ldr.ldr IL;
    private java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.ldr.bg> bg;
    private com.bykv.vk.openvk.bg.bg.bg.ldr.IL.bg eqN;

    @Override // com.bykv.vk.openvk.bg.bg.bg.ldr.IL
    public android.view.View getView() {
        return this;
    }

    public bX(android.content.Context context) {
        super(context);
        bg();
    }

    private void bg() {
        com.bykv.vk.openvk.bg.bg.bg.ldr.ldr ldrVar = new com.bykv.vk.openvk.bg.bg.bg.ldr.ldr(this);
        this.IL = ldrVar;
        bX.add(ldrVar);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.ldr.IL
    public void bg(com.bykv.vk.openvk.bg.bg.bg.ldr.bg bgVar) {
        this.bg = new java.lang.ref.WeakReference<>(bgVar);
        android.view.SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        java.util.Iterator<com.bykv.vk.openvk.bg.bg.bg.ldr.ldr> it = bX.iterator();
        while (it.hasNext()) {
            com.bykv.vk.openvk.bg.bg.bg.ldr.ldr next = it.next();
            if (next != null && next.bg() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.IL);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.ldr.IL
    public void bg(int i, int i2) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.ldr.bg> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().bg(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.ldr.bg> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().bg(surfaceHolder, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.ldr.bg> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().IL(surfaceHolder);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setWindowVisibilityChangedListener(com.bykv.vk.openvk.bg.bg.bg.ldr.IL.bg bgVar) {
        this.eqN = bgVar;
    }
}
