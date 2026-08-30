package com.bytedance.adsdk.bg.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    public static com.bytedance.adsdk.bg.IL.IL.bg bg(java.util.List<com.bytedance.adsdk.bg.IL.IL.bg> list, java.lang.String str, int i) {
        bX(list, str, i);
        java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> dequeBg = bg(IL(list, str, i));
        if (dequeBg.size() != 1) {
            throw new java.lang.IllegalStateException();
        }
        return dequeBg.getFirst();
    }

    private static java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> bg(java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> deque) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (com.bytedance.adsdk.bg.IL.IL.bg bgVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.bg.IL.IL.bg) linkedList.peekLast()).bg() == com.bytedance.adsdk.bg.IL.eqN.bX.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.bg.IL.IL.bg bgVar2 = (com.bytedance.adsdk.bg.IL.IL.bg) linkedList.pollLast();
                if (((com.bytedance.adsdk.bg.IL.IL.bg) linkedList.pollLast()).bg() != com.bytedance.adsdk.bg.IL.eqN.bX.QUESTION) {
                    throw new java.lang.IllegalStateException();
                }
                com.bytedance.adsdk.bg.IL.IL.bg bgVar3 = (com.bytedance.adsdk.bg.IL.IL.bg) linkedList.pollLast();
                com.bytedance.adsdk.bg.IL.IL.bg.Fy fy = new com.bytedance.adsdk.bg.IL.IL.bg.Fy();
                fy.bg(bgVar3);
                fy.IL(bgVar2);
                fy.bX(bgVar);
                linkedList.addLast(fy);
            } else {
                linkedList.addLast(bgVar);
            }
        }
        return linkedList;
    }

    private static java.util.Deque<com.bytedance.adsdk.bg.IL.IL.bg> IL(java.util.List<com.bytedance.adsdk.bg.IL.IL.bg> list, java.lang.String str, int i) {
        java.util.LinkedList<com.bytedance.adsdk.bg.IL.IL.bg> linkedList = new java.util.LinkedList(list);
        int i2 = 5;
        while (i2 > 0) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            for (com.bytedance.adsdk.bg.IL.IL.bg bgVar : linkedList) {
                if (!linkedList2.isEmpty() && com.bytedance.adsdk.bg.IL.eqN.bX.bg(((com.bytedance.adsdk.bg.IL.IL.bg) linkedList2.peekLast()).bg()) && ((com.bytedance.adsdk.bg.IL.eqN.bX) ((com.bytedance.adsdk.bg.IL.IL.bg) linkedList2.peekLast()).bg()).IL() == i2) {
                    com.bytedance.adsdk.bg.IL.IL.bg bgVar2 = (com.bytedance.adsdk.bg.IL.IL.bg) linkedList2.pollLast();
                    com.bytedance.adsdk.bg.IL.IL.bg bgVar3 = (com.bytedance.adsdk.bg.IL.IL.bg) linkedList2.pollLast();
                    if (!com.bytedance.adsdk.bg.IL.eqN.bX.bg(bgVar3.bg()) && !com.bytedance.adsdk.bg.IL.eqN.bX.bg(bgVar.bg())) {
                        linkedList2.addLast(bg(bgVar3, bgVar2, bgVar));
                    } else {
                        throw new java.lang.IllegalArgumentException(str.substring(0, i));
                    }
                } else {
                    linkedList2.addLast(bgVar);
                }
            }
            i2--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    private static void bX(java.util.List<com.bytedance.adsdk.bg.IL.IL.bg> list, java.lang.String str, int i) {
        java.util.Iterator<com.bytedance.adsdk.bg.IL.IL.bg> it = list.iterator();
        while (it.hasNext()) {
            if (com.bytedance.adsdk.bg.IL.eqN.eqN.bg(it.next().bg())) {
                throw new java.lang.IllegalArgumentException(str.substring(0, i));
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.bg.IL.zx.IL$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[com.bytedance.adsdk.bg.IL.eqN.bX.values().length];
            bg = iArr;
            try {
                iArr[com.bytedance.adsdk.bg.IL.eqN.bX.MINUS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[com.bytedance.adsdk.bg.IL.eqN.bX.PLUS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                bg[com.bytedance.adsdk.bg.IL.eqN.bX.DIVISION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                bg[com.bytedance.adsdk.bg.IL.eqN.bX.MULTI.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                bg[com.bytedance.adsdk.bg.IL.eqN.bX.MOD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                bg[com.bytedance.adsdk.bg.IL.eqN.bX.EQ.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                bg[com.bytedance.adsdk.bg.IL.eqN.bX.NOT_EQ.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                bg[com.bytedance.adsdk.bg.IL.eqN.bX.GT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                bg[com.bytedance.adsdk.bg.IL.eqN.bX.LT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                bg[com.bytedance.adsdk.bg.IL.eqN.bX.GT_EQ.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                bg[com.bytedance.adsdk.bg.IL.eqN.bX.LT_EQ.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                bg[com.bytedance.adsdk.bg.IL.eqN.bX.DOUBLE_AMP.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                bg[com.bytedance.adsdk.bg.IL.eqN.bX.DOUBLE_BAR.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
        }
    }

    private static com.bytedance.adsdk.bg.IL.IL.bg bg(com.bytedance.adsdk.bg.IL.IL.bg bgVar, com.bytedance.adsdk.bg.IL.IL.bg bgVar2, com.bytedance.adsdk.bg.IL.IL.bg bgVar3) {
        com.bytedance.adsdk.bg.IL.IL.bg.VzQ vb;
        switch (com.bytedance.adsdk.bg.IL.zx.IL.AnonymousClass1.bg[((com.bytedance.adsdk.bg.IL.eqN.bX) bgVar2.bg()).ordinal()]) {
            case 1:
                vb = new com.bytedance.adsdk.bg.IL.IL.bg.VB();
                break;
            case 2:
                vb = new com.bytedance.adsdk.bg.IL.IL.bg.tuV();
                break;
            case 3:
                vb = new com.bytedance.adsdk.bg.IL.IL.bg.bg();
                break;
            case 4:
                vb = new com.bytedance.adsdk.bg.IL.IL.bg.Ta();
                break;
            case 5:
                vb = new com.bytedance.adsdk.bg.IL.IL.bg.PX();
                break;
            case 6:
                vb = new com.bytedance.adsdk.bg.IL.IL.bg.eqN();
                break;
            case 7:
                vb = new com.bytedance.adsdk.bg.IL.IL.bg.yDt();
                break;
            case 8:
                vb = new com.bytedance.adsdk.bg.IL.IL.bg.ldr();
                break;
            case 9:
                vb = new com.bytedance.adsdk.bg.IL.IL.bg.WR();
                break;
            case 10:
                vb = new com.bytedance.adsdk.bg.IL.IL.bg.zx();
                break;
            case 11:
                vb = new com.bytedance.adsdk.bg.IL.IL.bg.Kg();
                break;
            case 12:
                vb = new com.bytedance.adsdk.bg.IL.IL.bg.IL();
                break;
            case 13:
                vb = new com.bytedance.adsdk.bg.IL.IL.bg.bX();
                break;
            default:
                throw new java.lang.UnsupportedOperationException(bgVar2.bg().toString());
        }
        vb.bg(bgVar);
        vb.IL(bgVar3);
        return vb;
    }

    public static boolean bg(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof java.lang.Boolean) || ((java.lang.Boolean) obj).booleanValue()) {
            return !(obj instanceof java.lang.Number) || ((java.lang.Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
