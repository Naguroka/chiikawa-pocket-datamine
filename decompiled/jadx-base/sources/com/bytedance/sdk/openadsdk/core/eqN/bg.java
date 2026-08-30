package com.bytedance.sdk.openadsdk.core.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private final java.util.List<java.lang.String> bg = new java.util.concurrent.CopyOnWriteArrayList();
    private final com.bytedance.sdk.openadsdk.core.Ta.bX.bX IL = new com.bytedance.sdk.openadsdk.core.Ta.bX.bX(5, 5, true);
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> bX = new java.util.concurrent.ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.eqN.bg$bg, reason: collision with other inner class name */
    private static class C0152bg {
        private static final com.bytedance.sdk.openadsdk.core.eqN.bg bg = new com.bytedance.sdk.openadsdk.core.eqN.bg();
    }

    public static com.bytedance.sdk.openadsdk.core.eqN.bg bg() {
        return com.bytedance.sdk.openadsdk.core.eqN.bg.C0152bg.bg;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> listBX = bgVar.bX();
        if (listBX == null || listBX.size() == 0) {
            return;
        }
        for (int i = 0; i < listBX.size(); i++) {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = listBX.get(i);
            if (tuv != null) {
                bg(tuv);
            }
        }
    }

    public java.io.InputStream bg(java.lang.String str) {
        java.io.File fileIL = IL(str);
        if (fileIL != null && bg(fileIL)) {
            try {
                return new java.io.FileInputStream(fileIL);
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("MusicCacheManager", e.getMessage());
            }
        }
        return null;
    }

    private void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVarLKE;
        java.lang.String strVB;
        if (tuv == null || (bgVarLKE = tuv.LKE()) == null || (strVB = bgVarLKE.VB()) == null || !strVB.contains("music_url")) {
            return;
        }
        bX();
        java.lang.String strEqN = bgVarLKE.eqN();
        if (android.text.TextUtils.isEmpty(strEqN)) {
            try {
                new org.json.JSONObject().put("result", 0);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("MusicCacheManager", e.getMessage());
            }
            bg(0, -1L, com.google.android.gms.games.GamesActivityResultCodes.RESULT_RECONNECT_REQUIRED, "music url string is null");
            return;
        }
        java.io.File fileIL = IL(strEqN);
        if (fileIL == null) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        fileIL.getPath();
        if (bg(fileIL)) {
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            bg(2, -1L, -1, null);
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[2];
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            bg(tuv, strEqN, fileIL);
        }
    }

    public java.io.File IL(java.lang.String str) {
        java.lang.String str2;
        java.lang.String strBg = com.bytedance.sdk.component.utils.zx.bg(str);
        if (strBg == null) {
            return null;
        }
        java.lang.String name = new java.io.File(com.bytedance.sdk.openadsdk.CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            str2 = name + "/music/";
        } else {
            str2 = name + "//music/";
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        return com.bytedance.sdk.component.utils.ldr.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), com.bytedance.sdk.openadsdk.multipro.IL.bX(), str2, strBg);
    }

    private boolean bg(java.io.File file) {
        return file.exists() && file.length() != 0;
    }

    private void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.io.File file) {
        if (bX(str)) {
            this.bX.put(str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            com.bytedance.sdk.component.iR.IL.bg bgVarEqN = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().eqN();
            bgVarEqN.IL(str);
            bgVarEqN.bg(file.getParent(), file.getName());
            bgVarEqN.bX(str);
            this.bg.add(str);
            bgVarEqN.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.core.eqN.bg.1
                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    il.bX();
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    java.lang.Integer.valueOf(il.bg());
                    java.lang.String strBX = bXVar.bX();
                    java.lang.Long l = (java.lang.Long) com.bytedance.sdk.openadsdk.core.eqN.bg.this.bX.get(strBX);
                    if (il.ldr() && il.zx() != null && il.zx().exists()) {
                        java.lang.Object[] objArr3 = new java.lang.Object[3];
                        il.zx();
                        if (l != null) {
                            com.bytedance.sdk.openadsdk.core.eqN.bg.this.bX.remove(strBX);
                            com.bytedance.sdk.openadsdk.core.eqN.bg.this.bg(1, android.os.SystemClock.elapsedRealtime() - l.longValue(), -1, null);
                        }
                        try {
                            com.bytedance.sdk.component.utils.ldr.IL(il.zx());
                        } catch (java.io.IOException e) {
                            com.bytedance.sdk.component.utils.PX.bg("MusicCacheManager", e.getMessage());
                        }
                    }
                    if (il.ldr() || l == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.eqN.bg.this.bg(0, android.os.SystemClock.elapsedRealtime() - l.longValue(), -2, "http response status code isn't 200");
                }

                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                    java.lang.Long l = (java.lang.Long) com.bytedance.sdk.openadsdk.core.eqN.bg.this.bX.get(bXVar.bX());
                    if (l != null) {
                        com.bytedance.sdk.openadsdk.core.eqN.bg.this.bg(0, android.os.SystemClock.elapsedRealtime() - l.longValue(), -2, "http response status code isn't 200");
                    }
                }
            });
        }
    }

    private boolean bX(java.lang.String str) {
        return !this.bg.contains(str);
    }

    public void IL() {
        java.io.File fileBg = bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), com.bytedance.sdk.openadsdk.multipro.IL.bX());
        java.lang.Object[] objArr = new java.lang.Object[2];
        fileBg.getAbsolutePath();
        try {
            this.IL.bg(fileBg);
        } catch (java.io.IOException e) {
            com.bytedance.sdk.component.utils.PX.bg("MusicCacheManager", "trimFileCache fail", e);
        }
    }

    private java.io.File bg(android.content.Context context, boolean z) {
        java.lang.String str;
        java.lang.String name = new java.io.File(com.bytedance.sdk.openadsdk.CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            str = name + "/music";
        } else {
            str = name + "//music";
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        return com.bytedance.sdk.component.utils.ldr.bg(context, z, str);
    }

    public void bX() {
        com.bytedance.sdk.openadsdk.yDt.bX.bg("music_preload_start", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.core.eqN.bg.2
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                com.bytedance.sdk.openadsdk.yDt.bg.eqN eqnBg = com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("music_preload_start");
                java.lang.Object[] objArr = new java.lang.Object[2];
                eqnBg.bg();
                return eqnBg;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final int i, final long j, final int i2, final java.lang.String str) {
        com.bytedance.sdk.openadsdk.yDt.bX.bg("music_preload_finish", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.core.eqN.bg.3
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("result", i);
                long j2 = j;
                if (j2 != -1) {
                    jSONObject.put("load_duration", j2);
                }
                com.bytedance.sdk.openadsdk.yDt.bg.eqN eqnIL = com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("music_preload_finish").IL(jSONObject.toString());
                if (!android.text.TextUtils.isEmpty(str)) {
                    eqnIL.IL(i2);
                    eqnIL.ldr(str);
                }
                java.lang.Object[] objArr = new java.lang.Object[2];
                eqnIL.bg();
                return eqnIL;
            }
        });
    }

    public void bg(final boolean z) {
        com.bytedance.sdk.openadsdk.yDt.bX.bg("music_cache", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.core.eqN.bg.4
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("result", z);
                com.bytedance.sdk.openadsdk.yDt.bg.eqN eqnIL = com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("music_cache").IL(jSONObject.toString());
                java.lang.Object[] objArr = new java.lang.Object[2];
                eqnIL.bg();
                return eqnIL;
            }
        });
    }
}
