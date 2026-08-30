package com.bytedance.sdk.component.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ta {
    public com.bytedance.sdk.component.bX.bg.bg IL = new com.bytedance.sdk.component.bX.bg.bg();
    public com.bytedance.sdk.component.IL.bg.VB bg;

    public abstract com.bytedance.sdk.component.IL.bg.iR IL();

    public com.bytedance.sdk.component.IL.bg.yDt Kg() {
        return null;
    }

    public abstract java.lang.String bX();

    public abstract java.lang.Object bg();

    public abstract java.util.Map<java.lang.String, java.util.List<java.lang.String>> eqN();

    public abstract int iR();

    public abstract java.lang.String ldr();

    public abstract com.bytedance.sdk.component.IL.bg.bg zx();

    public void bg(com.bytedance.sdk.component.IL.bg.VB vb) {
        this.bg = vb;
    }

    public com.bytedance.sdk.component.IL.bg.Ta.bg WR() {
        return new com.bytedance.sdk.component.IL.bg.Ta.bg(this);
    }

    public static class bg {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> IL;
        java.lang.String Kg;
        com.bytedance.sdk.component.IL.bg.iR bX;
        com.bytedance.sdk.component.IL.bg.bg bg;
        java.lang.String eqN;
        int iR;
        com.bytedance.sdk.component.IL.bg.yDt ldr;
        java.lang.Object zx;

        public bg() {
            this.IL = new java.util.HashMap();
        }

        public com.bytedance.sdk.component.IL.bg.Ta.bg bg(com.bytedance.sdk.component.IL.bg.bg bgVar) {
            this.bg = bgVar;
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.Ta.bg bg(java.lang.String str) {
            this.Kg = str;
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.Ta.bg bg(int i) {
            this.iR = i;
            return this;
        }

        bg(com.bytedance.sdk.component.IL.bg.Ta ta) {
            this.bX = ta.IL();
            this.eqN = ta.bX();
            this.IL = ta.eqN();
            this.zx = ta.bg();
            this.ldr = ta.Kg();
            this.bg = ta.zx();
            this.iR = ta.iR();
            this.Kg = ta.ldr();
        }

        public com.bytedance.sdk.component.IL.bg.Ta.bg bg(java.lang.Object obj) {
            this.zx = obj;
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.Ta.bg IL(java.lang.String str) {
            return bg(com.bytedance.sdk.component.IL.bg.iR.bX(str));
        }

        public com.bytedance.sdk.component.IL.bg.Ta.bg bg(com.bytedance.sdk.component.IL.bg.iR iRVar) {
            this.bX = iRVar;
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.Ta.bg bg(java.lang.String str, java.lang.String str2) {
            return IL(str, str2);
        }

        public com.bytedance.sdk.component.IL.bg.Ta.bg IL(java.lang.String str, java.lang.String str2) {
            if (!this.IL.containsKey(str)) {
                this.IL.put(str, new java.util.ArrayList());
            }
            this.IL.get(str).add(str2);
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.Ta.bg bg() {
            return bg("GET", (com.bytedance.sdk.component.IL.bg.yDt) null);
        }

        private com.bytedance.sdk.component.IL.bg.Ta.bg bg(java.lang.String str, com.bytedance.sdk.component.IL.bg.yDt ydt) {
            this.eqN = str;
            this.ldr = ydt;
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.Ta.bg bg(com.bytedance.sdk.component.IL.bg.yDt ydt) {
            return bg("POST", ydt);
        }

        public com.bytedance.sdk.component.IL.bg.Ta IL() {
            return new com.bytedance.sdk.component.IL.bg.Ta() { // from class: com.bytedance.sdk.component.IL.bg.Ta.bg.1
                public java.lang.String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.IL.bg.Ta
                public java.lang.Object bg() {
                    return com.bytedance.sdk.component.IL.bg.Ta.bg.this.zx;
                }

                @Override // com.bytedance.sdk.component.IL.bg.Ta
                public com.bytedance.sdk.component.IL.bg.iR IL() {
                    return com.bytedance.sdk.component.IL.bg.Ta.bg.this.bX;
                }

                @Override // com.bytedance.sdk.component.IL.bg.Ta
                public java.lang.String bX() {
                    return com.bytedance.sdk.component.IL.bg.Ta.bg.this.eqN;
                }

                @Override // com.bytedance.sdk.component.IL.bg.Ta
                public java.util.Map eqN() {
                    return com.bytedance.sdk.component.IL.bg.Ta.bg.this.IL;
                }

                @Override // com.bytedance.sdk.component.IL.bg.Ta
                public com.bytedance.sdk.component.IL.bg.bg zx() {
                    return com.bytedance.sdk.component.IL.bg.Ta.bg.this.bg;
                }

                @Override // com.bytedance.sdk.component.IL.bg.Ta
                public java.lang.String ldr() {
                    return com.bytedance.sdk.component.IL.bg.Ta.bg.this.Kg;
                }

                @Override // com.bytedance.sdk.component.IL.bg.Ta
                public int iR() {
                    return com.bytedance.sdk.component.IL.bg.Ta.bg.this.iR;
                }

                @Override // com.bytedance.sdk.component.IL.bg.Ta
                public com.bytedance.sdk.component.IL.bg.yDt Kg() {
                    return com.bytedance.sdk.component.IL.bg.Ta.bg.this.ldr;
                }
            };
        }
    }
}
