package com.bykv.vk.openvk.bg.bg.bg.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, com.bykv.vk.openvk.bg.bg.bg.ldr.IL {
    private com.bykv.vk.openvk.bg.bg.bg.ldr.IL.bg IL;
    private com.bykv.vk.openvk.bg.bg.bg.ldr.bg bg;

    @Override // com.bykv.vk.openvk.bg.bg.bg.ldr.IL
    public android.view.SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.ldr.IL
    public android.view.View getView() {
        return this;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public eqN(android.content.Context context) {
        this(context, null);
    }

    public eqN(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.ldr.IL
    public void bg(com.bykv.vk.openvk.bg.bg.bg.ldr.bg bgVar) {
        this.bg = bgVar;
        setSurfaceTextureListener(this);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.ldr.IL
    public void bg(int i, int i2) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.TextureView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        com.bykv.vk.openvk.bg.bg.bg.ldr.bg bgVar = this.bg;
        if (bgVar != null) {
            bgVar.bg(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.bykv.vk.openvk.bg.bg.bg.ldr.bg bgVar = this.bg;
        if (bgVar != null) {
            return bgVar.bg(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setWindowVisibilityChangedListener(com.bykv.vk.openvk.bg.bg.bg.ldr.IL.bg bgVar) {
        this.IL = bgVar;
    }
}
