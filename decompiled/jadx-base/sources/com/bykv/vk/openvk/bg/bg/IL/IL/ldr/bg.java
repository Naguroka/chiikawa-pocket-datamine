package com.bykv.vk.openvk.bg.bg.IL.IL.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    public static final boolean bg = com.bykv.vk.openvk.bg.bg.bg.iR.bX.bX();
    private java.util.HashMap<java.lang.String, java.lang.Boolean> IL;
    private com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg bX;

    private bg() {
        this.IL = new java.util.HashMap<>();
        IL();
    }

    public static com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg bg() {
        return com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.IL.bg;
    }

    private static class IL {
        private static final com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg bg = new com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg();
    }

    public boolean IL() {
        if (this.bX != null) {
            return true;
        }
        com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX bXVarBX = bX();
        if (bXVarBX == null) {
            return false;
        }
        com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg(true);
        com.bykv.vk.openvk.bg.bg.IL.IL.zx.IL(true);
        com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg(1);
        com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg().eqN();
        try {
            com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg c0067bg = new com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg();
            this.bX = c0067bg;
            c0067bg.setName("csj_video_cache_preloader");
            this.bX.start();
            com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg(bXVarBX, com.bykv.vk.openvk.bg.bg.bg.bX.bg());
            com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bX();
            com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bX().bg(10485759);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public boolean bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        if (!IL()) {
            return false;
        }
        this.bX.bg(bXVar);
        return true;
    }

    public java.lang.String IL(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        if (bXVar == null) {
            return null;
        }
        boolean z = !android.text.TextUtils.isEmpty(bXVar.yDt());
        return com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg().bg(false, z, z ? bXVar.yDt() : bXVar.Ta(), bXVar.Ta());
    }

    private static com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX bX() {
        java.io.File file = new java.io.File(com.bykv.vk.openvk.bg.bg.bg.bX.bg().getCacheDir(), "proxy_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX bXVar = new com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX(file);
            try {
                bXVar.bg(104857600L);
                return bXVar;
            } catch (java.io.IOException unused) {
                return bXVar;
            }
        } catch (java.io.IOException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg$bg, reason: collision with other inner class name */
    class C0067bg extends java.lang.Thread {
        private final java.util.Queue<com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg.C0068bg> eqN = new java.util.concurrent.ArrayBlockingQueue(10);
        private java.util.Queue<com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg.C0068bg> IL = new java.util.concurrent.LinkedBlockingQueue();
        private boolean bX = true;
        private java.util.Queue<com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg.C0068bg> zx = new java.util.concurrent.LinkedBlockingQueue();

        public C0067bg() {
        }

        private com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg.C0068bg bg(int i, com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
            this.eqN.size();
            com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg.C0068bg c0068bgPoll = this.eqN.poll();
            if (c0068bgPoll == null) {
                c0068bgPoll = new com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg.C0068bg();
            }
            c0068bgPoll.bg = i;
            c0068bgPoll.ldr = bXVar;
            return c0068bgPoll;
        }

        private void bg(com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg.C0068bg c0068bg) {
            c0068bg.bX = null;
            c0068bg.IL = null;
            c0068bg.bg = -1;
            c0068bg.ldr = null;
            this.eqN.offer(c0068bg);
        }

        private synchronized void IL(com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg.C0068bg c0068bg) {
            this.zx.add(c0068bg);
            notify();
        }

        private void bX(com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg.C0068bg c0068bg) {
            if (c0068bg == null) {
                return;
            }
            this.IL.offer(c0068bg);
            notify();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.bX) {
                synchronized (this) {
                    if (!this.zx.isEmpty()) {
                        bg();
                    }
                    while (!this.IL.isEmpty()) {
                        com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg.C0068bg c0068bgPoll = this.IL.poll();
                        if (c0068bgPoll != null) {
                            int i = c0068bgPoll.bg;
                            if (i != 0) {
                                if (i == 1) {
                                    com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bX().bg(c0068bgPoll.IL);
                                } else if (i == 2) {
                                    com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bX().eqN();
                                } else if (i == 3) {
                                    com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bX().eqN();
                                    if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX() != null) {
                                        com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX();
                                        throw null;
                                    }
                                    if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.IL() != null) {
                                        com.bykv.vk.openvk.bg.bg.IL.IL.zx.IL().bg();
                                    }
                                } else if (i == 4) {
                                    com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bX().eqN();
                                    this.bX = false;
                                }
                            } else if (c0068bgPoll.bX != null && c0068bgPoll.bX.length > 0) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (java.lang.String str : c0068bgPoll.bX) {
                                    if (com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(str)) {
                                        arrayList.add(str);
                                    }
                                }
                                com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bX().bg(false, !android.text.TextUtils.isEmpty(c0068bgPoll.zx), c0068bgPoll.eqN, c0068bgPoll.IL, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
                            }
                            bg(c0068bgPoll);
                        }
                    }
                    try {
                        wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
        }

        private void bg() {
            while (true) {
                com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg.C0067bg.C0068bg c0068bgPoll = this.zx.poll();
                if (c0068bgPoll == null) {
                    return;
                }
                c0068bgPoll.IL = c0068bgPoll.ldr.Ta();
                c0068bgPoll.bX = new java.lang.String[]{c0068bgPoll.ldr.Ta()};
                int iBg = c0068bgPoll.ldr.bg();
                if (iBg <= 0) {
                    iBg = c0068bgPoll.ldr.bX();
                }
                c0068bgPoll.eqN = iBg;
                c0068bgPoll.zx = c0068bgPoll.ldr.yDt();
                if (!android.text.TextUtils.isEmpty(c0068bgPoll.ldr.yDt())) {
                    c0068bgPoll.IL = c0068bgPoll.ldr.yDt();
                }
                c0068bgPoll.ldr = null;
                bX(c0068bgPoll);
            }
        }

        public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
            IL(bg(0, bXVar));
        }

        /* JADX INFO: renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg$bg$bg, reason: collision with other inner class name */
        private class C0068bg {
            public java.lang.String IL;
            public java.lang.String[] bX;
            public int bg;
            public int eqN;
            public com.bykv.vk.openvk.bg.bg.bg.bX.bX ldr;
            public java.lang.String zx;

            public C0068bg() {
            }
        }
    }
}
