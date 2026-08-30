package com.bytedance.sdk.openadsdk.Lq;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements java.lang.Comparable<com.bytedance.sdk.openadsdk.Lq.bg> {
    private final java.lang.String IL;
    private int bX;
    private int iR;
    private long yDt;
    private int zx;
    private final java.util.ArrayList<java.lang.Long> bg = new java.util.ArrayList<>();
    private final java.util.ArrayList<java.lang.Long> eqN = new java.util.ArrayList<>();
    private final java.util.ArrayList<java.lang.Long> ldr = new java.util.ArrayList<>();
    private final java.util.ArrayList<java.lang.Long> Kg = new java.util.ArrayList<>();
    private final java.util.HashMap<java.lang.String, com.bytedance.sdk.openadsdk.Lq.IL> WR = new java.util.HashMap<>();
    private int eo = 0;
    private int VB = 0;
    private final java.util.HashMap<java.lang.String, com.bytedance.sdk.openadsdk.Lq.IL> PX = new java.util.HashMap<>();
    private int Ta = 0;
    private final java.util.ArrayList<java.lang.String> Lq = new java.util.ArrayList<>();

    public bg(java.lang.String str) {
        this.IL = str;
    }

    public void bg(java.lang.String str, java.lang.String str2) {
        com.bytedance.sdk.openadsdk.Lq.IL il;
        com.bytedance.sdk.openadsdk.Lq.IL il2;
        com.bytedance.sdk.openadsdk.Lq.IL il3;
        com.bytedance.sdk.openadsdk.Lq.IL il4;
        com.bytedance.sdk.openadsdk.Lq.IL il5;
        com.bytedance.sdk.openadsdk.Lq.IL il6;
        str.hashCode();
        switch (str) {
            case "landingContinue":
                if (!android.text.TextUtils.isEmpty(str2) && (il = this.PX.get(str2)) != null) {
                    il.eqN(android.os.SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!android.text.TextUtils.isEmpty(str2) && (il2 = this.PX.get(str2)) != null) {
                    il2.bX(android.os.SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!android.text.TextUtils.isEmpty(str2) && this.PX.get(str2) == null) {
                    com.bytedance.sdk.openadsdk.Lq.IL il7 = new com.bytedance.sdk.openadsdk.Lq.IL();
                    this.PX.put(str2, il7);
                    il7.bg(android.os.SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!android.text.TextUtils.isEmpty(str2) && (il3 = this.WR.get(str2)) != null && il3.bg() != com.bytedance.sdk.openadsdk.Lq.IL.zx) {
                    il3.IL(android.os.SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.ldr.bg.bg().Lq()) {
                        this.eo = (int) (((long) this.eo) + il3.bg(this.yDt, android.os.SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case "feed_play":
                this.ldr.add(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.ldr.bg.bg().Kg()) {
                    this.iR++;
                }
                if (!android.text.TextUtils.isEmpty(str2) && this.WR.get(str2) == null) {
                    com.bytedance.sdk.openadsdk.Lq.IL il8 = new com.bytedance.sdk.openadsdk.Lq.IL();
                    this.WR.put(str2, il8);
                    il8.bg(android.os.SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.bg.add(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.ldr.bg.bg().ldr()) {
                    this.bX++;
                    break;
                }
                break;
            case "click":
                if (!this.Lq.contains(str2)) {
                    if (this.Lq.size() > 50) {
                        this.Lq.subList(0, 25).clear();
                    }
                    this.Lq.add(str2);
                    this.eqN.add(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.ldr.bg.bg().iR()) {
                        this.zx++;
                    }
                    break;
                }
                break;
            case "feed_continue":
                if (!android.text.TextUtils.isEmpty(str2) && (il4 = this.WR.get(str2)) != null) {
                    il4.eqN(android.os.SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!android.text.TextUtils.isEmpty(str2) && (il5 = this.WR.get(str2)) != null) {
                    il5.bX(android.os.SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!android.text.TextUtils.isEmpty(str2) && (il6 = this.PX.get(str2)) != null && il6.bg() != com.bytedance.sdk.openadsdk.Lq.IL.zx) {
                    il6.IL(android.os.SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.ldr.bg.bg().yDt()) {
                        this.Ta = (int) (((long) this.Ta) + il6.bg(this.yDt, android.os.SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.ldr.bg.bg().xxp()) {
                    this.VB++;
                    break;
                }
                break;
            case "dislike":
                this.Kg.add(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                break;
        }
    }

    public org.json.JSONObject bg(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            bg(jSONObject2, jSONObject);
            IL(jSONObject2, jSONObject);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
        }
        return jSONObject2;
    }

    private void bg(java.lang.String str, org.json.JSONObject jSONObject, java.util.ArrayList<java.lang.Long> arrayList, int[] iArr, long j, org.json.JSONObject jSONObject2) throws org.json.JSONException {
        int size = arrayList.size() - 1;
        int i = 0;
        for (int i2 : iArr) {
            long j2 = j - (((long) i2) * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j2) {
                i++;
                size--;
            }
            if (i != 0) {
                jSONObject.put(str + i2, i);
                int iOptInt = jSONObject2.optInt(str + i2) + i;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i2, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void bg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) throws org.json.JSONException {
        int i;
        int i2;
        int i3;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        bg("show_c_", jSONObject, this.bg, com.bytedance.sdk.openadsdk.ldr.bg.bg().WR(), jElapsedRealtime, jSONObject2);
        bg("click_c_", jSONObject, this.eqN, com.bytedance.sdk.openadsdk.ldr.bg.bg().eo(), jElapsedRealtime, jSONObject2);
        bg("v_play_c_", jSONObject, this.ldr, com.bytedance.sdk.openadsdk.ldr.bg.bg().VB(), jElapsedRealtime, jSONObject2);
        bg("dislike_c_", jSONObject, this.Kg, com.bytedance.sdk.openadsdk.ldr.bg.bg().vb(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.ldr.bg.bg().ldr() && (i3 = this.bX) != 0) {
            jSONObject.put("show_c_s", i3);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.bX;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.ldr.bg.bg().iR() && (i2 = this.zx) != 0) {
            jSONObject.put("click_c_s", i2);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.zx;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.ldr.bg.bg().Kg() || (i = this.iR) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.iR;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0107 A[PHI: r10 r14
  0x0107: PHI (r10v3 int) = (r10v2 int), (r10v5 int), (r10v5 int) binds: [B:34:0x00e6, B:39:0x00fa, B:41:0x00ff] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r14v2 long) = (r14v1 long), (r14v4 long), (r14v4 long) binds: [B:34:0x00e6, B:39:0x00fa, B:41:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    private void IL(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) throws org.json.JSONException {
        int i;
        int i2;
        int i3;
        long j;
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        java.util.HashSet hashSet3;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.HashSet hashSet4 = new java.util.HashSet();
        java.util.HashSet hashSet5 = new java.util.HashSet();
        int[] iArrPX = com.bytedance.sdk.openadsdk.ldr.bg.bg().PX();
        long j2 = 60000;
        if (iArrPX != null) {
            int i4 = 0;
            while (i4 < iArrPX.length) {
                int i5 = iArrPX[i4];
                long j3 = jElapsedRealtime - (((long) i5) * j2);
                java.util.Iterator<java.lang.String> it = this.PX.keySet().iterator();
                long j4 = 0;
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    java.util.Iterator<java.lang.String> it2 = it;
                    com.bytedance.sdk.openadsdk.Lq.IL il = this.PX.get(next);
                    if (il != null) {
                        long jBg = il.bg(j3, jElapsedRealtime);
                        j4 += jBg;
                        if (jBg <= 0 && i4 == iArrPX.length - 1) {
                            hashSet4.add(next);
                        }
                    }
                    it = it2;
                }
                if (j4 != 0) {
                    jSONObject.put("lp_stay_t_".concat(java.lang.String.valueOf(i5)), j4);
                    hashSet2 = hashSet4;
                    hashSet3 = hashSet5;
                    long jOptInt = ((long) jSONObject2.optInt("lp_stay_t_".concat(java.lang.String.valueOf(i5)))) + j4;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(java.lang.String.valueOf(i5)), jOptInt);
                    }
                } else {
                    hashSet2 = hashSet4;
                    hashSet3 = hashSet5;
                }
                i4++;
                hashSet4 = hashSet2;
                hashSet5 = hashSet3;
                j2 = 60000;
            }
        }
        java.util.HashSet hashSet6 = hashSet4;
        java.util.HashSet hashSet7 = hashSet5;
        int[] iArrTa = com.bytedance.sdk.openadsdk.ldr.bg.bg().Ta();
        if (iArrTa != null) {
            int i6 = 0;
            while (i6 < iArrTa.length) {
                int i7 = iArrTa[i6];
                long j5 = jElapsedRealtime - (((long) i7) * 60000);
                java.util.Iterator<java.lang.String> it3 = this.WR.keySet().iterator();
                int i8 = 0;
                long j6 = 0;
                while (it3.hasNext()) {
                    java.lang.String next2 = it3.next();
                    java.util.Iterator<java.lang.String> it4 = it3;
                    com.bytedance.sdk.openadsdk.Lq.IL il2 = this.WR.get(next2);
                    if (il2 != null) {
                        long jBg2 = il2.bg(j5, jElapsedRealtime);
                        j6 += jBg2;
                        if (jBg2 > 20000) {
                            i8++;
                        }
                        if (jBg2 > 0 || i6 != iArrTa.length - 1) {
                            hashSet = hashSet7;
                        } else {
                            hashSet = hashSet7;
                            hashSet.add(next2);
                        }
                    } else {
                        hashSet = hashSet7;
                    }
                    hashSet7 = hashSet;
                    it3 = it4;
                }
                java.util.HashSet hashSet8 = hashSet7;
                if (j6 != 0) {
                    jSONObject.put("v_stay_t_".concat(java.lang.String.valueOf(i7)), j6);
                    j = jElapsedRealtime;
                    long jOptInt2 = ((long) jSONObject2.optInt("v_stay_t_".concat(java.lang.String.valueOf(i7)))) + j6;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(java.lang.String.valueOf(i7)), jOptInt2);
                    }
                } else {
                    j = jElapsedRealtime;
                }
                if (i8 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(java.lang.String.valueOf(i7)), i8);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(java.lang.String.valueOf(i7))) + i8;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(java.lang.String.valueOf(i7)), iOptInt);
                    }
                }
                i6++;
                hashSet7 = hashSet8;
                jElapsedRealtime = j;
            }
        }
        java.util.HashSet hashSet9 = hashSet7;
        if (!hashSet6.isEmpty()) {
            java.util.Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                this.PX.remove((java.lang.String) it5.next());
            }
        }
        if (!hashSet9.isEmpty()) {
            java.util.Iterator it6 = hashSet9.iterator();
            while (it6.hasNext()) {
                this.WR.remove((java.lang.String) it6.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.ldr.bg.bg().Lq() && (i3 = this.eo) != 0) {
            jSONObject.put("v_stay_t_s", i3);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.eo;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.ldr.bg.bg().yDt() && (i2 = this.Ta) != 0) {
            jSONObject.put("lp_stay_t_s", i2);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.Ta;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.ldr.bg.bg().xxp() || (i = this.VB) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.VB;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    public void bg() {
        this.yDt = android.os.SystemClock.elapsedRealtime();
        this.VB = 0;
        this.zx = 0;
        this.bX = 0;
        this.Ta = 0;
        this.eo = 0;
        this.iR = 0;
    }

    public java.lang.String IL() {
        return this.IL;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.bytedance.sdk.openadsdk.Lq.bg bgVar) {
        return bgVar.bX - this.bX;
    }
}
