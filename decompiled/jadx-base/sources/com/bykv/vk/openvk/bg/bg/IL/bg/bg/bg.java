package com.bykv.vk.openvk.bg.bg.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements com.bykv.vk.openvk.bg.bg.bg.bg.IL {
    private java.lang.String bg = "video_reward_full";
    private java.lang.String IL = "video_brand";
    private java.lang.String bX = "video_splash";
    private java.lang.String eqN = "video_default";
    private java.lang.String zx = null;
    private java.lang.String ldr = null;
    private java.lang.String iR = null;
    private java.lang.String Kg = null;
    private java.lang.String WR = null;

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg.IL
    public void bg(java.lang.String str) {
        this.zx = str;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg.IL
    public java.lang.String bX() {
        if (this.WR == null) {
            this.WR = this.zx + java.io.File.separator + this.eqN;
            java.io.File file = new java.io.File(this.WR);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.WR;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg.IL
    public java.lang.String bg() {
        if (this.ldr == null) {
            this.ldr = this.zx + java.io.File.separator + this.bg;
            java.io.File file = new java.io.File(this.ldr);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.ldr;
    }

    public java.lang.String zx() {
        if (this.iR == null) {
            this.iR = this.zx + java.io.File.separator + this.IL;
            java.io.File file = new java.io.File(this.iR);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.iR;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg.IL
    public java.lang.String IL() {
        if (this.Kg == null) {
            this.Kg = this.zx + java.io.File.separator + this.bX;
            java.io.File file = new java.io.File(this.Kg);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.Kg;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg.IL
    public synchronized void eqN() {
        java.util.Set<java.lang.String> setIR = null;
        for (com.bykv.vk.openvk.bg.bg.bg.bg.bg bgVar : ldr()) {
            java.io.File[] fileArrBg = bgVar.bg();
            if (fileArrBg != null && fileArrBg.length >= bgVar.IL()) {
                if (setIR == null) {
                    setIR = iR();
                }
                int iIL = bgVar.IL() - 2;
                if (iIL < 0) {
                    iIL = 0;
                }
                bg(bgVar.bg(), iIL, setIR);
            }
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg.IL
    public boolean bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        if (android.text.TextUtils.isEmpty(bXVar.IL()) || android.text.TextUtils.isEmpty(bXVar.yDt())) {
            return false;
        }
        return new java.io.File(bXVar.IL(), bXVar.yDt()).exists();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg.IL
    public long IL(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        if (android.text.TextUtils.isEmpty(bXVar.IL()) || android.text.TextUtils.isEmpty(bXVar.yDt())) {
            return 0L;
        }
        return com.bykv.vk.openvk.bg.bg.IL.zx.IL.bg(bXVar.IL(), bXVar.yDt());
    }

    private static void bg(java.io.File[] fileArr, int i, java.util.Set<java.lang.String> set) {
        if (i >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i) {
                    java.util.List listAsList = java.util.Arrays.asList(fileArr);
                    java.util.Collections.sort(listAsList, new java.util.Comparator<java.io.File>() { // from class: com.bykv.vk.openvk.bg.bg.IL.bg.bg.bg.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
                        public int compare(java.io.File file, java.io.File file2) {
                            long jLastModified = file2.lastModified() - file.lastModified();
                            if (jLastModified == 0) {
                                return 0;
                            }
                            return jLastModified < 0 ? -1 : 1;
                        }
                    });
                    while (i < listAsList.size()) {
                        java.io.File file = (java.io.File) listAsList.get(i);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((java.io.File) listAsList.get(i)).delete();
                        }
                        i++;
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    private java.util.List<com.bykv.vk.openvk.bg.bg.bg.bg.bg> ldr() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.bykv.vk.openvk.bg.bg.bg.bg.bg(new java.io.File(bg()).listFiles(), com.bykv.vk.openvk.bg.bg.IL.bg.bX()));
        arrayList.add(new com.bykv.vk.openvk.bg.bg.bg.bg.bg(new java.io.File(IL()).listFiles(), com.bykv.vk.openvk.bg.bg.IL.bg.IL()));
        arrayList.add(new com.bykv.vk.openvk.bg.bg.bg.bg.bg(new java.io.File(zx()).listFiles(), com.bykv.vk.openvk.bg.bg.IL.bg.eqN()));
        arrayList.add(new com.bykv.vk.openvk.bg.bg.bg.bg.bg(new java.io.File(bX()).listFiles(), com.bykv.vk.openvk.bg.bg.IL.bg.zx()));
        return arrayList;
    }

    private java.util.Set<java.lang.String> iR() {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (com.bykv.vk.openvk.bg.bg.IL.bg.bg bgVar : com.bykv.vk.openvk.bg.bg.IL.bg.bg.bg.values()) {
            if (bgVar != null && bgVar.bg() != null) {
                com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVarBg = bgVar.bg();
                hashSet.add(com.bykv.vk.openvk.bg.bg.IL.zx.IL.IL(bXVarBg.IL(), bXVarBg.yDt()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.bg.bg.IL.zx.IL.bX(bXVarBg.IL(), bXVarBg.yDt()).getAbsolutePath());
            }
        }
        for (com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL il : com.bykv.vk.openvk.bg.bg.IL.bg.IL.bX.bg.values()) {
            if (il != null && il.bg() != null) {
                com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVarBg2 = il.bg();
                hashSet.add(com.bykv.vk.openvk.bg.bg.IL.zx.IL.IL(bXVarBg2.IL(), bXVarBg2.yDt()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.bg.bg.IL.zx.IL.bX(bXVarBg2.IL(), bXVarBg2.yDt()).getAbsolutePath());
            }
        }
        return hashSet;
    }
}
