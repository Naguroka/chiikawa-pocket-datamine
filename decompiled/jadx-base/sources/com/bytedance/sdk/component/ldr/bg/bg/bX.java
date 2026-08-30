package com.bytedance.sdk.component.ldr.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX implements com.bytedance.sdk.component.ldr.bg.bg.eqN {
    private com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bg IL;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg Kg;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg PX;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg VB;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg WR;
    private com.bytedance.sdk.component.ldr.bg.bg.bg.bg.IL bX;
    private com.bytedance.sdk.component.ldr.bg.bg.bg.bg.eqN bg;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg eo;
    private com.bytedance.sdk.component.ldr.bg.bg.bg.bg.iR eqN;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg iR;
    private com.bytedance.sdk.component.ldr.bg.bg.bg.bg.zx ldr;
    private com.bytedance.sdk.component.ldr.bg.bg.bg.bg.ldr zx;

    public bX() {
        android.content.Context contextLdr = com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr();
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.bg()) {
            this.iR = com.bytedance.sdk.component.ldr.bg.Kg.iR().PX();
            this.bg = new com.bytedance.sdk.component.ldr.bg.bg.bg.bg.eqN(contextLdr, this.iR);
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.zx()) {
            if (com.bytedance.sdk.component.ldr.bg.Kg.iR().eo() != null) {
                this.WR = com.bytedance.sdk.component.ldr.bg.Kg.iR().eo();
            } else {
                this.WR = com.bytedance.sdk.component.ldr.bg.Kg.iR().Ta();
            }
            this.bX = new com.bytedance.sdk.component.ldr.bg.bg.bg.bg.IL(contextLdr, this.WR);
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.IL()) {
            this.Kg = com.bytedance.sdk.component.ldr.bg.Kg.iR().Ta();
            this.IL = new com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bg(contextLdr, this.Kg);
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.bX()) {
            this.eo = com.bytedance.sdk.component.ldr.bg.Kg.iR().Ta();
            this.eqN = new com.bytedance.sdk.component.ldr.bg.bg.bg.bg.iR(contextLdr, this.eo);
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.eqN()) {
            this.VB = com.bytedance.sdk.component.ldr.bg.Kg.iR().yDt();
            this.zx = new com.bytedance.sdk.component.ldr.bg.bg.bg.bg.ldr(contextLdr, this.VB);
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.ldr()) {
            this.PX = com.bytedance.sdk.component.ldr.bg.Kg.iR().Lq();
            this.ldr = new com.bytedance.sdk.component.ldr.bg.bg.bg.bg.zx(contextLdr, this.PX);
        }
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar, int i) {
        if (bgVar == null) {
            return;
        }
        try {
            bgVar.IL(java.lang.System.currentTimeMillis());
            if (bgVar.eqN() == 0 && bgVar.zx() == 1) {
                if (com.bytedance.sdk.component.ldr.bg.IL.bg.bg()) {
                    this.bg.bg(bgVar);
                    return;
                }
                return;
            }
            if (bgVar.eqN() == 3 && bgVar.zx() == 2) {
                if (com.bytedance.sdk.component.ldr.bg.IL.bg.zx()) {
                    this.bX.bg(bgVar);
                    return;
                }
                return;
            }
            if (bgVar.eqN() == 0 && bgVar.zx() == 2) {
                if (com.bytedance.sdk.component.ldr.bg.IL.bg.IL()) {
                    this.IL.bg(bgVar);
                    return;
                }
                return;
            }
            if (bgVar.eqN() == 1 && bgVar.zx() == 2) {
                if (com.bytedance.sdk.component.ldr.bg.IL.bg.bX()) {
                    this.eqN.bg(bgVar);
                }
            } else if (bgVar.eqN() == 1 && bgVar.zx() == 3) {
                if (com.bytedance.sdk.component.ldr.bg.IL.bg.eqN()) {
                    this.zx.bg(bgVar);
                }
            } else if (bgVar.eqN() == 2 && bgVar.zx() == 3 && com.bytedance.sdk.component.ldr.bg.IL.bg.ldr()) {
                this.ldr.bg(bgVar);
            }
        } catch (java.lang.Throwable unused) {
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.daV(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public void bg(int i, java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar = list.get(0);
        if (i == 200 || i == -1) {
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.gXn(), list.size());
            if (i != 200) {
                com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.bCU(), list.size());
            }
            if (bgVar.eqN() == 0 && bgVar.zx() == 1) {
                if (com.bytedance.sdk.component.ldr.bg.IL.bg.bg()) {
                    this.bg.IL(list);
                    return;
                }
                return;
            }
            if (bgVar.eqN() == 3 && bgVar.zx() == 2) {
                if (com.bytedance.sdk.component.ldr.bg.IL.bg.zx()) {
                    this.bX.IL(list);
                    return;
                }
                return;
            }
            if (bgVar.eqN() == 0 && bgVar.zx() == 2) {
                if (com.bytedance.sdk.component.ldr.bg.IL.bg.IL()) {
                    this.IL.IL(list);
                    return;
                }
                return;
            }
            if (bgVar.eqN() == 1 && bgVar.zx() == 2) {
                if (com.bytedance.sdk.component.ldr.bg.IL.bg.bX()) {
                    this.eqN.IL(list);
                }
            } else if (bgVar.eqN() == 1 && bgVar.zx() == 3) {
                if (com.bytedance.sdk.component.ldr.bg.IL.bg.eqN()) {
                    this.zx.IL(list);
                }
            } else if (bgVar.eqN() == 2 && bgVar.zx() == 3 && com.bytedance.sdk.component.ldr.bg.IL.bg.ldr()) {
                this.ldr.IL(list);
            }
        }
    }

    public java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> IL(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar, int i) {
        if (bgVar.eqN() == 0 && bgVar.zx() == 1 && com.bytedance.sdk.component.ldr.bg.IL.bg.bg()) {
            if (this.iR.IL() <= i) {
                return null;
            }
            java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg = this.bg.bg(this.iR.IL() - i, "_id");
            if (listBg != null && listBg.size() != 0) {
                com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.Uw(), 1);
            }
            return listBg;
        }
        if (bgVar.eqN() == 3 && bgVar.zx() == 2 && com.bytedance.sdk.component.ldr.bg.IL.bg.zx()) {
            if (this.WR.IL() > i) {
                return this.bX.bg(this.WR.IL() - i, "_id");
            }
        } else if (bgVar.eqN() == 0 && bgVar.zx() == 2 && com.bytedance.sdk.component.ldr.bg.IL.bg.IL()) {
            if (this.Kg.IL() > i) {
                java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg2 = this.IL.bg(this.Kg.IL() - i, "_id");
                if (listBg2 != null && listBg2.size() != 0) {
                    com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.DDQ(), 1);
                }
                return listBg2;
            }
        } else if (bgVar.eqN() == 1 && bgVar.zx() == 2 && com.bytedance.sdk.component.ldr.bg.IL.bg.bX()) {
            if (this.eo.IL() > i) {
                java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg3 = this.eqN.bg(this.eo.IL() - i, "_id");
                if (listBg3 != null && listBg3.size() != 0) {
                    com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.Uq(), 1);
                }
                return listBg3;
            }
        } else if (bgVar.eqN() == 1 && bgVar.zx() == 3 && com.bytedance.sdk.component.ldr.bg.IL.bg.eqN()) {
            if (this.VB.IL() > i) {
                java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg4 = this.zx.bg(this.VB.IL() - i, "_id");
                if (listBg4 != null && listBg4.size() != 0) {
                    com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.aGH(), 1);
                }
                return listBg4;
            }
        } else if (bgVar.eqN() == 2 && bgVar.zx() == 3 && com.bytedance.sdk.component.ldr.bg.IL.bg.ldr() && this.PX.IL() > i) {
            return this.ldr.bg(this.PX.IL() - i, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> bg(int i, int i2, java.util.List<java.lang.String> list) {
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.bg()) {
            java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg = this.bg.bg("_id");
            if (bg(listBg, list)) {
                listBg.size();
                com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.rri(), 1);
                return listBg;
            }
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.zx()) {
            java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg2 = this.bX.bg("_id");
            if (bg(listBg2, list)) {
                listBg2.size();
                return listBg2;
            }
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.IL()) {
            java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg3 = this.IL.bg("_id");
            if (bg(listBg3, list)) {
                listBg3.size();
                com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.kMt(), 1);
                return listBg3;
            }
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.bX()) {
            java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listIL = this.eqN.IL("_id");
            if (bg(listIL, list)) {
                listIL.size();
                com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.JAA(), 1);
                return listIL;
            }
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.eqN()) {
            java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listIL2 = this.zx.IL("_id");
            if (bg(listIL2, list)) {
                listIL2.size();
                com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.Ja(), 1);
                return listIL2;
            }
        }
        if (!com.bytedance.sdk.component.ldr.bg.IL.bg.ldr()) {
            return null;
        }
        java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listIL3 = this.ldr.IL("_id");
        if (!bg(listIL3, list)) {
            return null;
        }
        listIL3.size();
        return listIL3;
    }

    private boolean bg(java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list, java.util.List<java.lang.String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                java.util.Iterator<com.bytedance.sdk.component.ldr.bg.eqN.bg> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.ldr.bg.eqN.bg next = it.next();
                    if (next != null) {
                        java.lang.String strBX = next.bX();
                        if (!android.text.TextUtils.isEmpty(strBX) && list2.contains(strBX)) {
                            it.remove();
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                th.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public boolean bg(int i, boolean z) {
        com.bytedance.sdk.component.ldr.bg.bg.bg.bg.zx zxVar;
        com.bytedance.sdk.component.ldr.bg.bg.bg.bg.ldr ldrVar;
        com.bytedance.sdk.component.ldr.bg.bg.bg.bg.iR iRVar;
        com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bg bgVar;
        com.bytedance.sdk.component.ldr.bg.bg.bg.bg.IL il;
        com.bytedance.sdk.component.ldr.bg.bg.bg.bg.eqN eqn;
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.bg() && (eqn = this.bg) != null && eqn.bg(i)) {
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.yDt(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.zx() && (il = this.bX) != null && il.bg(i)) {
            return true;
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.IL() && (bgVar = this.IL) != null && bgVar.bg(i)) {
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.Lq(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.bX() && (iRVar = this.eqN) != null && iRVar.bg(i)) {
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.vb(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.ldr.bg.IL.bg.eqN() || (ldrVar = this.zx) == null || !ldrVar.bg(i)) {
            return com.bytedance.sdk.component.ldr.bg.IL.bg.ldr() && (zxVar = this.ldr) != null && zxVar.bg(i);
        }
        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.xxp(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public void bg(int i, long j) {
        com.bytedance.sdk.component.ldr.bg.bg.bg.bg.eqN eqn = this.bg;
        if (eqn != null) {
            eqn.bg(i, j);
        }
        com.bytedance.sdk.component.ldr.bg.bg.bg.bg.IL il = this.bX;
        if (il != null) {
            il.bg(i, j);
        }
        com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bg bgVar = this.IL;
        if (bgVar != null) {
            bgVar.bg(i, j);
        }
        com.bytedance.sdk.component.ldr.bg.bg.bg.bg.iR iRVar = this.eqN;
        if (iRVar != null) {
            iRVar.bg(i, j);
        }
        com.bytedance.sdk.component.ldr.bg.bg.bg.bg.ldr ldrVar = this.zx;
        if (ldrVar != null) {
            ldrVar.bg(i, j);
        }
        com.bytedance.sdk.component.ldr.bg.bg.bg.bg.zx zxVar = this.ldr;
        if (zxVar != null) {
            zxVar.bg(i, j);
        }
    }
}
