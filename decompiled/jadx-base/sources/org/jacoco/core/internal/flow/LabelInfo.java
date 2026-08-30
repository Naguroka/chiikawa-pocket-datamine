package org.jacoco.core.internal.flow;

/* JADX INFO: loaded from: classes6.dex */
public final class LabelInfo {
    public static final int NO_PROBE = -1;
    private boolean target = false;
    private boolean multiTarget = false;
    private boolean successor = false;
    private boolean methodInvocationLine = false;
    private boolean done = false;
    private int probeid = -1;
    private org.objectweb.asm.Label intermediate = null;
    private org.jacoco.core.internal.analysis.Instruction instruction = null;

    private LabelInfo() {
    }

    public static void setTarget(org.objectweb.asm.Label label) {
        org.jacoco.core.internal.flow.LabelInfo labelInfoCreate = create(label);
        if (labelInfoCreate.target || labelInfoCreate.successor) {
            labelInfoCreate.multiTarget = true;
        } else {
            labelInfoCreate.target = true;
        }
    }

    public static void setSuccessor(org.objectweb.asm.Label label) {
        org.jacoco.core.internal.flow.LabelInfo labelInfoCreate = create(label);
        labelInfoCreate.successor = true;
        if (labelInfoCreate.target) {
            labelInfoCreate.multiTarget = true;
        }
    }

    public static boolean isMultiTarget(org.objectweb.asm.Label label) {
        org.jacoco.core.internal.flow.LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return false;
        }
        return labelInfo.multiTarget;
    }

    public static boolean isSuccessor(org.objectweb.asm.Label label) {
        org.jacoco.core.internal.flow.LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return false;
        }
        return labelInfo.successor;
    }

    public static void setMethodInvocationLine(org.objectweb.asm.Label label) {
        create(label).methodInvocationLine = true;
    }

    public static boolean isMethodInvocationLine(org.objectweb.asm.Label label) {
        org.jacoco.core.internal.flow.LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return false;
        }
        return labelInfo.methodInvocationLine;
    }

    public static boolean needsProbe(org.objectweb.asm.Label label) {
        org.jacoco.core.internal.flow.LabelInfo labelInfo = get(label);
        return labelInfo != null && labelInfo.successor && (labelInfo.multiTarget || labelInfo.methodInvocationLine);
    }

    public static void setDone(org.objectweb.asm.Label label) {
        create(label).done = true;
    }

    public static void resetDone(org.objectweb.asm.Label label) {
        org.jacoco.core.internal.flow.LabelInfo labelInfo = get(label);
        if (labelInfo != null) {
            labelInfo.done = false;
        }
    }

    public static void resetDone(org.objectweb.asm.Label[] labelArr) {
        for (org.objectweb.asm.Label label : labelArr) {
            resetDone(label);
        }
    }

    public static boolean isDone(org.objectweb.asm.Label label) {
        org.jacoco.core.internal.flow.LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return false;
        }
        return labelInfo.done;
    }

    public static void setProbeId(org.objectweb.asm.Label label, int i) {
        create(label).probeid = i;
    }

    public static int getProbeId(org.objectweb.asm.Label label) {
        org.jacoco.core.internal.flow.LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return -1;
        }
        return labelInfo.probeid;
    }

    public static void setIntermediateLabel(org.objectweb.asm.Label label, org.objectweb.asm.Label label2) {
        create(label).intermediate = label2;
    }

    public static org.objectweb.asm.Label getIntermediateLabel(org.objectweb.asm.Label label) {
        org.jacoco.core.internal.flow.LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return null;
        }
        return labelInfo.intermediate;
    }

    public static void setInstruction(org.objectweb.asm.Label label, org.jacoco.core.internal.analysis.Instruction instruction) {
        create(label).instruction = instruction;
    }

    public static org.jacoco.core.internal.analysis.Instruction getInstruction(org.objectweb.asm.Label label) {
        org.jacoco.core.internal.flow.LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return null;
        }
        return labelInfo.instruction;
    }

    private static org.jacoco.core.internal.flow.LabelInfo get(org.objectweb.asm.Label label) {
        java.lang.Object obj = label.info;
        if (obj instanceof org.jacoco.core.internal.flow.LabelInfo) {
            return (org.jacoco.core.internal.flow.LabelInfo) obj;
        }
        return null;
    }

    private static org.jacoco.core.internal.flow.LabelInfo create(org.objectweb.asm.Label label) {
        org.jacoco.core.internal.flow.LabelInfo labelInfo = get(label);
        if (labelInfo != null) {
            return labelInfo;
        }
        org.jacoco.core.internal.flow.LabelInfo labelInfo2 = new org.jacoco.core.internal.flow.LabelInfo();
        label.info = labelInfo2;
        return labelInfo2;
    }
}
