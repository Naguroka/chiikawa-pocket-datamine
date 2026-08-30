package com.bytedance.sdk.component.zx.bX;

/* JADX INFO: loaded from: classes3.dex */
public class bX implements com.bytedance.sdk.component.zx.WR {
    private boolean DDQ;
    private boolean Fy;
    private java.lang.String IL;
    private com.bytedance.sdk.component.zx.IL JAA;
    private int Ja;
    private int Kg;
    private com.bytedance.sdk.component.zx.iR LZ;
    private boolean Lq;
    private java.lang.ref.WeakReference<android.widget.ImageView> PX;
    private volatile boolean Ta;
    private java.util.concurrent.ExecutorService Uq;
    private int Uw;
    private int VB;
    private com.bytedance.sdk.component.zx.yDt VW;
    private java.util.Queue<com.bytedance.sdk.component.zx.eqN.WR> VzQ;
    private int WR;
    private boolean aGH;
    private java.lang.String bX;
    java.util.concurrent.Future<?> bg;
    private com.bytedance.sdk.component.zx.Kg eo;
    private java.lang.String eqN;
    private android.graphics.Bitmap.Config iR;
    private com.bytedance.sdk.component.zx.bX.bg kMt;
    private android.widget.ImageView.ScaleType ldr;
    private com.bytedance.sdk.component.zx.bX.ldr rri;
    private int tC;
    private final android.os.Handler tuV;
    private com.bytedance.sdk.component.zx.LZ vb;
    private int xxp;
    private boolean yDt;
    private com.bytedance.sdk.component.zx.xxp zx;

    private bX(com.bytedance.sdk.component.zx.bX.bX.IL il) {
        this.VzQ = new java.util.concurrent.LinkedBlockingQueue();
        this.tuV = new android.os.Handler(android.os.Looper.getMainLooper());
        this.Fy = true;
        this.IL = il.eqN;
        this.zx = new com.bytedance.sdk.component.zx.bX.bX.bg(il.bg);
        this.PX = new java.lang.ref.WeakReference<>(il.IL);
        this.ldr = il.zx;
        this.iR = il.ldr;
        this.Kg = il.iR;
        this.WR = il.Kg;
        this.VB = il.WR;
        this.xxp = il.eo;
        this.vb = il.VB;
        this.JAA = bg(il);
        if (!android.text.TextUtils.isEmpty(il.bX)) {
            IL(il.bX);
            bg(il.bX);
        }
        this.yDt = il.PX;
        this.Lq = il.Ta;
        this.rri = il.vb;
        this.eo = il.xxp;
        this.Uw = il.tuV;
        this.Ja = il.VzQ;
        this.Uq = il.LZ;
        this.DDQ = il.Fy;
        this.aGH = il.tC;
        this.VW = il.rri;
        this.VzQ.add(new com.bytedance.sdk.component.zx.eqN.bX());
    }

    private com.bytedance.sdk.component.zx.IL bg(com.bytedance.sdk.component.zx.bX.bX.IL il) {
        if (il.Lq != null) {
            return il.Lq;
        }
        if (!android.text.TextUtils.isEmpty(il.yDt)) {
            return com.bytedance.sdk.component.zx.bX.bg.bg.bg(new java.io.File(il.yDt));
        }
        return com.bytedance.sdk.component.zx.bX.bg.bg.iR();
    }

    public int iR() {
        return this.Ja;
    }

    public int Kg() {
        return this.Uw;
    }

    @Override // com.bytedance.sdk.component.zx.WR
    public java.lang.String bg() {
        return this.IL;
    }

    public com.bytedance.sdk.component.zx.xxp WR() {
        return this.zx;
    }

    public java.lang.String eo() {
        return this.eqN;
    }

    public void bg(java.lang.String str) {
        this.eqN = str;
    }

    @Override // com.bytedance.sdk.component.zx.WR
    public java.lang.String zx() {
        return this.bX;
    }

    @Override // com.bytedance.sdk.component.zx.WR
    public android.graphics.Bitmap.Config ldr() {
        return this.iR;
    }

    public void IL(java.lang.String str) {
        java.lang.ref.WeakReference<android.widget.ImageView> weakReference = this.PX;
        if (weakReference != null && weakReference.get() != null) {
            this.PX.get().setTag(1094453505, str);
        }
        this.bX = str;
    }

    @Override // com.bytedance.sdk.component.zx.WR
    public android.widget.ImageView.ScaleType eqN() {
        return this.ldr;
    }

    public android.graphics.Bitmap.Config VB() {
        return this.iR;
    }

    @Override // com.bytedance.sdk.component.zx.WR
    public int IL() {
        return this.Kg;
    }

    @Override // com.bytedance.sdk.component.zx.WR
    public int bX() {
        return this.WR;
    }

    public int PX() {
        return this.VB;
    }

    public boolean Ta() {
        return this.yDt;
    }

    public boolean yDt() {
        return this.Lq;
    }

    public void bg(boolean z) {
        this.Fy = z;
    }

    public boolean Lq() {
        return this.Fy;
    }

    public com.bytedance.sdk.component.zx.iR vb() {
        return this.LZ;
    }

    public void bg(com.bytedance.sdk.component.zx.iR iRVar) {
        this.LZ = iRVar;
    }

    public int xxp() {
        return this.tC;
    }

    public void bg(int i) {
        this.tC = i;
    }

    public com.bytedance.sdk.component.zx.bX.bg VzQ() {
        return this.kMt;
    }

    public void bg(com.bytedance.sdk.component.zx.bX.bg bgVar) {
        this.kMt = bgVar;
    }

    public com.bytedance.sdk.component.zx.bX.ldr tuV() {
        return this.rri;
    }

    public com.bytedance.sdk.component.zx.IL Fy() {
        return this.JAA;
    }

    public boolean bg(com.bytedance.sdk.component.zx.eqN.WR wr) {
        if (this.Ta) {
            return false;
        }
        return this.VzQ.add(wr);
    }

    public boolean LZ() {
        return this.DDQ;
    }

    public com.bytedance.sdk.component.zx.yDt tC() {
        return this.VW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.component.zx.WR kMt() {
        try {
            com.bytedance.sdk.component.zx.bX.ldr ldrVar = this.rri;
            if (ldrVar == null) {
                com.bytedance.sdk.component.zx.xxp xxpVar = this.zx;
                if (xxpVar != null) {
                    xxpVar.bg(1005, "not init !", null);
                }
                return this;
            }
            java.util.concurrent.ExecutorService executorServiceLdr = this.Uq == null ? ldrVar.ldr() : null;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.bytedance.sdk.component.zx.bX.bX.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.zx.eqN.WR wr;
                    while (!com.bytedance.sdk.component.zx.bX.bX.this.Ta && (wr = (com.bytedance.sdk.component.zx.eqN.WR) com.bytedance.sdk.component.zx.bX.bX.this.VzQ.poll()) != null) {
                        try {
                            if (com.bytedance.sdk.component.zx.bX.bX.this.vb != null) {
                                com.bytedance.sdk.component.zx.bX.bX.this.vb.bg(wr.bg(), com.bytedance.sdk.component.zx.bX.bX.this);
                            }
                            wr.bg(com.bytedance.sdk.component.zx.bX.bX.this);
                            if (com.bytedance.sdk.component.zx.bX.bX.this.vb != null) {
                                com.bytedance.sdk.component.zx.bX.bX.this.vb.IL(wr.bg(), com.bytedance.sdk.component.zx.bX.bX.this);
                            }
                        } catch (java.lang.Throwable th) {
                            com.bytedance.sdk.component.zx.bX.bX.this.bg(2000, th.getMessage(), th);
                            if (com.bytedance.sdk.component.zx.bX.bX.this.vb != null) {
                                com.bytedance.sdk.component.zx.bX.bX.this.vb.IL("exception", com.bytedance.sdk.component.zx.bX.bX.this);
                                return;
                            }
                            return;
                        }
                    }
                    if (com.bytedance.sdk.component.zx.bX.bX.this.Ta) {
                        com.bytedance.sdk.component.zx.bX.bX.this.bg(1003, "canceled", null);
                    }
                }
            };
            if (this.aGH) {
                runnable.run();
            } else {
                java.util.concurrent.ExecutorService executorService = this.Uq;
                if (executorService != null) {
                    this.bg = executorService.submit(runnable);
                } else if (executorServiceLdr != null) {
                    this.bg = executorServiceLdr.submit(runnable);
                }
            }
            return this;
        } catch (java.lang.Exception e) {
            android.util.Log.e("ImageRequest", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(int i, java.lang.String str, java.lang.Throwable th) {
        new com.bytedance.sdk.component.zx.eqN.Kg(i, str, th).bg(this);
        this.VzQ.clear();
    }

    public java.lang.String rri() {
        return zx() + PX();
    }

    public static class IL implements com.bytedance.sdk.component.zx.eo {
        private boolean Fy;
        private android.widget.ImageView IL;
        private int Kg;
        private java.util.concurrent.ExecutorService LZ;
        private com.bytedance.sdk.component.zx.IL Lq;
        private boolean PX;
        private boolean Ta;
        private com.bytedance.sdk.component.zx.LZ VB;
        private int VzQ;
        private java.lang.String bX;
        private com.bytedance.sdk.component.zx.xxp bg;
        private java.lang.String eqN;
        private int iR;
        private android.graphics.Bitmap.Config ldr;
        private com.bytedance.sdk.component.zx.yDt rri;
        private boolean tC;
        private int tuV;
        private com.bytedance.sdk.component.zx.bX.ldr vb;
        private com.bytedance.sdk.component.zx.Kg xxp;
        private java.lang.String yDt;
        private android.widget.ImageView.ScaleType zx;
        private int WR = 1;
        private int eo = 5;

        public IL(com.bytedance.sdk.component.zx.bX.ldr ldrVar) {
            this.vb = ldrVar;
        }

        public com.bytedance.sdk.component.zx.eo bX(java.lang.String str) {
            this.eqN = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.eo bg(java.lang.String str) {
            this.bX = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.eo bg(android.widget.ImageView.ScaleType scaleType) {
            this.zx = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.eo bg(android.graphics.Bitmap.Config config) {
            this.ldr = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.eo bg(int i) {
            this.iR = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.eo IL(int i) {
            this.Kg = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.eo bX(int i) {
            this.WR = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.eo bg(com.bytedance.sdk.component.zx.LZ lz) {
            this.VB = lz;
            return this;
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.eo bg(boolean z) {
            this.Ta = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.eo IL(java.lang.String str) {
            this.yDt = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.WR bg(com.bytedance.sdk.component.zx.xxp xxpVar, int i) {
            this.eo = i;
            return bg(xxpVar);
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.WR bg(com.bytedance.sdk.component.zx.xxp xxpVar) {
            this.bg = xxpVar;
            return new com.bytedance.sdk.component.zx.bX.bX(this).kMt();
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.WR bg(android.widget.ImageView imageView) {
            this.IL = imageView;
            return new com.bytedance.sdk.component.zx.bX.bX(this).kMt();
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.eo bg(com.bytedance.sdk.component.zx.Kg kg) {
            this.xxp = kg;
            return this;
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.eo eqN(int i) {
            this.VzQ = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.zx.eo
        public com.bytedance.sdk.component.zx.eo zx(int i) {
            this.tuV = i;
            return this;
        }
    }

    private class bg implements com.bytedance.sdk.component.zx.xxp {
        private com.bytedance.sdk.component.zx.xxp IL;

        public bg(com.bytedance.sdk.component.zx.xxp xxpVar) {
            this.IL = xxpVar;
        }

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(final com.bytedance.sdk.component.zx.VB vb) {
            final android.widget.ImageView imageView = (android.widget.ImageView) com.bytedance.sdk.component.zx.bX.bX.this.PX.get();
            if (imageView != null && com.bytedance.sdk.component.zx.bX.bX.this.VB != 3 && bg(imageView) && (vb.IL() instanceof android.graphics.Bitmap)) {
                final android.graphics.Bitmap bitmap = (android.graphics.Bitmap) vb.IL();
                com.bytedance.sdk.component.zx.bX.bX.this.tuV.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.zx.bX.bX.bg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (com.bytedance.sdk.component.zx.bX.bX.this.eo != null && (vb.IL() instanceof android.graphics.Bitmap)) {
                    com.bytedance.sdk.component.zx.Kg kg = com.bytedance.sdk.component.zx.bX.bX.this.eo;
                    android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) vb.IL();
                    android.graphics.Bitmap bitmapBg = kg.bg(bitmap2);
                    if (bitmapBg != null) {
                        vb.bg(bitmapBg);
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
            if (com.bytedance.sdk.component.zx.bX.bX.this.xxp == 5) {
                com.bytedance.sdk.component.zx.bX.bX.this.tuV.postAtFrontOfQueue(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.zx.bX.bX.bg.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.zx.bX.bX.bg.this.IL != null) {
                            com.bytedance.sdk.component.zx.bX.bX.bg.this.IL.bg(vb);
                        }
                    }
                });
                return;
            }
            com.bytedance.sdk.component.zx.xxp xxpVar = this.IL;
            if (xxpVar != null) {
                xxpVar.bg(vb);
            }
        }

        private boolean bg(android.widget.ImageView imageView) {
            java.lang.Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(com.bytedance.sdk.component.zx.bX.bX.this.bX)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(final int i, final java.lang.String str, final java.lang.Throwable th) {
            if (com.bytedance.sdk.component.zx.bX.bX.this.xxp == 5) {
                com.bytedance.sdk.component.zx.bX.bX.this.tuV.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.zx.bX.bX.bg.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.zx.bX.bX.bg.this.IL != null) {
                            com.bytedance.sdk.component.zx.bX.bX.bg.this.IL.bg(i, str, th);
                        }
                    }
                });
                return;
            }
            com.bytedance.sdk.component.zx.xxp xxpVar = this.IL;
            if (xxpVar != null) {
                xxpVar.bg(i, str, th);
            }
        }
    }
}
